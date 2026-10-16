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
public final class qh0 extends org.telegram.ui.ActionBar.e3 {
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
    public final kh0 f28286b;
    public final mh0 f28287c;
    public final Drawable d;
    public final View e;
    public final b8 f28288f;
    public AnimatorSet h;
    public final MessageObject f28289n;
    public final TLRPC.Poll f28290r;
    public final TLRPC.InputPeer f28291s;
    public final HashSet v;
    public final HashMap f28292w;
    public final ArrayList f28293x;
    public final a6 f28294y;

    public qh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(1, context, c6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f28292w = new HashMap();
        this.f28293x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f28289n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f28290r = tL_messageMediaPoll.poll;
        this.f28291s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f28293x.add(new ph0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f28291s;
                tL_messages_getPollVotes.f19013id = this.f28289n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i12 = 15;
                } else {
                    i12 = 10;
                }
                tL_messages_getPollVotes.limit = i12;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new bi.ia(this, numArr, i14, arrayList, pollAnswerVoters, 5)));
                numArr[i14] = valueOf;
                this.F.add(valueOf);
            }
            i14++;
            i13 = i11;
        }
        S();
        Collections.sort(this.f28293x, new ih0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19689i5, false), PorterDuff.Mode.MULTIPLY));
        jh0 jh0Var = new jh0(this, context);
        this.containerView = jh0Var;
        jh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        kh0 kh0Var = new kh0(this, context);
        this.f28286b = kh0Var;
        kh0Var.setSections(false);
        s4.k kVar = new s4.k();
        kVar.f44917c = 150L;
        kVar.e = 350L;
        kVar.f44918f = 0L;
        kVar.f44919g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f44920i = new OvershootInterpolator(1.1f);
        kVar.f44901o = es.h;
        kh0Var.setItemAnimator(kVar);
        kh0Var.setClipToPadding(false);
        getContext();
        kh0Var.setLayoutManager(new hg.a0(i13, false, 9));
        kh0Var.setHorizontalScrollBarEnabled(false);
        kh0Var.setVerticalScrollBarEnabled(false);
        kh0Var.setSectionsType(2);
        this.containerView.addView(kh0Var, w7.z5.e(-1, -1, 51));
        mh0 mh0Var = new mh0(this, context);
        this.f28287c = mh0Var;
        kh0Var.setAdapter(mh0Var);
        kh0Var.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A5, false));
        kh0Var.setOnItemClickListener(new bi.z5(13, this, context));
        kh0Var.setOnScrollListener(new kc0(this, 1));
        a6 a6Var = new a6(context);
        this.f28294y = a6Var;
        a6Var.setTextSize(1, 18.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.g6.f19707j5;
        a6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
        a6Var.setTag(-33024);
        a6Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f28290r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f28289n;
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
        b8 b8Var = new b8(this, context, 2);
        this.f28288f = b8Var;
        b8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
        b8Var.setBackButtonImage(R.drawable.ic_ab_back);
        b8Var.D(org.telegram.ui.ActionBar.g6.x0(null, i19, false), false);
        b8Var.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        b8Var.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i19, false));
        b8Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        b8Var.setOccupyStatusBar(false);
        b8Var.setAlpha(0.0f);
        b8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f28290r.quiz) {
            b8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            b8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(b8Var, w7.z5.d(-2.0f, -1));
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 13));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, w7.z5.d(1.0f, -1));
    }

    public static int B(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int C(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static int D(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int E(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static int F(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int G(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static int H(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static int I(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int J(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(qh0 qh0Var) {
        return qh0Var.containerView;
    }

    public static boolean M(qh0 qh0Var) {
        return qh0Var.isFullscreen;
    }

    public static int N(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static int O(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static void n(qh0 qh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.b1 T;
        mh0 mh0Var = qh0Var.f28287c;
        ArrayList arrayList2 = qh0Var.f28293x;
        kh0 kh0Var = qh0Var.f28286b;
        ArrayList arrayList3 = qh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(qh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new ph0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    ph0 ph0Var = (ph0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            ph0 ph0Var2 = (ph0) arrayList2.get(i12);
                            if (Arrays.equals(ph0Var.d, ph0Var2.d)) {
                                ph0Var2.f28003c = ph0Var.f28003c;
                                z10 = (ph0Var2.f28001a == ph0Var.f28001a && ph0Var2.f28002b.size() == ph0Var.f28002b.size()) ? true : true;
                                ph0Var2.f28001a = ph0Var.f28001a;
                                ph0Var2.f28002b = ph0Var.f28002b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                qh0Var.L = false;
                if (kh0Var != null) {
                    if (qh0Var.currentSheetAnimationType == 0 && qh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = kh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = kh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = kh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = kh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    mh0Var.y(T);
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
                        qh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        qh0Var.S();
                    }
                    mh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        qh0Var.dismiss();
    }

    public static void o(qh0 qh0Var, ph0 ph0Var, TLObject tLObject) {
        if (qh0Var.isShowing()) {
            qh0Var.v.remove(ph0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(qh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                ph0Var.f28002b.addAll(tL_messages_votesList.votes);
                ph0Var.f28003c = tL_messages_votesList.next_offset;
                qh0Var.P(null);
                qh0Var.f28287c.X(true);
            }
        }
    }

    public static void q(qh0 qh0Var, Context context, View view, int i10) {
        HashSet hashSet = qh0Var.v;
        mh0 mh0Var = qh0Var.f28287c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = qh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = mh0Var.S(i10) - 1;
                    int Q = mh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        ph0 ph0Var = (ph0) qh0Var.f28293x.get(S);
                        if (Q == ph0Var.b() && !hashSet.contains(ph0Var)) {
                            if (ph0Var.e && ph0Var.f28004f < ph0Var.f28002b.size()) {
                                int min = Math.min(ph0Var.f28004f + 50, ph0Var.f28002b.size());
                                ph0Var.f28004f = min;
                                if (min == ph0Var.f28002b.size()) {
                                    ph0Var.e = false;
                                }
                                qh0Var.P(null);
                                mh0Var.X(true);
                                return;
                            }
                            hashSet.add(ph0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = qh0Var.f28291s;
                            tL_messages_getPollVotes.f19013id = qh0Var.f28289n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = ph0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = ph0Var.f28003c;
                            ConnectionsManager.getInstance(qh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.to(12, qh0Var, ph0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f22914n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f19063id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f22914n.f18916id);
                        }
                        qh0Var.dismiss();
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.fo) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.fo) U).i();
                                    if (i13 != null && i13.f19063id == pollVotesAlert$UserCell.h.f19063id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.fo) U).e;
                                    if (chat != null && chat.f18916id == pollVotesAlert$UserCell.f22914n.f18916id) {
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

    public static ViewGroup r(qh0 qh0Var) {
        return qh0Var.containerView;
    }

    public static ViewGroup s(qh0 qh0Var) {
        return qh0Var.containerView;
    }

    public static int t(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int u(qh0 qh0Var) {
        return qh0Var.backgroundPaddingLeft;
    }

    public static void v(qh0 qh0Var) {
        boolean z10;
        Integer num;
        float f7;
        b8 b8Var = qh0Var.f28288f;
        kh0 kh0Var = qh0Var.f28286b;
        if (kh0Var.getChildCount() <= 0) {
            int paddingTop = kh0Var.getPaddingTop();
            qh0Var.E = paddingTop;
            kh0Var.setTopGlowOffset(paddingTop);
            qh0Var.containerView.invalidate();
            return;
        }
        View childAt = kh0Var.getChildAt(0);
        wl0 wl0Var = (wl0) kh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && b8Var.getTag() == null) || (!z10 && b8Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            b8Var.setTag(num);
            AnimatorSet animatorSet = qh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                qh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            qh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = qh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, property, f7);
            View view = qh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            qh0Var.h.addListener(new k90(qh0Var, 7));
            qh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kh0Var.getLayoutParams();
        int D = org.telegram.messenger.sk.D(11.0f, layoutParams.topMargin, top);
        if (qh0Var.E != D) {
            qh0Var.E = D;
            kh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            qh0Var.containerView.invalidate();
        }
    }

    public static int w(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int x(qh0 qh0Var) {
        return qh0Var.currentSheetAnimationType;
    }

    public static int y(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public static int z(qh0 qh0Var) {
        return qh0Var.backgroundPaddingTop;
    }

    public final void P(View view) {
        kh0 kh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            kh0Var = this.f28286b;
            int i11 = 0;
            if (i10 >= kh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = kh0Var.getPinnedHeader();
            } else {
                childAt = kh0Var.getChildAt(i10);
            }
            if ((childAt instanceof oh0) && (childAt.getTag(R.id.object_tag) instanceof ph0)) {
                oh0 oh0Var = (oh0) childAt;
                ph0 ph0Var = (ph0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f28290r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, ph0Var.d) && ((nh0) this.f28292w.get(ph0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f28289n;
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
                            oh0Var.a(str2, arrayList, Q(ph0Var.d), ph0Var.f28001a, ph0Var.a(), true);
                            oh0Var.setTag(R.id.object_tag, ph0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = kh0Var.f27151p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(kh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(kh0Var.getMeasuredHeight(), 0));
            View view3 = kh0Var.f27151p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), kh0Var.f27151p1.getMeasuredHeight());
            kh0Var.invalidate();
        }
        kh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f28293x;
            if (i10 >= arrayList.size()) {
                break;
            }
            ph0 ph0Var = (ph0) arrayList.get(i10);
            if (ph0Var != null) {
                i11 += ph0Var.f28001a;
                if (Arrays.equals(ph0Var.d, bArr)) {
                    i12 += ph0Var.f28001a;
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
        HashMap hashMap2 = this.f28292w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f28289n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f28293x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            ph0 ph0Var = (ph0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(ph0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(ph0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f27358a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(16));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((nh0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19689i5, false);
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
        b7 b7Var = new b7(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.g6.f19672h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28288f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28288f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28288f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28288f, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28288f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28294y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{View.class}, null, null, null, -1, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{View.class}, null, null, null, -1, b7Var, org.telegram.ui.ActionBar.g6.f19689i5));
        int i12 = org.telegram.ui.ActionBar.g6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 524288, new Class[]{oh0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 524288, new Class[]{oh0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 524288, new Class[]{oh0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 524304, new Class[]{oh0.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f28286b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
