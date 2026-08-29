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
public final class n60 extends org.telegram.ui.ActionBar.f3 {
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
    public final i60 P;
    public final org.telegram.ui.ActionBar.o2 Q;
    public final a60 R;
    public final TextView S;
    public AnimatorSet T;
    public final View U;
    public int V;
    public boolean W;
    public final boolean X;
    public final boolean Y;
    public final ArrayList Z;
    public final ArrayList f30884a0;
    public final TLRPC.TL_chatInviteExported f30885b;
    public final ArrayList f30886b0;
    public final HashMap f30887c;
    public final long f30888c0;
    public final TLRPC.ChatFull d;
    public final boolean f30889d0;
    public int f30890e;
    public final long f30891e0;
    public int f30892f;
    public org.telegram.ui.ab f30893f0;
    public boolean f30894g0;
    public int h;
    public boolean f30895h0;
    public int f30896n;
    public int f30897r;
    public int f30898s;
    public int v;
    public int f30899w;
    public int f30900x;
    public int f30901y;

    public n60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.o2 o2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f9;
        float f10;
        this.Z = new ArrayList();
        this.f30884a0 = new ArrayList();
        this.f30886b0 = new ArrayList();
        this.f30894g0 = true;
        this.f30895h0 = false;
        this.f30885b = tL_chatInviteExported;
        this.f30887c = hashMap;
        this.Q = o2Var;
        this.d = chatFull;
        this.f30888c0 = j10;
        this.X = z10;
        this.f30889d0 = z11;
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f30887c = new HashMap();
        }
        this.f30891e0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        z50 z50Var = new z50(this, context);
        this.containerView = z50Var;
        z50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.U = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        a60 a60Var = new a60(this, context);
        this.R = a60Var;
        a60Var.p1();
        a60Var.setTag(14);
        getContext();
        f2.j0 j0Var = new f2.j0(1, false);
        a60Var.setLayoutManager(j0Var);
        i60 i60Var = new i60(this);
        this.P = i60Var;
        a60Var.setAdapter(i60Var);
        a60Var.setVerticalScrollBarEnabled(false);
        a60Var.setClipToPadding(false);
        a60Var.setNestedScrollingEnabled(true);
        a60Var.setOnScrollListener(new b60(this, j0Var));
        a60Var.setOnItemClickListener(new zk0() {
            @Override
            public final void c(int i11, View view2) {
                n60.m(n60.this, tL_chatInviteExported, hashMap, chatFull, context, j10, o2Var, i11);
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
            f9 = 0.0f;
        } else {
            f9 = 44.0f;
        }
        viewGroup.addView(a60Var, i7.f6.d(-1, -1.0f, 51, 0.0f, f9, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.Y) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        viewGroup2.addView(textView, i7.f6.d(-1, f10, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22533id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new a2(this, 6));
        }
        b0();
    }

    public static void O(n60 n60Var) {
        View view = n60Var.U;
        TextView textView = n60Var.S;
        a60 a60Var = n60Var.R;
        if (a60Var.getChildCount() <= 0) {
            int paddingTop = a60Var.getPaddingTop();
            n60Var.V = paddingTop;
            a60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(n60Var.V);
            view.setTranslationY(n60Var.V);
            n60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = a60Var.getChildAt(0);
        vk0 vk0Var = (vk0) a60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            n60Var.Y(false);
            i10 = top;
        } else {
            n60Var.Y(true);
        }
        if (n60Var.V != i10) {
            n60Var.V = i10;
            a60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(n60Var.V);
            }
            view.setTranslationY(n60Var.V);
            n60Var.containerView.invalidate();
        }
    }

    public static void Z(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.c6 c6Var) {
        char c3;
        String str;
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var;
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        g10.addView(frameLayout, i7.f6.t(-1, -2, 7, 0, 0, 0, 10));
        t9 t9Var = new t9(context);
        t9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        if (j10 >= 0) {
            c3 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            e9Var.r(user);
            t9Var.e(user, e9Var);
        } else {
            c3 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
        frameLayout.addView(t9Var, i7.f6.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, i7.f6.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, i7.f6.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView i12 = org.telegram.ui.th.i(g10, textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i12.setTextSize(1, 14.0f);
        i12.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.g6.B6;
        i12.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        int i14 = tL_starsSubscriptionPricing.period;
        String str3 = "5min";
        if (i14 != 2592000) {
            str = "min";
            if (i14 == 300) {
                str2 = "5min";
            } else {
                str2 = str;
            }
            f3Var = q6;
            i12.setText(jh.ia.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), str2), 0.8f, null));
        } else {
            int i15 = R.string.StarsSubscriptionPrice;
            str = "min";
            Object[] objArr = new Object[1];
            objArr[c3] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            i12.setText(jh.ia.X0(false, LocaleController.formatString(i15, objArr), 0.8f, null));
            f3Var = q6;
        }
        TextView i16 = org.telegram.ui.th.i(g10, i12, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
        i16.setTextSize(1, 14.0f);
        i16.setGravity(17);
        i16.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            i16.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i17 != 300) {
                str3 = str;
            }
            i16.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), str3));
        }
        g10.addView(i16, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
        hz0 hz0Var = new hz0(context, c6Var);
        y80 y80Var = new y80(context, c6Var);
        y80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.g6.gc;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setSingleLine(true);
        y80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(y80Var, 24.0f, i10);
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
        spannableStringBuilder.setSpan(new c60(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        y80Var.setText(spannableStringBuilder);
        if (!z10) {
            hz0Var.i(y80Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
        hz0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i11 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i11 = R.string.StarsParticipantSubscriptionExpired;
            }
            hz0Var.c(LocaleController.getString(i11), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        g10.addView(hz0Var, i7.f6.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        y80 y80Var2 = new y80(context, c6Var);
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new y20(context, 1)));
        y80Var2.setGravity(17);
        g10.addView(y80Var2, i7.f6.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        g10.addView(dVar, i7.f6.n(-1, 48));
        dVar.setOnClickListener(new k2(f3VarArr, 2));
        f3Var2.customView = g10;
        f3VarArr[0] = f3Var2;
        f3Var2.useBackgroundTopPadding = false;
        f3Var2.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.k4) {
            ((org.telegram.ui.Cells.k4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
        } else if (view instanceof r80) {
            ((r80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.y8) {
            ((org.telegram.ui.Cells.y8) view).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.sa) {
            ((org.telegram.ui.Cells.sa) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.n60 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.o2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n60.m(org.telegram.ui.Components.n60, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.o2, int):void");
    }

    public static void n(n60 n60Var, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        c2Var.c(400L);
        Z(context, n60Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, n60Var.resourcesProvider);
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n60.X():void");
    }

    public final void Y(boolean z10) {
        Integer num;
        float f9;
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
            float f10 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f9));
            if (!this.Y) {
                AnimatorSet animatorSet3 = this.T;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.T.setDuration(150L);
            this.T.addListener(new z9(12, this, z10));
            this.T.start();
        }
    }

    public final void b0() {
        TextView textView = this.S;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23188k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23205l5, false));
            if (!this.Y) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false);
        a60 a60Var = this.R;
        a60Var.setGlowColor(w02);
        this.U.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        int hiddenChildCount = a60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < a60Var.getChildCount(); i10++) {
            a0(a60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(a60Var.V(i11));
        }
        int cachedChildCount = a60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(a60Var.P(i12));
        }
        int attachedScrapChildCount = a60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(a60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.O = 0;
        this.f30897r = -1;
        this.f30898s = -1;
        this.v = -1;
        this.f30899w = -1;
        this.f30900x = -1;
        this.f30901y = -1;
        this.G = -1;
        this.H = -1;
        this.D = -1;
        this.E = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.F = -1;
        this.f30890e = -1;
        this.f30892f = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        boolean z13 = true;
        if (!this.X) {
            this.D = 0;
            this.O = 2;
            this.E = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f30885b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.O;
            this.f30890e = i10;
            this.O = i10 + 2;
            this.f30892f = i10 + 1;
        }
        int i11 = this.O;
        this.h = i11;
        this.O = i11 + 2;
        this.f30896n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f30886b0;
        ArrayList arrayList3 = this.f30884a0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.O;
            int i14 = i13 + 1;
            this.O = i14;
            this.f30899w = i13;
            this.f30900x = i14;
            int size2 = arrayList.size() + i14;
            this.O = size2;
            this.f30901y = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i15 = this.O;
            int i16 = i15 + 1;
            this.O = i16;
            this.A = i15;
            this.B = i16;
            int size3 = arrayList3.size() + i16;
            this.O = size3;
            this.C = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.O;
            int i18 = i17 + 1;
            this.O = i18;
            this.J = i17;
            this.K = i18;
            int size4 = arrayList2.size() + i18;
            this.O = size4;
            this.L = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i19 = this.O;
            this.f30897r = i19;
            this.F = i19 + 1;
            this.O = i19 + 3;
            this.G = i19 + 2;
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
        this.f30895h0 = false;
    }
}
