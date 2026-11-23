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
public final class x50 extends org.telegram.ui.ActionBar.w2 {
    public static final int f41828i2 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public int N1;
    public final s50 O1;
    public final org.telegram.ui.ActionBar.g2 P1;
    public final k50 Q1;
    public final TextView R1;
    public AnimatorSet S1;
    public final View T1;
    public int U1;
    public boolean V1;
    public final boolean W1;
    public final boolean X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f41829a2;
    public final long f41830b2;
    public final boolean f41831c2;
    public final long d2;
    public org.telegram.ui.ab f41832e2;
    public boolean f41833f2;
    public boolean f41834g2;
    public int f41835h2;
    public final TLRPC.TL_chatInviteExported f41836m1;
    public final HashMap n1;
    public final TLRPC.ChatFull f41837o1;
    public int f41838p1;
    public int f41839q1;
    public int f41840r1;
    public int f41841s1;
    public int f41842t1;
    public int f41843u1;
    public int f41844v1;
    public int f41845w1;
    public int f41846x1;
    public int f41847y1;
    public int f41848z1;

    public x50(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap hashMap, final org.telegram.ui.ActionBar.g2 g2Var, final long j3, boolean z10, boolean z11) {
        super(context, false);
        float f10;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f41829a2 = new ArrayList();
        this.f41833f2 = true;
        this.f41834g2 = false;
        this.f41836m1 = tL_chatInviteExported;
        this.n1 = hashMap;
        this.P1 = g2Var;
        this.f41837o1 = chatFull;
        this.f41830b2 = j3;
        this.W1 = z10;
        this.f41831c2 = z11;
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        v0(org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        Q(i7);
        this.f41835h2 = this.H0;
        this.f30227b0 = -1;
        if (hashMap == null) {
            this.n1 = new HashMap();
        }
        this.d2 = ConnectionsManager.getInstance(this.f30223a).getCurrentTime() - (System.currentTimeMillis() / 1000);
        j50 j50Var = new j50(this, context);
        this.f30226b = j50Var;
        j50Var.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        this.T1 = view;
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f30226b.addView(view, layoutParams);
        k50 k50Var = new k50(this, context);
        this.Q1 = k50Var;
        k50Var.r1();
        k50Var.setTag(14);
        getContext();
        v4.c0 c0Var = new v4.c0(1, false);
        k50Var.setLayoutManager(c0Var);
        s50 s50Var = new s50(this);
        this.O1 = s50Var;
        k50Var.setAdapter(s50Var);
        k50Var.setVerticalScrollBarEnabled(false);
        k50Var.setClipToPadding(false);
        k50Var.setNestedScrollingEnabled(true);
        k50Var.setOnScrollListener(new l50(this, c0Var));
        k50Var.setOnItemClickListener(new qj0() {
            @Override
            public final void b(int r24, android.view.View r25) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g50.b(int, android.view.View):void");
            }
        });
        TextView textView = new TextView(context);
        this.R1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextSize(1, 20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        textView.setGravity(16);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            if (tL_chatInviteExported.expired) {
                textView.setText(org.telegram.messenger.gd.N0(2131750863, null));
            } else if (tL_chatInviteExported.revoked) {
                textView.setText(org.telegram.messenger.gd.N0(2131745818, null));
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131748956, null));
            }
            this.X1 = true;
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131748956, null));
            this.X1 = false;
            textView.setVisibility(4);
            textView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.j6.l(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false);
            textView.setText(spannableStringBuilder);
        }
        ViewGroup viewGroup = this.f30226b;
        if (!this.X1) {
            f10 = 0.0f;
        } else {
            f10 = 44.0f;
        }
        viewGroup.addView(k50Var, c8.na.d(-1, -1.0f, 51, 0.0f, f10, 0.0f, 0.0f));
        this.f30226b.addView(textView, c8.na.d(-1, this.X1 ? 50.0f : 44.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        P0();
        L0();
        if (hashMap == null || hashMap.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
            tL_users_getUsers.f28635id.add(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).q1(tL_chatInviteExported.admin_id));
            ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).sendRequest(tL_users_getUsers, new e2(this, 5));
        }
        updateColors();
    }

    public static void J0(x50 x50Var) {
        View view = x50Var.T1;
        TextView textView = x50Var.R1;
        k50 k50Var = x50Var.Q1;
        if (k50Var.getChildCount() <= 0) {
            int paddingTop = k50Var.getPaddingTop();
            x50Var.U1 = paddingTop;
            k50Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(x50Var.U1);
            view.setTranslationY(x50Var.U1);
            x50Var.f30226b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = k50Var.getChildAt(0);
        mj0 mj0Var = (mj0) k50Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            x50Var.M0(false);
            i7 = top;
        } else {
            x50Var.M0(true);
        }
        if (x50Var.U1 != i7) {
            x50Var.U1 = i7;
            k50Var.setTopGlowOffset(i7);
            if (textView != null) {
                textView.setTranslationY(x50Var.U1);
            }
            view.setTranslationY(x50Var.U1);
            x50Var.f30226b.invalidate();
        }
    }

    public static void N0(Context context, int i7, long j3, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, org.telegram.ui.ActionBar.i6 i6Var) {
        ?? r16;
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        boolean z10;
        String str;
        int i11;
        org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        ?? g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        g10.addView(frameLayout, c8.na.t(-1, -2, 7, 0, 0, 0, 10));
        ?? p9Var = new p9(context);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        if (j3 >= 0) {
            r16 = 0;
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
        } else {
            r16 = 0;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
            a9Var.q(O0);
            p9Var.f(O0, a9Var);
        }
        frameLayout.addView(p9Var, c8.na.e(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(2131232758);
        int i12 = org.telegram.ui.ActionBar.n6.f29524h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        Drawable drawable2 = context.getResources().getDrawable(2131232757);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        org.telegram.ui.ActionBar.u6.x(imageView, drawable, i12, i6Var, mode);
        frameLayout.addView(imageView, c8.na.e(28, 28, 17));
        imageView.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, c8.na.e(28, 28, 17));
        imageView2.setTranslationX(org.telegram.messenger.g0.L(34.0f));
        imageView2.setTranslationY(org.telegram.messenger.g0.L(35.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 20.0f);
        org.telegram.messenger.f3.k(textView, 17, null, 2131744730);
        TextView f10 = org.telegram.messenger.m10.f(g10, textView, c8.na.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.n6.B6;
        org.telegram.ui.ActionBar.u6.U(f10, i13, i6Var);
        int i14 = tL_starsSubscriptionPricing.period;
        if (i14 == 2592000) {
            obj = "min";
            Object[] objArr = new Object[1];
            objArr[r16] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            f10.setText(di.pb.b1(r16, org.telegram.messenger.gd.a0(null, null, 2131744742, objArr), 0.8f, null));
            i10 = i13;
        } else {
            obj = "min";
            boolean z11 = r16;
            if (i14 == 300) {
                obj2 = "5min";
            } else {
                obj2 = obj;
            }
            Locale locale = Locale.US;
            i10 = i13;
            Object[] objArr2 = new Object[2];
            objArr2[z11 ? 1 : 0] = Long.valueOf(tL_starsSubscriptionPricing.amount);
            objArr2[1] = obj2;
            f10.setText(di.pb.b1(z11, String.format(locale, "⭐%1$d/%2$s", objArr2), 0.8f, null));
        }
        TextView f11 = org.telegram.messenger.m10.f(g10, f10, c8.na.t(-1, -2, 17, 20, 0, 20, 4), context);
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(f11, i10, i6Var);
        int i15 = tL_starsSubscriptionPricing.period;
        if (i15 == 2592000) {
            f11.setText(org.telegram.messenger.gd.a0(null, null, 2131744817, org.telegram.messenger.r1.i().f((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * org.telegram.messenger.mp.u1(i7).f25743f6), "USD")));
        } else {
            if (i15 == 300) {
                obj3 = "5min";
            } else {
                obj3 = obj;
            }
            f11.setText(String.format(Locale.US, "appx. %1$s per %2$s", org.telegram.messenger.r1.i().f((int) (org.telegram.messenger.mp.u1(i7).f25743f6 * (tL_starsSubscriptionPricing.amount / 1000.0d)), "USD"), obj3));
        }
        g10.addView(f11, c8.na.t(-1, -2, 17, 20, 0, 20, 4));
        ?? dy0Var = new dy0(context, i6Var);
        ?? j80Var = new j80(context, i6Var);
        j80Var.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i16 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.U(j80Var, i16, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, i16, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setSingleLine(true);
        j80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(24.0f, i7, j80Var);
        TLRPC.User c23 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_chatInviteImporter.user_id));
        if (c23 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String q10 = org.telegram.messenger.n10.q(c23);
        f5Var.e(c23);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) q10));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        spannableStringBuilder.setSpan(new m50(w2VarArr, tL_chatInviteImporter), 3, spannableStringBuilder.length(), 33);
        j80Var.setText(spannableStringBuilder);
        if (!z10) {
            str = null;
            dy0Var.l(j80Var, org.telegram.messenger.gd.N0(2131744818, null));
        } else {
            str = null;
        }
        dy0Var.e(org.telegram.messenger.gd.N0(2131744813, str), org.telegram.messenger.gd.a0(null, null, 2131742512, org.telegram.messenger.gd.E0().s0().format(new Date(tL_chatInviteImporter.date * 1000)), org.telegram.messenger.gd.E0().p0().format(new Date(tL_chatInviteImporter.date * 1000))), null, null);
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        if (channelParticipant != null) {
            if (channelParticipant.subscription_until_date > currentTime) {
                i11 = 2131744814;
            } else {
                i11 = 2131744816;
            }
            dy0Var.e(org.telegram.messenger.gd.N0(i11, null), org.telegram.messenger.gd.a0(null, null, 2131742512, org.telegram.messenger.gd.E0().s0().format(new Date(channelParticipant.subscription_until_date * 1000)), org.telegram.messenger.gd.E0().p0().format(new Date(channelParticipant.subscription_until_date * 1000))), null, null);
        }
        g10.addView(dy0Var, c8.na.k(0.0f, 17.0f, 0.0f, 0.0f, -1, -2));
        j80 j80Var2 = new j80(context, i6Var);
        org.telegram.ui.ActionBar.u6.U(j80Var2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i16, i6Var);
        j80Var2.setTextSize(1, 14.0f);
        j80Var2.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131744685, null), new c20(context, 1)));
        j80Var2.setGravity(17);
        g10.addView(j80Var2, c8.na.k(14.0f, 15.0f, 14.0f, 15.0f, -1, -2));
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.i(org.telegram.messenger.gd.N0(2131747637, null), false, true);
        g10.addView(eVar, c8.na.o(-1, 48));
        eVar.setOnClickListener(new q2(w2VarArr, 1));
        j10.O = g10;
        w2VarArr[0] = j10;
        j10.U0 = false;
        j10.O();
        w2VarArr[0].show();
    }

    public static void O0(View view) {
        if (view instanceof org.telegram.ui.Cells.o4) {
            ((org.telegram.ui.Cells.o4) view).getTextView().setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.L6, false));
        } else if (view instanceof d80) {
            ((d80) view).f();
        } else if (view instanceof org.telegram.ui.Cells.z8) {
            org.telegram.ui.ActionBar.u6.U(((org.telegram.ui.Cells.z8) view).getTextView(), org.telegram.ui.ActionBar.n6.B6, null);
        } else if (view instanceof org.telegram.ui.Cells.sa) {
            ((org.telegram.ui.Cells.sa) view).i(0);
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void K0() {
        TextView textView = this.R1;
        if (textView != null) {
            try {
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
                textView.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29579k5, false));
                textView.setHighlightColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29597l5, false));
                if (!this.X1) {
                    textView.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        k50 k50Var = this.Q1;
        if (k50Var != null) {
            k50Var.setGlowColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.A5, false));
        }
        View view = this.T1;
        if (view != null) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.V5, false));
        }
    }

    public final void L0() {
        boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final ArrayList arrayList;
        if (!this.L1) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41836m1;
            int i7 = tL_chatInviteExported.usage;
            ArrayList arrayList2 = this.Y1;
            if (i7 > arrayList2.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = tL_chatInviteExported.subscription_expired;
            ArrayList arrayList3 = this.Z1;
            if (i10 > arrayList3.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = tL_chatInviteExported.request_needed;
            ArrayList arrayList4 = this.f41829a2;
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
            tL_messages_getChatInviteImporters.peer = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).l1(-this.f41830b2);
            tL_messages_getChatInviteImporters.requested = z14;
            tL_messages_getChatInviteImporters.subscription_expired = z13;
            if (arrayList.isEmpty()) {
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
            } else {
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(arrayList.size() - 1);
                tL_messages_getChatInviteImporters.offset_user = org.telegram.messenger.mp.u1(this.f30223a).s1((TLRPC.User) this.n1.get(Long.valueOf(tL_chatInviteImporter.user_id)));
                tL_messages_getChatInviteImporters.offset_date = tL_chatInviteImporter.date;
            }
            this.L1 = true;
            ConnectionsManager.getInstance(org.telegram.messenger.i10.f24637t0).sendRequest(tL_messages_getChatInviteImporters, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final x50 x50Var = x50.this;
                    final ArrayList arrayList5 = arrayList;
                    final boolean z16 = z14;
                    final boolean z17 = z13;
                    final boolean z18 = z12;
                    final boolean z19 = z11;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i50.run():void");
                        }
                    });
                }
            });
        }
    }

    public final void M0(boolean z10) {
        Integer num;
        float f10;
        View view = this.T1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            TextView textView = this.R1;
            if (z10) {
                view.setVisibility(0);
                textView.setVisibility(0);
            }
            AnimatorSet animatorSet = this.S1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.S1 = animatorSet2;
            Property property = View.ALPHA;
            float f11 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            if (!this.X1) {
                AnimatorSet animatorSet3 = this.S1;
                if (z10) {
                    f11 = 1.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(textView, property, f11));
            }
            this.S1.setDuration(150L);
            this.S1.addListener(new org.telegram.ui.on(13, this, z10));
            this.S1.start();
        }
    }

    public final void P0() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        this.N1 = 0;
        this.f41842t1 = -1;
        this.f41843u1 = -1;
        this.f41844v1 = -1;
        this.f41845w1 = -1;
        this.f41846x1 = -1;
        this.f41847y1 = -1;
        this.F1 = -1;
        this.G1 = -1;
        this.C1 = -1;
        this.D1 = -1;
        this.H1 = -1;
        this.I1 = -1;
        this.J1 = -1;
        this.K1 = -1;
        this.E1 = -1;
        this.f41838p1 = -1;
        this.f41839q1 = -1;
        this.f41848z1 = -1;
        this.A1 = -1;
        this.B1 = -1;
        boolean z13 = true;
        if (!this.W1) {
            this.C1 = 0;
            this.N1 = 2;
            this.D1 = 1;
        }
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41836m1;
        if (tL_chatInviteExported.subscription_pricing != null) {
            int i7 = this.N1;
            this.f41838p1 = i7;
            this.N1 = i7 + 2;
            this.f41839q1 = i7 + 1;
        }
        int i10 = this.N1;
        this.f41840r1 = i10;
        this.N1 = i10 + 2;
        this.f41841s1 = i10 + 1;
        int i11 = tL_chatInviteExported.usage;
        if (i11 <= 0 && tL_chatInviteExported.usage_limit <= 0 && tL_chatInviteExported.requested <= 0 && tL_chatInviteExported.subscription_expired <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList arrayList = this.Y1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f41829a2;
        ArrayList arrayList3 = this.Z1;
        if (i11 <= size && tL_chatInviteExported.subscription_expired <= arrayList3.size() && (!tL_chatInviteExported.request_needed || tL_chatInviteExported.requested <= arrayList2.size())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!arrayList.isEmpty()) {
            int i12 = this.N1;
            int i13 = i12 + 1;
            this.N1 = i13;
            this.f41845w1 = i12;
            this.f41846x1 = i13;
            int size2 = arrayList.size() + i13;
            this.N1 = size2;
            this.f41847y1 = size2;
            z12 = true;
        }
        if (!arrayList3.isEmpty()) {
            int i14 = this.N1;
            int i15 = i14 + 1;
            this.N1 = i15;
            this.f41848z1 = i14;
            this.A1 = i15;
            int size3 = arrayList3.size() + i15;
            this.N1 = size3;
            this.B1 = size3;
            z12 = true;
        }
        if (!arrayList2.isEmpty()) {
            int i16 = this.N1;
            int i17 = i16 + 1;
            this.N1 = i17;
            this.I1 = i16;
            this.J1 = i17;
            int size4 = arrayList2.size() + i17;
            this.N1 = size4;
            this.K1 = size4;
        } else {
            z13 = z12;
        }
        if ((z10 || z11) && !z13) {
            int i18 = this.N1;
            this.f41842t1 = i18;
            this.E1 = i18 + 1;
            this.N1 = i18 + 3;
            this.F1 = i18 + 2;
        }
        this.O1.f();
    }

    @Override
    public final void s0() {
        int i7;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0);
            if (this.f30259s0 != null) {
                v0(w02);
            }
            if (this.G0 < 0 && (i7 = this.H0) == this.f41835h2 && w02 != i7) {
                this.H0 = w02;
                this.f41835h2 = w02;
                E0(w02);
            }
            K0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f41834g2 = false;
    }

    public final void updateColors() {
        TextView textView = this.R1;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
            textView.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29579k5, false));
            textView.setHighlightColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29597l5, false));
            if (!this.X1) {
                textView.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
            }
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.A5, false);
        k50 k50Var = this.Q1;
        k50Var.setGlowColor(x02);
        this.T1.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.V5, false));
        v0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
        int hiddenChildCount = k50Var.getHiddenChildCount();
        for (int i7 = 0; i7 < k50Var.getChildCount(); i7++) {
            O0(k50Var.getChildAt(i7));
        }
        for (int i10 = 0; i10 < hiddenChildCount; i10++) {
            O0(k50Var.V(i10));
        }
        int cachedChildCount = k50Var.getCachedChildCount();
        for (int i11 = 0; i11 < cachedChildCount; i11++) {
            O0(k50Var.P(i11));
        }
        int attachedScrapChildCount = k50Var.getAttachedScrapChildCount();
        for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
            O0(k50Var.O(i12));
        }
        this.f30226b.invalidate();
    }
}
