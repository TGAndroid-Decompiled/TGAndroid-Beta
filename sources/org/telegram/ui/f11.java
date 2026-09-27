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
public final class f11 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.o5 I;
    public final org.telegram.ui.Components.e6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f33387a;
    public final Paint f33388b;
    public boolean f33389c;
    public final org.telegram.ui.Components.e6 d;
    public int e;
    public int f33390f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f33391n;
    public int f33392r;
    public int f33393s;
    public int v;
    public float f33394w;
    public float f33395x;
    public RadialGradient f33396y;

    public f11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f33388b = new Paint();
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        this.d = new org.telegram.ui.Components.e6(this, 350L, srVar);
        this.h = new org.telegram.ui.Components.h5(this, 350L, srVar);
        this.f33391n = new org.telegram.ui.Components.h5(this, 350L, srVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.e6(this, 0L, 440L, srVar);
        new org.telegram.ui.Components.e6(this, 0L, 440L, srVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f33389c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.i6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.i6.I.q());
            this.f33390f = bgColor2;
            profileActivity.f31543c1 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.i6.l1(0.45f, i10);
            } else {
                this.G = wp0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.i6.l1(0.15f, wp0.w0(this.e));
            }
        } else {
            profileActivity.f31543c1 = this.f33387a;
            this.f33389c = false;
            int i11 = org.telegram.ui.ActionBar.i6.f19337s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0)));
                this.H = org.telegram.ui.ActionBar.i6.l1(0.35f, org.telegram.ui.ActionBar.i6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0)));
            } else {
                this.G = wp0.w0(org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0));
                this.H = org.telegram.ui.ActionBar.i6.l1(0.15f, wp0.w0(org.telegram.ui.ActionBar.i6.v0(i11, profileActivity.f31700z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f33391n.a(this.f33390f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.o5 o5Var = this.I;
        boolean z11 = true;
        o5Var.j(j3, true);
        o5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j3 == 0 || j3 == -1)) {
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
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        org.telegram.ui.ActionBar.l lVar3;
        float f7;
        Paint paint2;
        float f10;
        org.telegram.ui.Components.ch chVar;
        org.telegram.ui.ActionBar.l actionBar;
        org.telegram.ui.ActionBar.a0 a0Var;
        org.telegram.ui.ActionBar.l lVar4;
        float f11;
        org.telegram.ui.ActionBar.l lVar5;
        ai.l4 l4Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1;
        int i12 = (int) ((1.0f - profileActivity.E5) * f12);
        Paint paint3 = this.f33388b;
        if (i12 != 0) {
            paint3.setColor(this.f33387a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f33391n.a(this.f33390f, false);
            org.telegram.ui.Components.qh0 qh0Var = profileActivity.f31527a0;
            if (qh0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f33389c;
                if (qh0Var.S == null || qh0Var.Q != i13 || qh0Var.R != z10) {
                    qh0Var.Q = i13;
                    qh0Var.R = z10;
                    qh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f33396y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f33392r != a2 || this.f33393s != a10 || this.v != width) {
                this.f33394w = AndroidUtilities.dp(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                if (lVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                lVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                this.f33395x = lVar3.getTranslationY() + ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f33395x;
                float f14 = this.f33394w;
                this.f33393s = a10;
                this.f33392r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f33396y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f33396y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e = this.d.e(this.f33389c) * f7;
            if (e < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                paint2 = paint3;
            }
            if (e > 0.0f) {
                paint4.setAlpha((int) (e * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.o5 o5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (o5Var != null) {
                        Drawable drawable = o5Var.f26971f[0];
                        if ((drawable instanceof org.telegram.ui.Components.q5) && (l4Var = ((org.telegram.ui.Components.q5) drawable).f27595k) != null && l4Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    lVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    if (lVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    lVar5 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(lVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    l0 l0Var = profileActivity.Y;
                    float[][] fArr = yh.j0.f47595a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    yh.j0.c(canvas2, o5Var, measuredWidth, A, y3, rectF, 1.0f);
                    canvas2.restore();
                    chVar = profileActivity.f31576g5;
                    if (chVar != null && (a0Var = (actionBar = ((org.telegram.ui.ActionBar.o2) chVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        a0Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            chVar = profileActivity.f31576g5;
            if (chVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                a0Var.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.G1) {
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, profileActivity.f31700z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f31614m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f33387a) {
            this.f33387a = i10;
            this.f33388b.setColor(i10);
            invalidate();
            if (!this.f33389c) {
                this.N.f31543c1 = this.f33387a;
            }
        }
    }
}
