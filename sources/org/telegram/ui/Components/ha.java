package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.LaunchActivity;
public abstract class ha extends org.telegram.ui.ActionBar.z2 {
    public static final int O1 = 0;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public t5 E1;
    public boolean F1;
    public boolean G1;
    public wt H1;
    public boolean I1;
    public boolean J1;
    public float K1;
    public int L1;
    public int M1;
    public int N1;
    public final Drawable f26722i1;
    public final dh.f f26723j1;
    public final uk0 f26724k1;
    public final da l1;
    public boolean f26725m1;
    public int f26726n1;
    public final org.telegram.ui.ActionBar.k2 f26727o1;
    public final boolean f26728p1;
    public final ba f26729q1;
    public float f26730r1;
    public boolean f26731s1;
    public float f26732t1;
    public boolean f26733u1;
    public boolean f26734v1;
    public final RectF f26735w1;
    public int f26736x1;
    public int f26737y1;
    public int f26738z1;

    public ha(org.telegram.ui.ActionBar.k2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(org.telegram.ui.ActionBar.k2, boolean):void");
    }

    @Override
    public boolean H() {
        return false;
    }

    public final void I0() {
        uk0 uk0Var = this.f26724k1;
        if (uk0Var != null && uk0Var.getLayoutManager() != null && this.L1 >= 0) {
            int top = (this.M1 - this.f21587b.getTop()) - uk0Var.getPaddingTop();
            if (uk0Var.getLayoutManager() instanceof s4.a0) {
                ((s4.a0) uk0Var.getLayoutManager()).h1(this.L1, top);
            }
            this.L1 = -1;
        }
    }

    public boolean J0(View view, float f7, float f10) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.y2 y2Var = this.Y;
        if (y2Var != null && this.f21587b != null && this.f21613r0 != null && Z0() && !this.f26728p1) {
            Rect bounds = this.f21613r0.getBounds();
            if (this.f21587b.getMeasuredWidth() >= this.f21590c.getMeasuredWidth()) {
                y2Var.c(((this.f21587b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.i0.L(30.0f)) - ((int) this.f21587b.getTranslationY()));
            } else {
                y2Var.c(0);
            }
        }
    }

    public abstract tk0 L0(uk0 uk0Var);

    public uk0 M0(Context context) {
        return new ag.b1(this, context, this.I0, 8);
    }

