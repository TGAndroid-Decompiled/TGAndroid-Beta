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
public final class w11 {
    public final Paint f32604a;
    public final Paint f32605b;
    public final Paint f32606c;
    public Drawable d;
    public Drawable f32607e;
    public final x11 f32608f;

    public w11(x11 x11Var) {
        this.f32608f = x11Var;
        Paint paint = new Paint(1);
        this.f32604a = paint;
        this.f32605b = new Paint(1);
        this.f32606c = new Paint(1);
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
        x11 x11Var = this.f32608f;
        ImageReceiver imageReceiver = x11Var.M;
        float f20 = x11Var.f32910e;
        org.telegram.ui.ActionBar.h5 h5Var = x11Var.P;
        org.telegram.ui.ActionBar.h5 h5Var2 = x11Var.O;
        float f21 = x11Var.d;
        float f22 = x11Var.f32909c;
        int i12 = x11Var.H;
        RectF rectF = x11Var.v;
        if (!x11Var.T && x11Var.f32917y == null) {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        } else {
            lp lpVar = x11Var.D;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) lpVar.f28796a.f21362f.get(lpVar.f28798c);
            if (x11Var.D.f28796a.m()) {
                i10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, x11Var.f32916x);
            } else {
                i10 = e4Var.f21317j;
            }
            Paint paint = this.f32604a;
            paint.setColor(i10);
            paint.setAlpha((int) (x11Var.J * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float w10 = e2.c.w(1.0f, x11Var.J, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(w10, w10, x11Var.getWidth() - w10, x11Var.getHeight() - w10);
            float f23 = x11Var.f32907a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i13 = (int) (f10 * f11);
        Paint paint2 = this.f32605b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f32606c;
        paint3.setAlpha(i13);
        rectF.set(f22, f22, x11Var.getWidth() - f22, x11Var.getHeight() - f22);
        org.telegram.ui.ActionBar.f4 f4Var = x11Var.D.f28796a;
        if (f4Var != null) {
            if (f4Var.m()) {
                x11Var.D.f28796a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (x11Var.D.f28799e != null) {
                        canvas.drawBitmap(x11Var.D.f28799e, (x11Var.getWidth() - x11Var.D.f28799e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * x11Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(x11Var.getMeasuredWidth() - (x11Var.getMeasuredWidth() * 0.65f), dp, x11Var.getMeasuredWidth() - (x11Var.getMeasuredWidth() * 0.1f), x11Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(x11Var.getMeasuredWidth() * 0.1f, x11Var.getMeasuredHeight() * 0.35f, x11Var.getMeasuredWidth() * 0.65f, x11Var.getMeasuredHeight() * 0.55f);
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
                if (x11Var.R != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f32607e == null) {
                        this.f32607e = x11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f32607e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f32607e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (x11Var.Q == null) {
            float f24 = x11Var.f32908b;
            canvas.drawRoundRect(rectF, f24, f24, x11Var.f32914s);
            canvas.save();
            noThemeStaticLayout = x11Var.getNoThemeStaticLayout();
            canvas.translate((x11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        x11 x11Var = this.f32608f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(x11Var.f32915w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > x11Var.getWidth() / x11Var.getHeight()) {
                    int width = (int) ((x11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - x11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, x11Var.getHeight());
                } else {
                    int height = (int) ((x11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (x11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, x11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, x11Var.getWidth(), x11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof fc0) && (i10 = (iArr = ((fc0) drawable3).f26867a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = x11Var.f32913r.getAlpha();
                x11Var.f32913r.setAlpha((int) (alpha * f10));
                float f11 = x11Var.f32909c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, f11, x11Var.getWidth() - f11, x11Var.getHeight() - f11);
                float f12 = x11Var.f32908b;
                canvas.drawRoundRect(rectF, f12, f12, x11Var.f32913r);
                x11Var.f32913r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        lp lpVar = x11Var.D;
        if (lpVar != null && (f4Var = lpVar.f28796a) != null && f4Var.m() && x11Var.K != null) {
            return;
        }
        RectF rectF2 = x11Var.v;
        float f13 = x11Var.f32908b;
        canvas.drawRoundRect(rectF2, f13, f13, x11Var.f32914s);
    }
}
