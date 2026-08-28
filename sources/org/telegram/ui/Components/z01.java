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
public final class z01 {
    public final Paint f35143a;
    public final Paint f35144b;
    public final Paint f35145c;
    public Drawable d;
    public Drawable f35146e;
    public final a11 f35147f;

    public z01(a11 a11Var) {
        this.f35147f = a11Var;
        Paint paint = new Paint(1);
        this.f35143a = paint;
        this.f35144b = new Paint(1);
        this.f35145c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        int i9;
        float f12;
        float f13;
        StaticLayout noThemeStaticLayout;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        float f19;
        a11 a11Var = this.f35147f;
        ImageReceiver imageReceiver = a11Var.L;
        float f20 = a11Var.f26622e;
        org.telegram.ui.ActionBar.d5 d5Var = a11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = a11Var.N;
        float f21 = a11Var.d;
        float f22 = a11Var.f26621c;
        int i11 = a11Var.G;
        RectF rectF = a11Var.v;
        if (!a11Var.S && a11Var.f26629y == null) {
            f11 = 255.0f;
            f12 = 4.0f;
            f13 = 0.5f;
        } else {
            bp bpVar = a11Var.C;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) bpVar.f27261a.f22752f.get(bpVar.f27263c);
            if (a11Var.C.f27261a.m()) {
                i9 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, a11Var.f26628x);
            } else {
                i9 = a4Var.f22721j;
            }
            Paint paint = this.f35143a;
            paint.setColor(i9);
            paint.setAlpha((int) (a11Var.I * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z10 = e2.c.z(1.0f, a11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, a11Var.getWidth() - z10, a11Var.getHeight() - z10);
            float f23 = a11Var.f26619a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f35144b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f35145c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, a11Var.getWidth() - f22, a11Var.getHeight() - f22);
        org.telegram.ui.ActionBar.b4 b4Var = a11Var.C.f27261a;
        if (b4Var != null) {
            if (b4Var.m()) {
                a11Var.C.f27261a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    if (a11Var.C.f27264e != null) {
                        canvas.drawBitmap(a11Var.C.f27264e, (a11Var.getWidth() - a11Var.C.f27264e.getWidth()) * f13, AndroidUtilities.dp(21.0f), (Paint) null);
                        return;
                    }
                    return;
                }
                float dp = AndroidUtilities.dp(8.0f) + f22;
                if (i11 == 3) {
                    f14 = 5.0f;
                } else {
                    f14 = 22.0f;
                }
                float dp2 = AndroidUtilities.dp(f14) + f22;
                if (i11 == 0 || i11 == 3) {
                    f15 = f20;
                    if (i11 == 3) {
                        f16 = 1.2f;
                    } else {
                        f16 = 1.0f;
                    }
                    rectF.set(dp2, dp, (f16 * f15) + dp2, dp + f21);
                } else {
                    dp = 0.12f * a11Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(a11Var.getMeasuredWidth() - (a11Var.getMeasuredWidth() * 0.65f), dp, a11Var.getMeasuredWidth() - (a11Var.getMeasuredWidth() * 0.1f), a11Var.getMeasuredHeight() * 0.32f);
                }
                if (i11 == 3) {
                    paint2 = paint3;
                }
                if (i11 == 0 || i11 == 3) {
                    f17 = f21;
                    f18 = 2.0f;
                    canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint2);
                } else {
                    f18 = 2.0f;
                    f17 = f21;
                    d5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f12) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    d5Var2.O = (int) (rectF.height() * f13);
                    d5Var2.c(canvas, paint2);
                }
                if (i11 != 0 && i11 != 3) {
                    rectF.set(a11Var.getMeasuredWidth() * 0.1f, a11Var.getMeasuredHeight() * 0.35f, a11Var.getMeasuredWidth() * 0.65f, a11Var.getMeasuredHeight() * 0.55f);
                    i10 = 3;
                } else {
                    float dp3 = f22 + AndroidUtilities.dp(5.0f);
                    float dp4 = f17 + AndroidUtilities.dp(f12) + dp;
                    i10 = 3;
                    if (i11 == 3) {
                        f19 = 0.8f;
                    } else {
                        f19 = 1.0f;
                    }
                    rectF.set(dp3, dp4, (f15 * f19) + dp3, dp4 + f17);
                }
                if (i11 != 0 && i11 != i10) {
                    d5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f12), ((int) rectF.top) - AndroidUtilities.dp(f18), (int) rectF.right, AndroidUtilities.dp(f18) + ((int) rectF.bottom));
                    d5Var.O = (int) (rectF.height() * f13);
                    d5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (a11Var.Q != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f35146e == null) {
                        this.f35146e = a11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f35146e.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(8.0f) + i14);
                    this.f35146e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (a11Var.P == null) {
            float f24 = a11Var.f26620b;
            canvas.drawRoundRect(rectF, f24, f24, a11Var.f26626s);
            canvas.save();
            noThemeStaticLayout = a11Var.getNoThemeStaticLayout();
            canvas.translate((a11Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i9;
        Drawable drawable = this.d;
        a11 a11Var = this.f35147f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(a11Var.f26627w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > a11Var.getWidth() / a11Var.getHeight()) {
                    int width = (int) ((a11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - a11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, a11Var.getHeight());
                } else {
                    int height = (int) ((a11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (a11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, a11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, a11Var.getWidth(), a11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof jb0) && (i9 = (iArr = ((jb0) drawable3).f29686a)[0]) == iArr[1] && i9 == iArr[2] && i9 == iArr[3])) {
                int alpha = a11Var.f26625r.getAlpha();
                a11Var.f26625r.setAlpha((int) (alpha * f10));
                float f11 = a11Var.f26621c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, f11, a11Var.getWidth() - f11, a11Var.getHeight() - f11);
                float f12 = a11Var.f26620b;
                canvas.drawRoundRect(rectF, f12, f12, a11Var.f26625r);
                a11Var.f26625r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        bp bpVar = a11Var.C;
        if (bpVar != null && (b4Var = bpVar.f27261a) != null && b4Var.m() && a11Var.J != null) {
            return;
        }
        RectF rectF2 = a11Var.v;
        float f13 = a11Var.f26620b;
        canvas.drawRoundRect(rectF2, f13, f13, a11Var.f26626s);
    }
}
