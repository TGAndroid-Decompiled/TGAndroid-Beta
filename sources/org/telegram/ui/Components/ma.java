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
public abstract class ma extends org.telegram.ui.ActionBar.w2 {
    public static final int R1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public boolean G1;
    public v5 H1;
    public boolean I1;
    public boolean J1;
    public kt K1;
    public boolean L1;
    public boolean M1;
    public float N1;
    public int O1;
    public int P1;
    public int Q1;
    public final Drawable l1;
    public final jg.b0 f35901m1;
    public final pj0 n1;
    public final ia f35902o1;
    public boolean f35903p1;
    public int f35904q1;
    public final org.telegram.ui.ActionBar.f2 f35905r1;
    public final boolean f35906s1;
    public final ga f35907t1;
    public float f35908u1;
    public boolean f35909v1;
    public float f35910w1;
    public boolean f35911x1;
    public boolean f35912y1;
    public final RectF f35913z1;

    public ma(org.telegram.ui.ActionBar.f2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(org.telegram.ui.ActionBar.f2, boolean):void");
    }

    @Override
    public boolean G() {
        return false;
    }

    public final void I0() {
        pj0 pj0Var = this.n1;
        if (pj0Var != null && pj0Var.getLayoutManager() != null && this.O1 >= 0) {
            int top = (this.P1 - this.f28672b.getTop()) - pj0Var.getPaddingTop();
            if (pj0Var.getLayoutManager() instanceof v4.b0) {
                ((v4.b0) pj0Var.getLayoutManager()).h1(this.O1, top);
            }
            this.O1 = -1;
        }
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.v2 v2Var = this.Y;
        if (v2Var != null && this.f28672b != null && this.f28702r0 != null && Z0() && !this.f35906s1) {
            Rect bounds = this.f28702r0.getBounds();
            if (this.f28672b.getMeasuredWidth() >= this.f28675c.getMeasuredWidth()) {
                v2Var.c(((this.f28672b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f28672b.getTranslationY()));
            } else {
                v2Var.c(0);
            }
        }
    }

    public abstract oj0 L0(pj0 pj0Var);

    public pj0 M0(Context context) {
        return new bi.q1(this, context, this.I0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.V0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        float f10;
        ImageView imageView;
        Paint paint;
        boolean z9;
        float f11;
        int i10;
        this.M1 = false;
        if (!this.f35906s1) {
            boolean z10 = this.J1;
            pj0 pj0Var = this.n1;
            if (z10) {
                int height = pj0Var.getHeight();
                for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                    View childAt = pj0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != pj0Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.I1) {
                            i10 = (int) childAt.getTranslationY();
                        } else {
                            i10 = 0;
                        }
                        height = Math.min(height, top + i10);
                    }
                }
                i7 = height - org.telegram.messenger.g0.L(16.0f);
            } else {
                v4.d1 K = pj0Var.K(0);
                int i12 = -org.telegram.messenger.g0.L(16.0f);
                if (K != null) {
                    View view2 = K.f57052a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.I1) {
                        i7 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i7 = i12;
            }
            int i13 = (i7 - ((this.B1 + this.C1) + this.D1)) + this.E1;
            if (this.f35911x1 && this.f35912y1) {
                if (this.Q1 == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= org.telegram.messenger.g0.L(f11);
            }
            float f12 = i13;
            this.N1 = f12;
            T0(f12);
            int i14 = this.Q1;
            float f13 = 1.0f;
            ia iaVar = this.f35902o1;
            if (i14 == 1) {
                float L = 1.0f - ((org.telegram.messenger.g0.L(16.0f) + i13) / N0());
                if (L < 0.0f) {
                    L = 0.0f;
                }
                if (L != 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.messenger.g0.Z3(iaVar, z9, 1.0f, true, this.f35903p1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.E1)) + this.C1) - org.telegram.messenger.g0.f22561m, 0.0f);
                v5 v5Var = this.H1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = v5Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f28672b.getMeasuredWidth(), this.f28672b.getMeasuredHeight());
                    this.M1 = true;
                }
                this.f35910w1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                iaVar.f27672e.setAlpha(e10);
                Q0(e10);
                iaVar.f27672e.setScaleX(e10);
                iaVar.f27672e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                iaVar.f27672e.setScaleY(e10);
                org.telegram.ui.ActionBar.m5 titleTextView = iaVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.L1) {
                    titleTextView.setTranslationX(((iaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                iaVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.A1 - this.B1) - this.C1) - this.D1));
                iaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, iaVar.getHeight(), 0), iaVar.getWidth(), iaVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.G1) {
                        this.G1 = false;
                        iaVar.setTag(1);
                    }
                } else if (!this.G1) {
                    this.G1 = true;
                    iaVar.setTag(null);
                }
            }
            if (Z0()) {
                if (!(this instanceof wg.z)) {
                    this.f28702r0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f28702r0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                K0();
                this.f28702r0.draw(canvas);
                if (this.f35911x1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.f35913z1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, this.I0));
                    org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
                }
            }
            R0(canvas, i13);
        }
    }

    public final void X0() {
        pj0 pj0Var = this.n1;
        if (pj0Var != null && this.f35901m1 != null && pj0Var.getChildCount() > 0) {
            View view = null;
            int i7 = -1;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                View childAt = pj0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    view = childAt;
                    i7 = R;
                }
            }
            if (view != null) {
                this.O1 = i7;
                this.P1 = this.f28672b.getTop() + view.getTop();
                this.f28689h1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Y0() {
        if (this.f35906s1) {
            return;
        }
        this.Q1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.B1 = currentActionBarHeight;
        this.A1 = currentActionBarHeight + org.telegram.messenger.g0.f22561m;
        this.C1 = org.telegram.messenger.g0.L(16.0f);
        this.D1 = org.telegram.messenger.g0.L(-20.0f);
        this.H1 = new v5(this.f28672b, 0L, 350L, wq.h);
        this.f35902o1.f27672e.setPivotX(0.0f);
        this.n1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f28691i1 != null) {
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        ia iaVar = this.f35902o1;
        if (iaVar != null && iaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f35905r1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ia iaVar = this.f35902o1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ia iaVar = this.f35902o1;
        if (iaVar != null && !TextUtils.equals(O0(), iaVar.getTitle())) {
            iaVar.M(O0(), false, 350L, wq.h);
        }
    }

    @Override
    public final boolean f() {
        ia iaVar = this.f35902o1;
        if (iaVar != null && iaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f35905r1;
        if (f2Var != null) {
            return f2Var.isLightStatusBar();
        }
        return P0();
    }

    @Override
    public void h0() {
        T0(this.N1);
        K0();
    }

    public ma(org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.h6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(org.telegram.ui.ActionBar.f2, boolean, boolean, org.telegram.ui.ActionBar.h6):void");
    }

    public ma(android.content.Context r2, org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.h6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, boolean, boolean, org.telegram.ui.ActionBar.h6):void");
    }

    public ma(int r2, android.content.Context r3, org.telegram.ui.ActionBar.h6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(int, android.content.Context, org.telegram.ui.ActionBar.h6, boolean):void");
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(st0 st0Var) {
    }

    public ma(android.content.Context r2, org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.h6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, boolean, boolean, int, org.telegram.ui.ActionBar.h6):void");
    }

    public ma(android.content.Context r3, org.telegram.ui.ActionBar.h6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, boolean):void");
    }

    public ma(Context context, org.telegram.ui.ActionBar.f2 f2Var, la laVar) {
        super(laVar.f35623b, context, laVar.f35627g, laVar.f35622a);
        ga gaVar;
        this.f35908u1 = 0.4f;
        this.f35909v1 = true;
        this.f35910w1 = 1.0f;
        this.f35911x1 = false;
        this.f35913z1 = new RectF();
        this.Q1 = 1;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = true;
        this.G1 = false;
        this.I1 = false;
        this.O1 = -1;
        boolean z9 = laVar.f35624c;
        boolean z10 = laVar.d;
        boolean z11 = laVar.f35625e;
        int i7 = laVar.f35626f;
        this.f35905r1 = f2Var;
        this.f35906s1 = z9;
        this.l1 = context.getDrawable(2131231237).mutate();
        if (z10) {
            ga gaVar2 = new ga(this, context, z11, z9);
            this.f35907t1 = gaVar2;
            gaVar = gaVar2;
        } else {
            gaVar = new ha(this, context, z11, z9);
        }
        pj0 M0 = M0(context);
        this.n1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.f35901m1 = b0Var;
        if (z11) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        ga gaVar3 = this.f35907t1;
        if (gaVar3 != null) {
            gaVar3.setBottomSheetContainerView(this.f28675c);
            this.f35907t1.setTargetListView(M0);
        }
        if (z9) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = gaVar;
            gaVar.addView(M0, c8.ha.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ka(this, L0(M0), context));
            this.f28672b = gaVar;
            ia iaVar = new ia(this, context, gaVar);
            this.f35902o1 = iaVar;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, iaVar, this.I0);
            org.telegram.ui.ActionBar.t6.l(iaVar, 5, org.telegram.ui.ActionBar.m6.G6, this.I0);
            org.telegram.ui.ActionBar.t6.l(iaVar, 3, org.telegram.ui.ActionBar.m6.f28302z8, this.I0);
            iaVar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.t6.l(iaVar, 1, org.telegram.ui.ActionBar.m6.f28284y8, this.I0);
            iaVar.setCastShadows(true);
            iaVar.setTitle(O0());
            iaVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 11));
            gaVar.addView(M0);
            gaVar.addView(iaVar, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.b(gaVar, 27));
        }
        if (i7 == 2) {
            Y0();
        }
        U0(gaVar);
        a1();
    }

    public void R0(Canvas canvas, int i7) {
    }

    public void S0(int i7, int i10) {
    }
}
