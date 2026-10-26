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
import org.telegram.messenger.FileLog;
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
public final class nh0 extends org.telegram.ui.ActionBar.k3 {
    public static final org.telegram.ui.Cells.x8 R = new org.telegram.ui.Cells.x8("placeholderAlpha", 9);
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
    public boolean O;
    public int P;
    public int Q;
    public final hh0 f30975b;
    public final jh0 f30976c;
    public final Drawable d;
    public final View e;
    public final b8 f30977f;
    public AnimatorSet h;
    public final MessageObject f30978n;
    public final TLRPC.Poll f30979r;
    public final TLRPC.InputPeer f30980s;
    public final HashSet v;
    public final HashMap f30981w;
    public final ArrayList f30982x;
    public final b6 f30983y;

    public nh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f30981w = new HashMap();
        this.f30982x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f30978n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f30979r = tL_messageMediaPoll.poll;
        this.f30980s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f30982x.add(new mh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f30980s;
                tL_messages_getPollVotes.f22126id = this.f30978n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i12 = 15;
                } else {
                    i12 = 10;
                }
                tL_messages_getPollVotes.limit = i12;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ag.p0(this, numArr, i14, arrayList, pollAnswerVoters, 8)));
                numArr[i14] = valueOf;
                this.F.add(valueOf);
            }
            i14++;
            i13 = i11;
        }
        T();
        Collections.sort(this.f30982x, new fh0(this));
        U();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23447i5, false), PorterDuff.Mode.MULTIPLY));
        gh0 gh0Var = new gh0(this, context);
        this.containerView = gh0Var;
        gh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        hh0 hh0Var = new hh0(this, context);
        this.f30975b = hh0Var;
        hh0Var.setSections(false);
        s4.l lVar = new s4.l();
        lVar.f47803c = 150L;
        lVar.e = 350L;
        lVar.f47804f = 0L;
        lVar.f47805g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f47806i = new OvershootInterpolator(1.1f);
        lVar.f47787o = ds.h;
        hh0Var.setItemAnimator(lVar);
        hh0Var.setClipToPadding(false);
        getContext();
        hh0Var.setLayoutManager(new ig.a0(i13, false, 9));
        hh0Var.setHorizontalScrollBarEnabled(false);
        hh0Var.setVerticalScrollBarEnabled(false);
        hh0Var.setSectionsType(2);
        this.containerView.addView(hh0Var, gb1.i(-1, -1, 51));
        jh0 jh0Var = new jh0(this, context);
        this.f30976c = jh0Var;
        hh0Var.setAdapter(jh0Var);
        org.telegram.ui.ActionBar.f7.m(hh0Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        hh0Var.setOnItemClickListener(new di.x4(13, this, context));
        hh0Var.setOnScrollListener(new ml(this, 9));
        b6 b6Var = new b6(context);
        this.f30983y = b6Var;
        b6Var.setTextSize(1, 18.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.y6.f23464j5;
        org.telegram.ui.ActionBar.f7.V(b6Var, i19, null);
        b6Var.setTag(-33024);
        b6Var.setLayoutParams(new s4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f30979r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f30978n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(b6Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, b6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, b6Var.getPaint().getFontMetricsInt());
            b6Var.setText(replaceEmoji);
        }
        b8 b8Var = new b8(this, context, 2);
        this.f30977f = b8Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23427h5, b8Var, null);
        b8Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i19, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.I5, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i19, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 6, org.telegram.ui.ActionBar.y6.Pi, null);
        b8Var.setOccupyStatusBar(false);
        b8Var.setAlpha(0.0f);
        b8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f30979r.quiz) {
            b8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            b8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(b8Var, gb1.g(-2.0f, -1));
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 15));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        this.containerView.addView(view, gb1.g(1.0f, -1));
    }

    public static int A(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int B(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int C(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int D(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int F(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int G(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int H(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int I(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int J(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(nh0 nh0Var) {
        return nh0Var.containerView;
    }

    public static org.telegram.ui.ActionBar.u6 L(nh0 nh0Var) {
        return nh0Var.resourcesProvider;
    }

    public static boolean O(nh0 nh0Var) {
        return nh0Var.isFullscreen;
    }

    public static int P(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static void m(nh0 nh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.e1 T;
        jh0 jh0Var = nh0Var.f30976c;
        ArrayList arrayList2 = nh0Var.f30982x;
        hh0 hh0Var = nh0Var.f30975b;
        ArrayList arrayList3 = nh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(nh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new mh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    mh0 mh0Var = (mh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            mh0 mh0Var2 = (mh0) arrayList2.get(i12);
                            if (Arrays.equals(mh0Var.d, mh0Var2.d)) {
                                mh0Var2.f30588c = mh0Var.f30588c;
                                z10 = (mh0Var2.f30586a == mh0Var.f30586a && mh0Var2.f30587b.size() == mh0Var.f30587b.size()) ? true : true;
                                mh0Var2.f30586a = mh0Var.f30586a;
                                mh0Var2.f30587b = mh0Var.f30587b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                nh0Var.L = false;
                if (hh0Var != null) {
                    if (nh0Var.currentSheetAnimationType == 0 && nh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = hh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = hh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = hh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = hh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    jh0Var.y(T);
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
                        nh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        nh0Var.T();
                    }
                    jh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        nh0Var.dismiss();
    }

    public static void n(nh0 nh0Var, mh0 mh0Var, TLObject tLObject) {
        if (nh0Var.isShowing()) {
            nh0Var.v.remove(mh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(nh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                mh0Var.f30587b.addAll(tL_messages_votesList.votes);
                mh0Var.f30588c = tL_messages_votesList.next_offset;
                nh0Var.Q(null);
                nh0Var.f30976c.X(true);
            }
        }
    }

    public static void o(nh0 nh0Var, Context context, View view, int i10) {
        HashSet hashSet = nh0Var.v;
        jh0 jh0Var = nh0Var.f30976c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = nh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    int S = jh0Var.S(i10) - 1;
                    int Q = jh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        mh0 mh0Var = (mh0) nh0Var.f30982x.get(S);
                        if (Q == mh0Var.b() && !hashSet.contains(mh0Var)) {
                            if (mh0Var.e && mh0Var.f30589f < mh0Var.f30587b.size()) {
                                int min = Math.min(mh0Var.f30589f + 50, mh0Var.f30587b.size());
                                mh0Var.f30589f = min;
                                if (min == mh0Var.f30587b.size()) {
                                    mh0Var.e = false;
                                }
                                nh0Var.Q(null);
                                jh0Var.X(true);
                                return;
                            }
                            hashSet.add(mh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = nh0Var.f30980s;
                            tL_messages_getPollVotes.f22126id = nh0Var.f30978n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = mh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = mh0Var.f30588c;
                            ConnectionsManager.getInstance(nh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.z7(20, nh0Var, mh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f26210n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f22176id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f26210n.f22027id);
                        }
                        nh0Var.dismiss();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.un) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.un) U).i();
                                    nh0Var.f30975b.getChildAt(0);
                                    if (i13 != null && i13.f22176id == pollVotesAlert$UserCell.h.f22176id) {
                                        i11 = 1;
                                    }
                                    profileActivity.X4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.un) U).e;
                                    if (chat != null && chat.f22027id == pollVotesAlert$UserCell.f26210n.f22027id) {
                                        i11 = 1;
                                    }
                                    profileActivity.X4(i11);
                                }
                            }
                            U.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    public static ViewGroup p(nh0 nh0Var) {
        return nh0Var.containerView;
    }

    public static ViewGroup q(nh0 nh0Var) {
        return nh0Var.containerView;
    }

    public static int r(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int s(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int t(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static void u(nh0 nh0Var) {
        boolean z10;
        Integer num;
        float f7;
        b8 b8Var = nh0Var.f30977f;
        hh0 hh0Var = nh0Var.f30975b;
        if (hh0Var.getChildCount() <= 0) {
            int paddingTop = hh0Var.getPaddingTop();
            nh0Var.E = paddingTop;
            hh0Var.setTopGlowOffset(paddingTop);
            nh0Var.containerView.invalidate();
            return;
        }
        View childAt = hh0Var.getChildAt(0);
        vl0 vl0Var = (vl0) hh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
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
            AnimatorSet animatorSet = nh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                nh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            nh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = nh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, property, f7);
            View view = nh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            nh0Var.h.addListener(new i10(nh0Var, 11));
            nh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hh0Var.getLayoutParams();
        int w10 = org.telegram.ui.d3.w(11.0f, layoutParams.topMargin, top);
        if (nh0Var.E != w10) {
            nh0Var.E = w10;
            hh0Var.setTopGlowOffset(w10 - layoutParams.topMargin);
            nh0Var.containerView.invalidate();
        }
    }

    public static int v(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int w(nh0 nh0Var) {
        return nh0Var.currentSheetAnimationType;
    }

    public static int x(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int y(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public final void Q(View view) {
        hh0 hh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            hh0Var = this.f30975b;
            int i11 = 0;
            if (i10 >= hh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = hh0Var.getPinnedHeader();
            } else {
                childAt = hh0Var.getChildAt(i10);
            }
            if ((childAt instanceof lh0) && (childAt.getTag(R.id.object_tag) instanceof mh0)) {
                lh0 lh0Var = (lh0) childAt;
                mh0 mh0Var = (mh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f30979r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) this.f30981w.get(mh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f30978n;
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
                            lh0Var.a(str2, arrayList, R(mh0Var.d), mh0Var.f30586a, mh0Var.a(), true);
                            lh0Var.setTag(R.id.object_tag, mh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = hh0Var.f30649p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(hh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hh0Var.getMeasuredHeight(), 0));
            View view3 = hh0Var.f30649p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), hh0Var.f30649p1.getMeasuredHeight());
            hh0Var.invalidate();
        }
        hh0Var.invalidate();
    }

    public final int R(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f30982x;
            if (i10 >= arrayList.size()) {
                break;
            }
            mh0 mh0Var = (mh0) arrayList.get(i10);
            if (mh0Var != null) {
                i11 += mh0Var.f30586a;
                if (Arrays.equals(mh0Var.d, bArr)) {
                    i12 += mh0Var.f30586a;
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

    public final MessagesController S() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void T() {
        HashMap hashMap;
        HashMap hashMap2 = this.f30981w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f30978n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30982x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            mh0 mh0Var = (mh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(mh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(mh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f29923a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.n4(19));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((kh0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void U() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23447i5, false);
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
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23376e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
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
        b7 b7Var = new b7(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.y6.f23427h5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f30977f, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23464j5));
        hh0 hh0Var = this.f30975b;
        arrayList.add(new org.telegram.ui.ActionBar.h7(hh0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(hh0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.f23447i5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(hh0Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23597q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(hh0Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23447i5, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h5, false);
            if (this.O && x02 == this.P && x03 == this.Q) {
                return;
            }
            this.O = true;
            this.P = x02;
            this.Q = x03;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            U();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
