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
public final class j21 {
    public final Paint f25261a;
    public final Paint f25262b;
    public final Paint f25263c;
    public Drawable d;
    public Drawable e;
    public final k21 f25264f;

    public j21(k21 k21Var) {
        this.f25264f = k21Var;
        Paint paint = new Paint(1);
        this.f25261a = paint;
        this.f25262b = new Paint(1);
        this.f25263c = new Paint(1);
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
        k21 k21Var = this.f25264f;
        ImageReceiver imageReceiver = k21Var.P;
        float f19 = k21Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = k21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = k21Var.R;
        float f20 = k21Var.d;
        float f21 = k21Var.f25608c;
        int i12 = k21Var.K;
        RectF rectF = k21Var.v;
        if (!k21Var.W && k21Var.f25615y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            lp lpVar = k21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) lpVar.f26155a.f18825f.get(lpVar.f26157c);
            if (k21Var.G.f26155a.m()) {
                i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, k21Var.f25614x);
            } else {
                i10 = c4Var.f18786j;
            }
            Paint paint = this.f25261a;
            paint.setColor(i10);
            paint.setAlpha((int) (k21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, k21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, k21Var.getWidth() - z10, k21Var.getHeight() - z10);
            float f22 = k21Var.f25606a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f25262b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f25263c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, k21Var.getWidth() - f21, k21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.d4 d4Var = k21Var.G.f26155a;
        if (d4Var != null) {
            if (d4Var.m()) {
                k21Var.G.f26155a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (k21Var.G.e != null) {
                        canvas.drawBitmap(k21Var.G.e, (k21Var.getWidth() - k21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * k21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(k21Var.getMeasuredWidth() - (k21Var.getMeasuredWidth() * 0.65f), dp, k21Var.getMeasuredWidth() - (k21Var.getMeasuredWidth() * 0.1f), k21Var.getMeasuredHeight() * 0.32f);
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
                    f5Var2.O = (int) (rectF.height() * f12);
                    f5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(k21Var.getMeasuredWidth() * 0.1f, k21Var.getMeasuredHeight() * 0.35f, k21Var.getMeasuredWidth() * 0.65f, k21Var.getMeasuredHeight() * 0.55f);
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
                    f5Var.O = (int) (rectF.height() * f12);
                    f5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (k21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = k21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (k21Var.T == null) {
            float f23 = k21Var.f25607b;
            canvas.drawRoundRect(rectF, f23, f23, k21Var.f25612s);
            canvas.save();
            noThemeStaticLayout = k21Var.getNoThemeStaticLayout();
            canvas.translate((k21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.d4 d4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        k21 k21Var = this.f25264f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(k21Var.f25613w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > k21Var.getWidth() / k21Var.getHeight()) {
                    int width = (int) ((k21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - k21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, k21Var.getHeight());
                } else {
                    int height = (int) ((k21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (k21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, k21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, k21Var.getWidth(), k21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof nc0) && (i10 = (iArr = ((nc0) drawable3).f26725a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = k21Var.f25611r.getAlpha();
                k21Var.f25611r.setAlpha((int) (alpha * f7));
                float f10 = k21Var.f25608c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, k21Var.getWidth() - f10, k21Var.getHeight() - f10);
                float f11 = k21Var.f25607b;
                canvas.drawRoundRect(rectF, f11, f11, k21Var.f25611r);
                k21Var.f25611r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        lp lpVar = k21Var.G;
        if (lpVar != null && (d4Var = lpVar.f26155a) != null && d4Var.m() && k21Var.N != null) {
            return;
        }
        RectF rectF2 = k21Var.v;
        float f12 = k21Var.f25607b;
        canvas.drawRoundRect(rectF2, f12, f12, k21Var.f25612s);
    }
}
