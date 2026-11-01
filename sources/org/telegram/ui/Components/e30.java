package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e30 extends ha {
    public final int P1 = 0;
    public final LinearLayout Q1;
    public q51 R1;

    public e30(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.zp zpVar) {
        super(activity, null, false, false, 1, p6Var);
        O();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.ix0 d12 = d1(activity, org.telegram.messenger.i0.L(60.0f), user);
        org.telegram.ui.ix0 d13 = d1(activity, org.telegram.messenger.i0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232055);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21331z6, p6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(d12, w7.b6.o(60, 60));
        linearLayout2.addView(imageView, w7.b6.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(d13, w7.b6.o(60, 60));
        frameLayout.addView(linearLayout2, w7.b6.e(-2, -2, 17));
        linearLayout.addView(frameLayout, w7.b6.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.dd.L0(2131749378, null));
        textView.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        linearLayout.addView(textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.o5.u(user);
        String u11 = org.telegram.messenger.o5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.m5.q(null, null, 2131749379, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, p6Var);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 24, 0, 24, 29));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.dd.a0(null, null, 2131749377, u11), false, true);
        dVar.setOnClickListener(new sr(7, this, zpVar));
        linearLayout.addView(dVar, w7.b6.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        vh.d dVar2 = new vh.d(activity, p6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.dd.a0(null, null, 2131749380, u10), false, true);
        dVar2.setOnClickListener(new h0(this, 22));
        linearLayout.addView(dVar2, w7.b6.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        uk0 uk0Var = this.f26724k1;
        int i11 = this.f21616t0;
        uk0Var.setPadding(i11, 0, i11, 0);
        this.R1.O(false);
    }

    public static org.telegram.ui.ix0 d1(Context context, int i10, TLObject tLObject) {
        org.telegram.ui.ix0 ix0Var = new org.telegram.ui.ix0(context);
        ix0Var.setRoundRadius(i10 / 2);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(tLObject);
        ix0Var.setImageDrawable(r8Var);
        ix0Var.setLayoutParams(new FrameLayout.LayoutParams(i10, i10));
        return ix0Var;
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        switch (this.P1) {
            case 0:
                q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new d(this, 14), this.I0);
                this.R1 = q51Var;
                q51Var.f29638r = false;
                return q51Var;
            case 1:
                q51 q51Var2 = new q51(uk0Var, getContext(), this.f21584a, 0, true, new org.telegram.ui.z4(this, 21), this.I0);
                this.R1 = q51Var2;
                return q51Var2;
            default:
                rh.t tVar = new rh.t(uk0Var, getContext(), this.f21584a, 0, true, new qh.d(this, 3), this.I0, 0);
                this.R1 = tVar;
                return tVar;
        }
    }

    @Override
    public final CharSequence O0() {
        switch (this.P1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.dd.L0(2131754943, null);
            default:
                return org.telegram.messenger.dd.L0(2131750861, null);
        }
    }

    public e30(Context context) {
        super(context, null, false, false, null);
        this.f26730r1 = 0.1f;
        O();
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        rh.o7 o7Var = new rh.o7(context, 70, 0, 0);
        frameLayout.addView(o7Var, w7.b6.c(-1.0f, -1));
        lg.q qVar = new lg.q(context, 1, 2);
        lg.h hVar = qVar.f11920b;
        hVar.f11898z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        qVar.setStarParticlesView(o7Var);
        frameLayout.addView(qVar, w7.b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        qVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.b6.c(150.0f, -1));
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(textView, i11, this.I0);
        org.telegram.messenger.m5.l(textView, 17, null, 2131750861);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView, w7.b6.t(-2, -2, 1, 0, 2, 0, 0), context);
        f7.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(f7, i11, this.I0);
        org.telegram.messenger.m5.l(f7, 17, null, 2131750860);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        vh.d dVar = new vh.d(context, this.I0, true);
        dVar.i(org.telegram.messenger.dd.L0(2131750870, null), false, true);
        dVar.setOnClickListener(new rh.s(this, 0));
        frameLayout2.addView(dVar, w7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.f21616t0;
        frameLayout2.setPadding(i12, 0, i12, 0);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, frameLayout2, null);
        this.f21587b.addView(frameLayout2, w7.b6.e(-1, -2, 87));
        ((rh.t) this.R1).O(false);
    }

    public e30(Context context, org.telegram.ui.ActionBar.p6 p6Var, hi0 hi0Var) {
        super(context, null, false, false, p6Var);
        O();
        this.f26730r1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0, org.telegram.messenger.i0.L(6.0f) + this.f21616t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231601);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(80.0f), org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.a7.k(imageView, L, N, null, p6Var);
        frameLayout.addView(imageView, w7.b6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.dd.L0(2131745842, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView, w7.b6.t(-2, -2, 1, 22, 14, 22, 0), context);
        f7.setText(org.telegram.messenger.dd.L0(2131745843, null));
        org.telegram.ui.ActionBar.a7.V(f7, i11, p6Var);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        linearLayout.addView(f7, w7.b6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.bg0(this, context, 2131231859, org.telegram.messenger.dd.L0(2131745850, null), org.telegram.messenger.dd.L0(2131745851, null)), w7.b6.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q6 = org.telegram.messenger.e20.i(this.f21584a).q();
        linearLayout.addView(new org.telegram.ui.bg0(this, context, 2131231806, org.telegram.messenger.dd.L0(2131745847, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(q6 ? 2131745848 : 2131745849, null), new org.telegram.ui.zj0(this, q6, hi0Var, 7)), true)), w7.b6.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, p6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.dd.L0(2131745844, null));
        textView2.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.V(textView2, i11, p6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder J2 = org.telegram.messenger.i0.J2(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131745845, null)), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131745846, null), new org.telegram.ui.vv0(this, 14)), true), "%1$s");
        p80 p80Var = new p80(context, null);
        p80Var.setText(J2);
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        linearLayout.addView(p80Var, w7.b6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.dd.L0(2131745841, null));
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 24.0f);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 f10 = org.telegram.ui.ActionBar.a7.f(i10);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(textView3, e, N2, f10, p6Var);
        textView3.setOnClickListener(new org.telegram.ui.zz0(this, 3));
        linearLayout.addView(textView3, w7.b6.t(-1, 48, 0, 14, 22, 14, 14));
        this.R1.O(false);
    }
}
