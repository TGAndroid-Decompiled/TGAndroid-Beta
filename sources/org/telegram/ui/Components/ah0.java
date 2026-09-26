package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ah0 extends org.telegram.ui.ActionBar.e3 {
    public static final org.telegram.ui.Cells.t8 O = new org.telegram.ui.Cells.t8("placeholderAlpha", 9);
    public int E;
    public final ArrayList F;
    public final Paint G;
    public LinearGradient H;
    public Matrix I;
    public float J;
    public float K;
    public boolean L;
    public final RectF M;
    public final TLRPC.TL_messageMediaPoll N;
    public final tg0 f22689b;
    public final wg0 f22690c;
    public final Drawable d;
    public final View e;
    public final y7 f22691f;
    public AnimatorSet h;
    public final MessageObject f22692n;
    public final TLRPC.Poll f22693r;
    public final TLRPC.InputPeer f22694s;
    public final HashSet v;
    public final HashMap f22695w;
    public final ArrayList f22696x;
    public final y5 f22697y;

    public ah0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f22695w = new HashMap();
        this.f22696x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f22692n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f22693r = tL_messageMediaPoll.poll;
        this.f22694s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i12);
            if (pollAnswerVoters.voters != 0) {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i13 = pollAnswerVoters.voters;
                i13 = i13 > 15 ? 10 : i13;
                for (int i14 = 0; i14 < i13; i14++) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                }
                int i15 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i13 < i15 ? "empty" : null;
                tL_messages_votesList.count = i15;
                this.f22696x.add(new zg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f22694s;
                tL_messages_getPollVotes.f18432id = this.f22692n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.ya(this, numArr, i12, arrayList, pollAnswerVoters, 5)));
                numArr[i12] = valueOf;
                this.F.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f22696x, new rg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19147i5, false), PorterDuff.Mode.MULTIPLY));
        sg0 sg0Var = new sg0(this, context);
        this.containerView = sg0Var;
        sg0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        tg0 tg0Var = new tg0(this, context);
        this.f22689b = tg0Var;
        tg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f43041c = 150L;
        jVar.e = 350L;
        jVar.f43042f = 0L;
        jVar.f43043g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f43044i = new OvershootInterpolator(1.1f);
        jVar.f43017o = rr.h;
        tg0Var.setItemAnimator(jVar);
        tg0Var.setClipToPadding(false);
        getContext();
        tg0Var.setLayoutManager(new gg.b0(1, false, 9));
        tg0Var.setHorizontalScrollBarEnabled(false);
        tg0Var.setVerticalScrollBarEnabled(false);
        tg0Var.setSectionsType(2);
        this.containerView.addView(tg0Var, w7.y5.e(-1, -1, 51));
        wg0 wg0Var = new wg0(this, context);
        this.f22690c = wg0Var;
        tg0Var.setAdapter(wg0Var);
        tg0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        tg0Var.setOnItemClickListener(new ai.n6(13, this, context));
        tg0Var.setOnScrollListener(new ug0(this, 0));
        y5 y5Var = new y5(context);
        this.f22697y = y5Var;
        y5Var.setTextSize(1, 18.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.h6.f19165j5;
        y5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
        y5Var.setTag(-33024);
        y5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f22693r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f22692n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(y5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, y5Var.getPaint().getFontMetricsInt());
            y5Var.setText(replaceEmoji);
        }
        y7 y7Var = new y7(this, context, 2);
        this.f22691f = y7Var;
        y7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false));
        y7Var.setBackButtonImage(R.drawable.ic_ab_back);
        y7Var.B(org.telegram.ui.ActionBar.h6.w0(null, i17, false), false);
        y7Var.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        y7Var.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
        y7Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        y7Var.setOccupyStatusBar(false);
        y7Var.setAlpha(0.0f);
        y7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f22693r.quiz) {
            y7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            y7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(y7Var, w7.y5.c(-2.0f, -1));
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.V5, false));
        this.containerView.addView(view, w7.y5.c(1.0f, -1));
    }

    public static int A(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int B(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static int E(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int F(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static int G(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static int H(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int I(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(ah0 ah0Var) {
        return ah0Var.containerView;
    }

    public static boolean L(ah0 ah0Var) {
        return ah0Var.isFullscreen;
    }

    public static int M(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static int N(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static void m(ah0 ah0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 T;
        wg0 wg0Var = ah0Var.f22690c;
        ArrayList arrayList2 = ah0Var.f22696x;
        tg0 tg0Var = ah0Var.f22689b;
        ArrayList arrayList3 = ah0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(ah0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new zg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    zg0 zg0Var = (zg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            zg0 zg0Var2 = (zg0) arrayList2.get(i12);
                            if (Arrays.equals(zg0Var.d, zg0Var2.d)) {
                                zg0Var2.f30872c = zg0Var.f30872c;
                                z10 = (zg0Var2.f30870a == zg0Var.f30870a && zg0Var2.f30871b.size() == zg0Var.f30871b.size()) ? true : true;
                                zg0Var2.f30870a = zg0Var.f30870a;
                                zg0Var2.f30871b = zg0Var.f30871b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                ah0Var.L = false;
                if (tg0Var != null) {
                    if (ah0Var.currentSheetAnimationType == 0 && ah0Var.startAnimationRunnable == null && !z10) {
                        int childCount = tg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = tg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = tg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = tg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    wg0Var.y(T);
                                    pollVotesAlert$UserCell.E = null;
                                }
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList4);
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                        }
                        ah0Var.L = false;
                        return;
                    }
                    if (z10) {
                        ah0Var.R();
                    }
                    wg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        ah0Var.dismiss();
    }

    public static void n(ah0 ah0Var, zg0 zg0Var, TLObject tLObject) {
        if (ah0Var.isShowing()) {
            ah0Var.v.remove(zg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(ah0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                zg0Var.f30871b.addAll(tL_messages_votesList.votes);
                zg0Var.f30872c = tL_messages_votesList.next_offset;
                ah0Var.O(null);
                ah0Var.f22690c.X(true);
            }
        }
    }

    public static void o(ah0 ah0Var, Context context, View view, int i10) {
        HashSet hashSet = ah0Var.v;
        wg0 wg0Var = ah0Var.f22690c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = ah0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = wg0Var.S(i10) - 1;
                    int Q = wg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        zg0 zg0Var = (zg0) ah0Var.f22696x.get(S);
                        if (Q == zg0Var.b() && !hashSet.contains(zg0Var)) {
                            if (zg0Var.e && zg0Var.f30873f < zg0Var.f30871b.size()) {
                                int min = Math.min(zg0Var.f30873f + 50, zg0Var.f30871b.size());
                                zg0Var.f30873f = min;
                                if (min == zg0Var.f30871b.size()) {
                                    zg0Var.e = false;
                                }
                                ah0Var.O(null);
                                wg0Var.X(true);
                                return;
                            }
                            hashSet.add(zg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ah0Var.f22694s;
                            tL_messages_getPollVotes.f18432id = ah0Var.f22692n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = zg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = zg0Var.f30872c;
                            ConnectionsManager.getInstance(ah0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.lo(12, ah0Var, zg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f22316n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f18482id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f22316n.f18335id);
                        }
                        ah0Var.dismiss();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.wn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.wn) U).i();
                                    if (i13 != null && i13.f18482id == pollVotesAlert$UserCell.h.f18482id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.wn) U).e;
                                    if (chat != null && chat.f18335id == pollVotesAlert$UserCell.f22316n.f18335id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                }
                            }
                            U.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    public static ViewGroup p(ah0 ah0Var) {
        return ah0Var.containerView;
    }

    public static ViewGroup q(ah0 ah0Var) {
        return ah0Var.containerView;
    }

    public static int r(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int s(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public static void t(ah0 ah0Var) {
        boolean z10;
        Integer num;
        float f7;
        y7 y7Var = ah0Var.f22691f;
        tg0 tg0Var = ah0Var.f22689b;
        if (tg0Var.getChildCount() <= 0) {
            int paddingTop = tg0Var.getPaddingTop();
            ah0Var.E = paddingTop;
            tg0Var.setTopGlowOffset(paddingTop);
            ah0Var.containerView.invalidate();
            return;
        }
        View childAt = tg0Var.getChildAt(0);
        gl0 gl0Var = (gl0) tg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gl0Var == null || gl0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && y7Var.getTag() == null) || (!z10 && y7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            y7Var.setTag(num);
            AnimatorSet animatorSet = ah0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ah0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ah0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ah0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var, property, f7);
            View view = ah0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            ah0Var.h.addListener(new fd0(ah0Var, 4));
            ah0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tg0Var.getLayoutParams();
        int D = org.telegram.messenger.ok.D(11.0f, layoutParams.topMargin, top);
        if (ah0Var.E != D) {
            ah0Var.E = D;
            tg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            ah0Var.containerView.invalidate();
        }
    }

    public static int u(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int v(ah0 ah0Var) {
        return ah0Var.currentSheetAnimationType;
    }

    public static int w(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int x(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int y(ah0 ah0Var) {
        return ah0Var.backgroundPaddingTop;
    }

    public static int z(ah0 ah0Var) {
        return ah0Var.backgroundPaddingLeft;
    }

    public final void O(View view) {
        tg0 tg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            tg0Var = this.f22689b;
            int i11 = 0;
            if (i10 >= tg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = tg0Var.getPinnedHeader();
            } else {
                childAt = tg0Var.getChildAt(i10);
            }
            if ((childAt instanceof yg0) && (childAt.getTag(R.id.object_tag) instanceof zg0)) {
                yg0 yg0Var = (yg0) childAt;
                zg0 zg0Var = (zg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f22693r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, zg0Var.d) && ((xg0) this.f22695w.get(zg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f22692n;
                            if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i11 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i11);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            if (tL_textWithEntities == null) {
                                str = "";
                            } else {
                                str = tL_textWithEntities.text;
                            }
                            String str2 = str;
                            if (tL_textWithEntities == null) {
                                arrayList = null;
                            } else {
                                arrayList = tL_textWithEntities.entities;
                            }
                            yg0Var.a(str2, arrayList, P(zg0Var.d), zg0Var.f30870a, zg0Var.a(), true);
                            yg0Var.setTag(R.id.object_tag, zg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = tg0Var.f30117r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredHeight(), 0));
            View view3 = tg0Var.f30117r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), tg0Var.f30117r1.getMeasuredHeight());
            tg0Var.invalidate();
        }
        tg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f22696x;
            if (i10 >= arrayList.size()) {
                break;
            }
            zg0 zg0Var = (zg0) arrayList.get(i10);
            if (zg0Var != null) {
                i11 += zg0Var.f30870a;
                if (Arrays.equals(zg0Var.d, bArr)) {
                    i12 += zg0Var.f30870a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.N;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i11 = tL_messageMediaPoll.results.total_voters;
        }
        if (i11 <= 0) {
            return 0;
        }
        return Math.round((i12 / i11) * 100.0f);
    }

    public final MessagesController Q() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void R() {
        HashMap hashMap;
        HashMap hashMap2 = this.f22695w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f22692n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f22696x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            zg0 zg0Var = (zg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(zg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(zg0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30339a = f7 - i15;
                        if (i12 == 0) {
                            i12 = i15;
                        } else if (i15 != 0 && i12 != i15) {
                            z10 = true;
                        }
                        i10 -= i15;
                        i13 = Math.max(i15, i13);
                        i11++;
                        hashMap2 = hashMap;
                    } else {
                        i14++;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            i11++;
            hashMap2 = hashMap;
        }
        if (z10 && i10 != 0) {
            Collections.sort(arrayList, new org.telegram.ui.cf(12));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((xg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false);
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19147i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.K = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.H = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.H.setLocalMatrix(matrix);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y6 y6Var = new y6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.h6.f19129h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22691f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22691f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22691f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22691f, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22691f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22697y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{View.class}, null, null, null, -1, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{View.class}, null, null, null, -1, y6Var, org.telegram.ui.ActionBar.h6.f19147i5));
        int i12 = org.telegram.ui.ActionBar.h6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 524288, new Class[]{yg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 524288, new Class[]{yg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 524288, new Class[]{yg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 524304, new Class[]{yg0.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f22689b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
