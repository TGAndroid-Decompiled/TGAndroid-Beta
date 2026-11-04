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
public final class i20 extends ma {
    public final int Q1 = 0;
    public final LinearLayout R1;
    public f41 S1;

    public i20(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.zo zoVar) {
        super(activity, null, false, false, 1, e6Var);
        N();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.nv0 d12 = d1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.nv0 d13 = d1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232056);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28290z6, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(d12, b8.mf.o(60, 60));
        linearLayout2.addView(imageView, b8.mf.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(d13, b8.mf.o(60, 60));
        frameLayout.addView(linearLayout2, b8.mf.e(-2, -2, 17));
        linearLayout.addView(frameLayout, b8.mf.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.bd.M0(2131749377, null));
        textView.setTextSize(1, 20.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.m5.u(user);
        String u11 = org.telegram.messenger.m5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131749378, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, e6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 17, 24, 0, 24, 29));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.bd.a0(null, null, 2131749376, u11), false, true);
        dVar.setOnClickListener(new q2(20, this, zoVar));
        linearLayout.addView(dVar, b8.mf.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.bd.a0(null, null, 2131749379, u10), false, true);
        dVar2.setOnClickListener(new f0(this, 23));
        linearLayout.addView(dVar2, b8.mf.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        tj0 tj0Var = this.f36102l1;
        int i10 = this.f28618u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        this.S1.O(false);
    }

    public static org.telegram.ui.nv0 d1(Context context, int i3, TLObject tLObject) {
        org.telegram.ui.nv0 nv0Var = new org.telegram.ui.nv0(context);
        nv0Var.setRoundRadius(i3 / 2);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        nv0Var.setImageDrawable(u8Var);
        nv0Var.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
        return nv0Var;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        switch (this.Q1) {
            case 0:
                f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new e(this, 14), this.J0);
                this.S1 = f41Var;
                f41Var.f33698r = false;
                return f41Var;
            case 1:
                f41 f41Var2 = new f41(tj0Var, getContext(), this.f28583a, 0, true, new org.telegram.ui.c5(this, 21), this.J0);
                this.S1 = f41Var2;
                return f41Var2;
            default:
                ci.j0 j0Var = new ci.j0(tj0Var, getContext(), this.f28583a, 0, true, new ai.c(this, 13), this.J0, 0);
                this.S1 = j0Var;
                return j0Var;
        }
    }

    @Override
    public final CharSequence O0() {
        switch (this.Q1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.bd.M0(2131754943, null);
            default:
                return org.telegram.messenger.bd.M0(2131750861, null);
        }
    }

    public i20(Context context) {
        super(context, null, false, false, null);
        this.f36108s1 = 0.1f;
        N();
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ci.bb bbVar = new ci.bb(context, 70, 0, 0);
        frameLayout.addView(bbVar, b8.mf.c(-1.0f, -1));
        wg.m mVar = new wg.m(context, 1, 2);
        wg.f fVar = mVar.f57666b;
        fVar.f57650z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(bbVar);
        frameLayout.addView(mVar, b8.mf.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, b8.mf.c(150.0f, -1));
        TextView textView = new TextView(context);
        k2.p1.t(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, this.J0);
        org.telegram.messenger.k5.m(textView, 17, null, 2131750861);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f10, i10, this.J0);
        org.telegram.messenger.k5.m(f10, 17, null, 2131750860);
        linearLayout.addView(f10, b8.mf.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        gi.d dVar = new gi.d(context, this.J0, true);
        dVar.i(org.telegram.messenger.bd.M0(2131750870, null), false, true);
        dVar.setOnClickListener(new ai.b(this, 6));
        frameLayout2.addView(dVar, b8.mf.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.f28618u0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout2, null);
        this.f28586b.addView(frameLayout2, b8.mf.e(-1, -2, 87));
        ((ci.j0) this.S1).O(false);
    }

    public i20(Context context, org.telegram.ui.ActionBar.e6 e6Var, j50 j50Var) {
        super(context, null, false, false, e6Var);
        N();
        this.f36108s1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231600);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(imageView, L, N, null, e6Var);
        frameLayout.addView(imageView, b8.mf.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131745835, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.bd.M0(2131745836, null));
        org.telegram.ui.ActionBar.r6.V(f10, i10, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, b8.mf.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.yg0(this, context, 2131231860, org.telegram.messenger.bd.M0(2131745843, null), org.telegram.messenger.bd.M0(2131745844, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.h10.i(this.f28583a).q();
        linearLayout.addView(new org.telegram.ui.yg0(this, context, 2131231807, org.telegram.messenger.bd.M0(2131745840, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(q10 ? 2131745841 : 2131745842, null), new org.telegram.ui.a60(this, q10, j50Var, 10)), true)), b8.mf.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, e6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.bd.M0(2131745837, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131745838, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131745839, null), new org.telegram.ui.pu0(this, 11)), true), "%1$s");
        s70 s70Var = new s70(context, null);
        s70Var.setText(K2);
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(1);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(s70Var, b8.mf.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.bd.M0(2131745834, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), 24.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i3);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N2, f11, e6Var);
        textView3.setOnClickListener(new org.telegram.ui.cy0(this, 3));
        linearLayout.addView(textView3, b8.mf.t(-1, 48, 0, 14, 22, 14, 14));
        this.S1.O(false);
    }
}
