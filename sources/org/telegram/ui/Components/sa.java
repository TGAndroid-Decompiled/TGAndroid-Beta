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
public abstract class sa extends org.telegram.ui.ActionBar.w2 {
    public static final int S1 = 0;
    public final RectF A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public boolean G1;
    public boolean H1;
    public d6 I1;
    public boolean J1;
    public boolean K1;
    public yt L1;
    public boolean M1;
    public boolean N1;
    public float O1;
    public int P1;
    public int Q1;
    public int R1;
    public final Drawable f39531m1;
    public final jg.b0 n1;
    public final ek0 f39532o1;
    public final na f39533p1;
    public boolean f39534q1;
    public int f39535r1;
    public final org.telegram.ui.ActionBar.g2 f39536s1;
    public final boolean f39537t1;
    public final la f39538u1;
    public float f39539v1;
    public boolean f39540w1;
    public float f39541x1;
    public boolean f39542y1;
    public boolean f39543z1;

    public sa(org.telegram.ui.ActionBar.g2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(org.telegram.ui.ActionBar.g2, boolean):void");
    }

    @Override
    public boolean G() {
        return false;
    }

    public final void J0() {
        ek0 ek0Var = this.f39532o1;
        if (ek0Var != null && ek0Var.getLayoutManager() != null && this.P1 >= 0) {
            int top = (this.Q1 - this.f30176b.getTop()) - ek0Var.getPaddingTop();
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
        if (v2Var != null && this.f30176b != null && this.f30209s0 != null && a1() && !this.f39537t1) {
            Rect bounds = this.f30209s0.getBounds();
            if (this.f30176b.getMeasuredWidth() >= this.f30179c.getMeasuredWidth()) {
                v2Var.c(((this.f30176b.getMeasuredHeight() - bounds.top) - org.telegram.messenger.g0.L(30.0f)) - ((int) this.f30176b.getTranslationY()));
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
        if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void W0(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.W0(android.graphics.Canvas, android.widget.FrameLayout):void");
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
        if (!this.f39537t1) {
            boolean z11 = this.K1;
            ek0 ek0Var = this.f39532o1;
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
                    View view2 = K.f59165a;
                    i12 = view2.getBottom() - org.telegram.messenger.g0.L(16.0f);
                    if (this.J1) {
                        i7 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i7 = i12;
            }
            int i13 = (i7 - ((this.C1 + this.D1) + this.E1)) + this.F1;
            if (this.f39542y1 && this.f39543z1) {
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
            na naVar = this.f39533p1;
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
                org.telegram.messenger.g0.X3(naVar, z10, 1.0f, true, this.f39534q1);
            } else if (i14 == 2) {
                float max = Math.max(((org.telegram.messenger.g0.L(8.0f) + (i13 - this.F1)) + this.D1) - org.telegram.messenger.g0.f24040m, 0.0f);
                d6 d6Var = this.I1;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float e10 = d6Var.e(false, f10);
                if (e10 != 0.0f && e10 != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.f30176b.getMeasuredWidth(), this.f30176b.getMeasuredHeight());
                    this.N1 = true;
                }
                this.f39541x1 = e10;
                f13 = org.telegram.messenger.g0.T1(1.0f, 0.5f, e10);
                naVar.f29130e.setAlpha(e10);
                R0(e10);
                naVar.f29130e.setScaleX(e10);
                naVar.f29130e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                naVar.f29130e.setScaleY(e10);
                org.telegram.ui.ActionBar.m5 titleTextView = naVar.getTitleTextView();
                titleTextView.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(21.0f) - titleTextView.getLeft(), 0.0f, e10) + 0);
                if (this.M1) {
                    titleTextView.setTranslationX(((naVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                naVar.setTranslationY(max);
                i13 -= org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(13.0f) + (((this.B1 - this.C1) - this.D1) - this.E1));
                naVar.getBackground().setBounds(0, org.telegram.messenger.g0.W1(e10, naVar.getHeight(), 0), naVar.getWidth(), naVar.getHeight());
                if (e10 > 0.5f) {
                    if (this.H1) {
                        this.H1 = false;
                        naVar.setTag(1);
                    }
                } else if (!this.H1) {
                    this.H1 = true;
                    naVar.setTag(null);
                }
            }
            if (a1()) {
                if (!(this instanceof wg.a0)) {
                    this.f30209s0.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.f30209s0.setBounds(-org.telegram.messenger.g0.L(6.0f), i13, org.telegram.messenger.g0.L(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                L0();
                this.f30209s0.draw(canvas);
                if (this.f39542y1 && f13 > 0.0f) {
                    int L2 = org.telegram.messenger.g0.L(36.0f);
                    int L3 = org.telegram.messenger.g0.L(20.0f) + i13;
                    RectF rectF = this.A1;
                    rectF.set((view.getMeasuredWidth() - L2) / 2.0f, L3, (view.getMeasuredWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + L3);
                    org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, this.J0));
                    org.telegram.ui.ActionBar.m6.f29672t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29672t0);
                }
            }
            S0(canvas, i13);
        }
    }

    public final void Y0() {
        ek0 ek0Var = this.f39532o1;
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
                this.Q1 = this.f30176b.getTop() + view.getTop();
                this.f30195i1 = System.currentTimeMillis() + 80;
            }
        }
    }

    public final void Z0() {
        if (this.f39537t1) {
            return;
        }
        this.R1 = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.C1 = currentActionBarHeight;
        this.B1 = currentActionBarHeight + org.telegram.messenger.g0.f24040m;
        this.D1 = org.telegram.messenger.g0.L(16.0f);
        this.E1 = org.telegram.messenger.g0.L(-20.0f);
        this.I1 = new d6(this.f30176b, 0L, 350L, nr.h);
        this.f39533p1.f29130e.setPivotX(0.0f);
        this.f39532o1.setClipToPadding(true);
    }

    public boolean a1() {
        return true;
    }

    public final void b1() {
        if (this.f30197j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            return;
        }
        na naVar = this.f39533p1;
        if (naVar != null && naVar.getTag() != null) {
            org.telegram.messenger.g0.p3(this, Q0());
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39536s1;
        if (g2Var != null) {
            org.telegram.messenger.g0.p3(this, g2Var.isLightStatusBar());
        }
    }

    public void c1() {
        na naVar = this.f39533p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
    }

    public final void d1() {
        na naVar = this.f39533p1;
        if (naVar != null && !TextUtils.equals(P0(), naVar.getTitle())) {
            naVar.N(P0(), false, 350L, nr.h);
        }
    }

    @Override
    public final boolean f() {
        na naVar = this.f39533p1;
        if (naVar != null && naVar.getTag() != null) {
            return Q0();
        }
        org.telegram.ui.ActionBar.g2 g2Var = this.f39536s1;
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

    public sa(org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.h6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(org.telegram.ui.ActionBar.g2, boolean, boolean, org.telegram.ui.ActionBar.h6):void");
    }

    public sa(android.content.Context r2, org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.h6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, boolean, boolean, org.telegram.ui.ActionBar.h6):void");
    }

    public sa(int r2, android.content.Context r3, org.telegram.ui.ActionBar.h6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(int, android.content.Context, org.telegram.ui.ActionBar.h6, boolean):void");
    }

    public void R0(float f10) {
    }

    public void U0(float f10) {
    }

    public void V0(du0 du0Var) {
    }

    public sa(android.content.Context r2, org.telegram.ui.ActionBar.g2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.h6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(android.content.Context, org.telegram.ui.ActionBar.g2, boolean, boolean, int, org.telegram.ui.ActionBar.h6):void");
    }

    public sa(android.content.Context r3, org.telegram.ui.ActionBar.h6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.<init>(android.content.Context, org.telegram.ui.ActionBar.h6, boolean):void");
    }

    public sa(Context context, org.telegram.ui.ActionBar.g2 g2Var, ra raVar) {
        super(raVar.f39132b, context, raVar.f39136g, raVar.f39131a);
        la laVar;
        this.f39539v1 = 0.4f;
        this.f39540w1 = true;
        this.f39541x1 = 1.0f;
        this.f39542y1 = false;
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
        boolean z10 = raVar.f39133c;
        boolean z11 = raVar.d;
        boolean z12 = raVar.f39134e;
        int i7 = raVar.f39135f;
        this.f39536s1 = g2Var;
        this.f39537t1 = z10;
        this.f39531m1 = context.getDrawable(2131231237).mutate();
        if (z11) {
            la laVar2 = new la(this, context, z12, z10);
            this.f39538u1 = laVar2;
            laVar = laVar2;
        } else {
            laVar = new ma(this, context, z12, z10);
        }
        ek0 N0 = N0(context);
        this.f39532o1 = N0;
        jg.b0 b0Var = new jg.b0(6);
        this.n1 = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        N0.setLayoutManager(b0Var);
        la laVar3 = this.f39538u1;
        if (laVar3 != null) {
            laVar3.setBottomSheetContainerView(this.f30179c);
            this.f39538u1.setTargetListView(N0);
        }
        if (z10) {
            N0.setHasFixedSize(true);
            N0.setAdapter(M0(N0));
            this.O = laVar;
            laVar.addView(N0, c8.ma.c(-2.0f, -1));
        } else {
            N0.setAdapter(new qa(this, M0(N0), context));
            this.f30176b = laVar;
            na naVar = new na(this, context, laVar);
            this.f39533p1 = naVar;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, naVar, this.J0);
            org.telegram.ui.ActionBar.t6.l(naVar, 5, org.telegram.ui.ActionBar.m6.G6, this.J0);
            org.telegram.ui.ActionBar.t6.l(naVar, 3, org.telegram.ui.ActionBar.m6.f29794z8, this.J0);
            naVar.setBackButtonImage(2131231240);
            org.telegram.ui.ActionBar.t6.l(naVar, 1, org.telegram.ui.ActionBar.m6.f29775y8, this.J0);
            naVar.setCastShadows(true);
            naVar.setTitle(P0());
            naVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 14));
            laVar.addView(N0);
            laVar.addView(naVar, c8.ma.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            N0.j(new oa(laVar, 0));
        }
        if (i7 == 2) {
            Z0();
        }
        V0(laVar);
        b1();
    }

    public void S0(Canvas canvas, int i7) {
    }

    public void T0(int i7, int i10) {
    }
}
