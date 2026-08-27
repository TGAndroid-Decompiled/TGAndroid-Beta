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

public final class a11 {

    public final Paint f26593a;

    public final Paint f26594b;

    public final Paint f26595c;
    public Drawable d;

    public Drawable f26596e;

    public final b11 f26597f;

    public a11(b11 b11Var) {
        this.f26597f = b11Var;
        Paint paint = new Paint(1);
        this.f26593a = paint;
        this.f26594b = new Paint(1);
        this.f26595c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        b11 b11Var = this.f26597f;
        ImageReceiver imageReceiver = b11Var.L;
        float f16 = b11Var.f26882e;
        org.telegram.ui.ActionBar.d5 d5Var = b11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = b11Var.N;
        float f17 = b11Var.d;
        float f18 = b11Var.f26881c;
        int i11 = b11Var.G;
        RectF rectF = b11Var.v;
        if (b11Var.S || b11Var.f26889y != null) {
            zo zoVar = b11Var.C;
            f11 = 255.0f;
            int iV0 = b11Var.C.f35316a.m() ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, b11Var.f26888x) : ((org.telegram.ui.ActionBar.a4) zoVar.f35316a.f22784f.get(zoVar.f35318c)).f22717j;
            Paint paint = this.f26593a;
            paint.setColor(iV0);
            paint.setAlpha((int) (b11Var.I * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, b11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(fZ, fZ, b11Var.getWidth() - fZ, b11Var.getHeight() - fZ);
            float f19 = b11Var.f26879a;
            canvas.drawRoundRect(rectF, f19, f19, paint);
        } else {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f26594b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f26595c;
        paint3.setAlpha(i12);
        rectF.set(f18, f18, b11Var.getWidth() - f18, b11Var.getHeight() - f18);
        org.telegram.ui.ActionBar.b4 b4Var = b11Var.C.f35316a;
        if (b4Var != null) {
            if (!b4Var.m()) {
                if (i11 != 4) {
                    if (i11 == 2) {
                        if (b11Var.C.f35319e != null) {
                            canvas.drawBitmap(b11Var.C.f35319e, (b11Var.getWidth() - b11Var.C.f35319e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
                            return;
                        }
                        return;
                    }
                    float fDp = AndroidUtilities.dp(8.0f) + f18;
                    float fDp2 = AndroidUtilities.dp(i11 == 3 ? 5.0f : 22.0f) + f18;
                    if (i11 == 0 || i11 == 3) {
                        f14 = f16;
                        rectF.set(fDp2, fDp, ((i11 == 3 ? 1.2f : 1.0f) * f14) + fDp2, fDp + f17);
                    } else {
                        fDp = 0.12f * b11Var.getMeasuredHeight();
                        f14 = f16;
                        rectF.set(b11Var.getMeasuredWidth() - (b11Var.getMeasuredWidth() * 0.65f), fDp, b11Var.getMeasuredWidth() - (b11Var.getMeasuredWidth() * 0.1f), b11Var.getMeasuredHeight() * 0.32f);
                    }
                    if (i11 == 3) {
                        paint2 = paint3;
                    }
                    if (i11 == 0 || i11 == 3) {
                        f15 = 2.0f;
                        canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint2);
                    } else {
                        f15 = 2.0f;
                        d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                        d5Var2.O = (int) (rectF.height() * f13);
                        d5Var2.c(canvas, paint2);
                    }
                    if (i11 == 0 || i11 == 3) {
                        float fDp3 = f18 + AndroidUtilities.dp(5.0f);
                        float fDp4 = f17 + AndroidUtilities.dp(f12) + fDp;
                        i10 = 3;
                        rectF.set(fDp3, fDp4, (f14 * (i11 == 3 ? 0.8f : 1.0f)) + fDp3, fDp4 + f17);
                    } else {
                        rectF.set(b11Var.getMeasuredWidth() * 0.1f, b11Var.getMeasuredHeight() * 0.35f, b11Var.getMeasuredWidth() * 0.65f, b11Var.getMeasuredHeight() * 0.55f);
                        i10 = 3;
                    }
                    if (i11 != 0 && i11 != i10) {
                        d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f15), (int) rectF.right, AndroidUtilities.dp(f15) + ((int) rectF.bottom));
                        d5Var.O = (int) (rectF.height() * f13);
                        d5Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                    if (b11Var.Q != 0) {
                        float fCenterY = rectF.centerY();
                        float fHeight = (rectF.height() / f15) + rectF.left;
                        float fHeight2 = rectF.right - (rectF.height() / f15);
                        rectF.set(fHeight - AndroidUtilities.dp(8.0f), fCenterY - AndroidUtilities.dp(8.0f), fHeight + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + fCenterY);
                        imageReceiver.setImageCoords(rectF);
                        imageReceiver.draw(canvas);
                        if (this.f26596e == null) {
                            this.f26596e = b11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                        }
                        int i13 = (int) fHeight2;
                        int i14 = (int) fCenterY;
                        this.f26596e.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(8.0f) + i14);
                        this.f26596e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            b11Var.C.f35316a.getClass();
        }
        if (b11Var.P == null) {
            float f20 = b11Var.f26880b;
            canvas.drawRoundRect(rectF, f20, f20, b11Var.f26886s);
            canvas.save();
            StaticLayout noThemeStaticLayout = b11Var.getNoThemeStaticLayout();
            canvas.translate((b11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        b11 b11Var = this.f26597f;
        if (drawable == null) {
            zo zoVar = b11Var.C;
            if (zoVar == null || (b4Var = zoVar.f35316a) == null || !b4Var.m() || b11Var.J == null) {
                RectF rectF = b11Var.v;
                float f11 = b11Var.f26880b;
                canvas.drawRoundRect(rectF, f11, f11, b11Var.f26886s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(b11Var.f26887w);
        Drawable drawable2 = this.d;
        if (drawable2 instanceof BitmapDrawable) {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > b11Var.getWidth() / b11Var.getHeight()) {
                int width = (int) ((b11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - b11Var.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, b11Var.getHeight());
            } else {
                int height = (int) ((b11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (b11Var.getHeight() - height) / 2;
                this.d.setBounds(0, height2, b11Var.getWidth(), height + height2);
            }
        } else {
            drawable2.setBounds(0, 0, b11Var.getWidth(), b11Var.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f10));
        this.d.draw(canvas);
        Drawable drawable3 = this.d;
        if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof nb0) && (i10 = (iArr = ((nb0) drawable3).f30917a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
            int alpha = b11Var.f26885r.getAlpha();
            b11Var.f26885r.setAlpha((int) (alpha * f10));
            float f12 = b11Var.f26881c;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f12, f12, b11Var.getWidth() - f12, b11Var.getHeight() - f12);
            float f13 = b11Var.f26880b;
            canvas.drawRoundRect(rectF2, f13, f13, b11Var.f26885r);
            b11Var.f26885r.setAlpha(alpha);
        }
        canvas.restore();
    }
}
