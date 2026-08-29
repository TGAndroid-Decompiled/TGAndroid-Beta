package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class j01 extends FrameLayout {
    public final Matrix A;
    public final Paint B;
    public int C;
    public int D;
    public final org.telegram.ui.Components.n5 E;
    public final org.telegram.ui.Components.d6 F;
    public boolean G;
    public boolean H;
    public final Rect I;
    public final ProfileActivity J;
    public int f39382a;
    public final Paint f39383b;
    public boolean f39384c;
    public final org.telegram.ui.Components.d6 d;
    public int f39385e;
    public int f39386f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f39387n;
    public int f39388r;
    public int f39389s;
    public int v;
    public float f39390w;
    public float f39391x;
    public RadialGradient f39392y;

    public j01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.J = profileActivity;
        this.f39383b = new Paint();
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, jrVar);
        this.h = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.f39387n = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.A = new Matrix();
        this.B = new Paint(1);
        this.E = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.F = new org.telegram.ui.Components.d6(this, 0L, 440L, jrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, jrVar);
        this.I = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.J;
        if (peerColor != null) {
            this.f39384c = true;
            this.f39385e = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
            this.f39386f = bgColor2;
            profileActivity.Y0 = i0.a.d(0.25f, this.f39385e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.C = i10;
                this.D = org.telegram.ui.ActionBar.g6.l1(0.45f, i10);
            } else {
                this.C = yo0.u0(this.f39385e);
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, yo0.u0(this.f39385e));
            }
        } else {
            profileActivity.Y0 = this.f39382a;
            this.f39384c = false;
            int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0)) > 0.8f) {
                this.C = -1;
                this.D = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0)) < 0.2f) {
                this.C = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0)));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0)));
            } else {
                this.C = yo0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, yo0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36129v0)));
            }
        }
        if (!z10) {
            this.h.a(this.f39385e, true);
            this.f39387n.a(this.f39386f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.E;
        boolean z11 = true;
        n5Var.j(j10, true);
        n5Var.k(Integer.valueOf(this.C));
        if (!this.G && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.G = z11;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        org.telegram.ui.ActionBar.l lVar3;
        float f9;
        Paint paint2;
        float f10;
        org.telegram.ui.Components.ug ugVar;
        org.telegram.ui.ActionBar.l actionBar;
        org.telegram.ui.ActionBar.a0 a0Var;
        org.telegram.ui.ActionBar.l lVar4;
        float f11;
        org.telegram.ui.ActionBar.l lVar5;
        lh.x2 x2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.J;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.M1 + profileActivity.P1;
        int i12 = (int) ((1.0f - profileActivity.A5) * f12);
        Paint paint3 = this.f39383b;
        if (i12 != 0) {
            paint3.setColor(this.f39382a);
            int a2 = this.h.a(this.f39385e, false);
            int a10 = this.f39387n.a(this.f39386f, false);
            org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
            if (zg0Var != null) {
                int i13 = this.D;
                boolean z10 = this.f39384c;
                if (zg0Var.O == null || zg0Var.M != i13 || zg0Var.N != z10) {
                    zg0Var.M = i13;
                    zg0Var.N = z10;
                    zg0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f39392y;
            Paint paint4 = this.B;
            if (radialGradient == null || this.f39388r != a2 || this.f39389s != a10 || this.v != width) {
                this.f39390w = AndroidUtilities.dp(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (lVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                lVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                this.f39391x = lVar3.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f39391x;
                float f14 = this.f39390w;
                this.f39389s = a10;
                this.f39388r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f39392y = radialGradient2;
                radialGradient2.setLocalMatrix(this.A);
                paint4.setShader(this.f39392y);
            }
            if (profileActivity.F1 == 0) {
                f9 = 1.0f;
            } else {
                f9 = profileActivity.O1;
            }
            float e10 = this.d.e(this.f39384c) * f9;
            if (e10 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                paint2 = paint3;
            }
            if (e10 > 0.0f) {
                paint4.setAlpha((int) (e10 * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.G) {
                boolean z11 = this.H;
                org.telegram.ui.Components.n5 n5Var = this.E;
                boolean z12 = true;
                if (!z11) {
                    if (n5Var != null) {
                        Drawable drawable = n5Var.f30849f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (x2Var = ((org.telegram.ui.Components.p5) drawable).f31593k) != null && x2Var.hasImageLoaded()) {
                            this.H = true;
                        }
                    }
                    z12 = false;
                }
                float e11 = this.F.e(z12);
                if ((!profileActivity.C1 || profileActivity.F1 != 2) && e11 > 0.0f && profileActivity.U != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    lVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (lVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    lVar5 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float A = com.google.android.recaptcha.internal.a.A(lVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y32 = profileActivity.y3();
                    n0 n0Var = profileActivity.U;
                    float[][] fArr = jh.x0.f13047a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(n0Var.getX(), n0Var.getY(), (n0Var.getScaleX() * n0Var.getWidth()) + n0Var.getX(), (n0Var.getScaleY() * n0Var.getHeight()) + n0Var.getY());
                    jh.x0.c(canvas2, n5Var, measuredWidth, A, y32, rectF, 1.0f);
                    canvas2.restore();
                    ugVar = profileActivity.f36004c5;
                    if (ugVar != null && (a0Var = (actionBar = ((org.telegram.ui.ActionBar.o2) ugVar).getActionBar()).A) != null) {
                        int save = canvas2.save();
                        canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f10 - profileActivity.O1) * 255.0f), 31);
                        a0Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            ugVar = profileActivity.f36004c5;
            if (ugVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f10 - profileActivity.O1) * 255.0f), 31);
                a0Var.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.C1) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, profileActivity.f36129v0));
            this.I.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f36047i5.J(canvas2, getY(), this.I, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f39382a) {
            this.f39382a = i10;
            this.f39383b.setColor(i10);
            invalidate();
            if (!this.f39384c) {
                this.J.Y0 = this.f39382a;
            }
        }
    }
}
