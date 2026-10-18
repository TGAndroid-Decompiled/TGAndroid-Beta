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
public final class o21 {
    public final Paint f28876a;
    public final Paint f28877b;
    public final Paint f28878c;
    public Drawable d;
    public Drawable e;
    public final p21 f28879f;

    public o21(p21 p21Var) {
        this.f28879f = p21Var;
        Paint paint = new Paint(1);
        this.f28876a = paint;
        this.f28877b = new Paint(1);
        this.f28878c = new Paint(1);
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
        p21 p21Var = this.f28879f;
        ImageReceiver imageReceiver = p21Var.P;
        float f19 = p21Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = p21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = p21Var.R;
        float f20 = p21Var.d;
        float f21 = p21Var.f29151c;
        int i12 = p21Var.K;
        RectF rectF = p21Var.v;
        if (!p21Var.W && p21Var.f29158y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            vp vpVar = p21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) vpVar.f31896a.f20729f.get(vpVar.f31898c);
            if (p21Var.G.f31896a.l()) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, p21Var.f29157x);
            } else {
                i10 = b4Var.f20701j;
            }
            Paint paint = this.f28876a;
            paint.setColor(i10);
            paint.setAlpha((int) (p21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, p21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, p21Var.getWidth() - y3, p21Var.getHeight() - y3);
            float f22 = p21Var.f29149a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f28877b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f28878c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, p21Var.getWidth() - f21, p21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.c4 c4Var = p21Var.G.f31896a;
        if (c4Var != null) {
            if (c4Var.l()) {
                p21Var.G.f31896a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    p21Var.G.getClass();
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
                    dp = 0.12f * p21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(p21Var.getMeasuredWidth() - (p21Var.getMeasuredWidth() * 0.65f), dp, p21Var.getMeasuredWidth() - (p21Var.getMeasuredWidth() * 0.1f), p21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(p21Var.getMeasuredWidth() * 0.1f, p21Var.getMeasuredHeight() * 0.35f, p21Var.getMeasuredWidth() * 0.65f, p21Var.getMeasuredHeight() * 0.55f);
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
                if (p21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = p21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (p21Var.T == null) {
            float f23 = p21Var.f29150b;
            canvas.drawRoundRect(rectF, f23, f23, p21Var.f29155s);
            canvas.save();
            noThemeStaticLayout = p21Var.getNoThemeStaticLayout();
            canvas.translate((p21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        p21 p21Var = this.f28879f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(p21Var.f29156w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > p21Var.getWidth() / p21Var.getHeight()) {
                    int width = (int) ((p21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - p21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, p21Var.getHeight());
                } else {
                    int height = (int) ((p21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (p21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, p21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, p21Var.getWidth(), p21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof wc0) && (i10 = (iArr = ((wc0) drawable3).f32087a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = p21Var.f29154r.getAlpha();
                p21Var.f29154r.setAlpha((int) (alpha * f7));
                float f10 = p21Var.f29151c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, p21Var.getWidth() - f10, p21Var.getHeight() - f10);
                float f11 = p21Var.f29150b;
                canvas.drawRoundRect(rectF, f11, f11, p21Var.f29154r);
                p21Var.f29154r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        vp vpVar = p21Var.G;
        if (vpVar != null && (c4Var = vpVar.f31896a) != null && c4Var.l() && p21Var.N != null) {
            return;
        }
        RectF rectF2 = p21Var.v;
        float f12 = p21Var.f29150b;
        canvas.drawRoundRect(rectF2, f12, f12, p21Var.f29155s);
    }
}
