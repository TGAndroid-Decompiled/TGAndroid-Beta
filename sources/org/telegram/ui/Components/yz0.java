package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class yz0 {
    public final Paint f40789a;
    public final Paint f40790b;
    public final Paint f40791c;
    public Drawable d;
    public Drawable f40792e;
    public final zz0 f40793f;

    public yz0(zz0 zz0Var) {
        this.f40793f = zz0Var;
        Paint paint = new Paint(1);
        this.f40789a = paint;
        this.f40790b = new Paint(1);
        this.f40791c = new Paint(1);
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
        zz0 zz0Var = this.f40793f;
        ImageReceiver imageReceiver = zz0Var.P;
        float f20 = zz0Var.f41167e;
        org.telegram.ui.ActionBar.t4 t4Var = zz0Var.S;
        org.telegram.ui.ActionBar.t4 t4Var2 = zz0Var.R;
        float f21 = zz0Var.d;
        float f22 = zz0Var.f41166c;
        int i11 = zz0Var.K;
        RectF rectF = zz0Var.f41172w;
        if (!zz0Var.W && zz0Var.D == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            uo uoVar = zz0Var.G;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) uoVar.f38684a.f28460f.get(uoVar.f38686c);
            if (zz0Var.G.f38684a.l()) {
                i7 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, zz0Var.f41174y);
            } else {
                i7 = q3Var.f28407j;
            }
            Paint paint = this.f40789a;
            paint.setColor(i7);
            paint.setAlpha((int) (zz0Var.M * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, zz0Var.M, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z9, z9, zz0Var.getWidth() - z9, zz0Var.getHeight() - z9);
            float f23 = zz0Var.f41164a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f40790b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f40791c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, zz0Var.getWidth() - f22, zz0Var.getHeight() - f22);
        org.telegram.ui.ActionBar.r3 r3Var = zz0Var.G.f38684a;
        if (r3Var != null) {
            if (r3Var.l()) {
                zz0Var.G.f38684a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    zz0Var.G.getClass();
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
                    L = 0.12f * zz0Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(zz0Var.getMeasuredWidth() - (zz0Var.getMeasuredWidth() * 0.65f), L, zz0Var.getMeasuredWidth() - (zz0Var.getMeasuredWidth() * 0.1f), zz0Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(zz0Var.getMeasuredWidth() * 0.1f, zz0Var.getMeasuredHeight() * 0.35f, zz0Var.getMeasuredWidth() * 0.65f, zz0Var.getMeasuredHeight() * 0.55f);
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
                if (zz0Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f40792e == null) {
                        this.f40792e = zz0Var.getContext().getDrawable(2131231968).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f40792e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f40792e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (zz0Var.T == null) {
            float f24 = zz0Var.f41165b;
            canvas.drawRoundRect(rectF, f24, f24, zz0Var.f41171s);
            canvas.save();
            noThemeStaticLayout = zz0Var.getNoThemeStaticLayout();
            canvas.translate((zz0Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.r3 r3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        zz0 zz0Var = this.f40793f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(zz0Var.f41173x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > zz0Var.getWidth() / zz0Var.getHeight()) {
                    int width = (int) ((zz0Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - zz0Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, zz0Var.getHeight());
                } else {
                    int height = (int) ((zz0Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (zz0Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, zz0Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, zz0Var.getWidth(), zz0Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof qa0) && (i7 = (iArr = ((qa0) drawable3).f37218a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = zz0Var.f41170r.getAlpha();
                zz0Var.f41170r.setAlpha((int) (alpha * f10));
                float f11 = zz0Var.f41166c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, zz0Var.getWidth() - f11, zz0Var.getHeight() - f11);
                float f12 = zz0Var.f41165b;
                canvas.drawRoundRect(rectF, f12, f12, zz0Var.f41170r);
                zz0Var.f41170r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        uo uoVar = zz0Var.G;
        if (uoVar != null && (r3Var = uoVar.f38684a) != null && r3Var.l() && zz0Var.N != null) {
            return;
        }
        RectF rectF2 = zz0Var.f41172w;
        float f13 = zz0Var.f41165b;
        canvas.drawRoundRect(rectF2, f13, f13, zz0Var.f41171s);
    }
}
