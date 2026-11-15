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
public final class p20 extends ja {
    public final int T1 = 0;
    public final LinearLayout U1;
    public p41 V1;

    public p20(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.cp cpVar) {
        super(activity, null, false, false, 1, e6Var);
        O();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.vv0 d12 = d1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.vv0 d13 = d1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232057);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29260z6, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(d12, c8.ja.o(60, 60));
        linearLayout2.addView(imageView, c8.ja.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(d13, c8.ja.o(60, 60));
        frameLayout.addView(linearLayout2, c8.ja.e(-2, -2, 17));
        linearLayout.addView(frameLayout, c8.ja.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.M0(2131749369, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.m5.u(user);
        String u11 = org.telegram.messenger.m5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.k5.q(null, null, 2131749370, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, e6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 24, 0, 24, 29));
        hi.d dVar = new hi.d(activity, e6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.hd.a0(null, null, 2131749368, u11), false, true);
        dVar.setOnClickListener(new n2(21, this, cpVar));
        linearLayout.addView(dVar, c8.ja.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        hi.d dVar2 = new hi.d(activity, e6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.hd.a0(null, null, 2131749371, u10), false, true);
        dVar2.setOnClickListener(new e0(this, 24));
        linearLayout.addView(dVar2, c8.ja.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        uj0 uj0Var = this.f35936o1;
        int i10 = this.f29717u0;
        uj0Var.setPadding(i10, 0, i10, 0);
        this.V1.O(false);
    }

    public static org.telegram.ui.vv0 d1(Context context, int i7, TLObject tLObject) {
        org.telegram.ui.vv0 vv0Var = new org.telegram.ui.vv0(context);
        vv0Var.setRoundRadius(i7 / 2);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.l(tLObject);
        vv0Var.setImageDrawable(t8Var);
        vv0Var.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        return vv0Var;
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        switch (this.T1) {
            case 0:
                p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new d(this, 14), this.J0);
                this.V1 = p41Var;
                p41Var.f38201r = false;
                return p41Var;
            case 1:
                p41 p41Var2 = new p41(uj0Var, getContext(), this.f29679a, 0, true, new org.telegram.ui.a5(this, 22), this.J0);
                this.V1 = p41Var2;
                return p41Var2;
            default:
                di.f0 f0Var = new di.f0(uj0Var, getContext(), this.f29679a, 0, true, new bi.b(this, 14), this.J0, 0);
                this.V1 = f0Var;
                return f0Var;
        }
    }

    @Override
    public final CharSequence O0() {
        switch (this.T1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.hd.M0(2131754943, null);
            default:
                return org.telegram.messenger.hd.M0(2131750860, null);
        }
    }

    public p20(Context context) {
        super(context, null, false, false, null);
        this.f35943v1 = 0.1f;
        O();
        uj0 uj0Var = this.f35936o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        di.ra raVar = new di.ra(context, 70, 0, 0);
        frameLayout.addView(raVar, c8.ja.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f58893b;
        fVar.f58877z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        mVar.setStarParticlesView(raVar);
        frameLayout.addView(mVar, c8.ja.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, c8.ja.c(150.0f, -1));
        TextView textView = new TextView(context);
        i5.c.v(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i10, this.J0);
        org.telegram.messenger.k5.l(textView, 17, null, 2131750860);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(f10, i10, this.J0);
        org.telegram.messenger.k5.l(f10, 17, null, 2131750859);
        linearLayout.addView(f10, c8.ja.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        hi.d dVar = new hi.d(context, this.J0, true);
        dVar.i(org.telegram.messenger.hd.M0(2131750869, null), false, true);
        dVar.setOnClickListener(new ah.d(this, 10));
        frameLayout2.addView(dVar, c8.ja.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.f29717u0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, frameLayout2, null);
        this.f29682b.addView(frameLayout2, c8.ja.e(-1, -2, 87));
        ((di.f0) this.V1).O(false);
    }

    public p20(Context context, org.telegram.ui.ActionBar.e6 e6Var, hh0 hh0Var) {
        super(context, null, false, false, e6Var);
        O();
        this.f35943v1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f29717u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f29717u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.q6.j(imageView, L, M, null, e6Var);
        frameLayout.addView(imageView, c8.ja.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131745825, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.hd.M0(2131745826, null));
        org.telegram.ui.ActionBar.q6.U(f10, i10, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ja.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.eh0(this, context, 2131231860, org.telegram.messenger.hd.M0(2131745833, null), org.telegram.messenger.hd.M0(2131745834, null)), c8.ja.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.m10.i(this.f29679a).q();
        linearLayout.addView(new org.telegram.ui.eh0(this, context, 2131231807, org.telegram.messenger.hd.M0(2131745830, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(q10 ? 2131745831 : 2131745832, null), new org.telegram.ui.f60(this, q10, hh0Var, 10)), true)), c8.ja.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, e6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.M0(2131745827, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745828, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131745829, null), new org.telegram.ui.pu0(this, 12)), true), "%1$s");
        z70 z70Var = new z70(context, null);
        z70Var.setText(K2);
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(1);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(z70Var, c8.ja.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.hd.M0(2131745824, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), 24.0f);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i7);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(textView3, e10, M2, e11, e6Var);
        textView3.setOnClickListener(new org.telegram.ui.ky0(this, 3));
        linearLayout.addView(textView3, c8.ja.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }
}
