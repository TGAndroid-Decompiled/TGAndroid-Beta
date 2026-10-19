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
public final class p01 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.p5 I;
    public final org.telegram.ui.Components.f6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f40035a;
    public final Paint f40036b;
    public boolean f40037c;
    public final org.telegram.ui.Components.f6 d;
    public int e;
    public int f40038f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 f40039n;
    public int f40040r;
    public int f40041s;
    public int v;
    public float f40042w;
    public float f40043x;
    public RadialGradient f40044y;

    public p01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f40036b = new Paint();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.d = new org.telegram.ui.Components.f6(this, 350L, bsVar);
        this.h = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f40039n = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.f6(this, 0L, 440L, bsVar);
        new org.telegram.ui.Components.f6(this, 0L, 440L, bsVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f40037c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
            this.f40038f = bgColor2;
            profileActivity.f33598d1 = i0.a.f(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.h6.m1(0.45f, i10);
            } else {
                this.G = ip0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, ip0.w0(this.e));
            }
        } else {
            profileActivity.f33598d1 = this.f40035a;
            this.f40037c = false;
            int i11 = org.telegram.ui.ActionBar.h6.f21266s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.35f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
            } else {
                this.G = ip0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, ip0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f40039n.a(this.f40038f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.p5 p5Var = this.I;
        boolean z11 = true;
        p5Var.j(j10, true);
        p5Var.k(Integer.valueOf(this.G));
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
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        float f7;
        Paint paint2;
        float f10;
        org.telegram.ui.Components.bh bhVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        ci.g3 g3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.R1 + profileActivity.U1;
        int i12 = (int) ((1.0f - profileActivity.G5) * f12);
        Paint paint3 = this.f40036b;
        if (i12 != 0) {
            paint3.setColor(this.f40035a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f40039n.a(this.f40038f, false);
            org.telegram.ui.Components.yh0 yh0Var = profileActivity.f33575a0;
            if (yh0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f40037c;
                if (yh0Var.S == null || yh0Var.Q != i13 || yh0Var.R != z10) {
                    yh0Var.Q = i13;
                    yh0Var.R = z10;
                    yh0Var.g();
                }
            }
            org.telegram.ui.Components.ri0 ri0Var = profileActivity.f33590c0;
            if (ri0Var != null) {
                ri0Var.f(this.H, this.f40037c);
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f40044y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f40040r != a2 || this.f40041s != a10 || this.v != width) {
                this.f40042w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                this.f40043x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f40043x;
                float f14 = this.f40042w;
                this.f40041s = a10;
                this.f40040r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f40044y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f40044y);
            }
            if (profileActivity.K1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.T1;
            }
            float e = this.d.e(this.f40037c) * f7;
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
                org.telegram.ui.Components.p5 p5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (p5Var != null) {
                        Drawable drawable = p5Var.f29165f[0];
                        if ((drawable instanceof org.telegram.ui.Components.r5) && (g3Var = ((org.telegram.ui.Components.r5) drawable).f29851k) != null && g3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.H1 || profileActivity.K1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    float z13 = com.google.android.gms.internal.play_billing.k3.z(kVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    m0 m0Var = profileActivity.Y;
                    float[][] fArr = ai.m1.f1803a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(m0Var.getX(), m0Var.getY(), (m0Var.getScaleX() * m0Var.getWidth()) + m0Var.getX(), (m0Var.getScaleY() * m0Var.getHeight()) + m0Var.getY());
                    ai.m1.c(canvas2, p5Var, measuredWidth, z13, y3, rectF, 1.0f);
                    canvas2.restore();
                    bhVar = profileActivity.f33638i5;
                    if (bhVar != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.n2) bhVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.T1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            bhVar = profileActivity.f33638i5;
            if (bhVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.T1) * 255.0f), 31);
                yVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.H1) {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, profileActivity.A0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f33678o5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f40035a) {
            this.f40035a = i10;
            this.f40036b.setColor(i10);
            invalidate();
            if (!this.f40037c) {
                this.N.f33598d1 = this.f40035a;
            }
        }
    }
}
