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
public final class f70 extends org.telegram.ui.ActionBar.f3 {
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
    public final a70 T;
    public final org.telegram.ui.ActionBar.n2 U;
    public final s60 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f26401a0;
    public final TLRPC.TL_chatInviteExported f26402b;
    public final boolean f26403b0;
    public final HashMap f26404c;
    public final boolean f26405c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f26406d0;
    public int f26407e;
    public final ArrayList f26408e0;
    public int f26409f;
    public final ArrayList f26410f0;
    public final long f26411g0;
    public int h;
    public final boolean f26412h0;
    public final long f26413i0;
    public org.telegram.ui.jb f26414j0;
    public boolean f26415k0;
    public boolean f26416l0;
    public int f26417n;
    public int f26418r;
    public int f26419s;
    public int v;
    public int f26420w;
    public int f26421x;
    public int f26422y;

    public f70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.n2 n2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        float f10;
        this.f26406d0 = new ArrayList();
        this.f26408e0 = new ArrayList();
        this.f26410f0 = new ArrayList();
        this.f26415k0 = true;
        this.f26416l0 = false;
        this.f26402b = tL_chatInviteExported;
        this.f26404c = hashMap;
        this.U = n2Var;
        this.d = chatFull;
        this.f26411g0 = j3;
        this.f26403b0 = z10;
        this.f26412h0 = z11;
        int i10 = org.telegram.ui.ActionBar.i6.f20771a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f26404c = new HashMap();
        }
        this.f26413i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        r60 r60Var = new r60(this, context);
        this.containerView = r60Var;
        r60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        s60 s60Var = new s60(this, context);
        this.V = s60Var;
        s60Var.r1();
        s60Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        s60Var.setLayoutManager(c0Var);
        a70 a70Var = new a70(this);
        this.T = a70Var;
        s60Var.setAdapter(a70Var);
        s60Var.setVerticalScrollBarEnabled(false);
        s60Var.setClipToPadding(false);
        s60Var.setNestedScrollingEnabled(true);
        s60Var.setOnScrollListener(new t60(this, c0Var));
        s60Var.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i11, View view2) {
                f70.m(f70.this, tL_chatInviteExported, hashMap, chatFull, context, j3, n2Var, i11);
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
            this.f26405c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f26405c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f26405c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(s60Var, w7.z5.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.f26405c0) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        viewGroup2.addView(textView, w7.z5.d(-1, f10, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        W();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f20188id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        b0();
    }

    public static int G(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static int H(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static int I(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static int J(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static int K(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static void M(f70 f70Var) {
        View view = f70Var.Y;
        TextView textView = f70Var.W;
        s60 s60Var = f70Var.V;
        if (s60Var.getChildCount() <= 0) {
            int paddingTop = s60Var.getPaddingTop();
            f70Var.Z = paddingTop;
            s60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(f70Var.Z);
            view.setTranslationY(f70Var.Z);
            f70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = s60Var.getChildAt(0);
        il0 il0Var = (il0) s60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && il0Var != null && il0Var.b() == 0) {
            f70Var.X(false);
            i10 = top;
        } else {
            f70Var.X(true);
        }
        if (f70Var.Z != i10) {
            f70Var.Z = i10;
            s60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(f70Var.Z);
            }
            view.setTranslationY(f70Var.Z);
            f70Var.containerView.invalidate();
        }
    }

    public static int O(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static int P(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static void Y(Context context, int i10, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.d6 d6Var) {
        char c10;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        e7.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 10));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        if (j3 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, w7.z5.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.z5.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.i6.f20935j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.i6.B6;
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 != 2592000) {
            obj = "min";
            if (i15 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            i11 = i14;
            h.setText(yh.z7.d1(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), obj2), 0.8f, null));
        } else {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            h.setText(yh.z7.d1(false, LocaleController.formatString(i16, objArr), 0.8f, null));
            i11 = i14;
        }
        TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h10.setTextSize(1, 14.0f);
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            h10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i17 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            h10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        e7.addView(h10, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        l01 l01Var = new l01(context, d6Var);
        q90 q90Var = new q90(context, d6Var);
        q90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        q90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.i6.gc;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setSingleLine(true);
        q90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(q90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        h5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new u60(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        q90Var.setText(spannableStringBuilder);
        if (!z10) {
            l01Var.i(q90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        l01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            l01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        e7.addView(l01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        q90 q90Var2 = new q90(context, d6Var);
        q90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
        q90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        q90Var2.setTextSize(1, 14.0f);
        q90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new f30(context, 1)));
        q90Var2.setGravity(17);
        e7.addView(q90Var2, w7.z5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        e7.addView(dVar, w7.z5.n(-1, 48));
        dVar.setOnClickListener(new k2(f3VarArr, 2));
        i13.customView = e7;
        f3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void Z(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L6, false));
        } else if (view instanceof j90) {
            ((j90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.e9) {
            ((org.telegram.ui.Cells.e9) view).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.za) {
            ((org.telegram.ui.Cells.za) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.f70 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.n2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f70.m(org.telegram.ui.Components.f70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.n2, int):void");
    }

    public static void n(f70 f70Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        b2Var.c(400L);
        Y(context, f70Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, f70Var.resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.d6 y(f70 f70Var) {
        return f70Var.resourcesProvider;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f70.W():void");
    }

    public final void X(boolean z10) {
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
            if (!this.f26405c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new da(12, this, z10));
            this.X.start();
        }
    }

    public final void b0() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20955k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20973l5, false));
            if (!this.f26405c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A5, false);
        s60 s60Var = this.V;
        s60Var.setGlowColor(w02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        int hiddenChildCount = s60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < s60Var.getChildCount(); i10++) {
            Z(s60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            Z(s60Var.V(i11));
        }
        int cachedChildCount = s60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            Z(s60Var.P(i12));
        }
        int attachedScrapChildCount = s60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            Z(s60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f26418r = -1;
        this.f26419s = -1;
        this.v = -1;
        this.f26420w = -1;
        this.f26421x = -1;
        this.f26422y = -1;
        this.K = -1;
        this.L = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.J = -1;
        this.f26407e = -1;
        this.f26409f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f26403b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f26402b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.f26407e = i10;
            this.S = i10 + 2;
            this.f26409f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f26417n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f26406d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f26410f0;
        ArrayList arrayList3 = this.f26408e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f26420w = i13;
            this.f26421x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f26422y = size2;
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
            this.f26418r = i19;
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
        this.f26416l0 = false;
    }
}
