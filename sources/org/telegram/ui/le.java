package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public final class le extends org.telegram.ui.Components.ku0 implements org.telegram.ui.ActionBar.k6 {
    public static le f39190t1;
    public static HashMap f39191u1;
    public final vh.d A0;
    public int B0;
    public final jg.z2 C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.f6 E0;
    public final org.telegram.ui.Components.f6 F0;
    public final be G0;
    public final org.telegram.ui.Components.dq[] H0;
    public final LinearLayout I0;
    public final vh.d J0;
    public final yd K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final zd O0;
    public org.telegram.ui.Components.wb P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final bi.t0 T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.u51 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final he f39192a1;
    public final boolean f39193b1;
    public final boolean f39194c1;
    public final ei.r f39195d1;
    public SpannableStringBuilder f39196e1;
    public final nd f39197f1;
    public double f39198g1;
    public double f39199h1;
    public org.telegram.ui.ActionBar.l f39200i1;
    public boolean f39201j1;
    public boolean f39202k1;
    public g61 l1;
    public final u61 m0;
    public g61 f39203m1;
    public final org.telegram.ui.ActionBar.p6 f39204n0;
    public g61 f39205n1;
    public final int f39206o0;
    public boolean f39207o1;
    public final long f39208p0;
    public final ie f39209p1;
    public TL_stories.TL_premium_boostsStatus f39210q0;
    public final ie f39211q1;
    public int f39212r0;
    public final ie f39213r1;
    public final SpannableStringBuilder f39214s0;
    public final md f39215s1;
    public final SpannableStringBuilder f39216t0;
    public final SpannableStringBuilder f39217u0;
    public final SpannableStringBuilder f39218v0;
    public final jg.z2 f39219w0;
    public final RelativeSizeSpan f39220x0;
    public final org.telegram.ui.Components.f6 f39221y0;
    public final org.telegram.ui.Components.f6 f39222z0;

    public le(Activity activity, u61 u61Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, ei.r rVar, boolean z10, boolean z11) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.dq[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.f39201j1 = false;
        this.f39202k1 = false;
        this.f39207o1 = false;
        String L0 = org.telegram.messenger.cd.L0(2131748399, null);
        ie ieVar = new ie();
        ieVar.f38245a = false;
        ieVar.f38246b = "TON";
        ieVar.h = "XTR";
        ieVar.f38247c = L0;
        this.f39209p1 = ieVar;
        String L02 = org.telegram.messenger.cd.L0(2131748398, null);
        ie ieVar2 = new ie();
        ieVar2.f38245a = false;
        ieVar2.f38246b = "TON";
        ieVar2.h = "XTR";
        ieVar2.f38247c = L02;
        this.f39211q1 = ieVar2;
        String L03 = org.telegram.messenger.cd.L0(2131748397, null);
        ie ieVar3 = new ie();
        ieVar3.f38245a = false;
        ieVar3.f38246b = "TON";
        ieVar3.h = "XTR";
        ieVar3.f38247c = L03;
        this.f39213r1 = ieVar3;
        this.f39215s1 = new md(this, 7);
        this.f39195d1 = rVar;
        this.f39193b1 = z10;
        this.f39194c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = u61Var;
        this.f39204n0 = p6Var;
        this.f39206o0 = i10;
        this.f39208p0 = j10;
        long j11 = -j10;
        TLRPC.Chat L04 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
        if (L04 != null) {
            this.f39212r0 = L04.level;
        }
        org.telegram.messenger.vp.r1(i10).G0().a(j10, new s3(this, 2));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j11);
            if (M0 != null) {
                boolean z12 = M0.restricted_sponsored;
                this.f39201j1 = z12;
                this.f39202k1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat L05 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j11));
        this.f39214s0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.a0(null, null, 2131748414, 50), -1, 3, new p1(u61Var, activity, p6Var, 12), p6Var), true);
        this.f39216t0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(org.telegram.messenger.vp.r1(i10).J5 ? 2131748420 : 2131748418, null), -1, 3, new md(this, 0), null), true);
        this.f39217u0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0((z11 && z10) ? 2131748394 : z11 ? 2131748396 : 2131748392, null), -1, 3, new nd(this, (z11 && z10) ? 2131748393 : z11 ? 2131748395 : 2131748391, 0), p6Var), true);
        this.f39218v0 = org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(L05) ? 2131748387 : 2131748386, null), new md(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new e(this, 11));
        this.T0 = new bi.t0(this, activity, 20);
        he heVar = new he(this, activity, i10, j10, u61Var.getClassGuid(), new md(this, 2), p6Var);
        this.f39192a1 = heVar;
        jg.z2 z2Var = new jg.z2(activity, 3);
        this.f39219w0 = z2Var;
        z2Var.setOrientation(1);
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.a7.i(i11, z2Var, p6Var);
        z2Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(activity, false, true, true);
        this.f39221y0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i12, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(32.0f));
        f6Var.setGravity(17);
        this.f39220x0 = new RelativeSizeSpan(0.6770833f);
        z2Var.addView(f6Var, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(activity, true, true, true);
        this.f39222z0 = f6Var2;
        f6Var2.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, p6Var);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        z2Var.addView(f6Var2, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(org.telegram.messenger.vp.r1(i10).J5);
        dVar.i(org.telegram.messenger.cd.L0(2131748366, null), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ag.t0(29, this, u61Var));
        z2Var.addView(dVar, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        jg.z2 z2Var2 = new jg.z2(activity, 4);
        this.C0 = z2Var2;
        z2Var2.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i11, z2Var2, p6Var);
        z2Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(17.0f));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(activity, false, true, true);
        this.E0 = f6Var3;
        f6Var3.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var3, i12, p6Var);
        f6Var3.setTextSize(org.telegram.messenger.i0.L(32.0f));
        f6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        z2Var2.addView(f6Var3, w7.b6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.f6 f6Var4 = new org.telegram.ui.Components.f6(activity, true, true, true);
        this.F0 = f6Var4;
        f6Var4.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var4, i13, p6Var);
        f6Var4.setTextSize(org.telegram.messenger.i0.L(14.0f));
        z2Var2.addView(f6Var4, w7.b6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        yd ydVar = new yd(this, activity, 0);
        this.K0 = ydVar;
        ydVar.setVisibility(8);
        ydVar.setText(org.telegram.messenger.cd.L0(2131752953, null));
        ydVar.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        zd zdVar = new zd(activity, 0);
        this.O0 = zdVar;
        zdVar.setFocusable(false);
        org.telegram.ui.ActionBar.a7.V(zdVar, i12, p6Var);
        zdVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        zdVar.setCursorWidth(1.5f);
        zdVar.setBackground(null);
        zdVar.setTextSize(1, 18.0f);
        zdVar.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        zdVar.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        zdVar.setInputType(2);
        zdVar.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.D(zdVar, org.telegram.ui.ActionBar.t6.f21028ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(zdVar, 36, org.telegram.ui.ActionBar.t6.f21048jg, p6Var);
        zdVar.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        zdVar.setOnFocusChangeListener(new od(this, 0));
        zdVar.addTextChangedListener(new ae(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232749);
        linearLayout.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(zdVar, w7.b6.p(-1, -2, 1.0f, 119));
        ydVar.e(zdVar);
        ydVar.addView(linearLayout, w7.b6.e(-1, -2, 48));
        z2Var2.addView(ydVar, w7.b6.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new vh.d(activity, p6Var, true);
        dVar2.setRoundRadius(24);
        this.G0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.i(org.telegram.messenger.cd.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new jg.w1(this, i10, u61Var, 4));
        vh.d dVar3 = new vh.d(activity, p6Var, true);
        dVar3.setRoundRadius(24);
        this.J0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.i(org.telegram.messenger.cd.L0(2131748389, null), false, true);
        dVar3.setOnClickListener(new qd(this, i10, j10, activity));
        linearLayout2.addView((View) dVar2, w7.b6.p(-1, 48, 1.0f, 119));
        if (org.telegram.messenger.w3.V(L05)) {
            linearLayout2.addView(new Space(activity), w7.b6.p(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.b6.p(-1, 48, 1.0f, 119));
        }
        z2Var2.addView(linearLayout2, w7.b6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zdVar.setOnEditorActionListener(new xd(0, this, u61Var));
        this.f39197f1 = new nd(this, i10, 2);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(u61Var, new z4(this, 2), new ld(this), new org.telegram.ui.Cells.m5(this));
        this.X0 = u51Var;
        br brVar = new br((Object) this, 4);
        u51Var.f30818e3 = brVar;
        u51Var.setLayoutManager(brVar);
        u51Var.setClipToPadding(false);
        u51Var.r1();
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u51Var.f30819f3.f29295r = false;
        u(u51Var, new ld(this));
        x(heVar, heVar.f37903b, new org.telegram.ui.Cells.m5(3));
        View view = heVar.d;
        y(view);
        view.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (rVar != null) {
            rVar.b(u51Var);
        }
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, frameLayout, p6Var);
        frameLayout.addView(e, w7.b6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624226, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i14 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(textView, i14, null);
        textView.setTag(Integer.valueOf(i14));
        textView.setText(org.telegram.messenger.cd.L0(2131748787, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i15 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView2, i15, null);
        textView2.setTag(Integer.valueOf(i15));
        textView2.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView2.setGravity(1);
        e.addView((View) imageView2, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        e.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        e.addView(textView2, w7.b6.r(-2, -2, 1));
        addView(frameLayout, w7.b6.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.z2 I(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231613);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, p6Var);
        f7.addView(imageView, w7.b6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        sc.e.t(textView, 1, 20.0f);
        int i20 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i20, p6Var);
        if (z10) {
            i10 = 2131753035;
        } else {
            i10 = 2131748404;
        }
        textView.setText(org.telegram.messenger.cd.L0(i10, null));
        f7.addView(textView, w7.b6.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z10) {
            i11 = 2131753044;
        } else {
            i11 = 2131748413;
        }
        String L0 = org.telegram.messenger.cd.L0(i11, null);
        if (z10) {
            i12 = 2131753043;
        } else {
            i12 = 2131748412;
        }
        f7.addView(new org.telegram.ui.Cells.a5(context, 2131232087, L0, org.telegram.messenger.cd.L0(i12, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i13 = 2131753042;
        } else {
            i13 = 2131748411;
        }
        String L02 = org.telegram.messenger.cd.L0(i13, null);
        if (z10) {
            i14 = 2131753041;
        } else {
            i14 = 2131748410;
        }
        f7.addView(new org.telegram.ui.Cells.a5(context, 2131231813, L02, org.telegram.messenger.cd.L0(i14, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        if (z10) {
            i15 = 2131753040;
        } else {
            i15 = 2131748409;
        }
        String L03 = org.telegram.messenger.cd.L0(i15, null);
        if (z10) {
            i16 = 2131753039;
        } else {
            i16 = 2131748408;
        }
        f7.addView(new org.telegram.ui.Cells.a5(context, 2131231823, L03, org.telegram.messenger.cd.L0(i16, null), p6Var), w7.b6.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d7, view, p6Var);
        f7.addView(view, w7.b6.n(1.0f / org.telegram.messenger.i0.f16025p, -1, 55, 12, 0, 12, 0));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        n5Var.setGravity(17);
        n5Var.setTextSize(1, 20.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(n5Var, i20, p6Var);
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231956, 0);
        dqVar.d = false;
        dqVar.H = 0.9f;
        dqVar.I = 0.9f;
        dqVar.b(n5Var.getPaint().getFontMetricsInt());
        dqVar.G = 0.9f;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = 2131753036;
        } else {
            i17 = 2131748405;
        }
        n5Var.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(i17, null), spannableString, "💎"));
        f7.addView(n5Var, w7.b6.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, p6Var);
        p80Var.setGravity(17);
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, i20, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        if (z10) {
            i18 = 2131753037;
        } else {
            i18 = 2131748406;
        }
        p80Var.setText(org.telegram.messenger.i0.c4(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(i18, null)), new k2.v(9, context, z10)));
        f7.addView(p80Var, w7.b6.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        vh.d i21 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i21.i(org.telegram.messenger.cd.L0(2131749540, null), false, true);
        i21.setOnClickListener(new pd(k10, 0));
        f7.addView(i21, w7.b6.t(-1, 48, 55, 10, 25, 10, 14));
        k10.N = f7;
        return k10;
    }

    public static SpannableStringBuilder K(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f39191u1 == null) {
            f39191u1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f39191u1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231956, 0);
                dqVar.d = false;
                dqVar.H = f7;
                dqVar.I = f7;
                dqVar.a(org.telegram.ui.ActionBar.t6.f21134o6);
                dqVar.b(textPaint.getFontMetricsInt());
                dqVar.G = 0.9f;
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(2131231954, 0);
                dqVar2.d = false;
                dqVar2.H = f7;
                dqVar2.I = f7;
                dqVar2.f25509s = f10;
                dqVar2.G = 0.95f;
                spannableString.setSpan(dqVar2, 0, spannableString.length(), 33);
            }
            f39191u1.put(Integer.valueOf(i12), spannableString);
        }
        return org.telegram.messenger.i0.L2(charSequence, spannableString, "TON");
    }

    public static void M(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        long j11;
        String L0;
        long j12;
        long j13;
        long j14;
        char c10;
        boolean z10;
        boolean z11;
        int i11;
        String str;
        String p5;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            L0 = org.telegram.messenger.cd.L0(2131748376, null);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            j13 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z13 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z10 = z13;
            j14 = 0;
            c10 = 65535;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                L0 = org.telegram.messenger.cd.L0(2131748378, null);
                j12 = tL_broadcastRevenueTransactionProceeds.from_date;
                j14 = tL_broadcastRevenueTransactionProceeds.to_date;
                j13 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                L0 = org.telegram.messenger.cd.L0(2131748377, null);
                j12 = tL_broadcastRevenueTransactionRefund.from_date;
                j13 = tL_broadcastRevenueTransactionRefund.amount;
                j14 = 0;
            } else {
                return;
            }
            c10 = 1;
            z10 = false;
            z11 = false;
        }
        long j15 = j13;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.z20.n(textView, 1, 18.0f);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.t6.f21170q7;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.f21078l8;
        }
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c10 < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j16 = j12;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j15) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f7.addView(textView, w7.b6.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
        if (z10) {
            textView2.setText(org.telegram.messenger.cd.L0(2131748373, null));
        } else if (j16 == j11) {
            textView2.setText(org.telegram.messenger.cd.Q(j14));
        } else if (j14 == j11) {
            textView2.setText(org.telegram.messenger.cd.Q(j16));
        } else {
            textView2.setText(org.telegram.messenger.cd.Q(j16) + " - " + org.telegram.messenger.cd.Q(j14));
        }
        if (z11) {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, p6Var);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", org.telegram.messenger.cd.L0(2131748374, null)));
        }
        f7.addView(textView2, w7.b6.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.z20.n(textView3, 1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.G6, p6Var);
        textView3.setText(L0);
        f7.addView(textView3, w7.b6.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(28.0f);
            int i12 = org.telegram.ui.ActionBar.t6.Qi;
            ShapeDrawable e02 = org.telegram.ui.ActionBar.t6.e0(L, L2, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            frameLayout.setBackground(e02);
            org.telegram.ui.ActionBar.a7.k(frameLayout, e02, N, null, p6Var);
            if (j10 < j11) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
                if (L02 == null) {
                    p5 = "";
                    chat = L02;
                } else {
                    p5 = L02.title;
                    chat = L02;
                }
            } else {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10));
                p5 = org.telegram.messenger.h20.p(Z1);
                chat = Z1;
            }
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.l(chat);
            g9Var.e(chat, r8Var);
            frameLayout.addView(g9Var, w7.b6.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21037j5, p6Var);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(p5);
            frameLayout.addView(textView4, w7.b6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.b6.t(-2, 28, 1, 42, 10, 42, 0));
        }
        vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i13.i(org.telegram.messenger.cd.L0(2131748375, null), false, true);
                i13.setOnClickListener(new ud(0, context, tL_broadcastRevenueTransactionWithdrawal2));
                f7.addView(i13, w7.b6.t(-1, 48, 55, 18, 30, 18, 14));
                k10.N = f7;
                k10.show();
            }
        }
        i13.i(org.telegram.messenger.cd.L0(2131747847, null), false, true);
        i13.setOnClickListener(new pd(k10, 1));
        f7.addView(i13, w7.b6.t(-1, 48, 55, 18, 30, 18, 14));
        k10.N = f7;
        k10.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        cg.b bVar;
        ArrayList arrayList;
        if (this.f39205n1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39199h1 = tL_payments_starsRevenueStats.usd_rate;
        g61 h02 = u61.h0(tL_payments_starsRevenueStats.revenue_graph, org.telegram.messenger.cd.L0(2131748415, null), 2, false);
        this.f39205n1 = h02;
        if (h02 != null && (bVar = h02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f39205n1.d.d.get(0) != null) {
            ((cg.a) this.f39205n1.d.d.get(0)).f4162g = org.telegram.ui.ActionBar.t6.Yj;
            this.f39205n1.d.h = (float) ((1.0d / this.f39199h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f39193b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new md(this, 6)).start();
        }
        org.telegram.ui.Components.u51 u51Var = this.X0;
        if (u51Var != null) {
            u51Var.f30819f3.O(!z10);
            if (z10) {
                u51Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f39193b1 && this.f39207o1 && org.telegram.messenger.vp.d1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.f39204n0, false));
            org.telegram.messenger.vp.d1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        u61 u61Var = this.m0;
        if (u61Var != null) {
            Activity parentActivity = u61Var.getParentActivity();
            int i10 = this.f39206o0;
            TLRPC.User f7 = org.telegram.messenger.d20.i(i10).f();
            if (parentActivity != null && f7 != null) {
                long j10 = this.f39208p0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new org.telegram.messenger.s6(this, twoStepVerificationActivity, parentActivity, z10, 1));
            }
        }
    }

    public final boolean G(float f7, float f10) {
        if (this.Y0.getVisibility() != 0 && c() && f7 >= 0.0f && f7 < getWidth() && f10 >= getTabsTop() && f10 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void H(boolean z10) {
        if (!this.f39194c1) {
            return;
        }
        int i10 = this.f39206o0;
        rh.r g10 = rh.r.g(i10);
        long j10 = this.f39208p0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
        if (h != null) {
            org.telegram.messenger.i0.g3(new h0(22, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.t6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 2));
    }

    public final void J() {
        he heVar = this.f39192a1;
        md mdVar = heVar.f37905f;
        boolean[] zArr = heVar.f37909w;
        boolean a2 = heVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    heVar.f37906n.clear();
                    heVar.h = "";
                } else {
                    heVar.f37907r.clear();
                    heVar.f37908s = "";
                }
                zArr[i10] = false;
                heVar.c(i10);
            } else {
                return;
            }
        }
        if (heVar.a() != a2 && mdVar != null) {
            heVar.e();
            mdVar.run();
        }
    }

    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ie ieVar;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.p51 p51Var;
        long j10;
        ie ieVar2;
        int i14;
        int i15;
        le leVar = this;
        ie ieVar3 = leVar.f39213r1;
        ie ieVar4 = leVar.f39211q1;
        org.telegram.ui.Components.f6 f6Var = leVar.f39222z0;
        RelativeSizeSpan relativeSizeSpan = leVar.f39220x0;
        org.telegram.ui.Components.f6 f6Var2 = leVar.f39221y0;
        ie ieVar5 = leVar.f39209p1;
        if (z10) {
            ieVar5.f38245a = true;
            long j11 = tL_starsRevenueStatus.available_balance.amount;
            ieVar5.d = j11;
            double d = j11 / 1.0E9d;
            ieVar5.e = (long) (leVar.f39198g1 * d * 100.0d);
            if (leVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                ieVar2 = ieVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                leVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i14 = 6;
                leVar.Z0.setMaximumFractionDigits(6);
                leVar.Z0.setGroupingUsed(false);
            } else {
                ieVar2 = ieVar3;
                i14 = 6;
            }
            DecimalFormat decimalFormat2 = leVar.Z0;
            if (d > 1.5d) {
                i14 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i14);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + leVar.Z0.format(d), f6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            f6Var2.setText(spannableStringBuilder);
            f6Var.setText("≈" + org.telegram.messenger.u1.i().f(j10, "USD"));
            ieVar5.f38248f = "USD";
            ieVar4.f38245a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            ieVar4.d = j12;
            leVar = this;
            double d10 = leVar.f39198g1;
            ieVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            ieVar4.f38248f = "USD";
            ie ieVar6 = ieVar2;
            ieVar6.f38245a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            ieVar6.d = j13;
            ieVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            ieVar6.f38248f = "USD";
            leVar.f39207o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            leVar.A0.setVisibility(i15);
        } else {
            double d11 = leVar.f39199h1;
            if (d11 != 0.0d) {
                ieVar5.f38249g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                ieVar5.f38250i = starsAmount3;
                ieVar5.f38251j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i16 = tL_starsRevenueStatus.next_withdrawal_at;
                be beVar = leVar.G0;
                if (f6Var2 == null || f6Var == null) {
                    ieVar = ieVar3;
                    i10 = 0;
                } else {
                    ieVar = ieVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(rh.h8.Z0(false, TextUtils.concat("XTR ", rh.h8.L0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    leVar.D0 = starsAmount3;
                    leVar.E0.setText(spannableStringBuilder2);
                    leVar.F0.setText("≈" + org.telegram.messenger.u1.i().f((long) (leVar.f39199h1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    leVar.K0.setVisibility(i13);
                    if (leVar.M0) {
                        leVar.L0 = true;
                        long j14 = starsAmount3.amount;
                        leVar.N0 = j14;
                        String l4 = Long.toString(j14);
                        zd zdVar = leVar.O0;
                        zdVar.setText(l4);
                        zdVar.setSelection(zdVar.getText().length());
                        i10 = 0;
                        leVar.L0 = false;
                        if (leVar.N0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        beVar.setEnabled(z12);
                    } else {
                        i10 = 0;
                    }
                    vh.d dVar = leVar.J0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i10;
                        }
                        dVar.setEnabled(z11);
                    }
                    leVar.B0 = i16;
                    nd ndVar = leVar.f39197f1;
                    org.telegram.messenger.i0.r(ndVar);
                    ndVar.run();
                }
                ieVar5.f38248f = "USD";
                ieVar4.f38249g = true;
                ieVar4.f38250i = tL_starsRevenueStatus.current_balance;
                double d12 = leVar.f39199h1;
                ieVar4.f38251j = (long) (starsAmount.amount * d12 * 100.0d);
                ieVar4.f38248f = "USD";
                ie ieVar7 = ieVar;
                ieVar7.f38249g = true;
                ieVar7.f38250i = tL_starsRevenueStatus.overall_revenue;
                ieVar7.f38251j = (long) (starsAmount2.amount * d12 * 100.0d);
                ieVar7.f38248f = "USD";
                leVar.f39207o1 = true;
                LinearLayout linearLayout = leVar.I0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i12 = i10;
                    } else {
                        i12 = 8;
                    }
                    linearLayout.setVisibility(i12);
                }
                if (beVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z13 = org.telegram.messenger.v2.f18448a;
                        i11 = 8;
                    } else {
                        i11 = i10;
                    }
                    beVar.setVisibility(i11);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.u51 u51Var = leVar.X0;
        if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.f39192a1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f39190t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f39190t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.l lVar = this.f39200i1;
        if (lVar != null) {
            lVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f39200i1 = lVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            zd zdVar = this.O0;
            if (zdVar != null) {
                zdVar.setHandlesColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21048jg, this.f39204n0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
