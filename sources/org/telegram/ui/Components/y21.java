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
public final class y21 {
    public final Paint f33105a;
    public final Paint f33106b;
    public final Paint f33107c;
    public Drawable d;
    public Drawable f33108e;
    public final z21 f33109f;

    public y21(z21 z21Var) {
        this.f33109f = z21Var;
        Paint paint = new Paint(1);
        this.f33105a = paint;
        this.f33106b = new Paint(1);
        this.f33107c = new Paint(1);
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
        z21 z21Var = this.f33109f;
        ImageReceiver imageReceiver = z21Var.P;
        float f19 = z21Var.f33444e;
        org.telegram.ui.ActionBar.f5 f5Var = z21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = z21Var.R;
        float f20 = z21Var.d;
        float f21 = z21Var.f33443c;
        int i12 = z21Var.K;
        RectF rectF = z21Var.v;
        if (!z21Var.W && z21Var.f33451y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            bq bqVar = z21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) bqVar.f25082a.f20509f.get(bqVar.f25084c);
            if (z21Var.G.f25082a.m()) {
                i10 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, z21Var.f33450x);
            } else {
                i10 = b4Var.f20454j;
            }
            Paint paint = this.f33105a;
            paint.setColor(i10);
            paint.setAlpha((int) (z21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, z21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, z21Var.getWidth() - y3, z21Var.getHeight() - y3);
            float f22 = z21Var.f33441a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f33106b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f33107c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, z21Var.getWidth() - f21, z21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.c4 c4Var = z21Var.G.f25082a;
        if (c4Var != null) {
            if (c4Var.m()) {
                z21Var.G.f25082a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (z21Var.G.f25085e != null) {
                        canvas.drawBitmap(z21Var.G.f25085e, (z21Var.getWidth() - z21Var.G.f25085e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * z21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(z21Var.getMeasuredWidth() - (z21Var.getMeasuredWidth() * 0.65f), dp, z21Var.getMeasuredWidth() - (z21Var.getMeasuredWidth() * 0.1f), z21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(z21Var.getMeasuredWidth() * 0.1f, z21Var.getMeasuredHeight() * 0.35f, z21Var.getMeasuredWidth() * 0.65f, z21Var.getMeasuredHeight() * 0.55f);
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
                if (z21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f33108e == null) {
                        this.f33108e = z21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f33108e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f33108e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (z21Var.T == null) {
            float f23 = z21Var.f33442b;
            canvas.drawRoundRect(rectF, f23, f23, z21Var.f33448s);
            canvas.save();
            noThemeStaticLayout = z21Var.getNoThemeStaticLayout();
            canvas.translate((z21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        z21 z21Var = this.f33109f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(z21Var.f33449w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > z21Var.getWidth() / z21Var.getHeight()) {
                    int width = (int) ((z21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - z21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, z21Var.getHeight());
                } else {
                    int height = (int) ((z21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (z21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, z21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, z21Var.getWidth(), z21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cd0) && (i10 = (iArr = ((cd0) drawable3).f25329a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = z21Var.f33447r.getAlpha();
                z21Var.f33447r.setAlpha((int) (alpha * f7));
                float f10 = z21Var.f33443c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, z21Var.getWidth() - f10, z21Var.getHeight() - f10);
                float f11 = z21Var.f33442b;
                canvas.drawRoundRect(rectF, f11, f11, z21Var.f33447r);
                z21Var.f33447r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        bq bqVar = z21Var.G;
        if (bqVar != null && (c4Var = bqVar.f25082a) != null && c4Var.m() && z21Var.N != null) {
            return;
        }
        RectF rectF2 = z21Var.v;
        float f12 = z21Var.f33442b;
        canvas.drawRoundRect(rectF2, f12, f12, z21Var.f33448s);
    }
}
