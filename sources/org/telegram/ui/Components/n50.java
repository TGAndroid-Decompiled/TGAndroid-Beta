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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class n50 extends org.telegram.ui.ActionBar.v2 {
    public static final int f36253e2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public final i50 K1;
    public final org.telegram.ui.ActionBar.f2 L1;
    public final a50 M1;
    public final TextView N1;
    public AnimatorSet O1;
    public final View P1;
    public int Q1;
    public boolean R1;
    public final boolean S1;
    public final boolean T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final long X1;
    public final boolean Y1;
    public final long Z1;
    public org.telegram.ui.bb f36254a2;
    public boolean f36255b2;
    public boolean f36256c2;
    public int d2;
    public final TLRPC.TL_chatInviteExported f36257i1;
    public final HashMap f36258j1;
    public final TLRPC.ChatFull f36259k1;
    public int l1;
    public int f36260m1;
    public int n1;
    public int f36261o1;
    public int f36262p1;
    public int f36263q1;
    public int f36264r1;
    public int f36265s1;
    public int f36266t1;
    public int f36267u1;
    public int f36268v1;
    public int f36269w1;
    public int f36270x1;
    public int f36271y1;
    public int f36272z1;

    public n50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.f2 f2Var, final long j3, boolean z9, boolean z10) {
        super(context, false);
        float f10;
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.f36255b2 = true;
        this.f36256c2 = false;
        this.f36257i1 = tL_chatInviteExported;
        this.f36258j1 = hashMap;
        this.L1 = f2Var;
        this.f36259k1 = chatFull;
        this.X1 = j3;
        this.S1 = z9;
        this.Y1 = z10;
        int i7 = org.telegram.ui.ActionBar.l6.f27809a7;
        v0(org.telegram.ui.ActionBar.l6.w0(i7, this.I0));
        P(i7);
        this.d2 = this.G0;
        this.f28622a0 = -1;
        if (hashMap == null) {
            this.f36258j1 = new HashMap();
        }
        this.Z1 = ConnectionsManager.getInstance(this.f28621a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        z40 z40Var = new z40(this, context);
        this.f28624b = z40Var;
        z40Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.P1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f28624b.addView(view, layoutParams);
        a50 a50Var = new a50(this, context);
        this.M1 = a50Var;
        a50Var.r1();
        a50Var.setTag(14);
        getContext();
        v4.b0 b0Var = new v4.b0(1, false);
        a50Var.setLayoutManager(b0Var);
        i50 i50Var = new i50(this);
        this.K1 = i50Var;
        a50Var.setAdapter(i50Var);
        a50Var.setVerticalScrollBarEnabled(false);
        a50Var.setClipToPadding(false);
        a50Var.setNestedScrollingEnabled(true);
        a50Var.setOnScrollListener(new b50(this, b0Var));
        a50Var.setOnItemClickListener(new cj0() {
            @Override
            public final void c(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w40.c(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.N1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (!z9) {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.id.M0(2131750875, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.id.M0(2131746014, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131749149, null));
            }
            this.T1 = true;
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131749149, null));
            this.T1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.f28624b;
        if (!this.T1) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        viewGroup.addView(a50Var, c8.ha.d(-1, -1.0f, 51, 0.0f, f10, 0.0f, 0.0f));
        this.f28624b.addView(textView, c8.ha.d(-1, this.T1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        O0();
        K0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f27099id.add(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).o1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_users_getUsers, new x1(this, 5));
        }
        updateColors();
    }

    public static void I0(n50 n50Var) {
        View view = n50Var.P1;
        TextView textView = n50Var.N1;
        a50 a50Var = n50Var.M1;
        if (a50Var.getChildCount() <= 0) {
            int paddingTop = a50Var.getPaddingTop();
            n50Var.Q1 = paddingTop;
            a50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(n50Var.Q1);
            view.setTranslationY(n50Var.Q1);
            n50Var.f28624b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = a50Var.getChildAt(0);
        yi0 yi0Var = (yi0) a50Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && yi0Var != null && yi0Var.b() == 0) {
            n50Var.L0(false);
            i7 = top;
        } else {
            n50Var.L0(true);
        }
        if (n50Var.Q1 != i7) {
            n50Var.Q1 = i7;
            a50Var.setTopGlowOffset(i7);
            if (textView != null) {
                textView.setTranslationY(n50Var.Q1);
            }
            view.setTranslationY(n50Var.Q1);
            n50Var.f28624b.invalidate();
        }
    }

    public static void M0(Context context, int i7, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.g6 g6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        boolean z9;
        String str;
        int i11;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        ?? f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        f10.addView(frameLayout, c8.ha.t(-1, -2, 7, 0, 0, 0, 10));
        ?? l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
        if (j3 >= 0) {
            r16 = 0;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(j3));
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
        } else {
            r16 = 0;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
        }
        frameLayout.addView(l9Var, c8.ha.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232753);
        int i12 = org.telegram.ui.ActionBar.l6.f27938h5;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i12, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232752);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.s6.x(imageView, drawable, i12, g6Var, mode);
        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, c8.ha.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.f27973j5, g6Var, 1, 20.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131744971);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.l6.B6;
        org.telegram.ui.ActionBar.s6.U(f11, i13, g6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f11.setText(bi.dd.a1(r16, org.telegram.messenger.id.a0(null, null, 2131744983, objArr), 0.8f, null));
            i10 = i13;
        } else {
            obj = "min";
            boolean z10 = r16;
            if (i14 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            Locale locale = Locale.US;
            i10 = i13;
            Object[] objArr2 = new Object[2];
            objArr2[z10 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f11.setText(bi.dd.a1(z10, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.t(-1, -2, 17, 20, 0, 20, 4), context);
        f12.setTextSize(1, 14.0f);
        f12.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(f12, i10, g6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            f12.setText(org.telegram.messenger.id.a0(null, null, 2131745058, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.qp.s1(i7).f24755c6), "USD")));
        } else {
            if (i15 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            f12.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.qp.s1(i7).f24755c6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        f10.addView(f12, c8.ha.t(-1, -2, 17, 20, 0, 20, 4));
        ?? ux0Var = new ux0(context, g6Var);
        ?? x70Var = new x70(context, g6Var);
        x70Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        x70Var.setEllipsize(TextUtils.TruncateAt.END);
        int i16 = org.telegram.ui.ActionBar.l6.Uc;
        org.telegram.ui.ActionBar.s6.U(x70Var, i16, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, i16, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setSingleLine(true);
        x70Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, x70Var);
        TLRPC.User a23 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(tL_chatInviteImporter.user_id));
        if (a23 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        String p10 = org.telegram.messenger.t10.p(a23);
        f5Var.e(a23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) p10));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new c50(v2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        x70Var.setText(spannableStringBuilder);
        if (!z9) {
            str = null;
            ux0Var.l(x70Var, org.telegram.messenger.id.M0(2131745059, null));
        } else {
            str = null;
        }
        ux0Var.c(org.telegram.messenger.id.M0(2131745054, str), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i11 = 2131745055;
            } else {
                i11 = 2131745057;
            }
            ux0Var.c(org.telegram.messenger.id.M0(i11, null), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        f10.addView(ux0Var, c8.ha.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        x70 x70Var2 = new x70(context, g6Var);
        org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, i16, g6Var);
        x70Var2.setTextSize(1, 14.0f);
        x70Var2.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744926, null), new s10(context, 1)));
        x70Var2.setGravity(17);
        f10.addView(x70Var2, c8.ha.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        fi.d dVar = new fi.d(context, g6Var, true);
        dVar.i(org.telegram.messenger.id.M0(2131747831, null), false, true);
        f10.addView(dVar, c8.ha.o(-1, 48));
        dVar.setOnClickListener(new i2(v2VarArr, 2));
        l10.N = f10;
        v2VarArr[0] = l10;
        l10.T0 = false;
        l10.N();
        v2VarArr[0].show();
    }

    public static void N0(View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            ((org.telegram.ui.Cells.n4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.L6, false));
        } else if (view instanceof r70) {
            ((r70) view).f();
        } else if (view instanceof org.telegram.ui.Cells.z8) {
            org.telegram.ui.ActionBar.s6.U(((org.telegram.ui.Cells.z8) view).getTextView(), org.telegram.ui.ActionBar.l6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.pa) {
            ((org.telegram.ui.Cells.pa) view).i(0);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        TextView textView = this.N1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27993k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28011l5, false));
                if (!this.T1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        a50 a50Var = this.M1;
        if (a50Var != null) {
            a50Var.setGlowColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.A5, false));
        }
        View view = this.P1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.V5, false));
        }
    }

    public final void K0() {
        boolean z9;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final ArrayList arrayList;
        if (!this.H1) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36257i1;
            int i7 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.U1;
            if (i7 > arrayList2.size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.V1;
            if (i10 > arrayList3.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.W1;
            if (z14 && tL_chatInviteExported.requested > arrayList4.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z9) {
                z13 = false;
                z12 = false;
            } else if (z10) {
                z13 = false;
                z12 = true;
            } else if (z11) {
                z12 = false;
                z13 = true;
            } else {
                return;
            }
            if (z13) {
                arrayList = arrayList4;
            } else if (z12) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList2;
            }
            TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = tL_chatInviteExported.link;
            tL_messages_getChatInviteImporters.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).j1(-this.X1);
            tL_messages_getChatInviteImporters.requested = z13;
            tL_messages_getChatInviteImporters.subscription_expired = z12;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.qp.s1(this.f28621a).q1((TLRPC.User) this.f36258j1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.H1 = true;
            ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final n50 n50Var = n50.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z15 = z13;
                    final boolean z16 = z12;
                    final boolean z17 = z11;
                    final boolean z18 = z10;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y40.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void L0(boolean z9) {
        Integer num;
        float f10;
        View view = this.P1;
        if ((z9 && view.getTag() != null) || (!z9 && view.getTag() == null)) {
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.N1;
            if (z9) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.O1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.O1 = animatorSet2;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            if (!this.T1) {
                AnimatorSet animatorSet3 = this.O1;
                if (z9) {
                    f11 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f11));
            }
            this.O1.setDuration(150L);
            this.O1.addListener(new t9(12, this, z9));
            this.O1.start();
        }
    }

    public final void O0() {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        this.J1 = 0;
        this.f36262p1 = -1;
        this.f36263q1 = -1;
        this.f36264r1 = -1;
        this.f36265s1 = -1;
        this.f36266t1 = -1;
        this.f36267u1 = -1;
        this.B1 = -1;
        this.C1 = -1;
        this.f36271y1 = -1;
        this.f36272z1 = -1;
        this.D1 = -1;
        this.E1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.A1 = -1;
        this.l1 = -1;
        this.f36260m1 = -1;
        this.f36268v1 = -1;
        this.f36269w1 = -1;
        this.f36270x1 = -1;
        boolean z12 = true;
        if (!this.S1) {
            this.f36271y1 = 0;
            this.J1 = 2;
            this.f36272z1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36257i1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i7 = this.J1;
            this.l1 = i7;
            this.J1 = i7 + 2;
            this.f36260m1 = i7 + 1;
        }
        int i10 = this.J1;
        this.n1 = i10;
        this.J1 = i10 + 2;
        this.f36261o1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        if (i11 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        ArrayList arrayList = this.U1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.W1;
        ArrayList arrayList3 = this.V1;
        if (i11 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!arrayList.isEmpty()) {
            int i12 = this.J1;
            int i13 = i12 + 1;
            this.J1 = i13;
            this.f36265s1 = i12;
            this.f36266t1 = i13;
            int size2 = arrayList.size() + i13;
            this.J1 = size2;
            this.f36267u1 = size2;
            z11 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.J1;
            int i15 = i14 + 1;
            this.J1 = i15;
            this.f36268v1 = i14;
            this.f36269w1 = i15;
            int size3 = arrayList3.size() + i15;
            this.J1 = size3;
            this.f36270x1 = size3;
            z11 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i16 = this.J1;
            int i17 = i16 + 1;
            this.J1 = i17;
            this.E1 = i16;
            this.F1 = i17;
            int size4 = arrayList2.size() + i17;
            this.J1 = size4;
            this.G1 = size4;
        } else {
            z12 = z11;
        }
        if ((z9 || z10) && !z12) {
            int i18 = this.J1;
            this.f36262p1 = i18;
            this.A1 = i18 + 1;
            this.J1 = i18 + 3;
            this.B1 = i18 + 2;
        }
        this.K1.f();
    }

    @Override
    public final void s0() {
        int i7;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, this.I0);
            if (this.f28651r0 != null) {
                v0(w02);
            }
            if (this.F0 < 0 && (i7 = this.G0) == this.d2 && w02 != i7) {
                this.G0 = w02;
                this.d2 = w02;
                E0(w02);
            }
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f36256c2 = false;
    }

    public final void updateColors() {
        TextView textView = this.N1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27993k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28011l5, false));
            if (!this.T1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.A5, false);
        a50 a50Var = this.M1;
        a50Var.setGlowColor(x02);
        this.P1.setBackgroundColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.V5, false));
        v0(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false));
        int hiddenChildCount = a50Var.getHiddenChildCount();
        for (int i7 = 0; i7 < a50Var.getChildCount(); i7++) {
            N0(a50Var.getChildAt(i7));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            N0(a50Var.V(i10));
        }
        int cachedChildCount = a50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            N0(a50Var.P(i11));
        }
        int attachedScrapChildCount = a50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            N0(a50Var.O(i12));
        }
        this.f28624b.invalidate();
    }
}
