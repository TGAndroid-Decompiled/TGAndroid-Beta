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
public final class o11 extends FrameLayout {
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
    public int f39075a;
    public final Paint f39076b;
    public boolean f39077c;
    public final org.telegram.ui.Components.e6 d;
    public int f39078e;
    public int f39079f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f39080n;
    public int f39081r;
    public int f39082s;
    public int v;
    public float f39083w;
    public float f39084x;
    public RadialGradient f39085y;

    public o11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f39076b = new Paint();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.d = new org.telegram.ui.Components.e6(this, 350L, prVar);
        this.h = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.f39080n = new org.telegram.ui.Components.h5(this, 350L, prVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.e6(this, 0L, 440L, prVar);
        new org.telegram.ui.Components.e6(this, 0L, 440L, prVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f39077c = true;
            this.f39078e = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
            this.f39079f = bgColor2;
            profileActivity.f33873c1 = i0.a.d(0.25f, this.f39078e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.j6.l1(0.45f, i10);
            } else {
                this.G = bq0.w0(this.f39078e);
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(this.f39078e));
            }
        } else {
            profileActivity.f33873c1 = this.f39075a;
            this.f39077c = false;
            int i11 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0)));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.35f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0)));
            } else {
                this.G = bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0));
                this.H = org.telegram.ui.ActionBar.j6.l1(0.15f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f34031z0)));
            }
        }
        if (!z10) {
            this.h.a(this.f39078e, true);
            this.f39080n.a(this.f39079f, true);
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
        org.telegram.ui.Components.ch chVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        bi.y3 y3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1;
        int i12 = (int) ((1.0f - profileActivity.E5) * f12);
        Paint paint3 = this.f39076b;
        if (i12 != 0) {
            paint3.setColor(this.f39075a);
            int a2 = this.h.a(this.f39078e, false);
            int a10 = this.f39080n.a(this.f39079f, false);
            org.telegram.ui.Components.dh0 dh0Var = profileActivity.f33857a0;
            if (dh0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f39077c;
                if (dh0Var.S == null || dh0Var.Q != i13 || dh0Var.R != z10) {
                    dh0Var.Q = i13;
                    dh0Var.R = z10;
                    dh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f39085y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f39081r != a2 || this.f39082s != a10 || this.v != width) {
                this.f39083w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                this.f39084x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f39084x;
                float f14 = this.f39083w;
                this.f39082s = a10;
                this.f39081r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f39085y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f39085y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e7 = this.d.e(this.f39077c) * f7;
            if (e7 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                paint2 = paint3;
            }
            if (e7 > 0.0f) {
                paint4.setAlpha((int) (e7 * 255.0f));
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
                        Drawable drawable = o5Var.f28961f[0];
                        if ((drawable instanceof org.telegram.ui.Components.q5) && (y3Var = ((org.telegram.ui.Components.q5) drawable).f29584k) != null && y3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e10 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e10 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    float A = com.google.android.gms.internal.vision.e2.A(kVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    j0 j0Var = profileActivity.Y;
                    float[][] fArr = zh.j0.f52060a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(j0Var.getX(), j0Var.getY(), (j0Var.getScaleX() * j0Var.getWidth()) + j0Var.getX(), (j0Var.getScaleY() * j0Var.getHeight()) + j0Var.getY());
                    zh.j0.c(canvas2, o5Var, measuredWidth, A, y3, rectF, 1.0f);
                    canvas2.restore();
                    chVar = profileActivity.f33907g5;
                    if (chVar != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.n2) chVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            chVar = profileActivity.f33907g5;
            if (chVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.G1) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, profileActivity.f34031z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f33945m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f39075a) {
            this.f39075a = i10;
            this.f39076b.setColor(i10);
            invalidate();
            if (!this.f39077c) {
                this.N.f33873c1 = this.f39075a;
            }
        }
    }
}
