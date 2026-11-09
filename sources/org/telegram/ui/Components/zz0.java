package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class zz0 {
    public final Paint f41181a;
    public final Paint f41182b;
    public final Paint f41183c;
    public Drawable d;
    public Drawable f41184e;
    public final a01 f41185f;

    public zz0(a01 a01Var) {
        this.f41185f = a01Var;
        Paint paint = new Paint(1);
        this.f41181a = paint;
        this.f41182b = new Paint(1);
        this.f41183c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        int i7;
        float f12;
        float f13;
        StaticLayout noThemeStaticLayout;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        float f19;
        a01 a01Var = this.f41185f;
        ImageReceiver imageReceiver = a01Var.P;
        float f20 = a01Var.f31637e;
        org.telegram.ui.ActionBar.t4 t4Var = a01Var.S;
        org.telegram.ui.ActionBar.t4 t4Var2 = a01Var.R;
        float f21 = a01Var.d;
        float f22 = a01Var.f31636c;
        int i11 = a01Var.K;
        RectF rectF = a01Var.f31642w;
        if (!a01Var.W && a01Var.D == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            uo uoVar = a01Var.G;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) uoVar.f38760a.f28464f.get(uoVar.f38762c);
            if (a01Var.G.f38760a.l()) {
                i7 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, a01Var.f31644y);
            } else {
                i7 = q3Var.f28415j;
            }
            Paint paint = this.f41181a;
            paint.setColor(i7);
            paint.setAlpha((int) (a01Var.M * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, a01Var.M, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z9, z9, a01Var.getWidth() - z9, a01Var.getHeight() - z9);
            float f23 = a01Var.f31634a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f41182b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f41183c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, a01Var.getWidth() - f22, a01Var.getHeight() - f22);
        org.telegram.ui.ActionBar.r3 r3Var = a01Var.G.f38760a;
        if (r3Var != null) {
            if (r3Var.l()) {
                a01Var.G.f38760a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    a01Var.G.getClass();
                    return;
                }
                float L = org.telegram.messenger.g0.L(8.0f) + f22;
                if (i11 == 3) {
                    f14 = 5.0f;
                } else {
                    f14 = 22.0f;
                }
                float L2 = org.telegram.messenger.g0.L(f14) + f22;
                if (i11 == 0 || i11 == 3) {
                    f15 = f20;
                    if (i11 == 3) {
                        f16 = 1.2f;
                    } else {
                        f16 = 1.0f;
                    }
                    rectF.set(L2, L, (f16 * f15) + L2, L + f21);
                } else {
                    L = 0.12f * a01Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(a01Var.getMeasuredWidth() - (a01Var.getMeasuredWidth() * 0.65f), L, a01Var.getMeasuredWidth() - (a01Var.getMeasuredWidth() * 0.1f), a01Var.getMeasuredHeight() * 0.32f);
                }
                if (i11 == 3) {
                    paint2 = paint3;
                }
                if (i11 == 0 || i11 == 3) {
                    f17 = f21;
                    f18 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint2);
                } else {
                    f18 = 2.0f;
                    f17 = f21;
                    t4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                    t4Var2.Q = (int) (rectF.height() * f13);
                    t4Var2.c(canvas, paint2);
                }
                if (i11 != 0 && i11 != 3) {
                    rectF.set(a01Var.getMeasuredWidth() * 0.1f, a01Var.getMeasuredHeight() * 0.35f, a01Var.getMeasuredWidth() * 0.65f, a01Var.getMeasuredHeight() * 0.55f);
                    i10 = 3;
                } else {
                    float L3 = f22 + org.telegram.messenger.g0.L(5.0f);
                    float L4 = f17 + org.telegram.messenger.g0.L(f12) + L;
                    i10 = 3;
                    if (i11 == 3) {
                        f19 = 0.8f;
                    } else {
                        f19 = 1.0f;
                    }
                    rectF.set(L3, L4, (f15 * f19) + L3, L4 + f17);
                }
                if (i11 != 0 && i11 != i10) {
                    t4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f18), (int) rectF.right, org.telegram.messenger.g0.L(f18) + ((int) rectF.bottom));
                    t4Var.Q = (int) (rectF.height() * f13);
                    t4Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (a01Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f41184e == null) {
                        this.f41184e = a01Var.getContext().getDrawable(2131231968).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f41184e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f41184e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (a01Var.T == null) {
            float f24 = a01Var.f31635b;
            canvas.drawRoundRect(rectF, f24, f24, a01Var.f31641s);
            canvas.save();
            noThemeStaticLayout = a01Var.getNoThemeStaticLayout();
            canvas.translate((a01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.r3 r3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        a01 a01Var = this.f41185f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(a01Var.f31643x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > a01Var.getWidth() / a01Var.getHeight()) {
                    int width = (int) ((a01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - a01Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, a01Var.getHeight());
                } else {
                    int height = (int) ((a01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (a01Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, a01Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, a01Var.getWidth(), a01Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof ra0) && (i7 = (iArr = ((ra0) drawable3).f37612a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = a01Var.f31640r.getAlpha();
                a01Var.f31640r.setAlpha((int) (alpha * f10));
                float f11 = a01Var.f31636c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, a01Var.getWidth() - f11, a01Var.getHeight() - f11);
                float f12 = a01Var.f31635b;
                canvas.drawRoundRect(rectF, f12, f12, a01Var.f31640r);
                a01Var.f31640r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        uo uoVar = a01Var.G;
        if (uoVar != null && (r3Var = uoVar.f38760a) != null && r3Var.l() && a01Var.N != null) {
            return;
        }
        RectF rectF2 = a01Var.f31642w;
        float f13 = a01Var.f31635b;
        canvas.drawRoundRect(rectF2, f13, f13, a01Var.f31641s);
    }
}
