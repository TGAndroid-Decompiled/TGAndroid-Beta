package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
public final class z21 {
    public final Paint f33495a;
    public final Paint f33496b;
    public final Paint f33497c;
    public Drawable d;
    public Drawable f33498e;
    public final a31 f33499f;

    public z21(a31 a31Var) {
        this.f33499f = a31Var;
        Paint paint = new Paint(1);
        this.f33495a = paint;
        this.f33496b = new Paint(1);
        this.f33497c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        int i10;
        float f11;
        float f12;
        StaticLayout noThemeStaticLayout;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        float f18;
        a31 a31Var = this.f33499f;
        ImageReceiver imageReceiver = a31Var.P;
        float f19 = a31Var.f24457e;
        org.telegram.ui.ActionBar.f5 f5Var = a31Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = a31Var.R;
        float f20 = a31Var.d;
        float f21 = a31Var.f24456c;
        int i12 = a31Var.K;
        RectF rectF = a31Var.v;
        if (!a31Var.W && a31Var.f24464y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            bq bqVar = a31Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) bqVar.f25019a.f20513f.get(bqVar.f25021c);
            if (a31Var.G.f25019a.m()) {
                i10 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, a31Var.f24463x);
            } else {
                i10 = b4Var.f20458j;
            }
            Paint paint = this.f33495a;
            paint.setColor(i10);
            paint.setAlpha((int) (a31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, a31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, a31Var.getWidth() - y3, a31Var.getHeight() - y3);
            float f22 = a31Var.f24454a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f33496b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f33497c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, a31Var.getWidth() - f21, a31Var.getHeight() - f21);
        org.telegram.ui.ActionBar.c4 c4Var = a31Var.G.f25019a;
        if (c4Var != null) {
            if (c4Var.m()) {
                a31Var.G.f25019a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (a31Var.G.f25022e != null) {
                        canvas.drawBitmap(a31Var.G.f25022e, (a31Var.getWidth() - a31Var.G.f25022e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
                        return;
                    }
                    return;
                }
                float dp = AndroidUtilities.dp(8.0f) + f21;
                if (i12 == 3) {
                    f13 = 5.0f;
                } else {
                    f13 = 22.0f;
                }
                float dp2 = AndroidUtilities.dp(f13) + f21;
                if (i12 == 0 || i12 == 3) {
                    f14 = f19;
                    if (i12 == 3) {
                        f15 = 1.2f;
                    } else {
                        f15 = 1.0f;
                    }
                    rectF.set(dp2, dp, (f15 * f14) + dp2, dp + f20);
                } else {
                    dp = 0.12f * a31Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(a31Var.getMeasuredWidth() - (a31Var.getMeasuredWidth() * 0.65f), dp, a31Var.getMeasuredWidth() - (a31Var.getMeasuredWidth() * 0.1f), a31Var.getMeasuredHeight() * 0.32f);
                }
                if (i12 == 3) {
                    paint2 = paint3;
                }
                if (i12 == 0 || i12 == 3) {
                    f16 = f20;
                    f17 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint2);
                } else {
                    f17 = 2.0f;
                    f16 = f20;
                    f5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    f5Var2.Q = (int) (rectF.height() * f12);
                    f5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(a31Var.getMeasuredWidth() * 0.1f, a31Var.getMeasuredHeight() * 0.35f, a31Var.getMeasuredWidth() * 0.65f, a31Var.getMeasuredHeight() * 0.55f);
                    i11 = 3;
                } else {
                    float dp3 = f21 + AndroidUtilities.dp(5.0f);
                    float dp4 = f16 + AndroidUtilities.dp(f11) + dp;
                    i11 = 3;
                    if (i12 == 3) {
                        f18 = 0.8f;
                    } else {
                        f18 = 1.0f;
                    }
                    rectF.set(dp3, dp4, (f14 * f18) + dp3, dp4 + f16);
                }
                if (i12 != 0 && i12 != i11) {
                    f5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    f5Var.Q = (int) (rectF.height() * f12);
                    f5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (a31Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f33498e == null) {
                        this.f33498e = a31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f33498e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f33498e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (a31Var.T == null) {
            float f23 = a31Var.f24455b;
            canvas.drawRoundRect(rectF, f23, f23, a31Var.f24461s);
            canvas.save();
            noThemeStaticLayout = a31Var.getNoThemeStaticLayout();
            canvas.translate((a31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        a31 a31Var = this.f33499f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(a31Var.f24462w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > a31Var.getWidth() / a31Var.getHeight()) {
                    int width = (int) ((a31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - a31Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, a31Var.getHeight());
                } else {
                    int height = (int) ((a31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (a31Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, a31Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, a31Var.getWidth(), a31Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof dd0) && (i10 = (iArr = ((dd0) drawable3).f25654a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = a31Var.f24460r.getAlpha();
                a31Var.f24460r.setAlpha((int) (alpha * f7));
                float f10 = a31Var.f24456c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, a31Var.getWidth() - f10, a31Var.getHeight() - f10);
                float f11 = a31Var.f24455b;
                canvas.drawRoundRect(rectF, f11, f11, a31Var.f24460r);
                a31Var.f24460r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        bq bqVar = a31Var.G;
        if (bqVar != null && (c4Var = bqVar.f25019a) != null && c4Var.m() && a31Var.N != null) {
            return;
        }
        RectF rectF2 = a31Var.v;
        float f12 = a31Var.f24455b;
        canvas.drawRoundRect(rectF2, f12, f12, a31Var.f24461s);
    }
}
