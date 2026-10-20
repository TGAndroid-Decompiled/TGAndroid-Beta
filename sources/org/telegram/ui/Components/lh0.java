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
public final class lh0 extends org.telegram.ui.ActionBar.f3 {
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
    public final fh0 f28163b;
    public final hh0 f28164c;
    public final Drawable d;
    public final View e;
    public final z7 f28165f;
    public AnimatorSet h;
    public final MessageObject f28166n;
    public final TLRPC.Poll f28167r;
    public final TLRPC.InputPeer f28168s;
    public final HashSet v;
    public final HashMap f28169w;
    public final ArrayList f28170x;
    public final z5 f28171y;

    public lh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f28169w = new HashMap();
        this.f28170x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f28166n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f28167r = tL_messageMediaPoll.poll;
        this.f28168s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f28170x.add(new kh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f28168s;
                tL_messages_getPollVotes.f20373id = this.f28166n.getId();
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
        Collections.sort(this.f28170x, new dh0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i5, false), PorterDuff.Mode.MULTIPLY));
        eh0 eh0Var = new eh0(this, context);
        this.containerView = eh0Var;
        eh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        fh0 fh0Var = new fh0(this, context);
        this.f28163b = fh0Var;
        fh0Var.setSections(false);
        s4.k kVar = new s4.k();
        kVar.f45996c = 150L;
        kVar.e = 350L;
        kVar.f45997f = 0L;
        kVar.f45998g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f45999i = new OvershootInterpolator(1.1f);
        kVar.f45980o = bs.h;
        fh0Var.setItemAnimator(kVar);
        fh0Var.setClipToPadding(false);
        getContext();
        fh0Var.setLayoutManager(new hg.a0(i13, false, 9));
        fh0Var.setHorizontalScrollBarEnabled(false);
        fh0Var.setVerticalScrollBarEnabled(false);
        fh0Var.setSectionsType(2);
        this.containerView.addView(fh0Var, w7.z5.e(-1, -1, 51));
        hh0 hh0Var = new hh0(this, context);
        this.f28164c = hh0Var;
        fh0Var.setAdapter(hh0Var);
        fh0Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        fh0Var.setOnItemClickListener(new ci.y4(13, this, context));
        fh0Var.setOnScrollListener(new kv(this, 5));
        z5 z5Var = new z5(context);
        this.f28171y = z5Var;
        z5Var.setTextSize(1, 18.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.h6.f21096j5;
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        z5Var.setTag(-33024);
        z5Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f28167r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f28166n;
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
        this.f28165f = z7Var;
        z7Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        z7Var.C(org.telegram.ui.ActionBar.h6.x0(null, i19, false), false);
        z7Var.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        z7Var.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
        z7Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pi, false));
        z7Var.setOccupyStatusBar(false);
        z7Var.setAlpha(0.0f);
        z7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f28167r.quiz) {
            z7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            z7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(z7Var, w7.z5.c(-2.0f, -1));
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 14));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
    }

    public static int A(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int B(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static int C(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int D(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static int E(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int F(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static int G(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static int I(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int J(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(lh0 lh0Var) {
        return lh0Var.containerView;
    }

    public static boolean M(lh0 lh0Var) {
        return lh0Var.isFullscreen;
    }

    public static int N(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static int O(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static void n(lh0 lh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.b1 T;
        hh0 hh0Var = lh0Var.f28164c;
        ArrayList arrayList2 = lh0Var.f28170x;
        fh0 fh0Var = lh0Var.f28163b;
        ArrayList arrayList3 = lh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(lh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new kh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    kh0 kh0Var = (kh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            kh0 kh0Var2 = (kh0) arrayList2.get(i12);
                            if (Arrays.equals(kh0Var.d, kh0Var2.d)) {
                                kh0Var2.f27879c = kh0Var.f27879c;
                                z10 = (kh0Var2.f27877a == kh0Var.f27877a && kh0Var2.f27878b.size() == kh0Var.f27878b.size()) ? true : true;
                                kh0Var2.f27877a = kh0Var.f27877a;
                                kh0Var2.f27878b = kh0Var.f27878b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                lh0Var.L = false;
                if (fh0Var != null) {
                    if (lh0Var.currentSheetAnimationType == 0 && lh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = fh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = fh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = fh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = fh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    hh0Var.y(T);
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
                        lh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        lh0Var.S();
                    }
                    hh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        lh0Var.dismiss();
    }

    public static void o(lh0 lh0Var, kh0 kh0Var, TLObject tLObject) {
        if (lh0Var.isShowing()) {
            lh0Var.v.remove(kh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(lh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                kh0Var.f27878b.addAll(tL_messages_votesList.votes);
                kh0Var.f27879c = tL_messages_votesList.next_offset;
                lh0Var.P(null);
                lh0Var.f28164c.X(true);
            }
        }
    }

    public static void p(lh0 lh0Var, Context context, View view, int i10) {
        HashSet hashSet = lh0Var.v;
        hh0 hh0Var = lh0Var.f28164c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = lh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.q8) {
                    int S = hh0Var.S(i10) - 1;
                    int Q = hh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        kh0 kh0Var = (kh0) lh0Var.f28170x.get(S);
                        if (Q == kh0Var.b() && !hashSet.contains(kh0Var)) {
                            if (kh0Var.e && kh0Var.f27880f < kh0Var.f27878b.size()) {
                                int min = Math.min(kh0Var.f27880f + 50, kh0Var.f27878b.size());
                                kh0Var.f27880f = min;
                                if (min == kh0Var.f27878b.size()) {
                                    kh0Var.e = false;
                                }
                                lh0Var.P(null);
                                hh0Var.X(true);
                                return;
                            }
                            hashSet.add(kh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = lh0Var.f28168s;
                            tL_messages_getPollVotes.f20373id = lh0Var.f28166n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = kh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = kh0Var.f27879c;
                            ConnectionsManager.getInstance(lh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.vc(19, lh0Var, kh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24273n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20423id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24273n.f20276id);
                        }
                        lh0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.qn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.qn) U).i();
                                    if (i13 != null && i13.f20423id == pollVotesAlert$UserCell.h.f20423id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.qn) U).e;
                                    if (chat != null && chat.f20276id == pollVotesAlert$UserCell.f24273n.f20276id) {
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

    public static ViewGroup q(lh0 lh0Var) {
        return lh0Var.containerView;
    }

    public static ViewGroup s(lh0 lh0Var) {
        return lh0Var.containerView;
    }

    public static int t(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int u(lh0 lh0Var) {
        return lh0Var.backgroundPaddingLeft;
    }

    public static void v(lh0 lh0Var) {
        boolean z10;
        Integer num;
        float f7;
        z7 z7Var = lh0Var.f28165f;
        fh0 fh0Var = lh0Var.f28163b;
        if (fh0Var.getChildCount() <= 0) {
            int paddingTop = fh0Var.getPaddingTop();
            lh0Var.E = paddingTop;
            fh0Var.setTopGlowOffset(paddingTop);
            lh0Var.containerView.invalidate();
            return;
        }
        View childAt = fh0Var.getChildAt(0);
        tl0 tl0Var = (tl0) fh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || tl0Var == null || tl0Var.b() != 0) {
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
            AnimatorSet animatorSet = lh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                lh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            lh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = lh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, property, f7);
            View view = lh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            lh0Var.h.addListener(new c80(lh0Var, 9));
            lh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fh0Var.getLayoutParams();
        int D = org.telegram.messenger.mk.D(11.0f, layoutParams.topMargin, top);
        if (lh0Var.E != D) {
            lh0Var.E = D;
            fh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            lh0Var.containerView.invalidate();
        }
    }

    public static int w(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int x(lh0 lh0Var) {
        return lh0Var.currentSheetAnimationType;
    }

    public static int y(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public static int z(lh0 lh0Var) {
        return lh0Var.backgroundPaddingTop;
    }

    public final void P(View view) {
        fh0 fh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            fh0Var = this.f28163b;
            int i11 = 0;
            if (i10 >= fh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = fh0Var.getPinnedHeader();
            } else {
                childAt = fh0Var.getChildAt(i10);
            }
            if ((childAt instanceof jh0) && (childAt.getTag(R.id.object_tag) instanceof kh0)) {
                jh0 jh0Var = (jh0) childAt;
                kh0 kh0Var = (kh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f28167r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, kh0Var.d) && ((ih0) this.f28169w.get(kh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f28166n;
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
                            jh0Var.a(str2, arrayList, Q(kh0Var.d), kh0Var.f27877a, kh0Var.a(), true);
                            jh0Var.setTag(R.id.object_tag, kh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = fh0Var.f27582p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(fh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fh0Var.getMeasuredHeight(), 0));
            View view3 = fh0Var.f27582p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), fh0Var.f27582p1.getMeasuredHeight());
            fh0Var.invalidate();
        }
        fh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f28170x;
            if (i10 >= arrayList.size()) {
                break;
            }
            kh0 kh0Var = (kh0) arrayList.get(i10);
            if (kh0Var != null) {
                i11 += kh0Var.f27877a;
                if (Arrays.equals(kh0Var.d, bArr)) {
                    i12 += kh0Var.f27877a;
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
        HashMap hashMap2 = this.f28169w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f28166n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f28170x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            kh0 kh0Var = (kh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(kh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(kh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f27277a = f7 - i15;
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
                ((ih0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i5, false);
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
        int i10 = org.telegram.ui.ActionBar.h6.f21061h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28165f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.A5));
        int i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28165f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28165f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28165f, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28165f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28171y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, org.telegram.ui.ActionBar.h6.f21078i5));
        int i12 = org.telegram.ui.ActionBar.h6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 524288, new Class[]{jh0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 524288, new Class[]{jh0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 524288, new Class[]{jh0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 524304, new Class[]{jh0.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f28163b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
