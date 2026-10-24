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
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k70 extends org.telegram.ui.ActionBar.h3 {
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
    public final f70 T;
    public final org.telegram.ui.ActionBar.o2 U;
    public final x60 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f27909a0;
    public final TLRPC.TL_chatInviteExported f27910b;
    public final boolean f27911b0;
    public final HashMap f27912c;
    public final boolean f27913c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f27914d0;
    public int e;
    public final ArrayList f27915e0;
    public int f27916f;
    public final ArrayList f27917f0;
    public final long f27918g0;
    public int h;
    public final boolean f27919h0;
    public final long f27920i0;
    public org.telegram.ui.ib f27921j0;
    public boolean f27922k0;
    public boolean f27923l0;
    public int m0;
    public int f27924n;
    public int f27925r;
    public int f27926s;
    public int v;
    public int f27927w;
    public int f27928x;
    public int f27929y;

    public k70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.o2 o2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.f27914d0 = new ArrayList();
        this.f27915e0 = new ArrayList();
        this.f27917f0 = new ArrayList();
        this.f27922k0 = true;
        this.f27923l0 = false;
        this.f27910b = tL_chatInviteExported;
        this.f27912c = hashMap;
        this.U = o2Var;
        this.d = chatFull;
        this.f27918g0 = j10;
        this.f27911b0 = z10;
        this.f27919h0 = z11;
        int i10 = org.telegram.ui.ActionBar.k6.f21126a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.m0 = this.navBarColor;
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f27912c = new HashMap();
        }
        this.f27920i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        w60 w60Var = new w60(this, context);
        this.containerView = w60Var;
        w60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        x60 x60Var = new x60(this, context);
        this.V = x60Var;
        x60Var.t1();
        x60Var.setTag(14);
        getContext();
        s4.b0 b0Var = new s4.b0(1, false);
        x60Var.setLayoutManager(b0Var);
        f70 f70Var = new f70(this);
        this.T = f70Var;
        x60Var.setAdapter(f70Var);
        x60Var.setVerticalScrollBarEnabled(false);
        x60Var.setClipToPadding(false);
        x60Var.setNestedScrollingEnabled(true);
        x60Var.setOnScrollListener(new y60(this, b0Var));
        x60Var.setOnItemClickListener(new zl0() {
            @Override
            public final void d(int i11, View view2) {
                k70.m(k70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, o2Var, i11);
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
            this.f27913c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f27913c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f27913c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(x60Var, w7.z5.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        this.containerView.addView(textView, w7.z5.d(-1, this.f27913c0 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f20485id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new x1(this, 6));
        }
        updateColors();
    }

    public static int G(k70 k70Var) {
        return k70Var.currentAccount;
    }

    public static void O(k70 k70Var) {
        View view = k70Var.Y;
        TextView textView = k70Var.W;
        x60 x60Var = k70Var.V;
        if (x60Var.getChildCount() <= 0) {
            int paddingTop = x60Var.getPaddingTop();
            k70Var.Z = paddingTop;
            x60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(k70Var.Z);
            view.setTranslationY(k70Var.Z);
            k70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = x60Var.getChildAt(0);
        vl0 vl0Var = (vl0) x60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
            k70Var.Z(false);
            i10 = top;
        } else {
            k70Var.Z(true);
        }
        if (k70Var.Z != i10) {
            k70Var.Z = i10;
            x60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(k70Var.Z);
            }
            view.setTranslationY(k70Var.Z);
            k70Var.containerView.invalidate();
        }
    }

    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.g6 g6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.tl.j(1, context, g6Var, false);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        ?? e = org.telegram.messenger.tl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        e.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 10));
        ?? u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        f9 f9Var = new f9((org.telegram.ui.ActionBar.g6) null);
        if (j10 >= 0) {
            r16 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            f9Var.r(user);
            u9Var.e(user, f9Var);
        } else {
            r16 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
        }
        frameLayout.addView(u9Var, w7.z5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i13 = org.telegram.ui.ActionBar.k6.f21255h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.r6.z(imageView, drawable, i13, g6Var, mode);
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
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView f7 = org.telegram.messenger.tl.f(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.k6.B6;
        org.telegram.ui.ActionBar.r6.W(f7, i14, g6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 != 2592000) {
            obj = "min";
            boolean z11 = r16;
            if (i15 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            Locale locale = Locale.US;
            i11 = i14;
            Object[] objArr = new Object[2];
            objArr[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr[1] = obj2;
            f7.setText(ai.nd.Y0(z11, String.format(locale, "⭐%1$d/%2$s", objArr), 0.8f, null));
        } else {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr2 = new Object[1];
            objArr2[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f7.setText(ai.nd.Y0(r16, LocaleController.formatString(i16, objArr2), 0.8f, null));
            i11 = i14;
        }
        TextView f10 = org.telegram.messenger.tl.f(e, f7, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(f10, i11, g6Var);
        int i17 = tL_starsSubscriptionPricing.period;
        if (i17 == 2592000) {
            f10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } else {
            if (i17 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            f10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        e.addView(f10, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        ?? n01Var = new n01(context, g6Var);
        ?? w90Var = new w90(context, g6Var);
        w90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        w90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.k6.f21243gc;
        org.telegram.ui.ActionBar.r6.W(w90Var, i18, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, i18, g6Var);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setSingleLine(true);
        w90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(w90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        k5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new z60(h3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        w90Var.setText(spannableStringBuilder);
        if (!z10) {
            n01Var.l(w90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        n01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            n01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        e.addView(n01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        w90 w90Var2 = new w90(context, g6Var);
        org.telegram.ui.ActionBar.r6.W(w90Var2, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var2, i18, g6Var);
        w90Var2.setTextSize(1, 14.0f);
        w90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new i30(context, 1)));
        w90Var2.setGravity(17);
        e.addView(w90Var2, w7.z5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        e.addView(dVar, w7.z5.n(-1, 48));
        dVar.setOnClickListener(new j2(h3VarArr, 2));
        j11.customView = e;
        h3VarArr[0] = j11;
        j11.useBackgroundTopPadding = false;
        j11.fixNavigationBar();
        h3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.l4) {
            ((org.telegram.ui.Cells.l4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.L6, false));
        } else if (view instanceof p90) {
            ((p90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.e9) {
            org.telegram.ui.ActionBar.r6.W(((org.telegram.ui.Cells.e9) view).getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.wa) {
            ((org.telegram.ui.Cells.wa) view).i(0);
        }
    }

    public static void m(org.telegram.ui.Components.k70 r23, org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, android.content.Context r27, long r28, org.telegram.ui.ActionBar.o2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k70.m(org.telegram.ui.Components.k70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.o2, int):void");
    }

    public static void n(k70 k70Var, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        c2Var.c(400L);
        a0(context, k70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, k70Var.resourcesProvider);
    }

    public final void X() {
        TextView textView = this.W;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21310k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21327l5, false));
                if (!this.f27913c0) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        x60 x60Var = this.V;
        if (x60Var != null) {
            x60Var.setGlowColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A5, false));
        }
        View view = this.Y;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        }
    }

    public final void Y() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.Q) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f27910b;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.f27914d0;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.f27915e0;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f27917f0;
            if (z15 && tL_chatInviteExported.requested > arrayList4.size()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                z14 = false;
                z13 = false;
            } else if (z11) {
                z14 = false;
                z13 = true;
            } else if (z12) {
                z13 = false;
                z14 = true;
            } else {
                return;
            }
            if (z14) {
                arrayList = arrayList4;
            } else if (z13) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f27918g0);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f27912c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.Q = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final k70 k70Var = k70.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v60.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void Z(boolean z10) {
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
            if (!this.f27913c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new org.telegram.ui.ho(13, this, z10));
            this.X.start();
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f27925r = -1;
        this.f27926s = -1;
        this.v = -1;
        this.f27927w = -1;
        this.f27928x = -1;
        this.f27929y = -1;
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
        this.f27916f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f27911b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f27910b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f27916f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f27924n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f27914d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f27917f0;
        ArrayList arrayList3 = this.f27915e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f27927w = i13;
            this.f27928x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f27929y = size2;
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
            this.f27925r = i19;
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
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            if (this.shadowDrawable != null) {
                setBackgroundColor(themedColor);
            }
            if (this.navBarColorKey < 0 && (i10 = this.navBarColor) == this.m0 && themedColor != i10) {
                this.navBarColor = themedColor;
                this.m0 = themedColor;
                setOverlayNavBarColor(themedColor);
            }
            X();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f27923l0 = false;
    }

    public final void updateColors() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21310k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21327l5, false));
            if (!this.f27913c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A5, false);
        x60 x60Var = this.V;
        x60Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false));
        int hiddenChildCount = x60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < x60Var.getChildCount(); i10++) {
            b0(x60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(x60Var.V(i11));
        }
        int cachedChildCount = x60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(x60Var.P(i12));
        }
        int attachedScrapChildCount = x60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(x60Var.O(i13));
        }
        this.containerView.invalidate();
    }
}
