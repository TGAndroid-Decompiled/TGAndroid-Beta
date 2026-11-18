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
public final class x20 extends sa {
    public final int T1 = 0;
    public final LinearLayout U1;
    public z41 V1;

    public x20(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.ep epVar) {
        super(activity, null, false, false, 1, i6Var);
        O();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.wv0 e12 = e1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.wv0 e13 = e1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131232058);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29805z6, i6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(e12, c8.ma.o(60, 60));
        linearLayout2.addView(imageView, c8.ma.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(e13, c8.ma.o(60, 60));
        frameLayout.addView(linearLayout2, c8.ma.e(-2, -2, 17));
        linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.gd.M0(2131749177, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.n5.u(user);
        String u11 = org.telegram.messenger.n5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.f3.q(null, null, 2131749178, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, i6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 17, 24, 0, 24, 29));
        hi.d dVar = new hi.d(activity, i6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.gd.a0(null, null, 2131749176, u11), false, true);
        dVar.setOnClickListener(new y7(17, this, epVar));
        linearLayout.addView(dVar, c8.ma.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        hi.d dVar2 = new hi.d(activity, i6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.gd.a0(null, null, 2131749179, u10), false, true);
        dVar2.setOnClickListener(new n0(this, 25));
        linearLayout.addView(dVar2, c8.ma.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        ck0 ck0Var = this.f39534o1;
        int i10 = this.f30225u0;
        ck0Var.setPadding(i10, 0, i10, 0);
        this.V1.O(false);
    }

    public static org.telegram.ui.wv0 e1(Context context, int i7, TLObject tLObject) {
        org.telegram.ui.wv0 wv0Var = new org.telegram.ui.wv0(context);
        wv0Var.setRoundRadius(i7 / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.l(tLObject);
        wv0Var.setImageDrawable(b9Var);
        wv0Var.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        return wv0Var;
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        switch (this.T1) {
            case 0:
                z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, true, new d(this, 15), this.J0);
                this.V1 = z41Var;
                z41Var.f42809r = false;
                return z41Var;
            case 1:
                z41 z41Var2 = new z41(ck0Var, getContext(), this.f30187a, 0, true, new org.telegram.ui.a5(this, 22), this.J0);
                this.V1 = z41Var2;
                return z41Var2;
            default:
                di.f0 f0Var = new di.f0(ck0Var, getContext(), this.f30187a, 0, true, new bi.b(this, 15), this.J0, 0);
                this.V1 = f0Var;
                return f0Var;
        }
    }

    @Override
    public final CharSequence P0() {
        switch (this.T1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.gd.M0(2131754943, null);
            default:
                return org.telegram.messenger.gd.M0(2131750849, null);
        }
    }

    public x20(Context context) {
        super(context, null, false, false, null);
        this.f39541v1 = 0.1f;
        O();
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30225u0;
        ck0Var.setPadding(i7, 0, i7, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        di.ua uaVar = new di.ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, c8.ma.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.f59463b;
        fVar.f59447z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, c8.ma.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, c8.ma.c(150.0f, -1));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.U(textView, i10, this.J0);
        org.telegram.messenger.f3.k(textView, 17, null, 2131750849);
        TextView f10 = org.telegram.messenger.n10.f(linearLayout, textView, c8.ma.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(f10, i10, this.J0);
        org.telegram.messenger.f3.k(f10, 17, null, 2131750848);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        hi.d dVar = new hi.d(context, this.J0, true);
        dVar.i(org.telegram.messenger.gd.M0(2131750858, null), false, true);
        dVar.setOnClickListener(new ah.d(this, 11));
        frameLayout2.addView(dVar, c8.ma.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.f30225u0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, frameLayout2, null);
        this.f30190b.addView(frameLayout2, c8.ma.e(-1, -2, 87));
        ((di.f0) this.V1).O(false);
    }

    public x20(Context context, org.telegram.ui.ActionBar.i6 i6Var, dw dwVar) {
        super(context, null, false, false, i6Var);
        O();
        this.f39541v1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f30225u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f30225u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231601);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        imageView.setBackground(L);
        org.telegram.ui.ActionBar.u6.j(imageView, L, M, null, i6Var);
        frameLayout.addView(imageView, c8.ma.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.M0(2131745630, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.n10.f(linearLayout, textView, c8.ma.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.gd.M0(2131745631, null));
        org.telegram.ui.ActionBar.u6.U(f10, i10, i6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ma.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.ih0(this, context, 2131231861, org.telegram.messenger.gd.M0(2131745638, null), org.telegram.messenger.gd.M0(2131745639, null)), c8.ma.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.j10.i(this.f30187a).q();
        linearLayout.addView(new org.telegram.ui.ih0(this, context, 2131231808, org.telegram.messenger.gd.M0(2131745635, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(q10 ? 2131745636 : 2131745637, null), new org.telegram.ui.b80(this, q10, dwVar, 9)), true)), c8.ma.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, view, i6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.gd.M0(2131745632, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131745633, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131745634, null), new org.telegram.ui.ru0(this, 12)), true), "%1$s");
        k80 k80Var = new k80(context, null);
        k80Var.setText(K2);
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setGravity(1);
        k80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(k80Var, c8.ma.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.gd.M0(2131745629, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 24.0f);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView3, e10, M2, e11, i6Var);
        textView3.setOnClickListener(new org.telegram.ui.oy0(this, 3));
        linearLayout.addView(textView3, c8.ma.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }
}
