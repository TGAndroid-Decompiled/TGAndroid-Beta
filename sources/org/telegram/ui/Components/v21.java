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
public final class v21 {
    public final Paint f29540a;
    public final Paint f29541b;
    public final Paint f29542c;
    public Drawable d;
    public Drawable e;
    public final w21 f29543f;

    public v21(w21 w21Var) {
        this.f29543f = w21Var;
        Paint paint = new Paint(1);
        this.f29540a = paint;
        this.f29541b = new Paint(1);
        this.f29542c = new Paint(1);
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
        w21 w21Var = this.f29543f;
        ImageReceiver imageReceiver = w21Var.P;
        float f19 = w21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = w21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = w21Var.R;
        float f20 = w21Var.d;
        float f21 = w21Var.f30451c;
        int i12 = w21Var.K;
        RectF rectF = w21Var.v;
        if (!w21Var.W && w21Var.f30458y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            yp ypVar = w21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) ypVar.f31345a.f19345f.get(ypVar.f31347c);
            if (w21Var.G.f31345a.m()) {
                i10 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, w21Var.f30457x);
            } else {
                i10 = a4Var.f19302j;
            }
            Paint paint = this.f29540a;
            paint.setColor(i10);
            paint.setAlpha((int) (w21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, w21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, w21Var.getWidth() - y3, w21Var.getHeight() - y3);
            float f22 = w21Var.f30449a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f29541b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f29542c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, w21Var.getWidth() - f21, w21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = w21Var.G.f31345a;
        if (b4Var != null) {
            if (b4Var.m()) {
                w21Var.G.f31345a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (w21Var.G.e != null) {
                        canvas.drawBitmap(w21Var.G.e, (w21Var.getWidth() - w21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * w21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(w21Var.getMeasuredWidth() - (w21Var.getMeasuredWidth() * 0.65f), dp, w21Var.getMeasuredWidth() - (w21Var.getMeasuredWidth() * 0.1f), w21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(w21Var.getMeasuredWidth() * 0.1f, w21Var.getMeasuredHeight() * 0.35f, w21Var.getMeasuredWidth() * 0.65f, w21Var.getMeasuredHeight() * 0.55f);
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
                if (w21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = w21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (w21Var.T == null) {
            float f23 = w21Var.f30450b;
            canvas.drawRoundRect(rectF, f23, f23, w21Var.f30455s);
            canvas.save();
            noThemeStaticLayout = w21Var.getNoThemeStaticLayout();
            canvas.translate((w21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        w21 w21Var = this.f29543f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(w21Var.f30456w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > w21Var.getWidth() / w21Var.getHeight()) {
                    int width = (int) ((w21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - w21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, w21Var.getHeight());
                } else {
                    int height = (int) ((w21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (w21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, w21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, w21Var.getWidth(), w21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cd0) && (i10 = (iArr = ((cd0) drawable3).f23689a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = w21Var.f30454r.getAlpha();
                w21Var.f30454r.setAlpha((int) (alpha * f7));
                float f10 = w21Var.f30451c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, w21Var.getWidth() - f10, w21Var.getHeight() - f10);
                float f11 = w21Var.f30450b;
                canvas.drawRoundRect(rectF, f11, f11, w21Var.f30454r);
                w21Var.f30454r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        yp ypVar = w21Var.G;
        if (ypVar != null && (b4Var = ypVar.f31345a) != null && b4Var.m() && w21Var.N != null) {
            return;
        }
        RectF rectF2 = w21Var.v;
        float f12 = w21Var.f30450b;
        canvas.drawRoundRect(rectF2, f12, f12, w21Var.f30455s);
    }
}
