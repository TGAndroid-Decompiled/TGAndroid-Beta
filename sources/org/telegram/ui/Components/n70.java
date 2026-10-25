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
public final class n70 extends org.telegram.ui.ActionBar.k3 {
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
    public final i70 T;
    public final org.telegram.ui.ActionBar.r2 U;
    public final a70 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f30883a0;
    public final TLRPC.TL_chatInviteExported f30884b;
    public final boolean f30885b0;
    public final HashMap f30886c;
    public final boolean f30887c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f30888d0;
    public int e;
    public final ArrayList f30889e0;
    public int f30890f;
    public final ArrayList f30891f0;
    public final long f30892g0;
    public int h;
    public final boolean f30893h0;
    public final long f30894i0;
    public org.telegram.ui.jb f30895j0;
    public boolean f30896k0;
    public boolean f30897l0;
    public int m0;
    public int f30898n;
    public int f30899r;
    public int f30900s;
    public int v;
    public int f30901w;
    public int f30902x;
    public int f30903y;

    public n70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.r2 r2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.f30888d0 = new ArrayList();
        this.f30889e0 = new ArrayList();
        this.f30891f0 = new ArrayList();
        this.f30896k0 = true;
        this.f30897l0 = false;
        this.f30884b = tL_chatInviteExported;
        this.f30886c = hashMap;
        this.U = r2Var;
        this.d = chatFull;
        this.f30892g0 = j10;
        this.f30885b0 = z10;
        this.f30893h0 = z11;
        int i10 = org.telegram.ui.ActionBar.y6.f23297a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBarKey(i10);
        this.m0 = this.navBarColor;
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f30886c = new HashMap();
        }
        this.f30894i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        z60 z60Var = new z60(this, context);
        this.containerView = z60Var;
        z60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        a70 a70Var = new a70(this, context);
        this.V = a70Var;
        a70Var.u1();
        a70Var.setTag(14);
        getContext();
        s4.c0 c0Var = new s4.c0(1, false);
        a70Var.setLayoutManager(c0Var);
        i70 i70Var = new i70(this);
        this.T = i70Var;
        a70Var.setAdapter(i70Var);
        a70Var.setVerticalScrollBarEnabled(false);
        a70Var.setClipToPadding(false);
        a70Var.setNestedScrollingEnabled(true);
        a70Var.setOnScrollListener(new b70(this, c0Var));
        a70Var.setOnItemClickListener(new zl0() {
            @Override
            public final void c(int i11, View view2) {
                n70.m(n70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, r2Var, i11);
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
            this.f30887c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f30887c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f30887c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(a70Var, gb1.h(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        this.containerView.addView(textView, gb1.h(-1, this.f30887c0 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f22168id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new b2(this, 6));
        }
        updateColors();
    }

    public static int B(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int C(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int D(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int G(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int H(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int I(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int J(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int K(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int L(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int M(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static void O(n70 n70Var) {
        View view = n70Var.Y;
        TextView textView = n70Var.W;
        a70 a70Var = n70Var.V;
        if (a70Var.getChildCount() <= 0) {
            int paddingTop = a70Var.getPaddingTop();
            n70Var.Z = paddingTop;
            a70Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(n70Var.Z);
            view.setTranslationY(n70Var.Z);
            n70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = a70Var.getChildAt(0);
        vl0 vl0Var = (vl0) a70Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
            n70Var.Z(false);
            i10 = top;
        } else {
            n70Var.Z(true);
        }
        if (n70Var.Z != i10) {
            n70Var.Z = i10;
            a70Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(n70Var.Z);
            }
            view.setTranslationY(n70Var.Z);
            n70Var.containerView.invalidate();
        }
    }

    public static int Q(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static int R(n70 n70Var) {
        return n70Var.currentAccount;
    }

    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.u6 u6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.k3 i13 = org.telegram.messenger.vh.i(1, context, u6Var, false);
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        ?? d = org.telegram.messenger.vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        d.addView(frameLayout, gb1.x(-1, -2, 7, 0, 0, 0, 10));
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
        frameLayout.addView(y9Var, gb1.i(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        int i14 = org.telegram.ui.ActionBar.y6.f23425h5;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.f7.y(imageView, drawable, i14, u6Var, mode);
        frameLayout.addView(imageView, gb1.i(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, gb1.i(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView e = org.telegram.messenger.vh.e(d, textView, gb1.x(-1, -2, 17, 20, 0, 20, 4), context);
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
        TextView e10 = org.telegram.messenger.vh.e(d, e, gb1.x(-1, -2, 17, 20, 0, 20, 4), context);
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
        d.addView(e10, gb1.x(-1, -2, 17, 20, 0, 20, 4));
        ?? w01Var = new w01(context, u6Var);
        ?? z90Var = new z90(context, u6Var);
        z90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        z90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i19 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.V(z90Var, i19, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, i19, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setSingleLine(true);
        z90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(z90Var, 24.0f, i10);
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
        spannableStringBuilder.setSpan(new c70(k3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        z90Var.setText(spannableStringBuilder);
        if (!z10) {
            w01Var.l(z90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
        }
        w01Var.c(LocaleController.getString(R.string.StarsParticipantSubscriptionStart), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i12 = R.string.StarsParticipantSubscriptionRenews;
            } else {
                i12 = R.string.StarsParticipantSubscriptionExpired;
            }
            w01Var.c(LocaleController.getString(i12), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        d.addView(w01Var, gb1.o(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        z90 z90Var2 = new z90(context, u6Var);
        org.telegram.ui.ActionBar.f7.V(z90Var2, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, i19, u6Var);
        z90Var2.setTextSize(1, 14.0f);
        z90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new m30(context, 1)));
        z90Var2.setGravity(17);
        d.addView(z90Var2, gb1.o(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.OK), false, true);
        d.addView(dVar, gb1.r(-1, 48));
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
        } else if (view instanceof r90) {
            ((r90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.i9) {
            org.telegram.ui.ActionBar.f7.V(((org.telegram.ui.Cells.i9) view).getTextView(), org.telegram.ui.ActionBar.y6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.ab) {
            ((org.telegram.ui.Cells.ab) view).i(0);
        }
    }

    public static void m(org.telegram.ui.Components.n70 r23, org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, android.content.Context r27, long r28, org.telegram.ui.ActionBar.r2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n70.m(org.telegram.ui.Components.n70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.r2, int):void");
    }

    public static void n(n70 n70Var, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        e2Var.c(400L);
        a0(context, n70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, n70Var.resourcesProvider);
    }

    public static org.telegram.ui.ActionBar.u6 y(n70 n70Var) {
        return n70Var.resourcesProvider;
    }

    public final void X() {
        TextView textView = this.W;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23481k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23499l5, false));
                if (!this.f30887c0) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        a70 a70Var = this.V;
        if (a70Var != null) {
            a70Var.setGlowColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false));
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f30884b;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.f30888d0;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.f30889e0;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f30891f0;
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
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f30892g0);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f30886c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.Q = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final n70 n70Var = n70.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y60.run():void");
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
            if (!this.f30887c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new org.telegram.ui.jo(13, this, z10));
            this.X.start();
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f30899r = -1;
        this.f30900s = -1;
        this.v = -1;
        this.f30901w = -1;
        this.f30902x = -1;
        this.f30903y = -1;
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
        this.f30890f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f30885b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f30884b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f30890f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f30898n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f30888d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f30891f0;
        ArrayList arrayList3 = this.f30889e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f30901w = i13;
            this.f30902x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f30903y = size2;
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
            this.f30899r = i19;
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
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
        this.f30897l0 = false;
    }

    public final void updateColors() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23481k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23499l5, false));
            if (!this.f30887c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A5, false);
        a70 a70Var = this.V;
        a70Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23297a7, false));
        int hiddenChildCount = a70Var.getHiddenChildCount();
        for (int i10 = 0; i10 < a70Var.getChildCount(); i10++) {
            b0(a70Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(a70Var.V(i11));
        }
        int cachedChildCount = a70Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(a70Var.P(i12));
        }
        int attachedScrapChildCount = a70Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(a70Var.O(i13));
        }
        this.containerView.invalidate();
    }
}
