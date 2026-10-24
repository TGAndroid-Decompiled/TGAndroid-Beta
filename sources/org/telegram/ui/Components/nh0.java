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
public final class nh0 extends org.telegram.ui.ActionBar.h3 {
    public static final org.telegram.ui.Cells.t8 R = new org.telegram.ui.Cells.t8("placeholderAlpha", 9);
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
    public final hh0 f28910b;
    public final jh0 f28911c;
    public final Drawable d;
    public final View e;
    public final x7 f28912f;
    public AnimatorSet h;
    public final MessageObject f28913n;
    public final TLRPC.Poll f28914r;
    public final TLRPC.InputPeer f28915s;
    public final HashSet v;
    public final HashMap f28916w;
    public final ArrayList f28917x;
    public final x5 f28918y;

    public nh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f28916w = new HashMap();
        this.f28917x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f28913n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f28914r = tL_messageMediaPoll.poll;
        this.f28915s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f28917x.add(new mh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f28915s;
                tL_messages_getPollVotes.f20441id = this.f28913n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i12 = 15;
                } else {
                    i12 = 10;
                }
                tL_messages_getPollVotes.limit = i12;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.tb(this, numArr, i14, arrayList, pollAnswerVoters, 7)));
                numArr[i14] = valueOf;
                this.F.add(valueOf);
            }
            i14++;
            i13 = i11;
        }
        T();
        Collections.sort(this.f28917x, new fh0(this));
        U();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i5, false), PorterDuff.Mode.MULTIPLY));
        gh0 gh0Var = new gh0(this, context);
        this.containerView = gh0Var;
        gh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        hh0 hh0Var = new hh0(this, context);
        this.f28910b = hh0Var;
        hh0Var.setSections(false);
        s4.k kVar = new s4.k();
        kVar.f46421c = 150L;
        kVar.e = 350L;
        kVar.f46422f = 0L;
        kVar.f46423g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.f46424i = new OvershootInterpolator(1.1f);
        kVar.f46405o = zr.h;
        hh0Var.setItemAnimator(kVar);
        hh0Var.setClipToPadding(false);
        getContext();
        hh0Var.setLayoutManager(new hg.a0(i13, false, 9));
        hh0Var.setHorizontalScrollBarEnabled(false);
        hh0Var.setVerticalScrollBarEnabled(false);
        hh0Var.setSectionsType(2);
        this.containerView.addView(hh0Var, w7.z5.e(-1, -1, 51));
        jh0 jh0Var = new jh0(this, context);
        this.f28911c = jh0Var;
        hh0Var.setAdapter(jh0Var);
        org.telegram.ui.ActionBar.r6.m(hh0Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        hh0Var.setOnItemClickListener(new ci.x4(13, this, context));
        hh0Var.setOnScrollListener(new iv(this, 5));
        x5 x5Var = new x5(context);
        this.f28918y = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(x5Var, i19, null);
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f28914r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f28913n;
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
        this.f28912f = x7Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, x7Var, null);
        x7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r6.m(x7Var, 1, i19, null);
        org.telegram.ui.ActionBar.r6.m(x7Var, 3, org.telegram.ui.ActionBar.k6.I5, null);
        org.telegram.ui.ActionBar.r6.m(x7Var, 5, i19, null);
        org.telegram.ui.ActionBar.r6.m(x7Var, 6, org.telegram.ui.ActionBar.k6.Pi, null);
        x7Var.setOccupyStatusBar(false);
        x7Var.setAlpha(0.0f);
        x7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f28914r.quiz) {
            x7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            x7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(x7Var, w7.z5.c(-2.0f, -1));
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 14));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
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

    public static int E(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int F(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int G(nh0 nh0Var) {
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

    public static org.telegram.ui.ActionBar.g6 L(nh0 nh0Var) {
        return nh0Var.resourcesProvider;
    }

    public static boolean O(nh0 nh0Var) {
        return nh0Var.isFullscreen;
    }

    public static int P(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static void m(nh0 nh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.b1 T;
        jh0 jh0Var = nh0Var.f28911c;
        ArrayList arrayList2 = nh0Var.f28917x;
        hh0 hh0Var = nh0Var.f28910b;
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
                                mh0Var2.f28601c = mh0Var.f28601c;
                                z10 = (mh0Var2.f28599a == mh0Var.f28599a && mh0Var2.f28600b.size() == mh0Var.f28600b.size()) ? true : true;
                                mh0Var2.f28599a = mh0Var.f28599a;
                                mh0Var2.f28600b = mh0Var.f28600b;
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
                mh0Var.f28600b.addAll(tL_messages_votesList.votes);
                mh0Var.f28601c = tL_messages_votesList.next_offset;
                nh0Var.Q(null);
                nh0Var.f28911c.X(true);
            }
        }
    }

    public static void p(nh0 nh0Var, Context context, View view, int i10) {
        HashSet hashSet = nh0Var.v;
        jh0 jh0Var = nh0Var.f28911c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = nh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = jh0Var.S(i10) - 1;
                    int Q = jh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        mh0 mh0Var = (mh0) nh0Var.f28917x.get(S);
                        if (Q == mh0Var.b() && !hashSet.contains(mh0Var)) {
                            if (mh0Var.e && mh0Var.f28602f < mh0Var.f28600b.size()) {
                                int min = Math.min(mh0Var.f28602f + 50, mh0Var.f28600b.size());
                                mh0Var.f28602f = min;
                                if (min == mh0Var.f28600b.size()) {
                                    mh0Var.e = false;
                                }
                                nh0Var.Q(null);
                                jh0Var.X(true);
                                return;
                            }
                            hashSet.add(mh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = nh0Var.f28915s;
                            tL_messages_getPollVotes.f20441id = nh0Var.f28913n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = mh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = mh0Var.f28601c;
                            ConnectionsManager.getInstance(nh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.vc(19, nh0Var, mh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24418n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20491id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24418n.f20344id);
                        }
                        nh0Var.dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.sn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.sn) U).i();
                                    nh0Var.f28910b.getChildAt(0);
                                    if (i13 != null && i13.f20491id == pollVotesAlert$UserCell.h.f20491id) {
                                        i11 = 1;
                                    }
                                    profileActivity.Q4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.sn) U).e;
                                    if (chat != null && chat.f20344id == pollVotesAlert$UserCell.f24418n.f20344id) {
                                        i11 = 1;
                                    }
                                    profileActivity.Q4(i11);
                                }
                            }
                            U.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    public static ViewGroup q(nh0 nh0Var) {
        return nh0Var.containerView;
    }

    public static ViewGroup r(nh0 nh0Var) {
        return nh0Var.containerView;
    }

    public static int s(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static int t(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int u(nh0 nh0Var) {
        return nh0Var.backgroundPaddingLeft;
    }

    public static void v(nh0 nh0Var) {
        boolean z10;
        Integer num;
        float f7;
        x7 x7Var = nh0Var.f28912f;
        hh0 hh0Var = nh0Var.f28910b;
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
        if ((z10 && x7Var.getTag() == null) || (!z10 && x7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            x7Var.setTag(num);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, property, f7);
            View view = nh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            nh0Var.h.addListener(new g60(nh0Var, 10));
            nh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hh0Var.getLayoutParams();
        int D = org.telegram.messenger.tl.D(11.0f, layoutParams.topMargin, top);
        if (nh0Var.E != D) {
            nh0Var.E = D;
            hh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            nh0Var.containerView.invalidate();
        }
    }

    public static int w(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int x(nh0 nh0Var) {
        return nh0Var.currentSheetAnimationType;
    }

    public static int y(nh0 nh0Var) {
        return nh0Var.backgroundPaddingTop;
    }

    public static int z(nh0 nh0Var) {
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
            hh0Var = this.f28910b;
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
                TLRPC.Poll poll = this.f28914r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, mh0Var.d) && ((kh0) this.f28916w.get(mh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f28913n;
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
                            lh0Var.a(str2, arrayList, R(mh0Var.d), mh0Var.f28599a, mh0Var.a(), true);
                            lh0Var.setTag(R.id.object_tag, mh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = hh0Var.f28399p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(hh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(hh0Var.getMeasuredHeight(), 0));
            View view3 = hh0Var.f28399p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), hh0Var.f28399p1.getMeasuredHeight());
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
            ArrayList arrayList = this.f28917x;
            if (i10 >= arrayList.size()) {
                break;
            }
            mh0 mh0Var = (mh0) arrayList.get(i10);
            if (mh0Var != null) {
                i11 += mh0Var.f28599a;
                if (Arrays.equals(mh0Var.d, bArr)) {
                    i12 += mh0Var.f28599a;
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
        HashMap hashMap2 = this.f28916w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f28913n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f28917x;
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
                        obj.f28019a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(19));
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i5, false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
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
        x6 x6Var = new x6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.k6.f21255h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28912f, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21290j5));
        hh0 hh0Var = this.f28910b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(hh0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(hh0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.f21272i5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(hh0Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(hh0Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i5, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
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
