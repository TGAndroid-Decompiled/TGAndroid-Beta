package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class k01 {
    public final Paint f36734a;
    public final Paint f36735b;
    public final Paint f36736c;
    public Drawable d;
    public Drawable f36737e;
    public final l01 f36738f;

    public k01(l01 l01Var) {
        this.f36738f = l01Var;
        Paint paint = new Paint(1);
        this.f36734a = paint;
        this.f36735b = new Paint(1);
        this.f36736c = new Paint(1);
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
        l01 l01Var = this.f36738f;
        ImageReceiver imageReceiver = l01Var.Q;
        float f20 = l01Var.f37056e;
        org.telegram.ui.ActionBar.u4 u4Var = l01Var.T;
        org.telegram.ui.ActionBar.u4 u4Var2 = l01Var.S;
        float f21 = l01Var.d;
        float f22 = l01Var.f37055c;
        int i11 = l01Var.L;
        RectF rectF = l01Var.f37061w;
        if (!l01Var.f37053a0 && l01Var.E == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            mp mpVar = l01Var.H;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) mpVar.f37594a.f29984f.get(mpVar.f37596c);
            if (l01Var.H.f37594a.l()) {
                i7 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, l01Var.f37063y);
            } else {
                i7 = r3Var.f29962j;
            }
            Paint paint = this.f36734a;
            paint.setColor(i7);
            paint.setAlpha((int) (l01Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, l01Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, l01Var.getWidth() - z10, l01Var.getHeight() - z10);
            float f23 = l01Var.f37052a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f36735b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f36736c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, l01Var.getWidth() - f22, l01Var.getHeight() - f22);
        org.telegram.ui.ActionBar.s3 s3Var = l01Var.H.f37594a;
        if (s3Var != null) {
            if (s3Var.l()) {
                l01Var.H.f37594a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    l01Var.H.getClass();
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
                    L = 0.12f * l01Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(l01Var.getMeasuredWidth() - (l01Var.getMeasuredWidth() * 0.65f), L, l01Var.getMeasuredWidth() - (l01Var.getMeasuredWidth() * 0.1f), l01Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(l01Var.getMeasuredWidth() * 0.1f, l01Var.getMeasuredHeight() * 0.35f, l01Var.getMeasuredWidth() * 0.65f, l01Var.getMeasuredHeight() * 0.55f);
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
                if (l01Var.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f36737e == null) {
                        this.f36737e = l01Var.getContext().getDrawable(2131231969).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f36737e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f36737e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (l01Var.U == null) {
            float f24 = l01Var.f37054b;
            canvas.drawRoundRect(rectF, f24, f24, l01Var.f37060s);
            canvas.save();
            noThemeStaticLayout = l01Var.getNoThemeStaticLayout();
            canvas.translate((l01Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.s3 s3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        l01 l01Var = this.f36738f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(l01Var.f37062x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > l01Var.getWidth() / l01Var.getHeight()) {
                    int width = (int) ((l01Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - l01Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, l01Var.getHeight());
                } else {
                    int height = (int) ((l01Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (l01Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, l01Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, l01Var.getWidth(), l01Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cb0) && (i7 = (iArr = ((cb0) drawable3).f34149a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = l01Var.f37059r.getAlpha();
                l01Var.f37059r.setAlpha((int) (alpha * f10));
                float f11 = l01Var.f37055c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, l01Var.getWidth() - f11, l01Var.getHeight() - f11);
                float f12 = l01Var.f37054b;
                canvas.drawRoundRect(rectF, f12, f12, l01Var.f37059r);
                l01Var.f37059r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        mp mpVar = l01Var.H;
        if (mpVar != null && (s3Var = mpVar.f37594a) != null && s3Var.l() && l01Var.O != null) {
            return;
        }
        RectF rectF2 = l01Var.f37061w;
        float f13 = l01Var.f37054b;
        canvas.drawRoundRect(rectF2, f13, f13, l01Var.f37060s);
    }
}
