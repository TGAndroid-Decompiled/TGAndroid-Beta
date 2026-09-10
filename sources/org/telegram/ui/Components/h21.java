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
public final class h21 {
    public final Paint f23503a;
    public final Paint f23504b;
    public final Paint f23505c;
    public Drawable d;
    public Drawable e;
    public final i21 f23506f;

    public h21(i21 i21Var) {
        this.f23506f = i21Var;
        Paint paint = new Paint(1);
        this.f23503a = paint;
        this.f23504b = new Paint(1);
        this.f23505c = new Paint(1);
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
        i21 i21Var = this.f23506f;
        ImageReceiver imageReceiver = i21Var.P;
        float f19 = i21Var.e;
        org.telegram.ui.ActionBar.h5 h5Var = i21Var.S;
        org.telegram.ui.ActionBar.h5 h5Var2 = i21Var.R;
        float f20 = i21Var.d;
        float f21 = i21Var.f23877c;
        int i12 = i21Var.K;
        RectF rectF = i21Var.v;
        if (!i21Var.W && i21Var.f23884y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            rp rpVar = i21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) rpVar.f26733a.f17717f.get(rpVar.f26735c);
            if (i21Var.G.f26733a.m()) {
                i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, i21Var.f23883x);
            } else {
                i10 = e4Var.f17676j;
            }
            Paint paint = this.f23503a;
            paint.setColor(i10);
            paint.setAlpha((int) (i21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, i21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, i21Var.getWidth() - z10, i21Var.getHeight() - z10);
            float f22 = i21Var.f23875a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f23504b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f23505c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, i21Var.getWidth() - f21, i21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.f4 f4Var = i21Var.G.f26733a;
        if (f4Var != null) {
            if (f4Var.m()) {
                i21Var.G.f26733a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (i21Var.G.e != null) {
                        canvas.drawBitmap(i21Var.G.e, (i21Var.getWidth() - i21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * i21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(i21Var.getMeasuredWidth() - (i21Var.getMeasuredWidth() * 0.65f), dp, i21Var.getMeasuredWidth() - (i21Var.getMeasuredWidth() * 0.1f), i21Var.getMeasuredHeight() * 0.32f);
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
                    h5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    h5Var2.O = (int) (rectF.height() * f12);
                    h5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(i21Var.getMeasuredWidth() * 0.1f, i21Var.getMeasuredHeight() * 0.35f, i21Var.getMeasuredWidth() * 0.65f, i21Var.getMeasuredHeight() * 0.55f);
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
                    h5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    h5Var.O = (int) (rectF.height() * f12);
                    h5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (i21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = i21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (i21Var.T == null) {
            float f23 = i21Var.f23876b;
            canvas.drawRoundRect(rectF, f23, f23, i21Var.f23881s);
            canvas.save();
            noThemeStaticLayout = i21Var.getNoThemeStaticLayout();
            canvas.translate((i21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.f4 f4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        i21 i21Var = this.f23506f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(i21Var.f23882w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > i21Var.getWidth() / i21Var.getHeight()) {
                    int width = (int) ((i21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - i21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, i21Var.getHeight());
                } else {
                    int height = (int) ((i21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (i21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, i21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, i21Var.getWidth(), i21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof lc0) && (i10 = (iArr = ((lc0) drawable3).f24938a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = i21Var.f23880r.getAlpha();
                i21Var.f23880r.setAlpha((int) (alpha * f7));
                float f10 = i21Var.f23877c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, i21Var.getWidth() - f10, i21Var.getHeight() - f10);
                float f11 = i21Var.f23876b;
                canvas.drawRoundRect(rectF, f11, f11, i21Var.f23880r);
                i21Var.f23880r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        rp rpVar = i21Var.G;
        if (rpVar != null && (f4Var = rpVar.f26733a) != null && f4Var.m() && i21Var.N != null) {
            return;
        }
        RectF rectF2 = i21Var.v;
        float f12 = i21Var.f23876b;
        canvas.drawRoundRect(rectF2, f12, f12, i21Var.f23881s);
    }
}
