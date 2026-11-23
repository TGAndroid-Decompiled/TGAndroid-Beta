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
public abstract class ra extends org.telegram.ui.ActionBar.w2 {
    public static final int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public c6 I1;
    public boolean J1;
    public boolean K1;
    public wt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable f39245m1;
    public final jg.b0 n1;
    public final ek0 f39246o1;
    public final ma f39247p1;
    public boolean f39248q1;
    public int f39249r1;
    public final org.telegram.ui.ActionBar.g2 f39250s1;
    public final boolean f39251t1;
    public final ka f39252u1;
    public float f39253v1;
    public boolean f39254w1;
    public float f39255x1;
    public boolean f39256y1;
    public boolean f39257z1;

    public ra(org.telegram.ui.ActionBar.g2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(org.telegram.ui.ActionBar.g2, boolean):void");
    }

    @Override
    public boolean F() {
        return false;
    }

    public final void J0() {
        ek0 ek0Var = this.f39246o1;
        if (ek0Var != null && ek0Var.getLayoutManager() != null && this.P1 >= 0) {
            int top = (this.Q1 - this.f30226b.getTop()) - ek0Var.getPaddingTop();
            if (ek0Var.getLayoutManager() instanceof v4.c0) {
                ((v4.c0) ek0Var.getLayoutManager()).h1(this.P1, top);
            }
            this.P1 = -1;
        }
    }

    public boolean K0(View view, float f10, float f11) {
        return true;
    }

