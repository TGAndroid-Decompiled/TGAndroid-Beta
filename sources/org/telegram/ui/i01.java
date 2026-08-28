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
public final class i01 extends FrameLayout {
    public final Matrix A;
    public final Paint B;
    public int C;
    public int D;
    public final org.telegram.ui.Components.i5 E;
    public final org.telegram.ui.Components.y5 F;
    public boolean G;
    public boolean H;
    public final Rect I;
    public final ProfileActivity J;
    public int f38973a;
    public final Paint f38974b;
    public boolean f38975c;
    public final org.telegram.ui.Components.y5 d;
    public int f38976e;
    public int f38977f;
    public final org.telegram.ui.Components.b5 h;
    public final org.telegram.ui.Components.b5 f38978n;
    public int f38979r;
    public int f38980s;
    public int v;
    public float f38981w;
    public float f38982x;
    public RadialGradient f38983y;

    public i01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.J = profileActivity;
        this.f38974b = new Paint();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.d = new org.telegram.ui.Components.y5(this, 350L, grVar);
        this.h = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.f38978n = new org.telegram.ui.Components.b5(this, 350L, grVar);
        this.A = new Matrix();
        this.B = new Paint(1);
        this.E = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.F = new org.telegram.ui.Components.y5(this, 0L, 440L, grVar);
        new org.telegram.ui.Components.y5(this, 0L, 440L, grVar);
        this.I = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.J;
        if (peerColor != null) {
            this.f38975c = true;
            this.f38976e = peerColor.getBgColor1(org.telegram.ui.ActionBar.f6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.f6.I.q());
            this.f38977f = bgColor2;
            profileActivity.Y0 = i0.a.d(0.25f, this.f38976e, bgColor2);
            int i9 = peerColor.patternColor;
            if (i9 != 0) {
                this.C = i9;
                this.D = org.telegram.ui.ActionBar.f6.l1(0.45f, i9);
            } else {
                this.C = zo0.t0(this.f38976e);
                this.D = org.telegram.ui.ActionBar.f6.l1(0.15f, zo0.t0(this.f38976e));
            }
        } else {
            profileActivity.Y0 = this.f38973a;
            this.f38975c = false;
            int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0)) > 0.8f) {
                this.C = -1;
                this.D = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0)) < 0.2f) {
                this.C = org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0)));
                this.D = org.telegram.ui.ActionBar.f6.l1(0.35f, org.telegram.ui.ActionBar.f6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0)));
            } else {
                this.C = zo0.t0(org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0));
                this.D = org.telegram.ui.ActionBar.f6.l1(0.15f, zo0.t0(org.telegram.ui.ActionBar.f6.v0(i10, profileActivity.f36064v0)));
            }
        }
        if (!z10) {
            this.h.a(this.f38976e, true);
            this.f38978n.a(this.f38977f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.i5 i5Var = this.E;
        boolean z11 = true;
        i5Var.j(j10, true);
        i5Var.k(Integer.valueOf(this.C));
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
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.ui.ActionBar.k kVar3;
        float f10;
        Paint paint2;
        float f11;
        org.telegram.ui.Components.rg rgVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f12;
        org.telegram.ui.ActionBar.k kVar5;
        ih.z2 z2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.J;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        float f13 = currentActionBarHeight + i9 + profileActivity.M1 + profileActivity.P1;
        int i11 = (int) ((1.0f - profileActivity.A5) * f13);
        Paint paint3 = this.f38974b;
        if (i11 != 0) {
            paint3.setColor(this.f38973a);
            int a2 = this.h.a(this.f38976e, false);
            int a3 = this.f38978n.a(this.f38977f, false);
            org.telegram.ui.Components.pg0 pg0Var = profileActivity.W;
            if (pg0Var != null) {
                int i12 = this.D;
                boolean z10 = this.f38975c;
                if (pg0Var.O == null || pg0Var.M != i12 || pg0Var.N != z10) {
                    pg0Var.M = i12;
                    pg0Var.N = z10;
                    pg0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f38983y;
            Paint paint4 = this.B;
            if (radialGradient == null || this.f38979r != a2 || this.f38980s != a3 || this.v != width) {
                this.f38981w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                this.f38982x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f14 = this.f38982x;
                float f15 = this.f38981w;
                this.f38980s = a3;
                this.f38979r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f15 / 2.0f) + f14, f15, new int[]{a3, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f38983y = radialGradient2;
                radialGradient2.setLocalMatrix(this.A);
                paint4.setShader(this.f38983y);
            }
            if (profileActivity.F1 == 0) {
                f10 = 1.0f;
            } else {
                f10 = profileActivity.O1;
            }
            float e10 = this.d.e(this.f38975c) * f10;
            if (e10 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint2);
            } else {
                paint2 = paint3;
            }
            if (e10 > 0.0f) {
                paint4.setAlpha((int) (e10 * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i11, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.G) {
                boolean z11 = this.H;
                org.telegram.ui.Components.i5 i5Var = this.E;
                boolean z12 = true;
                if (!z11) {
                    if (i5Var != null) {
                        Drawable drawable = i5Var.f29319f[0];
                        if ((drawable instanceof org.telegram.ui.Components.k5) && (z2Var = ((org.telegram.ui.Components.k5) drawable).f29951k) != null && z2Var.hasImageLoaded()) {
                            this.H = true;
                        }
                    }
                    z12 = false;
                }
                float e11 = this.F.e(z12);
                if ((!profileActivity.C1 || profileActivity.F1 != 2) && e11 > 0.0f && profileActivity.U != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i11);
                    kVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f12 = AndroidUtilities.statusBarHeight;
                    } else {
                        f12 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float A = e2.c.A(kVar5.getHeight(), f12, 2.0f, profileActivity.U3() + f12);
                    int measuredWidth = getMeasuredWidth();
                    float y32 = profileActivity.y3();
                    m0 m0Var = profileActivity.U;
                    float[][] fArr = gh.y0.f9193a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f11 = 1.0f;
                    rectF.set(m0Var.getX(), m0Var.getY(), (m0Var.getScaleX() * m0Var.getWidth()) + m0Var.getX(), (m0Var.getScaleY() * m0Var.getHeight()) + m0Var.getY());
                    gh.y0.c(canvas2, i5Var, measuredWidth, A, y32, rectF, 1.0f);
                    canvas2.restore();
                    rgVar = profileActivity.f35938c5;
                    if (rgVar != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.o2) rgVar).getActionBar()).A) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f11 - profileActivity.O1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f11 = 1.0f;
            rgVar = profileActivity.f35938c5;
            if (rgVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f11 - profileActivity.O1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i11 != f13 && !profileActivity.C1) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, profileActivity.f36064v0));
            this.I.set(0, i11, getMeasuredWidth(), (int) f13);
            profileActivity.f35982i5.J(canvas2, getY(), this.I, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i9) {
        if (i9 != this.f38973a) {
            this.f38973a = i9;
            this.f38974b.setColor(i9);
            invalidate();
            if (!this.f38975c) {
                this.J.Y0 = this.f38973a;
            }
        }
    }
}
