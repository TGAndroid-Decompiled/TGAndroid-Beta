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
public final class vg0 extends org.telegram.ui.ActionBar.g3 {
    public static final hh.g L = new hh.g("placeholderAlpha", 11);
    public int B;
    public final ArrayList C;
    public final Paint D;
    public LinearGradient E;
    public Matrix F;
    public float G;
    public float H;
    public boolean I;
    public final RectF J;
    public final TLRPC.TL_messageMediaPoll K;
    public final pg0 f29461b;
    public final rg0 f29462c;
    public final Drawable d;
    public final View e;
    public final eg.l1 f29463f;
    public AnimatorSet h;
    public final MessageObject f29464n;
    public final TLRPC.Poll f29465r;
    public final TLRPC.InputPeer f29466s;
    public final HashSet v;
    public final HashMap f29467w;
    public final ArrayList f29468x;
    public final t5 f29469y;

    public vg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f29467w = new HashMap();
        this.f29468x = new ArrayList();
        this.C = new ArrayList();
        this.D = new Paint(1);
        this.I = true;
        this.J = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f29464n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.K = tL_messageMediaPoll;
        this.f29465r = tL_messageMediaPoll.poll;
        this.f29466s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f29468x.add(new ug0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f29466s;
                tL_messages_getPollVotes.f19281id = this.f29464n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new lf.i0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.C.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f29468x, new og0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19995i5, false), PorterDuff.Mode.MULTIPLY));
        eg.y yVar = new eg.y(this, context);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        pg0 pg0Var = new pg0(this, context);
        this.f29461b = pg0Var;
        pg0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.f5837c = 150L;
        lVar.e = 350L;
        lVar.f5838f = 0L;
        lVar.f5839g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f5840i = new OvershootInterpolator(1.1f);
        lVar.f5773o = nr.h;
        pg0Var.setItemAnimator(lVar);
        pg0Var.setClipToPadding(false);
        getContext();
        pg0Var.setLayoutManager(new org.telegram.ui.k(1, false, 7));
        pg0Var.setHorizontalScrollBarEnabled(false);
        pg0Var.setVerticalScrollBarEnabled(false);
        pg0Var.setSectionsType(2);
        this.containerView.addView(pg0Var, k7.b6.e(-1, -1, 51));
        rg0 rg0Var = new rg0(this, context);
        this.f29462c = rg0Var;
        pg0Var.setAdapter(rg0Var);
        pg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        pg0Var.setOnItemClickListener(new gg.v0(14, this, context));
        pg0Var.setOnScrollListener(new lb0(this, 1));
        t5 t5Var = new t5(context);
        this.f29469y = t5Var;
        t5Var.setTextSize(1, 18.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f20012j5;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        t5Var.setTag(-33024);
        t5Var.setLayoutParams(new f2.w0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f29465r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f29464n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(t5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, t5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, t5Var.getPaint().getFontMetricsInt());
            t5Var.setText(replaceEmoji);
        }
        eg.l1 l1Var = new eg.l1(this, context, 3);
        this.f29463f = l1Var;
        l1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false));
        l1Var.setBackButtonImage(R.drawable.ic_ab_back);
        l1Var.C(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        l1Var.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        l1Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        l1Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        l1Var.setOccupyStatusBar(false);
        l1Var.setAlpha(0.0f);
        l1Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f29465r.quiz) {
            l1Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            l1Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(l1Var, k7.b6.c(-2.0f, -1));
        l1Var.setActionBarMenuOnItemClick(new eg.m1(this, 28));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, k7.b6.c(1.0f, -1));
    }

    public static int A(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static int B(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int C(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static int D(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int E(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static int F(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static int G(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int H(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static ViewGroup I(vg0 vg0Var) {
        return vg0Var.containerView;
    }

    public static boolean K(vg0 vg0Var) {
        return vg0Var.isFullscreen;
    }

    public static int M(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static int N(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static void m(vg0 vg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        f2.l1 T;
        rg0 rg0Var = vg0Var.f29462c;
        ArrayList arrayList2 = vg0Var.f29468x;
        pg0 pg0Var = vg0Var.f29461b;
        ArrayList arrayList3 = vg0Var.C;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(vg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new ug0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z4 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    ug0 ug0Var = (ug0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            ug0 ug0Var2 = (ug0) arrayList2.get(i12);
                            if (Arrays.equals(ug0Var.d, ug0Var2.d)) {
                                ug0Var2.f29217c = ug0Var.f29217c;
                                z4 = (ug0Var2.f29215a == ug0Var.f29215a && ug0Var2.f29216b.size() == ug0Var.f29216b.size()) ? true : true;
                                ug0Var2.f29215a = ug0Var.f29215a;
                                ug0Var2.f29216b = ug0Var.f29216b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                vg0Var.I = false;
                if (pg0Var != null) {
                    if (vg0Var.currentSheetAnimationType == 0 && vg0Var.startAnimationRunnable == null && !z4) {
                        int childCount = pg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = pg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = pg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = pg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.B = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    rg0Var.y(T);
                                    pollVotesAlert$UserCell.B = null;
                                }
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList4);
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                        }
                        vg0Var.I = false;
                        return;
                    }
                    if (z4) {
                        vg0Var.R();
                    }
                    rg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        vg0Var.dismiss();
    }

    public static void n(vg0 vg0Var, ug0 ug0Var, TLObject tLObject) {
        if (vg0Var.isShowing()) {
            vg0Var.v.remove(ug0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(vg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                ug0Var.f29216b.addAll(tL_messages_votesList.votes);
                ug0Var.f29217c = tL_messages_votesList.next_offset;
                vg0Var.O(null);
                vg0Var.f29462c.X(true);
            }
        }
    }

    public static void o(vg0 vg0Var, Context context, View view, int i10) {
        HashSet hashSet = vg0Var.v;
        rg0 rg0Var = vg0Var.f29462c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = vg0Var.C;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    int S = rg0Var.S(i10) - 1;
                    int Q = rg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        ug0 ug0Var = (ug0) vg0Var.f29468x.get(S);
                        if (Q == ug0Var.b() && !hashSet.contains(ug0Var)) {
                            if (ug0Var.e && ug0Var.f29218f < ug0Var.f29216b.size()) {
                                int min = Math.min(ug0Var.f29218f + 50, ug0Var.f29216b.size());
                                ug0Var.f29218f = min;
                                if (min == ug0Var.f29216b.size()) {
                                    ug0Var.e = false;
                                }
                                vg0Var.O(null);
                                rg0Var.X(true);
                                return;
                            }
                            hashSet.add(ug0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = vg0Var.f29466s;
                            tL_messages_getPollVotes.f19281id = vg0Var.f29464n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = ug0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = ug0Var.f29217c;
                            ConnectionsManager.getInstance(vg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.lo(12, vg0Var, ug0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f23084n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f19331id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f23084n.f19184id);
                        }
                        vg0Var.dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.xn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.xn) U).i();
                                    if (i13 != null && i13.f19331id == pollVotesAlert$UserCell.h.f19331id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.xn) U).e;
                                    if (chat != null && chat.f19184id == pollVotesAlert$UserCell.f23084n.f19184id) {
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

    public static ViewGroup p(vg0 vg0Var) {
        return vg0Var.containerView;
    }

    public static ViewGroup q(vg0 vg0Var) {
        return vg0Var.containerView;
    }

    public static int r(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int s(vg0 vg0Var) {
        return vg0Var.backgroundPaddingLeft;
    }

    public static void t(vg0 vg0Var) {
        boolean z4;
        Integer num;
        float f10;
        eg.l1 l1Var = vg0Var.f29463f;
        pg0 pg0Var = vg0Var.f29461b;
        if (pg0Var.getChildCount() <= 0) {
            int paddingTop = pg0Var.getPaddingTop();
            vg0Var.B = paddingTop;
            pg0Var.setTopGlowOffset(paddingTop);
            vg0Var.containerView.invalidate();
            return;
        }
        View childAt = pg0Var.getChildAt(0);
        el0 el0Var = (el0) pg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((z4 && l1Var.getTag() == null) || (!z4 && l1Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            l1Var.setTag(num);
            AnimatorSet animatorSet = vg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                vg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            vg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = vg0Var.h;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l1Var, property, f10);
            View view = vg0Var.e;
            if (z4) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            vg0Var.h.addListener(new nd0(vg0Var, 2));
            vg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pg0Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin, top);
        if (vg0Var.B != C) {
            vg0Var.B = C;
            pg0Var.setTopGlowOffset(C - layoutParams.topMargin);
            vg0Var.containerView.invalidate();
        }
    }

    public static int u(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int v(vg0 vg0Var) {
        return vg0Var.currentSheetAnimationType;
    }

    public static int w(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int x(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public static int y(vg0 vg0Var) {
        return vg0Var.backgroundPaddingTop;
    }

    public final void O(View view) {
        pg0 pg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            pg0Var = this.f29461b;
            int i11 = 0;
            if (i10 >= pg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = pg0Var.getPinnedHeader();
            } else {
                childAt = pg0Var.getChildAt(i10);
            }
            if ((childAt instanceof tg0) && (childAt.getTag(R.id.object_tag) instanceof ug0)) {
                tg0 tg0Var = (tg0) childAt;
                ug0 ug0Var = (ug0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f29465r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, ug0Var.d) && ((sg0) this.f29467w.get(ug0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f29464n;
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
                            tg0Var.a(str2, arrayList, P(ug0Var.d), ug0Var.f29215a, ug0Var.a(), true);
                            tg0Var.setTag(R.id.object_tag, ug0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = pg0Var.f28753o1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(pg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(pg0Var.getMeasuredHeight(), 0));
            View view3 = pg0Var.f28753o1;
            view3.layout(0, 0, view3.getMeasuredWidth(), pg0Var.f28753o1.getMeasuredHeight());
            pg0Var.invalidate();
        }
        pg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f29468x;
            if (i10 >= arrayList.size()) {
                break;
            }
            ug0 ug0Var = (ug0) arrayList.get(i10);
            if (ug0Var != null) {
                i11 += ug0Var.f29215a;
                if (Arrays.equals(ug0Var.d, bArr)) {
                    i12 += ug0Var.f29215a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.K;
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
        HashMap hashMap2 = this.f29467w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f29464n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f29468x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            ug0 ug0Var = (ug0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(ug0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(ug0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f10;
                        obj.f28710a = f10 - i15;
                        if (i12 == 0) {
                            i12 = i15;
                        } else if (i15 != 0 && i12 != i15) {
                            z4 = true;
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
        if (z4 && i10 != 0) {
            Collections.sort(arrayList, new nh.e4(23));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((sg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.D;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19995i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.H = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.E = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.F = matrix;
        this.E.setLocalMatrix(matrix);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29463f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f20012j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29463f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29463f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29463f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29463f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29469y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, org.telegram.ui.ActionBar.j6.f19995i5));
        int i12 = org.telegram.ui.ActionBar.j6.f19943f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 524288, new Class[]{tg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 524288, new Class[]{tg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 524288, new Class[]{tg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 524304, new Class[]{tg0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i13 = org.telegram.ui.ActionBar.j6.f20140q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29461b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
