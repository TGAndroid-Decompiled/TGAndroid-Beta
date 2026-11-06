package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class at0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public final bi.q1 f31895i1;
    public final org.telegram.ui.l4 f31896j1;
    public final Drawable f31897k1;
    public TextView l1;
    public int f31898m1;
    public boolean n1;
    public final zs0 f31899o1;
    public int f31900p1;

    public at0(Context context, zs0 zs0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D4);
        this.f31899o1 = zs0Var;
        N();
        Drawable mutate = context.getResources().getDrawable(2131232728).mutate();
        this.f31897k1 = mutate;
        int i7 = org.telegram.ui.ActionBar.k6.f27922h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), PorterDuff.Mode.MULTIPLY));
        bi.e5 e5Var = new bi.e5(25, context, this);
        this.f28616b = e5Var;
        e5Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28616b;
        int i10 = this.f28646t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        bi.q1 q1Var = new bi.q1(26, context, this);
        this.f31895i1 = q1Var;
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(5, this, context);
        this.f31896j1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        q1Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.m(q1Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
        q1Var.setOnScrollListener(new ui(this, 15));
        q1Var.setOnItemClickListener(new k(this, 13));
        this.f28616b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231238);
        this.f28616b.addView(view, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        di.a4 a4Var = new di.a4(context, 17);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, a4Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Wi;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(textView, h02, null, h, null);
        textView.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        a4Var.addView(textView, c8.ha.e(-2, -1, 51));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i11, 15);
        f10.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(f10, h03, null, h7, null);
        f10.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        a4Var.addView(f10, c8.ha.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.camera.q.m(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Zi, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Yi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.v0(i12));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView2, d02, N, null, null);
        textView2.setMinWidth(org.telegram.messenger.g0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, c8.ha.t(-2, 23, 16, 0, 0, 10, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f11, i11, null);
        f11.setGravity(17);
        f11.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f11.setText(org.telegram.messenger.hd.M0(2131745641, null).toUpperCase());
        f11.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(f11, c8.ha.r(-2, -2, 16));
        org.telegram.ui.ActionBar.r6.i(i7, a4Var, f6Var);
        this.f28616b.addView(a4Var, c8.ha.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, f6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131744841, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final at0 f40716b;

            {
                this.f40716b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        at0 at0Var = this.f40716b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.sd.f(i13), 6));
                        }
                        at0Var.dismiss();
                        return;
                    default:
                        this.f40716b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.f28030n5, f6Var);
        f11.setText(org.telegram.messenger.hd.M0(2131752041, null).toUpperCase());
        f10.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final at0 f40716b;

            {
                this.f40716b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        at0 at0Var = this.f40716b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.sd.f(i13), 6));
                        }
                        at0Var.dismiss();
                        return;
                    default:
                        this.f40716b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        l4Var.f();
    }

    public static void I0(at0 at0Var) {
        bi.q1 q1Var = at0Var.f31895i1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            at0Var.f31898m1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            at0Var.f28616b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && xi0Var != null && xi0Var.b() == 0) {
            i7 = top;
        }
        if (at0Var.f31898m1 != i7) {
            at0Var.f31898m1 = i7;
            q1Var.setTopGlowOffset(i7);
            at0Var.f28616b.invalidate();
        }
    }

    public static org.telegram.messenger.rd J0(int i7) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = org.telegram.messenger.sd.f(i10).I;
            if (i7 >= arrayList.size()) {
                i7 -= arrayList.size();
            } else {
                return (org.telegram.messenger.rd) arrayList.get(i7);
            }
        }
        return null;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.D4) {
            if (org.telegram.messenger.sd.g() == 0) {
                dismiss();
            } else {
                this.f31896j1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.D4);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, this.I0);
            Drawable drawable = this.f31897k1;
            if (drawable != null && w02 != this.f31900p1) {
                this.f31900p1 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
