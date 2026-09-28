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
public final class ch0 extends org.telegram.ui.ActionBar.e3 {
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
    public final vg0 f23302b;
    public final yg0 f23303c;
    public final Drawable d;
    public final View e;
    public final y7 f23304f;
    public AnimatorSet h;
    public final MessageObject f23305n;
    public final TLRPC.Poll f23306r;
    public final TLRPC.InputPeer f23307s;
    public final HashSet v;
    public final HashMap f23308w;
    public final ArrayList f23309x;
    public final y5 f23310y;

    public ch0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f23308w = new HashMap();
        this.f23309x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f23305n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f23306r = tL_messageMediaPoll.poll;
        this.f23307s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f23309x.add(new bh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f23307s;
                tL_messages_getPollVotes.f18432id = this.f23305n.getId();
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
        Collections.sort(this.f23309x, new tg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19147i5, false), PorterDuff.Mode.MULTIPLY));
        ug0 ug0Var = new ug0(this, context);
        this.containerView = ug0Var;
        ug0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        vg0 vg0Var = new vg0(this, context);
        this.f23302b = vg0Var;
        vg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f43041c = 150L;
        jVar.e = 350L;
        jVar.f43042f = 0L;
        jVar.f43043g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f43044i = new OvershootInterpolator(1.1f);
        jVar.f43017o = sr.h;
        vg0Var.setItemAnimator(jVar);
        vg0Var.setClipToPadding(false);
        getContext();
        vg0Var.setLayoutManager(new gg.b0(1, false, 9));
        vg0Var.setHorizontalScrollBarEnabled(false);
        vg0Var.setVerticalScrollBarEnabled(false);
        vg0Var.setSectionsType(2);
        this.containerView.addView(vg0Var, w7.y5.e(-1, -1, 51));
        yg0 yg0Var = new yg0(this, context);
        this.f23303c = yg0Var;
        vg0Var.setAdapter(yg0Var);
        vg0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        vg0Var.setOnItemClickListener(new ai.n6(13, this, context));
        vg0Var.setOnScrollListener(new wg0(this, 0));
        y5 y5Var = new y5(context);
        this.f23310y = y5Var;
        y5Var.setTextSize(1, 18.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.h6.f19165j5;
        y5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
        y5Var.setTag(-33024);
        y5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f23306r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f23305n;
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
        this.f23304f = y7Var;
        y7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false));
        y7Var.setBackButtonImage(R.drawable.ic_ab_back);
        y7Var.B(org.telegram.ui.ActionBar.h6.w0(null, i17, false), false);
        y7Var.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        y7Var.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
        y7Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        y7Var.setOccupyStatusBar(false);
        y7Var.setAlpha(0.0f);
        y7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f23306r.quiz) {
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

    public static int A(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int B(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int E(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int F(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int G(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int H(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int I(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static boolean L(ch0 ch0Var) {
        return ch0Var.isFullscreen;
    }

    public static int M(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int N(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static void m(ch0 ch0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 T;
        yg0 yg0Var = ch0Var.f23303c;
        ArrayList arrayList2 = ch0Var.f23309x;
        vg0 vg0Var = ch0Var.f23302b;
        ArrayList arrayList3 = ch0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(ch0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new bh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    bh0 bh0Var = (bh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            bh0 bh0Var2 = (bh0) arrayList2.get(i12);
                            if (Arrays.equals(bh0Var.d, bh0Var2.d)) {
                                bh0Var2.f23003c = bh0Var.f23003c;
                                z10 = (bh0Var2.f23001a == bh0Var.f23001a && bh0Var2.f23002b.size() == bh0Var.f23002b.size()) ? true : true;
                                bh0Var2.f23001a = bh0Var.f23001a;
                                bh0Var2.f23002b = bh0Var.f23002b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                ch0Var.L = false;
                if (vg0Var != null) {
                    if (ch0Var.currentSheetAnimationType == 0 && ch0Var.startAnimationRunnable == null && !z10) {
                        int childCount = vg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = vg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = vg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = vg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    yg0Var.y(T);
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
                        ch0Var.L = false;
                        return;
                    }
                    if (z10) {
                        ch0Var.R();
                    }
                    yg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        ch0Var.dismiss();
    }

    public static void n(ch0 ch0Var, bh0 bh0Var, TLObject tLObject) {
        if (ch0Var.isShowing()) {
            ch0Var.v.remove(bh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(ch0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                bh0Var.f23002b.addAll(tL_messages_votesList.votes);
                bh0Var.f23003c = tL_messages_votesList.next_offset;
                ch0Var.O(null);
                ch0Var.f23303c.X(true);
            }
        }
    }

    public static void o(ch0 ch0Var, Context context, View view, int i10) {
        HashSet hashSet = ch0Var.v;
        yg0 yg0Var = ch0Var.f23303c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = ch0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = yg0Var.S(i10) - 1;
                    int Q = yg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        bh0 bh0Var = (bh0) ch0Var.f23309x.get(S);
                        if (Q == bh0Var.b() && !hashSet.contains(bh0Var)) {
                            if (bh0Var.e && bh0Var.f23004f < bh0Var.f23002b.size()) {
                                int min = Math.min(bh0Var.f23004f + 50, bh0Var.f23002b.size());
                                bh0Var.f23004f = min;
                                if (min == bh0Var.f23002b.size()) {
                                    bh0Var.e = false;
                                }
                                ch0Var.O(null);
                                yg0Var.X(true);
                                return;
                            }
                            hashSet.add(bh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ch0Var.f23307s;
                            tL_messages_getPollVotes.f18432id = ch0Var.f23305n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = bh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = bh0Var.f23003c;
                            ConnectionsManager.getInstance(ch0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.lo(12, ch0Var, bh0Var));
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
                        ch0Var.dismiss();
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

    public static ViewGroup p(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static ViewGroup q(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static int r(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int s(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static void t(ch0 ch0Var) {
        boolean z10;
        Integer num;
        float f7;
        y7 y7Var = ch0Var.f23304f;
        vg0 vg0Var = ch0Var.f23302b;
        if (vg0Var.getChildCount() <= 0) {
            int paddingTop = vg0Var.getPaddingTop();
            ch0Var.E = paddingTop;
            vg0Var.setTopGlowOffset(paddingTop);
            ch0Var.containerView.invalidate();
            return;
        }
        View childAt = vg0Var.getChildAt(0);
        il0 il0Var = (il0) vg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || il0Var == null || il0Var.b() != 0) {
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
            AnimatorSet animatorSet = ch0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ch0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ch0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ch0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var, property, f7);
            View view = ch0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            ch0Var.h.addListener(new hd0(ch0Var, 4));
            ch0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vg0Var.getLayoutParams();
        int D = org.telegram.messenger.ok.D(11.0f, layoutParams.topMargin, top);
        if (ch0Var.E != D) {
            ch0Var.E = D;
            vg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            ch0Var.containerView.invalidate();
        }
    }

    public static int u(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int v(ch0 ch0Var) {
        return ch0Var.currentSheetAnimationType;
    }

    public static int w(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int x(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int y(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int z(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public final void O(View view) {
        vg0 vg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            vg0Var = this.f23302b;
            int i11 = 0;
            if (i10 >= vg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = vg0Var.getPinnedHeader();
            } else {
                childAt = vg0Var.getChildAt(i10);
            }
            if ((childAt instanceof ah0) && (childAt.getTag(R.id.object_tag) instanceof bh0)) {
                ah0 ah0Var = (ah0) childAt;
                bh0 bh0Var = (bh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f23306r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, bh0Var.d) && ((zg0) this.f23308w.get(bh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f23305n;
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
                            ah0Var.a(str2, arrayList, P(bh0Var.d), bh0Var.f23001a, bh0Var.a(), true);
                            ah0Var.setTag(R.id.object_tag, bh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = vg0Var.f30707r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(vg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vg0Var.getMeasuredHeight(), 0));
            View view3 = vg0Var.f30707r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), vg0Var.f30707r1.getMeasuredHeight());
            vg0Var.invalidate();
        }
        vg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f23309x;
            if (i10 >= arrayList.size()) {
                break;
            }
            bh0 bh0Var = (bh0) arrayList.get(i10);
            if (bh0Var != null) {
                i11 += bh0Var.f23001a;
                if (Arrays.equals(bh0Var.d, bArr)) {
                    i12 += bh0Var.f23001a;
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
        HashMap hashMap2 = this.f23308w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f23305n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23309x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            bh0 bh0Var = (bh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(bh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(bh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30885a = f7 - i15;
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
                ((zg0) arrayList.get(i16)).getClass();
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23304f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23304f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23304f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23304f, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23304f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23310y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{View.class}, null, null, null, -1, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{View.class}, null, null, null, -1, y6Var, org.telegram.ui.ActionBar.h6.f19147i5));
        int i12 = org.telegram.ui.ActionBar.h6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 524288, new Class[]{ah0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 524288, new Class[]{ah0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 524288, new Class[]{ah0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 524304, new Class[]{ah0.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f23302b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
