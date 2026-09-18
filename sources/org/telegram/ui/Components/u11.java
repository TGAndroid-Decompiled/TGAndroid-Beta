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
public final class u11 {
    public final Paint f28247a;
    public final Paint f28248b;
    public final Paint f28249c;
    public Drawable d;
    public Drawable e;
    public final v11 f28250f;

    public u11(v11 v11Var) {
        this.f28250f = v11Var;
        Paint paint = new Paint(1);
        this.f28247a = paint;
        this.f28248b = new Paint(1);
        this.f28249c = new Paint(1);
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
        v11 v11Var = this.f28250f;
        ImageReceiver imageReceiver = v11Var.P;
        float f19 = v11Var.e;
        org.telegram.ui.ActionBar.g5 g5Var = v11Var.S;
        org.telegram.ui.ActionBar.g5 g5Var2 = v11Var.R;
        float f20 = v11Var.d;
        float f21 = v11Var.f28566c;
        int i12 = v11Var.K;
        RectF rectF = v11Var.v;
        if (!v11Var.W && v11Var.f28573y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            lp lpVar = v11Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) lpVar.f25957a.f18621f.get(lpVar.f25959c);
            if (v11Var.G.f25957a.m()) {
                i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, v11Var.f28572x);
            } else {
                i10 = d4Var.f18581j;
            }
            Paint paint = this.f28247a;
            paint.setColor(i10);
            paint.setAlpha((int) (v11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, v11Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, v11Var.getWidth() - z10, v11Var.getHeight() - z10);
            float f22 = v11Var.f28564a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f28248b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f28249c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, v11Var.getWidth() - f21, v11Var.getHeight() - f21);
        org.telegram.ui.ActionBar.e4 e4Var = v11Var.G.f25957a;
        if (e4Var != null) {
            if (e4Var.m()) {
                v11Var.G.f25957a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (v11Var.G.e != null) {
                        canvas.drawBitmap(v11Var.G.e, (v11Var.getWidth() - v11Var.G.e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * v11Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(v11Var.getMeasuredWidth() - (v11Var.getMeasuredWidth() * 0.65f), dp, v11Var.getMeasuredWidth() - (v11Var.getMeasuredWidth() * 0.1f), v11Var.getMeasuredHeight() * 0.32f);
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
                    g5Var2.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f11) + ((int) rectF.right), AndroidUtilities.dp(2.0f) + ((int) rectF.bottom));
                    g5Var2.O = (int) (rectF.height() * f12);
                    g5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(v11Var.getMeasuredWidth() * 0.1f, v11Var.getMeasuredHeight() * 0.35f, v11Var.getMeasuredWidth() * 0.65f, v11Var.getMeasuredHeight() * 0.55f);
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
                    g5Var.setBounds(((int) rectF.left) - AndroidUtilities.dp(f11), ((int) rectF.top) - AndroidUtilities.dp(f17), (int) rectF.right, AndroidUtilities.dp(f17) + ((int) rectF.bottom));
                    g5Var.O = (int) (rectF.height() * f12);
                    g5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (v11Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = v11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (v11Var.T == null) {
            float f23 = v11Var.f28565b;
            canvas.drawRoundRect(rectF, f23, f23, v11Var.f28570s);
            canvas.save();
            noThemeStaticLayout = v11Var.getNoThemeStaticLayout();
            canvas.translate((v11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.e4 e4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        v11 v11Var = this.f28250f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(v11Var.f28571w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > v11Var.getWidth() / v11Var.getHeight()) {
                    int width = (int) ((v11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - v11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, v11Var.getHeight());
                } else {
                    int height = (int) ((v11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (v11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, v11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, v11Var.getWidth(), v11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof cc0) && (i10 = (iArr = ((cc0) drawable3).f22998a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = v11Var.f28569r.getAlpha();
                v11Var.f28569r.setAlpha((int) (alpha * f7));
                float f10 = v11Var.f28566c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, v11Var.getWidth() - f10, v11Var.getHeight() - f10);
                float f11 = v11Var.f28565b;
                canvas.drawRoundRect(rectF, f11, f11, v11Var.f28569r);
                v11Var.f28569r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        lp lpVar = v11Var.G;
        if (lpVar != null && (e4Var = lpVar.f25957a) != null && e4Var.m() && v11Var.N != null) {
            return;
        }
        RectF rectF2 = v11Var.v;
        float f12 = v11Var.f28565b;
        canvas.drawRoundRect(rectF2, f12, f12, v11Var.f28570s);
    }
}
