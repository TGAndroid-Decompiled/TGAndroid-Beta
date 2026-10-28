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
public final class oh0 extends org.telegram.ui.ActionBar.k3 {
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
    public final ih0 f31285b;
    public final kh0 f31286c;
    public final Drawable d;
    public final View e;
    public final b8 f31287f;
    public AnimatorSet h;
    public final MessageObject f31288n;
    public final TLRPC.Poll f31289r;
    public final TLRPC.InputPeer f31290s;
    public final HashSet v;
    public final HashMap f31291w;
    public final ArrayList f31292x;
    public final b6 f31293y;

    public oh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12;
        int i13 = 1;
        this.v = new HashSet();
        this.f31291w = new HashMap();
        this.f31292x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.f31288n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.f31289r = tL_messageMediaPoll.poll;
        this.f31290s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
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
                this.f31292x.add(new nh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.f31290s;
                tL_messages_getPollVotes.f22127id = this.f31288n.getId();
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
        Collections.sort(this.f31292x, new gh0(this));
        U();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i5, false), PorterDuff.Mode.MULTIPLY));
        hh0 hh0Var = new hh0(this, context);
        this.containerView = hh0Var;
        hh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i18, 0, i18, 0);
        ih0 ih0Var = new ih0(this, context);
        this.f31285b = ih0Var;
        ih0Var.setSections(false);
        s4.l lVar = new s4.l();
        lVar.f47838c = 150L;
        lVar.e = 350L;
        lVar.f47839f = 0L;
        lVar.f47840g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.f47841i = new OvershootInterpolator(1.1f);
        lVar.f47822o = ds.h;
        ih0Var.setItemAnimator(lVar);
        ih0Var.setClipToPadding(false);
        getContext();
        ih0Var.setLayoutManager(new ig.a0(i13, false, 9));
        ih0Var.setHorizontalScrollBarEnabled(false);
        ih0Var.setVerticalScrollBarEnabled(false);
        ih0Var.setSectionsType(2);
        this.containerView.addView(ih0Var, kb1.i(-1, -1, 51));
        kh0 kh0Var = new kh0(this, context);
        this.f31286c = kh0Var;
        ih0Var.setAdapter(kh0Var);
        org.telegram.ui.ActionBar.f7.m(ih0Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        ih0Var.setOnItemClickListener(new di.x4(13, this, context));
        ih0Var.setOnScrollListener(new ml(this, 9));
        b6 b6Var = new b6(context);
        this.f31293y = b6Var;
        b6Var.setTextSize(1, 18.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i19 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(b6Var, i19, null);
        b6Var.setTag(-33024);
        b6Var.setLayoutParams(new s4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.f31289r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.f31288n;
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
        this.f31287f = b8Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23428h5, b8Var, null);
        b8Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.f7.m(b8Var, 1, i19, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 3, org.telegram.ui.ActionBar.y6.I5, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 5, i19, null);
        org.telegram.ui.ActionBar.f7.m(b8Var, 6, org.telegram.ui.ActionBar.y6.Pi, null);
        b8Var.setOccupyStatusBar(false);
        b8Var.setAlpha(0.0f);
        b8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.f31289r.quiz) {
            b8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            b8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(b8Var, kb1.g(-2.0f, -1));
        b8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 15));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        this.containerView.addView(view, kb1.g(1.0f, -1));
    }

    public static int A(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int B(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static int C(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int D(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static int F(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int G(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static int H(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static int I(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int J(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static ViewGroup K(oh0 oh0Var) {
        return oh0Var.containerView;
    }

    public static org.telegram.ui.ActionBar.u6 L(oh0 oh0Var) {
        return oh0Var.resourcesProvider;
    }

    public static boolean O(oh0 oh0Var) {
        return oh0Var.isFullscreen;
    }

    public static int P(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static void m(oh0 oh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        s4.e1 T;
        kh0 kh0Var = oh0Var.f31286c;
        ArrayList arrayList2 = oh0Var.f31292x;
        ih0 ih0Var = oh0Var.f31285b;
        ArrayList arrayList3 = oh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            MessagesController.getInstance(oh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new nh0(tL_messages_votesList, pollAnswerVoters.option));
            }
            if (arrayList3.isEmpty()) {
                int size = arrayList.size();
                boolean z10 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    nh0 nh0Var = (nh0) arrayList.get(i11);
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            nh0 nh0Var2 = (nh0) arrayList2.get(i12);
                            if (Arrays.equals(nh0Var.d, nh0Var2.d)) {
                                nh0Var2.f30921c = nh0Var.f30921c;
                                z10 = (nh0Var2.f30919a == nh0Var.f30919a && nh0Var2.f30920b.size() == nh0Var.f30920b.size()) ? true : true;
                                nh0Var2.f30919a = nh0Var.f30919a;
                                nh0Var2.f30920b = nh0Var.f30920b;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                oh0Var.L = false;
                if (ih0Var != null) {
                    if (oh0Var.currentSheetAnimationType == 0 && oh0Var.startAnimationRunnable == null && !z10) {
                        int childCount = ih0Var.getChildCount();
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = ih0Var.getChildAt(i13);
                            if (childAt instanceof PollVotesAlert$UserCell) {
                                View F = ih0Var.F(childAt);
                                if (F == null) {
                                    T = null;
                                } else {
                                    T = ih0Var.T(F);
                                }
                                if (T != null) {
                                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                    pollVotesAlert$UserCell.E = arrayList4;
                                    pollVotesAlert$UserCell.setEnabled(true);
                                    kh0Var.y(T);
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
                        oh0Var.L = false;
                        return;
                    }
                    if (z10) {
                        oh0Var.T();
                    }
                    kh0Var.X(false);
                    return;
                }
                return;
            }
            return;
        }
        oh0Var.dismiss();
    }

    public static void n(oh0 oh0Var, nh0 nh0Var, TLObject tLObject) {
        if (oh0Var.isShowing()) {
            oh0Var.v.remove(nh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(oh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                nh0Var.f30920b.addAll(tL_messages_votesList.votes);
                nh0Var.f30921c = tL_messages_votesList.next_offset;
                oh0Var.Q(null);
                oh0Var.f31286c.X(true);
            }
        }
    }

    public static void o(oh0 oh0Var, Context context, View view, int i10) {
        HashSet hashSet = oh0Var.v;
        kh0 kh0Var = oh0Var.f31286c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = oh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    int S = kh0Var.S(i10) - 1;
                    int Q = kh0Var.Q(i10) - 1;
                    if (Q > 0 && S >= 0) {
                        nh0 nh0Var = (nh0) oh0Var.f31292x.get(S);
                        if (Q == nh0Var.b() && !hashSet.contains(nh0Var)) {
                            if (nh0Var.e && nh0Var.f30922f < nh0Var.f30920b.size()) {
                                int min = Math.min(nh0Var.f30922f + 50, nh0Var.f30920b.size());
                                nh0Var.f30922f = min;
                                if (min == nh0Var.f30920b.size()) {
                                    nh0Var.e = false;
                                }
                                oh0Var.Q(null);
                                kh0Var.X(true);
                                return;
                            }
                            hashSet.add(nh0Var);
                            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                            tL_messages_getPollVotes.peer = oh0Var.f31290s;
                            tL_messages_getPollVotes.f22127id = oh0Var.f31288n.getId();
                            tL_messages_getPollVotes.limit = 50;
                            int i12 = tL_messages_getPollVotes.flags;
                            tL_messages_getPollVotes.option = nh0Var.d;
                            tL_messages_getPollVotes.flags = i12 | 3;
                            tL_messages_getPollVotes.offset = nh0Var.f30921c;
                            ConnectionsManager.getInstance(oh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.z7(20, oh0Var, nh0Var));
                        }
                    }
                } else if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h != null || pollVotesAlert$UserCell.f26212n != null) {
                        Bundle bundle = new Bundle();
                        TLRPC.User user = pollVotesAlert$UserCell.h;
                        if (user != null) {
                            bundle.putLong("user_id", user.f22177id);
                        } else {
                            bundle.putLong("chat_id", pollVotesAlert$UserCell.f26212n.f22028id);
                        }
                        oh0Var.dismiss();
                        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                        if (U != null) {
                            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                            if (U instanceof org.telegram.ui.wn) {
                                if (pollVotesAlert$UserCell.h != null) {
                                    TLRPC.User i13 = ((org.telegram.ui.wn) U).i();
                                    oh0Var.f31285b.getChildAt(0);
                                    if (i13 != null && i13.f22177id == pollVotesAlert$UserCell.h.f22177id) {
                                        i11 = 1;
                                    }
                                    profileActivity.X4(i11);
                                } else {
                                    TLRPC.Chat chat = ((org.telegram.ui.wn) U).e;
                                    if (chat != null && chat.f22028id == pollVotesAlert$UserCell.f26212n.f22028id) {
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

    public static ViewGroup p(oh0 oh0Var) {
        return oh0Var.containerView;
    }

    public static ViewGroup q(oh0 oh0Var) {
        return oh0Var.containerView;
    }

    public static int r(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static int s(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int t(oh0 oh0Var) {
        return oh0Var.backgroundPaddingLeft;
    }

    public static void u(oh0 oh0Var) {
        boolean z10;
        Integer num;
        float f7;
        b8 b8Var = oh0Var.f31287f;
        ih0 ih0Var = oh0Var.f31285b;
        if (ih0Var.getChildCount() <= 0) {
            int paddingTop = ih0Var.getPaddingTop();
            oh0Var.E = paddingTop;
            ih0Var.setTopGlowOffset(paddingTop);
            oh0Var.containerView.invalidate();
            return;
        }
        View childAt = ih0Var.getChildAt(0);
        wl0 wl0Var = (wl0) ih0Var.G(childAt);
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
            AnimatorSet animatorSet = oh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                oh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            oh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = oh0Var.h;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b8Var, property, f7);
            View view = oh0Var.e;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f10));
            oh0Var.h.addListener(new i10(oh0Var, 11));
            oh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ih0Var.getLayoutParams();
        int w10 = org.telegram.ui.d3.w(11.0f, layoutParams.topMargin, top);
        if (oh0Var.E != w10) {
            oh0Var.E = w10;
            ih0Var.setTopGlowOffset(w10 - layoutParams.topMargin);
            oh0Var.containerView.invalidate();
        }
    }

    public static int v(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int w(oh0 oh0Var) {
        return oh0Var.currentSheetAnimationType;
    }

    public static int x(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public static int y(oh0 oh0Var) {
        return oh0Var.backgroundPaddingTop;
    }

    public final void Q(View view) {
        ih0 ih0Var;
        View childAt;
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            ih0Var = this.f31285b;
            int i11 = 0;
            if (i10 >= ih0Var.getChildCount()) {
                break;
            }
            if (i10 == -2) {
                childAt = view;
            } else if (i10 == -1) {
                childAt = ih0Var.getPinnedHeader();
            } else {
                childAt = ih0Var.getChildAt(i10);
            }
            if ((childAt instanceof mh0) && (childAt.getTag(R.id.object_tag) instanceof nh0)) {
                mh0 mh0Var = (mh0) childAt;
                nh0 nh0Var = (nh0) childAt.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.f31289r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (Arrays.equals(pollAnswer.option, nh0Var.d) && ((lh0) this.f31291w.get(nh0Var)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.f31288n;
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
                            mh0Var.a(str2, arrayList, R(nh0Var.d), nh0Var.f30919a, nh0Var.a(), true);
                            mh0Var.setTag(R.id.object_tag, nh0Var);
                        } else {
                            i12++;
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = ih0Var.f30991p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ih0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ih0Var.getMeasuredHeight(), 0));
            View view3 = ih0Var.f30991p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ih0Var.f30991p1.getMeasuredHeight());
            ih0Var.invalidate();
        }
        ih0Var.invalidate();
    }

    public final int R(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f31292x;
            if (i10 >= arrayList.size()) {
                break;
            }
            nh0 nh0Var = (nh0) arrayList.get(i10);
            if (nh0Var != null) {
                i11 += nh0Var.f30919a;
                if (Arrays.equals(nh0Var.d, bArr)) {
                    i12 += nh0Var.f30919a;
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
        HashMap hashMap2 = this.f31291w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.f31288n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31292x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            nh0 nh0Var = (nh0) arrayList2.get(i11);
            ?? obj = new Object();
            arrayList.add(obj);
            hashMap2.put(nh0Var, obj);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i14);
                    hashMap = hashMap2;
                    if (Arrays.equals(nh0Var.d, pollAnswerVoters.option)) {
                        float f7 = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        obj.f30252a = f7 - i15;
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
                ((lh0) arrayList.get(i16)).getClass();
            }
        }
    }

    public final void U() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i5, false);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377e7));
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
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        arrayList.add(new org.telegram.ui.ActionBar.h7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f31287f, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23465j5));
        ih0 ih0Var = this.f31285b;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ih0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ih0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, b7Var, org.telegram.ui.ActionBar.y6.f23448i5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ih0Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23598q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(ih0Var, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23448i5, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
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
