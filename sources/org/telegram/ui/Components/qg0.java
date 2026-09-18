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
public final class qg0 extends org.telegram.ui.ActionBar.g3 {
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
    public final kg0 f27301b;
    public final mg0 f27302c;
    public final Drawable d;
    public final View e;
    public final w7 f27303f;
    public AnimatorSet h;
    public final MessageObject f27304n;
    public final TLRPC.Poll f27305r;
    public final TLRPC.InputPeer f27306s;
    public final HashSet v;
    public final HashMap f27307w;
    public final ArrayList f27308x;
    public final w5 f27309y;

    public qg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f27307w = new HashMap();
        this.f27308x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f27304n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f27305r = tL_messageMediaPoll.poll;
        this.f27306s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f27308x.add(new pg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f27306s;
                tL_messages_getPollVotes.f18218id = this.f27304n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.ya(this, numArr, i12, arrayList, pollAnswerVoters, 5)));
                numArr[i12] = valueOf;
                this.F.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f27308x, new ig0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i5, false), PorterDuff.Mode.MULTIPLY));
        jg0 jg0Var = new jg0(this, context);
        this.containerView = jg0Var;
        jg0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        kg0 kg0Var = new kg0(this, context);
        this.f27301b = kg0Var;
        kg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f42783c = 150L;
        jVar.e = 350L;
        jVar.f42784f = 0L;
        jVar.f42785g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f42786i = new OvershootInterpolator(1.1f);
        jVar.f42759o = qr.h;
        kg0Var.setItemAnimator(jVar);
        kg0Var.setClipToPadding(false);
        getContext();
        kg0Var.setLayoutManager(new gg.b0(1, false, 9));
        kg0Var.setHorizontalScrollBarEnabled(false);
        kg0Var.setVerticalScrollBarEnabled(false);
        kg0Var.setSectionsType(2);
        this.containerView.addView(kg0Var, w7.x5.e(-1, -1, 51));
        mg0 mg0Var = new mg0(this, context);
        this.f27302c = mg0Var;
        kg0Var.setAdapter(mg0Var);
        kg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        kg0Var.setOnItemClickListener(new ai.o6(13, this, context));
        kg0Var.setOnScrollListener(new kb0(this, 2));
        w5 w5Var = new w5(context);
        this.f27309y = w5Var;
        w5Var.setTextSize(1, 18.0f);
        w5Var.setTypeface(AndroidUtilities.bold());
        w5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f18970j5;
        w5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        w5Var.setTag(-33024);
        w5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f27305r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f27304n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, w5Var.getPaint().getFontMetricsInt());
            w5Var.setText(replaceEmoji);
        }
        w7 w7Var = new w7(this, context, 2);
        this.f27303f = w7Var;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false));
        w7Var.setBackButtonImage(R.drawable.ic_ab_back);
        w7Var.B(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        w7Var.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        w7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        w7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        w7Var.setOccupyStatusBar(false);
        w7Var.setAlpha(0.0f);
        w7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f27305r.quiz) {
            w7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            w7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(w7Var, w7.x5.c(-2.0f, -1));
        w7Var.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.x5.c(1.0f, -1));
    }

    public static int A(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int B(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static int E(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int F(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static int G(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static int H(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int I(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(qg0 qg0Var) {
        return qg0Var.containerView;
    }

    public static boolean L(qg0 qg0Var) {
        return qg0Var.isFullscreen;
    }

    public static int M(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static int N(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static void m(qg0 qg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 U;
        mg0 mg0Var = qg0Var.f27302c;
        ArrayList arrayList2 = qg0Var.f27308x;
        kg0 kg0Var = qg0Var.f27301b;
        ArrayList arrayList3 = qg0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(qg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new pg0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    pg0 pg0Var = (pg0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            pg0 pg0Var2 = (pg0) arrayList2.get(i12);
                            if (Arrays.equals(pg0Var.d, pg0Var2.d)) {
                                pg0Var2.f27027c = pg0Var.f27027c;
                                z10 = (pg0Var2.f27025a == pg0Var.f27025a && pg0Var2.f27026b.size() == pg0Var.f27026b.size()) ? true : true;
                                pg0Var2.f27025a = pg0Var.f27025a;
                                pg0Var2.f27026b = pg0Var.f27026b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                qg0Var.L = false;
                if (kg0Var != null) {
                    if (qg0Var.currentSheetAnimationType == 0 && qg0Var.startAnimationRunnable == null && !z10) {
                        int childCount = kg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = kg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View G = kg0Var.G(childAt);
                                if (G == null) {
                                    U = null;
                                } else {
                                    U = kg0Var.U(G);
                                }
                                if (U != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    mg0Var.y(U);
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
                        qg0Var.L = false;
                        return;
                    }
                    if (z10) {
                        qg0Var.R();
                    }
                    mg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        qg0Var.dismiss();
    }

    public static void n(qg0 qg0Var, pg0 pg0Var, TLObject tLObject) {
        if (qg0Var.isShowing()) {
            qg0Var.v.remove(pg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(qg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                pg0Var.f27026b.addAll(tL_messages_votesList.votes);
                pg0Var.f27027c = tL_messages_votesList.next_offset;
                qg0Var.O(null);
                qg0Var.f27302c.X(true);
            }
        }
    }

    public static void o(qg0 qg0Var, Context context, View view, int i10) {
        HashSet hashSet = qg0Var.v;
        mg0 mg0Var = qg0Var.f27302c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = qg0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = mg0Var.S(i10) - 1;
                    int Q = mg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        pg0 pg0Var = (pg0) qg0Var.f27308x.get(S);
                        if (Q == pg0Var.b() && !hashSet.contains(pg0Var)) {
                            if (pg0Var.e && pg0Var.f27028f < pg0Var.f27026b.size()) {
                                int min = Math.min(pg0Var.f27028f + 50, pg0Var.f27026b.size());
                                pg0Var.f27028f = min;
                                if (min == pg0Var.f27026b.size()) {
                                    pg0Var.e = false;
                                }
                                qg0Var.O(null);
                                mg0Var.X(true);
                                return;
                            }
                            hashSet.add(pg0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = qg0Var.f27306s;
                            tL_messages_getPollVotes.f18218id = qg0Var.f27304n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = pg0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = pg0Var.f27027c;
                            ConnectionsManager.getInstance(qg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.qo(12, qg0Var, pg0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f22107n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f18268id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f22107n.f18121id);
                        }
                        qg0Var.dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.bo) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.bo) U).i();
                                    if (i13 != null && i13.f18268id == pollVotesAlert$UserCell.h.f18268id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.bo) U).e;
                                    if (chat != null && chat.f18121id == pollVotesAlert$UserCell.f22107n.f18121id) {
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

    public static ViewGroup p(qg0 qg0Var) {
        return qg0Var.containerView;
    }

    public static ViewGroup q(qg0 qg0Var) {
        return qg0Var.containerView;
    }

    public static int r(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int s(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public static void t(qg0 qg0Var) {
        boolean z10;
        Integer num;
        float f7;
        w7 w7Var = qg0Var.f27303f;
        kg0 kg0Var = qg0Var.f27301b;
        if (kg0Var.getChildCount() <= 0) {
            int paddingTop = kg0Var.getPaddingTop();
            qg0Var.E = paddingTop;
            kg0Var.setTopGlowOffset(paddingTop);
            qg0Var.containerView.invalidate();
            return;
        }
        View childAt = kg0Var.getChildAt(0);
        wk0 wk0Var = (wk0) kg0Var.H(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wk0Var == null || wk0Var.b() != 0) {
            top = dp;
        }
        if (top <= AndroidUtilities.dp(12.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && w7Var.getTag() == null) || (!z10 && w7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            w7Var.setTag(num);
            AnimatorSet animatorSet = qg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                qg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            qg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = qg0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w7Var, property, f7);
            View view = qg0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            qg0Var.h.addListener(new jd0(qg0Var, 3));
            qg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kg0Var.getLayoutParams();
        int D = org.telegram.messenger.wl.D(11.0f, layoutParams.topMargin, top);
        if (qg0Var.E != D) {
            qg0Var.E = D;
            kg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            qg0Var.containerView.invalidate();
        }
    }

    public static int u(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int v(qg0 qg0Var) {
        return qg0Var.currentSheetAnimationType;
    }

    public static int w(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int x(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int y(qg0 qg0Var) {
        return qg0Var.backgroundPaddingTop;
    }

    public static int z(qg0 qg0Var) {
        return qg0Var.backgroundPaddingLeft;
    }

    public final void O(View view) {
        kg0 kg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            kg0Var = this.f27301b;
            int i11 = 0;
            if (i10 >= kg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = kg0Var.getPinnedHeader();
            } else {
                childAt = kg0Var.getChildAt(i10);
            }
            if ((childAt instanceof og0) && (childAt.getTag(R.id.object_tag) instanceof pg0)) {
                og0 og0Var = (og0) childAt;
                pg0 pg0Var = (pg0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f27305r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, pg0Var.d) && ((ng0) this.f27307w.get(pg0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f27304n;
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
                            og0Var.a(str2, arrayList, P(pg0Var.d), pg0Var.f27025a, pg0Var.a(), true);
                            og0Var.setTag(R.id.object_tag, pg0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = kg0Var.f26197r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(kg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(kg0Var.getMeasuredHeight(), 0));
            View view3 = kg0Var.f26197r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), kg0Var.f26197r1.getMeasuredHeight());
            kg0Var.invalidate();
        }
        kg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f27308x;
            if (i10 >= arrayList.size()) {
                break;
            }
            pg0 pg0Var = (pg0) arrayList.get(i10);
            if (pg0Var != null) {
                i11 += pg0Var.f27025a;
                if (Arrays.equals(pg0Var.d, bArr)) {
                    i12 += pg0Var.f27025a;
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

    public final MessagesController Q() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void R() {
        HashMap hashMap;
        HashMap hashMap2 = this.f27307w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f27304n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f27308x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            pg0 pg0Var = (pg0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(pg0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(pg0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f26457a = f7 - i15;
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
                ((ng0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18952i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.K = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
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
        w6 w6Var = new w6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.f18934h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27303f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f18970j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27303f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27303f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27303f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27303f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27309y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{View.class}, null, null, null, -1, w6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{View.class}, null, null, null, -1, w6Var, org.telegram.ui.ActionBar.j6.f18952i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 524288, new Class[]{og0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 524288, new Class[]{og0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 524288, new Class[]{og0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 524304, new Class[]{og0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18985k0, null, null, org.telegram.ui.ActionBar.j6.f18864d7));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27301b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
