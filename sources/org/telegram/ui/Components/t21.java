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
public final class t21 {
    public final Paint f30698a;
    public final Paint f30699b;
    public final Paint f30700c;
    public Drawable d;
    public Drawable e;
    public final u21 f30701f;

    public t21(u21 u21Var) {
        this.f30701f = u21Var;
        Paint paint = new Paint(1);
        this.f30698a = paint;
        this.f30699b = new Paint(1);
        this.f30700c = new Paint(1);
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
        u21 u21Var = this.f30701f;
        ImageReceiver imageReceiver = u21Var.P;
        float f19 = u21Var.e;
        org.telegram.ui.ActionBar.j5 j5Var = u21Var.S;
        org.telegram.ui.ActionBar.j5 j5Var2 = u21Var.R;
        float f20 = u21Var.d;
        float f21 = u21Var.f30995c;
        int i12 = u21Var.K;
        RectF rectF = u21Var.v;
        if (!u21Var.W && u21Var.f31002y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            tp tpVar = u21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) tpVar.f30871a.f20888f.get(tpVar.f30873c);
            if (u21Var.G.f30871a.l()) {
                i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, u21Var.f31001x);
            } else {
                i10 = e4Var.f20864j;
            }
            Paint paint = this.f30698a;
            paint.setColor(i10);
            paint.setAlpha((int) (u21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, u21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, u21Var.getWidth() - y3, u21Var.getHeight() - y3);
            float f22 = u21Var.f30993a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f30699b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f30700c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, u21Var.getWidth() - f21, u21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.f4 f4Var = u21Var.G.f30871a;
        if (f4Var != null) {
            if (f4Var.l()) {
                u21Var.G.f30871a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    u21Var.G.getClass();
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
                    dp = 0.12f * u21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(u21Var.getMeasuredWidth() - (u21Var.getMeasuredWidth() * 0.65f), dp, u21Var.getMeasuredWidth() - (u21Var.getMeasuredWidth() * 0.1f), u21Var.getMeasuredHeight() * 0.32f);
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
                    j5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    j5Var2.Q = (int) (rectF.height() * f12);
                    j5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(u21Var.getMeasuredWidth() * 0.1f, u21Var.getMeasuredHeight() * 0.35f, u21Var.getMeasuredWidth() * 0.65f, u21Var.getMeasuredHeight() * 0.55f);
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
                    j5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    j5Var.Q = (int) (rectF.height() * f12);
                    j5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (u21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = u21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (u21Var.T == null) {
            float f23 = u21Var.f30994b;
            canvas.drawRoundRect(rectF, f23, f23, u21Var.f30999s);
            canvas.save();
            noThemeStaticLayout = u21Var.getNoThemeStaticLayout();
            canvas.translate((u21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        u21 u21Var = this.f30701f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(u21Var.f31000w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > u21Var.getWidth() / u21Var.getHeight()) {
                    int width = (int) ((u21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - u21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, u21Var.getHeight());
                } else {
                    int height = (int) ((u21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (u21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, u21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, u21Var.getWidth(), u21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof wc0) && (i10 = (iArr = ((wc0) drawable3).f32189a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = u21Var.f30998r.getAlpha();
                u21Var.f30998r.setAlpha((int) (alpha * f7));
                float f10 = u21Var.f30995c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, u21Var.getWidth() - f10, u21Var.getHeight() - f10);
                float f11 = u21Var.f30994b;
                canvas.drawRoundRect(rectF, f11, f11, u21Var.f30998r);
                u21Var.f30998r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        tp tpVar = u21Var.G;
        if (tpVar != null && (f4Var = tpVar.f30871a) != null && f4Var.l() && u21Var.N != null) {
            return;
        }
        RectF rectF2 = u21Var.v;
        float f12 = u21Var.f30994b;
        canvas.drawRoundRect(rectF2, f12, f12, u21Var.f30999s);
    }
}
