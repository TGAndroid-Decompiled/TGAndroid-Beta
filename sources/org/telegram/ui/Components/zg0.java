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
public final class zg0 extends org.telegram.ui.ActionBar.h3 {
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
    public final tg0 f29678b;
    public final vg0 f29679c;
    public final Drawable d;
    public final View e;
    public final y7 f29680f;
    public AnimatorSet h;
    public final MessageObject f29681n;
    public final TLRPC.Poll f29682r;
    public final TLRPC.InputPeer f29683s;
    public final HashSet v;
    public final HashMap f29684w;
    public final ArrayList f29685x;
    public final x5 f29686y;

    public zg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f29684w = new HashMap();
        this.f29685x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f29681n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f29682r = tL_messageMediaPoll.poll;
        this.f29683s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f29685x.add(new yg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f29683s;
                tL_messages_getPollVotes.f17292id = this.f29681n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new fg.e1(this, numArr, i12, arrayList, pollAnswerVoters)));
                numArr[i12] = valueOf;
                this.F.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f29685x, new rg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18016i5, false), PorterDuff.Mode.MULTIPLY));
        sg0 sg0Var = new sg0(this, context);
        this.containerView = sg0Var;
        sg0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        tg0 tg0Var = new tg0(this, context);
        this.f29678b = tg0Var;
        tg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f41691c = 150L;
        jVar.e = 350L;
        jVar.f41692f = 0L;
        jVar.f41693g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f41694i = new OvershootInterpolator(1.1f);
        jVar.f41667o = wr.h;
        tg0Var.setItemAnimator(jVar);
        tg0Var.setClipToPadding(false);
        getContext();
        tg0Var.setLayoutManager(new fg.a0(1, false, 9));
        tg0Var.setHorizontalScrollBarEnabled(false);
        tg0Var.setVerticalScrollBarEnabled(false);
        tg0Var.setSectionsType(2);
        this.containerView.addView(tg0Var, w7.a6.e(-1, -1, 51));
        vg0 vg0Var = new vg0(this, context);
        this.f29679c = vg0Var;
        tg0Var.setAdapter(vg0Var);
        tg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        tg0Var.setOnItemClickListener(new ai.b0(12, this, context));
        tg0Var.setOnScrollListener(new bi.a2(this, 28));
        x5 x5Var = new x5(context);
        this.f29686y = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f18034j5;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f29682r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f29681n;
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
        y7 y7Var = new y7(this, context, 2);
        this.f29680f = y7Var;
        y7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
        y7Var.setBackButtonImage(R.drawable.ic_ab_back);
        y7Var.C(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        y7Var.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        y7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        y7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        y7Var.setOccupyStatusBar(false);
        y7Var.setAlpha(0.0f);
        y7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f29682r.quiz) {
            y7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            y7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(y7Var, w7.a6.c(-2.0f, -1));
        y7Var.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.a6.c(1.0f, -1));
    }

    public static int A(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int C(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int D(zg0 zg0Var) {
        return zg0Var.backgroundPaddingTop;
    }

    public static int E(zg0 zg0Var) {
        return zg0Var.backgroundPaddingLeft;
    }

    public static int F(zg0 zg0Var) {
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
        s4.c1 T;
        vg0 vg0Var = zg0Var.f29679c;
        ArrayList arrayList2 = zg0Var.f29685x;
        tg0 tg0Var = zg0Var.f29678b;
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
                                yg0Var2.f29324c = yg0Var.f29324c;
                                z10 = (yg0Var2.f29322a == yg0Var.f29322a && yg0Var2.f29323b.size() == yg0Var.f29323b.size()) ? true : true;
                                yg0Var2.f29322a = yg0Var.f29322a;
                                yg0Var2.f29323b = yg0Var.f29323b;
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
                                    vg0Var.y(T);
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
                yg0Var.f29323b.addAll(tL_messages_votesList.votes);
                yg0Var.f29324c = tL_messages_votesList.next_offset;
                zg0Var.O(null);
                zg0Var.f29679c.X(true);
            }
        }
    }

    public static void o(zg0 zg0Var, Context context, View view, int i10) {
        HashSet hashSet = zg0Var.v;
        vg0 vg0Var = zg0Var.f29679c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = zg0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    int S = vg0Var.S(i10) - 1;
                    int Q = vg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        yg0 yg0Var = (yg0) zg0Var.f29685x.get(S);
                        if (Q == yg0Var.b() && !hashSet.contains(yg0Var)) {
                            if (yg0Var.e && yg0Var.f29325f < yg0Var.f29323b.size()) {
                                int min = Math.min(yg0Var.f29325f + 50, yg0Var.f29323b.size());
                                yg0Var.f29325f = min;
                                if (min == yg0Var.f29323b.size()) {
                                    yg0Var.e = false;
                                }
                                zg0Var.O(null);
                                vg0Var.X(true);
                                return;
                            }
                            hashSet.add(yg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = zg0Var.f29683s;
                            tL_messages_getPollVotes.f17292id = zg0Var.f29681n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = yg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = yg0Var.f29324c;
                            ConnectionsManager.getInstance(zg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new th(7, zg0Var, yg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f21179n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f17342id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f21179n.f17195id);
                        }
                        zg0Var.dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.eo) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.eo) U).i();
                                    if (i13 != null && i13.f17342id == pollVotesAlert$UserCell.h.f17342id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.eo) U).e;
                                    if (chat != null && chat.f17195id == pollVotesAlert$UserCell.f21179n.f17195id) {
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
        y7 y7Var = zg0Var.f29680f;
        tg0 tg0Var = zg0Var.f29678b;
        if (tg0Var.getChildCount() <= 0) {
            int paddingTop = tg0Var.getPaddingTop();
            zg0Var.E = paddingTop;
            tg0Var.setTopGlowOffset(paddingTop);
            zg0Var.containerView.invalidate();
            return;
        }
        View childAt = tg0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tg0Var.G(childAt);
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
        if ((z10 && y7Var.getTag() == null) || (!z10 && y7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            y7Var.setTag(num);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y7Var, property, f7);
            View view = zg0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            zg0Var.h.addListener(new rm(zg0Var, 23));
            zg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tg0Var.getLayoutParams();
        int D = org.telegram.messenger.em.D(11.0f, layoutParams.topMargin, top);
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
            tg0Var = this.f29678b;
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
                TLRPC.Poll poll = this.f29682r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, yg0Var.d) && ((wg0) this.f29684w.get(yg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f29681n;
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
                            xg0Var.a(str2, arrayList, P(yg0Var.d), yg0Var.f29322a, yg0Var.a(), true);
                            xg0Var.setTag(R.id.object_tag, yg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = tg0Var.f27990r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tg0Var.getMeasuredHeight(), 0));
            View view3 = tg0Var.f27990r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), tg0Var.f27990r1.getMeasuredHeight());
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
            ArrayList arrayList = this.f29685x;
            if (i10 >= arrayList.size()) {
                break;
            }
            yg0 yg0Var = (yg0) arrayList.get(i10);
            if (yg0Var != null) {
                i11 += yg0Var.f29322a;
                if (Arrays.equals(yg0Var.d, bArr)) {
                    i12 += yg0Var.f29322a;
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
        HashMap hashMap2 = this.f29684w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f29681n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f29685x;
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
                        obj.f28771a = f7 - i15;
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
            Collections.sort(arrayList, new m9(5));
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18016i5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29680f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29680f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29680f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29680f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29680f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29686y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, org.telegram.ui.ActionBar.j6.f18016i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 524288, new Class[]{xg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 524288, new Class[]{xg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 524288, new Class[]{xg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 524304, new Class[]{xg0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29678b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
