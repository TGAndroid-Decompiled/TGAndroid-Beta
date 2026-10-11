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
public final class k11 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.q5 I;
    public final org.telegram.ui.Components.g6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final ProfileActivity N;
    public int f39163a;
    public final Paint f39164b;
    public boolean f39165c;
    public final org.telegram.ui.Components.g6 d;
    public int f39166e;
    public int f39167f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f39168n;
    public int f39169r;
    public int f39170s;
    public int v;
    public float f39171w;
    public float f39172x;
    public RadialGradient f39173y;

    public k11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f39164b = new Paint();
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.d = new org.telegram.ui.Components.g6(this, 350L, isVar);
        this.h = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.f39168n = new org.telegram.ui.Components.j5(this, 350L, isVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.g6(this, 0L, 440L, isVar);
        new org.telegram.ui.Components.g6(this, 0L, 440L, isVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f39165c = true;
            this.f39166e = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
            this.f39167f = bgColor2;
            profileActivity.f34256c1 = i0.a.d(0.25f, this.f39166e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.h6.m1(0.45f, i10);
            } else {
                this.G = zp0.w0(this.f39166e);
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, zp0.w0(this.f39166e));
            }
        } else {
            profileActivity.f34256c1 = this.f39163a;
            this.f39165c = false;
            int i11 = org.telegram.ui.ActionBar.h6.f21065s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0)));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.35f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0)));
            } else {
                this.G = zp0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, zp0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34414z0)));
            }
        }
        if (!z10) {
            this.h.a(this.f39166e, true);
            this.f39168n.a(this.f39167f, true);
        }
        invalidate();
    }

    public final void b(long j3, boolean z10) {
        org.telegram.ui.Components.q5 q5Var = this.I;
        boolean z11 = true;
        q5Var.j(j3, true);
        q5Var.k(Integer.valueOf(this.G));
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
        org.telegram.ui.Components.eh ehVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f11;
        org.telegram.ui.ActionBar.k kVar5;
        ai.m4 m4Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f12 = currentActionBarHeight + i10 + profileActivity.Q1 + profileActivity.T1;
        int i12 = (int) ((1.0f - profileActivity.E5) * f12);
        Paint paint3 = this.f39164b;
        if (i12 != 0) {
            paint3.setColor(this.f39163a);
            int a2 = this.h.a(this.f39166e, false);
            int a10 = this.f39168n.a(this.f39167f, false);
            org.telegram.ui.Components.ki0 ki0Var = profileActivity.f34240a0;
            if (ki0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f39165c;
                if (ki0Var.S == null || ki0Var.Q != i13 || ki0Var.R != z10) {
                    ki0Var.Q = i13;
                    ki0Var.R = z10;
                    ki0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f39173y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f39169r != a2 || this.f39170s != a10 || this.v != width) {
                this.f39171w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                this.f39172x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f39172x;
                float f14 = this.f39171w;
                this.f39170s = a10;
                this.f39169r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f39173y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f39173y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e7 = this.d.e(this.f39165c) * f7;
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
                org.telegram.ui.Components.q5 q5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (q5Var != null) {
                        Drawable drawable = q5Var.f29998f[0];
                        if ((drawable instanceof org.telegram.ui.Components.s5) && (m4Var = ((org.telegram.ui.Components.s5) drawable).f30634k) != null && m4Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e10 = this.J.e(z12);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && e10 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f11 = AndroidUtilities.statusBarHeight;
                    } else {
                        f11 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                    float z13 = com.google.android.gms.internal.vision.e2.z(kVar5.getHeight(), f11, 2.0f, profileActivity.U3() + f11);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    j0 j0Var = profileActivity.Y;
                    float[][] fArr = yh.i0.f52748a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(j0Var.getX(), j0Var.getY(), (j0Var.getScaleX() * j0Var.getWidth()) + j0Var.getX(), (j0Var.getScaleY() * j0Var.getHeight()) + j0Var.getY());
                    yh.i0.c(canvas2, q5Var, measuredWidth, z13, y3, rectF, 1.0f);
                    canvas2.restore();
                    ehVar = profileActivity.f34290g5;
                    if (ehVar != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.m2) ehVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            ehVar = profileActivity.f34290g5;
            if (ehVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                yVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f12 && !profileActivity.G1) {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, profileActivity.f34414z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f34328m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f39163a) {
            this.f39163a = i10;
            this.f39164b.setColor(i10);
            invalidate();
            if (!this.f39165c) {
                this.N.f34256c1 = this.f39163a;
            }
        }
    }
}
