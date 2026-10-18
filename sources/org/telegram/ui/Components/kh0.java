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
public final class kh0 extends org.telegram.ui.ActionBar.f3 {
    public static final org.telegram.ui.Cells.s8 O = new org.telegram.ui.Cells.s8("placeholderAlpha", 9);
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
    public final eh0 f27875b;
    public final gh0 f27876c;
    public final Drawable d;
    public final View e;
    public final z7 f27877f;
    public AnimatorSet h;
    public final MessageObject f27878n;
    public final TLRPC.Poll f27879r;
    public final TLRPC.InputPeer f27880s;
    public final HashSet v;
    public final HashMap f27881w;
    public final ArrayList f27882x;
    public final z5 f27883y;

    public kh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f27881w = new HashMap();
        this.f27882x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f27878n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f27879r = tL_messageMediaPoll.poll;
        this.f27880s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f27882x.add(new jh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f27880s;
                tL_messages_getPollVotes.f20369id = this.f27878n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i12 = 15;
                } else {
                    i12 = 10;
                }
                tL_messages_getPollVotes.limit = i12;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.sb(this, numArr, i14, arrayList, pollAnswerVoters, 7)));
                numArr[i14] = valueOf;
                this.F.add(valueOf);
            }
            i14++;
            i13 = i11;
        }
        S();
        Collections.sort(this.f27882x, new ch0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21074i5, false), PorterDuff.Mode.MULTIPLY));
        dh0 dh0Var = new dh0(this, context);
        this.containerView = dh0Var;
        dh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        eh0 eh0Var = new eh0(this, context);
        this.f27875b = eh0Var;
        eh0Var.setSections(false);
        s4.k kVar = new s4.k();
        kVar.f45989c = 150L;
        kVar.e = 350L;
        kVar.f45990f = 0L;
        kVar.f45991g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f45992i = new OvershootInterpolator(1.1f);
        kVar.f45973o = bs.h;
        eh0Var.setItemAnimator(kVar);
        eh0Var.setClipToPadding(false);
        getContext();
        eh0Var.setLayoutManager(new hg.a0(i13, false, 9));
        eh0Var.setHorizontalScrollBarEnabled(false);
        eh0Var.setVerticalScrollBarEnabled(false);
        eh0Var.setSectionsType(2);
        this.containerView.addView(eh0Var, w7.z5.e(-1, -1, 51));
        gh0 gh0Var = new gh0(this, context);
        this.f27876c = gh0Var;
        eh0Var.setAdapter(gh0Var);
        eh0Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        eh0Var.setOnItemClickListener(new ci.x4(13, this, context));
        eh0Var.setOnScrollListener(new kv(this, 5));
        z5 z5Var = new z5(context);
        this.f27883y = z5Var;
        z5Var.setTextSize(1, 18.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.h6.f21092j5;
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        z5Var.setTag(-33024);
        z5Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f27879r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f27878n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(z5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, z5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, z5Var.getPaint().getFontMetricsInt());
            z5Var.setText(replaceEmoji);
        }
        z7 z7Var = new z7(this, context, 2);
        this.f27877f = z7Var;
        z7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false));
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        z7Var.C(org.telegram.ui.ActionBar.h6.x0(null, i19, false), false);
        z7Var.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        z7Var.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        z7Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        z7Var.setOccupyStatusBar(false);
        z7Var.setAlpha(0.0f);
        z7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f27879r.quiz) {
            z7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            z7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(z7Var, w7.z5.c(-2.0f, -1));
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 14));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
    }

    public static int A(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int B(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static int C(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int D(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static int F(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int G(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static int H(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static int I(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int J(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(kh0 kh0Var) {
        return kh0Var.containerView;
    }

    public static boolean M(kh0 kh0Var) {
        return kh0Var.isFullscreen;
    }

    public static int N(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static int O(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static void n(kh0 kh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.b1 T;
        gh0 gh0Var = kh0Var.f27876c;
        ArrayList arrayList2 = kh0Var.f27882x;
        eh0 eh0Var = kh0Var.f27875b;
        ArrayList arrayList3 = kh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(kh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new jh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    jh0 jh0Var = (jh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            jh0 jh0Var2 = (jh0) arrayList2.get(i12);
                            if (Arrays.equals(jh0Var.d, jh0Var2.d)) {
                                jh0Var2.f27528c = jh0Var.f27528c;
                                z10 = (jh0Var2.f27526a == jh0Var.f27526a && jh0Var2.f27527b.size() == jh0Var.f27527b.size()) ? true : true;
                                jh0Var2.f27526a = jh0Var.f27526a;
                                jh0Var2.f27527b = jh0Var.f27527b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                kh0Var.L = false;
                if (eh0Var != null) {
                    if (kh0Var.currentSheetAnimationType == 0 && kh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = eh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = eh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = eh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = eh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    gh0Var.y(T);
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
                        kh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        kh0Var.S();
                    }
                    gh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        kh0Var.dismiss();
    }

    public static void o(kh0 kh0Var, jh0 jh0Var, TLObject tLObject) {
        if (kh0Var.isShowing()) {
            kh0Var.v.remove(jh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(kh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                jh0Var.f27527b.addAll(tL_messages_votesList.votes);
                jh0Var.f27528c = tL_messages_votesList.next_offset;
                kh0Var.P(null);
                kh0Var.f27876c.X(true);
            }
        }
    }

    public static void p(kh0 kh0Var, Context context, View view, int i10) {
        HashSet hashSet = kh0Var.v;
        gh0 gh0Var = kh0Var.f27876c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = kh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.q8) {
                    int S = gh0Var.S(i10) - 1;
                    int Q = gh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        jh0 jh0Var = (jh0) kh0Var.f27882x.get(S);
                        if (Q == jh0Var.b() && !hashSet.contains(jh0Var)) {
                            if (jh0Var.e && jh0Var.f27529f < jh0Var.f27527b.size()) {
                                int min = Math.min(jh0Var.f27529f + 50, jh0Var.f27527b.size());
                                jh0Var.f27529f = min;
                                if (min == jh0Var.f27527b.size()) {
                                    jh0Var.e = false;
                                }
                                kh0Var.P(null);
                                gh0Var.X(true);
                                return;
                            }
                            hashSet.add(jh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = kh0Var.f27880s;
                            tL_messages_getPollVotes.f20369id = kh0Var.f27878n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = jh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = jh0Var.f27528c;
                            ConnectionsManager.getInstance(kh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.xc(19, kh0Var, jh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24269n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20419id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24269n.f20272id);
                        }
                        kh0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.sn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.sn) U).i();
                                    if (i13 != null && i13.f20419id == pollVotesAlert$UserCell.h.f20419id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.sn) U).e;
                                    if (chat != null && chat.f20272id == pollVotesAlert$UserCell.f24269n.f20272id) {
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

    public static ViewGroup q(kh0 kh0Var) {
        return kh0Var.containerView;
    }

    public static ViewGroup r(kh0 kh0Var) {
        return kh0Var.containerView;
    }

    public static int s(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int t(kh0 kh0Var) {
        return kh0Var.backgroundPaddingLeft;
    }

    public static void v(kh0 kh0Var) {
        boolean z10;
        Integer num;
        float f7;
        z7 z7Var = kh0Var.f27877f;
        eh0 eh0Var = kh0Var.f27875b;
        if (eh0Var.getChildCount() <= 0) {
            int paddingTop = eh0Var.getPaddingTop();
            kh0Var.E = paddingTop;
            eh0Var.setTopGlowOffset(paddingTop);
            kh0Var.containerView.invalidate();
            return;
        }
        View childAt = eh0Var.getChildAt(0);
        sl0 sl0Var = (sl0) eh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || sl0Var == null || sl0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z7Var.setTag(num);
            AnimatorSet animatorSet = kh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                kh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            kh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = kh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, property, f7);
            View view = kh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            kh0Var.h.addListener(new c80(kh0Var, 9));
            kh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eh0Var.getLayoutParams();
        int D = org.telegram.messenger.lk.D(11.0f, layoutParams.topMargin, top);
        if (kh0Var.E != D) {
            kh0Var.E = D;
            eh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            kh0Var.containerView.invalidate();
        }
    }

    public static int w(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int x(kh0 kh0Var) {
        return kh0Var.currentSheetAnimationType;
    }

    public static int y(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public static int z(kh0 kh0Var) {
        return kh0Var.backgroundPaddingTop;
    }

    public final void P(View view) {
        eh0 eh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            eh0Var = this.f27875b;
            int i11 = 0;
            if (i10 >= eh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = eh0Var.getPinnedHeader();
            } else {
                childAt = eh0Var.getChildAt(i10);
            }
            if ((childAt instanceof ih0) && (childAt.getTag(R.id.object_tag) instanceof jh0)) {
                ih0 ih0Var = (ih0) childAt;
                jh0 jh0Var = (jh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f27879r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, jh0Var.d) && ((hh0) this.f27881w.get(jh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f27878n;
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
                            ih0Var.a(str2, arrayList, Q(jh0Var.d), jh0Var.f27526a, jh0Var.a(), true);
                            ih0Var.setTag(R.id.object_tag, jh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = eh0Var.f27287p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(eh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eh0Var.getMeasuredHeight(), 0));
            View view3 = eh0Var.f27287p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), eh0Var.f27287p1.getMeasuredHeight());
            eh0Var.invalidate();
        }
        eh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f27882x;
            if (i10 >= arrayList.size()) {
                break;
            }
            jh0 jh0Var = (jh0) arrayList.get(i10);
            if (jh0Var != null) {
                i11 += jh0Var.f27526a;
                if (Arrays.equals(jh0Var.d, bArr)) {
                    i12 += jh0Var.f27526a;
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
        HashMap hashMap2 = this.f27881w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f27878n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f27882x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            jh0 jh0Var = (jh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(jh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(jh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f26886a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.i4(19));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((hh0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21074i5, false);
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
        z6 z6Var = new z6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27877f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27877f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27877f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27877f, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27877f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27883y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, org.telegram.ui.ActionBar.h6.f21074i5));
        int i12 = org.telegram.ui.ActionBar.h6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 524288, new Class[]{ih0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 524288, new Class[]{ih0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 524288, new Class[]{ih0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 524304, new Class[]{ih0.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27875b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
