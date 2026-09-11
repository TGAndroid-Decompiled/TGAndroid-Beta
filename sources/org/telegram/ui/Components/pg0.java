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
public final class pg0 extends org.telegram.ui.ActionBar.f3 {
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
    public final jg0 f29370b;
    public final lg0 f29371c;
    public final Drawable d;
    public final View f29372e;
    public final z7 f29373f;
    public AnimatorSet h;
    public final MessageObject f29374n;
    public final TLRPC.Poll f29375r;
    public final TLRPC.InputPeer f29376s;
    public final HashSet v;
    public final HashMap f29377w;
    public final ArrayList f29378x;
    public final y5 f29379y;

    public pg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        this.v = new HashSet();
        this.f29377w = new HashMap();
        this.f29378x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f29374n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f29375r = tL_messageMediaPoll.poll;
        this.f29376s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f29378x.add(new og0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f29376s;
                tL_messages_getPollVotes.f19966id = this.f29374n.getId();
                if (pollAnswerVoters.voters <= 15) {
                    i11 = 15;
                } else {
                    i11 = 10;
                }
                tL_messages_getPollVotes.limit = i11;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new bi.fa(this, numArr, i12, arrayList, pollAnswerVoters, 5)));
                numArr[i12] = valueOf;
                this.F.add(valueOf);
            }
            i12++;
        }
        R();
        Collections.sort(this.f29378x, new hg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20752i5, false), PorterDuff.Mode.MULTIPLY));
        ig0 ig0Var = new ig0(this, context);
        this.containerView = ig0Var;
        ig0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
        jg0 jg0Var = new jg0(this, context);
        this.f29370b = jg0Var;
        jg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.f45828c = 150L;
        jVar.f45829e = 350L;
        jVar.f45830f = 0L;
        jVar.f45831g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.f45832i = new OvershootInterpolator(1.1f);
        jVar.f45803o = pr.h;
        jg0Var.setItemAnimator(jVar);
        jg0Var.setClipToPadding(false);
        getContext();
        jg0Var.setLayoutManager(new hg.b0(1, false, 9));
        jg0Var.setHorizontalScrollBarEnabled(false);
        jg0Var.setVerticalScrollBarEnabled(false);
        jg0Var.setSectionsType(2);
        this.containerView.addView(jg0Var, w7.x5.e(-1, -1, 51));
        lg0 lg0Var = new lg0(this, context);
        this.f29371c = lg0Var;
        jg0Var.setAdapter(lg0Var);
        jg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        jg0Var.setOnItemClickListener(new bi.x5(13, this, context));
        jg0Var.setOnScrollListener(new lb0(this, 1));
        y5 y5Var = new y5(context);
        this.f29379y = y5Var;
        y5Var.setTextSize(1, 18.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i17 = org.telegram.ui.ActionBar.j6.f20770j5;
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        y5Var.setTag(-33024);
        y5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f29375r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f29374n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(y5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, y5Var.getPaint().getFontMetricsInt());
            y5Var.setText(replaceEmoji);
        }
        z7 z7Var = new z7(this, context, 2);
        this.f29373f = z7Var;
        z7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        z7Var.C(org.telegram.ui.ActionBar.j6.w0(null, i17, false), false);
        z7Var.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        z7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        z7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        z7Var.setOccupyStatusBar(false);
        z7Var.setAlpha(0.0f);
        z7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f29375r.quiz) {
            z7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            z7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(z7Var, w7.x5.c(-2.0f, -1));
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 12));
        View view = new View(context);
        this.f29372e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.x5.c(1.0f, -1));
    }

    public static int A(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static int B(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int C(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static int D(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int F(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static int G(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static int H(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int I(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static ViewGroup J(pg0 pg0Var) {
        return pg0Var.containerView;
    }

    public static boolean L(pg0 pg0Var) {
        return pg0Var.isFullscreen;
    }

    public static int M(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static int N(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static void m(pg0 pg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.c1 T;
        lg0 lg0Var = pg0Var.f29371c;
        ArrayList arrayList2 = pg0Var.f29378x;
        jg0 jg0Var = pg0Var.f29370b;
        ArrayList arrayList3 = pg0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(pg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new og0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    og0 og0Var = (og0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            og0 og0Var2 = (og0) arrayList2.get(i12);
                            if (Arrays.equals(og0Var.d, og0Var2.d)) {
                                og0Var2.f29047c = og0Var.f29047c;
                                z10 = (og0Var2.f29045a == og0Var.f29045a && og0Var2.f29046b.size() == og0Var.f29046b.size()) ? true : true;
                                og0Var2.f29045a = og0Var.f29045a;
                                og0Var2.f29046b = og0Var.f29046b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                pg0Var.L = false;
                if (jg0Var != null) {
                    if (pg0Var.currentSheetAnimationType == 0 && pg0Var.startAnimationRunnable == null && !z10) {
                        int childCount = jg0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = jg0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = jg0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = jg0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    lg0Var.y(T);
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
                        pg0Var.L = false;
                        return;
                    }
                    if (z10) {
                        pg0Var.R();
                    }
                    lg0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        pg0Var.dismiss();
    }

    public static void n(pg0 pg0Var, og0 og0Var, TLObject tLObject) {
        if (pg0Var.isShowing()) {
            pg0Var.v.remove(og0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(pg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                og0Var.f29046b.addAll(tL_messages_votesList.votes);
                og0Var.f29047c = tL_messages_votesList.next_offset;
                pg0Var.O(null);
                pg0Var.f29371c.X(true);
            }
        }
    }

    public static void o(pg0 pg0Var, Context context, View view, int i10) {
        HashSet hashSet = pg0Var.v;
        lg0 lg0Var = pg0Var.f29371c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = pg0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = lg0Var.S(i10) - 1;
                    int Q = lg0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        og0 og0Var = (og0) pg0Var.f29378x.get(S);
                        if (Q == og0Var.b() && !hashSet.contains(og0Var)) {
                            if (og0Var.f29048e && og0Var.f29049f < og0Var.f29046b.size()) {
                                int min = Math.min(og0Var.f29049f + 50, og0Var.f29046b.size());
                                og0Var.f29049f = min;
                                if (min == og0Var.f29046b.size()) {
                                    og0Var.f29048e = false;
                                }
                                pg0Var.O(null);
                                lg0Var.X(true);
                                return;
                            }
                            hashSet.add(og0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = pg0Var.f29376s;
                            tL_messages_getPollVotes.f19966id = pg0Var.f29374n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = og0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = og0Var.f29047c;
                            ConnectionsManager.getInstance(pg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.ro(12, pg0Var, og0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f24038n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f20016id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f24038n.f19869id);
                        }
                        pg0Var.dismiss();
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.co) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.co) U).i();
                                    if (i13 != null && i13.f20016id == pollVotesAlert$UserCell.h.f20016id) {
                                        i11 = 1;
                                    }
                                    profileActivity.N4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.co) U).f35237e;
                                    if (chat != null && chat.f19869id == pollVotesAlert$UserCell.f24038n.f19869id) {
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

    public static ViewGroup p(pg0 pg0Var) {
        return pg0Var.containerView;
    }

    public static ViewGroup q(pg0 pg0Var) {
        return pg0Var.containerView;
    }

    public static int r(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int s(pg0 pg0Var) {
        return pg0Var.backgroundPaddingLeft;
    }

    public static void t(pg0 pg0Var) {
        boolean z10;
        Integer num;
        float f7;
        z7 z7Var = pg0Var.f29373f;
        jg0 jg0Var = pg0Var.f29370b;
        if (jg0Var.getChildCount() <= 0) {
            int paddingTop = jg0Var.getPaddingTop();
            pg0Var.E = paddingTop;
            jg0Var.setTopGlowOffset(paddingTop);
            pg0Var.containerView.invalidate();
            return;
        }
        View childAt = jg0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jg0Var.G(childAt);
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
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            z7Var.setTag(num);
            AnimatorSet animatorSet = pg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                pg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            pg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = pg0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z7Var, property, f7);
            View view = pg0Var.f29372e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            pg0Var.h.addListener(new r80(pg0Var, 6));
            pg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jg0Var.getLayoutParams();
        int D = org.telegram.messenger.vl.D(11.0f, layoutParams.topMargin, top);
        if (pg0Var.E != D) {
            pg0Var.E = D;
            jg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            pg0Var.containerView.invalidate();
        }
    }

    public static int u(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int v(pg0 pg0Var) {
        return pg0Var.currentSheetAnimationType;
    }

    public static int w(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int x(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public static int y(pg0 pg0Var) {
        return pg0Var.backgroundPaddingTop;
    }

    public final void O(View view) {
        jg0 jg0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            jg0Var = this.f29370b;
            int i11 = 0;
            if (i10 >= jg0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = jg0Var.getPinnedHeader();
            } else {
                childAt = jg0Var.getChildAt(i10);
            }
            if ((childAt instanceof ng0) && (childAt.getTag(R.id.object_tag) instanceof og0)) {
                ng0 ng0Var = (ng0) childAt;
                og0 og0Var = (og0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f29375r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, og0Var.d) && ((mg0) this.f29377w.get(og0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f29374n;
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
                            ng0Var.a(str2, arrayList, P(og0Var.d), og0Var.f29045a, og0Var.a(), true);
                            ng0Var.setTag(R.id.object_tag, og0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = jg0Var.f28227r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(jg0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(jg0Var.getMeasuredHeight(), 0));
            View view3 = jg0Var.f28227r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), jg0Var.f28227r1.getMeasuredHeight());
            jg0Var.invalidate();
        }
        jg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f29378x;
            if (i10 >= arrayList.size()) {
                break;
            }
            og0 og0Var = (og0) arrayList.get(i10);
            if (og0Var != null) {
                i11 += og0Var.f29045a;
                if (Arrays.equals(og0Var.d, bArr)) {
                    i12 += og0Var.f29045a;
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
        HashMap hashMap2 = this.f29377w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f29374n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f29378x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            og0 og0Var = (og0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(og0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(og0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f28446a = f7 - i15;
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
            Collections.sort(arrayList, new org.telegram.ui.f6(14));
            int min = Math.min(i10, arrayList.size());
            for (int i16 = 0; i16 < min; i16++) {
                ((mg0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20752i5, false);
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
        z6 z6Var = new z6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29373f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29373f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29373f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29373f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29373f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29379y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29372e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, org.telegram.ui.ActionBar.j6.f20752i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 524288, new Class[]{ng0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 524288, new Class[]{ng0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 524288, new Class[]{ng0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 524304, new Class[]{ng0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29370b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }
}
