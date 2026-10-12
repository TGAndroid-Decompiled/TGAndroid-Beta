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
public final class u21 {
    public final Paint f29571a;
    public final Paint f29572b;
    public final Paint f29573c;
    public Drawable d;
    public Drawable e;
    public final v21 f29574f;

    public u21(v21 v21Var) {
        this.f29574f = v21Var;
        Paint paint = new Paint(1);
        this.f29571a = paint;
        this.f29572b = new Paint(1);
        this.f29573c = new Paint(1);
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
        v21 v21Var = this.f29574f;
        ImageReceiver imageReceiver = v21Var.P;
        float f19 = v21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = v21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = v21Var.R;
        float f20 = v21Var.d;
        float f21 = v21Var.f29861c;
        int i12 = v21Var.K;
        RectF rectF = v21Var.v;
        if (!v21Var.W && v21Var.f29868y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            yp ypVar = v21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) ypVar.f31668a.f19645f.get(ypVar.f31670c);
            if (v21Var.G.f31668a.m()) {
                i10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, v21Var.f29867x);
            } else {
                i10 = a4Var.f19602j;
            }
            Paint paint = this.f29571a;
            paint.setColor(i10);
            paint.setAlpha((int) (v21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, v21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, v21Var.getWidth() - y3, v21Var.getHeight() - y3);
            float f22 = v21Var.f29859a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f29572b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f29573c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, v21Var.getWidth() - f21, v21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = v21Var.G.f31668a;
        if (b4Var != null) {
            if (b4Var.m()) {
                v21Var.G.f31668a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (v21Var.G.e != null) {
                        canvas.drawBitmap(v21Var.G.e, (v21Var.getWidth() - v21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * v21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(v21Var.getMeasuredWidth() - (v21Var.getMeasuredWidth() * 0.65f), dp, v21Var.getMeasuredWidth() - (v21Var.getMeasuredWidth() * 0.1f), v21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(v21Var.getMeasuredWidth() * 0.1f, v21Var.getMeasuredHeight() * 0.35f, v21Var.getMeasuredWidth() * 0.65f, v21Var.getMeasuredHeight() * 0.55f);
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
                if (v21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = v21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (v21Var.T == null) {
            float f23 = v21Var.f29860b;
            canvas.drawRoundRect(rectF, f23, f23, v21Var.f29865s);
            canvas.save();
            noThemeStaticLayout = v21Var.getNoThemeStaticLayout();
            canvas.translate((v21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        v21 v21Var = this.f29574f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(v21Var.f29866w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > v21Var.getWidth() / v21Var.getHeight()) {
                    int width = (int) ((v21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - v21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, v21Var.getHeight());
                } else {
                    int height = (int) ((v21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (v21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, v21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, v21Var.getWidth(), v21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cd0) && (i10 = (iArr = ((cd0) drawable3).f24035a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = v21Var.f29864r.getAlpha();
                v21Var.f29864r.setAlpha((int) (alpha * f7));
                float f10 = v21Var.f29861c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, v21Var.getWidth() - f10, v21Var.getHeight() - f10);
                float f11 = v21Var.f29860b;
                canvas.drawRoundRect(rectF, f11, f11, v21Var.f29864r);
                v21Var.f29864r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        yp ypVar = v21Var.G;
        if (ypVar != null && (b4Var = ypVar.f31668a) != null && b4Var.m() && v21Var.N != null) {
            return;
        }
        RectF rectF2 = v21Var.v;
        float f12 = v21Var.f29860b;
        canvas.drawRoundRect(rectF2, f12, f12, v21Var.f29865s);
    }
}
