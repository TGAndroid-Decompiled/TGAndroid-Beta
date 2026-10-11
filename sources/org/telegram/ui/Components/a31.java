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
public final class a31 {
    public final Paint f24422a;
    public final Paint f24423b;
    public final Paint f24424c;
    public Drawable d;
    public Drawable f24425e;
    public final b31 f24426f;

    public a31(b31 b31Var) {
        this.f24426f = b31Var;
        Paint paint = new Paint(1);
        this.f24422a = paint;
        this.f24423b = new Paint(1);
        this.f24424c = new Paint(1);
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
        b31 b31Var = this.f24426f;
        ImageReceiver imageReceiver = b31Var.P;
        float f19 = b31Var.f24838e;
        org.telegram.ui.ActionBar.d5 d5Var = b31Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = b31Var.R;
        float f20 = b31Var.d;
        float f21 = b31Var.f24837c;
        int i12 = b31Var.K;
        RectF rectF = b31Var.v;
        if (!b31Var.W && b31Var.f24845y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            bq bqVar = b31Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) bqVar.f25002a.f20471f.get(bqVar.f25004c);
            if (b31Var.G.f25002a.m()) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, b31Var.f24844x);
            } else {
                i10 = a4Var.f20424j;
            }
            Paint paint = this.f24422a;
            paint.setColor(i10);
            paint.setAlpha((int) (b31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, b31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, b31Var.getWidth() - y3, b31Var.getHeight() - y3);
            float f22 = b31Var.f24835a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f24423b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f24424c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, b31Var.getWidth() - f21, b31Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = b31Var.G.f25002a;
        if (b4Var != null) {
            if (b4Var.m()) {
                b31Var.G.f25002a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (b31Var.G.f25005e != null) {
                        canvas.drawBitmap(b31Var.G.f25005e, (b31Var.getWidth() - b31Var.G.f25005e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * b31Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(b31Var.getMeasuredWidth() - (b31Var.getMeasuredWidth() * 0.65f), dp, b31Var.getMeasuredWidth() - (b31Var.getMeasuredWidth() * 0.1f), b31Var.getMeasuredHeight() * 0.32f);
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
                    d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    d5Var2.Q = (int) (rectF.height() * f12);
                    d5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(b31Var.getMeasuredWidth() * 0.1f, b31Var.getMeasuredHeight() * 0.35f, b31Var.getMeasuredWidth() * 0.65f, b31Var.getMeasuredHeight() * 0.55f);
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
                    d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    d5Var.Q = (int) (rectF.height() * f12);
                    d5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (b31Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f24425e == null) {
                        this.f24425e = b31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f24425e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f24425e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (b31Var.T == null) {
            float f23 = b31Var.f24836b;
            canvas.drawRoundRect(rectF, f23, f23, b31Var.f24842s);
            canvas.save();
            noThemeStaticLayout = b31Var.getNoThemeStaticLayout();
            canvas.translate((b31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        b31 b31Var = this.f24426f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(b31Var.f24843w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > b31Var.getWidth() / b31Var.getHeight()) {
                    int width = (int) ((b31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - b31Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, b31Var.getHeight());
                } else {
                    int height = (int) ((b31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (b31Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, b31Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, b31Var.getWidth(), b31Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof dd0) && (i10 = (iArr = ((dd0) drawable3).f25544a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = b31Var.f24841r.getAlpha();
                b31Var.f24841r.setAlpha((int) (alpha * f7));
                float f10 = b31Var.f24837c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, b31Var.getWidth() - f10, b31Var.getHeight() - f10);
                float f11 = b31Var.f24836b;
                canvas.drawRoundRect(rectF, f11, f11, b31Var.f24841r);
                b31Var.f24841r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        bq bqVar = b31Var.G;
        if (bqVar != null && (b4Var = bqVar.f25002a) != null && b4Var.m() && b31Var.N != null) {
            return;
        }
        RectF rectF2 = b31Var.v;
        float f12 = b31Var.f24836b;
        canvas.drawRoundRect(rectF2, f12, f12, b31Var.f24842s);
    }
}
