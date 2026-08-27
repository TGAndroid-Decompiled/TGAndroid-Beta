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
    public final org.telegram.ui.Components.i5 E;
    public final org.telegram.ui.Components.y5 F;
    public boolean G;
    public boolean H;
    public final Rect I;
    public final ProfileActivity J;

    public int f39209a;

    public final Paint f39210b;

    public boolean f39211c;
    public final org.telegram.ui.Components.y5 d;

    public int f39212e;

    public int f39213f;
    public final org.telegram.ui.Components.b5 h;

    public final org.telegram.ui.Components.b5 f39214n;

    public int f39215r;

    public int f39216s;
    public int v;

    public float f39217w;

    public float f39218x;

    public RadialGradient f39219y;

    public j01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.J = profileActivity;
        this.f39210b = new Paint();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.d = new org.telegram.ui.Components.y5(this, 350L, erVar);
        this.h = new org.telegram.ui.Components.b5(this, 350L, erVar);
        this.f39214n = new org.telegram.ui.Components.b5(this, 350L, erVar);
        this.A = new Matrix();
        this.B = new Paint(1);
        this.E = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.F = new org.telegram.ui.Components.y5(this, 0L, 440L, erVar);
        new org.telegram.ui.Components.y5(this, 0L, 440L, erVar);
        this.I = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.J;
        if (peerColor != null) {
            this.f39211c = true;
            this.f39212e = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
            this.f39213f = bgColor2;
            profileActivity.Y0 = i0.b.d(0.25f, this.f39212e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.C = i10;
                this.D = org.telegram.ui.ActionBar.g6.l1(0.45f, i10);
            } else {
                this.C = ap0.u0(this.f39212e);
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, ap0.u0(this.f39212e));
            }
        } else {
            profileActivity.Y0 = this.f39209a;
            this.f39211c = false;
            int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0)) > 0.8f) {
                this.C = -1;
                this.D = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0)) < 0.2f) {
                this.C = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0)));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0)));
            } else {
                this.C = ap0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, ap0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.f36067v0)));
            }
        }
        if (!z10) {
            this.h.a(this.f39212e, true);
            this.f39214n.a(this.f39213f, true);
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
        Canvas canvas2;
        Paint paint;
        float f10;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.z zVar;
        jh.y2 y2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.J;
        float f11 = currentActionBarHeight + (((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.M1 + profileActivity.P1;
        int i10 = (int) ((1.0f - profileActivity.A5) * f11);
        Paint paint2 = this.f39210b;
        if (i10 != 0) {
            paint2.setColor(this.f39209a);
            int iA = this.h.a(this.f39212e, false);
            int iA2 = this.f39214n.a(this.f39213f, false);
            org.telegram.ui.Components.rg0 rg0Var = profileActivity.W;
            if (rg0Var != null) {
                int i11 = this.D;
                boolean z10 = this.f39211c;
                if (rg0Var.O == null || rg0Var.M != i11 || rg0Var.N != z10) {
                    rg0Var.M = i11;
                    rg0Var.N = z10;
                    rg0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f39219y;
            Paint paint3 = this.B;
            if (radialGradient == null || this.f39215r != iA || this.f39216s != iA2 || this.v != width) {
                this.f39217w = AndroidUtilities.dp(96.0f) * 2;
                this.f39218x = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f12 = this.f39218x;
                float f13 = this.f39217w;
                this.f39216s = iA2;
                this.f39215r = iA;
                RadialGradient radialGradient2 = new RadialGradient(width, (f13 / 2.0f) + f12, f13, new int[]{iA2, iA}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f39219y = radialGradient2;
                radialGradient2.setLocalMatrix(this.A);
                paint3.setShader(this.f39219y);
            }
            float fE = this.d.e(this.f39211c) * (profileActivity.F1 == 0 ? 1.0f : profileActivity.O1);
            if (fE < 1.0f) {
                paint = paint2;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint);
            } else {
                paint = paint2;
            }
            if (fE > 0.0f) {
                paint3.setAlpha((int) (fE * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint3);
            } else {
                canvas2 = canvas;
            }
            if (this.G) {
                boolean z11 = this.H;
                org.telegram.ui.Components.i5 i5Var = this.E;
                boolean z12 = true;
                if (!z11) {
                    if (i5Var != null) {
                        Drawable drawable = i5Var.f29229f[0];
                        if ((drawable instanceof org.telegram.ui.Components.k5) && (y2Var = ((org.telegram.ui.Components.k5) drawable).f29961k) != null && y2Var.hasImageLoaded()) {
                            this.H = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                }
                float fE2 = this.F.e(z12);
                if ((profileActivity.C1 && profileActivity.F1 == 2) || fE2 <= 0.0f || profileActivity.U == null) {
                    f10 = 1.0f;
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    float f14 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    float fA = com.google.android.recaptcha.internal.a.A(((org.telegram.ui.ActionBar.n2) profileActivity).actionBar.getHeight(), f14, 2.0f, profileActivity.U3() + f14);
                    int measuredWidth = getMeasuredWidth();
                    float fY3 = profileActivity.y3();
                    n0 n0Var = profileActivity.U;
                    float[][] fArr = hh.y0.f10355a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f10 = 1.0f;
                    rectF.set(n0Var.getX(), n0Var.getY(), (n0Var.getScaleX() * n0Var.getWidth()) + n0Var.getX(), (n0Var.getScaleY() * n0Var.getHeight()) + n0Var.getY());
                    hh.y0.c(canvas2, i5Var, measuredWidth, fA, fY3, rectF, 1.0f);
                    canvas2.restore();
                }
            } else {
                f10 = 1.0f;
            }
            Object obj = profileActivity.f35941c5;
            if (obj != null && (zVar = (actionBar = ((org.telegram.ui.ActionBar.n2) obj).getActionBar()).A) != null) {
                int iSave = canvas2.save();
                canvas2.translate(zVar.getX() + actionBar.getX(), zVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), (int) ((f10 - profileActivity.O1) * 255.0f), 31);
                zVar.draw(canvas2);
                canvas2.restoreToCount(iSave);
            }
        } else {
            canvas2 = canvas;
            paint = paint2;
        }
        if (i10 == f11 || profileActivity.C1) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0));
        this.I.set(0, i10, getMeasuredWidth(), (int) f11);
        profileActivity.f35985i5.J(canvas2, getY(), this.I, paint, true);
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f39209a) {
            this.f39209a = i10;
            this.f39210b.setColor(i10);
            invalidate();
            if (this.f39211c) {
                return;
            }
            this.J.Y0 = this.f39209a;
        }
    }
}
