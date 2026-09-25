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
public final class g21 {
    public final Paint f24340a;
    public final Paint f24341b;
    public final Paint f24342c;
    public Drawable d;
    public Drawable e;
    public final h21 f24343f;

    public g21(h21 h21Var) {
        this.f24343f = h21Var;
        Paint paint = new Paint(1);
        this.f24340a = paint;
        this.f24341b = new Paint(1);
        this.f24342c = new Paint(1);
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
        h21 h21Var = this.f24343f;
        ImageReceiver imageReceiver = h21Var.P;
        float f19 = h21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = h21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = h21Var.R;
        float f20 = h21Var.d;
        float f21 = h21Var.f24621c;
        int i12 = h21Var.K;
        RectF rectF = h21Var.v;
        if (!h21Var.W && h21Var.f24628y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            mp mpVar = h21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) mpVar.f26565a.f18760f.get(mpVar.f26567c);
            if (h21Var.G.f26565a.m()) {
                i10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, h21Var.f24627x);
            } else {
                i10 = a4Var.f18716j;
            }
            Paint paint = this.f24340a;
            paint.setColor(i10);
            paint.setAlpha((int) (h21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, h21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, h21Var.getWidth() - z10, h21Var.getHeight() - z10);
            float f22 = h21Var.f24619a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f24341b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f24342c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, h21Var.getWidth() - f21, h21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = h21Var.G.f26565a;
        if (b4Var != null) {
            if (b4Var.m()) {
                h21Var.G.f26565a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (h21Var.G.e != null) {
                        canvas.drawBitmap(h21Var.G.e, (h21Var.getWidth() - h21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * h21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(h21Var.getMeasuredWidth() - (h21Var.getMeasuredWidth() * 0.65f), dp, h21Var.getMeasuredWidth() - (h21Var.getMeasuredWidth() * 0.1f), h21Var.getMeasuredHeight() * 0.32f);
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
                    d5Var2.O = (int) (rectF.height() * f12);
                    d5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(h21Var.getMeasuredWidth() * 0.1f, h21Var.getMeasuredHeight() * 0.35f, h21Var.getMeasuredWidth() * 0.65f, h21Var.getMeasuredHeight() * 0.55f);
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
                    d5Var.O = (int) (rectF.height() * f12);
                    d5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (h21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = h21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (h21Var.T == null) {
            float f23 = h21Var.f24620b;
            canvas.drawRoundRect(rectF, f23, f23, h21Var.f24625s);
            canvas.save();
            noThemeStaticLayout = h21Var.getNoThemeStaticLayout();
            canvas.translate((h21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        h21 h21Var = this.f24343f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(h21Var.f24626w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > h21Var.getWidth() / h21Var.getHeight()) {
                    int width = (int) ((h21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - h21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, h21Var.getHeight());
                } else {
                    int height = (int) ((h21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (h21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, h21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, h21Var.getWidth(), h21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof mc0) && (i10 = (iArr = ((mc0) drawable3).f26432a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = h21Var.f24624r.getAlpha();
                h21Var.f24624r.setAlpha((int) (alpha * f7));
                float f10 = h21Var.f24621c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, h21Var.getWidth() - f10, h21Var.getHeight() - f10);
                float f11 = h21Var.f24620b;
                canvas.drawRoundRect(rectF, f11, f11, h21Var.f24624r);
                h21Var.f24624r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        mp mpVar = h21Var.G;
        if (mpVar != null && (b4Var = mpVar.f26565a) != null && b4Var.m() && h21Var.N != null) {
            return;
        }
        RectF rectF2 = h21Var.v;
        float f12 = h21Var.f24620b;
        canvas.drawRoundRect(rectF2, f12, f12, h21Var.f24625s);
    }
}
