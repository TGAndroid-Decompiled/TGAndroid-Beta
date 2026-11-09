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
public final class ct0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public final bi.q1 f32753i1;
    public final org.telegram.ui.l4 f32754j1;
    public final Drawable f32755k1;
    public TextView l1;
    public int f32756m1;
    public boolean n1;
    public final bt0 f32757o1;
    public int f32758p1;

    public ct0(Context context, bt0 bt0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.D4);
        this.f32757o1 = bt0Var;
        N();
        Drawable mutate = context.getResources().getDrawable(2131232728).mutate();
        this.f32755k1 = mutate;
        int i7 = org.telegram.ui.ActionBar.l6.f27938h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, this.I0), PorterDuff.Mode.MULTIPLY));
        bi.e5 e5Var = new bi.e5(25, context, this);
        this.f28624b = e5Var;
        e5Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28624b;
        int i10 = this.f28654t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        bi.q1 q1Var = new bi.q1(26, context, this);
        this.f32753i1 = q1Var;
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(5, this, context);
        this.f32754j1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        q1Var.setEnabled(true);
        org.telegram.ui.ActionBar.s6.l(q1Var, 21, org.telegram.ui.ActionBar.l6.A5, g6Var);
        q1Var.setOnScrollListener(new ui(this, 15));
        q1Var.setOnItemClickListener(new k(this, 13));
        this.f28624b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231238);
        this.f28624b.addView(view, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        di.b4 b4Var = new di.b4(context, 17);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, b4Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.l6.Wi;
        org.telegram.ui.ActionBar.s6.U(textView, i11, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i11, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(textView, h02, null, g10, null);
        textView.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.id.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        b4Var.addView(textView, c8.ha.e(-2, -1, 51));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.o6 g11 = org.telegram.ui.ActionBar.s6.g(i11, 15);
        f10.setBackground(h03);
        org.telegram.ui.ActionBar.s6.j(f10, h03, null, g11, null);
        f10.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        b4Var.addView(f10, c8.ha.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.camera.q.m(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.Zi, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i12 = org.telegram.ui.ActionBar.l6.Yi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.v0(i12));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i12);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(textView2, d02, M, null, null);
        textView2.setMinWidth(org.telegram.messenger.g0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, c8.ha.t(-2, 23, 16, 0, 0, 10, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(f11, i11, null);
        f11.setGravity(17);
        f11.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f11.setText(org.telegram.messenger.id.M0(2131745640, null).toUpperCase());
        f11.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(f11, c8.ha.r(-2, -2, 16));
        org.telegram.ui.ActionBar.s6.h(i7, b4Var, g6Var);
        this.f28624b.addView(b4Var, c8.ha.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, g6Var);
        textView.setText(org.telegram.messenger.id.M0(2131744840, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ct0 f31968b;

            {
                this.f31968b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ct0 ct0Var = this.f31968b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.jd(org.telegram.messenger.sd.f(i13), 6));
                        }
                        ct0Var.dismiss();
                        return;
                    default:
                        this.f31968b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.s6.U(f11, org.telegram.ui.ActionBar.l6.f28046n5, g6Var);
        f11.setText(org.telegram.messenger.id.M0(2131752041, null).toUpperCase());
        f10.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final ct0 f31968b;

            {
                this.f31968b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ct0 ct0Var = this.f31968b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.jd(org.telegram.messenger.sd.f(i13), 6));
                        }
                        ct0Var.dismiss();
                        return;
                    default:
                        this.f31968b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        l4Var.f();
    }

    public static void I0(ct0 ct0Var) {
        bi.q1 q1Var = ct0Var.f32753i1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            ct0Var.f32756m1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            ct0Var.f28624b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        yi0 yi0Var = (yi0) q1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && yi0Var != null && yi0Var.b() == 0) {
            i7 = top;
        }
        if (ct0Var.f32756m1 != i7) {
            ct0Var.f32756m1 = i7;
            q1Var.setTopGlowOffset(i7);
            ct0Var.f28624b.invalidate();
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
                this.f32754j1.f();
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
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, this.I0);
            Drawable drawable = this.f32755k1;
            if (drawable != null && w02 != this.f32758p1) {
                this.f32758p1 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
