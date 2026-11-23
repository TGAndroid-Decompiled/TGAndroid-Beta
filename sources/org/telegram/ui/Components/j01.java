package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class j01 {
    public final Paint f36302a;
    public final Paint f36303b;
    public final Paint f36304c;
    public Drawable d;
    public Drawable f36305e;
    public final k01 f36306f;

    public j01(k01 k01Var) {
        this.f36306f = k01Var;
        Paint paint = new Paint(1);
        this.f36302a = paint;
        this.f36303b = new Paint(1);
        this.f36304c = new Paint(1);
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
        k01 k01Var = this.f36306f;
        ImageReceiver imageReceiver = k01Var.Q;
        float f20 = k01Var.f36698e;
        org.telegram.ui.ActionBar.u4 u4Var = k01Var.T;
        org.telegram.ui.ActionBar.u4 u4Var2 = k01Var.S;
        float f21 = k01Var.d;
        float f22 = k01Var.f36697c;
        int i11 = k01Var.L;
        RectF rectF = k01Var.f36703w;
        if (!k01Var.f36695a0 && k01Var.E == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            mp mpVar = k01Var.H;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) mpVar.f37548a.f29953f.get(mpVar.f37550c);
            if (k01Var.H.f37548a.l()) {
                i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, k01Var.f36705y);
            } else {
                i7 = r3Var.f29931j;
            }
            Paint paint = this.f36302a;
            paint.setColor(i7);
            paint.setAlpha((int) (k01Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, k01Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, k01Var.getWidth() - z10, k01Var.getHeight() - z10);
            float f23 = k01Var.f36694a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f36303b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f36304c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, k01Var.getWidth() - f22, k01Var.getHeight() - f22);
        org.telegram.ui.ActionBar.s3 s3Var = k01Var.H.f37548a;
        if (s3Var != null) {
            if (s3Var.l()) {
                k01Var.H.f37548a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    k01Var.H.getClass();
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
                    L = 0.12f * k01Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(k01Var.getMeasuredWidth() - (k01Var.getMeasuredWidth() * 0.65f), L, k01Var.getMeasuredWidth() - (k01Var.getMeasuredWidth() * 0.1f), k01Var.getMeasuredHeight() * 0.32f);
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
                    u4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                    u4Var2.Q = (int) (rectF.height() * f13);
                    u4Var2.c(canvas, paint2);
                }
                if (i11 != 0 && i11 != 3) {
                    rectF.set(k01Var.getMeasuredWidth() * 0.1f, k01Var.getMeasuredHeight() * 0.35f, k01Var.getMeasuredWidth() * 0.65f, k01Var.getMeasuredHeight() * 0.55f);
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
                    u4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f18), (int) rectF.right, org.telegram.messenger.g0.L(f18) + ((int) rectF.bottom));
                    u4Var.Q = (int) (rectF.height() * f13);
                    u4Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (k01Var.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f36305e == null) {
                        this.f36305e = k01Var.getContext().getDrawable(2131231969).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f36305e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f36305e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (k01Var.U == null) {
            float f24 = k01Var.f36696b;
            canvas.drawRoundRect(rectF, f24, f24, k01Var.f36702s);
            canvas.save();
            noThemeStaticLayout = k01Var.getNoThemeStaticLayout();
            canvas.translate((k01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.s3 s3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        k01 k01Var = this.f36306f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(k01Var.f36704x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > k01Var.getWidth() / k01Var.getHeight()) {
                    int width = (int) ((k01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - k01Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, k01Var.getHeight());
                } else {
                    int height = (int) ((k01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (k01Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, k01Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, k01Var.getWidth(), k01Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cb0) && (i7 = (iArr = ((cb0) drawable3).f34107a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = k01Var.f36701r.getAlpha();
                k01Var.f36701r.setAlpha((int) (alpha * f10));
                float f11 = k01Var.f36697c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, k01Var.getWidth() - f11, k01Var.getHeight() - f11);
                float f12 = k01Var.f36696b;
                canvas.drawRoundRect(rectF, f12, f12, k01Var.f36701r);
                k01Var.f36701r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        mp mpVar = k01Var.H;
        if (mpVar != null && (s3Var = mpVar.f37548a) != null && s3Var.l() && k01Var.O != null) {
            return;
        }
        RectF rectF2 = k01Var.f36703w;
        float f13 = k01Var.f36696b;
        canvas.drawRoundRect(rectF2, f13, f13, k01Var.f36702s);
    }
}
