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
public final class xg0 extends org.telegram.ui.ActionBar.h3 {
    public static final ih.g L = new ih.g("placeholderAlpha", 11);
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
    public final rg0 f33066b;
    public final tg0 f33067c;
    public final Drawable d;
    public final View f33068e;
    public final fg.k1 f33069f;
    public AnimatorSet h;
    public final MessageObject f33070n;
    public final TLRPC.Poll f33071r;
    public final TLRPC.InputPeer f33072s;
    public final HashSet v;
    public final HashMap f33073w;
    public final ArrayList f33074x;
    public final t5 f33075y;

    public xg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f33073w = new HashMap();
        this.f33074x = new ArrayList();
        this.C = new ArrayList();
        this.D = new Paint(1);
        this.I = true;
        this.J = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f33070n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.K = tL_messageMediaPoll;
        this.f33071r = tL_messageMediaPoll.poll;
        this.f33072s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f33074x.add(new wg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f33072s;
                tL_messages_getPollVotes.f20942id = this.f33070n.getId();
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
        Collections.sort(this.f33074x, new qg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21751i5, false), PorterDuff.Mode.MULTIPLY));
        fg.y yVar = new fg.y(this, context);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        rg0 rg0Var = new rg0(this, context);
        this.f33066b = rg0Var;
        rg0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.f5930c = 150L;
        lVar.f5931e = 350L;
        lVar.f5932f = 0L;
        lVar.f5933g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f5934i = new OvershootInterpolator(1.1f);
        lVar.f5852o = pr.h;
        rg0Var.setItemAnimator(lVar);
        rg0Var.setClipToPadding(false);
        getContext();
        rg0Var.setLayoutManager(new org.telegram.ui.k(1, false, 7));
        rg0Var.setHorizontalScrollBarEnabled(false);
        rg0Var.setVerticalScrollBarEnabled(false);
        rg0Var.setSectionsType(2);
        this.containerView.addView(rg0Var, k7.c6.e(-1, -1, 51));
        tg0 tg0Var = new tg0(this, context);
        this.f33067c = tg0Var;
        rg0Var.setAdapter(tg0Var);
        rg0Var.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A5, false));
        rg0Var.setOnItemClickListener(new hg.v0(13, this, context));
        rg0Var.setOnScrollListener(new nb0(this, 1));
        t5 t5Var = new t5(context);
        this.f33075y = t5Var;
        t5Var.setTextSize(1, 18.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.k6.f21768j5;
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        t5Var.setTag(-33024);
        t5Var.setLayoutParams(new f2.x0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f33071r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f33070n;
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
        fg.k1 k1Var = new fg.k1(this, context, 3);
        this.f33069f = k1Var;
        k1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
        k1Var.setBackButtonImage(R.drawable.ic_ab_back);
        k1Var.C(org.telegram.ui.ActionBar.k6.w0(null, i17, false), false);
        k1Var.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), false);
        k1Var.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        k1Var.setSubtitleColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pi, false));
        k1Var.setOccupyStatusBar(false);
        k1Var.setAlpha(0.0f);
        k1Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f33071r.quiz) {
            k1Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            k1Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(k1Var, k7.c6.c(-2.0f, -1));
        k1Var.setActionBarMenuOnItemClick(new fg.l1(this, 28));
        View view = new View(context);
        this.f33068e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.V5, false));
        this.containerView.addView(view, k7.c6.c(1.0f, -1));
    }

    public static int A(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static int B(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int C(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static int D(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int E(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static int F(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static int G(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int H(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static ViewGroup I(xg0 xg0Var) {
        return xg0Var.containerView;
    }

    public static boolean K(xg0 xg0Var) {
        return xg0Var.isFullscreen;
    }

    public static int M(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static int N(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static void m(xg0 xg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        f2.m1 T;
        tg0 tg0Var = xg0Var.f33067c;
        ArrayList arrayList2 = xg0Var.f33074x;
        rg0 rg0Var = xg0Var.f33066b;
        ArrayList arrayList3 = xg0Var.C;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(xg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new wg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z4 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    wg0 wg0Var = (wg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            wg0 wg0Var2 = (wg0) arrayList2.get(i12);
                            if (Arrays.equals(wg0Var.d, wg0Var2.d)) {
                                wg0Var2.f32751c = wg0Var.f32751c;
                                z4 = (wg0Var2.f32749a == wg0Var.f32749a && wg0Var2.f32750b.size() == wg0Var.f32750b.size()) ? true : true;
                                wg0Var2.f32749a = wg0Var.f32749a;
                                wg0Var2.f32750b = wg0Var.f32750b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                xg0Var.I = false;
                if (rg0Var != null) {
                    if (xg0Var.currentSheetAnimationType == 0 && xg0Var.startAnimationRunnable == null && !z4) {
                        int childCount = rg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = rg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = rg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = rg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.B = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    tg0Var.y(T);
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
                        xg0Var.I = false;
                        return;
                    }
                    if (z4) {
                        xg0Var.R();
                    }
                    tg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        xg0Var.dismiss();
    }

    public static void n(xg0 xg0Var, wg0 wg0Var, TLObject tLObject) {
        if (xg0Var.isShowing()) {
            xg0Var.v.remove(wg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(xg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                wg0Var.f32750b.addAll(tL_messages_votesList.votes);
                wg0Var.f32751c = tL_messages_votesList.next_offset;
                xg0Var.O(null);
                xg0Var.f33067c.X(true);
            }
        }
    }

    public static void o(xg0 xg0Var, Context context, View view, int i10) {
        HashSet hashSet = xg0Var.v;
        tg0 tg0Var = xg0Var.f33067c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = xg0Var.C;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    int S = tg0Var.S(i10) - 1;
                    int Q = tg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        wg0 wg0Var = (wg0) xg0Var.f33074x.get(S);
                        if (Q == wg0Var.b() && !hashSet.contains(wg0Var)) {
                            if (wg0Var.f32752e && wg0Var.f32753f < wg0Var.f32750b.size()) {
                                int min = Math.min(wg0Var.f32753f + 50, wg0Var.f32750b.size());
                                wg0Var.f32753f = min;
                                if (min == wg0Var.f32750b.size()) {
                                    wg0Var.f32752e = false;
                                }
                                xg0Var.O(null);
                                tg0Var.X(true);
                                return;
                            }
                            hashSet.add(wg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = xg0Var.f33072s;
                            tL_messages_getPollVotes.f20942id = xg0Var.f33070n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = wg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = wg0Var.f32751c;
                            ConnectionsManager.getInstance(xg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.lo(12, xg0Var, wg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24939n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20992id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24939n.f20845id);
                        }
                        xg0Var.dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.xn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.xn) U).i();
                                    if (i13 != null && i13.f20992id == pollVotesAlert$UserCell.h.f20992id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.xn) U).f43143e;
                                    if (chat != null && chat.f20845id == pollVotesAlert$UserCell.f24939n.f20845id) {
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

    public static ViewGroup p(xg0 xg0Var) {
        return xg0Var.containerView;
    }

    public static ViewGroup q(xg0 xg0Var) {
        return xg0Var.containerView;
    }

    public static int r(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int s(xg0 xg0Var) {
        return xg0Var.backgroundPaddingLeft;
    }

    public static void t(xg0 xg0Var) {
        boolean z4;
        Integer num;
        float f10;
        fg.k1 k1Var = xg0Var.f33069f;
        rg0 rg0Var = xg0Var.f33066b;
        if (rg0Var.getChildCount() <= 0) {
            int paddingTop = rg0Var.getPaddingTop();
            xg0Var.B = paddingTop;
            rg0Var.setTopGlowOffset(paddingTop);
            xg0Var.containerView.invalidate();
            return;
        }
        View childAt = rg0Var.getChildAt(0);
        el0 el0Var = (el0) rg0Var.G(childAt);
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
        if ((z4 && k1Var.getTag() == null) || (!z4 && k1Var.getTag() != null)) {
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            k1Var.setTag(num);
            AnimatorSet animatorSet = xg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                xg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            xg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = xg0Var.h;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(k1Var, property, f10);
            View view = xg0Var.f33068e;
            if (z4) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            xg0Var.h.addListener(new pd0(xg0Var, 2));
            xg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rg0Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin, top);
        if (xg0Var.B != C) {
            xg0Var.B = C;
            rg0Var.setTopGlowOffset(C - layoutParams.topMargin);
            xg0Var.containerView.invalidate();
        }
    }

    public static int u(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int v(xg0 xg0Var) {
        return xg0Var.currentSheetAnimationType;
    }

    public static int w(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int x(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public static int y(xg0 xg0Var) {
        return xg0Var.backgroundPaddingTop;
    }

    public final void O(View view) {
        rg0 rg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            rg0Var = this.f33066b;
            int i11 = 0;
            if (i10 >= rg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = rg0Var.getPinnedHeader();
            } else {
                childAt = rg0Var.getChildAt(i10);
            }
            if ((childAt instanceof vg0) && (childAt.getTag(R.id.object_tag) instanceof wg0)) {
                vg0 vg0Var = (vg0) childAt;
                wg0 wg0Var = (wg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f33071r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, wg0Var.d) && ((ug0) this.f33073w.get(wg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f33070n;
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
                            vg0Var.a(str2, arrayList, P(wg0Var.d), wg0Var.f32749a, wg0Var.a(), true);
                            vg0Var.setTag(R.id.object_tag, wg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = rg0Var.f31109o1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(rg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(rg0Var.getMeasuredHeight(), 0));
            View view3 = rg0Var.f31109o1;
            view3.layout(0, 0, view3.getMeasuredWidth(), rg0Var.f31109o1.getMeasuredHeight());
            rg0Var.invalidate();
        }
        rg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f33074x;
            if (i10 >= arrayList.size()) {
                break;
            }
            wg0 wg0Var = (wg0) arrayList.get(i10);
            if (wg0Var != null) {
                i11 += wg0Var.f32749a;
                if (Arrays.equals(wg0Var.d, bArr)) {
                    i12 += wg0Var.f32749a;
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
        HashMap hashMap2 = this.f33073w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f33070n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f33074x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            wg0 wg0Var = (wg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(wg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(wg0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f10;
                        obj.f31630a = f10 - i15;
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
            Collections.sort(arrayList, new oh.k0(23));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((ug0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.D;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21751i5, false);
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
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.k6.f21733h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33069f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.A5));
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33069f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33069f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33069f, 1024, null, null, null, null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33069f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33075y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33068e, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, org.telegram.ui.ActionBar.k6.f21751i5));
        int i12 = org.telegram.ui.ActionBar.k6.f21699f7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 524288, new Class[]{vg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 524288, new Class[]{vg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 524288, new Class[]{vg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 524304, new Class[]{vg0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21680e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        int i13 = org.telegram.ui.ActionBar.k6.f21896q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f33066b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
