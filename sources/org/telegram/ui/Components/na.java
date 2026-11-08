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
public abstract class na extends org.telegram.ui.ActionBar.v2 {
    public static final int O1 = 0;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public w5 E1;
    public boolean F1;
    public boolean G1;
    public lt H1;
    public boolean I1;
    public boolean J1;
    public float K1;
    public int L1;
    public int M1;
    public int N1;
    public final Drawable f36275i1;
    public final jg.b0 f36276j1;
    public final pj0 f36277k1;
    public final ja l1;
    public boolean f36278m1;
    public int n1;
    public final org.telegram.ui.ActionBar.f2 f36279o1;
    public final boolean f36280p1;
    public final ha f36281q1;
    public float f36282r1;
    public boolean f36283s1;
    public float f36284t1;
    public boolean f36285u1;
    public boolean f36286v1;
    public final RectF f36287w1;
    public int f36288x1;
    public int f36289y1;
    public int f36290z1;

    public na(org.telegram.ui.ActionBar.f2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(org.telegram.ui.ActionBar.f2, boolean):void");
    }

    @Override
    public boolean G() {
        return false;
    }

    public final void I0() {
        pj0 pj0Var = this.f36277k1;
        if (pj0Var != null && pj0Var.getLayoutManager() != null && this.L1 >= 0) {
            int top = (this.M1 - this.f28619b.getTop()) - pj0Var.getPaddingTop();
            if (pj0Var.getLayoutManager() instanceof v4.b0) {
                ((v4.b0) pj0Var.getLayoutManager()).h1(this.L1, top);
            }
            this.L1 = -1;
        }
    }

    public boolean J0(View view, float f10, float f11) {
        return true;
    }

