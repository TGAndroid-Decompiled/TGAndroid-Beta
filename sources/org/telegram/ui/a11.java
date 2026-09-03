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
    public int f34980a;
    public final Paint f34981b;
    public boolean f34982c;
    public final org.telegram.ui.Components.z5 d;
    public int f34983e;
    public int f34984f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f34985n;
    public int f34986r;
    public int f34987s;
    public int v;
    public float f34988w;
    public float f34989x;
    public RadialGradient f34990y;

    public a11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.K = profileActivity;
        this.f34981b = new Paint();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.d = new org.telegram.ui.Components.z5(this, 350L, prVar);
        this.h = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.f34985n = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.B = new Matrix();
        this.C = new Paint(1);
        this.F = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.G = new org.telegram.ui.Components.z5(this, 0L, 440L, prVar);
        new org.telegram.ui.Components.z5(this, 0L, 440L, prVar);
        this.J = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z4) {
        ProfileActivity profileActivity = this.K;
        if (peerColor != null) {
            this.f34982c = true;
            this.f34983e = peerColor.getBgColor1(org.telegram.ui.ActionBar.k6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.k6.I.q());
            this.f34984f = bgColor2;
            profileActivity.Z0 = i0.a.d(0.25f, this.f34983e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.D = i10;
                this.E = org.telegram.ui.ActionBar.k6.l1(0.45f, i10);
            } else {
                this.D = np0.w0(this.f34983e);
                this.E = org.telegram.ui.ActionBar.k6.l1(0.15f, np0.w0(this.f34983e));
            }
        } else {
            profileActivity.Z0 = this.f34980a;
            this.f34982c = false;
            int i11 = org.telegram.ui.ActionBar.k6.f21932s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0)) > 0.8f) {
                this.D = -1;
                this.E = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0)) < 0.2f) {
                this.D = org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0)));
                this.E = org.telegram.ui.ActionBar.k6.l1(0.35f, org.telegram.ui.ActionBar.k6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0)));
            } else {
                this.D = np0.w0(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0));
                this.E = org.telegram.ui.ActionBar.k6.l1(0.15f, np0.w0(org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0)));
            }
        }
        if (!z4) {
            this.h.a(this.f34983e, true);
            this.f34985n.a(this.f34984f, true);
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
        oh.z2 z2Var;
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
        Paint paint3 = this.f34981b;
        if (i12 != 0) {
            paint3.setColor(this.f34980a);
            int a2 = this.h.a(this.f34983e, false);
            int a10 = this.f34985n.a(this.f34984f, false);
            org.telegram.ui.Components.lh0 lh0Var = profileActivity.X;
            if (lh0Var != null) {
                int i13 = this.E;
                boolean z4 = this.f34982c;
                if (lh0Var.P == null || lh0Var.N != i13 || lh0Var.O != z4) {
                    lh0Var.N = i13;
                    lh0Var.O = z4;
                    lh0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.f34990y;
            Paint paint4 = this.C;
            if (radialGradient == null || this.f34986r != a2 || this.f34987s != a10 || this.v != width) {
                this.f34988w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                if (kVar2.getOccupyStatusBar()) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                kVar3 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                this.f34989x = kVar3.getTranslationY() + ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - (AndroidUtilities.density * 21.0f));
                this.v = width;
                float f14 = this.f34989x;
                float f15 = this.f34988w;
                this.f34987s = a10;
                this.f34986r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f15 / 2.0f) + f14, f15, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f34990y = radialGradient2;
                radialGradient2.setLocalMatrix(this.B);
                paint4.setShader(this.f34990y);
            }
            if (profileActivity.G1 == 0) {
                f10 = 1.0f;
            } else {
                f10 = profileActivity.P1;
            }
            float e6 = this.d.e(this.f34982c) * f10;
            if (e6 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i12, paint2);
            } else {
                paint2 = paint3;
            }
            if (e6 > 0.0f) {
                paint4.setAlpha((int) (e6 * 255.0f));
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
                        Drawable drawable = j5Var.f27988f[0];
                        if ((drawable instanceof org.telegram.ui.Components.l5) && (z2Var = ((org.telegram.ui.Components.l5) drawable).f28637k) != null && z2Var.hasImageLoaded()) {
                            this.I = true;
                        }
                    }
                    z11 = false;
                }
                float e10 = this.G.e(z11);
                if ((!profileActivity.D1 || profileActivity.G1 != 2) && e10 > 0.0f && profileActivity.V != null) {
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
                    l0 l0Var = profileActivity.V;
                    float[][] fArr = mh.w0.f14963a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f11 = 1.0f;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    mh.w0.c(canvas2, j5Var, measuredWidth, x10, y32, rectF, 1.0f);
                    canvas2.restore();
                    rgVar = profileActivity.f34587d5;
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
            rgVar = profileActivity.f34587d5;
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
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, profileActivity.f34714w0));
            this.J.set(0, i12, getMeasuredWidth(), (int) f13);
            profileActivity.f34630j5.J(canvas2, getY(), this.J, paint, true);
        }
    }

    @Override
    public final void setBackgroundColor(int i10) {
        if (i10 != this.f34980a) {
            this.f34980a = i10;
            this.f34981b.setColor(i10);
            invalidate();
            if (!this.f34982c) {
                this.K.Z0 = this.f34980a;
            }
        }
    }
}
