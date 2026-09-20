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
public final class zg0 extends org.telegram.ui.ActionBar.f3 {
    public static final org.telegram.ui.Cells.u8 O = new org.telegram.ui.Cells.u8("placeholderAlpha", 9);
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
    public final tg0 f30816b;
    public final vg0 f30817c;
    public final Drawable d;
    public final View e;
    public final x7 f30818f;
    public AnimatorSet h;
    public final MessageObject f30819n;
    public final TLRPC.Poll f30820r;
    public final TLRPC.InputPeer f30821s;
    public final HashSet v;
    public final HashMap f30822w;
    public final ArrayList f30823x;
    public final x5 f30824y;

    public zg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f30822w = new HashMap();
        this.f30823x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f30819n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f30820r = tL_messageMediaPoll.poll;
        this.f30821s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f30823x.add(new yg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f30821s;
                tL_messages_getPollVotes.f18425id = this.f30819n.getId();
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
        Collections.sort(this.f30823x, new rg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19183i5, false), PorterDuff.Mode.MULTIPLY));
        sg0 sg0Var = new sg0(this, context);
        this.containerView = sg0Var;
        sg0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        tg0 tg0Var = new tg0(this, context);
        this.f30816b = tg0Var;
        tg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f43055c = 150L;
        jVar.e = 350L;
        jVar.f43056f = 0L;
        jVar.f43057g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f43058i = new OvershootInterpolator(1.1f);
        jVar.f43031o = qr.h;
        tg0Var.setItemAnimator(jVar);
        tg0Var.setClipToPadding(false);
        getContext();
        tg0Var.setLayoutManager(new gg.b0(1, false, 9));
        tg0Var.setHorizontalScrollBarEnabled(false);
        tg0Var.setVerticalScrollBarEnabled(false);
        tg0Var.setSectionsType(2);
        this.containerView.addView(tg0Var, w7.y5.e(-1, -1, 51));
        vg0 vg0Var = new vg0(this, context);
        this.f30817c = vg0Var;
        tg0Var.setAdapter(vg0Var);
        tg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        tg0Var.setOnItemClickListener(new ai.o6(13, this, context));
        tg0Var.setOnScrollListener(new sb0(this, 2));
        x5 x5Var = new x5(context);
        this.f30824y = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f19201j5;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f30820r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f30819n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(x5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, x5Var.getPaint().getFontMetricsInt());
            x5Var.setText(replaceEmoji);
        }
        x7 x7Var = new x7(this, context, 2);
        this.f30818f = x7Var;
        x7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165h5, false));
        x7Var.setBackButtonImage(R.drawable.ic_ab_back);
        x7Var.B(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        x7Var.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        x7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        x7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        x7Var.setOccupyStatusBar(false);
        x7Var.setAlpha(0.0f);
        x7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f30820r.quiz) {
            x7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            x7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(x7Var, w7.y5.c(-2.0f, -1));
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.y5.c(1.0f, -1));
    }

    public static int A(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int B(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int E(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int F(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int G(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int H(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int I(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(zg0 zg0Var) {
        return zg0Var.containerView;
    }

    public static boolean L(zg0 zg0Var) {
        return zg0Var.isFullscreen;
    }

    public static int M(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int N(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static void m(zg0 zg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 U;
        vg0 vg0Var = zg0Var.f30817c;
        ArrayList arrayList2 = zg0Var.f30823x;
        tg0 tg0Var = zg0Var.f30816b;
        ArrayList arrayList3 = zg0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(zg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new yg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    yg0 yg0Var = (yg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            yg0 yg0Var2 = (yg0) arrayList2.get(i12);
                            if (Arrays.equals(yg0Var.d, yg0Var2.d)) {
                                yg0Var2.f30529c = yg0Var.f30529c;
                                z10 = (yg0Var2.f30527a == yg0Var.f30527a && yg0Var2.f30528b.size() == yg0Var.f30528b.size()) ? true : true;
                                yg0Var2.f30527a = yg0Var.f30527a;
                                yg0Var2.f30528b = yg0Var.f30528b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                zg0Var.L = false;
                if (tg0Var != null) {
                    if (zg0Var.currentSheetAnimationType == 0 && zg0Var.startAnimationRunnable == null && !z10) {
                        int childCount = tg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = tg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View G = tg0Var.G(childAt);
                                if (G == null) {
                                    U = null;
                                } else {
                                    U = tg0Var.U(G);
                                }
                                if (U != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    vg0Var.y(U);
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
                        zg0Var.L = false;
                        return;
                    }
                    if (z10) {
                        zg0Var.R();
                    }
                    vg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        zg0Var.dismiss();
    }

    public static void n(zg0 zg0Var, yg0 yg0Var, TLObject tLObject) {
        if (zg0Var.isShowing()) {
            zg0Var.v.remove(yg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(zg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                yg0Var.f30528b.addAll(tL_messages_votesList.votes);
                yg0Var.f30529c = tL_messages_votesList.next_offset;
                zg0Var.O(null);
                zg0Var.f30817c.X(true);
            }
        }
    }

    public static void o(zg0 zg0Var, Context context, View view, int i10) {
        HashSet hashSet = zg0Var.v;
        vg0 vg0Var = zg0Var.f30817c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = zg0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    int S = vg0Var.S(i10) - 1;
                    int Q = vg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        yg0 yg0Var = (yg0) zg0Var.f30823x.get(S);
                        if (Q == yg0Var.b() && !hashSet.contains(yg0Var)) {
                            if (yg0Var.e && yg0Var.f30530f < yg0Var.f30528b.size()) {
                                int min = Math.min(yg0Var.f30530f + 50, yg0Var.f30528b.size());
                                yg0Var.f30530f = min;
                                if (min == yg0Var.f30528b.size()) {
                                    yg0Var.e = false;
                                }
                                zg0Var.O(null);
                                vg0Var.X(true);
                                return;
                            }
                            hashSet.add(yg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = zg0Var.f30821s;
                            tL_messages_getPollVotes.f18425id = zg0Var.f30819n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = yg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = yg0Var.f30529c;
                            ConnectionsManager.getInstance(zg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.oo(12, zg0Var, yg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f22315n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f18475id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f22315n.f18328id);
                        }
                        zg0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.zn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                                    if (i13 != null && i13.f18475id == pollVotesAlert$UserCell.h.f18475id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.zn) U).e;
                                    if (chat != null && chat.f18328id == pollVotesAlert$UserCell.f22315n.f18328id) {
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

    public static ViewGroup p(zg0 zg0Var) {
        return zg0Var.containerView;
    }

    public static ViewGroup q(zg0 zg0Var) {
        return zg0Var.containerView;
    }

    public static int r(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int s(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static void t(zg0 zg0Var) {
        boolean z10;
        Integer num;
        float f7;
        x7 x7Var = zg0Var.f30818f;
        tg0 tg0Var = zg0Var.f30816b;
        if (tg0Var.getChildCount() <= 0) {
            int paddingTop = tg0Var.getPaddingTop();
            zg0Var.E = paddingTop;
            tg0Var.setTopGlowOffset(paddingTop);
            zg0Var.containerView.invalidate();
            return;
        }
        View childAt = tg0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tg0Var.H(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && x7Var.getTag() == null) || (!z10 && x7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            x7Var.setTag(num);
            AnimatorSet animatorSet = zg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                zg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            zg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = zg0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, property, f7);
            View view = zg0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            zg0Var.h.addListener(new dd0(zg0Var, 4));
            zg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tg0Var.getLayoutParams();
        int D = org.telegram.messenger.rk.D(11.0f, layoutParams.topMargin, top);
        if (zg0Var.E != D) {
            zg0Var.E = D;
            tg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            zg0Var.containerView.invalidate();
        }
    }

    public static int u(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int v(zg0 zg0Var) {
        return zg0Var.currentSheetAnimationType;
    }

    public static int w(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int x(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int y(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int z(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public final void O(View view) {
        tg0 tg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            tg0Var = this.f30816b;
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
            if ((childAt instanceof xg0) && (childAt.getTag(R.id.object_tag) instanceof yg0)) {
                xg0 xg0Var = (xg0) childAt;
                yg0 yg0Var = (yg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f30820r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, yg0Var.d) && ((wg0) this.f30822w.get(yg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f30819n;
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
                            xg0Var.a(str2, arrayList, P(yg0Var.d), yg0Var.f30527a, yg0Var.a(), true);
                            xg0Var.setTag(R.id.object_tag, yg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = tg0Var.f29210r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredHeight(), 0));
            View view3 = tg0Var.f29210r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), tg0Var.f29210r1.getMeasuredHeight());
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
            ArrayList arrayList = this.f30823x;
            if (i10 >= arrayList.size()) {
                break;
            }
            yg0 yg0Var = (yg0) arrayList.get(i10);
            if (yg0Var != null) {
                i11 += yg0Var.f30527a;
                if (Arrays.equals(yg0Var.d, bArr)) {
                    i12 += yg0Var.f30527a;
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
        HashMap hashMap2 = this.f30822w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f30819n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30823x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            yg0 yg0Var = (yg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(yg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(yg0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30049a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.df(12));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((wg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19183i5, false);
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
        x6 x6Var = new x6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.f19165h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30818f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f19201j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30818f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30818f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30818f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30818f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30824y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, org.telegram.ui.ActionBar.j6.f19183i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 524288, new Class[]{xg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 524288, new Class[]{xg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 524288, new Class[]{xg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 524304, new Class[]{xg0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30816b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
