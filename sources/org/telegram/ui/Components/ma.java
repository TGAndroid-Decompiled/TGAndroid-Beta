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
public abstract class ma extends org.telegram.ui.ActionBar.t2 {
    public static final int P1 = 0;
    public int A1;
    public int B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public u5 F1;
    public boolean G1;
    public boolean H1;
    public jt I1;
    public boolean J1;
    public boolean K1;
    public float L1;
    public int M1;
    public int N1;
    public int O1;
    public final Drawable f36101j1;
    public final kg.y k1;
    public final tj0 f36102l1;
    public final ia m1;
    public boolean f36103n1;
    public int f36104o1;
    public final org.telegram.ui.ActionBar.d2 f36105p1;
    public final boolean f36106q1;
    public final ga f36107r1;
    public float f36108s1;
    public boolean f36109t1;
    public float f36110u1;
    public boolean f36111v1;
    public boolean f36112w1;
    public final RectF f36113x1;
    public int f36114y1;
    public int f36115z1;

    public ma(org.telegram.ui.ActionBar.d2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(org.telegram.ui.ActionBar.d2, boolean):void");
    }

    @Override
    public boolean G() {
        return false;
    }

    public final void I0() {
        tj0 tj0Var = this.f36102l1;
        if (tj0Var != null && tj0Var.getLayoutManager() != null && this.M1 >= 0) {
            int top = (this.N1 - this.f28586b.getTop()) - tj0Var.getPaddingTop();
            if (tj0Var.getLayoutManager() instanceof u4.b0) {
                ((u4.b0) tj0Var.getLayoutManager()).h1(this.M1, top);
            }
            this.M1 = -1;
        }
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.s2 s2Var = this.Z;
        if (s2Var != null && this.f28586b != null && this.f28616s0 != null && Z0() && !this.f36106q1) {
            Rect bounds = this.f28616s0.getBounds();
            if (this.f28586b.getMeasuredWidth() >= this.f28589c.getMeasuredWidth()) {
                s2Var.c(((this.f28586b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f28586b.getTranslationY()));
            } else {
                s2Var.c(0);
            }
        }
    }

    public abstract sj0 L0(tj0 tj0Var);

    public tj0 M0(Context context) {
        return new ci.j1(this, context, this.J0, 13);
    }

    public int N0() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public abstract CharSequence O0();

    public final boolean P0() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.V0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void W0(Canvas canvas, View view) {
        int i3;
        float f10;
        ImageView imageView;
        Paint paint;
        boolean z10;
        float f11;
        int i10;
        this.K1 = false;
        if (!this.f36106q1) {
            boolean z11 = this.H1;
            tj0 tj0Var = this.f36102l1;
            if (z11) {
                int height = tj0Var.getHeight();
                for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
                    View childAt = tj0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != tj0Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.G1) {
                            i10 = (int) childAt.getTranslationY();
                        } else {
                            i10 = 0;
                        }
                        height = Math.min(height, top + i10);
                    }
                }
                i3 = height - org.telegram.messenger.g0.L(16.0f);
            } else {
                u4.d1 K = tj0Var.K(0);
                int i12 = -org.telegram.messenger.g0.L(16.0f);
                if (K != null) {
                    View view2 = K.f55540a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.G1) {
                        i3 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i3 = i12;
            }
            int i13 = (i3 - ((this.f36115z1 + this.A1) + this.B1)) + this.C1;
            if (this.f36111v1 && this.f36112w1) {
                if (this.O1 == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= org.telegram.messenger.g0.L(f11);
            }
            float f12 = i13;
            this.L1 = f12;
            T0(f12);
            int i14 = this.O1;
            float f13 = 1.0f;
            ia iaVar = this.m1;
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
                org.telegram.messenger.g0.Z3(iaVar, z10, 1.0f, true, this.f36103n1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.C1)) + this.A1) - org.telegram.messenger.g0.f22602m, 0.0f);
                u5 u5Var = this.F1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = u5Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f28586b.getMeasuredWidth(), this.f28586b.getMeasuredHeight());
                    this.K1 = true;
                }
                this.f36110u1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                iaVar.f27708e.setAlpha(e10);
                Q0(e10);
                iaVar.f27708e.setScaleX(e10);
                iaVar.f27708e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                iaVar.f27708e.setScaleY(e10);
                org.telegram.ui.ActionBar.k5 titleTextView = iaVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.J1) {
                    titleTextView.setTranslationX(((iaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                iaVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.f36114y1 - this.f36115z1) - this.A1) - this.B1));
                iaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, iaVar.getHeight(), 0), iaVar.getWidth(), iaVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.E1) {
                        this.E1 = false;
                        iaVar.setTag(1);
                    }
                } else if (!this.E1) {
                    this.E1 = true;
                    iaVar.setTag(null);
                }
            }
            if (Z0()) {
                if (!(this instanceof xg.a0)) {
                    this.f28616s0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f28616s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                K0();
                this.f28616s0.draw(canvas);
                if (this.f36111v1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.f36113x1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.J0));
                    org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
                }
            }
            R0(canvas, i13);
        }
    }

    public final void X0() {
        tj0 tj0Var = this.f36102l1;
        if (tj0Var != null && this.k1 != null && tj0Var.getChildCount() > 0) {
            View view = null;
            int i3 = -1;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
                View childAt = tj0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    view = childAt;
                    i3 = R;
                }
            }
            if (view != null) {
                this.M1 = i3;
                this.N1 = this.f28586b.getTop() + view.getTop();
                this.f28599f1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Y0() {
        if (this.f36106q1) {
            return;
        }
        this.O1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f36115z1 = currentActionBarHeight;
        this.f36114y1 = currentActionBarHeight + org.telegram.messenger.g0.f22602m;
        this.A1 = org.telegram.messenger.g0.L(16.0f);
        this.B1 = org.telegram.messenger.g0.L(-20.0f);
        this.F1 = new u5(this.f28586b, 0L, 350L, xq.h);
        this.m1.f27708e.setPivotX(0.0f);
        this.f36102l1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f28601g1 != null) {
            LaunchActivity.K1.F(true, true, true);
            return;
        }
        ia iaVar = this.m1;
        if (iaVar != null && iaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f36105p1;
        if (d2Var != null) {
            org.telegram.messenger.g0.q3(this, d2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ia iaVar = this.m1;
        if (iaVar != null && !TextUtils.equals(O0(), iaVar.getTitle())) {
            iaVar.K(O0(), false, 350L, xq.h);
        }
    }

    @Override
    public final boolean f() {
        ia iaVar = this.m1;
        if (iaVar != null && iaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f36105p1;
        if (d2Var != null) {
            return d2Var.isLightStatusBar();
        }
        return P0();
    }

    @Override
    public void h0() {
        T0(this.L1);
        K0();
    }

    public ma(org.telegram.ui.ActionBar.d2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(org.telegram.ui.ActionBar.d2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public ma(android.content.Context r2, org.telegram.ui.ActionBar.d2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.d2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public ma(int r2, android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(int, android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(qt0 qt0Var) {
    }

    public ma(android.content.Context r2, org.telegram.ui.ActionBar.d2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.e6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.d2, boolean, boolean, int, org.telegram.ui.ActionBar.e6):void");
    }

    public ma(android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public void R0(Canvas canvas, int i3) {
    }

    public void S0(int i3, int i10) {
    }

    public ma(Context context, org.telegram.ui.ActionBar.d2 d2Var, la laVar) {
        super(laVar.f35639b, context, laVar.f35643g, laVar.f35638a);
        ga gaVar;
        this.f36108s1 = 0.4f;
        this.f36109t1 = true;
        this.f36110u1 = 1.0f;
        this.f36111v1 = false;
        this.f36113x1 = new RectF();
        this.O1 = 1;
        this.f36114y1 = 0;
        this.f36115z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = true;
        this.E1 = false;
        this.G1 = false;
        this.M1 = -1;
        boolean z10 = laVar.f35640c;
        boolean z11 = laVar.d;
        boolean z12 = laVar.f35641e;
        int i3 = laVar.f35642f;
        this.f36105p1 = d2Var;
        this.f36106q1 = z10;
        this.f36101j1 = context.getDrawable(2131231237).mutate();
        if (z11) {
            ga gaVar2 = new ga(this, context, z12, z10);
            this.f36107r1 = gaVar2;
            gaVar = gaVar2;
        } else {
            gaVar = new ha(this, context, z12, z10);
        }
        tj0 M0 = M0(context);
        this.f36102l1 = M0;
        kg.y yVar = new kg.y(6);
        this.k1 = yVar;
        if (z12) {
            yVar.l1(true);
        }
        M0.setLayoutManager(yVar);
        ga gaVar3 = this.f36107r1;
        if (gaVar3 != null) {
            gaVar3.setBottomSheetContainerView(this.f28589c);
            this.f36107r1.setTargetListView(M0);
        }
        if (z10) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.O = gaVar;
            gaVar.addView(M0, b8.mf.c(-2.0f, -1));
        } else {
            M0.setAdapter(new ka(this, L0(M0), context));
            this.f28586b = gaVar;
            ia iaVar = new ia(this, context, gaVar);
            this.m1 = iaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, iaVar, this.J0);
            org.telegram.ui.ActionBar.r6.m(iaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.J0);
            org.telegram.ui.ActionBar.r6.m(iaVar, 3, org.telegram.ui.ActionBar.k6.f28292z8, this.J0);
            iaVar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.r6.m(iaVar, 1, org.telegram.ui.ActionBar.k6.f28275y8, this.J0);
            iaVar.setCastShadows(true);
            iaVar.setTitle(O0());
            iaVar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 12));
            gaVar.addView(M0);
            gaVar.addView(iaVar, b8.mf.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.j5(gaVar, 29));
        }
        if (i3 == 2) {
            Y0();
        }
        U0(gaVar);
        a1();
    }
}
