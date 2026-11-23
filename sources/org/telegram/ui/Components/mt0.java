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
public final class mt0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public final di.b1 f37583m1;
    public final org.telegram.ui.l4 n1;
    public final Drawable f37584o1;
    public TextView f37585p1;
    public int f37586q1;
    public boolean f37587r1;
    public final lt0 f37588s1;
    public int f37589t1;

    public mt0(Context context, lt0 lt0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.G4);
        this.f37588s1 = lt0Var;
        O();
        Drawable mutate = context.getResources().getDrawable(2131232730).mutate();
        this.f37584o1 = mutate;
        int i7 = org.telegram.ui.ActionBar.m6.f29420h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), PorterDuff.Mode.MULTIPLY));
        bi.g3 g3Var = new bi.g3(26, context, this);
        this.f30142b = g3Var;
        g3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30142b;
        int i10 = this.f30177u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        di.b1 b1Var = new di.b1(26, context, this);
        this.f37583m1 = b1Var;
        getContext();
        b1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(5, this, context);
        this.n1 = l4Var;
        b1Var.setAdapter(l4Var);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        b1Var.setEnabled(true);
        org.telegram.ui.ActionBar.t6.l(b1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
        b1Var.setOnScrollListener(new oa(this, 18));
        b1Var.setOnItemClickListener(new o(this, 13));
        this.f30142b.addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231238);
        this.f30142b.addView(view, c8.na.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        bi.v2 v2Var = new bi.v2(context, 19);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, v2Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Zi;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 15);
        textView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(textView, h02, null, g10, null);
        textView.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        textView.setText(org.telegram.messenger.hd.N0(2131752577, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        v2Var.addView(textView, c8.na.e(-2, -1, 51));
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.p6 g12 = org.telegram.ui.ActionBar.t6.g(i11, 15);
        g11.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(g11, h03, null, g12, null);
        g11.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        v2Var.addView(g11, c8.na.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.o10.p(textView2, 1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.cj, null);
        textView2.setGravity(17);
        int L = org.telegram.messenger.g0.L(11.0f);
        int i12 = org.telegram.ui.ActionBar.m6.bj;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.v0(i12));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        textView2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(textView2, d02, M, null, null);
        textView2.setMinWidth(org.telegram.messenger.g0.L(23.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
        TextView f10 = org.telegram.messenger.o10.f(g11, textView2, c8.na.t(-2, 23, 16, 0, 0, 10, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(f10, i11, null);
        f10.setGravity(17);
        f10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f10.setText(org.telegram.messenger.hd.N0(2131745444, null).toUpperCase());
        f10.setTypeface(org.telegram.messenger.g0.o());
        g11.addView(f10, c8.na.r(-2, -2, 16));
        org.telegram.ui.ActionBar.t6.h(i7, v2Var, h6Var);
        this.f30142b.addView(v2Var, c8.na.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, h6Var);
        textView.setText(org.telegram.messenger.hd.N0(2131744599, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final mt0 f36947b;

            {
                this.f36947b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mt0 mt0Var = this.f36947b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i13), 6));
                        }
                        mt0Var.dismiss();
                        return;
                    default:
                        this.f36947b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.f29528n5, h6Var);
        f10.setText(org.telegram.messenger.hd.N0(2131752029, null).toUpperCase());
        g11.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        g11.setOnClickListener(new View.OnClickListener(this) {
            public final mt0 f36947b;

            {
                this.f36947b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        mt0 mt0Var = this.f36947b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i13), 6));
                        }
                        mt0Var.dismiss();
                        return;
                    default:
                        this.f36947b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        l4Var.f();
    }

    public static void J0(mt0 mt0Var) {
        di.b1 b1Var = mt0Var.f37583m1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            mt0Var.f37586q1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            mt0Var.f30142b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && mj0Var != null && mj0Var.b() == 0) {
            i7 = top;
        }
        if (mt0Var.f37586q1 != i7) {
            mt0Var.f37586q1 = i7;
            b1Var.setTopGlowOffset(i7);
            mt0Var.f30142b.invalidate();
        }
    }

    public static org.telegram.messenger.qd K0(int i7) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = org.telegram.messenger.rd.f(i10).J;
            if (i7 >= arrayList.size()) {
                i7 -= arrayList.size();
            } else {
                return (org.telegram.messenger.qd) arrayList.get(i7);
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
        if (i7 == org.telegram.messenger.ls.G4) {
            if (org.telegram.messenger.rd.g() == 0) {
                dismiss();
            } else {
                this.n1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.G4);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, this.J0);
            Drawable drawable = this.f37584o1;
            if (drawable != null && w02 != this.f37589t1) {
                this.f37589t1 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
