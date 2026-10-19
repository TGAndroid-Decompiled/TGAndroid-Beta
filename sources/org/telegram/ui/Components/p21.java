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
public final class p21 {
    public final Paint f29149a;
    public final Paint f29150b;
    public final Paint f29151c;
    public Drawable d;
    public Drawable e;
    public final q21 f29152f;

    public p21(q21 q21Var) {
        this.f29152f = q21Var;
        Paint paint = new Paint(1);
        this.f29149a = paint;
        this.f29150b = new Paint(1);
        this.f29151c = new Paint(1);
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
        q21 q21Var = this.f29152f;
        ImageReceiver imageReceiver = q21Var.P;
        float f19 = q21Var.e;
        org.telegram.ui.ActionBar.f5 f5Var = q21Var.S;
        org.telegram.ui.ActionBar.f5 f5Var2 = q21Var.R;
        float f20 = q21Var.d;
        float f21 = q21Var.f29495c;
        int i12 = q21Var.K;
        RectF rectF = q21Var.v;
        if (!q21Var.W && q21Var.f29502y == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            vp vpVar = q21Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) vpVar.f31898a.f20723f.get(vpVar.f31900c);
            if (q21Var.G.f31898a.l()) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, q21Var.f29501x);
            } else {
                i10 = b4Var.f20695j;
            }
            Paint paint = this.f29149a;
            paint.setColor(i10);
            paint.setAlpha((int) (q21Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, q21Var.M, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y3, y3, q21Var.getWidth() - y3, q21Var.getHeight() - y3);
            float f22 = q21Var.f29493a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f29150b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f29151c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, q21Var.getWidth() - f21, q21Var.getHeight() - f21);
        org.telegram.ui.ActionBar.c4 c4Var = q21Var.G.f31898a;
        if (c4Var != null) {
            if (c4Var.l()) {
                q21Var.G.f31898a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    q21Var.G.getClass();
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
                    dp = 0.12f * q21Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(q21Var.getMeasuredWidth() - (q21Var.getMeasuredWidth() * 0.65f), dp, q21Var.getMeasuredWidth() - (q21Var.getMeasuredWidth() * 0.1f), q21Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(q21Var.getMeasuredWidth() * 0.1f, q21Var.getMeasuredHeight() * 0.35f, q21Var.getMeasuredWidth() * 0.65f, q21Var.getMeasuredHeight() * 0.55f);
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
                if (q21Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.e == null) {
                        this.e = q21Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
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
        if (q21Var.T == null) {
            float f23 = q21Var.f29494b;
            canvas.drawRoundRect(rectF, f23, f23, q21Var.f29499s);
            canvas.save();
            noThemeStaticLayout = q21Var.getNoThemeStaticLayout();
            canvas.translate((q21Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.c4 c4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        q21 q21Var = this.f29152f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(q21Var.f29500w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > q21Var.getWidth() / q21Var.getHeight()) {
                    int width = (int) ((q21Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - q21Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, q21Var.getHeight());
                } else {
                    int height = (int) ((q21Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (q21Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, q21Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, q21Var.getWidth(), q21Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof wc0) && (i10 = (iArr = ((wc0) drawable3).f32077a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = q21Var.f29498r.getAlpha();
                q21Var.f29498r.setAlpha((int) (alpha * f7));
                float f10 = q21Var.f29495c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, q21Var.getWidth() - f10, q21Var.getHeight() - f10);
                float f11 = q21Var.f29494b;
                canvas.drawRoundRect(rectF, f11, f11, q21Var.f29498r);
                q21Var.f29498r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        vp vpVar = q21Var.G;
        if (vpVar != null && (c4Var = vpVar.f31898a) != null && c4Var.l() && q21Var.N != null) {
            return;
        }
        RectF rectF2 = q21Var.v;
        float f12 = q21Var.f29494b;
        canvas.drawRoundRect(rectF2, f12, f12, q21Var.f29499s);
    }
}
