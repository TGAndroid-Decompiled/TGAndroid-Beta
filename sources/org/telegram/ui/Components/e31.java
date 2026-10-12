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
public final class e31 {
    public final Paint f25578a;
    public final Paint f25579b;
    public final Paint f25580c;
    public Drawable d;
    public Drawable f25581e;
    public final f31 f25582f;

    public e31(f31 f31Var) {
        this.f25582f = f31Var;
        Paint paint = new Paint(1);
        this.f25578a = paint;
        this.f25579b = new Paint(1);
        this.f25580c = new Paint(1);
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
        f31 f31Var = this.f25582f;
        ImageReceiver imageReceiver = f31Var.P;
        float f19 = f31Var.f25875e;
        org.telegram.ui.ActionBar.d5 d5Var = f31Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = f31Var.R;
        float f20 = f31Var.d;
        float f21 = f31Var.f25874c;
        int i12 = f31Var.K;
        RectF rectF = f31Var.v;
        if (!f31Var.W && f31Var.f25882y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            dq dqVar = f31Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) dqVar.f25446a.f20243f.get(dqVar.f25448c);
            if (f31Var.G.f25446a.m()) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, f31Var.f25881x);
            } else {
                i10 = a4Var.f20197j;
            }
            Paint paint = this.f25578a;
            paint.setColor(i10);
            paint.setAlpha((int) (f31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, f31Var.getWidth() - y3, f31Var.getHeight() - y3);
            float f22 = f31Var.f25872a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f25579b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f25580c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, f31Var.getWidth() - f21, f31Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = f31Var.G.f25446a;
        if (b4Var != null) {
            if (b4Var.m()) {
                f31Var.G.f25446a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (f31Var.G.f25449e != null) {
                        canvas.drawBitmap(f31Var.G.f25449e, (f31Var.getWidth() - f31Var.G.f25449e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * f31Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(f31Var.getMeasuredWidth() - (f31Var.getMeasuredWidth() * 0.65f), dp, f31Var.getMeasuredWidth() - (f31Var.getMeasuredWidth() * 0.1f), f31Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(f31Var.getMeasuredWidth() * 0.1f, f31Var.getMeasuredHeight() * 0.35f, f31Var.getMeasuredWidth() * 0.65f, f31Var.getMeasuredHeight() * 0.55f);
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
                if (f31Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f25581e == null) {
                        this.f25581e = f31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f25581e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f25581e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (f31Var.T == null) {
            float f23 = f31Var.f25873b;
            canvas.drawRoundRect(rectF, f23, f23, f31Var.f25879s);
            canvas.save();
            noThemeStaticLayout = f31Var.getNoThemeStaticLayout();
            canvas.translate((f31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        f31 f31Var = this.f25582f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(f31Var.f25880w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > f31Var.getWidth() / f31Var.getHeight()) {
                    int width = (int) ((f31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - f31Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, f31Var.getHeight());
                } else {
                    int height = (int) ((f31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (f31Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, f31Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, f31Var.getWidth(), f31Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof gd0) && (i10 = (iArr = ((gd0) drawable3).f26395a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = f31Var.f25878r.getAlpha();
                f31Var.f25878r.setAlpha((int) (alpha * f7));
                float f10 = f31Var.f25874c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, f31Var.getWidth() - f10, f31Var.getHeight() - f10);
                float f11 = f31Var.f25873b;
                canvas.drawRoundRect(rectF, f11, f11, f31Var.f25878r);
                f31Var.f25878r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        dq dqVar = f31Var.G;
        if (dqVar != null && (b4Var = dqVar.f25446a) != null && b4Var.m() && f31Var.N != null) {
            return;
        }
        RectF rectF2 = f31Var.v;
        float f12 = f31Var.f25873b;
        canvas.drawRoundRect(rectF2, f12, f12, f31Var.f25879s);
    }
}
