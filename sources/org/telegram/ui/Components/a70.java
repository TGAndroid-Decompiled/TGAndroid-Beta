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
public final class a70 extends org.telegram.ui.ActionBar.h3 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public final v60 T;
    public final org.telegram.ui.ActionBar.p2 U;
    public final n60 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f21397a0;
    public final TLRPC.TL_chatInviteExported f21398b;
    public final boolean f21399b0;
    public final HashMap f21400c;
    public final boolean f21401c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f21402d0;
    public int e;
    public final ArrayList f21403e0;
    public int f21404f;
    public final ArrayList f21405f0;
    public final long f21406g0;
    public int h;
    public final boolean f21407h0;
    public final long f21408i0;
    public org.telegram.ui.jb f21409j0;
    public boolean f21410k0;
    public boolean f21411l0;
    public int f21412n;
    public int f21413r;
    public int f21414s;
    public int v;
    public int f21415w;
    public int f21416x;
    public int f21417y;

    public a70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.p2 p2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        float f10;
        this.f21402d0 = new ArrayList();
        this.f21403e0 = new ArrayList();
        this.f21405f0 = new ArrayList();
        this.f21410k0 = true;
        this.f21411l0 = false;
        this.f21398b = tL_chatInviteExported;
        this.f21400c = hashMap;
        this.U = p2Var;
        this.d = chatFull;
        this.f21406g0 = j3;
        this.f21399b0 = z10;
        this.f21407h0 = z11;
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f21400c = new HashMap();
        }
        this.f21408i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        m60 m60Var = new m60(this, context);
        this.containerView = m60Var;
        m60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        n60 n60Var = new n60(this, context);
        this.V = n60Var;
        n60Var.o1();
        n60Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        n60Var.setLayoutManager(c0Var);
        v60 v60Var = new v60(this);
        this.T = v60Var;
        n60Var.setAdapter(v60Var);
        n60Var.setVerticalScrollBarEnabled(false);
        n60Var.setClipToPadding(false);
        n60Var.setNestedScrollingEnabled(true);
        n60Var.setOnScrollListener(new o60(this, c0Var));
        n60Var.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i11, View view2) {
                a70.m(a70.this, tL_chatInviteExported, hashMap, chatFull, context, j3, p2Var, i11);
            }
        });
        TextView textView = new TextView(context);
        this.W = textView;
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
            this.f21401c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f21401c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f21401c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(n60Var, w7.a6.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.f21401c0) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        viewGroup2.addView(textView, w7.a6.d(-1, f10, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f17336id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new z1(this, 6));
        }
        b0();
    }

    public static void O(a70 a70Var) {
        View view = a70Var.Y;
        TextView textView = a70Var.W;
        n60 n60Var = a70Var.V;
        if (n60Var.getChildCount() <= 0) {
            int paddingTop = n60Var.getPaddingTop();
            a70Var.Z = paddingTop;
            n60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(a70Var.Z);
            view.setTranslationY(a70Var.Z);
            a70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = n60Var.getChildAt(0);
        fl0 fl0Var = (fl0) n60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            a70Var.Y(false);
            i10 = top;
        } else {
            a70Var.Y(true);
        }
        if (a70Var.Z != i10) {
            a70Var.Z = i10;
            n60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(a70Var.Z);
            }
            view.setTranslationY(a70Var.Z);
            a70Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.f6 f6Var) {
        char c10;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.h3 i13 = org.telegram.messenger.em.i(1, context, f6Var, false);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f7.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 10));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        if (j3 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            g9Var.r(user);
            w9Var.e(user, g9Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
        frameLayout.addView(w9Var, w7.a6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, w7.a6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.a6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.x(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g10.setTextSize(1, 14.0f);
        g10.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.B6;
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 != 2592000) {
            obj = "min";
            if (i15 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            i11 = i14;
            g10.setText(xh.z7.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), obj2), 0.8f, null));
        } else {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            g10.setText(xh.z7.X0(false, LocaleController.formatString(i16, objArr), 0.8f, null));
            i11 = i14;
        }
        TextView g11 = com.google.android.gms.internal.vision.e2.g(f7, g10, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g11.setTextSize(1, 14.0f);
        g11.setGravity(17);
        g11.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            g11.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i17 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            g11.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        f7.addView(g11, w7.a6.t(-1, -2, 17, 20, 0, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        m90 m90Var = new m90(context, f6Var);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(true);
        m90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(m90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        g5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new p60(h3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        if (!z10) {
            b01Var.i(m90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        b01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            b01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f7.addView(b01Var, w7.a6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        m90 m90Var2 = new m90(context, f6Var);
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new l30(context, 1)));
        m90Var2.setGravity(17);
        f7.addView(m90Var2, w7.a6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f7.addView(dVar, w7.a6.n(-1, 48));
        dVar.setOnClickListener(new l2(h3VarArr, 2));
        i13.customView = f7;
        h3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        h3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
        } else if (view instanceof f90) {
            ((f90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.f9) {
            ((org.telegram.ui.Cells.f9) view).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.bb) {
            ((org.telegram.ui.Cells.bb) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.a70 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.p2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a70.m(org.telegram.ui.Components.a70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.p2, int):void");
    }

    public static void n(a70 a70Var, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        d2Var.c(400L);
        Z(context, a70Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, a70Var.resourcesProvider);
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a70.X():void");
    }

    public final void Y(boolean z10) {
        Integer num;
        float f7;
        View view = this.Y;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.W;
            if (z10) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.X;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.X = animatorSet2;
            Property property = View.ALPHA;
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            if (!this.f21401c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new yo(8, this, z10));
            this.X.start();
        }
    }

    public final void b0() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18054k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18072l5, false));
            if (!this.f21401c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false);
        n60 n60Var = this.V;
        n60Var.setGlowColor(w02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        int hiddenChildCount = n60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < n60Var.getChildCount(); i10++) {
            a0(n60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(n60Var.V(i11));
        }
        int cachedChildCount = n60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(n60Var.P(i12));
        }
        int attachedScrapChildCount = n60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(n60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f21413r = -1;
        this.f21414s = -1;
        this.v = -1;
        this.f21415w = -1;
        this.f21416x = -1;
        this.f21417y = -1;
        this.K = -1;
        this.L = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.J = -1;
        this.e = -1;
        this.f21404f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f21399b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f21398b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f21404f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f21412n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f21402d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f21405f0;
        ArrayList arrayList3 = this.f21403e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f21415w = i13;
            this.f21416x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f21417y = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.E = i15;
            this.F = i16;
            int size3 = arrayList3.size() + i16;
            this.S = size3;
            this.G = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.S;
            int i18 = i17 + 1;
            this.S = i18;
            this.N = i17;
            this.O = i18;
            int size4 = arrayList2.size() + i18;
            this.S = size4;
            this.P = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i19 = this.S;
            this.f21413r = i19;
            this.J = i19 + 1;
            this.S = i19 + 3;
            this.K = i19 + 2;
        }
        this.T.l();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void show() {
        super.show();
        this.f21411l0 = false;
    }
}
