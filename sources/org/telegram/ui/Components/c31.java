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
public final class c31 {
    public final Paint f27048a;
    public final Paint f27049b;
    public final Paint f27050c;
    public Drawable d;
    public Drawable e;
    public final d31 f27051f;

    public c31(d31 d31Var) {
        this.f27051f = d31Var;
        Paint paint = new Paint(1);
        this.f27048a = paint;
        this.f27049b = new Paint(1);
        this.f27050c = new Paint(1);
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
        d31 d31Var = this.f27051f;
        ImageReceiver imageReceiver = d31Var.P;
        float f19 = d31Var.e;
        org.telegram.ui.ActionBar.l5 l5Var = d31Var.S;
        org.telegram.ui.ActionBar.l5 l5Var2 = d31Var.R;
        float f20 = d31Var.d;
        float f21 = d31Var.f27371c;
        int i12 = d31Var.K;
        RectF rectF = d31Var.v;
        if (!d31Var.W && d31Var.f27378y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            xp xpVar = d31Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) xpVar.f34790a.f22683f.get(xpVar.f34792c);
            if (d31Var.G.f34790a.l()) {
                i10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, d31Var.f27377x);
            } else {
                i10 = g4Var.f22654j;
            }
            Paint paint = this.f27048a;
            paint.setColor(i10);
            paint.setAlpha((int) (d31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.h0.z(1.0f, d31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, d31Var.getWidth() - z10, d31Var.getHeight() - z10);
            float f22 = d31Var.f27369a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f27049b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f27050c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, d31Var.getWidth() - f21, d31Var.getHeight() - f21);
        org.telegram.ui.ActionBar.h4 h4Var = d31Var.G.f34790a;
        if (h4Var != null) {
            if (h4Var.l()) {
                d31Var.G.f34790a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    d31Var.G.getClass();
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
                    dp = 0.12f * d31Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(d31Var.getMeasuredWidth() - (d31Var.getMeasuredWidth() * 0.65f), dp, d31Var.getMeasuredWidth() - (d31Var.getMeasuredWidth() * 0.1f), d31Var.getMeasuredHeight() * 0.32f);
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
                    l5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    l5Var2.Q = (int) (rectF.height() * f12);
                    l5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(d31Var.getMeasuredWidth() * 0.1f, d31Var.getMeasuredHeight() * 0.35f, d31Var.getMeasuredWidth() * 0.65f, d31Var.getMeasuredHeight() * 0.55f);
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
                    l5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    l5Var.Q = (int) (rectF.height() * f12);
                    l5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (d31Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = d31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (d31Var.T == null) {
            float f23 = d31Var.f27370b;
            canvas.drawRoundRect(rectF, f23, f23, d31Var.f27375s);
            canvas.save();
            noThemeStaticLayout = d31Var.getNoThemeStaticLayout();
            canvas.translate((d31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.h4 h4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        d31 d31Var = this.f27051f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(d31Var.f27376w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > d31Var.getWidth() / d31Var.getHeight()) {
                    int width = (int) ((d31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - d31Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, d31Var.getHeight());
                } else {
                    int height = (int) ((d31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (d31Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, d31Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, d31Var.getWidth(), d31Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof uc0) && (i10 = (iArr = ((uc0) drawable3).f33350a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = d31Var.f27374r.getAlpha();
                d31Var.f27374r.setAlpha((int) (alpha * f7));
                float f10 = d31Var.f27371c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, d31Var.getWidth() - f10, d31Var.getHeight() - f10);
                float f11 = d31Var.f27370b;
                canvas.drawRoundRect(rectF, f11, f11, d31Var.f27374r);
                d31Var.f27374r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        xp xpVar = d31Var.G;
        if (xpVar != null && (h4Var = xpVar.f34790a) != null && h4Var.l() && d31Var.N != null) {
            return;
        }
        RectF rectF2 = d31Var.v;
        float f12 = d31Var.f27370b;
        canvas.drawRoundRect(rectF2, f12, f12, d31Var.f27375s);
    }
}