    public int N0() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.V0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void W0(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        boolean z10;
        float f10;
        int i11;
        this.J1 = false;
        if (!this.f26728p1) {
            boolean z11 = this.G1;
            uk0 uk0Var = this.f26724k1;
            if (z11) {
                int height = uk0Var.getHeight();
                for (int i12 = 0; i12 < uk0Var.getChildCount(); i12++) {
                    View childAt = uk0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != uk0Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.F1) {
                            i11 = (int) childAt.getTranslationY();
                        } else {
                            i11 = 0;
                        }
                        height = Math.min(height, top + i11);
                    }
                }
                i10 = height - org.telegram.messenger.i0.L(16.0f);
            } else {
                s4.c1 K = uk0Var.K(0);
                int i13 = -org.telegram.messenger.i0.L(16.0f);
                if (K != null) {
                    View view2 = K.f47909a;
                    i13 = view2.getBottom() - org.telegram.messenger.i0.L(16.0f);
                    if (this.F1) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.f26737y1 + this.f26738z1) + this.A1)) + this.B1;
            if (this.f26733u1 && this.f26734v1) {
                if (this.N1 == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= org.telegram.messenger.i0.L(f10);
            }
            float f11 = i14;
            this.K1 = f11;
            T0(f11);
            int i15 = this.N1;
            float f12 = 1.0f;
            da daVar = this.l1;
            if (i15 == 1) {
                float L = 1.0f - ((org.telegram.messenger.i0.L(16.0f) + i14) / N0());
                if (L < 0.0f) {
                    L = 0.0f;
                }
                if (L != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.messenger.i0.Y3(daVar, z10, 1.0f, true, this.f26725m1);
            } else if (i15 == 2) {
                float max = Math.max(((org.telegram.messenger.i0.L(8.0f) + (i14 - this.B1)) + this.f26738z1) - org.telegram.messenger.i0.f16166m, 0.0f);
                t5 t5Var = this.E1;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float e = t5Var.e(false, f7);
                if (e != 0.0f && e != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f21587b.getMeasuredWidth(), this.f21587b.getMeasuredHeight());
                    this.J1 = true;
                }
                this.f26732t1 = e;
                f12 = org.telegram.messenger.i0.T1(1.0f, 0.5f, e);
                daVar.e.setAlpha(e);
                Q0(e);
                daVar.e.setScaleX(e);
                daVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                daVar.e.setScaleY(e);
                org.telegram.ui.ActionBar.u5 titleTextView = daVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(21.0f) - titleTextView.getLeft(), 0.0f, e) + 0);
                if (this.I1) {
                    titleTextView.setTranslationX(((daVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                daVar.setTranslationY(max);
                i14 -= org.telegram.messenger.i0.W1(e, 0, org.telegram.messenger.i0.L(13.0f) + (((this.f26736x1 - this.f26737y1) - this.f26738z1) - this.A1));
                daVar.getBackground().setBounds(0, org.telegram.messenger.i0.W1(e, daVar.getHeight(), 0), daVar.getWidth(), daVar.getHeight());
                if (e > 0.5f) {
                    if (this.D1) {
                        this.D1 = false;
                        daVar.setTag(1);
                    }
                } else if (!this.D1) {
                    this.D1 = true;
                    daVar.setTag(null);
                }
            }
            if (Z0()) {
                if (!(this instanceof mg.w0)) {
                    this.f21613r0.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f21613r0.setBounds(-org.telegram.messenger.i0.L(6.0f), i14, org.telegram.messenger.i0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                K0();
                this.f21613r0.draw(canvas);
                if (this.f26733u1 && f12 > 0.0f) {
                    int L2 = org.telegram.messenger.i0.L(36.0f);
                    int L3 = org.telegram.messenger.i0.L(20.0f) + i14;
                    RectF rectF = this.f26735w1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.i0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, this.I0));
                    org.telegram.ui.ActionBar.t6.f21218t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
                }
            }
            R0(canvas, i14);
        }
    }

    public final void X0() {
        uk0 uk0Var = this.f26724k1;
        if (uk0Var != null && this.f26723j1 != null && uk0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < uk0Var.getChildCount(); i12++) {
                View childAt = uk0Var.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
            if (view != null) {
                this.L1 = i10;
                this.M1 = this.f21587b.getTop() + view.getTop();
                this.f21596e1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Y0() {
        if (this.f26728p1) {
            return;
        }
        this.N1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f26737y1 = currentActionBarHeight;
        this.f26736x1 = currentActionBarHeight + org.telegram.messenger.i0.f16166m;
        this.f26738z1 = org.telegram.messenger.i0.L(16.0f);
        this.A1 = org.telegram.messenger.i0.L(-20.0f);
        this.E1 = new t5(this.f21587b, 0L, 350L, gr.h);
        this.l1.e.setPivotX(0.0f);
        this.f26724k1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f21599f1 != null) {
            LaunchActivity.I1.F(true, true, true);
            return;
        }
        da daVar = this.l1;
        if (daVar != null && daVar.getTag() != null) {
            org.telegram.messenger.i0.p3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f26727o1;
        if (k2Var != null) {
            org.telegram.messenger.i0.p3(this, k2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle(O0());
        }
    }

    public final void c1() {
        da daVar = this.l1;
        if (daVar != null && !TextUtils.equals(O0(), daVar.getTitle())) {
            daVar.K(O0(), false, 350L, gr.h);
        }
    }

    @Override
    public final boolean f() {
        da daVar = this.l1;
        if (daVar != null && daVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.f26727o1;
        if (k2Var != null) {
            return k2Var.isLightStatusBar();
        }
        return P0();
    }

    @Override
    public void h0() {
        T0(this.K1);
        K0();
    }

    public ha(org.telegram.ui.ActionBar.k2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.p6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(org.telegram.ui.ActionBar.k2, boolean, boolean, org.telegram.ui.ActionBar.p6):void");
    }

    public ha(android.content.Context r2, org.telegram.ui.ActionBar.k2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.p6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(android.content.Context, org.telegram.ui.ActionBar.k2, boolean, boolean, org.telegram.ui.ActionBar.p6):void");
    }

    public ha(int r2, android.content.Context r3, org.telegram.ui.ActionBar.p6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(int, android.content.Context, org.telegram.ui.ActionBar.p6, boolean):void");
    }

    public void Q0(float f7) {
    }

    public void T0(float f7) {
    }

    public void U0(vu0 vu0Var) {
    }

    public ha(android.content.Context r2, org.telegram.ui.ActionBar.k2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.p6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(android.content.Context, org.telegram.ui.ActionBar.k2, boolean, boolean, int, org.telegram.ui.ActionBar.p6):void");
    }

    public ha(android.content.Context r3, org.telegram.ui.ActionBar.p6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha.<init>(android.content.Context, org.telegram.ui.ActionBar.p6, boolean):void");
    }

    public void R0(Canvas canvas, int i10) {
    }

    public void S0(int i10, int i11) {
    }

    public ha(Context context, org.telegram.ui.ActionBar.k2 k2Var, ga gaVar) {
        super(gaVar.f26371b, context, gaVar.f26374g, gaVar.f26370a);
        ba baVar;
        this.f26730r1 = 0.4f;
        this.f26731s1 = true;
        this.f26732t1 = 1.0f;
        this.f26733u1 = false;
        this.f26735w1 = new RectF();
        this.N1 = 1;
        this.f26736x1 = 0;
        this.f26737y1 = 0;
        this.f26738z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = true;
        this.D1 = false;
        this.F1 = false;
        this.L1 = -1;
        boolean z10 = gaVar.f26372c;
        boolean z11 = gaVar.d;
        boolean z12 = gaVar.e;
        int i10 = gaVar.f26373f;
        this.f26727o1 = k2Var;
        this.f26728p1 = z10;
        this.f26722i1 = context.getDrawable(2131231238).mutate();
        if (z11) {
            ba baVar2 = new ba(this, context, z12, z10);
            this.f26729q1 = baVar2;
            baVar = baVar2;
        } else {
            baVar = new ca(this, context, z12, z10);
        }
        uk0 M0 = M0(context);
        this.f26724k1 = M0;
        dh.f fVar = new dh.f(5);
        this.f26723j1 = fVar;
        if (z12) {
            fVar.l1(true);
        }
        M0.setLayoutManager(fVar);
        ba baVar3 = this.f26729q1;
        if (baVar3 != null) {
            baVar3.setBottomSheetContainerView(this.f21590c);
            this.f26729q1.setTargetListView(M0);
        }
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = baVar;
            baVar.addView(M0, w7.b6.c(-2.0f, -1));
        } else {
            M0.setAdapter(new fa(this, L0(M0), context));
            this.f21587b = baVar;
            da daVar = new da(this, context, baVar);
            this.l1 = daVar;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, daVar, this.I0);
            org.telegram.ui.ActionBar.a7.m(daVar, 5, org.telegram.ui.ActionBar.t6.G6, this.I0);
            org.telegram.ui.ActionBar.a7.m(daVar, 3, org.telegram.ui.ActionBar.t6.f21333z8, this.I0);
            daVar.setBackButtonImage(2131231241);
            org.telegram.ui.ActionBar.a7.m(daVar, 1, org.telegram.ui.ActionBar.t6.f21314y8, this.I0);
            daVar.setCastShadows(true);
            daVar.setTitle(O0());
            daVar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 2));
            baVar.addView(M0);
            baVar.addView(daVar, w7.b6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ag.u(baVar, 12));
        }
        if (i10 == 2) {
            Y0();
        }
        U0(baVar);
        a1();
    }
}
