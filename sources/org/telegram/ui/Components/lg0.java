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
public final class lg0 extends org.telegram.ui.ActionBar.f3 {
    public static final fh.g K = new fh.g("placeholderAlpha", 11);
    public int A;
    public final ArrayList B;
    public final Paint C;
    public LinearGradient D;
    public Matrix E;
    public float F;
    public float G;
    public boolean H;
    public final RectF I;
    public final TLRPC.TL_messageMediaPoll J;
    public final fg0 f30315b;
    public final hg0 f30316c;
    public final Drawable d;
    public final View f30317e;
    public final cg.m1 f30318f;
    public AnimatorSet h;
    public final MessageObject f30319n;
    public final TLRPC.Poll f30320r;
    public final TLRPC.InputPeer f30321s;
    public final HashSet v;
    public final HashMap f30322w;
    public final ArrayList f30323x;
    public final x5 f30324y;

    public lg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f30322w = new HashMap();
        this.f30323x = new ArrayList();
        this.B = new ArrayList();
        this.C = new Paint(1);
        this.H = true;
        this.I = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f30319n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.J = tL_messageMediaPoll;
        this.f30320r = tL_messageMediaPoll.poll;
        this.f30321s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f30323x.add(new kg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f30321s;
                tL_messages_getPollVotes.f22489id = this.f30319n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new jf.i0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.B.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f30323x, new eg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23151i5, false), PorterDuff.Mode.MULTIPLY));
        cg.y yVar = new cg.y(this, context);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        fg0 fg0Var = new fg0(this, context);
        this.f30315b = fg0Var;
        fg0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.f6486c = 150L;
        lVar.f6487e = 350L;
        lVar.f6488f = 0L;
        lVar.f6489g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f6490i = new OvershootInterpolator(1.1f);
        lVar.f6404o = jr.h;
        fg0Var.setItemAnimator(lVar);
        fg0Var.setClipToPadding(false);
        getContext();
        fg0Var.setLayoutManager(new org.telegram.ui.k(1, false, 7));
        fg0Var.setHorizontalScrollBarEnabled(false);
        fg0Var.setVerticalScrollBarEnabled(false);
        fg0Var.setSectionsType(2);
        this.containerView.addView(fg0Var, i7.f6.e(-1, -1, 51));
        hg0 hg0Var = new hg0(this, context);
        this.f30316c = hg0Var;
        fg0Var.setAdapter(hg0Var);
        fg0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        fg0Var.setOnItemClickListener(new eg.w0(14, this, context));
        fg0Var.setOnScrollListener(new h00(this, 3));
        x5 x5Var = new x5(context);
        this.f30324y = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.g6.f23169j5;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new f2.x0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f30320r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f30319n;
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
        cg.m1 m1Var = new cg.m1(this, context, 3);
        this.f30318f = m1Var;
        m1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        m1Var.setBackButtonImage(R.drawable.ic_ab_back);
        m1Var.C(org.telegram.ui.ActionBar.g6.w0(null, i17, false), false);
        m1Var.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        m1Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        m1Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        m1Var.setOccupyStatusBar(false);
        m1Var.setAlpha(0.0f);
        m1Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f30320r.quiz) {
            m1Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            m1Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(m1Var, i7.f6.c(-2.0f, -1));
        m1Var.setActionBarMenuOnItemClick(new cg.n1(this, 28));
        View view = new View(context);
        this.f30317e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, i7.f6.c(1.0f, -1));
    }

    public static int A(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static int B(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int C(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static int D(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int E(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static int F(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static int G(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int H(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static ViewGroup I(lg0 lg0Var) {
        return lg0Var.containerView;
    }

    public static boolean K(lg0 lg0Var) {
        return lg0Var.isFullscreen;
    }

    public static int L(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static int M(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static void m(lg0 lg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        f2.n1 T;
        hg0 hg0Var = lg0Var.f30316c;
        ArrayList arrayList2 = lg0Var.f30323x;
        fg0 fg0Var = lg0Var.f30315b;
        ArrayList arrayList3 = lg0Var.B;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(lg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new kg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    kg0 kg0Var = (kg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            kg0 kg0Var2 = (kg0) arrayList2.get(i12);
                            if (Arrays.equals(kg0Var.d, kg0Var2.d)) {
                                kg0Var2.f30039c = kg0Var.f30039c;
                                z10 = (kg0Var2.f30037a == kg0Var.f30037a && kg0Var2.f30038b.size() == kg0Var.f30038b.size()) ? true : true;
                                kg0Var2.f30037a = kg0Var.f30037a;
                                kg0Var2.f30038b = kg0Var.f30038b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                lg0Var.H = false;
                if (fg0Var != null) {
                    if (lg0Var.currentSheetAnimationType == 0 && lg0Var.startAnimationRunnable == null && !z10) {
                        int childCount = fg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = fg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = fg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = fg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.A = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    hg0Var.y(T);
                                    pollVotesAlert$UserCell.A = null;
                                }
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(arrayList4);
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                        }
                        lg0Var.H = false;
                        return;
                    }
                    if (z10) {
                        lg0Var.R();
                    }
                    hg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        lg0Var.dismiss();
    }

    public static void n(lg0 lg0Var, kg0 kg0Var, TLObject tLObject) {
        if (lg0Var.isShowing()) {
            lg0Var.v.remove(kg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(lg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                kg0Var.f30038b.addAll(tL_messages_votesList.votes);
                kg0Var.f30039c = tL_messages_votesList.next_offset;
                lg0Var.O(null);
                lg0Var.f30316c.X(true);
            }
        }
    }

    public static void o(lg0 lg0Var, Context context, View view, int i10) {
        HashSet hashSet = lg0Var.v;
        hg0 hg0Var = lg0Var.f30316c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = lg0Var.B;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.m8) {
                    int S = hg0Var.S(i10) - 1;
                    int Q = hg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        kg0 kg0Var = (kg0) lg0Var.f30323x.get(S);
                        if (Q == kg0Var.b() && !hashSet.contains(kg0Var)) {
                            if (kg0Var.f30040e && kg0Var.f30041f < kg0Var.f30038b.size()) {
                                int min = Math.min(kg0Var.f30041f + 50, kg0Var.f30038b.size());
                                kg0Var.f30041f = min;
                                if (min == kg0Var.f30038b.size()) {
                                    kg0Var.f30040e = false;
                                }
                                lg0Var.O(null);
                                hg0Var.X(true);
                                return;
                            }
                            hashSet.add(kg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = lg0Var.f30321s;
                            tL_messages_getPollVotes.f22489id = lg0Var.f30319n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = kg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = kg0Var.f30039c;
                            ConnectionsManager.getInstance(lg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.zg(15, lg0Var, kg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f26451n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f22539id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f26451n.f22392id);
                        }
                        lg0Var.dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.tn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.tn) U).i();
                                    if (i13 != null && i13.f22539id == pollVotesAlert$UserCell.h.f22539id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.tn) U).f42787e;
                                    if (chat != null && chat.f22392id == pollVotesAlert$UserCell.f26451n.f22392id) {
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

    public static ViewGroup p(lg0 lg0Var) {
        return lg0Var.containerView;
    }

    public static ViewGroup q(lg0 lg0Var) {
        return lg0Var.containerView;
    }

    public static int r(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int s(lg0 lg0Var) {
        return lg0Var.backgroundPaddingLeft;
    }

    public static void t(lg0 lg0Var) {
        boolean z10;
        Integer num;
        float f9;
        cg.m1 m1Var = lg0Var.f30318f;
        fg0 fg0Var = lg0Var.f30315b;
        if (fg0Var.getChildCount() <= 0) {
            int paddingTop = fg0Var.getPaddingTop();
            lg0Var.A = paddingTop;
            fg0Var.setTopGlowOffset(paddingTop);
            lg0Var.containerView.invalidate();
            return;
        }
        View childAt = fg0Var.getChildAt(0);
        vk0 vk0Var = (vk0) fg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && m1Var.getTag() == null) || (!z10 && m1Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            m1Var.setTag(num);
            AnimatorSet animatorSet = lg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                lg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            lg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = lg0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m1Var, property, f9);
            View view = lg0Var.f30317e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            lg0Var.h.addListener(new zz(lg0Var, 11));
            lg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fg0Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin, top);
        if (lg0Var.A != C) {
            lg0Var.A = C;
            fg0Var.setTopGlowOffset(C - layoutParams.topMargin);
            lg0Var.containerView.invalidate();
        }
    }

    public static int u(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int v(lg0 lg0Var) {
        return lg0Var.currentSheetAnimationType;
    }

    public static int w(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int x(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public static int y(lg0 lg0Var) {
        return lg0Var.backgroundPaddingTop;
    }

    public final void O(View view) {
        fg0 fg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            fg0Var = this.f30315b;
            int i11 = 0;
            if (i10 >= fg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = fg0Var.getPinnedHeader();
            } else {
                childAt = fg0Var.getChildAt(i10);
            }
            if ((childAt instanceof jg0) && (childAt.getTag(R.id.object_tag) instanceof kg0)) {
                jg0 jg0Var = (jg0) childAt;
                kg0 kg0Var = (kg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f30320r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, kg0Var.d) && ((ig0) this.f30322w.get(kg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f30319n;
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
                            jg0Var.a(str2, arrayList, P(kg0Var.d), kg0Var.f30037a, kg0Var.a(), true);
                            jg0Var.setTag(R.id.object_tag, kg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = fg0Var.f29712n1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(fg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(fg0Var.getMeasuredHeight(), 0));
            View view3 = fg0Var.f29712n1;
            view3.layout(0, 0, view3.getMeasuredWidth(), fg0Var.f29712n1.getMeasuredHeight());
            fg0Var.invalidate();
        }
        fg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f30323x;
            if (i10 >= arrayList.size()) {
                break;
            }
            kg0 kg0Var = (kg0) arrayList.get(i10);
            if (kg0Var != null) {
                i11 += kg0Var.f30037a;
                if (Arrays.equals(kg0Var.d, bArr)) {
                    i12 += kg0Var.f30037a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.J;
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
        HashMap hashMap2 = this.f30322w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f30319n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30323x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            kg0 kg0Var = (kg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(kg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(kg0Var.d, pollAnswerVoters.option)) {
                        float f9 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f9;
                        obj.f29388a = f9 - i15;
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
            Collections.sort(arrayList, new lh.e4(26));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((ig0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.C;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23151i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.G = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.D = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.E = matrix;
        this.D.setLocalMatrix(matrix);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        ArrayList arrayList = this.B;
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30318f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30318f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30318f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30318f, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30318f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30324y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30317e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, org.telegram.ui.ActionBar.g6.f23151i5));
        int i12 = org.telegram.ui.ActionBar.g6.f23100f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 524288, new Class[]{jg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 524288, new Class[]{jg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 524288, new Class[]{jg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 524304, new Class[]{jg0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30315b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
