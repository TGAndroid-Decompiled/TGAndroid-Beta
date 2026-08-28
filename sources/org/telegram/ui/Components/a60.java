package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a60 extends org.telegram.ui.ActionBar.f3 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public final v50 P;
    public final org.telegram.ui.ActionBar.o2 Q;
    public final n50 R;
    public final TextView S;
    public AnimatorSet T;
    public final View U;
    public int V;
    public boolean W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList Z;
    public final ArrayList f26676a0;
    public final TLRPC.TL_chatInviteExported f26677b;
    public final ArrayList f26678b0;
    public final HashMap f26679c;
    public final long f26680c0;
    public final TLRPC.ChatFull d;
    public final boolean f26681d0;
    public int f26682e;
    public final long f26683e0;
    public int f26684f;
    public org.telegram.ui.bb f26685f0;
    public boolean f26686g0;
    public int h;
    public boolean f26687h0;
    public int f26688n;
    public int f26689r;
    public int f26690s;
    public int v;
    public int f26691w;
    public int f26692x;
    public int f26693y;

    public a60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.o2 o2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f10;
        float f11;
        this.Z = new ArrayList();
        this.f26676a0 = new ArrayList();
        this.f26678b0 = new ArrayList();
        this.f26686g0 = true;
        this.f26687h0 = false;
        this.f26677b = tL_chatInviteExported;
        this.f26679c = hashMap;
        this.Q = o2Var;
        this.d = chatFull;
        this.f26680c0 = j10;
        this.X = z10;
        this.f26681d0 = z11;
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        setBackgroundColor(getThemedColor(i9));
        fixNavigationBar(getThemedColor(i9));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f26679c = new HashMap();
        }
        this.f26683e0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        m50 m50Var = new m50(this, context);
        this.containerView = m50Var;
        m50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.U = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        n50 n50Var = new n50(this, context);
        this.R = n50Var;
        n50Var.p1();
        n50Var.setTag(14);
        getContext();
        f2.m0 m0Var = new f2.m0(1, false);
        n50Var.setLayoutManager(m0Var);
        v50 v50Var = new v50(this);
        this.P = v50Var;
        n50Var.setAdapter(v50Var);
        n50Var.setVerticalScrollBarEnabled(false);
        n50Var.setClipToPadding(false);
        n50Var.setNestedScrollingEnabled(true);
        n50Var.setOnScrollListener(new o50(this, m0Var));
        n50Var.setOnItemClickListener(new mk0() {
            @Override
            public final void a(int i10, View view2) {
                a60.m(a60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, o2Var, i10);
            }
        });
        TextView textView = new TextView(context);
        this.S = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (!z10) {
            if (tL_chatInviteExported.expired) {
                textView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                textView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.Y = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.Y = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.Y) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        viewGroup.addView(n50Var, g7.e6.d(-1, -1.0f, 51, 0.0f, f10, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.Y) {
            f11 = 44.0f;
        } else {
            f11 = 50.0f;
        }
        viewGroup2.addView(textView, g7.e6.d(-1, f11, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0();
        W();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22521id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new w1(this, 6));
        }
        a0();
    }

    public static int A(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int C(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int D(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int F(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int H(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int I(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int J(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int K(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int L(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static void N(a60 a60Var) {
        View view = a60Var.U;
        TextView textView = a60Var.S;
        n50 n50Var = a60Var.R;
        if (n50Var.getChildCount() <= 0) {
            int paddingTop = n50Var.getPaddingTop();
            a60Var.V = paddingTop;
            n50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(a60Var.V);
            view.setTranslationY(a60Var.V);
            a60Var.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = n50Var.getChildAt(0);
        ik0 ik0Var = (ik0) n50Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && ik0Var != null && ik0Var.b() == 0) {
            a60Var.X(false);
            i9 = top;
        } else {
            a60Var.X(true);
        }
        if (a60Var.V != i9) {
            a60Var.V = i9;
            n50Var.setTopGlowOffset(i9);
            if (textView != null) {
                textView.setTranslationY(a60Var.V);
            }
            view.setTranslationY(a60Var.V);
            a60Var.containerView.invalidate();
        }
    }

    public static int P(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static int Q(a60 a60Var) {
        return a60Var.currentAccount;
    }

    public static void Y(Context context, int i9, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.b6 b6Var) {
        char c10;
        String str;
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var;
        boolean z10;
        int i10;
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, g7.e6.t(-1, -2, 7, 0, 0, 0, 10));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        if (j10 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            z8Var.r(user);
            o9Var.e(user, z8Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
        frameLayout.addView(o9Var, g7.e6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, g7.e6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, g7.e6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView h = j3.r0.h(f10, textView, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.f6.B6;
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        int i12 = tL_starsSubscriptionPricing.period;
        String str3 = "5min";
        if (i12 != 2592000) {
            str = "min";
            if (i12 == 300) {
                str2 = "5min";
            } else {
                str2 = str;
            }
            f3Var = j11;
            h.setText(gh.oa.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), str2), 0.8f, null));
        } else {
            int i13 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            h.setText(gh.oa.X0(false, LocaleController.formatString(i13, objArr), 0.8f, null));
            f3Var = j11;
        }
        TextView h10 = j3.r0.h(f10, h, g7.e6.t(-1, -2, 17, 20, 0, 20, 4), context);
        h10.setTextSize(1, 14.0f);
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            h10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i9).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i14 != 300) {
                str3 = str;
            }
            h10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i9).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), str3));
        }
        f10.addView(h10, g7.e6.t(-1, -2, 17, 20, 0, 20, 4));
        wy0 wy0Var = new wy0(context, b6Var);
        l80 l80Var = new l80(context, b6Var);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i15 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(true);
        l80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(l80Var, 24.0f, i9);
        TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        f5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new p50(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        if (!z10) {
            wy0Var.i(l80Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        wy0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i10 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i10 = R.string.StarsParticipantSubscriptionExpired;
            }
            wy0Var.c(LocaleController.getString(i10), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(wy0Var, g7.e6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        l80 l80Var2 = new l80(context, b6Var);
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new l20(context, 1)));
        l80Var2.setGravity(17);
        f10.addView(l80Var2, g7.e6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f10.addView(dVar, g7.e6.n(-1, 48));
        dVar.setOnClickListener(new h2(f3VarArr, 2));
        f3Var2.customView = f10;
        f3VarArr[0] = f3Var2;
        f3Var2.useBackgroundTopPadding = false;
        f3Var2.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void Z(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
        } else if (view instanceof e80) {
            ((e80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.b9) {
            ((org.telegram.ui.Cells.b9) view).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.va) {
            ((org.telegram.ui.Cells.va) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.a60 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.o2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a60.m(org.telegram.ui.Components.a60, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.o2, int):void");
    }

    public static void n(a60 a60Var, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        c2Var.c(400L);
        Y(context, a60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a60Var.resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.b6 y(a60 a60Var) {
        return a60Var.resourcesProvider;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a60.W():void");
    }

    public final void X(boolean z10) {
        Integer num;
        float f10;
        View view = this.U;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.S;
            if (z10) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.T;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.T = animatorSet2;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            if (!this.Y) {
                AnimatorSet animatorSet3 = this.T;
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f11));
            }
            this.T.setDuration(150L);
            this.T.addListener(new u9(12, this, z10));
            this.T.start();
        }
    }

    public final void a0() {
        TextView textView = this.S;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23126k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23143l5, false));
            if (!this.Y) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false);
        n50 n50Var = this.R;
        n50Var.setGlowColor(w02);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        int hiddenChildCount = n50Var.getHiddenChildCount();
        for (int i9 = 0; i9 < n50Var.getChildCount(); i9++) {
            Z(n50Var.getChildAt(i9));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            Z(n50Var.V(i10));
        }
        int cachedChildCount = n50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            Z(n50Var.P(i11));
        }
        int attachedScrapChildCount = n50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            Z(n50Var.O(i12));
        }
        this.containerView.invalidate();
    }

    public final void b0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.O = 0;
        this.f26689r = -1;
        this.f26690s = -1;
        this.v = -1;
        this.f26691w = -1;
        this.f26692x = -1;
        this.f26693y = -1;
        this.G = -1;
        this.H = -1;
        this.D = -1;
        this.E = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.F = -1;
        this.f26682e = -1;
        this.f26684f = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        boolean z13 = true;
        if (!this.X) {
            this.D = 0;
            this.O = 2;
            this.E = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f26677b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i9 = this.O;
            this.f26682e = i9;
            this.O = i9 + 2;
            this.f26684f = i9 + 1;
        }
        int i10 = this.O;
        this.h = i10;
        this.O = i10 + 2;
        this.f26688n = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        if (i11 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f26678b0;
        ArrayList arrayList3 = this.f26676a0;
        if (i11 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i12 = this.O;
            int i13 = i12 + 1;
            this.O = i13;
            this.f26691w = i12;
            this.f26692x = i13;
            int size2 = arrayList.size() + i13;
            this.O = size2;
            this.f26693y = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.O;
            int i15 = i14 + 1;
            this.O = i15;
            this.A = i14;
            this.B = i15;
            int size3 = arrayList3.size() + i15;
            this.O = size3;
            this.C = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i16 = this.O;
            int i17 = i16 + 1;
            this.O = i17;
            this.J = i16;
            this.K = i17;
            int size4 = arrayList2.size() + i17;
            this.O = size4;
            this.L = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i18 = this.O;
            this.f26689r = i18;
            this.F = i18 + 1;
            this.O = i18 + 3;
            this.G = i18 + 2;
        }
        this.P.l();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void show() {
        super.show();
        this.f26687h0 = false;
    }
}
