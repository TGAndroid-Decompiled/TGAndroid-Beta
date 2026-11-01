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
public final class eu0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs {
    public final ag.b1 f25928i1;
    public final fg.j f25929j1;
    public final Drawable f25930k1;
    public TextView l1;
    public int f25931m1;
    public boolean f25932n1;
    public final du0 f25933o1;
    public int f25934p1;

    public eu0(Context context, du0 du0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.D4);
        this.f25933o1 = du0Var;
        O();
        Drawable mutate = context.getResources().getDrawable(2131232725).mutate();
        this.f25930k1 = mutate;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), PorterDuff.Mode.MULTIPLY));
        jg.l0 l0Var = new jg.l0(this, context, 24);
        this.f21587b = l0Var;
        l0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f21587b;
        int i11 = this.f21616t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        ag.b1 b1Var = new ag.b1(this, context, 21);
        this.f25928i1 = b1Var;
        getContext();
        b1Var.setLayoutManager(new s4.a0(1, false));
        fg.j jVar = new fg.j(6, this, context);
        this.f25929j1 = jVar;
        b1Var.setAdapter(jVar);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        b1Var.setEnabled(true);
        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
        b1Var.setOnScrollListener(new cu0(this, 0));
        b1Var.setOnItemClickListener(new k(this, 13));
        this.f21587b.addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231239);
        this.f21587b.addView(view, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 21);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, a5Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Wi;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.v0(i12) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(textView, h02, null, h, null);
        textView.setPadding(org.telegram.messenger.i0.L(33.0f), 0, org.telegram.messenger.i0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.dd.L0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.i0.o());
        a5Var.addView(textView, w7.b6.e(-2, -1, 51));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.v0(i12) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i12, 15);
        f7.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(f7, h03, null, h10, null);
        f7.setPadding(org.telegram.messenger.i0.L(33.0f), 0, org.telegram.messenger.i0.L(33.0f), 0);
        a5Var.addView(f7, w7.b6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.a30.n(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Zi, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.i0.L(11.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Yi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.v0(i13));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView2, d02, N, null, null);
        textView2.setMinWidth(org.telegram.messenger.i0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
        TextView f10 = org.telegram.messenger.a30.f(f7, textView2, w7.b6.t(-2, 23, 16, 0, 0, 10, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(f10, i12, null);
        f10.setGravity(17);
        f10.setCompoundDrawablePadding(org.telegram.messenger.i0.L(8.0f));
        f10.setText(org.telegram.messenger.dd.L0(2131745657, null).toUpperCase());
        f10.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(f10, w7.b6.r(-2, -2, 16));
        org.telegram.ui.ActionBar.a7.i(i10, a5Var, p6Var);
        this.f21587b.addView(a5Var, w7.b6.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, p6Var);
        textView.setText(org.telegram.messenger.dd.L0(2131744858, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final eu0 f24924b;

            {
                this.f24924b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        eu0 eu0Var = this.f24924b;
                        for (int i14 = 0; i14 < 4; i14++) {
                            Utilities.d.c(new org.telegram.messenger.fd(org.telegram.messenger.od.f(i14), 6));
                        }
                        eu0Var.dismiss();
                        return;
                    default:
                        this.f24924b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.f21115n5, p6Var);
        f10.setText(org.telegram.messenger.dd.L0(2131752041, null).toUpperCase());
        f7.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final eu0 f24924b;

            {
                this.f24924b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        eu0 eu0Var = this.f24924b;
                        for (int i14 = 0; i14 < 4; i14++) {
                            Utilities.d.c(new org.telegram.messenger.fd(org.telegram.messenger.od.f(i14), 6));
                        }
                        eu0Var.dismiss();
                        return;
                    default:
                        this.f24924b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        jVar.f();
    }

    public static void I0(eu0 eu0Var) {
        ag.b1 b1Var = eu0Var.f25928i1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            eu0Var.f25931m1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            eu0Var.f21587b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b1Var.getChildAt(0);
        dk0 dk0Var = (dk0) b1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
        if (top > 0 && dk0Var != null && dk0Var.b() == 0) {
            i10 = top;
        }
        if (eu0Var.f25931m1 != i10) {
            eu0Var.f25931m1 = i10;
            b1Var.setTopGlowOffset(i10);
            eu0Var.f21587b.invalidate();
        }
    }

    public static org.telegram.messenger.nd J0(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList arrayList = org.telegram.messenger.od.f(i11).I;
            if (i10 >= arrayList.size()) {
                i10 -= arrayList.size();
            } else {
                return (org.telegram.messenger.nd) arrayList.get(i10);
            }
        }
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.D4) {
            if (org.telegram.messenger.od.g() == 0) {
                dismiss();
            } else {
                this.f25929j1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.D4);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0);
            Drawable drawable = this.f25930k1;
            if (drawable != null && w02 != this.f25934p1) {
                this.f25934p1 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
