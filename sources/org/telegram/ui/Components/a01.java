package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class a01 {
    public final Paint f32808a;
    public final Paint f32809b;
    public final Paint f32810c;
    public Drawable d;
    public Drawable f32811e;
    public final b01 f32812f;

    public a01(b01 b01Var) {
        this.f32812f = b01Var;
        Paint paint = new Paint(1);
        this.f32808a = paint;
        this.f32809b = new Paint(1);
        this.f32810c = new Paint(1);
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
        b01 b01Var = this.f32812f;
        ImageReceiver imageReceiver = b01Var.Q;
        float f20 = b01Var.f33130e;
        org.telegram.ui.ActionBar.r4 r4Var = b01Var.T;
        org.telegram.ui.ActionBar.r4 r4Var2 = b01Var.S;
        float f21 = b01Var.d;
        float f22 = b01Var.f33129c;
        int i11 = b01Var.L;
        RectF rectF = b01Var.f33135w;
        if (!b01Var.f33127a0 && b01Var.E == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            dp dpVar = b01Var.H;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) dpVar.f34009a.f29474f.get(dpVar.f34011c);
            if (b01Var.H.f34009a.l()) {
                i7 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, b01Var.f33137y);
            } else {
                i7 = o3Var.f29443j;
            }
            Paint paint = this.f32808a;
            paint.setColor(i7);
            paint.setAlpha((int) (b01Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, b01Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, b01Var.getWidth() - z10, b01Var.getHeight() - z10);
            float f23 = b01Var.f33126a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f32809b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f32810c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, b01Var.getWidth() - f22, b01Var.getHeight() - f22);
        org.telegram.ui.ActionBar.p3 p3Var = b01Var.H.f34009a;
        if (p3Var != null) {
            if (p3Var.l()) {
                b01Var.H.f34009a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    b01Var.H.getClass();
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
                    L = 0.12f * b01Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(b01Var.getMeasuredWidth() - (b01Var.getMeasuredWidth() * 0.65f), L, b01Var.getMeasuredWidth() - (b01Var.getMeasuredWidth() * 0.1f), b01Var.getMeasuredHeight() * 0.32f);
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
                    r4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                    r4Var2.Q = (int) (rectF.height() * f13);
                    r4Var2.c(canvas, paint2);
                }
                if (i11 != 0 && i11 != 3) {
                    rectF.set(b01Var.getMeasuredWidth() * 0.1f, b01Var.getMeasuredHeight() * 0.35f, b01Var.getMeasuredWidth() * 0.65f, b01Var.getMeasuredHeight() * 0.55f);
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
                    r4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f18), (int) rectF.right, org.telegram.messenger.g0.L(f18) + ((int) rectF.bottom));
                    r4Var.Q = (int) (rectF.height() * f13);
                    r4Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (b01Var.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f32811e == null) {
                        this.f32811e = b01Var.getContext().getDrawable(2131231968).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f32811e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f32811e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (b01Var.U == null) {
            float f24 = b01Var.f33128b;
            canvas.drawRoundRect(rectF, f24, f24, b01Var.f33134s);
            canvas.save();
            noThemeStaticLayout = b01Var.getNoThemeStaticLayout();
            canvas.translate((b01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.p3 p3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        b01 b01Var = this.f32812f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(b01Var.f33136x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > b01Var.getWidth() / b01Var.getHeight()) {
                    int width = (int) ((b01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - b01Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, b01Var.getHeight());
                } else {
                    int height = (int) ((b01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (b01Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, b01Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, b01Var.getWidth(), b01Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof ra0) && (i7 = (iArr = ((ra0) drawable3).f38911a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = b01Var.f33133r.getAlpha();
                b01Var.f33133r.setAlpha((int) (alpha * f10));
                float f11 = b01Var.f33129c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, b01Var.getWidth() - f11, b01Var.getHeight() - f11);
                float f12 = b01Var.f33128b;
                canvas.drawRoundRect(rectF, f12, f12, b01Var.f33133r);
                b01Var.f33133r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        dp dpVar = b01Var.H;
        if (dpVar != null && (p3Var = dpVar.f34009a) != null && p3Var.l() && b01Var.O != null) {
            return;
        }
        RectF rectF2 = b01Var.f33135w;
        float f13 = b01Var.f33128b;
        canvas.drawRoundRect(rectF2, f13, f13, b01Var.f33134s);
    }
}
