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
public final class r60 extends org.telegram.ui.ActionBar.f3 {
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
    public final m60 T;
    public final org.telegram.ui.ActionBar.n2 U;
    public final e60 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f29940a0;
    public final TLRPC.TL_chatInviteExported f29941b;
    public final boolean f29942b0;
    public final HashMap f29943c;
    public final boolean f29944c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f29945d0;
    public int f29946e;
    public final ArrayList f29947e0;
    public int f29948f;
    public final ArrayList f29949f0;
    public final long f29950g0;
    public int h;
    public final boolean f29951h0;
    public final long f29952i0;
    public org.telegram.ui.hb f29953j0;
    public boolean f29954k0;
    public boolean f29955l0;
    public int f29956n;
    public int f29957r;
    public int f29958s;
    public int v;
    public int f29959w;
    public int f29960x;
    public int f29961y;

    public r60(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.n2 n2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        float f10;
        this.f29945d0 = new ArrayList();
        this.f29947e0 = new ArrayList();
        this.f29949f0 = new ArrayList();
        this.f29954k0 = true;
        this.f29955l0 = false;
        this.f29941b = tL_chatInviteExported;
        this.f29943c = hashMap;
        this.U = n2Var;
        this.d = chatFull;
        this.f29950g0 = j3;
        this.f29942b0 = z10;
        this.f29951h0 = z11;
        int i10 = org.telegram.ui.ActionBar.j6.f20607a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f29943c = new HashMap();
        }
        this.f29952i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        d60 d60Var = new d60(this, context);
        this.containerView = d60Var;
        d60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        e60 e60Var = new e60(this, context);
        this.V = e60Var;
        e60Var.o1();
        e60Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        e60Var.setLayoutManager(c0Var);
        m60 m60Var = new m60(this);
        this.T = m60Var;
        e60Var.setAdapter(m60Var);
        e60Var.setVerticalScrollBarEnabled(false);
        e60Var.setClipToPadding(false);
        e60Var.setNestedScrollingEnabled(true);
        e60Var.setOnScrollListener(new f60(this, c0Var));
        e60Var.setOnItemClickListener(new zk0() {
            @Override
            public final void a(int i11, View view2) {
                r60.m(r60.this, tL_chatInviteExported, hashMap, chatFull, context, j3, n2Var, i11);
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
            this.f29944c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f29944c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f29944c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(e60Var, w7.x5.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        ViewGroup viewGroup2 = this.containerView;
        if (!this.f29944c0) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        viewGroup2.addView(textView, w7.x5.d(-1, f10, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        X();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f20010id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        b0();
    }

    public static int I(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static int J(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static int K(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static int L(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static int M(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static void O(r60 r60Var) {
        View view = r60Var.Y;
        TextView textView = r60Var.W;
        e60 e60Var = r60Var.V;
        if (e60Var.getChildCount() <= 0) {
            int paddingTop = e60Var.getPaddingTop();
            r60Var.Z = paddingTop;
            e60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(r60Var.Z);
            view.setTranslationY(r60Var.Z);
            r60Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e60Var.getChildAt(0);
        vk0 vk0Var = (vk0) e60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            r60Var.Y(false);
            i10 = top;
        } else {
            r60Var.Y(true);
        }
        if (r60Var.Z != i10) {
            r60Var.Z = i10;
            e60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(r60Var.Z);
            }
            view.setTranslationY(r60Var.Z);
            r60Var.containerView.invalidate();
        }
    }

    public static int Q(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static int R(r60 r60Var) {
        return r60Var.currentAccount;
    }

    public static void Z(Context context, int i10, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.f6 f6Var) {
        char c10;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.wl.i(1, context, f6Var, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        f7.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 10));
        x9 x9Var = new x9(context);
        x9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        if (j3 >= 0) {
            c10 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            i9Var.r(user);
            x9Var.e(user, i9Var);
        } else {
            c10 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            i9Var.q(chat);
            x9Var.e(chat, i9Var);
        }
        frameLayout.addView(x9Var, w7.x5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, w7.x5.e(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, w7.x5.e(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.x(org.telegram.ui.ActionBar.j6.f20770j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.B6;
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 != 2592000) {
            obj = "min";
            if (i15 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            i11 = i14;
            h.setText(zh.v7.X0(false, String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), obj2), 0.8f, null));
        } else {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[c10] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            h.setText(zh.v7.X0(false, LocaleController.formatString(i16, objArr), 0.8f, null));
            i11 = i14;
        }
        TextView h10 = com.google.android.gms.internal.vision.e2.h(f7, h, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h10.setTextSize(1, 14.0f);
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
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
        f7.addView(h10, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
        oz0 oz0Var = new oz0(context, f6Var);
        d90 d90Var = new d90(context, f6Var);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(true);
        d90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(d90Var, 24.0f, i10);
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
        spannableStringBuilder.setSpan(new g60(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        d90Var.setText(spannableStringBuilder);
        if (!z10) {
            oz0Var.i(d90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        oz0Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            oz0Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f7.addView(oz0Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        d90 d90Var2 = new d90(context, f6Var);
        d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, f6Var));
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        d90Var2.setTextSize(1, 14.0f);
        d90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new b30(context, 1)));
        d90Var2.setGravity(17);
        f7.addView(d90Var2, w7.x5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        di.d dVar = new di.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        f7.addView(dVar, w7.x5.n(-1, 48));
        dVar.setOnClickListener(new k2(f3VarArr, 2));
        i13.customView = f7;
        f3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void a0(View view) {
        if (view instanceof org.telegram.ui.Cells.l4) {
            ((org.telegram.ui.Cells.l4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
        } else if (view instanceof w80) {
            ((w80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.e9) {
            ((org.telegram.ui.Cells.e9) view).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.za) {
            ((org.telegram.ui.Cells.za) view).j(0);
        }
    }

    public static void m(org.telegram.ui.Components.r60 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.n2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r60.m(org.telegram.ui.Components.r60, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.n2, int):void");
    }

    public static void n(r60 r60Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        b2Var.c(400L);
        Z(context, r60Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, r60Var.resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.f6 y(r60 r60Var) {
        return r60Var.resourcesProvider;
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r60.X():void");
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
            if (!this.f29944c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new org.telegram.ui.to(13, this, z10));
            this.X.start();
        }
    }

    public final void b0() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20790k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20808l5, false));
            if (!this.f29944c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
            }
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false);
        e60 e60Var = this.V;
        e60Var.setGlowColor(w02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        int hiddenChildCount = e60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < e60Var.getChildCount(); i10++) {
            a0(e60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            a0(e60Var.V(i11));
        }
        int cachedChildCount = e60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            a0(e60Var.P(i12));
        }
        int attachedScrapChildCount = e60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            a0(e60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f29957r = -1;
        this.f29958s = -1;
        this.v = -1;
        this.f29959w = -1;
        this.f29960x = -1;
        this.f29961y = -1;
        this.K = -1;
        this.L = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.J = -1;
        this.f29946e = -1;
        this.f29948f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f29942b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f29941b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.f29946e = i10;
            this.S = i10 + 2;
            this.f29948f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f29956n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f29945d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f29949f0;
        ArrayList arrayList3 = this.f29947e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f29959w = i13;
            this.f29960x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f29961y = size2;
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
            this.f29957r = i19;
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
        this.f29955l0 = false;
    }
}
