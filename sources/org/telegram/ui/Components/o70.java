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
public final class o70 extends org.telegram.ui.ActionBar.k3 {
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
    public final j70 T;
    public final org.telegram.ui.ActionBar.r2 U;
    public final b70 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f31208a0;
    public final TLRPC.TL_chatInviteExported f31209b;
    public final boolean f31210b0;
    public final HashMap f31211c;
    public final boolean f31212c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f31213d0;
    public int e;
    public final ArrayList f31214e0;
    public int f31215f;
    public final ArrayList f31216f0;
    public final long f31217g0;
    public int h;
    public final boolean f31218h0;
    public final long f31219i0;
    public org.telegram.ui.jb f31220j0;
    public boolean f31221k0;
    public boolean f31222l0;
    public int m0;
    public int f31223n;
    public int f31224r;
    public int f31225s;
    public int v;
    public int f31226w;
    public int f31227x;
    public int f31228y;

    public o70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.r2 r2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.f31213d0 = new ArrayList();
        this.f31214e0 = new ArrayList();
        this.f31216f0 = new ArrayList();
        this.f31221k0 = true;
        this.f31222l0 = false;
        this.f31209b = tL_chatInviteExported;
        this.f31211c = hashMap;
        this.U = r2Var;
        this.d = chatFull;
        this.f31217g0 = j10;
        this.f31210b0 = z10;
        this.f31218h0 = z11;
        int i10 = org.telegram.ui.ActionBar.y6.f23300a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.m0 = this.navBarColor;
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f31211c = new HashMap();
        }
        this.f31219i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        a70 a70Var = new a70(this, context);
        this.containerView = a70Var;
        a70Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        b70 b70Var = new b70(this, context);
        this.V = b70Var;
        b70Var.u1();
        b70Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        b70Var.setLayoutManager(c0Var);
        j70 j70Var = new j70(this);
        this.T = j70Var;
        b70Var.setAdapter(j70Var);
        b70Var.setVerticalScrollBarEnabled(false);
        b70Var.setClipToPadding(false);
        b70Var.setNestedScrollingEnabled(true);
        b70Var.setOnScrollListener(new c70(this, c0Var));
        b70Var.setOnItemClickListener(new am0() {
            @Override
            public final void c(int i11, View view2) {
                o70.m(o70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, r2Var, i11);
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
            this.f31212c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f31212c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f31212c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(b70Var, kb1.h(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        this.containerView.addView(textView, kb1.h(-1, this.f31212c0 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22171id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new b2(this, 6));
        }
        updateColors();
    }

    public static int B(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int C(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int D(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int G(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int H(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int I(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int J(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int K(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int L(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int M(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static void O(o70 o70Var) {
        View view = o70Var.Y;
        TextView textView = o70Var.W;
        b70 b70Var = o70Var.V;
        if (b70Var.getChildCount() <= 0) {
            int paddingTop = b70Var.getPaddingTop();
            o70Var.Z = paddingTop;
            b70Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(o70Var.Z);
            view.setTranslationY(o70Var.Z);
            o70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b70Var.getChildAt(0);
        wl0 wl0Var = (wl0) b70Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && wl0Var != null && wl0Var.b() == 0) {
            o70Var.Z(false);
            i10 = top;
        } else {
            o70Var.Z(true);
        }
        if (o70Var.Z != i10) {
            o70Var.Z = i10;
            b70Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(o70Var.Z);
            }
            view.setTranslationY(o70Var.Z);
            o70Var.containerView.invalidate();
        }
    }

    public static int Q(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static int R(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.u6 u6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.k3 i13 = org.telegram.messenger.wh.i(1, context, u6Var, false);
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        ?? d = org.telegram.messenger.wh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        d.addView(frameLayout, kb1.x(-1, -2, 7, 0, 0, 0, 10));
        ?? y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        if (j10 >= 0) {
            r16 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            j9Var.r(user);
            y9Var.f(user, j9Var);
        } else {
            r16 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
        }
        frameLayout.addView(y9Var, kb1.i(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i14 = org.telegram.ui.ActionBar.y6.f23428h5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.f7.y(imageView, drawable, i14, u6Var, mode);
        frameLayout.addView(imageView, kb1.i(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, kb1.i(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, u6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView e = org.telegram.messenger.wh.e(d, textView, kb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.y6.B6;
        org.telegram.ui.ActionBar.f7.V(e, i15, u6Var);
        int i16 = tL_starsSubscriptionPricing.period;
        if (i16 != 2592000) {
            obj = "min";
            boolean z11 = r16;
            if (i16 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            Locale locale = Locale.US;
            i11 = i15;
            Object[] objArr = new Object[2];
            objArr[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr[1] = obj2;
            e.setText(bi.dd.W0(z11, String.format(locale, "⭐%1$d/%2$s", objArr), 0.8f, null));
        } else {
            int i17 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr2 = new Object[1];
            objArr2[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            e.setText(bi.dd.W0(r16, LocaleController.formatString(i17, objArr2), 0.8f, null));
            i11 = i15;
        }
        TextView e10 = org.telegram.messenger.wh.e(d, e, kb1.x(-1, -2, 17, 20, 0, 20, 4), context);
        e10.setTextSize(1, 14.0f);
        e10.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(e10, i11, u6Var);
        int i18 = tL_starsSubscriptionPricing.period;
        if (i18 == 2592000) {
            e10.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } else {
            if (i18 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            e10.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        d.addView(e10, kb1.x(-1, -2, 17, 20, 0, 20, 4));
        ?? x01Var = new x01(context, u6Var);
        ?? aa0Var = new aa0(context, u6Var);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        aa0Var.setEllipsize(TextUtils.TruncateAt.END);
        int i19 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i19, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, i19, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setSingleLine(true);
        aa0Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(aa0Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        j5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new d70(k3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        aa0Var.setText(spannableStringBuilder);
        if (!z10) {
            x01Var.l(aa0Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        x01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            x01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        d.addView(x01Var, kb1.o(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        aa0 aa0Var2 = new aa0(context, u6Var);
        org.telegram.ui.ActionBar.f7.V(aa0Var2, org.telegram.ui.ActionBar.y6.f23768z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var2, i19, u6Var);
        aa0Var2.setTextSize(1, 14.0f);
        aa0Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new m30(context, 1)));
        aa0Var2.setGravity(17);
        d.addView(aa0Var2, kb1.o(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        d.addView(dVar, kb1.r(-1, 48));
        dVar.setOnClickListener(new n2(k3VarArr, 2));
        i13.customView = d;
        k3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        k3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.L6, false));
        } else if (view instanceof s90) {
            ((s90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.i9) {
            org.telegram.ui.ActionBar.f7.V(((org.telegram.ui.Cells.i9) view).getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.ab) {
            ((org.telegram.ui.Cells.ab) view).i(0);
        }
    }

    public static void m(org.telegram.ui.Components.o70 r23, org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, android.content.Context r27, long r28, org.telegram.ui.ActionBar.r2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o70.m(org.telegram.ui.Components.o70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.r2, int):void");
    }

    public static void n(o70 o70Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        e2Var.c(400L);
        a0(context, o70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, o70Var.resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.u6 y(o70 o70Var) {
        return o70Var.resourcesProvider;
    }

    public final void X() {
        TextView textView = this.W;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23484k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l5, false));
                if (!this.f31212c0) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        b70 b70Var = this.V;
        if (b70Var != null) {
            b70Var.setGlowColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false));
        }
        View view = this.Y;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f31209b;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.f31213d0;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.f31214e0;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f31216f0;
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
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f31217g0);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f31211c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.Q = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final o70 o70Var = o70.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z60.run():void");
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
            if (!this.f31212c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new org.telegram.ui.lo(13, this, z10));
            this.X.start();
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f31224r = -1;
        this.f31225s = -1;
        this.v = -1;
        this.f31226w = -1;
        this.f31227x = -1;
        this.f31228y = -1;
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
        this.f31215f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f31210b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f31209b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f31215f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f31223n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f31213d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f31216f0;
        ArrayList arrayList3 = this.f31214e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f31226w = i13;
            this.f31227x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f31228y = size2;
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
            this.f31224r = i19;
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23300a7);
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
        this.f31222l0 = false;
    }

    public final void updateColors() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23484k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l5, false));
            if (!this.f31212c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false);
        b70 b70Var = this.V;
        b70Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23300a7, false));
        int hiddenChildCount = b70Var.getHiddenChildCount();
        for (int i10 = 0; i10 < b70Var.getChildCount(); i10++) {
            b0(b70Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(b70Var.V(i11));
        }
        int cachedChildCount = b70Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(b70Var.P(i12));
        }
        int attachedScrapChildCount = b70Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(b70Var.O(i13));
        }
        this.containerView.invalidate();
    }
}
