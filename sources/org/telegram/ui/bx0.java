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
public final class bx0 extends FrameLayout {
    public RadialGradient D;
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.f5 I;
    public final org.telegram.ui.Components.v5 J;
    public boolean K;
    public boolean L;
    public final Paint M;
    public final RectF N;
    public boolean O;
    public final ProfileActivity P;
    public int f44163a;
    public final Paint f44164b;
    public boolean f44165c;
    public final org.telegram.ui.Components.v5 d;
    public int f44166e;
    public int f44167f;
    public final org.telegram.ui.Components.y4 h;
    public final org.telegram.ui.Components.y4 f44168n;
    public int f44169r;
    public int f44170s;
    public int f44171w;
    public float f44172x;
    public float f44173y;

    public bx0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P = profileActivity;
        this.f44164b = new Paint();
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.d = new org.telegram.ui.Components.v5(this, 350L, wqVar);
        this.h = new org.telegram.ui.Components.y4(this, 350L, wqVar);
        this.f44168n = new org.telegram.ui.Components.y4(this, 350L, wqVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.v5(this, 0L, 440L, wqVar);
        new org.telegram.ui.Components.v5(this, 0L, 440L, wqVar);
        this.M = new Paint();
        this.N = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.fp fpVar, boolean z9) {
        ProfileActivity profileActivity = this.P;
        if (fpVar != null) {
            this.f44165c = true;
            this.f44166e = fpVar.c(org.telegram.ui.ActionBar.m6.I.q());
            int d = fpVar.d(org.telegram.ui.ActionBar.m6.I.q());
            this.f44167f = d;
            profileActivity.f41699b1 = i0.a.f(0.25f, this.f44166e, d);
            int i7 = fpVar.f22453a;
            if (i7 != 0) {
                this.G = i7;
                this.H = org.telegram.ui.ActionBar.m6.r1(0.45f, i7);
            } else {
                this.G = km0.B0(this.f44166e);
                this.H = org.telegram.ui.ActionBar.m6.r1(0.15f, km0.B0(this.f44166e));
            }
        } else {
            profileActivity.f41699b1 = this.f44163a;
            this.f44165c = false;
            int i10 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0)));
                this.H = org.telegram.ui.ActionBar.m6.r1(0.35f, org.telegram.ui.ActionBar.m6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0)));
            } else {
                this.G = km0.B0(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0));
                this.H = org.telegram.ui.ActionBar.m6.r1(0.15f, km0.B0(org.telegram.ui.ActionBar.m6.w0(i10, profileActivity.f41867z0)));
            }
        }
        if (!z9) {
            this.h.a(this.f44166e, true);
            this.f44168n.a(this.f44167f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z9) {
        org.telegram.ui.Components.f5 f5Var = this.I;
        boolean z10 = true;
        f5Var.j(j3, true);
        f5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
            z10 = false;
        }
        this.K = z10;
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
        int i7;
        boolean z9;
        Canvas canvas2;
        float f10;
        yv0 yv0Var;
        float f11;
        org.telegram.ui.ActionBar.l lVar2;
        int i10;
        org.telegram.ui.ActionBar.l lVar3;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.l lVar4;
        float f16;
        org.telegram.ui.ActionBar.l lVar5;
        di.z2 z2Var;
        oi.q qVar;
        boolean z10 = this.O;
        ProfileActivity profileActivity = this.P;
        if (!z10) {
            qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        float f17 = currentActionBarHeight + i7 + profileActivity.P1 + profileActivity.S1;
        int i11 = (int) ((1.0f - profileActivity.S5) * f17);
        boolean z11 = true;
        if (profileActivity.C5 > 0.0f && i11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i11, (int) ((1.0f - profileActivity.C5) * 255.0f));
        }
        if (i11 != 0) {
            int i12 = this.f44163a;
            Paint paint = this.f44164b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f44166e, false);
            int a11 = this.f44168n.a(this.f44167f, false);
            org.telegram.ui.Components.ef0 ef0Var = profileActivity.Z;
            if (ef0Var != null) {
                int i13 = this.H;
                boolean z12 = this.f44165c;
                f11 = 1.0f;
                if (ef0Var.P == null || ef0Var.N != i13 || ef0Var.O != z12) {
                    ef0Var.N = i13;
                    ef0Var.O = z12;
                    ef0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.zf0 zf0Var = profileActivity.f41698b0;
            if (zf0Var != null) {
                zf0Var.d(this.H, this.f44165c);
            }
            org.telegram.ui.Components.if0 if0Var = profileActivity.K5;
            if (if0Var != null) {
                int i14 = this.H;
                boolean z13 = this.f44165c;
                if (if0Var.f34611i != i14 || if0Var.f34612j != z13) {
                    if0Var.f34611i = i14;
                    if0Var.f34612j = z13;
                    if0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.D;
            f10 = 0.0f;
            Paint paint2 = this.F;
            if (radialGradient != null && this.f44169r == a10 && this.f44170s == a11 && this.f44171w == width) {
                f12 = 2.0f;
            } else {
                this.f44172x = org.telegram.messenger.g0.L(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                if (lVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22561m;
                } else {
                    i10 = 0;
                }
                lVar3 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                this.f44173y = lVar3.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f22566p * 21.0f));
                this.f44171w = width;
                float f18 = this.f44173y;
                f12 = 2.0f;
                float f19 = this.f44172x;
                this.f44170s = a11;
                this.f44169r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f19 / 2.0f) + f18, f19, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.D = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.D);
            }
            if (profileActivity.I1 == 0) {
                f13 = f11;
            } else {
                f13 = profileActivity.R1;
            }
            float d = this.d.d(this.f44165c) * f13;
            if (d < f11) {
                f14 = 255.0f;
                f15 = f12;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint);
            } else {
                f14 = 255.0f;
                f15 = f12;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f14));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K && !this.O) {
                boolean z14 = this.L;
                org.telegram.ui.Components.f5 f5Var = this.I;
                if (!z14) {
                    if (f5Var != null) {
                        Drawable drawable = f5Var.f33464f[0];
                        if ((drawable instanceof org.telegram.ui.Components.h5) && (z2Var = ((org.telegram.ui.Components.h5) drawable).f34176k) != null && z2Var.J()) {
                            this.L = true;
                        }
                    }
                    z11 = false;
                }
                float d2 = this.J.d(z11);
                if ((!profileActivity.F1 || profileActivity.I1 != 2) && d2 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    lVar4 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    if (lVar4.getOccupyStatusBar()) {
                        f16 = org.telegram.messenger.g0.f22561m;
                    } else {
                        f16 = 0.0f;
                    }
                    lVar5 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    float A = com.google.android.recaptcha.internal.a.A(lVar5.getHeight(), f16, f15, profileActivity.k4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    k0 k0Var = profileActivity.X;
                    float[][] fArr = bi.i1.f4023a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    canvas2 = canvas;
                    bi.i1.c(canvas2, f5Var, measuredWidth, A, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.jg jgVar = profileActivity.f41754i5;
            if (jgVar != null) {
                org.telegram.ui.ActionBar.l actionBar = ((org.telegram.ui.ActionBar.f2) jgVar).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.E;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.N;
                    if (jh.k.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f11 - profileActivity.R1) * f14), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z9) {
            canvas2.restore();
        }
        if (profileActivity.S5 > f10) {
            float f20 = i11;
            if (f20 < f17 && (yv0Var = profileActivity.N) != null && yv0Var.isAttachedToWindow()) {
                float y10 = (profileActivity.N.getY() + profileActivity.f41689a.getY()) - profileActivity.W5;
                if (y10 > f20) {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, profileActivity.f41867z0);
                    Paint paint3 = this.M;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y10), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i7) {
        if (i7 != this.f44163a) {
            this.f44163a = i7;
            this.f44164b.setColor(i7);
            invalidate();
            if (!this.f44165c) {
                this.P.f41699b1 = this.f44163a;
            }
        }
    }
}
