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
public final class wg0 extends org.telegram.ui.ActionBar.g3 {
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
    public final qg0 f30249b;
    public final sg0 f30250c;
    public final Drawable d;
    public final View e;
    public final eg.l1 f30251f;
    public AnimatorSet h;
    public final MessageObject f30252n;
    public final TLRPC.Poll f30253r;
    public final TLRPC.InputPeer f30254s;
    public final HashSet v;
    public final HashMap f30255w;
    public final ArrayList f30256x;
    public final t5 f30257y;

    public wg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f30255w = new HashMap();
        this.f30256x = new ArrayList();
        this.C = new ArrayList();
        this.D = new Paint(1);
        this.I = true;
        this.J = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f30252n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.K = tL_messageMediaPoll;
        this.f30253r = tL_messageMediaPoll.poll;
        this.f30254s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f30256x.add(new vg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f30254s;
                tL_messages_getPollVotes.f19256id = this.f30252n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new kf.i0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.C.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f30256x, new pg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970i5, false), PorterDuff.Mode.MULTIPLY));
        eg.y yVar = new eg.y(this, context);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        qg0 qg0Var = new qg0(this, context);
        this.f30249b = qg0Var;
        qg0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.f5826c = 150L;
        lVar.e = 350L;
        lVar.f5827f = 0L;
        lVar.f5828g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f5829i = new OvershootInterpolator(1.1f);
        lVar.f5762o = mr.h;
        qg0Var.setItemAnimator(lVar);
        qg0Var.setClipToPadding(false);
        getContext();
        qg0Var.setLayoutManager(new org.telegram.ui.k(1, false, 7));
        qg0Var.setHorizontalScrollBarEnabled(false);
        qg0Var.setVerticalScrollBarEnabled(false);
        qg0Var.setSectionsType(2);
        this.containerView.addView(qg0Var, k7.b6.e(-1, -1, 51));
        sg0 sg0Var = new sg0(this, context);
        this.f30250c = sg0Var;
        qg0Var.setAdapter(sg0Var);
        qg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        qg0Var.setOnItemClickListener(new gg.v0(14, this, context));
        qg0Var.setOnScrollListener(new mb0(this, 1));
        t5 t5Var = new t5(context);
        this.f30257y = t5Var;
        t5Var.setTextSize(1, 18.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f19987j5;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        t5Var.setTag(-33024);
        t5Var.setLayoutParams(new f2.w0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f30253r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f30252n;
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
        this.f30251f = l1Var;
        l1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        l1Var.setBackButtonImage(R.drawable.ic_ab_back);
        l1Var.C(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        l1Var.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        l1Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        l1Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        l1Var.setOccupyStatusBar(false);
        l1Var.setAlpha(0.0f);
        l1Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f30253r.quiz) {
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

    public static int A(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static int B(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int C(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static int D(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int E(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static int F(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static int G(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int H(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static ViewGroup I(wg0 wg0Var) {
        return wg0Var.containerView;
    }

    public static boolean K(wg0 wg0Var) {
        return wg0Var.isFullscreen;
    }

    public static int M(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static int N(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static void m(wg0 wg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        f2.l1 T;
        sg0 sg0Var = wg0Var.f30250c;
        ArrayList arrayList2 = wg0Var.f30256x;
        qg0 qg0Var = wg0Var.f30249b;
        ArrayList arrayList3 = wg0Var.C;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(wg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new vg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z4 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    vg0 vg0Var = (vg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            vg0 vg0Var2 = (vg0) arrayList2.get(i12);
                            if (Arrays.equals(vg0Var.d, vg0Var2.d)) {
                                vg0Var2.f29475c = vg0Var.f29475c;
                                z4 = (vg0Var2.f29473a == vg0Var.f29473a && vg0Var2.f29474b.size() == vg0Var.f29474b.size()) ? true : true;
                                vg0Var2.f29473a = vg0Var.f29473a;
                                vg0Var2.f29474b = vg0Var.f29474b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                wg0Var.I = false;
                if (qg0Var != null) {
                    if (wg0Var.currentSheetAnimationType == 0 && wg0Var.startAnimationRunnable == null && !z4) {
                        int childCount = qg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = qg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = qg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = qg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.B = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    sg0Var.y(T);
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
                        wg0Var.I = false;
                        return;
                    }
                    if (z4) {
                        wg0Var.R();
                    }
                    sg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        wg0Var.dismiss();
    }

    public static void n(wg0 wg0Var, vg0 vg0Var, TLObject tLObject) {
        if (wg0Var.isShowing()) {
            wg0Var.v.remove(vg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(wg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                vg0Var.f29474b.addAll(tL_messages_votesList.votes);
                vg0Var.f29475c = tL_messages_votesList.next_offset;
                wg0Var.O(null);
                wg0Var.f30250c.X(true);
            }
        }
    }

    public static void o(wg0 wg0Var, Context context, View view, int i10) {
        HashSet hashSet = wg0Var.v;
        sg0 sg0Var = wg0Var.f30250c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = wg0Var.C;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.n8) {
                    int S = sg0Var.S(i10) - 1;
                    int Q = sg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        vg0 vg0Var = (vg0) wg0Var.f30256x.get(S);
                        if (Q == vg0Var.b() && !hashSet.contains(vg0Var)) {
                            if (vg0Var.e && vg0Var.f29476f < vg0Var.f29474b.size()) {
                                int min = Math.min(vg0Var.f29476f + 50, vg0Var.f29474b.size());
                                vg0Var.f29476f = min;
                                if (min == vg0Var.f29474b.size()) {
                                    vg0Var.e = false;
                                }
                                wg0Var.O(null);
                                sg0Var.X(true);
                                return;
                            }
                            hashSet.add(vg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = wg0Var.f30254s;
                            tL_messages_getPollVotes.f19256id = wg0Var.f30252n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = vg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = vg0Var.f29475c;
                            ConnectionsManager.getInstance(wg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.no(12, wg0Var, vg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f23057n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f19306id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f23057n.f19159id);
                        }
                        wg0Var.dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.zn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                                    if (i13 != null && i13.f19306id == pollVotesAlert$UserCell.h.f19306id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.zn) U).e;
                                    if (chat != null && chat.f19159id == pollVotesAlert$UserCell.f23057n.f19159id) {
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

    public static ViewGroup p(wg0 wg0Var) {
        return wg0Var.containerView;
    }

    public static ViewGroup q(wg0 wg0Var) {
        return wg0Var.containerView;
    }

    public static int r(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int s(wg0 wg0Var) {
        return wg0Var.backgroundPaddingLeft;
    }

    public static void t(wg0 wg0Var) {
        boolean z4;
        Integer num;
        float f10;
        eg.l1 l1Var = wg0Var.f30251f;
        qg0 qg0Var = wg0Var.f30249b;
        if (qg0Var.getChildCount() <= 0) {
            int paddingTop = qg0Var.getPaddingTop();
            wg0Var.B = paddingTop;
            qg0Var.setTopGlowOffset(paddingTop);
            wg0Var.containerView.invalidate();
            return;
        }
        View childAt = qg0Var.getChildAt(0);
        dl0 dl0Var = (dl0) qg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || dl0Var == null || dl0Var.b() != 0) {
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
            AnimatorSet animatorSet = wg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                wg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            wg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = wg0Var.h;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l1Var, property, f10);
            View view = wg0Var.e;
            if (z4) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            wg0Var.h.addListener(new od0(wg0Var, 2));
            wg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qg0Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin, top);
        if (wg0Var.B != C) {
            wg0Var.B = C;
            qg0Var.setTopGlowOffset(C - layoutParams.topMargin);
            wg0Var.containerView.invalidate();
        }
    }

    public static int u(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int v(wg0 wg0Var) {
        return wg0Var.currentSheetAnimationType;
    }

    public static int w(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int x(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public static int y(wg0 wg0Var) {
        return wg0Var.backgroundPaddingTop;
    }

    public final void O(View view) {
        qg0 qg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            qg0Var = this.f30249b;
            int i11 = 0;
            if (i10 >= qg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = qg0Var.getPinnedHeader();
            } else {
                childAt = qg0Var.getChildAt(i10);
            }
            if ((childAt instanceof ug0) && (childAt.getTag(R.id.object_tag) instanceof vg0)) {
                ug0 ug0Var = (ug0) childAt;
                vg0 vg0Var = (vg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f30253r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, vg0Var.d) && ((tg0) this.f30255w.get(vg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f30252n;
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
                            ug0Var.a(str2, arrayList, P(vg0Var.d), vg0Var.f29473a, vg0Var.a(), true);
                            ug0Var.setTag(R.id.object_tag, vg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = qg0Var.f28514o1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(qg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(qg0Var.getMeasuredHeight(), 0));
            View view3 = qg0Var.f28514o1;
            view3.layout(0, 0, view3.getMeasuredWidth(), qg0Var.f28514o1.getMeasuredHeight());
            qg0Var.invalidate();
        }
        qg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f30256x;
            if (i10 >= arrayList.size()) {
                break;
            }
            vg0 vg0Var = (vg0) arrayList.get(i10);
            if (vg0Var != null) {
                i11 += vg0Var.f29473a;
                if (Arrays.equals(vg0Var.d, bArr)) {
                    i12 += vg0Var.f29473a;
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
        HashMap hashMap2 = this.f30255w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f30252n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30256x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            vg0 vg0Var = (vg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(vg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(vg0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f10;
                        obj.f28987a = f10 - i15;
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
                ((tg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.D;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970i5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30251f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30251f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30251f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30251f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30251f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30257y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, org.telegram.ui.ActionBar.j6.f19970i5));
        int i12 = org.telegram.ui.ActionBar.j6.f19918f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 524288, new Class[]{ug0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 524288, new Class[]{ug0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 524288, new Class[]{ug0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 524304, new Class[]{ug0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        int i13 = org.telegram.ui.ActionBar.j6.f20115q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30249b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
