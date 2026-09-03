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
public final class v11 {
    public final Paint f31741a;
    public final Paint f31742b;
    public final Paint f31743c;
    public Drawable d;
    public Drawable f31744e;
    public final w11 f31745f;

    public v11(w11 w11Var) {
        this.f31745f = w11Var;
        Paint paint = new Paint(1);
        this.f31741a = paint;
        this.f31742b = new Paint(1);
        this.f31743c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        int i10;
        float f12;
        float f13;
        StaticLayout noThemeStaticLayout;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i11;
        float f19;
        w11 w11Var = this.f31745f;
        ImageReceiver imageReceiver = w11Var.M;
        float f20 = w11Var.f32604e;
        org.telegram.ui.ActionBar.h5 h5Var = w11Var.P;
        org.telegram.ui.ActionBar.h5 h5Var2 = w11Var.O;
        float f21 = w11Var.d;
        float f22 = w11Var.f32603c;
        int i12 = w11Var.H;
        RectF rectF = w11Var.v;
        if (!w11Var.T && w11Var.f32611y == null) {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        } else {
            lp lpVar = w11Var.D;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) lpVar.f28819a.f21364f.get(lpVar.f28821c);
            if (w11Var.D.f28819a.m()) {
                i10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, w11Var.f32610x);
            } else {
                i10 = e4Var.f21319j;
            }
            Paint paint = this.f31741a;
            paint.setColor(i10);
            paint.setAlpha((int) (w11Var.J * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float w10 = e2.c.w(1.0f, w11Var.J, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(w10, w10, w11Var.getWidth() - w10, w11Var.getHeight() - w10);
            float f23 = w11Var.f32601a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i13 = (int) (f10 * f11);
        Paint paint2 = this.f31742b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f31743c;
        paint3.setAlpha(i13);
        rectF.set(f22, f22, w11Var.getWidth() - f22, w11Var.getHeight() - f22);
        org.telegram.ui.ActionBar.f4 f4Var = w11Var.D.f28819a;
        if (f4Var != null) {
            if (f4Var.m()) {
                w11Var.D.f28819a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (w11Var.D.f28822e != null) {
                        canvas.drawBitmap(w11Var.D.f28822e, (w11Var.getWidth() - w11Var.D.f28822e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
                        return;
                    }
                    return;
                }
                float dp = AndroidUtilities.dp(8.0f) + f22;
                if (i12 == 3) {
                    f14 = 5.0f;
                } else {
                    f14 = 22.0f;
                }
                float dp2 = AndroidUtilities.dp(f14) + f22;
                if (i12 == 0 || i12 == 3) {
                    f15 = f20;
                    if (i12 == 3) {
                        f16 = 1.2f;
                    } else {
                        f16 = 1.0f;
                    }
                    rectF.set(dp2, dp, (f16 * f15) + dp2, dp + f21);
                } else {
                    dp = 0.12f * w11Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(w11Var.getMeasuredWidth() - (w11Var.getMeasuredWidth() * 0.65f), dp, w11Var.getMeasuredWidth() - (w11Var.getMeasuredWidth() * 0.1f), w11Var.getMeasuredHeight() * 0.32f);
                }
                if (i12 == 3) {
                    paint2 = paint3;
                }
                if (i12 == 0 || i12 == 3) {
                    f17 = f21;
                    f18 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint2);
                } else {
                    f18 = 2.0f;
                    f17 = f21;
                    h5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    h5Var2.O = (int) (rectF.height() * f13);
                    h5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(w11Var.getMeasuredWidth() * 0.1f, w11Var.getMeasuredHeight() * 0.35f, w11Var.getMeasuredWidth() * 0.65f, w11Var.getMeasuredHeight() * 0.55f);
                    i11 = 3;
                } else {
                    float dp3 = f22 + AndroidUtilities.dp(5.0f);
                    float dp4 = f17 + AndroidUtilities.dp(f12) + dp;
                    i11 = 3;
                    if (i12 == 3) {
                        f19 = 0.8f;
                    } else {
                        f19 = 1.0f;
                    }
                    rectF.set(dp3, dp4, (f15 * f19) + dp3, dp4 + f17);
                }
                if (i12 != 0 && i12 != i11) {
                    h5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f18), (int) rectF.right, AndroidUtilities.dp(f18) + ((int) rectF.bottom));
                    h5Var.O = (int) (rectF.height() * f13);
                    h5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (w11Var.R != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f31744e == null) {
                        this.f31744e = w11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f31744e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f31744e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (w11Var.Q == null) {
            float f24 = w11Var.f32602b;
            canvas.drawRoundRect(rectF, f24, f24, w11Var.f32608s);
            canvas.save();
            noThemeStaticLayout = w11Var.getNoThemeStaticLayout();
            canvas.translate((w11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        w11 w11Var = this.f31745f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(w11Var.f32609w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > w11Var.getWidth() / w11Var.getHeight()) {
                    int width = (int) ((w11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - w11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, w11Var.getHeight());
                } else {
                    int height = (int) ((w11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (w11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, w11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, w11Var.getWidth(), w11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof fc0) && (i10 = (iArr = ((fc0) drawable3).f26866a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = w11Var.f32607r.getAlpha();
                w11Var.f32607r.setAlpha((int) (alpha * f10));
                float f11 = w11Var.f32603c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, f11, w11Var.getWidth() - f11, w11Var.getHeight() - f11);
                float f12 = w11Var.f32602b;
                canvas.drawRoundRect(rectF, f12, f12, w11Var.f32607r);
                w11Var.f32607r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        lp lpVar = w11Var.D;
        if (lpVar != null && (f4Var = lpVar.f28819a) != null && f4Var.m() && w11Var.K != null) {
            return;
        }
        RectF rectF2 = w11Var.v;
        float f13 = w11Var.f32602b;
        canvas.drawRoundRect(rectF2, f13, f13, w11Var.f32608s);
    }
}
