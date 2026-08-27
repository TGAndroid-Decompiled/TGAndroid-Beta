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

public final class cg0 extends org.telegram.ui.ActionBar.e3 {
    public static final dh.g K = new dh.g("placeholderAlpha", 11);
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

    public final wf0 f27417b;

    public final yf0 f27418c;
    public final Drawable d;

    public final View f27419e;

    public final ag.d2 f27420f;
    public AnimatorSet h;

    public final MessageObject f27421n;

    public final TLRPC.Poll f27422r;

    public final TLRPC.InputPeer f27423s;
    public final HashSet v;

    public final HashMap f27424w;

    public final ArrayList f27425x;

    public final s5 f27426y;

    public cg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        super(context, c6Var, true, false);
        boolean z10 = false;
        this.v = new HashSet();
        this.f27424w = new HashMap();
        this.f27425x = new ArrayList();
        this.B = new ArrayList();
        this.C = new Paint(1);
        this.H = true;
        this.I = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f27421n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.J = tL_messageMediaPoll;
        this.f27422r = tL_messageMediaPoll.poll;
        this.f27423s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f27425x.add(new bg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f27423s;
                tL_messages_getPollVotes.f22477id = this.f27421n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer numValueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new gf.j0(this, numArr, i11, arrayList, pollAnswerVoters, 7)));
                numArr[i11] = numValueOf;
                this.B.add(numValueOf);
            }
            i11++;
        }
        R();
        Collections.sort(this.f27425x, new vf0(this));
        S();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143i5, false), PorterDuff.Mode.MULTIPLY));
        ag.d0 d0Var = new ag.d0(this, context);
        this.containerView = d0Var;
        d0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        wf0 wf0Var = new wf0(this, context);
        this.f27417b = wf0Var;
        wf0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.f5842c = 150L;
        lVar.f5843e = 350L;
        lVar.f5844f = 0L;
        lVar.f5845g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f5846i = new OvershootInterpolator(1.1f);
        lVar.f5737o = er.h;
        wf0Var.setItemAnimator(lVar);
        wf0Var.setClipToPadding(false);
        getContext();
        wf0Var.setLayoutManager(new org.telegram.ui.j(1, z10, 7));
        wf0Var.setHorizontalScrollBarEnabled(false);
        wf0Var.setVerticalScrollBarEnabled(false);
        wf0Var.setSectionsType(2);
        this.containerView.addView(wf0Var, h7.z5.e(-1, -1, 51));
        yf0 yf0Var = new yf0(this, context);
        this.f27418c = yf0Var;
        wf0Var.setAdapter(yf0Var);
        wf0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        wf0Var.setOnItemClickListener(new cg.x0(15, this, context));
        wf0Var.setOnScrollListener(new xm(this, 8));
        s5 s5Var = new s5(context);
        this.f27426y = s5Var;
        s5Var.setTextSize(1, 18.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i16 = org.telegram.ui.ActionBar.g6.f23161j5;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        s5Var.setTag(-33024);
        s5Var.setLayoutParams(new f2.y0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f27422r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f27421n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(s5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, tL_textWithEntities2.entities, s5Var.getPaint().getFontMetricsInt());
            s5Var.setText(charSequenceReplaceEmoji);
        }
        ag.d2 d2Var = new ag.d2(this, context, 3);
        this.f27420f = d2Var;
        d2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        d2Var.setBackButtonImage(R.drawable.ic_ab_back);
        d2Var.D(org.telegram.ui.ActionBar.g6.w0(null, i16, false), false);
        d2Var.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        d2Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        d2Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        d2Var.setOccupyStatusBar(false);
        d2Var.setAlpha(0.0f);
        d2Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f27422r.quiz) {
            d2Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            d2Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(d2Var, h7.z5.c(-2.0f, -1));
        d2Var.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 7));
        View view = new View(context);
        this.f27419e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, h7.z5.c(1.0f, -1));
    }

    public static void m(cg0 cg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        yf0 yf0Var = cg0Var.f27418c;
        ArrayList arrayList2 = cg0Var.f27425x;
        wf0 wf0Var = cg0Var.f27417b;
        ArrayList arrayList3 = cg0Var.B;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            cg0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(cg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new bg0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                bg0 bg0Var = (bg0) arrayList.get(i11);
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    bg0 bg0Var2 = (bg0) arrayList2.get(i12);
                    if (Arrays.equals(bg0Var.d, bg0Var2.d)) {
                        bg0Var2.f27094c = bg0Var.f27094c;
                        if (bg0Var2.f27092a != bg0Var.f27092a || bg0Var2.f27093b.size() != bg0Var.f27093b.size()) {
                            z10 = true;
                        }
                        bg0Var2.f27092a = bg0Var.f27092a;
                        bg0Var2.f27093b = bg0Var.f27093b;
                        break;
                    }
                }
            }
            cg0Var.H = false;
            if (wf0Var != null) {
                if (cg0Var.currentSheetAnimationType != 0 || cg0Var.startAnimationRunnable != null || z10) {
                    if (z10) {
                        cg0Var.R();
                    }
                    yf0Var.X(false);
                    return;
                }
                int childCount = wf0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = wf0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View viewF = wf0Var.F(childAt);
                        f2.o1 o1VarT = viewF == null ? null : wf0Var.T(viewF);
                        if (o1VarT != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.A = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            yf0Var.y(o1VarT);
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
                cg0Var.H = false;
            }
        }
    }

    public static void n(cg0 cg0Var, bg0 bg0Var, TLObject tLObject) {
        if (cg0Var.isShowing()) {
            cg0Var.v.remove(bg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(cg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                bg0Var.f27093b.addAll(tL_messages_votesList.votes);
                bg0Var.f27094c = tL_messages_votesList.next_offset;
                cg0Var.O(null);
                cg0Var.f27418c.X(true);
            }
        }
    }

    public static void p(cg0 cg0Var, Context context, View view, int i10) {
        HashSet hashSet = cg0Var.v;
        yf0 yf0Var = cg0Var.f27418c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = cg0Var.B;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    int iS = yf0Var.S(i10) - 1;
                    int iQ = yf0Var.Q(i10) - 1;
                    if (iQ <= 0 || iS < 0) {
                        return;
                    }
                    bg0 bg0Var = (bg0) cg0Var.f27425x.get(iS);
                    if (iQ != bg0Var.b() || hashSet.contains(bg0Var)) {
                        return;
                    }
                    if (bg0Var.f27095e && bg0Var.f27096f < bg0Var.f27093b.size()) {
                        int iMin = Math.min(bg0Var.f27096f + 50, bg0Var.f27093b.size());
                        bg0Var.f27096f = iMin;
                        if (iMin == bg0Var.f27093b.size()) {
                            bg0Var.f27095e = false;
                        }
                        cg0Var.O(null);
                        yf0Var.X(true);
                        return;
                    }
                    hashSet.add(bg0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = cg0Var.f27423s;
                    tL_messages_getPollVotes.f22477id = cg0Var.f27421n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = bg0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = bg0Var.f27094c;
                    ConnectionsManager.getInstance(cg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.gg(16, cg0Var, bg0Var));
                    return;
                }
                if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h == null && pollVotesAlert$UserCell.f26436n == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    TLRPC.User user = pollVotesAlert$UserCell.h;
                    if (user != null) {
                        bundle.putLong("user_id", user.f22527id);
                    } else {
                        bundle.putLong("chat_id", pollVotesAlert$UserCell.f26436n.f22380id);
                    }
                    cg0Var.dismiss();
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (n2VarU instanceof org.telegram.ui.rn) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User userI = ((org.telegram.ui.rn) n2VarU).i();
                            if (userI != null && userI.f22527id == pollVotesAlert$UserCell.h.f22527id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.rn) n2VarU).f42026e;
                            if (chat != null && chat.f22380id == pollVotesAlert$UserCell.f26436n.f22380id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        }
                    }
                    n2VarU.presentFragment(profileActivity);
                }
            }
        }
    }

    public static void u(cg0 cg0Var) {
        ag.d2 d2Var = cg0Var.f27420f;
        wf0 wf0Var = cg0Var.f27417b;
        if (wf0Var.getChildCount() <= 0) {
            int paddingTop = wf0Var.getPaddingTop();
            cg0Var.A = paddingTop;
            wf0Var.setTopGlowOffset(paddingTop);
            cg0Var.containerView.invalidate();
            return;
        }
        View childAt = wf0Var.getChildAt(0);
        lk0 lk0Var = (lk0) wf0Var.G(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = iDp;
        }
        boolean z10 = top <= AndroidUtilities.dp(12.0f);
        if ((z10 && d2Var.getTag() == null) || (!z10 && d2Var.getTag() != null)) {
            d2Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = cg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                cg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            cg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = cg0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cg0Var.f27419e, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            cg0Var.h.addListener(new sz(cg0Var, 11));
            cg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wf0Var.getLayoutParams();
        int iC = org.telegram.messenger.rl.C(11.0f, layoutParams.topMargin, top);
        if (cg0Var.A != iC) {
            cg0Var.A = iC;
            wf0Var.setTopGlowOffset(iC - layoutParams.topMargin);
            cg0Var.containerView.invalidate();
        }
    }

    public final void O(View view) {
        wf0 wf0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            wf0Var = this.f27417b;
            if (i10 >= wf0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? wf0Var.getPinnedHeader() : wf0Var.getChildAt(i10);
            if ((pinnedHeader instanceof ag0) && (pinnedHeader.getTag(R.id.object_tag) instanceof bg0)) {
                ag0 ag0Var = (ag0) pinnedHeader;
                bg0 bg0Var = (bg0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f27422r;
                int size = poll.answers.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                    if (Arrays.equals(pollAnswer.option, bg0Var.d) && ((zf0) this.f27424w.get(bg0Var)) != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                        MessageObject messageObject = this.f27421n;
                        if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                            for (int i12 = 0; i12 < messageObject.messageOwner.translatedPoll.answers.size(); i12++) {
                                TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i12);
                                if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                    tL_textWithEntities = pollAnswer2.text;
                                    break;
                                }
                            }
                        }
                        ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, P(bg0Var.d), bg0Var.f27092a, bg0Var.a(), true);
                        ag0Var.setTag(R.id.object_tag, bg0Var);
                        break;
                    }
                }
            }
            i10++;
        }
        View view2 = wf0Var.f35280n1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(wf0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wf0Var.getMeasuredHeight(), 0));
            View view3 = wf0Var.f35280n1;
            view3.layout(0, 0, view3.getMeasuredWidth(), wf0Var.f35280n1.getMeasuredHeight());
            wf0Var.invalidate();
        }
        wf0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f27425x;
            if (i10 >= arrayList.size()) {
                break;
            }
            bg0 bg0Var = (bg0) arrayList.get(i10);
            if (bg0Var != null) {
                i11 += bg0Var.f27092a;
                if (Arrays.equals(bg0Var.d, bArr)) {
                    i12 += bg0Var.f27092a;
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
        HashMap map;
        HashMap map2 = this.f27424w;
        map2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f27421n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f27425x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int iMax = 0;
        while (i11 < size) {
            bg0 bg0Var = (bg0) arrayList2.get(i11);
            zf0 zf0Var = new zf0();
            arrayList.add(zf0Var);
            map2.put(bg0Var, zf0Var);
            if (tL_messageMediaPoll.results.results.isEmpty()) {
                map = map2;
                break;
                break;
            }
            int size2 = tL_messageMediaPoll.results.results.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    map = map2;
                    break;
                }
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
                map = map2;
                if (Arrays.equals(bg0Var.d, pollAnswerVoters.option)) {
                    float f10 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                    int i14 = (int) f10;
                    zf0Var.f35233a = f10 - i14;
                    if (i12 == 0) {
                        i12 = i14;
                    } else if (i14 != 0 && i12 != i14) {
                        z10 = true;
                    }
                    i10 -= i14;
                    iMax = Math.max(i14, iMax);
                    break;
                }
                i13++;
                map2 = map;
            }
            i11++;
            map2 = map;
        }
        if (!z10 || i10 == 0) {
            return;
        }
        Collections.sort(arrayList, new k9.a(26));
        int iMin = Math.min(i10, arrayList.size());
        for (int i15 = 0; i15 < iMin; i15++) {
            ((zf0) arrayList.get(i15)).getClass();
        }
    }

    public final void S() {
        Paint paint = this.C;
        if (paint == null) {
            return;
        }
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143i5, false);
        int averageColor = AndroidUtilities.getAverageColor(iW1, iW0);
        paint.setColor(iW1);
        float fDp = AndroidUtilities.dp(500.0f);
        this.G = fDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{iW1, averageColor, iW1}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
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
        s6 s6Var = new s6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27420f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27420f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27420f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27420f, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27420f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27426y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27419e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, org.telegram.ui.ActionBar.g6.f23143i5));
        int i12 = org.telegram.ui.ActionBar.g6.f23091f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 524288, new Class[]{ag0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 524288, new Class[]{ag0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 524288, new Class[]{ag0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 524304, new Class[]{ag0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23073e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27417b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        return arrayList;
    }
}