    public final void L0() {
        org.telegram.ui.ActionBar.v2 v2Var = this.Z;
        if (v2Var != null && this.f30226b != null && this.f30259s0 != null && a1() && !this.f39251t1) {
            Rect bounds = this.f30259s0.getBounds();
            if (this.f30226b.getMeasuredWidth() >= this.f30229c.getMeasuredWidth()) {
                v2Var.c(((this.f30226b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f30226b.getTranslationY()));
            } else {
                v2Var.c(0);
            }
        }
    }

    public abstract dk0 M0(ek0 ek0Var);

    public ek0 N0(Context context) {
        return new di.b1(this, context, this.J0, 13);
    }

    public int O0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence P0();

    public final boolean Q0() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void W0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.W0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void X0(Canvas canvas, View view) {
        int i7;
        float f10;
        ImageView imageView;
        Paint paint;
        boolean z10;
        float f11;
        int i10;
        this.N1 = false;
        if (!this.f39251t1) {
            boolean z11 = this.K1;
            ek0 ek0Var = this.f39246o1;
            if (z11) {
                int height = ek0Var.getHeight();
                for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
                    View childAt = ek0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != ek0Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.J1) {
                            i10 = (int) childAt.getTranslationY();
                        } else {
                            i10 = 0;
                        }
                        height = Math.min(height, top + i10);
                    }
                }
                i7 = height - org.telegram.messenger.g0.L(16.0f);
            } else {
                v4.f1 K = ek0Var.K(0);
                int i12 = -org.telegram.messenger.g0.L(16.0f);
                if (K != null) {
                    View view2 = K.f59245a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.J1) {
                        i7 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i7 = i12;
            }
            int i13 = (i7 - ((this.C1 + this.D1) + this.E1)) + this.F1;
            if (this.f39256y1 && this.f39257z1) {
                if (this.R1 == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= org.telegram.messenger.g0.L(f11);
            }
            float f12 = i13;
            this.O1 = f12;
            U0(f12);
            int i14 = this.R1;
            float f13 = 1.0f;
            ma maVar = this.f39247p1;
            if (i14 == 1) {
                float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i13) / O0());
                if (L < 0.0f) {
                    L = 0.0f;
                }
                if (L != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.messenger.g0.X3(maVar, z10, 1.0f, true, this.f39248q1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.F1)) + this.D1) - org.telegram.messenger.g0.f24220m, 0.0f);
                c6 c6Var = this.I1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = c6Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f30226b.getMeasuredWidth(), this.f30226b.getMeasuredHeight());
                    this.N1 = true;
                }
                this.f39255x1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                maVar.f29146e.setAlpha(e10);
                R0(e10);
                maVar.f29146e.setScaleX(e10);
                maVar.f29146e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                maVar.f29146e.setScaleY(e10);
                org.telegram.ui.ActionBar.n5 titleTextView = maVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.M1) {
                    titleTextView.setTranslationX(((maVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                maVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
                maVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, maVar.getHeight(), 0), maVar.getWidth(), maVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.H1) {
                        this.H1 = false;
                        maVar.setTag(1);
                    }
                } else if (!this.H1) {
                    this.H1 = true;
                    maVar.setTag(null);
                }
            }
            if (a1()) {
                if (!(this instanceof wg.z)) {
                    this.f30259s0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f30259s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                L0();
                this.f30259s0.draw(canvas);
                if (this.f39256y1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.A1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, this.J0));
                    org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
                }
            }
            S0(canvas, i13);
        }
    }

    public final void Y0() {
        ek0 ek0Var = this.f39246o1;
        if (ek0Var != null && this.n1 != null && ek0Var.getChildCount() > 0) {
            View view = null;
            int i7 = -1;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
                View childAt = ek0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    view = childAt;
                    i7 = R;
                }
            }
            if (view != null) {
                this.P1 = i7;
                this.Q1 = this.f30226b.getTop() + view.getTop();
                this.f30245i1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Z0() {
        if (this.f39251t1) {
            return;
        }
        this.R1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.C1 = currentActionBarHeight;
        this.B1 = currentActionBarHeight + org.telegram.messenger.g0.f24220m;
        this.D1 = org.telegram.messenger.g0.L(16.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.I1 = new c6(this.f30226b, 0L, 350L, kr.h);
        this.f39247p1.f29146e.setPivotX(0.0f);
        this.f39246o1.setClipToPadding(true);
    }

    public boolean a1() {
        return true;
    }

    public final void b1() {
        if (this.f30247j1 != null) {
            LaunchActivity.H1.G(true, true, true);
            return;
        }
        ma maVar = this.f39247p1;
        if (maVar != null && maVar.getTag() != null) {
            org.telegram.messenger.g0.p3(this, Q0());
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39250s1;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    public void c1() {
        ma maVar = this.f39247p1;
        if (maVar != null) {
            maVar.setTitle(P0());
        }
    }

    public final void d1() {
        ma maVar = this.f39247p1;
        if (maVar != null && !TextUtils.equals(P0(), maVar.getTitle())) {
            maVar.N(P0(), false, 350L, kr.h);
        }
    }

    @Override
    public final boolean f() {
        ma maVar = this.f39247p1;
        if (maVar != null && maVar.getTag() != null) {
            return Q0();
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39250s1;
        if (g2Var != null) {
            return g2Var.isLightStatusBar();
        }
        return Q0();
    }

    @Override
    public void h0() {
        U0(this.O1);
        L0();
    }

    public ra(org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.i6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(org.telegram.ui.ActionBar.g2, boolean, boolean, org.telegram.ui.ActionBar.i6):void");
    }

    public ra(android.content.Context r2, org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.i6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, boolean, boolean, org.telegram.ui.ActionBar.i6):void");
    }

    public ra(int r2, android.content.Context r3, org.telegram.ui.ActionBar.i6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(int, android.content.Context, org.telegram.ui.ActionBar.i6, boolean):void");
    }

    public void R0(float f10) {
    }

    public void U0(float f10) {
    }

    public void V0(cu0 cu0Var) {
    }

    public ra(android.content.Context r2, org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.i6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, boolean, boolean, int, org.telegram.ui.ActionBar.i6):void");
    }

    public ra(android.content.Context r3, org.telegram.ui.ActionBar.i6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ra.<init>(android.content.Context, org.telegram.ui.ActionBar.i6, boolean):void");
    }

    public ra(Context context, org.telegram.ui.ActionBar.g2 g2Var, qa qaVar) {
        super(qaVar.f38745b, context, qaVar.f38749g, qaVar.f38744a);
        ka kaVar;
        this.f39253v1 = 0.4f;
        this.f39254w1 = true;
        this.f39255x1 = 1.0f;
        this.f39256y1 = false;
        this.A1 = new RectF();
        this.R1 = 1;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = 0;
        this.G1 = true;
        this.H1 = false;
        this.J1 = false;
        this.P1 = -1;
        boolean z10 = qaVar.f38746c;
        boolean z11 = qaVar.d;
        boolean z12 = qaVar.f38747e;
        int i7 = qaVar.f38748f;
        this.f39250s1 = g2Var;
        this.f39251t1 = z10;
        this.f39245m1 = context.getDrawable(2131231240).mutate();
        if (z11) {
            ka kaVar2 = new ka(this, context, z12, z10);
            this.f39252u1 = kaVar2;
            kaVar = kaVar2;
        } else {
            kaVar = new la(this, context, z12, z10);
        }
        ek0 N0 = N0(context);
        this.f39246o1 = N0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        N0.setLayoutManager(b0Var);
        ka kaVar3 = this.f39252u1;
        if (kaVar3 != null) {
            kaVar3.setBottomSheetContainerView(this.f30229c);
            this.f39252u1.setTargetListView(N0);
        }
        if (z10) {
            N0.setHasFixedSize(true);
            N0.setAdapter(M0(N0));
            this.O = kaVar;
            kaVar.addView(N0, c8.na.c(-2.0f, -1));
        } else {
            N0.setAdapter(new pa(this, M0(N0), context));
            this.f30226b = kaVar;
            ma maVar = new ma(this, context, kaVar);
            this.f39247p1 = maVar;
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, maVar, this.J0);
            org.telegram.ui.ActionBar.u6.l(maVar, 5, org.telegram.ui.ActionBar.n6.G6, this.J0);
            org.telegram.ui.ActionBar.u6.l(maVar, 3, org.telegram.ui.ActionBar.n6.f29864z8, this.J0);
            maVar.setBackButtonImage(2131231243);
            org.telegram.ui.ActionBar.u6.l(maVar, 1, org.telegram.ui.ActionBar.n6.f29845y8, this.J0);
            maVar.setCastShadows(true);
            maVar.setTitle(P0());
            maVar.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 14));
            kaVar.addView(N0);
            kaVar.addView(maVar, c8.na.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            N0.j(new na(kaVar, 0));
        }
        if (i7 == 2) {
            Z0();
        }
        V0(kaVar);
        b1();
    }

    public void S0(Canvas canvas, int i7) {
    }

    public void T0(int i7, int i10) {
    }
}
