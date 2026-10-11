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
public final class uh0 extends org.telegram.ui.ActionBar.e3 {
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
    public final nh0 f31451b;
    public final qh0 f31452c;
    public final Drawable d;
    public final View f31453e;
    public final a8 f31454f;
    public AnimatorSet h;
    public final MessageObject f31455n;
    public final TLRPC.Poll f31456r;
    public final TLRPC.InputPeer f31457s;
    public final HashSet v;
    public final HashMap f31458w;
    public final ArrayList f31459x;
    public final a6 f31460y;

    public uh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f31458w = new HashMap();
        this.f31459x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f31455n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f31456r = tL_messageMediaPoll.poll;
        this.f31457s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
            if (pollAnswerVoters.voters == 0) {
                i11 = i13;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i15 = pollAnswerVoters.voters;
                i15 = i15 > 15 ? 10 : i15;
                int i16 = 0;
                while (i16 < i15) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                    i16++;
                    i13 = i13;
                }
                i11 = i13;
                int i17 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i15 < i17 ? "empty" : null;
                tL_messages_votesList.count = i17;
                this.f31459x.add(new th0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f31457s;
                tL_messages_getPollVotes.f20129id = this.f31455n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i12 = 15;
                } else {
                    i12 = 10;
                }
                tL_messages_getPollVotes.limit = i12;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.za(this, numArr, i14, arrayList, pollAnswerVoters, 5)));
                numArr[i14] = valueOf;
                this.F.add(valueOf);
            }
            i14++;
            i13 = i11;
        }
        S();
        Collections.sort(this.f31459x, new lh0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20876i5, false), PorterDuff.Mode.MULTIPLY));
        mh0 mh0Var = new mh0(this, context);
        this.containerView = mh0Var;
        mh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        nh0 nh0Var = new nh0(this, context);
        this.f31451b = nh0Var;
        nh0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f47840c = 150L;
        jVar.f47841e = 350L;
        jVar.f47842f = 0L;
        jVar.f47843g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f47844i = new OvershootInterpolator(1.1f);
        jVar.f47808o = is.h;
        nh0Var.setItemAnimator(jVar);
        nh0Var.setClipToPadding(false);
        getContext();
        nh0Var.setLayoutManager(new gg.a0(i13, false, 9));
        nh0Var.setHorizontalScrollBarEnabled(false);
        nh0Var.setVerticalScrollBarEnabled(false);
        nh0Var.setSectionsType(2);
        this.containerView.addView(nh0Var, w7.x5.e(-1, -1, 51));
        qh0 qh0Var = new qh0(this, context);
        this.f31452c = qh0Var;
        nh0Var.setAdapter(qh0Var);
        nh0Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        nh0Var.setOnItemClickListener(new ai.o6(13, this, context));
        nh0Var.setOnScrollListener(new oh0(this, 0));
        a6 a6Var = new a6(context);
        this.f31460y = a6Var;
        a6Var.setTextSize(1, 18.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.h6.f20894j5;
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        a6Var.setTag(-33024);
        a6Var.setLayoutParams(new s4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f31456r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f31455n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(a6Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, a6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, a6Var.getPaint().getFontMetricsInt());
            a6Var.setText(replaceEmoji);
        }
        a8 a8Var = new a8(this, context, 2);
        this.f31454f = a8Var;
        a8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
        a8Var.setBackButtonImage(R.drawable.ic_ab_back);
        a8Var.D(org.telegram.ui.ActionBar.h6.x0(null, i19, false), false);
        a8Var.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        a8Var.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        a8Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        a8Var.setOccupyStatusBar(false);
        a8Var.setAlpha(0.0f);
        a8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f31456r.quiz) {
            a8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            a8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(a8Var, w7.x5.d(-2.0f, -1));
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 11));
        View view = new View(context);
        this.f31453e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        this.containerView.addView(view, w7.x5.d(1.0f, -1));
    }

    public static int B(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int C(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static int D(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int E(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static int F(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int G(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static int H(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static int I(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int J(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(uh0 uh0Var) {
        return uh0Var.containerView;
    }

    public static boolean M(uh0 uh0Var) {
        return uh0Var.isFullscreen;
    }

    public static int N(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static int O(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static void o(uh0 uh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.d1 T;
        qh0 qh0Var = uh0Var.f31452c;
        ArrayList arrayList2 = uh0Var.f31459x;
        nh0 nh0Var = uh0Var.f31451b;
        ArrayList arrayList3 = uh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(uh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new th0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    th0 th0Var = (th0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            th0 th0Var2 = (th0) arrayList2.get(i12);
                            if (Arrays.equals(th0Var.d, th0Var2.d)) {
                                th0Var2.f31100c = th0Var.f31100c;
                                z10 = (th0Var2.f31098a == th0Var.f31098a && th0Var2.f31099b.size() == th0Var.f31099b.size()) ? true : true;
                                th0Var2.f31098a = th0Var.f31098a;
                                th0Var2.f31099b = th0Var.f31099b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                uh0Var.L = false;
                if (nh0Var != null) {
                    if (uh0Var.currentSheetAnimationType == 0 && uh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = nh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = nh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = nh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = nh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    qh0Var.y(T);
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
                        uh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        uh0Var.S();
                    }
                    qh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        uh0Var.dismiss();
    }

    public static void p(uh0 uh0Var, th0 th0Var, TLObject tLObject) {
        if (uh0Var.isShowing()) {
            uh0Var.v.remove(th0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(uh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                th0Var.f31099b.addAll(tL_messages_votesList.votes);
                th0Var.f31100c = tL_messages_votesList.next_offset;
                uh0Var.P(null);
                uh0Var.f31452c.X(true);
            }
        }
    }

    public static void q(uh0 uh0Var, Context context, View view, int i10) {
        HashSet hashSet = uh0Var.v;
        qh0 qh0Var = uh0Var.f31452c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = uh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = qh0Var.S(i10) - 1;
                    int Q = qh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        th0 th0Var = (th0) uh0Var.f31459x.get(S);
                        if (Q == th0Var.b() && !hashSet.contains(th0Var)) {
                            if (th0Var.f31101e && th0Var.f31102f < th0Var.f31099b.size()) {
                                int min = Math.min(th0Var.f31102f + 50, th0Var.f31099b.size());
                                th0Var.f31102f = min;
                                if (min == th0Var.f31099b.size()) {
                                    th0Var.f31101e = false;
                                }
                                uh0Var.P(null);
                                qh0Var.X(true);
                                return;
                            }
                            hashSet.add(th0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = uh0Var.f31457s;
                            tL_messages_getPollVotes.f20129id = uh0Var.f31455n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = th0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = th0Var.f31100c;
                            ConnectionsManager.getInstance(uh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.oo(12, uh0Var, th0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24220n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20179id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24220n.f20032id);
                        }
                        uh0Var.dismiss();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.zn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                                    if (i13 != null && i13.f20179id == pollVotesAlert$UserCell.h.f20179id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.zn) U).f44752e;
                                    if (chat != null && chat.f20032id == pollVotesAlert$UserCell.f24220n.f20032id) {
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

    public static ViewGroup r(uh0 uh0Var) {
        return uh0Var.containerView;
    }

    public static ViewGroup s(uh0 uh0Var) {
        return uh0Var.containerView;
    }

    public static int t(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int u(uh0 uh0Var) {
        return uh0Var.backgroundPaddingLeft;
    }

    public static void v(uh0 uh0Var) {
        boolean z10;
        Integer num;
        float f7;
        a8 a8Var = uh0Var.f31454f;
        nh0 nh0Var = uh0Var.f31451b;
        if (nh0Var.getChildCount() <= 0) {
            int paddingTop = nh0Var.getPaddingTop();
            uh0Var.E = paddingTop;
            nh0Var.setTopGlowOffset(paddingTop);
            uh0Var.containerView.invalidate();
            return;
        }
        View childAt = nh0Var.getChildAt(0);
        cm0 cm0Var = (cm0) nh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || cm0Var == null || cm0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && a8Var.getTag() == null) || (!z10 && a8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            a8Var.setTag(num);
            AnimatorSet animatorSet = uh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                uh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            uh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = uh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, property, f7);
            View view = uh0Var.f31453e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            uh0Var.h.addListener(new wd0(uh0Var, 4));
            uh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nh0Var.getLayoutParams();
        int D = org.telegram.messenger.ai.D(11.0f, layoutParams.topMargin, top);
        if (uh0Var.E != D) {
            uh0Var.E = D;
            nh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            uh0Var.containerView.invalidate();
        }
    }

    public static int w(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int x(uh0 uh0Var) {
        return uh0Var.currentSheetAnimationType;
    }

    public static int y(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public static int z(uh0 uh0Var) {
        return uh0Var.backgroundPaddingTop;
    }

    public final void P(View view) {
        nh0 nh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            nh0Var = this.f31451b;
            int i11 = 0;
            if (i10 >= nh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = nh0Var.getPinnedHeader();
            } else {
                childAt = nh0Var.getChildAt(i10);
            }
            if ((childAt instanceof sh0) && (childAt.getTag(R.id.object_tag) instanceof th0)) {
                sh0 sh0Var = (sh0) childAt;
                th0 th0Var = (th0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f31456r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, th0Var.d) && ((rh0) this.f31458w.get(th0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f31455n;
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
                            sh0Var.a(str2, arrayList, Q(th0Var.d), th0Var.f31098a, th0Var.a(), true);
                            sh0Var.setTag(R.id.object_tag, th0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = nh0Var.f30810p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(nh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(nh0Var.getMeasuredHeight(), 0));
            View view3 = nh0Var.f30810p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), nh0Var.f30810p1.getMeasuredHeight());
            nh0Var.invalidate();
        }
        nh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f31459x;
            if (i10 >= arrayList.size()) {
                break;
            }
            th0 th0Var = (th0) arrayList.get(i10);
            if (th0Var != null) {
                i11 += th0Var.f31098a;
                if (Arrays.equals(th0Var.d, bArr)) {
                    i12 += th0Var.f31098a;
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

    public final MessagesController R() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void S() {
        HashMap hashMap;
        HashMap hashMap2 = this.f31458w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f31455n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31459x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            th0 th0Var = (th0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(th0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(th0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30459a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.ff(12));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((rh0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20876i5, false);
        int averageColor = AndroidUtilities.getAverageColor(x03, x02);
        paint.setColor(x03);
        float dp = AndroidUtilities.dp(500.0f);
        this.K = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
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
        a7 a7Var = new a7(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.h6.f20857h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31454f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        int i11 = org.telegram.ui.ActionBar.h6.f20894j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31454f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31454f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31454f, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31454f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31460y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31453e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, org.telegram.ui.ActionBar.h6.f20876i5));
        int i12 = org.telegram.ui.ActionBar.h6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 524288, new Class[]{sh0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 524288, new Class[]{sh0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 524288, new Class[]{sh0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 524304, new Class[]{sh0.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31451b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
