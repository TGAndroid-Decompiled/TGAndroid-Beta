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
public final class t60 extends org.telegram.ui.ActionBar.g3 {
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
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public final o60 Q;
    public final org.telegram.ui.ActionBar.p2 R;
    public final g60 S;
    public final TextView T;
    public AnimatorSet U;
    public final View V;
    public int W;
    public boolean X;
    public final boolean Y;
    public final boolean Z;
    public final ArrayList f28906a0;
    public final TLRPC.TL_chatInviteExported f28907b;
    public final ArrayList f28908b0;
    public final HashMap f28909c;
    public final ArrayList f28910c0;
    public final TLRPC.ChatFull d;
    public final long f28911d0;
    public int e;
    public final boolean f28912e0;
    public int f28913f;
    public final long f28914f0;
    public org.telegram.ui.gb f28915g0;
    public int h;
    public boolean f28916h0;
    public boolean f28917i0;
    public int f28918n;
    public int f28919r;
    public int f28920s;
    public int v;
    public int f28921w;
    public int f28922x;
    public int f28923y;

    public t60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.p2 p2Var, final long j10, boolean z4, boolean z10) {
        super(context, false);
        float f10;
        float f11;
        this.f28906a0 = new ArrayList();
        this.f28908b0 = new ArrayList();
        this.f28910c0 = new ArrayList();
        this.f28916h0 = true;
        this.f28917i0 = false;
        this.f28907b = tL_chatInviteExported;
        this.f28909c = hashMap;
        this.R = p2Var;
        this.d = chatFull;
        this.f28911d0 = j10;
        this.Y = z4;
        this.f28912e0 = z10;
        int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f28909c = new HashMap();
        }
        this.f28914f0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        f60 f60Var = new f60(this, context);
        this.containerView = f60Var;
        f60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.V = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        g60 g60Var = new g60(this, context);
        this.S = g60Var;
        g60Var.o1();
        g60Var.setTag(14);
        getContext();
        f2.i0 i0Var = new f2.i0(1, false);
        g60Var.setLayoutManager(i0Var);
        o60 o60Var = new o60(this);
        this.Q = o60Var;
        g60Var.setAdapter(o60Var);
        g60Var.setVerticalScrollBarEnabled(false);
        g60Var.setClipToPadding(false);
        g60Var.setNestedScrollingEnabled(true);
        g60Var.setOnScrollListener(new h60(this, i0Var));
        g60Var.setOnItemClickListener(new hl0() {
            @Override
            public final void d(int i11, View view2) {
                t60.m(t60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, p2Var, i11);
            }
        });
        TextView textView = new TextView(context);
        this.T = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        if (!z4) {
            if (tL_chatInviteExported.expired) {
                textView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                textView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.Z = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.Z = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.Z) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        viewGroup.addView(g60Var, k7.b6.d(-1, -1.0f, 51, 0.0f, f10, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.Z) {
            f11 = 44.0f;
        } else {
            f11 = 50.0f;
        }
        viewGroup2.addView(textView, k7.b6.d(-1, f11, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f19300id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        b0();
    }

    public static int G(t60 t60Var) {
        return t60Var.currentAccount;
    }

    public static void O(t60 t60Var) {
        View view = t60Var.V;
        TextView textView = t60Var.T;
        g60 g60Var = t60Var.S;
        if (g60Var.getChildCount() <= 0) {
            int paddingTop = g60Var.getPaddingTop();
            t60Var.W = paddingTop;
            g60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(t60Var.W);
            view.setTranslationY(t60Var.W);
            t60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = g60Var.getChildAt(0);
        dl0 dl0Var = (dl0) g60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && dl0Var != null && dl0Var.b() == 0) {
            t60Var.Y(false);
            i10 = top;
        } else {
            t60Var.Y(true);
        }
        if (t60Var.W != i10) {
            t60Var.W = i10;
            g60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(t60Var.W);
            }
            view.setTranslationY(t60Var.W);
            t60Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.f6 f6Var) {
        char c3;
        String str;
        String str2;
        org.telegram.ui.ActionBar.g3 g3Var;
        boolean z4;
        int i11;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, k7.b6.t(-1, -2, 7, 0, 0, 0, 10));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        if (j10 >= 0) {
            c3 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            z8Var.r(user);
            p9Var.e(user, z8Var);
        } else {
            c3 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        frameLayout.addView(p9Var, k7.b6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, k7.b6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, k7.b6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.f19987j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView i12 = org.telegram.ui.ai.i(f10, textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i12.setTextSize(1, 14.0f);
        i12.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.j6.B6;
        i12.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        String str3 = "5min";
        if (i14 != 2592000) {
            str = "min";
            if (i14 == 300) {
                str2 = "5min";
            } else {
                str2 = str;
            }
            g3Var = o10;
            i12.setText(lh.ja.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), str2), 0.8f, null));
        } else {
            int i15 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c3] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            i12.setText(lh.ja.X0(false, LocaleController.formatString(i15, objArr), 0.8f, null));
            g3Var = o10;
        }
        TextView i16 = org.telegram.ui.ai.i(f10, i12, k7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i16.setTextSize(1, 14.0f);
        i16.setGravity(17);
        i16.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            i16.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i17 != 300) {
                str3 = str;
            }
            i16.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), str3));
        }
        f10.addView(i16, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
        sz0 sz0Var = new sz0(context, f6Var);
        f90 f90Var = new f90(context, f6Var);
        f90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        f90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.j6.f19941gc;
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        f90Var.setTextSize(1, 14.0f);
        f90Var.setSingleLine(true);
        f90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(f90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        String userName = UserObject.getUserName(user2);
        k5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new i60(g3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        f90Var.setText(spannableStringBuilder);
        if (!z4) {
            sz0Var.i(f90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
        sz0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i11 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i11 = R.string.StarsParticipantSubscriptionExpired;
            }
            sz0Var.c(LocaleController.getString(i11), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(sz0Var, k7.b6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        f90 f90Var2 = new f90(context, f6Var);
        f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20273z6, f6Var));
        f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        f90Var2.setTextSize(1, 14.0f);
        f90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new d30(context, 1)));
        f90Var2.setGravity(17);
        f10.addView(f90Var2, k7.b6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f10.addView(dVar, k7.b6.n(-1, 48));
        dVar.setOnClickListener(new i2(g3VarArr, 2));
        g3Var2.customView = f10;
        g3VarArr[0] = g3Var2;
        g3Var2.useBackgroundTopPadding = false;
        g3Var2.fixNavigationBar();
        g3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.l4) {
            ((org.telegram.ui.Cells.l4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
        } else if (view instanceof x80) {
            ((x80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.ua) {
            ((org.telegram.ui.Cells.ua) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.t60 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.p2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t60.m(org.telegram.ui.Components.t60, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.p2, int):void");
    }

    public static void n(t60 t60Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        d2Var.c(400L);
        Z(context, t60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, t60Var.resourcesProvider);
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t60.X():void");
    }

    public final void Y(boolean z4) {
        Integer num;
        float f10;
        View view = this.V;
        if ((z4 && view.getTag() != null) || (!z4 && view.getTag() == null)) {
            if (z4) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.T;
            if (z4) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.U;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.U = animatorSet2;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            if (!this.Z) {
                AnimatorSet animatorSet3 = this.U;
                if (z4) {
                    f11 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f11));
            }
            this.U.setDuration(150L);
            this.U.addListener(new m00(4, this, z4));
            this.U.start();
        }
    }

    public final void b0() {
        TextView textView = this.T;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20023l5, false));
            if (!this.Z) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false);
        g60 g60Var = this.S;
        g60Var.setGlowColor(w02);
        this.V.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        int hiddenChildCount = g60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < g60Var.getChildCount(); i10++) {
            a0(g60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(g60Var.V(i11));
        }
        int cachedChildCount = g60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(g60Var.P(i12));
        }
        int attachedScrapChildCount = g60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(g60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z4;
        boolean z10;
        boolean z11 = false;
        this.P = 0;
        this.f28919r = -1;
        this.f28920s = -1;
        this.v = -1;
        this.f28921w = -1;
        this.f28922x = -1;
        this.f28923y = -1;
        this.H = -1;
        this.I = -1;
        this.E = -1;
        this.F = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.G = -1;
        this.e = -1;
        this.f28913f = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        boolean z12 = true;
        if (!this.Y) {
            this.E = 0;
            this.P = 2;
            this.F = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f28907b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.P;
            this.e = i10;
            this.P = i10 + 2;
            this.f28913f = i10 + 1;
        }
        int i11 = this.P;
        this.h = i11;
        this.P = i11 + 2;
        this.f28918n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ArrayList arrayList = this.f28906a0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28910c0;
        ArrayList arrayList3 = this.f28908b0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.P;
            int i14 = i13 + 1;
            this.P = i14;
            this.f28921w = i13;
            this.f28922x = i14;
            int size2 = arrayList.size() + i14;
            this.P = size2;
            this.f28923y = size2;
            z11 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.P;
            int i16 = i15 + 1;
            this.P = i16;
            this.B = i15;
            this.C = i16;
            int size3 = arrayList3.size() + i16;
            this.P = size3;
            this.D = size3;
            z11 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.P;
            int i18 = i17 + 1;
            this.P = i18;
            this.K = i17;
            this.L = i18;
            int size4 = arrayList2.size() + i18;
            this.P = size4;
            this.M = size4;
        } else {
            z12 = z11;
        }
        if ((z4 || z10) && !z12) {
            int i19 = this.P;
            this.f28919r = i19;
            this.G = i19 + 1;
            this.P = i19 + 3;
            this.H = i19 + 2;
        }
        this.Q.l();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void show() {
        super.show();
        this.f28917i0 = false;
    }
}
