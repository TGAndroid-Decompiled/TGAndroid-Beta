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
public final class n20 extends na {
    public final int P1 = 0;
    public final LinearLayout Q1;
    public m41 R1;

    public n20(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.dp dpVar) {
        super(activity, null, false, false, 1, g6Var);
        N();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.yv0 d12 = d1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.yv0 d13 = d1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232056);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28275z6, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(d12, c8.ha.o(60, 60));
        linearLayout2.addView(imageView, c8.ha.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(d13, c8.ha.o(60, 60));
        frameLayout.addView(linearLayout2, c8.ha.e(-2, -2, 17));
        linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.id.M0(2131749369, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(textView, i7, g6Var);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.m5.u(user);
        String u11 = org.telegram.messenger.m5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131749370, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView2, i7, g6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 24, 0, 24, 29));
        fi.d dVar = new fi.d(activity, g6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.id.a0(null, null, 2131749368, u11), false, true);
        dVar.setOnClickListener(new lk(14, this, dpVar));
        linearLayout.addView(dVar, c8.ha.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        fi.d dVar2 = new fi.d(activity, g6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.id.a0(null, null, 2131749371, u10), false, true);
        dVar2.setOnClickListener(new h0(this, 23));
        linearLayout.addView(dVar2, c8.ha.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        qj0 qj0Var = this.f36303k1;
        int i10 = this.f28654t0;
        qj0Var.setPadding(i10, 0, i10, 0);
        this.R1.O(false);
    }

    public static org.telegram.ui.yv0 d1(Context context, int i7, TLObject tLObject) {
        org.telegram.ui.yv0 yv0Var = new org.telegram.ui.yv0(context);
        yv0Var.setRoundRadius(i7 / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
        w8Var.l(tLObject);
        yv0Var.setImageDrawable(w8Var);
        yv0Var.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        return yv0Var;
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        switch (this.P1) {
            case 0:
                m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new d(this, 14), this.I0);
                this.R1 = m41Var;
                m41Var.f35945r = false;
                return m41Var;
            case 1:
                m41 m41Var2 = new m41(qj0Var, getContext(), this.f28621a, 0, true, new org.telegram.ui.a5(this, 22), this.I0);
                this.R1 = m41Var2;
                return m41Var2;
            default:
                bi.o0 o0Var = new bi.o0(qj0Var, getContext(), this.f28621a, 0, true, new ai.e(this, 3), this.I0, 0);
                this.R1 = o0Var;
                return o0Var;
        }
    }

    @Override
    public final CharSequence O0() {
        switch (this.P1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.id.M0(2131754943, null);
            default:
                return org.telegram.messenger.id.M0(2131750860, null);
        }
    }

    public n20(Context context) {
        super(context, null, false, false, null);
        this.f36308r1 = 0.1f;
        N();
        qj0 qj0Var = this.f36303k1;
        int i7 = this.f28654t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        bi.gc gcVar = new bi.gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f57424b;
        fVar.f57408z = org.telegram.ui.ActionBar.l6.Tk;
        fVar.A = org.telegram.ui.ActionBar.l6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, c8.ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, c8.ha.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.U(textView, i10, this.I0);
        org.telegram.messenger.k5.m(textView, 17, null, 2131750860);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(f10, i10, this.I0);
        org.telegram.messenger.k5.m(f10, 17, null, 2131750859);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        fi.d dVar = new fi.d(context, this.I0, true);
        dVar.i(org.telegram.messenger.id.M0(2131750869, null), false, true);
        dVar.setOnClickListener(new ah.d(this, 3));
        frameLayout2.addView(dVar, c8.ha.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.f28654t0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, frameLayout2, null);
        this.f28624b.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        ((bi.o0) this.R1).O(false);
    }

    public n20(Context context, org.telegram.ui.ActionBar.g6 g6Var, w80 w80Var) {
        super(context, null, false, false, g6Var);
        N();
        this.f36308r1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28654t0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28654t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.s6.j(imageView, L, M, null, g6Var);
        frameLayout.addView(imageView, c8.ha.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131745825, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.id.M0(2131745826, null));
        org.telegram.ui.ActionBar.s6.U(f10, i10, g6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.uq0(this, context, 2131231860, org.telegram.messenger.id.M0(2131745833, null), org.telegram.messenger.id.M0(2131745834, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.p10.i(this.f28621a).q();
        linearLayout.addView(new org.telegram.ui.uq0(this, context, 2131231807, org.telegram.messenger.id.M0(2131745830, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(q10 ? 2131745831 : 2131745832, null), new org.telegram.ui.i60(this, q10, w80Var, 10)), true)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, g6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.id.M0(2131745827, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.s6.U(textView2, i10, g6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745828, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745829, null), new org.telegram.ui.tu0(this, 12)), true), "%1$s");
        x70 x70Var = new x70(context, null);
        x70Var.setText(K2);
        org.telegram.ui.ActionBar.s6.U(x70Var, i10, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setGravity(1);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(x70Var, c8.ha.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.Gi, g6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.id.M0(2131745824, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), 24.0f);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i7);
        org.telegram.ui.ActionBar.o6 e11 = org.telegram.ui.ActionBar.s6.e(i7);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.s6.j(textView3, e10, M2, e11, g6Var);
        textView3.setOnClickListener(new org.telegram.ui.py0(this, 3));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 0, 14, 22, 14, 14));
        this.R1.O(false);
    }
}
