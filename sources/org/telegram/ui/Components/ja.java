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
public abstract class ja extends org.telegram.ui.ActionBar.u2 {
    public static final int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public u5 I1;
    public boolean J1;
    public boolean K1;
    public rt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable f35935m1;
    public final jg.b0 n1;
    public final uj0 f35936o1;
    public final fa f35937p1;
    public boolean f35938q1;
    public int f35939r1;
    public final org.telegram.ui.ActionBar.e2 f35940s1;
    public final boolean f35941t1;
    public final da f35942u1;
    public float f35943v1;
    public boolean f35944w1;
    public float f35945x1;
    public boolean f35946y1;
    public boolean f35947z1;

    public ja(org.telegram.ui.ActionBar.e2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(org.telegram.ui.ActionBar.e2, boolean):void");
    }

    @Override
    public boolean H() {
        return false;
    }

    public final void I0() {
        uj0 uj0Var = this.f35936o1;
        if (uj0Var != null && uj0Var.getLayoutManager() != null && this.P1 >= 0) {
            int top = (this.Q1 - this.f29682b.getTop()) - uj0Var.getPaddingTop();
            if (uj0Var.getLayoutManager() instanceof v4.b0) {
                ((v4.b0) uj0Var.getLayoutManager()).h1(this.P1, top);
            }
            this.P1 = -1;
        }
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.t2 t2Var = this.Z;
        if (t2Var != null && this.f29682b != null && this.f29715s0 != null && Z0() && !this.f35941t1) {
            Rect bounds = this.f29715s0.getBounds();
            if (this.f29682b.getMeasuredWidth() >= this.f29685c.getMeasuredWidth()) {
                t2Var.c(((this.f29682b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f29682b.getTranslationY()));
            } else {
                t2Var.c(0);
            }
        }
    }

    public abstract tj0 L0(uj0 uj0Var);

    public uj0 M0(Context context) {
        return new di.c1(this, context, this.J0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.V0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        float f10;
        ImageView imageView;
        Paint paint;
        boolean z10;
        float f11;
        int i10;
        this.N1 = false;
        if (!this.f35941t1) {
            boolean z11 = this.K1;
            uj0 uj0Var = this.f35936o1;
            if (z11) {
                int height = uj0Var.getHeight();
                for (int i11 = 0; i11 < uj0Var.getChildCount(); i11++) {
                    View childAt = uj0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != uj0Var.getAdapter().b() - 1) {
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
                v4.e1 K = uj0Var.K(0);
                int i12 = -org.telegram.messenger.g0.L(16.0f);
                if (K != null) {
                    View view2 = K.f58535a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.J1) {
                        i7 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i7 = i12;
            }
            int i13 = (i7 - ((this.C1 + this.D1) + this.E1)) + this.F1;
            if (this.f35946y1 && this.f35947z1) {
                if (this.R1 == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= org.telegram.messenger.g0.L(f11);
            }
            float f12 = i13;
            this.O1 = f12;
            T0(f12);
            int i14 = this.R1;
            float f13 = 1.0f;
            fa faVar = this.f35937p1;
            if (i14 == 1) {
                float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i13) / N0());
                if (L < 0.0f) {
                    L = 0.0f;
                }
                if (L != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.messenger.g0.Y3(faVar, z10, 1.0f, true, this.f35938q1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.F1)) + this.D1) - org.telegram.messenger.g0.f23603m, 0.0f);
                u5 u5Var = this.I1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f29682b.getMeasuredWidth(), this.f29682b.getMeasuredHeight());
                    this.N1 = true;
                }
                this.f35945x1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                faVar.f29284e.setAlpha(e10);
                Q0(e10);
                faVar.f29284e.setScaleX(e10);
                faVar.f29284e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                faVar.f29284e.setScaleY(e10);
                org.telegram.ui.ActionBar.j5 titleTextView = faVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.M1) {
                    titleTextView.setTranslationX(((faVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                faVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
                faVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, faVar.getHeight(), 0), faVar.getWidth(), faVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.H1) {
                        this.H1 = false;
                        faVar.setTag(1);
                    }
                } else if (!this.H1) {
                    this.H1 = true;
                    faVar.setTag(null);
                }
            }
            if (Z0()) {
                if (!(this instanceof wg.y)) {
                    this.f29715s0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f29715s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                K0();
                this.f29715s0.draw(canvas);
                if (this.f35946y1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.A1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, this.J0));
                    org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
                }
            }
            R0(canvas, i13);
        }
    }

    public final void X0() {
        uj0 uj0Var = this.f35936o1;
        if (uj0Var != null && this.n1 != null && uj0Var.getChildCount() > 0) {
            View view = null;
            int i7 = -1;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < uj0Var.getChildCount(); i11++) {
                View childAt = uj0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    view = childAt;
                    i7 = R;
                }
            }
            if (view != null) {
                this.P1 = i7;
                this.Q1 = this.f29682b.getTop() + view.getTop();
                this.f29701i1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Y0() {
        if (this.f35941t1) {
            return;
        }
        this.R1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.C1 = currentActionBarHeight;
        this.B1 = currentActionBarHeight + org.telegram.messenger.g0.f23603m;
        this.D1 = org.telegram.messenger.g0.L(16.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.I1 = new u5(this.f29682b, 0L, 350L, er.h);
        this.f35937p1.f29284e.setPivotX(0.0f);
        this.f35936o1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f29703j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        fa faVar = this.f35937p1;
        if (faVar != null && faVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f35940s1;
        if (e2Var != null) {
            org.telegram.messenger.g0.q3(this, e2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        fa faVar = this.f35937p1;
        if (faVar != null) {
            faVar.setTitle(O0());
        }
    }

    public final void c1() {
        fa faVar = this.f35937p1;
        if (faVar != null && !TextUtils.equals(O0(), faVar.getTitle())) {
            faVar.N(O0(), false, 350L, er.h);
        }
    }

    @Override
    public final boolean f() {
        fa faVar = this.f35937p1;
        if (faVar != null && faVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.f35940s1;
        if (e2Var != null) {
            return e2Var.isLightStatusBar();
        }
        return P0();
    }

    @Override
    public void h0() {
        T0(this.O1);
        K0();
    }

    public ja(org.telegram.ui.ActionBar.e2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(org.telegram.ui.ActionBar.e2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public ja(android.content.Context r2, org.telegram.ui.ActionBar.e2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(android.content.Context, org.telegram.ui.ActionBar.e2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public ja(int r2, android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(int, android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(st0 st0Var) {
    }

    public ja(android.content.Context r2, org.telegram.ui.ActionBar.e2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.e6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(android.content.Context, org.telegram.ui.ActionBar.e2, boolean, boolean, int, org.telegram.ui.ActionBar.e6):void");
    }

    public ja(android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ja.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public ja(Context context, org.telegram.ui.ActionBar.e2 e2Var, ia iaVar) {
        super(iaVar.f35531b, context, iaVar.f35535g, iaVar.f35530a);
        da daVar;
        this.f35943v1 = 0.4f;
        this.f35944w1 = true;
        this.f35945x1 = 1.0f;
        this.f35946y1 = false;
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
        boolean z10 = iaVar.f35532c;
        boolean z11 = iaVar.d;
        boolean z12 = iaVar.f35533e;
        int i7 = iaVar.f35534f;
        this.f35940s1 = e2Var;
        this.f35941t1 = z10;
        this.f35935m1 = context.getDrawable(2131231237).mutate();
        if (z11) {
            da daVar2 = new da(this, context, z12, z10);
            this.f35942u1 = daVar2;
            daVar = daVar2;
        } else {
            daVar = new ea(this, context, z12, z10);
        }
        uj0 M0 = M0(context);
        this.f35936o1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        da daVar3 = this.f35942u1;
        if (daVar3 != null) {
            daVar3.setBottomSheetContainerView(this.f29685c);
            this.f35942u1.setTargetListView(M0);
        }
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.O = daVar;
            daVar.addView(M0, c8.ja.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ha(this, L0(M0), context));
            this.f29682b = daVar;
            fa faVar = new fa(this, context, daVar);
            this.f35937p1 = faVar;
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, faVar, this.J0);
            org.telegram.ui.ActionBar.q6.l(faVar, 5, org.telegram.ui.ActionBar.j6.G6, this.J0);
            org.telegram.ui.ActionBar.q6.l(faVar, 3, org.telegram.ui.ActionBar.j6.f29262z8, this.J0);
            faVar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.q6.l(faVar, 1, org.telegram.ui.ActionBar.j6.f29243y8, this.J0);
            faVar.setCastShadows(true);
            faVar.setTitle(O0());
            faVar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 12));
            daVar.addView(M0);
            daVar.addView(faVar, c8.ja.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new bi.z4(daVar, 29));
        }
        if (i7 == 2) {
            Y0();
        }
        U0(daVar);
        a1();
    }

    public void R0(Canvas canvas, int i7) {
    }

    public void S0(int i7, int i10) {
    }
}
