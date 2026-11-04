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
public final class zs0 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public final ci.j1 f41097j1;
    public final org.telegram.ui.n4 k1;
    public final Drawable f41098l1;
    public TextView m1;
    public int f41099n1;
    public boolean f41100o1;
    public final ys0 f41101p1;
    public int f41102q1;

    public zs0(Context context, ys0 ys0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.D4);
        this.f41101p1 = ys0Var;
        N();
        Drawable mutate = context.getResources().getDrawable(2131232726).mutate();
        this.f41098l1 = mutate;
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), PorterDuff.Mode.MULTIPLY));
        ai.o2 o2Var = new ai.o2(27, context, this);
        this.f28586b = o2Var;
        o2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        ci.j1 j1Var = new ci.j1(26, context, this);
        this.f41097j1 = j1Var;
        getContext();
        j1Var.setLayoutManager(new u4.b0(1, false));
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(5, this, context);
        this.k1 = n4Var;
        j1Var.setAdapter(n4Var);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setClipToPadding(false);
        j1Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
        j1Var.setOnScrollListener(new ji(this, 17));
        j1Var.setOnItemClickListener(new k(this, 13));
        this.f28586b.addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(2131231238);
        this.f28586b.addView(view, b8.mf.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        ai.d2 d2Var = new ai.d2(context, 19);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, d2Var, null);
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
        textView.setText(org.telegram.messenger.bd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        d2Var.addView(textView, b8.mf.e(-2, -1, 51));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.v0(i11) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i11, 15);
        f10.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(f10, h03, null, h7, null);
        f10.setPadding(org.telegram.messenger.g0.L(33.0f), 0, org.telegram.messenger.g0.L(33.0f), 0);
        d2Var.addView(f10, b8.mf.e(-2, -1, 53));
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
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView2, b8.mf.t(-2, 23, 16, 0, 0, 10, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f11, i11, null);
        f11.setGravity(17);
        f11.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
        f11.setText(org.telegram.messenger.bd.M0(2131745650, null).toUpperCase());
        f11.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(f11, b8.mf.r(-2, -2, 16));
        org.telegram.ui.ActionBar.r6.i(i3, d2Var, e6Var);
        this.f28586b.addView(d2Var, b8.mf.e(-1, 48, 83));
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
        textView.setText(org.telegram.messenger.bd.M0(2131744850, null));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final zs0 f40471b;

            {
                this.f40471b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        zs0 zs0Var = this.f40471b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.cd(org.telegram.messenger.ld.f(i13), 6));
                        }
                        zs0Var.dismiss();
                        return;
                    default:
                        this.f40471b.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.f28061n5, e6Var);
        f11.setText(org.telegram.messenger.bd.M0(2131752041, null).toUpperCase());
        f10.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        f10.setOnClickListener(new View.OnClickListener(this) {
            public final zs0 f40471b;

            {
                this.f40471b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        zs0 zs0Var = this.f40471b;
                        for (int i13 = 0; i13 < 4; i13++) {
                            Utilities.d.c(new org.telegram.messenger.cd(org.telegram.messenger.ld.f(i13), 6));
                        }
                        zs0Var.dismiss();
                        return;
                    default:
                        this.f40471b.dismiss();
                        return;
                }
            }
        });
        textView2.setVisibility(8);
        n4Var.f();
    }

    public static void I0(zs0 zs0Var) {
        ci.j1 j1Var = zs0Var.f41097j1;
        if (j1Var.getChildCount() <= 0) {
            int paddingTop = j1Var.getPaddingTop();
            zs0Var.f41099n1 = paddingTop;
            j1Var.setTopGlowOffset(paddingTop);
            zs0Var.f28586b.invalidate();
            return;
        }
        int i3 = 0;
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        if (top > 0 && bj0Var != null && bj0Var.b() == 0) {
            i3 = top;
        }
        if (zs0Var.f41099n1 != i3) {
            zs0Var.f41099n1 = i3;
            j1Var.setTopGlowOffset(i3);
            zs0Var.f28586b.invalidate();
        }
    }

    public static org.telegram.messenger.kd J0(int i3) {
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = org.telegram.messenger.ld.f(i10).J;
            if (i3 >= arrayList.size()) {
                i3 -= arrayList.size();
            } else {
                return (org.telegram.messenger.kd) arrayList.get(i3);
            }
        }
        return null;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.D4) {
            if (org.telegram.messenger.ld.g() == 0) {
                dismiss();
            } else {
                this.k1.f();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D4);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
            Drawable drawable = this.f41098l1;
            if (drawable != null && w02 != this.f41102q1) {
                this.f41102q1 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