    public final void K0() {
        org.telegram.ui.ActionBar.u2 u2Var = this.Y;
        if (u2Var != null && this.f28619b != null && this.f28646r0 != null && Z0() && !this.f36280p1) {
            Rect bounds = this.f28646r0.getBounds();
            if (this.f28619b.getMeasuredWidth() >= this.f28622c.getMeasuredWidth()) {
                u2Var.c(((this.f28619b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f28619b.getTranslationY()));
            } else {
                u2Var.c(0);
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
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, this.I0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void V0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.V0(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void W0(Canvas canvas, View view) {
        int i7;
        float f10;
        ImageView imageView;
        Paint paint;
        boolean z9;
        float f11;
        int i10;
        this.J1 = false;
        if (!this.f36280p1) {
            boolean z10 = this.G1;
            pj0 pj0Var = this.f36277k1;
            if (z10) {
                int height = pj0Var.getHeight();
                for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                    View childAt = pj0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != pj0Var.getAdapter().b() - 1) {
                        int top = childAt.getTop();
                        if (this.F1) {
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
                    View view2 = K.f57044a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.F1) {
                        i7 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i7 = i12;
            }
            int i13 = (i7 - ((this.f36289y1 + this.f36290z1) + this.A1)) + this.B1;
            if (this.f36285u1 && this.f36286v1) {
                if (this.N1 == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= org.telegram.messenger.g0.L(f11);
            }
            float f12 = i13;
            this.K1 = f12;
            T0(f12);
            int i14 = this.N1;
            float f13 = 1.0f;
            ja jaVar = this.l1;
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
                org.telegram.messenger.g0.Z3(jaVar, z9, 1.0f, true, this.f36278m1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.B1)) + this.f36290z1) - org.telegram.messenger.g0.f22557m, 0.0f);
                w5 w5Var = this.E1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = w5Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f28619b.getMeasuredWidth(), this.f28619b.getMeasuredHeight());
                    this.J1 = true;
                }
                this.f36284t1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                jaVar.f27661e.setAlpha(e10);
                Q0(e10);
                jaVar.f27661e.setScaleX(e10);
                jaVar.f27661e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                jaVar.f27661e.setScaleY(e10);
                org.telegram.ui.ActionBar.k5 titleTextView = jaVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.I1) {
                    titleTextView.setTranslationX(((jaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                jaVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.f36288x1 - this.f36289y1) - this.f36290z1) - this.A1));
                jaVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, jaVar.getHeight(), 0), jaVar.getWidth(), jaVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.D1) {
                        this.D1 = false;
                        jaVar.setTag(1);
                    }
                } else if (!this.D1) {
                    this.D1 = true;
                    jaVar.setTag(null);
                }
            }
            if (Z0()) {
                if (!(this instanceof wg.a0)) {
                    this.f28646r0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f28646r0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                K0();
                this.f28646r0.draw(canvas);
                if (this.f36285u1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.f36287w1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.k6.f28143t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, this.I0));
                    org.telegram.ui.ActionBar.k6.f28143t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28143t0);
                }
            }
            R0(canvas, i13);
        }
    }

    public final void X0() {
        pj0 pj0Var = this.f36277k1;
        if (pj0Var != null && this.f36276j1 != null && pj0Var.getChildCount() > 0) {
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
                this.L1 = i7;
                this.M1 = this.f28619b.getTop() + view.getTop();
                this.f28629e1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Y0() {
        if (this.f36280p1) {
            return;
        }
        this.N1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f36289y1 = currentActionBarHeight;
        this.f36288x1 = currentActionBarHeight + org.telegram.messenger.g0.f22557m;
        this.f36290z1 = org.telegram.messenger.g0.L(16.0f);
        this.A1 = org.telegram.messenger.g0.L(-20.0f);
        this.E1 = new w5(this.f28619b, 0L, 350L, xq.h);
        this.l1.f27661e.setPivotX(0.0f);
        this.f36277k1.setClipToPadding(true);
    }

    public boolean Z0() {
        return true;
    }

    public final void a1() {
        if (this.f28632f1 != null) {
            LaunchActivity.G1.F(true, true, true);
            return;
        }
        ja jaVar = this.l1;
        if (jaVar != null && jaVar.getTag() != null) {
            org.telegram.messenger.g0.q3(this, P0());
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f36279o1;
        if (f2Var != null) {
            org.telegram.messenger.g0.q3(this, f2Var.isLightStatusBar());
        }
    }

    public final void b1() {
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle(O0());
        }
    }

    public final void c1() {
        ja jaVar = this.l1;
        if (jaVar != null && !TextUtils.equals(O0(), jaVar.getTitle())) {
            jaVar.K(O0(), false, 350L, xq.h);
        }
    }

    @Override
    public final boolean f() {
        ja jaVar = this.l1;
        if (jaVar != null && jaVar.getTag() != null) {
            return P0();
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.f36279o1;
        if (f2Var != null) {
            return f2Var.isLightStatusBar();
        }
        return P0();
    }

    @Override
    public void h0() {
        T0(this.K1);
        K0();
    }

    public na(org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.f6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(org.telegram.ui.ActionBar.f2, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    public na(android.content.Context r2, org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.f6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    public na(int r2, android.content.Context r3, org.telegram.ui.ActionBar.f6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public void Q0(float f10) {
    }

    public void T0(float f10) {
    }

    public void U0(rt0 rt0Var) {
    }

    public na(android.content.Context r2, org.telegram.ui.ActionBar.f2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.f6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(android.content.Context, org.telegram.ui.ActionBar.f2, boolean, boolean, int, org.telegram.ui.ActionBar.f6):void");
    }

    public na(android.content.Context r3, org.telegram.ui.ActionBar.f6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public na(Context context, org.telegram.ui.ActionBar.f2 f2Var, ma maVar) {
        super(maVar.f35951b, context, maVar.f35955g, maVar.f35950a);
        ha haVar;
        this.f36282r1 = 0.4f;
        this.f36283s1 = true;
        this.f36284t1 = 1.0f;
        this.f36285u1 = false;
        this.f36287w1 = new RectF();
        this.N1 = 1;
        this.f36288x1 = 0;
        this.f36289y1 = 0;
        this.f36290z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = true;
        this.D1 = false;
        this.F1 = false;
        this.L1 = -1;
        boolean z9 = maVar.f35952c;
        boolean z10 = maVar.d;
        boolean z11 = maVar.f35953e;
        int i7 = maVar.f35954f;
        this.f36279o1 = f2Var;
        this.f36280p1 = z9;
        this.f36275i1 = context.getDrawable(2131231237).mutate();
        if (z10) {
            ha haVar2 = new ha(this, context, z11, z9);
            this.f36281q1 = haVar2;
            haVar = haVar2;
        } else {
            haVar = new ia(this, context, z11, z9);
        }
        pj0 M0 = M0(context);
        this.f36277k1 = M0;
        jg.b0 b0Var = new jg.b0(6);
        this.f36276j1 = b0Var;
        if (z11) {
            b0Var.l1(true);
        }
        M0.setLayoutManager(b0Var);
        ha haVar3 = this.f36281q1;
        if (haVar3 != null) {
            haVar3.setBottomSheetContainerView(this.f28622c);
            this.f36281q1.setTargetListView(M0);
        }
        if (z9) {
            M0.setHasFixedSize(true);
            M0.setAdapter(L0(M0));
            this.N = haVar;
            haVar.addView(M0, c8.ha.c(-2.0f, -1));
        } else {
            M0.setAdapter(new la(this, L0(M0), context));
            this.f28619b = haVar;
            ja jaVar = new ja(this, context, haVar);
            this.l1 = jaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27925h5, jaVar, this.I0);
            org.telegram.ui.ActionBar.r6.m(jaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.I0);
            org.telegram.ui.ActionBar.r6.m(jaVar, 3, org.telegram.ui.ActionBar.k6.f28264z8, this.I0);
            jaVar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.r6.m(jaVar, 1, org.telegram.ui.ActionBar.k6.f28246y8, this.I0);
            jaVar.setCastShadows(true);
            jaVar.setTitle(O0());
            jaVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 11));
            haVar.addView(M0);
            haVar.addView(jaVar, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            M0.j(new ai.b(haVar, 27));
        }
        if (i7 == 2) {
            Y0();
        }
        U0(haVar);
        a1();
    }

    public void R0(Canvas canvas, int i7) {
    }

    public void S0(int i7, int i10) {
    }
}
