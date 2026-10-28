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
public final class d31 {
    public final Paint f27332a;
    public final Paint f27333b;
    public final Paint f27334c;
    public Drawable d;
    public Drawable e;
    public final e31 f27335f;

    public d31(e31 e31Var) {
        this.f27335f = e31Var;
        Paint paint = new Paint(1);
        this.f27332a = paint;
        this.f27333b = new Paint(1);
        this.f27334c = new Paint(1);
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
        e31 e31Var = this.f27335f;
        ImageReceiver imageReceiver = e31Var.P;
        float f19 = e31Var.e;
        org.telegram.ui.ActionBar.l5 l5Var = e31Var.S;
        org.telegram.ui.ActionBar.l5 l5Var2 = e31Var.R;
        float f20 = e31Var.d;
        float f21 = e31Var.f27689c;
        int i12 = e31Var.K;
        RectF rectF = e31Var.v;
        if (!e31Var.W && e31Var.f27696y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            yp ypVar = e31Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) ypVar.f35124a.f22686f.get(ypVar.f35126c);
            if (e31Var.G.f35124a.l()) {
                i10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, e31Var.f27695x);
            } else {
                i10 = g4Var.f22657j;
            }
            Paint paint = this.f27332a;
            paint.setColor(i10);
            paint.setAlpha((int) (e31Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.h0.z(1.0f, e31Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, e31Var.getWidth() - z10, e31Var.getHeight() - z10);
            float f22 = e31Var.f27687a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f27333b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f27334c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, e31Var.getWidth() - f21, e31Var.getHeight() - f21);
        org.telegram.ui.ActionBar.h4 h4Var = e31Var.G.f35124a;
        if (h4Var != null) {
            if (h4Var.l()) {
                e31Var.G.f35124a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    e31Var.G.getClass();
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
                    dp = 0.12f * e31Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(e31Var.getMeasuredWidth() - (e31Var.getMeasuredWidth() * 0.65f), dp, e31Var.getMeasuredWidth() - (e31Var.getMeasuredWidth() * 0.1f), e31Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(e31Var.getMeasuredWidth() * 0.1f, e31Var.getMeasuredHeight() * 0.35f, e31Var.getMeasuredWidth() * 0.65f, e31Var.getMeasuredHeight() * 0.55f);
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
                if (e31Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = e31Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (e31Var.T == null) {
            float f23 = e31Var.f27688b;
            canvas.drawRoundRect(rectF, f23, f23, e31Var.f27693s);
            canvas.save();
            noThemeStaticLayout = e31Var.getNoThemeStaticLayout();
            canvas.translate((e31Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.h4 h4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        e31 e31Var = this.f27335f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(e31Var.f27694w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > e31Var.getWidth() / e31Var.getHeight()) {
                    int width = (int) ((e31Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - e31Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, e31Var.getHeight());
                } else {
                    int height = (int) ((e31Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (e31Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, e31Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, e31Var.getWidth(), e31Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof vc0) && (i10 = (iArr = ((vc0) drawable3).f33677a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = e31Var.f27692r.getAlpha();
                e31Var.f27692r.setAlpha((int) (alpha * f7));
                float f10 = e31Var.f27689c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, e31Var.getWidth() - f10, e31Var.getHeight() - f10);
                float f11 = e31Var.f27688b;
                canvas.drawRoundRect(rectF, f11, f11, e31Var.f27692r);
                e31Var.f27692r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        yp ypVar = e31Var.G;
        if (ypVar != null && (h4Var = ypVar.f35124a) != null && h4Var.l() && e31Var.N != null) {
            return;
        }
        RectF rectF2 = e31Var.v;
        float f12 = e31Var.f27688b;
        canvas.drawRoundRect(rectF2, f12, f12, e31Var.f27693s);
    }
}
