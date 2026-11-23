package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class i01 {
    public final Paint f35856a;
    public final Paint f35857b;
    public final Paint f35858c;
    public Drawable d;
    public Drawable f35859e;
    public final j01 f35860f;

    public i01(j01 j01Var) {
        this.f35860f = j01Var;
        Paint paint = new Paint(1);
        this.f35856a = paint;
        this.f35857b = new Paint(1);
        this.f35858c = new Paint(1);
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
        j01 j01Var = this.f35860f;
        ImageReceiver imageReceiver = j01Var.Q;
        float f20 = j01Var.f36219e;
        org.telegram.ui.ActionBar.u4 u4Var = j01Var.T;
        org.telegram.ui.ActionBar.u4 u4Var2 = j01Var.S;
        float f21 = j01Var.d;
        float f22 = j01Var.f36218c;
        int i11 = j01Var.L;
        RectF rectF = j01Var.f36224w;
        if (!j01Var.f36216a0 && j01Var.E == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            jp jpVar = j01Var.H;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) jpVar.f36472a.f30049f.get(jpVar.f36474c);
            if (j01Var.H.f36472a.l()) {
                i7 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, j01Var.f36226y);
            } else {
                i7 = r3Var.f30027j;
            }
            Paint paint = this.f35856a;
            paint.setColor(i7);
            paint.setAlpha((int) (j01Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, j01Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, j01Var.getWidth() - z10, j01Var.getHeight() - z10);
            float f23 = j01Var.f36215a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f35857b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f35858c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, j01Var.getWidth() - f22, j01Var.getHeight() - f22);
        org.telegram.ui.ActionBar.s3 s3Var = j01Var.H.f36472a;
        if (s3Var != null) {
            if (s3Var.l()) {
                j01Var.H.f36472a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    j01Var.H.getClass();
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
                    L = 0.12f * j01Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(j01Var.getMeasuredWidth() - (j01Var.getMeasuredWidth() * 0.65f), L, j01Var.getMeasuredWidth() - (j01Var.getMeasuredWidth() * 0.1f), j01Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(j01Var.getMeasuredWidth() * 0.1f, j01Var.getMeasuredHeight() * 0.35f, j01Var.getMeasuredWidth() * 0.65f, j01Var.getMeasuredHeight() * 0.55f);
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
                if (j01Var.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.B0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f35859e == null) {
                        this.f35859e = j01Var.getContext().getDrawable(2131231972).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f35859e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f35859e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (j01Var.U == null) {
            float f24 = j01Var.f36217b;
            canvas.drawRoundRect(rectF, f24, f24, j01Var.f36223s);
            canvas.save();
            noThemeStaticLayout = j01Var.getNoThemeStaticLayout();
            canvas.translate((j01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.s3 s3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        j01 j01Var = this.f35860f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(j01Var.f36225x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > j01Var.getWidth() / j01Var.getHeight()) {
                    int width = (int) ((j01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - j01Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, j01Var.getHeight());
                } else {
                    int height = (int) ((j01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (j01Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, j01Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, j01Var.getWidth(), j01Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof za0) && (i7 = (iArr = ((za0) drawable3).f42783a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = j01Var.f36222r.getAlpha();
                j01Var.f36222r.setAlpha((int) (alpha * f10));
                float f11 = j01Var.f36218c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, j01Var.getWidth() - f11, j01Var.getHeight() - f11);
                float f12 = j01Var.f36217b;
                canvas.drawRoundRect(rectF, f12, f12, j01Var.f36222r);
                j01Var.f36222r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        jp jpVar = j01Var.H;
        if (jpVar != null && (s3Var = jpVar.f36472a) != null && s3Var.l() && j01Var.O != null) {
            return;
        }
        RectF rectF2 = j01Var.f36224w;
        float f13 = j01Var.f36217b;
        canvas.drawRoundRect(rectF2, f13, f13, j01Var.f36223s);
    }
}
