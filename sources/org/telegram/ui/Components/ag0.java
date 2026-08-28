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
public final class ag0 extends org.telegram.ui.ActionBar.f3 {
    public static final ch.g K = new ch.g("placeholderAlpha", 11);
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
    public final uf0 f26783b;
    public final wf0 f26784c;
    public final Drawable d;
    public final View f26785e;
    public final r7 f26786f;
    public AnimatorSet h;
    public final MessageObject f26787n;
    public final TLRPC.Poll f26788r;
    public final TLRPC.InputPeer f26789s;
    public final HashSet v;
    public final HashMap f26790w;
    public final ArrayList f26791x;
    public final s5 f26792y;

    public ag0(Context context, int i9, MessageObject messageObject, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        this.v = new HashSet();
        this.f26790w = new HashMap();
        this.f26791x = new ArrayList();
        this.B = new ArrayList();
        this.C = new Paint(1);
        this.H = true;
        this.I = new RectF();
        this.currentAccount = i9;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f26787n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.J = tL_messageMediaPoll;
        this.f26788r = tL_messageMediaPoll.poll;
        this.f26789s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i11);
            if (pollAnswerVoters.voters != 0) {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i12 = pollAnswerVoters.voters;
                i12 = i12 > 15 ? 10 : i12;
                for (int i13 = 0; i13 < i12; i13++) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                }
                int i14 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i12 < i14 ? "empty" : null;
                tL_messages_votesList.count = i14;
                this.f26791x.add(new zf0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f26789s;
                tL_messages_getPollVotes.f22477id = this.f26787n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i10 = 15;
                } else {
                    i10 = 10;
                }
                tL_messages_getPollVotes.limit = i10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ff.j0(this, numArr, i11, arrayList, pollAnswerVoters, 8)));
                numArr[i11] = valueOf;
                this.B.add(valueOf);
            }
            i11++;
        }
        Q();
        Collections.sort(this.f26791x, new sf0(this));
        R();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23091i5, false), PorterDuff.Mode.MULTIPLY));
        tf0 tf0Var = new tf0(this, context);
        this.containerView = tf0Var;
        tf0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        uf0 uf0Var = new uf0(this, context);
        this.f26783b = uf0Var;
        uf0Var.setSections(false);
        f2.n nVar = new f2.n();
        nVar.f5548c = 150L;
        nVar.f5549e = 350L;
        nVar.f5550f = 0L;
        nVar.f5551g = 0L;
        nVar.d = 0L;
        nVar.C = false;
        nVar.f5552i = new OvershootInterpolator(1.1f);
        nVar.f5449o = gr.h;
        uf0Var.setItemAnimator(nVar);
        uf0Var.setClipToPadding(false);
        getContext();
        uf0Var.setLayoutManager(new of.y(1, false, 8));
        uf0Var.setHorizontalScrollBarEnabled(false);
        uf0Var.setVerticalScrollBarEnabled(false);
        uf0Var.setSectionsType(2);
        this.containerView.addView(uf0Var, g7.e6.e(-1, -1, 51));
        wf0 wf0Var = new wf0(this, context);
        this.f26784c = wf0Var;
        uf0Var.setAdapter(wf0Var);
        uf0Var.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false));
        uf0Var.setOnItemClickListener(new bg.b1(15, this, context));
        uf0Var.setOnScrollListener(new kn(this, 7));
        s5 s5Var = new s5(context);
        this.f26792y = s5Var;
        s5Var.setTextSize(1, 18.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i16 = org.telegram.ui.ActionBar.f6.f23108j5;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        s5Var.setTag(-33024);
        s5Var.setLayoutParams(new f2.a1(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f26788r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f26787n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(s5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, s5Var.getPaint().getFontMetricsInt());
            s5Var.setText(replaceEmoji);
        }
        r7 r7Var = new r7(this, context, 2);
        this.f26786f = r7Var;
        r7Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        r7Var.setBackButtonImage(R.drawable.ic_ab_back);
        r7Var.C(org.telegram.ui.ActionBar.f6.w0(null, i16, false), false);
        r7Var.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), false);
        r7Var.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        r7Var.setSubtitleColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pi, false));
        r7Var.setOccupyStatusBar(false);
        r7Var.setAlpha(0.0f);
        r7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f26788r.quiz) {
            r7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            r7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(r7Var, g7.e6.c(-2.0f, -1));
        r7Var.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 6));
        View view = new View(context);
        this.f26785e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        this.containerView.addView(view, g7.e6.c(1.0f, -1));
    }

    public static int A(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int C(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static int D(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int E(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static int F(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static int G(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int H(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static ViewGroup I(ag0 ag0Var) {
        return ag0Var.containerView;
    }

    public static boolean K(ag0 ag0Var) {
        return ag0Var.isFullscreen;
    }

    public static int L(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static int M(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static void m(ag0 ag0Var, Integer[] numArr, int i9, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        f2.q1 T;
        wf0 wf0Var = ag0Var.f26784c;
        ArrayList arrayList2 = ag0Var.f26791x;
        uf0 uf0Var = ag0Var.f26783b;
        ArrayList arrayList3 = ag0Var.B;
        arrayList3.remove(numArr[i9]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(ag0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new zf0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zf0 zf0Var = (zf0) arrayList.get(i10);
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            zf0 zf0Var2 = (zf0) arrayList2.get(i11);
                            if (Arrays.equals(zf0Var.d, zf0Var2.d)) {
                                zf0Var2.f35300c = zf0Var.f35300c;
                                z10 = (zf0Var2.f35298a == zf0Var.f35298a && zf0Var2.f35299b.size() == zf0Var.f35299b.size()) ? true : true;
                                zf0Var2.f35298a = zf0Var.f35298a;
                                zf0Var2.f35299b = zf0Var.f35299b;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                ag0Var.H = false;
                if (uf0Var != null) {
                    if (ag0Var.currentSheetAnimationType == 0 && ag0Var.startAnimationRunnable == null && !z10) {
                        int childCount = uf0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = uf0Var.getChildAt(i12);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = uf0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = uf0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.A = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    wf0Var.y(T);
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
                        ag0Var.H = false;
                        return;
                    }
                    if (z10) {
                        ag0Var.Q();
                    }
                    wf0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        ag0Var.dismiss();
    }

    public static void n(ag0 ag0Var, zf0 zf0Var, TLObject tLObject) {
        if (ag0Var.isShowing()) {
            ag0Var.v.remove(zf0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(ag0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                zf0Var.f35299b.addAll(tL_messages_votesList.votes);
                zf0Var.f35300c = tL_messages_votesList.next_offset;
                ag0Var.N(null);
                ag0Var.f26784c.X(true);
            }
        }
    }

    public static void o(ag0 ag0Var, Context context, View view, int i9) {
        HashSet hashSet = ag0Var.v;
        wf0 wf0Var = ag0Var.f26784c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = ag0Var.B;
            if (arrayList == null || arrayList.isEmpty()) {
                int i10 = 0;
                if (view instanceof org.telegram.ui.Cells.p8) {
                    int S = wf0Var.S(i9) - 1;
                    int Q = wf0Var.Q(i9) - 1;
                    if (Q > 0 && S >= 0) {
                        zf0 zf0Var = (zf0) ag0Var.f26791x.get(S);
                        if (Q == zf0Var.b() && !hashSet.contains(zf0Var)) {
                            if (zf0Var.f35301e && zf0Var.f35302f < zf0Var.f35299b.size()) {
                                int min = Math.min(zf0Var.f35302f + 50, zf0Var.f35299b.size());
                                zf0Var.f35302f = min;
                                if (min == zf0Var.f35299b.size()) {
                                    zf0Var.f35301e = false;
                                }
                                ag0Var.N(null);
                                wf0Var.X(true);
                                return;
                            }
                            hashSet.add(zf0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ag0Var.f26789s;
                            tL_messages_getPollVotes.f22477id = ag0Var.f26787n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i11 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = zf0Var.d;
                            tL_messages_getPollVotes.flags = i11 | 3;
                            tL_messages_getPollVotes.offset = zf0Var.f35300c;
                            ConnectionsManager.getInstance(ag0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.rc(19, ag0Var, zf0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f26440n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f22527id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f26440n.f22380id);
                        }
                        ag0Var.dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.qn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i12 = ((org.telegram.ui.qn) U).i();
                                    if (i12 != null && i12.f22527id == pollVotesAlert$UserCell.h.f22527id) {
                                        i10 = 1;
                                    }
                                    profileActivity.N4(i10);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.qn) U).f41890e;
                                    if (chat != null && chat.f22380id == pollVotesAlert$UserCell.f26440n.f22380id) {
                                        i10 = 1;
                                    }
                                    profileActivity.N4(i10);
                                }
                            }
                            U.presentFragment(profileActivity);
                        }
                    }
                }
            }
        }
    }

    public static ViewGroup p(ag0 ag0Var) {
        return ag0Var.containerView;
    }

    public static ViewGroup q(ag0 ag0Var) {
        return ag0Var.containerView;
    }

    public static int r(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int s(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public static void t(ag0 ag0Var) {
        boolean z10;
        Integer num;
        float f10;
        r7 r7Var = ag0Var.f26786f;
        uf0 uf0Var = ag0Var.f26783b;
        if (uf0Var.getChildCount() <= 0) {
            int paddingTop = uf0Var.getPaddingTop();
            ag0Var.A = paddingTop;
            uf0Var.setTopGlowOffset(paddingTop);
            ag0Var.containerView.invalidate();
            return;
        }
        View childAt = uf0Var.getChildAt(0);
        ik0 ik0Var = (ik0) uf0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && r7Var.getTag() == null) || (!z10 && r7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            r7Var.setTag(num);
            AnimatorSet animatorSet = ag0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ag0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ag0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ag0Var.h;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7Var, property, f10);
            View view = ag0Var.f26785e;
            if (z10) {
                f11 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f11));
            ag0Var.h.addListener(new r60(ag0Var, 9));
            ag0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uf0Var.getLayoutParams();
        int D = org.telegram.messenger.ll.D(11.0f, layoutParams.topMargin, top);
        if (ag0Var.A != D) {
            ag0Var.A = D;
            uf0Var.setTopGlowOffset(D - layoutParams.topMargin);
            ag0Var.containerView.invalidate();
        }
    }

    public static int u(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int v(ag0 ag0Var) {
        return ag0Var.currentSheetAnimationType;
    }

    public static int w(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int x(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int y(ag0 ag0Var) {
        return ag0Var.backgroundPaddingTop;
    }

    public static int z(ag0 ag0Var) {
        return ag0Var.backgroundPaddingLeft;
    }

    public final void N(View view) {
        uf0 uf0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i9 = -2;
        while (true) {
            uf0Var = this.f26783b;
            int i10 = 0;
            if (i9 >= uf0Var.getChildCount()) {
                break;
            }
            if (i9 == -2) {
                childAt = view;
            } else if (i9 == -1) {
                childAt = uf0Var.getPinnedHeader();
            } else {
                childAt = uf0Var.getChildAt(i9);
            }
            if ((childAt instanceof yf0) && (childAt.getTag(R.id.object_tag) instanceof zf0)) {
                yf0 yf0Var = (yf0) childAt;
                zf0 zf0Var = (zf0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f26788r;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (Arrays.equals(pollAnswer.option, zf0Var.d) && ((xf0) this.f26790w.get(zf0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f26787n;
                            if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i10);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i10++;
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
                            yf0Var.a(str2, arrayList, O(zf0Var.d), zf0Var.f35298a, zf0Var.a(), true);
                            yf0Var.setTag(R.id.object_tag, zf0Var);
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i9++;
        }
        View view2 = uf0Var.f34263n1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(uf0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(uf0Var.getMeasuredHeight(), 0));
            View view3 = uf0Var.f34263n1;
            view3.layout(0, 0, view3.getMeasuredWidth(), uf0Var.f34263n1.getMeasuredHeight());
            uf0Var.invalidate();
        }
        uf0Var.invalidate();
    }

    public final int O(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26791x;
            if (i9 >= arrayList.size()) {
                break;
            }
            zf0 zf0Var = (zf0) arrayList.get(i9);
            if (zf0Var != null) {
                i10 += zf0Var.f35298a;
                if (Arrays.equals(zf0Var.d, bArr)) {
                    i11 += zf0Var.f35298a;
                }
            }
            i9++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.J;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i10 = tL_messageMediaPoll.results.total_voters;
        }
        if (i10 <= 0) {
            return 0;
        }
        return Math.round((i11 / i10) * 100.0f);
    }

    public final MessagesController P() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void Q() {
        HashMap hashMap;
        HashMap hashMap2 = this.f26790w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f26787n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f26791x;
        int size = arrayList2.size();
        int i9 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            zf0 zf0Var = (zf0) arrayList2.get(i10);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(zf0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                    hashMap = hashMap2;
                    if (Arrays.equals(zf0Var.d, pollAnswerVoters.option)) {
                        float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        obj.f34671a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z10 = true;
                        }
                        i9 -= i14;
                        i12 = Math.max(i14, i12);
                        i10++;
                        hashMap2 = hashMap;
                    } else {
                        i13++;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            i10++;
            hashMap2 = hashMap;
        }
        if (z10 && i9 != 0) {
            Collections.sort(arrayList, new j9.a(28));
            int min = Math.min(i9, arrayList.size());
            for (int i15 = 0; i15 < min; i15++) {
                ((xf0) arrayList.get(i15)).getClass();
            }
        }
    }

    public final void R() {
        Paint paint = this.C;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23091i5, false);
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
        for (int i9 = 0; i9 < size; i9++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i9)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(viewGroup, 0, null, null, drawableArr, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26786f, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.A5));
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26786f, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26786f, 128, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26786f, 1024, null, null, null, null, org.telegram.ui.ActionBar.f6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26786f, 256, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26792y, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26785e, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, org.telegram.ui.ActionBar.f6.f23091i5));
        int i11 = org.telegram.ui.ActionBar.f6.f23038f7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 524288, new Class[]{yf0.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 524288, new Class[]{yf0.class}, new String[]{"middleTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 524288, new Class[]{yf0.class}, new String[]{"righTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 524304, new Class[]{yf0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i12 = org.telegram.ui.ActionBar.f6.f23229q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f26783b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        return arrayList;
    }
}
