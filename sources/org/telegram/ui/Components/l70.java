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
public final class l70 extends org.telegram.ui.ActionBar.f3 {
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
    public final g70 T;
    public final org.telegram.ui.ActionBar.n2 U;
    public final y60 V;
    public final TextView W;
    public AnimatorSet X;
    public final View Y;
    public int Z;
    public boolean f28071a0;
    public final TLRPC.TL_chatInviteExported f28072b;
    public final boolean f28073b0;
    public final HashMap f28074c;
    public final boolean f28075c0;
    public final TLRPC.ChatFull d;
    public final ArrayList f28076d0;
    public int e;
    public final ArrayList f28077e0;
    public int f28078f;
    public final ArrayList f28079f0;
    public final long f28080g0;
    public int h;
    public final boolean f28081h0;
    public final long f28082i0;
    public org.telegram.ui.ib f28083j0;
    public boolean f28084k0;
    public boolean f28085l0;
    public int f28086n;
    public int f28087r;
    public int f28088s;
    public int v;
    public int f28089w;
    public int f28090x;
    public int f28091y;

    public l70(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.n2 n2Var, final long j10, boolean z10, boolean z11) {
        super(context, false);
        float f7;
        this.f28076d0 = new ArrayList();
        this.f28077e0 = new ArrayList();
        this.f28079f0 = new ArrayList();
        this.f28084k0 = true;
        this.f28085l0 = false;
        this.f28072b = tL_chatInviteExported;
        this.f28074c = hashMap;
        this.U = n2Var;
        this.d = chatFull;
        this.f28080g0 = j10;
        this.f28073b0 = z10;
        this.f28081h0 = z11;
        int i10 = org.telegram.ui.ActionBar.h6.f20936a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        this.behindKeyboardColorKey = -1;
        if (hashMap == null) {
            this.f28074c = new HashMap();
        }
        this.f28082i0 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        x60 x60Var = new x60(this, context);
        this.containerView = x60Var;
        x60Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.Y = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        y60 y60Var = new y60(this, context);
        this.V = y60Var;
        y60Var.p1();
        y60Var.setTag(14);
        getContext();
        s4.b0 b0Var = new s4.b0(1, false);
        y60Var.setLayoutManager(b0Var);
        g70 g70Var = new g70(this);
        this.T = g70Var;
        y60Var.setAdapter(g70Var);
        y60Var.setVerticalScrollBarEnabled(false);
        y60Var.setClipToPadding(false);
        y60Var.setNestedScrollingEnabled(true);
        y60Var.setOnScrollListener(new z60(this, b0Var));
        y60Var.setOnItemClickListener(new xl0() {
            @Override
            public final void a(int i11, View view2) {
                l70.n(l70.this, tL_chatInviteExported, hashMap, chatFull, context, j10, n2Var, i11);
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
            this.f28075c0 = true;
        } else {
            textView.setText(LocaleController.getString(R.string.InviteLink));
            this.f28075c0 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.containerView;
        if (!this.f28075c0) {
            f7 = 0.0f;
        } else {
            f7 = 44.0f;
        }
        viewGroup.addView(y60Var, w7.z5.d(-1, -1.0f, 51, 0.0f, f7, 0.0f, 0.0f));
        this.containerView.addView(textView, w7.z5.d(-1, this.f28075c0 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c0();
        Y();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f20421id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new y1(this, 6));
        }
        d();
    }

    public static int I(l70 l70Var) {
        return l70Var.currentAccount;
    }

    public static void P(l70 l70Var) {
        View view = l70Var.Y;
        TextView textView = l70Var.W;
        y60 y60Var = l70Var.V;
        if (y60Var.getChildCount() <= 0) {
            int paddingTop = y60Var.getPaddingTop();
            l70Var.Z = paddingTop;
            y60Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(l70Var.Z);
            view.setTranslationY(l70Var.Z);
            l70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = y60Var.getChildAt(0);
        tl0 tl0Var = (tl0) y60Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && tl0Var != null && tl0Var.b() == 0) {
            l70Var.Z(false);
            i10 = top;
        } else {
            l70Var.Z(true);
        }
        if (l70Var.Z != i10) {
            l70Var.Z = i10;
            y60Var.setTopGlowOffset(i10);
            if (textView != null) {
                textView.setTranslationY(l70Var.Z);
            }
            view.setTranslationY(l70Var.Z);
            l70Var.containerView.invalidate();
        }
    }

    public static void a0(Context context, int i10, long j10, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.d6 d6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i11;
        Object obj3;
        boolean z10;
        int i12;
        org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.nk.i(1, context, d6Var, false);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        ?? e = org.telegram.messenger.nk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        e.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 10));
        ?? w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(50.0f));
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        if (j10 >= 0) {
            r16 = 0;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            r16 = 0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
        frameLayout.addView(w9Var, w7.z5.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065h5, d6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.f21100j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i14.setTextSize(1, 14.0f);
        i14.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.h6.B6;
        i14.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, d6Var));
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
            i14.setText(ai.md.Y0(z11, String.format(locale, "⭐%1$d/%2$s", objArr), 0.8f, null));
        } else {
            int i17 = R.string.StarsSubscriptionPrice;
            obj = "min";
            Object[] objArr2 = new Object[1];
            objArr2[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            i14.setText(ai.md.Y0(r16, LocaleController.formatString(i17, objArr2), 0.8f, null));
            i11 = i15;
        }
        TextView i18 = com.google.android.gms.internal.play_billing.k3.i(e, i14, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        i18.setTextSize(1, 14.0f);
        i18.setGravity(17);
        i18.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int i19 = tL_starsSubscriptionPricing.period;
        if (i19 == 2592000) {
            i18.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD")));
        } else {
            if (i19 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            i18.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) (MessagesController.getInstance(i10).starsUsdWithdrawRate1000 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        e.addView(i18, w7.z5.t(-1, -2, 17, 20, 0, 20, 4));
        ?? l01Var = new l01(context, d6Var);
        ?? x90Var = new x90(context, d6Var);
        x90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        x90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i20 = org.telegram.ui.ActionBar.h6.f21053gc;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
        x90Var.setTextSize(1, 14.0f);
        x90Var.setSingleLine(true);
        x90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(x90Var, 24.0f, i10);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        if (user2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String userName = UserObject.getUserName(user2);
        l5Var.e(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new a70(f3VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        x90Var.setText(spannableStringBuilder);
        if (!z10) {
            l01Var.l(x90Var, LocaleController.getString(R.string.StarsParticipantSubscription));
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
        e.addView(l01Var, w7.z5.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        x90 x90Var2 = new x90(context, d6Var);
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21399z6, d6Var));
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
        x90Var2.setTextSize(1, 14.0f);
        x90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new k30(context, 1)));
        x90Var2.setGravity(17);
        e.addView(x90Var2, w7.z5.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        e.addView(dVar, w7.z5.n(-1, 48));
        dVar.setOnClickListener(new l2(f3VarArr, 2));
        i13.customView = e;
        f3VarArr[0] = i13;
        i13.useBackgroundTopPadding = false;
        i13.fixNavigationBar();
        f3VarArr[0].show();
    }

    public static void b0(View view) {
        if (view instanceof org.telegram.ui.Cells.l4) {
            ((org.telegram.ui.Cells.l4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
        } else if (view instanceof q90) {
            ((q90) view).f();
        } else if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        } else if (view instanceof org.telegram.ui.Cells.va) {
            ((org.telegram.ui.Cells.va) view).j(0);
        }
    }

    public static void n(org.telegram.ui.Components.l70 r23, org.telegram.tgnet.TLRPC.TL_chatInviteExported r24, java.util.HashMap r25, org.telegram.tgnet.TLRPC.ChatFull r26, android.content.Context r27, long r28, org.telegram.ui.ActionBar.n2 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l70.n(org.telegram.ui.Components.l70, org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.n2, int):void");
    }

    public static void o(l70 l70Var, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        b2Var.c(400L);
        a0(context, l70Var.currentAccount, -j10, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, l70Var.resourcesProvider);
    }

    public final void Y() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.Q) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f28072b;
            int i10 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.f28076d0;
            if (i10 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.f28077e0;
            if (i11 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f28079f0;
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
            tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.f28080g0);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.f28074c.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.Q = true;
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final l70 l70Var = l70.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w60.run():void");
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
            if (!this.f28075c0) {
                AnimatorSet animatorSet3 = this.X;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f10));
            }
            this.X.setDuration(150L);
            this.X.addListener(new org.telegram.ui.fo(13, this, z10));
            this.X.start();
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.S = 0;
        this.f28087r = -1;
        this.f28088s = -1;
        this.v = -1;
        this.f28089w = -1;
        this.f28090x = -1;
        this.f28091y = -1;
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
        this.f28078f = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        boolean z13 = true;
        if (!this.f28073b0) {
            this.H = 0;
            this.S = 2;
            this.I = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f28072b;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i10 = this.S;
            this.e = i10;
            this.S = i10 + 2;
            this.f28078f = i10 + 1;
        }
        int i11 = this.S;
        this.h = i11;
        this.S = i11 + 2;
        this.f28086n = i11 + 1;
        int i12 = tL_chatInviteExported.usage;
        if (i12 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.f28076d0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f28079f0;
        ArrayList arrayList3 = this.f28077e0;
        if (i12 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i13 = this.S;
            int i14 = i13 + 1;
            this.S = i14;
            this.f28089w = i13;
            this.f28090x = i14;
            int size2 = arrayList.size() + i14;
            this.S = size2;
            this.f28091y = size2;
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
            this.f28087r = i19;
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

    public final void d() {
        TextView textView = this.W;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21100j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21120k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21137l5, false));
            if (!this.f28075c0) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false);
        y60 y60Var = this.V;
        y60Var.setGlowColor(x02);
        this.Y.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        int hiddenChildCount = y60Var.getHiddenChildCount();
        for (int i10 = 0; i10 < y60Var.getChildCount(); i10++) {
            b0(y60Var.getChildAt(i10));
        }
        for (int i11 = 0; i11 < hiddenChildCount; i11++) {
            b0(y60Var.V(i11));
        }
        int cachedChildCount = y60Var.getCachedChildCount();
        for (int i12 = 0; i12 < cachedChildCount; i12++) {
            b0(y60Var.P(i12));
        }
        int attachedScrapChildCount = y60Var.getAttachedScrapChildCount();
        for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
            b0(y60Var.O(i13));
        }
        this.containerView.invalidate();
    }

    @Override
    public final void show() {
        super.show();
        this.f28085l0 = false;
    }
}
