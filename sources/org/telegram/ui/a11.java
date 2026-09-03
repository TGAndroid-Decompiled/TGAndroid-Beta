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
public final class a11 extends FrameLayout {
    public final Matrix B;
    public final Paint C;
    public int D;
    public int E;
    public final org.telegram.ui.Components.j5 F;
    public final org.telegram.ui.Components.z5 G;
    public boolean H;
    public boolean I;
    public final Rect J;
    public final ProfileActivity K;
    public int f32418a;
    public final Paint f32419b;
    public boolean f32420c;
    public final org.telegram.ui.Components.z5 d;
    public int e;
    public int f32421f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f32422n;
    public int f32423r;
    public int f32424s;
    public int v;
    public float f32425w;
    public float f32426x;
    public RadialGradient f32427y;

    public a11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.K = profileActivity;
        this.f32419b = new Paint();
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.d = new org.telegram.ui.Components.z5(this, 350L, mrVar);
        this.h = new org.telegram.ui.Components.c5(this, 350L, mrVar);
        this.f32422n = new org.telegram.ui.Components.c5(this, 350L, mrVar);
        this.B = new Matrix();
        this.C = new Paint(1);
        this.F = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.G = new org.telegram.ui.Components.z5(this, 0L, 440L, mrVar);
        new org.telegram.ui.Components.z5(this, 0L, 440L, mrVar);
        this.J = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z4) {
        ProfileActivity profileActivity = this.K;
        if (peerColor != null) {
            this.f32420c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
            this.f32421f = bgColor2;
            profileActivity.Z0 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.D = i10;
                this.E = org.telegram.ui.ActionBar.j6.l1(0.45f, i10);
            } else {
                this.D = np0.w0(this.e);
                this.E = org.telegram.ui.ActionBar.j6.l1(0.15f, np0.w0(this.e));
            }
        } else {
            profileActivity.Z0 = this.f32418a;
            this.f32420c = false;
            int i11 = org.telegram.ui.ActionBar.j6.f20151s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0)) > 0.8f) {
                this.D = -1;
                this.E = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0)) < 0.2f) {
                this.D = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0)));
                this.E = org.telegram.ui.ActionBar.j6.l1(0.35f, org.telegram.ui.ActionBar.j6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0)));
            } else {
                this.D = np0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0));
                this.E = org.telegram.ui.ActionBar.j6.l1(0.15f, np0.w0(org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f32155w0)));
            }
        }
        if (!z4) {
            this.h.a(this.e, true);
            this.f32422n.a(this.f32421f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z4) {
        org.telegram.ui.Components.j5 j5Var = this.F;
        boolean z10 = true;
        j5Var.j(j10, true);
        j5Var.k(Integer.valueOf(this.D));
        if (!this.H && (j10 == 0 || j10 == -1)) {
            z10 = false;
        }
        this.H = z10;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.b();
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
        float f10;
        Paint paint2;
        float f11;
        org.telegram.ui.Components.rg rgVar;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        org.telegram.ui.ActionBar.k kVar4;
        float f12;
        org.telegram.ui.ActionBar.k kVar5;
        nh.y2 y2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.K;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f13 = currentActionBarHeight + i10 + profileActivity.N1 + profileActivity.Q1;
        int i12 = (int) ((1.0f - profileActivity.B5) * f13);
        Paint paint3 = this.f32419b;
        if (i12 != 0) {
            paint3.setColor(this.f32418a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.f32422n.a(this.f32421f, false);
            org.telegram.ui.Components.kh0 kh0Var = profileActivity.X;
            if (kh0Var != null) {
                int i13 = this.E;
                boolean z4 = this.f32420c;
                if (kh0Var.P == null || kh0Var.N != i13 || kh0Var.O != z4) {
                    kh0Var.N = i13;
                    kh0Var.O = z4;
                    kh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f32427y;
            Paint paint4 = this.C;
            if (radialGradient == null || this.f32423r != a2 || this.f32424s != a10 || this.v != width) {
                this.f32425w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                this.f32426x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f14 = this.f32426x;
                float f15 = this.f32425w;
                this.f32424s = a10;
                this.f32423r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f15 / 2.0f) + f14, f15, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f32427y = radialGradient2;
                radialGradient2.setLocalMatrix(this.B);
                paint4.setShader(this.f32427y);
            }
            if (profileActivity.G1 == 0) {
                f10 = 1.0f;
            } else {
                f10 = profileActivity.P1;
            }
            float e = this.d.e(this.f32420c) * f10;
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
            if (this.H) {
                boolean z10 = this.I;
                org.telegram.ui.Components.j5 j5Var = this.F;
                boolean z11 = true;
                if (!z10) {
                    if (j5Var != null) {
                        Drawable drawable = j5Var.f25836f[0];
                        if ((drawable instanceof org.telegram.ui.Components.l5) && (y2Var = ((org.telegram.ui.Components.l5) drawable).f26587k) != null && y2Var.hasImageLoaded()) {
                            this.I = true;
                        }
                    }
                    z11 = false;
                }
                float e6 = this.G.e(z11);
                if ((!profileActivity.D1 || profileActivity.G1 != 2) && e6 > 0.0f && profileActivity.V != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i12);
                    kVar4 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    if (kVar4.getOccupyStatusBar()) {
                        f12 = AndroidUtilities.statusBarHeight;
                    } else {
                        f12 = 0.0f;
                    }
                    kVar5 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                    float x10 = e2.c.x(kVar5.getHeight(), f12, 2.0f, profileActivity.U3() + f12);
                    int measuredWidth = getMeasuredWidth();
                    float y32 = profileActivity.y3();
                    n0 n0Var = profileActivity.V;
                    float[][] fArr = lh.x0.f13311a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f11 = 1.0f;
                    rectF.set(n0Var.getX(), n0Var.getY(), (n0Var.getScaleX() * n0Var.getWidth()) + n0Var.getX(), (n0Var.getScaleY() * n0Var.getHeight()) + n0Var.getY());
                    lh.x0.c(canvas2, j5Var, measuredWidth, x10, y32, rectF, 1.0f);
                    canvas2.restore();
                    rgVar = profileActivity.f32029d5;
                    if (rgVar != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.p2) rgVar).getActionBar()).B) != null) {
                        int save = canvas2.save();
                        canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f11 - profileActivity.P1) * 255.0f), 31);
                        zVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f11 = 1.0f;
            rgVar = profileActivity.f32029d5;
            if (rgVar != null) {
                int save2 = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f11 - profileActivity.P1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i12 != f13 && !profileActivity.D1) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, profileActivity.f32155w0));
            this.J.set(0, i12, getMeasuredWidth(), (int) f13);
            profileActivity.f32071j5.J(canvas2, getY(), this.J, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f32418a) {
            this.f32418a = i10;
            this.f32419b.setColor(i10);
            invalidate();
            if (!this.f32420c) {
                this.K.Z0 = this.f32418a;
            }
        }
    }
}
