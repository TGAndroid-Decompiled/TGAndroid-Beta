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
public final class ow0 extends FrameLayout {
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final org.telegram.ui.Components.e5 J;
    public final org.telegram.ui.Components.u5 K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final ProfileActivity Q;
    public int f48364a;
    public final Paint f48365b;
    public boolean f48366c;
    public final org.telegram.ui.Components.u5 d;
    public int f48367e;
    public int f48368f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 f48369n;
    public int f48370r;
    public int f48371s;
    public int f48372w;
    public float f48373x;
    public float f48374y;

    public ow0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.f48365b = new Paint();
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.d = new org.telegram.ui.Components.u5(this, 350L, xqVar);
        this.h = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.f48369n = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.K = new org.telegram.ui.Components.u5(this, 0L, 440L, xqVar);
        new org.telegram.ui.Components.u5(this, 0L, 440L, xqVar);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.wo woVar, boolean z10) {
        ProfileActivity profileActivity = this.Q;
        if (woVar != null) {
            this.f48366c = true;
            this.f48367e = woVar.c(org.telegram.ui.ActionBar.k6.I.q());
            int d = woVar.d(org.telegram.ui.ActionBar.k6.I.q());
            this.f48368f = d;
            profileActivity.f41737c1 = i0.a.f(0.25f, this.f48367e, d);
            int i3 = woVar.f26237a;
            if (i3 != 0) {
                this.H = i3;
                this.I = org.telegram.ui.ActionBar.k6.r1(0.45f, i3);
            } else {
                this.H = cm0.B0(this.f48367e);
                this.I = org.telegram.ui.ActionBar.k6.r1(0.15f, cm0.B0(this.f48367e));
            }
        } else {
            profileActivity.f41737c1 = this.f48364a;
            this.f48366c = false;
            int i10 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0)) < 0.2f) {
                this.H = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0)));
                this.I = org.telegram.ui.ActionBar.k6.r1(0.35f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0)));
            } else {
                this.H = cm0.B0(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0));
                this.I = org.telegram.ui.ActionBar.k6.r1(0.15f, cm0.B0(org.telegram.ui.ActionBar.k6.w0(i10, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.f48367e, true);
            this.f48369n.a(this.f48368f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.e5 e5Var = this.J;
        boolean z11 = true;
        e5Var.j(j10, true);
        e5Var.k(Integer.valueOf(this.H));
        if (!this.L && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.L = z11;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        boolean z10;
        Canvas canvas2;
        float f10;
        mv0 mv0Var;
        float f11;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.ui.ActionBar.k kVar3;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.k kVar4;
        float f16;
        org.telegram.ui.ActionBar.k kVar5;
        ei.c3 c3Var;
        pi.q qVar;
        boolean z11 = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z11) {
            qVar = ((org.telegram.ui.ActionBar.d2) profileActivity).glassEngine;
            qVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        float f17 = currentActionBarHeight + i3 + profileActivity.Q1 + profileActivity.T1;
        int i11 = (int) ((1.0f - profileActivity.R5) * f17);
        boolean z12 = true;
        if (profileActivity.B5 > 0.0f && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i11, (int) ((1.0f - profileActivity.B5) * 255.0f));
        }
        if (i11 != 0) {
            int i12 = this.f48364a;
            Paint paint = this.f48365b;
            paint.setColor(i12);
            int a10 = this.h.a(this.f48367e, false);
            int a11 = this.f48369n.a(this.f48368f, false);
            org.telegram.ui.Components.gf0 gf0Var = profileActivity.f41720a0;
            if (gf0Var != null) {
                int i13 = this.I;
                boolean z13 = this.f48366c;
                f11 = 1.0f;
                if (gf0Var.Q == null || gf0Var.O != i13 || gf0Var.P != z13) {
                    gf0Var.O = i13;
                    gf0Var.P = z13;
                    gf0Var.g();
                }
            } else {
                f11 = 1.0f;
            }
            org.telegram.ui.Components.cg0 cg0Var = profileActivity.f41736c0;
            if (cg0Var != null) {
                cg0Var.d(this.I, this.f48366c);
            }
            org.telegram.ui.Components.kf0 kf0Var = profileActivity.J5;
            if (kf0Var != null) {
                int i14 = this.I;
                boolean z14 = this.f48366c;
                if (kf0Var.f35391i != i14 || kf0Var.f35392j != z14) {
                    kf0Var.f35391i = i14;
                    kf0Var.f35392j = z14;
                    kf0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f10 = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.f48370r == a10 && this.f48371s == a11 && this.f48372w == width) {
                f12 = 2.0f;
            } else {
                this.f48373x = org.telegram.messenger.g0.L(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = org.telegram.messenger.g0.f22602m;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                this.f48374y = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (org.telegram.messenger.g0.f22607p * 21.0f));
                this.f48372w = width;
                float f18 = this.f48374y;
                f12 = 2.0f;
                float f19 = this.f48373x;
                this.f48371s = a11;
                this.f48370r = a10;
                RadialGradient radialGradient2 = new RadialGradient(width, (f19 / 2.0f) + f18, f19, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            if (profileActivity.J1 == 0) {
                f13 = f11;
            } else {
                f13 = profileActivity.S1;
            }
            float d = this.d.d(this.f48366c) * f13;
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
            if (this.L && !this.P) {
                boolean z15 = this.M;
                org.telegram.ui.Components.e5 e5Var = this.J;
                if (!z15) {
                    if (e5Var != null) {
                        Drawable drawable = e5Var.f33286f[0];
                        if ((drawable instanceof org.telegram.ui.Components.g5) && (c3Var = ((org.telegram.ui.Components.g5) drawable).f33971k) != null && c3Var.J()) {
                            this.M = true;
                        }
                    }
                    z12 = false;
                }
                float d10 = this.K.d(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d10 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    kVar4 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f16 = org.telegram.messenger.g0.f22602m;
                    } else {
                        f16 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                    float z16 = com.google.android.recaptcha.internal.a.z(kVar5.getHeight(), f16, f15, profileActivity.k4() + f16);
                    int measuredWidth = getMeasuredWidth();
                    float L3 = profileActivity.L3();
                    l0 l0Var = profileActivity.Y;
                    float[][] fArr = ci.b1.f4854a;
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    canvas2 = canvas;
                    ci.b1.c(canvas2, e5Var, measuredWidth, z16, L3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            org.telegram.ui.Components.ig igVar = profileActivity.f41777h5;
            if (igVar != null) {
                org.telegram.ui.ActionBar.k actionBar = ((org.telegram.ui.ActionBar.d2) igVar).getActionBar();
                org.telegram.ui.ActionBar.x xVar = actionBar.F;
                View view = (View) actionBar.getParent();
                if (xVar != null && view != null) {
                    RectF rectF2 = this.O;
                    if (kh.k.c(xVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, xVar.getMeasuredWidth(), xVar.getMeasuredHeight(), (int) ((f11 - profileActivity.S1) * f14), 31);
                        xVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f10 = 0.0f;
        }
        if (z10) {
            canvas2.restore();
        }
        if (profileActivity.R5 > f10) {
            float f20 = i11;
            if (f20 < f17 && (mv0Var = profileActivity.O) != null && mv0Var.isAttachedToWindow()) {
                float y9 = (profileActivity.O.getY() + profileActivity.f41719a.getY()) - profileActivity.V5;
                if (y9 > f20) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, profileActivity.A0);
                    Paint paint3 = this.N;
                    paint3.setColor(w02);
                    canvas2.drawRect(0.0f, f20, getMeasuredWidth(), Math.min(f17, y9), paint3);
                }
            }
        }
    }

    @Override
    public final void setBackgroundColor(int i3) {
        if (i3 != this.f48364a) {
            this.f48364a = i3;
            this.f48365b.setColor(i3);
            invalidate();
            if (!this.f48366c) {
                this.Q.f41737c1 = this.f48364a;
            }
        }
    }
}
