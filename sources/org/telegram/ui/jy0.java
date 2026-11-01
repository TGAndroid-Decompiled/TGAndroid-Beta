package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public final class jy0 extends FrameLayout {
    public RadialGradient D;
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.d5 I;
    public final org.telegram.ui.Components.t5 J;
    public boolean K;
    public boolean L;
    public final Paint M;
    public final RectF N;
    public boolean O;
    public final ProfileActivity P;
    public int f38594a;
    public final Paint f38595b;
    public boolean f38596c;
    public final org.telegram.ui.Components.t5 d;
    public int e;
    public int f38597f;
    public final org.telegram.ui.Components.w4 h;
    public final org.telegram.ui.Components.w4 f38598n;
    public int f38599r;
    public int f38600s;
    public int f38601w;
    public float f38602x;
    public float f38603y;

    public jy0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P = profileActivity;
        this.f38595b = new Paint();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.d = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.h = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.f38598n = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.t5(this, 0L, 440L, grVar);
        new org.telegram.ui.Components.t5(this, 0L, 440L, grVar);
        this.M = new Paint();
        this.N = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.lp lpVar, boolean z10) {
        ProfileActivity profileActivity = this.P;
        if (lpVar != null) {
            this.f38596c = true;
            this.e = lpVar.c(org.telegram.ui.ActionBar.t6.I.q());
            int d = lpVar.d(org.telegram.ui.ActionBar.t6.I.q());
            this.f38597f = d;
            profileActivity.f33788b1 = i0.b.f(0.25f, this.e, d);
            int i10 = lpVar.f16984a;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.t6.r1(0.45f, i10);
            } else {
                this.G = rn0.B0(this.e);
                this.H = org.telegram.ui.ActionBar.t6.r1(0.15f, rn0.B0(this.e));
            }
        } else {
            profileActivity.f33788b1 = this.f38594a;
            this.f38596c = false;
            int i11 = org.telegram.ui.ActionBar.t6.f21207s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0)));
                this.H = org.telegram.ui.ActionBar.t6.r1(0.35f, org.telegram.ui.ActionBar.t6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0)));
            } else {
                this.G = rn0.B0(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0));
                this.H = org.telegram.ui.ActionBar.t6.r1(0.15f, rn0.B0(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.f33957z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f38598n.a(this.f38597f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.d5 d5Var = this.I;
        boolean z11 = true;
        d5Var.j(j10, true);
        d5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.K = z11;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        boolean z10;
        Canvas canvas2;
        float f7;
        hx0 hx0Var;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        org.telegram.ui.ActionBar.l lVar3;
        float f11;
        float f12;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.l lVar4;
        float f15;
        org.telegram.ui.ActionBar.l lVar5;
        ag.c2 c2Var;
        ei.r rVar;
        boolean z11 = this.O;
        ProfileActivity profileActivity = this.P;
        if (!z11) {
            rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
            rVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        float f16 = currentActionBarHeight + i10 + profileActivity.P1 + profileActivity.S1;
        int i12 = (int) ((1.0f - profileActivity.Q5) * f16);
        boolean z12 = true;
        if (profileActivity.A5 > 0.0f && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i12, (int) ((1.0f - profileActivity.A5) * 255.0f));
        }
        if (i12 != 0) {
            int i13 = this.f38594a;
            Paint paint = this.f38595b;
            paint.setColor(i13);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f38598n.a(this.f38597f, false);
            org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
            if (hg0Var != null) {
                int i14 = this.H;
                boolean z13 = this.f38596c;
                f10 = 1.0f;
                if (hg0Var.P == null || hg0Var.N != i14 || hg0Var.O != z13) {
                    hg0Var.N = i14;
                    hg0Var.O = z13;
                    hg0Var.g();
                }
            } else {
                f10 = 1.0f;
            }
            org.telegram.ui.Components.ch0 ch0Var = profileActivity.f33787b0;
            if (ch0Var != null) {
                ch0Var.d(this.H, this.f38596c);
            }
            org.telegram.ui.Components.lg0 lg0Var = profileActivity.I5;
            if (lg0Var != null) {
                int i15 = this.H;
                boolean z14 = this.f38596c;
                if (lg0Var.f28162i != i15 || lg0Var.f28163j != z14) {
                    lg0Var.f28162i = i15;
                    lg0Var.f28163j = z14;
                    lg0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.D;
            f7 = 0.0f;
            Paint paint2 = this.F;
            if (radialGradient != null && this.f38599r == a2 && this.f38600s == a10 && this.f38601w == width) {
                f11 = 2.0f;
            } else {
                this.f38602x = org.telegram.messenger.i0.L(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                if (lVar2.getOccupyStatusBar()) {
                    i11 = org.telegram.messenger.i0.f16166m;
                } else {
                    i11 = 0;
                }
                lVar3 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                this.f38603y = lVar3.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - (org.telegram.messenger.i0.f16171p * 21.0f));
                this.f38601w = width;
                float f17 = this.f38603y;
                f11 = 2.0f;
                float f18 = this.f38602x;
                this.f38600s = a10;
                this.f38599r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f18 / 2.0f) + f17, f18, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.D = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.D);
            }
            if (profileActivity.I1 == 0) {
                f12 = f10;
            } else {
                f12 = profileActivity.R1;
            }
            float d = this.d.d(this.f38596c) * f12;
            if (d < f10) {
                f13 = 255.0f;
                f14 = f11;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint);
            } else {
                f13 = 255.0f;
                f14 = f11;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f13));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K && !this.O) {
                boolean z15 = this.L;
                org.telegram.ui.Components.d5 d5Var = this.I;
                if (!z15) {
                    if (d5Var != null) {
                        Drawable drawable = d5Var.f25372f[0];
                        if ((drawable instanceof org.telegram.ui.Components.f5) && (c2Var = ((org.telegram.ui.Components.f5) drawable).f26070k) != null && c2Var.J()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float d10 = this.J.d(z12);
                if ((!profileActivity.F1 || profileActivity.I1 != 2) && d10 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    lVar4 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    if (lVar4.getOccupyStatusBar()) {
                        f15 = org.telegram.messenger.i0.f16166m;
                    } else {
                        f15 = 0.0f;
                    }
                    lVar5 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    float B = c3.i0.B(lVar5.getHeight(), f15, f14, profileActivity.k4() + f15);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    l0 l0Var = profileActivity.X;
                    float[][] fArr = rh.j0.f47121a;
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    canvas2 = canvas;
                    rh.j0.c(canvas2, d5Var, measuredWidth, B, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.gg ggVar = profileActivity.f33829g5;
            if (ggVar != null) {
                org.telegram.ui.ActionBar.l actionBar = ((org.telegram.ui.ActionBar.k2) ggVar).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.E;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.N;
                    if (zg.h.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.R1) * f13), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f7 = 0.0f;
        }
        if (z10) {
            canvas2.restore();
        }
        if (profileActivity.Q5 > f7) {
            float f19 = i12;
            if (f19 < f16 && (hx0Var = profileActivity.N) != null && hx0Var.isAttachedToWindow()) {
                float y3 = (profileActivity.N.getY() + profileActivity.f33779a.getY()) - profileActivity.U5;
                if (y3 > f19) {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, profileActivity.f33957z0);
                    Paint paint3 = this.M;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f19, getMeasuredWidth(), Math.min(f16, y3), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f38594a) {
            this.f38594a = i10;
            this.f38595b.setColor(i10);
            invalidate();
            if (!this.f38596c) {
                this.P.f33788b1 = this.f38594a;
            }
        }
    }
}
