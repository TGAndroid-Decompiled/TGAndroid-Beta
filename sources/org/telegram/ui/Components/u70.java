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
public final class u70 extends org.telegram.ui.ActionBar.e3 {
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
    public final p70 T;
    public final org.telegram.ui.ActionBar.m2 U;
    public final h70 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f31310a0;
    public final TLRPC.TL_chatInviteExported f31311b;
    public final boolean f31312b0;
    public final HashMap f31313c;
    public final boolean f31314c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f31315d0;
    public int f31316e;
    public final ArrayList f31317e0;
    public int f31318f;
    public final ArrayList f31319f0;
    public final long f31320g0;
    public int h;
    public final boolean f31321h0;
    public final long f31322i0;
    public org.telegram.ui.hb f31323j0;
    public boolean f31324k0;
    public boolean f31325l0;
    public int f31326n;
    public int f31327r;
    public int f31328s;
    public int v;
    public int f31329w;
    public int f31330x;
    public int f31331y;

    public u70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.m2 m2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.f31315d0 = new ArrayList();
        this.f31317e0 = new ArrayList();
        this.f31319f0 = new ArrayList();
        this.f31324k0 = true;
        this.f31325l0 = false;
        this.f31311b = tL_chatInviteExported;
        this.f31313c = hashMap;
        this.U = m2Var;
        this.d = chatFull;
        this.f31320g0 = j3;
        this.f31312b0 = z10;
        this.f31321h0 = z11;
        int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f31313c = new HashMap();
        }
        this.f31322i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        g70 g70Var = new g70(this, context);
        this.containerView = g70Var;
        g70Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        h70 h70Var = new h70(this, context);
        this.V = h70Var;
        h70Var.p1();
        h70Var.setTag(14);
        getContext();
        s4.d0 d0Var = new s4.d0(1, false);
        h70Var.setLayoutManager(d0Var);
        p70 p70Var = new p70(this);
        this.T = p70Var;
        h70Var.setAdapter(p70Var);
        h70Var.setVerticalScrollBarEnabled(false);
        h70Var.setClipToPadding(false);
        h70Var.setNestedScrollingEnabled(true);
        h70Var.setOnScrollListener(new i70(this, d0Var));
        h70Var.setOnItemClickListener(new gm0() {
            @Override
            public final void d(int i11, View view2) {
                u70.o(u70.this, tL_chatInviteExported, hashMap, chatFull, context, j3, m2Var, i11);
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
            this.f31314c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f31314c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f31314c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(h70Var, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(textView, w7.x5.a(this.f31314c0 ? 50.0f : 44.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f20173id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        e();
    }

    public static org.telegram.ui.ActionBar.d6 B(u70 u70Var) {
        return u70Var.resourcesProvider;
    }

    public static int D(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int E(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int F(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int H(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int J(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int K(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int L(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int M(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int N(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static void P(u70 u70Var) {
        View view = u70Var.Y;
        TextView textView = u70Var.W;
        h70 h70Var = u70Var.V;
        if (h70Var.getChildCount() <= 0) {
            int paddingTop = h70Var.getPaddingTop();
            u70Var.Z = paddingTop;
            h70Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(u70Var.Z);
            view.setTranslationY(u70Var.Z);
            u70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = h70Var.getChildAt(0);
        cm0 cm0Var = (cm0) h70Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && cm0Var != null && cm0Var.b() == 0) {
            u70Var.Z(false);
            i10 = top;
        } else {
            u70Var.Z(true);
        }
        if (u70Var.Z != i10) {
            u70Var.Z = i10;
            h70Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(u70Var.Z);
            }
            view.setTranslationY(u70Var.Z);
            u70Var.containerView.invalidate();
        }
    }

    public static int R(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static int S(u70 u70Var) {
        return u70Var.currentAccount;
    }

    public static void a0(Context context, int i10, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.e3 i13 = org.telegram.messenger.ai.i(1, context, d6Var, false);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        ?? e7 = org.telegram.messenger.ai.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        e7.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 10));
        ?? y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        if (j3 >= 0) {
            r16 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            j9Var.r(user);
            y9Var.e(user, j9Var);
        } else {
            r16 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
        }
        frameLayout.addView(y9Var, w7.x5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.f20894j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.h6.B6;
        h.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
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
            h.setText(yh.p7.Y0(z11, String.format(locale, "⭐%1$d/%2$s", objArr), 0.8f, null));
        } else {
            int i16 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr2 = new Object[1];
            objArr2[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            h.setText(yh.p7.Y0(r16, LocaleController.formatString(i16, objArr2), 0.8f, null));
            i11 = i14;
        }
        TextView h10 = com.google.android.gms.internal.vision.e2.h(e7, h, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h10.setTextSize(1, 14.0f);
        h10.setGravity(17);
        h10.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
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
        e7.addView(h10, w7.x5.t(-1, -2, 17, 20, 0, 20, 4));
        ?? t01Var = new t01(context, d6Var);
        ?? fa0Var = new fa0(context, d6Var);
        fa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        fa0Var.setEllipsize(TextUtils.TruncateAt.END);
        int i18 = org.telegram.ui.ActionBar.h6.gc;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setSingleLine(true);
        fa0Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(fa0Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        f5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new j70(e3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        fa0Var.setText(spannableStringBuilder);
        if (!z10) {
            t01Var.k(fa0Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        t01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            t01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        e7.addView(t01Var, w7.x5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        fa0 fa0Var2 = new fa0(context, d6Var);
        fa0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
        fa0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        fa0Var2.setTextSize(1, 14.0f);
        fa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new t30(context, 1)));
        fa0Var2.setGravity(17);
        e7.addView(fa0Var2, w7.x5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        e7.addView(dVar, w7.x5.n(-1, 48));
        dVar.setOnClickListener(new m2(e3VarArr, 2));
        i13.customView = e7;
        e3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        e3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            ((org.telegram.ui.Cells.m4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
        } else if (view instanceof y90) {
            ((y90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.e9) {
            ((org.telegram.ui.Cells.e9) view).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.xa) {
            ((org.telegram.ui.Cells.xa) view).j(0);
        }
    }

    public static void o(org.telegram.ui.Components.u70 r23, final org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, final android.content.Context r27, final long r28, org.telegram.ui.ActionBar.m2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u70.o(org.telegram.ui.Components.u70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.m2, int):void");
    }

    public static void p(u70 u70Var, org.telegram.ui.ActionBar.a2 a2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        a2Var.c(400L);
        a0(context, u70Var.currentAccount, -j3, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, u70Var.resourcesProvider);
    }

    public final void Y() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.Q) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f31311b;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.f31315d0;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.f31317e0;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f31319f0;
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
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f31320g0);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f31313c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.Q = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final u70 u70Var = u70.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f70.run():void");
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
            if (!this.f31314c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new ea(12, this, z10));
            this.X.start();
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f31327r = -1;
        this.f31328s = -1;
        this.v = -1;
        this.f31329w = -1;
        this.f31330x = -1;
        this.f31331y = -1;
        this.K = -1;
        this.L = -1;
        this.H = -1;
        this.I = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.J = -1;
        this.f31316e = -1;
        this.f31318f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f31312b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f31311b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.f31316e = i10;
            this.S = i10 + 2;
            this.f31318f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f31326n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f31315d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f31319f0;
        ArrayList arrayList3 = this.f31317e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f31329w = i13;
            this.f31330x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f31331y = size2;
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
            this.f31327r = i19;
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

    public final void e() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20931l5, false));
            if (!this.f31314c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false);
        h70 h70Var = this.V;
        h70Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        int hiddenChildCount = h70Var.getHiddenChildCount();
        for (int i10 = 0; i10 < h70Var.getChildCount(); i10++) {
            b0(h70Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(h70Var.V(i11));
        }
        int cachedChildCount = h70Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(h70Var.P(i12));
        }
        int attachedScrapChildCount = h70Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(h70Var.O(i13));
        }
        this.containerView.invalidate();
    }

    @Override
    public final void show() {
        super.show();
        this.f31325l0 = false;
    }
}
