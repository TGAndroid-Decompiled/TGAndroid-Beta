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
public final class i21 {
    public final Paint f24982a;
    public final Paint f24983b;
    public final Paint f24984c;
    public Drawable d;
    public Drawable e;
    public final j21 f24985f;

    public i21(j21 j21Var) {
        this.f24985f = j21Var;
        Paint paint = new Paint(1);
        this.f24982a = paint;
        this.f24983b = new Paint(1);
        this.f24984c = new Paint(1);
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
        j21 j21Var = this.f24985f;
        ImageReceiver imageReceiver = j21Var.P;
        float f19 = j21Var.e;
        org.telegram.ui.ActionBar.d5 d5Var = j21Var.S;
        org.telegram.ui.ActionBar.d5 d5Var2 = j21Var.R;
        float f20 = j21Var.d;
        float f21 = j21Var.f25295c;
        int i12 = j21Var.K;
        RectF rectF = j21Var.v;
        if (!j21Var.W && j21Var.f25302y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            np npVar = j21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) npVar.f26843a.f18759f.get(npVar.f26845c);
            if (j21Var.G.f26843a.m()) {
                i10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, j21Var.f25301x);
            } else {
                i10 = a4Var.f18715j;
            }
            Paint paint = this.f24982a;
            paint.setColor(i10);
            paint.setAlpha((int) (j21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, j21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, j21Var.getWidth() - z10, j21Var.getHeight() - z10);
            float f22 = j21Var.f25293a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f24983b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f24984c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, j21Var.getWidth() - f21, j21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = j21Var.G.f26843a;
        if (b4Var != null) {
            if (b4Var.m()) {
                j21Var.G.f26843a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (j21Var.G.e != null) {
                        canvas.drawBitmap(j21Var.G.e, (j21Var.getWidth() - j21Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * j21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(j21Var.getMeasuredWidth() - (j21Var.getMeasuredWidth() * 0.65f), dp, j21Var.getMeasuredWidth() - (j21Var.getMeasuredWidth() * 0.1f), j21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(j21Var.getMeasuredWidth() * 0.1f, j21Var.getMeasuredHeight() * 0.35f, j21Var.getMeasuredWidth() * 0.65f, j21Var.getMeasuredHeight() * 0.55f);
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
                if (j21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = j21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (j21Var.T == null) {
            float f23 = j21Var.f25294b;
            canvas.drawRoundRect(rectF, f23, f23, j21Var.f25299s);
            canvas.save();
            noThemeStaticLayout = j21Var.getNoThemeStaticLayout();
            canvas.translate((j21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        j21 j21Var = this.f24985f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(j21Var.f25300w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > j21Var.getWidth() / j21Var.getHeight()) {
                    int width = (int) ((j21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - j21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, j21Var.getHeight());
                } else {
                    int height = (int) ((j21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (j21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, j21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, j21Var.getWidth(), j21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof oc0) && (i10 = (iArr = ((oc0) drawable3).f27025a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = j21Var.f25298r.getAlpha();
                j21Var.f25298r.setAlpha((int) (alpha * f7));
                float f10 = j21Var.f25295c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, j21Var.getWidth() - f10, j21Var.getHeight() - f10);
                float f11 = j21Var.f25294b;
                canvas.drawRoundRect(rectF, f11, f11, j21Var.f25298r);
                j21Var.f25298r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        np npVar = j21Var.G;
        if (npVar != null && (b4Var = npVar.f26843a) != null && b4Var.m() && j21Var.N != null) {
            return;
        }
        RectF rectF2 = j21Var.v;
        float f12 = j21Var.f25294b;
        canvas.drawRoundRect(rectF2, f12, f12, j21Var.f25299s);
    }
}
