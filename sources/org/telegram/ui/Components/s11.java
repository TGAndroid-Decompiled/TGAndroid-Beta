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
public final class s11 {
    public final Paint f30191a;
    public final Paint f30192b;
    public final Paint f30193c;
    public Drawable d;
    public Drawable f30194e;
    public final t11 f30195f;

    public s11(t11 t11Var) {
        this.f30195f = t11Var;
        Paint paint = new Paint(1);
        this.f30191a = paint;
        this.f30192b = new Paint(1);
        this.f30193c = new Paint(1);
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
        t11 t11Var = this.f30195f;
        ImageReceiver imageReceiver = t11Var.P;
        float f19 = t11Var.f30528e;
        org.telegram.ui.ActionBar.f5 f5Var = t11Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = t11Var.R;
        float f20 = t11Var.d;
        float f21 = t11Var.f30527c;
        int i12 = t11Var.K;
        RectF rectF = t11Var.v;
        if (!t11Var.W && t11Var.f30535y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            kp kpVar = t11Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) kpVar.f27909a.f20392f.get(kpVar.f27911c);
            if (t11Var.G.f27909a.m()) {
                i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, t11Var.f30534x);
            } else {
                i10 = c4Var.f20350j;
            }
            Paint paint = this.f30191a;
            paint.setColor(i10);
            paint.setAlpha((int) (t11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, t11Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, t11Var.getWidth() - z10, t11Var.getHeight() - z10);
            float f22 = t11Var.f30525a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f30192b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f30193c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, t11Var.getWidth() - f21, t11Var.getHeight() - f21);
        org.telegram.ui.ActionBar.d4 d4Var = t11Var.G.f27909a;
        if (d4Var != null) {
            if (d4Var.m()) {
                t11Var.G.f27909a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (t11Var.G.f27912e != null) {
                        canvas.drawBitmap(t11Var.G.f27912e, (t11Var.getWidth() - t11Var.G.f27912e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * t11Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(t11Var.getMeasuredWidth() - (t11Var.getMeasuredWidth() * 0.65f), dp, t11Var.getMeasuredWidth() - (t11Var.getMeasuredWidth() * 0.1f), t11Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(t11Var.getMeasuredWidth() * 0.1f, t11Var.getMeasuredHeight() * 0.35f, t11Var.getMeasuredWidth() * 0.65f, t11Var.getMeasuredHeight() * 0.55f);
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
                if (t11Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f30194e == null) {
                        this.f30194e = t11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f30194e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f30194e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (t11Var.T == null) {
            float f23 = t11Var.f30526b;
            canvas.drawRoundRect(rectF, f23, f23, t11Var.f30532s);
            canvas.save();
            noThemeStaticLayout = t11Var.getNoThemeStaticLayout();
            canvas.translate((t11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.d4 d4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        t11 t11Var = this.f30195f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(t11Var.f30533w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > t11Var.getWidth() / t11Var.getHeight()) {
                    int width = (int) ((t11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - t11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, t11Var.getHeight());
                } else {
                    int height = (int) ((t11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (t11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, t11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, t11Var.getWidth(), t11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof dc0) && (i10 = (iArr = ((dc0) drawable3).f25368a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = t11Var.f30531r.getAlpha();
                t11Var.f30531r.setAlpha((int) (alpha * f7));
                float f10 = t11Var.f30527c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, t11Var.getWidth() - f10, t11Var.getHeight() - f10);
                float f11 = t11Var.f30526b;
                canvas.drawRoundRect(rectF, f11, f11, t11Var.f30531r);
                t11Var.f30531r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        kp kpVar = t11Var.G;
        if (kpVar != null && (d4Var = kpVar.f27909a) != null && d4Var.m() && t11Var.N != null) {
            return;
        }
        RectF rectF2 = t11Var.v;
        float f12 = t11Var.f30526b;
        canvas.drawRoundRect(rectF2, f12, f12, t11Var.f30532s);
    }
}
