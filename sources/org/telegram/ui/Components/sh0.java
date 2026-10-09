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
public final class sh0 extends org.telegram.ui.ActionBar.f3 {
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
    public final lh0 f30796b;
    public final oh0 f30797c;
    public final Drawable d;
    public final View f30798e;
    public final a8 f30799f;
    public AnimatorSet h;
    public final MessageObject f30800n;
    public final TLRPC.Poll f30801r;
    public final TLRPC.InputPeer f30802s;
    public final HashSet v;
    public final HashMap f30803w;
    public final ArrayList f30804x;
    public final a6 f30805y;

    public sh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f30803w = new HashMap();
        this.f30804x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f30800n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f30801r = tL_messageMediaPoll.poll;
        this.f30802s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f30804x.add(new rh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f30802s;
                tL_messages_getPollVotes.f20135id = this.f30800n.getId();
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
        Collections.sort(this.f30804x, new jh0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20887i5, false), PorterDuff.Mode.MULTIPLY));
        kh0 kh0Var = new kh0(this, context);
        this.containerView = kh0Var;
        kh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        lh0 lh0Var = new lh0(this, context);
        this.f30796b = lh0Var;
        lh0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f47750c = 150L;
        jVar.f47751e = 350L;
        jVar.f47752f = 0L;
        jVar.f47753g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f47754i = new OvershootInterpolator(1.1f);
        jVar.f47718o = hs.h;
        lh0Var.setItemAnimator(jVar);
        lh0Var.setClipToPadding(false);
        getContext();
        lh0Var.setLayoutManager(new gg.a0(i13, false, 9));
        lh0Var.setHorizontalScrollBarEnabled(false);
        lh0Var.setVerticalScrollBarEnabled(false);
        lh0Var.setSectionsType(2);
        this.containerView.addView(lh0Var, w7.x5.e(-1, -1, 51));
        oh0 oh0Var = new oh0(this, context);
        this.f30797c = oh0Var;
        lh0Var.setAdapter(oh0Var);
        lh0Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        lh0Var.setOnItemClickListener(new ai.o6(13, this, context));
        lh0Var.setOnScrollListener(new mh0(this, 0));
        a6 a6Var = new a6(context);
        this.f30805y = a6Var;
        a6Var.setTextSize(1, 18.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.i6.f20905j5;
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i19, false));
        a6Var.setTag(-33024);
        a6Var.setLayoutParams(new s4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f30801r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f30800n;
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
        this.f30799f = a8Var;
        a8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
        a8Var.setBackButtonImage(R.drawable.ic_ab_back);
        a8Var.D(org.telegram.ui.ActionBar.i6.x0(null, i19, false), false);
        a8Var.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
        a8Var.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, i19, false));
        a8Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Pi, false));
        a8Var.setOccupyStatusBar(false);
        a8Var.setAlpha(0.0f);
        a8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f30801r.quiz) {
            a8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            a8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(a8Var, w7.x5.d(-2.0f, -1));
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 11));
        View view = new View(context);
        this.f30798e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V5, false));
        this.containerView.addView(view, w7.x5.d(1.0f, -1));
    }

    public static int B(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int C(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static int D(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int E(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static int F(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int G(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static int H(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static int I(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int J(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(sh0 sh0Var) {
        return sh0Var.containerView;
    }

    public static boolean M(sh0 sh0Var) {
        return sh0Var.isFullscreen;
    }

    public static int N(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static int O(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static void o(sh0 sh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.d1 T;
        oh0 oh0Var = sh0Var.f30797c;
        ArrayList arrayList2 = sh0Var.f30804x;
        lh0 lh0Var = sh0Var.f30796b;
        ArrayList arrayList3 = sh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(sh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new rh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    rh0 rh0Var = (rh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            rh0 rh0Var2 = (rh0) arrayList2.get(i12);
                            if (Arrays.equals(rh0Var.d, rh0Var2.d)) {
                                rh0Var2.f30446c = rh0Var.f30446c;
                                z10 = (rh0Var2.f30444a == rh0Var.f30444a && rh0Var2.f30445b.size() == rh0Var.f30445b.size()) ? true : true;
                                rh0Var2.f30444a = rh0Var.f30444a;
                                rh0Var2.f30445b = rh0Var.f30445b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                sh0Var.L = false;
                if (lh0Var != null) {
                    if (sh0Var.currentSheetAnimationType == 0 && sh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = lh0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = lh0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = lh0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = lh0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    oh0Var.y(T);
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
                        sh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        sh0Var.S();
                    }
                    oh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        sh0Var.dismiss();
    }

    public static void p(sh0 sh0Var, rh0 rh0Var, TLObject tLObject) {
        if (sh0Var.isShowing()) {
            sh0Var.v.remove(rh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(sh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                rh0Var.f30445b.addAll(tL_messages_votesList.votes);
                rh0Var.f30446c = tL_messages_votesList.next_offset;
                sh0Var.P(null);
                sh0Var.f30797c.X(true);
            }
        }
    }

    public static void q(sh0 sh0Var, Context context, View view, int i10) {
        HashSet hashSet = sh0Var.v;
        oh0 oh0Var = sh0Var.f30797c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = sh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = oh0Var.S(i10) - 1;
                    int Q = oh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        rh0 rh0Var = (rh0) sh0Var.f30804x.get(S);
                        if (Q == rh0Var.b() && !hashSet.contains(rh0Var)) {
                            if (rh0Var.f30447e && rh0Var.f30448f < rh0Var.f30445b.size()) {
                                int min = Math.min(rh0Var.f30448f + 50, rh0Var.f30445b.size());
                                rh0Var.f30448f = min;
                                if (min == rh0Var.f30445b.size()) {
                                    rh0Var.f30447e = false;
                                }
                                sh0Var.P(null);
                                oh0Var.X(true);
                                return;
                            }
                            hashSet.add(rh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = sh0Var.f30802s;
                            tL_messages_getPollVotes.f20135id = sh0Var.f30800n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = rh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = rh0Var.f30446c;
                            ConnectionsManager.getInstance(sh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.oo(12, sh0Var, rh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24228n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20185id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24228n.f20038id);
                        }
                        sh0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.zn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                                    if (i13 != null && i13.f20185id == pollVotesAlert$UserCell.h.f20185id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.zn) U).f44753e;
                                    if (chat != null && chat.f20038id == pollVotesAlert$UserCell.f24228n.f20038id) {
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

    public static ViewGroup r(sh0 sh0Var) {
        return sh0Var.containerView;
    }

    public static ViewGroup s(sh0 sh0Var) {
        return sh0Var.containerView;
    }

    public static int t(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int u(sh0 sh0Var) {
        return sh0Var.backgroundPaddingLeft;
    }

    public static void v(sh0 sh0Var) {
        boolean z10;
        Integer num;
        float f7;
        a8 a8Var = sh0Var.f30799f;
        lh0 lh0Var = sh0Var.f30796b;
        if (lh0Var.getChildCount() <= 0) {
            int paddingTop = lh0Var.getPaddingTop();
            sh0Var.E = paddingTop;
            lh0Var.setTopGlowOffset(paddingTop);
            sh0Var.containerView.invalidate();
            return;
        }
        View childAt = lh0Var.getChildAt(0);
        am0 am0Var = (am0) lh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
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
            AnimatorSet animatorSet = sh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                sh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            sh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = sh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a8Var, property, f7);
            View view = sh0Var.f30798e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            sh0Var.h.addListener(new vd0(sh0Var, 4));
            sh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lh0Var.getLayoutParams();
        int D = org.telegram.messenger.bi.D(11.0f, layoutParams.topMargin, top);
        if (sh0Var.E != D) {
            sh0Var.E = D;
            lh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            sh0Var.containerView.invalidate();
        }
    }

    public static int w(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int x(sh0 sh0Var) {
        return sh0Var.currentSheetAnimationType;
    }

    public static int y(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public static int z(sh0 sh0Var) {
        return sh0Var.backgroundPaddingTop;
    }

    public final void P(View view) {
        lh0 lh0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            lh0Var = this.f30796b;
            int i11 = 0;
            if (i10 >= lh0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = lh0Var.getPinnedHeader();
            } else {
                childAt = lh0Var.getChildAt(i10);
            }
            if ((childAt instanceof qh0) && (childAt.getTag(R.id.object_tag) instanceof rh0)) {
                qh0 qh0Var = (qh0) childAt;
                rh0 rh0Var = (rh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f30801r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, rh0Var.d) && ((ph0) this.f30803w.get(rh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f30800n;
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
                            qh0Var.a(str2, arrayList, Q(rh0Var.d), rh0Var.f30444a, rh0Var.a(), true);
                            qh0Var.setTag(R.id.object_tag, rh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = lh0Var.f30219p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(lh0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(lh0Var.getMeasuredHeight(), 0));
            View view3 = lh0Var.f30219p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), lh0Var.f30219p1.getMeasuredHeight());
            lh0Var.invalidate();
        }
        lh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f30804x;
            if (i10 >= arrayList.size()) {
                break;
            }
            rh0 rh0Var = (rh0) arrayList.get(i10);
            if (rh0Var != null) {
                i11 += rh0Var.f30444a;
                if (Arrays.equals(rh0Var.d, bArr)) {
                    i12 += rh0Var.f30444a;
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
        HashMap hashMap2 = this.f30803w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f30800n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30804x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            rh0 rh0Var = (rh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(rh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(rh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f29865a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.gf(12));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((ph0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20887i5, false);
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.i6.f20868h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30799f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        int i11 = org.telegram.ui.ActionBar.i6.f20905j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30799f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30799f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30799f, 1024, null, null, null, null, org.telegram.ui.ActionBar.i6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30799f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30805y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30798e, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, org.telegram.ui.ActionBar.i6.f20887i5));
        int i12 = org.telegram.ui.ActionBar.i6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 524288, new Class[]{qh0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 524288, new Class[]{qh0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 524288, new Class[]{qh0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 524304, new Class[]{qh0.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        int i13 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f30796b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
