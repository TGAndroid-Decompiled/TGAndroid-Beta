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
public final class ch0 extends org.telegram.ui.ActionBar.f3 {
    public static final org.telegram.ui.Cells.u8 O = new org.telegram.ui.Cells.u8("placeholderAlpha", 9);
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
    public final wg0 f23357b;
    public final yg0 f23358c;
    public final Drawable d;
    public final View e;
    public final x7 f23359f;
    public AnimatorSet h;
    public final MessageObject f23360n;
    public final TLRPC.Poll f23361r;
    public final TLRPC.InputPeer f23362s;
    public final HashSet v;
    public final HashMap f23363w;
    public final ArrayList f23364x;
    public final x5 f23365y;

    public ch0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f23363w = new HashMap();
        this.f23364x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f23360n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f23361r = tL_messageMediaPoll.poll;
        this.f23362s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f23364x.add(new bh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f23362s;
                tL_messages_getPollVotes.f18440id = this.f23360n.getId();
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
        Collections.sort(this.f23364x, new ug0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19198i5, false), PorterDuff.Mode.MULTIPLY));
        vg0 vg0Var = new vg0(this, context);
        this.containerView = vg0Var;
        vg0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        wg0 wg0Var = new wg0(this, context);
        this.f23357b = wg0Var;
        wg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f43076c = 150L;
        jVar.e = 350L;
        jVar.f43077f = 0L;
        jVar.f43078g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f43079i = new OvershootInterpolator(1.1f);
        jVar.f43052o = qr.h;
        wg0Var.setItemAnimator(jVar);
        wg0Var.setClipToPadding(false);
        getContext();
        wg0Var.setLayoutManager(new gg.b0(1, false, 9));
        wg0Var.setHorizontalScrollBarEnabled(false);
        wg0Var.setVerticalScrollBarEnabled(false);
        wg0Var.setSectionsType(2);
        this.containerView.addView(wg0Var, w7.y5.e(-1, -1, 51));
        yg0 yg0Var = new yg0(this, context);
        this.f23358c = yg0Var;
        wg0Var.setAdapter(yg0Var);
        wg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        wg0Var.setOnItemClickListener(new ai.o6(13, this, context));
        wg0Var.setOnScrollListener(new vb0(this, 2));
        x5 x5Var = new x5(context);
        this.f23365y = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f19216j5;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f23361r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f23360n;
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
        this.f23359f = x7Var;
        x7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false));
        x7Var.setBackButtonImage(R.drawable.ic_ab_back);
        x7Var.B(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        x7Var.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        x7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        x7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        x7Var.setOccupyStatusBar(false);
        x7Var.setAlpha(0.0f);
        x7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f23361r.quiz) {
            x7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            x7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(x7Var, w7.y5.c(-2.0f, -1));
        x7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.y5.c(1.0f, -1));
    }

    public static int A(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int B(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int D(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int E(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int F(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int G(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int I(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static boolean L(ch0 ch0Var) {
        return ch0Var.isFullscreen;
    }

    public static int M(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static int N(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static void m(ch0 ch0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 U;
        yg0 yg0Var = ch0Var.f23358c;
        ArrayList arrayList2 = ch0Var.f23364x;
        wg0 wg0Var = ch0Var.f23357b;
        ArrayList arrayList3 = ch0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(ch0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new bh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    bh0 bh0Var = (bh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            bh0 bh0Var2 = (bh0) arrayList2.get(i12);
                            if (Arrays.equals(bh0Var.d, bh0Var2.d)) {
                                bh0Var2.f22995c = bh0Var.f22995c;
                                z10 = (bh0Var2.f22993a == bh0Var.f22993a && bh0Var2.f22994b.size() == bh0Var.f22994b.size()) ? true : true;
                                bh0Var2.f22993a = bh0Var.f22993a;
                                bh0Var2.f22994b = bh0Var.f22994b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                ch0Var.L = false;
                if (wg0Var != null) {
                    if (ch0Var.currentSheetAnimationType == 0 && ch0Var.startAnimationRunnable == null && !z10) {
                        int childCount = wg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = wg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View G = wg0Var.G(childAt);
                                if (G == null) {
                                    U = null;
                                } else {
                                    U = wg0Var.U(G);
                                }
                                if (U != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    yg0Var.y(U);
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
                        ch0Var.L = false;
                        return;
                    }
                    if (z10) {
                        ch0Var.R();
                    }
                    yg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        ch0Var.dismiss();
    }

    public static void n(ch0 ch0Var, bh0 bh0Var, TLObject tLObject) {
        if (ch0Var.isShowing()) {
            ch0Var.v.remove(bh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(ch0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                bh0Var.f22994b.addAll(tL_messages_votesList.votes);
                bh0Var.f22995c = tL_messages_votesList.next_offset;
                ch0Var.O(null);
                ch0Var.f23358c.X(true);
            }
        }
    }

    public static void o(ch0 ch0Var, Context context, View view, int i10) {
        HashSet hashSet = ch0Var.v;
        yg0 yg0Var = ch0Var.f23358c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = ch0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.s8) {
                    int S = yg0Var.S(i10) - 1;
                    int Q = yg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        bh0 bh0Var = (bh0) ch0Var.f23364x.get(S);
                        if (Q == bh0Var.b() && !hashSet.contains(bh0Var)) {
                            if (bh0Var.e && bh0Var.f22996f < bh0Var.f22994b.size()) {
                                int min = Math.min(bh0Var.f22996f + 50, bh0Var.f22994b.size());
                                bh0Var.f22996f = min;
                                if (min == bh0Var.f22994b.size()) {
                                    bh0Var.e = false;
                                }
                                ch0Var.O(null);
                                yg0Var.X(true);
                                return;
                            }
                            hashSet.add(bh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = ch0Var.f23362s;
                            tL_messages_getPollVotes.f18440id = ch0Var.f23360n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = bh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = bh0Var.f22995c;
                            ConnectionsManager.getInstance(ch0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.oo(12, ch0Var, bh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f22331n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f18490id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f22331n.f18343id);
                        }
                        ch0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.zn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                                    if (i13 != null && i13.f18490id == pollVotesAlert$UserCell.h.f18490id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.zn) U).e;
                                    if (chat != null && chat.f18343id == pollVotesAlert$UserCell.f22331n.f18343id) {
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

    public static ViewGroup p(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static ViewGroup q(ch0 ch0Var) {
        return ch0Var.containerView;
    }

    public static int r(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int s(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public static void t(ch0 ch0Var) {
        boolean z10;
        Integer num;
        float f7;
        x7 x7Var = ch0Var.f23359f;
        wg0 wg0Var = ch0Var.f23357b;
        if (wg0Var.getChildCount() <= 0) {
            int paddingTop = wg0Var.getPaddingTop();
            ch0Var.E = paddingTop;
            wg0Var.setTopGlowOffset(paddingTop);
            ch0Var.containerView.invalidate();
            return;
        }
        View childAt = wg0Var.getChildAt(0);
        il0 il0Var = (il0) wg0Var.H(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || il0Var == null || il0Var.b() != 0) {
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
            AnimatorSet animatorSet = ch0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                ch0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ch0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ch0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x7Var, property, f7);
            View view = ch0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            ch0Var.h.addListener(new gd0(ch0Var, 4));
            ch0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wg0Var.getLayoutParams();
        int D = org.telegram.messenger.rk.D(11.0f, layoutParams.topMargin, top);
        if (ch0Var.E != D) {
            ch0Var.E = D;
            wg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            ch0Var.containerView.invalidate();
        }
    }

    public static int u(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int v(ch0 ch0Var) {
        return ch0Var.currentSheetAnimationType;
    }

    public static int w(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int x(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int y(ch0 ch0Var) {
        return ch0Var.backgroundPaddingTop;
    }

    public static int z(ch0 ch0Var) {
        return ch0Var.backgroundPaddingLeft;
    }

    public final void O(View view) {
        wg0 wg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            wg0Var = this.f23357b;
            int i11 = 0;
            if (i10 >= wg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = wg0Var.getPinnedHeader();
            } else {
                childAt = wg0Var.getChildAt(i10);
            }
            if ((childAt instanceof ah0) && (childAt.getTag(R.id.object_tag) instanceof bh0)) {
                ah0 ah0Var = (ah0) childAt;
                bh0 bh0Var = (bh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f23361r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, bh0Var.d) && ((zg0) this.f23363w.get(bh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f23360n;
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
                            ah0Var.a(str2, arrayList, P(bh0Var.d), bh0Var.f22993a, bh0Var.a(), true);
                            ah0Var.setTag(R.id.object_tag, bh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = wg0Var.f30707r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(wg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wg0Var.getMeasuredHeight(), 0));
            View view3 = wg0Var.f30707r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), wg0Var.f30707r1.getMeasuredHeight());
            wg0Var.invalidate();
        }
        wg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f23364x;
            if (i10 >= arrayList.size()) {
                break;
            }
            bh0 bh0Var = (bh0) arrayList.get(i10);
            if (bh0Var != null) {
                i11 += bh0Var.f22993a;
                if (Arrays.equals(bh0Var.d, bArr)) {
                    i12 += bh0Var.f22993a;
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
        HashMap hashMap2 = this.f23363w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f23360n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23364x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            bh0 bh0Var = (bh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(bh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(bh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30889a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.df(12));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((zg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19198i5, false);
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
        x6 x6Var = new x6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.f19180h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23359f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f19216j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23359f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23359f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23359f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23359f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23365y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{View.class}, null, null, null, -1, x6Var, org.telegram.ui.ActionBar.j6.f19198i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 524288, new Class[]{ah0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 524288, new Class[]{ah0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 524288, new Class[]{ah0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 524304, new Class[]{ah0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23357b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
