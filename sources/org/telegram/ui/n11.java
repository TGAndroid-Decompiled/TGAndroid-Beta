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
public final class n11 extends FrameLayout {
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
    public int f40179a;
    public final Paint f40180b;
    public boolean f40181c;
    public final org.telegram.ui.Components.g6 d;
    public int f40182e;
    public int f40183f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f40184n;
    public int f40185r;
    public int f40186s;
    public int v;
    public float f40187w;
    public float f40188x;
    public RadialGradient f40189y;

    public n11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.f40180b = new Paint();
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.h;
        this.d = new org.telegram.ui.Components.g6(this, 350L, jsVar);
        this.h = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.f40184n = new org.telegram.ui.Components.j5(this, 350L, jsVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.q5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.g6(this, 0L, 440L, jsVar);
        new org.telegram.ui.Components.g6(this, 0L, 440L, jsVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.f40181c = true;
            this.f40182e = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
            this.f40183f = bgColor2;
            profileActivity.f34067c1 = i0.a.d(0.25f, this.f40182e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.h6.m1(0.45f, i10);
            } else {
                this.G = cq0.w0(this.f40182e);
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, cq0.w0(this.f40182e));
            }
        } else {
            profileActivity.f34067c1 = this.f40179a;
            this.f40181c = false;
            int i11 = org.telegram.ui.ActionBar.h6.f20840s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0)));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.35f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0)));
            } else {
                this.G = cq0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, cq0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.f34225z0)));
            }
        }
        if (!z10) {
            this.h.a(this.f40182e, true);
            this.f40184n.a(this.f40183f, true);
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
        org.telegram.ui.Components.gh ghVar;
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
        Paint paint3 = this.f40180b;
        if (i12 != 0) {
            paint3.setColor(this.f40179a);
            int a2 = this.h.a(this.f40182e, false);
            int a10 = this.f40184n.a(this.f40183f, false);
            org.telegram.ui.Components.li0 li0Var = profileActivity.f34051a0;
            if (li0Var != null) {
                int i13 = this.H;
                boolean z10 = this.f40181c;
                if (li0Var.S == null || li0Var.Q != i13 || li0Var.R != z10) {
                    li0Var.Q = i13;
                    li0Var.R = z10;
                    li0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f40189y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.f40185r != a2 || this.f40186s != a10 || this.v != width) {
                this.f40187w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                this.f40188x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f13 = this.f40188x;
                float f14 = this.f40187w;
                this.f40186s = a10;
                this.f40185r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f14 / 2.0f) + f13, f14, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f40189y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.f40189y);
            }
            if (profileActivity.J1 == 0) {
                f7 = 1.0f;
            } else {
                f7 = profileActivity.S1;
            }
            float e7 = this.d.e(this.f40181c) * f7;
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
                        Drawable drawable = q5Var.f29669f[0];
                        if ((drawable instanceof org.telegram.ui.Components.s5) && (m4Var = ((org.telegram.ui.Components.s5) drawable).f30402k) != null && m4Var.hasImageLoaded()) {
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
                    k0 k0Var = profileActivity.Y;
                    float[][] fArr = yh.i0.f52897a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(k0Var.getX(), k0Var.getY(), (k0Var.getScaleX() * k0Var.getWidth()) + k0Var.getX(), (k0Var.getScaleY() * k0Var.getHeight()) + k0Var.getY());
                    yh.i0.c(canvas2, q5Var, measuredWidth, z13, y3, rectF, 1.0f);
                    canvas2.restore();
                    ghVar = profileActivity.f34101g5;
                    if (ghVar != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.m2) ghVar).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.S1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f10 = 1.0f;
            ghVar = profileActivity.f34101g5;
            if (ghVar != null) {
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
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, profileActivity.f34225z0));
            this.M.set(0, i12, getMeasuredWidth(), (int) f12);
            profileActivity.f34139m5.J(canvas2, getY(), this.M, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f40179a) {
            this.f40179a = i10;
            this.f40180b.setColor(i10);
            invalidate();
            if (!this.f40181c) {
                this.N.f34067c1 = this.f40179a;
            }
        }
    }
}
