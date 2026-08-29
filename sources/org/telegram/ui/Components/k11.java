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
public final class k11 {
    public final Paint f29884a;
    public final Paint f29885b;
    public final Paint f29886c;
    public Drawable d;
    public Drawable f29887e;
    public final l11 f29888f;

    public k11(l11 l11Var) {
        this.f29888f = l11Var;
        Paint paint = new Paint(1);
        this.f29884a = paint;
        this.f29885b = new Paint(1);
        this.f29886c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public final void a(Canvas canvas, float f9) {
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
        l11 l11Var = this.f29888f;
        ImageReceiver imageReceiver = l11Var.L;
        float f19 = l11Var.f30193e;
        org.telegram.ui.ActionBar.d5 d5Var = l11Var.O;
        org.telegram.ui.ActionBar.d5 d5Var2 = l11Var.N;
        float f20 = l11Var.d;
        float f21 = l11Var.f30192c;
        int i12 = l11Var.G;
        RectF rectF = l11Var.v;
        if (!l11Var.S && l11Var.f30200y == null) {
            f10 = 255.0f;
            f11 = 4.0f;
            f12 = 0.5f;
        } else {
            fp fpVar = l11Var.C;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) fpVar.f28512a.f22766f.get(fpVar.f28514c);
            if (l11Var.C.f28512a.m()) {
                i10 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, l11Var.f30199x);
            } else {
                i10 = a4Var.f22737j;
            }
            Paint paint = this.f29884a;
            paint.setColor(i10);
            paint.setAlpha((int) (l11Var.I * f9 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, l11Var.I, AndroidUtilities.dp(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, l11Var.getWidth() - z10, l11Var.getHeight() - z10);
            float f22 = l11Var.f30190a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f9 * f10);
        Paint paint2 = this.f29885b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f29886c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, l11Var.getWidth() - f21, l11Var.getHeight() - f21);
        org.telegram.ui.ActionBar.b4 b4Var = l11Var.C.f28512a;
        if (b4Var != null) {
            if (b4Var.m()) {
                l11Var.C.f28512a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    if (l11Var.C.f28515e != null) {
                        canvas.drawBitmap(l11Var.C.f28515e, (l11Var.getWidth() - l11Var.C.f28515e.getWidth()) * f12, AndroidUtilities.dp(21.0f), (Paint) null);
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
                    dp = 0.12f * l11Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(l11Var.getMeasuredWidth() - (l11Var.getMeasuredWidth() * 0.65f), dp, l11Var.getMeasuredWidth() - (l11Var.getMeasuredWidth() * 0.1f), l11Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(l11Var.getMeasuredWidth() * 0.1f, l11Var.getMeasuredHeight() * 0.35f, l11Var.getMeasuredWidth() * 0.65f, l11Var.getMeasuredHeight() * 0.55f);
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
                if (l11Var.Q != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - AndroidUtilities.dp(8.0f), centerY - AndroidUtilities.dp(8.0f), height + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + centerY);
                    imageReceiver.setImageCoords(rectF);
                    imageReceiver.draw(canvas);
                    if (this.f29887e == null) {
                        this.f29887e = l11Var.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.f29887e.setBounds(i14 - AndroidUtilities.dp(8.0f), i15 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
                    this.f29887e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (l11Var.P == null) {
            float f23 = l11Var.f30191b;
            canvas.drawRoundRect(rectF, f23, f23, l11Var.f30197s);
            canvas.save();
            noThemeStaticLayout = l11Var.getNoThemeStaticLayout();
            canvas.translate((l11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, AndroidUtilities.dp(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f9) {
        org.telegram.ui.ActionBar.b4 b4Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        l11 l11Var = this.f29888f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(l11Var.f30198w);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > l11Var.getWidth() / l11Var.getHeight()) {
                    int width = (int) ((l11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - l11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, l11Var.getHeight());
                } else {
                    int height = (int) ((l11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (l11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, l11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, l11Var.getWidth(), l11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f9));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof yb0) && (i10 = (iArr = ((yb0) drawable3).f35014a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = l11Var.f30196r.getAlpha();
                l11Var.f30196r.setAlpha((int) (alpha * f9));
                float f10 = l11Var.f30192c;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f10, l11Var.getWidth() - f10, l11Var.getHeight() - f10);
                float f11 = l11Var.f30191b;
                canvas.drawRoundRect(rectF, f11, f11, l11Var.f30196r);
                l11Var.f30196r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        fp fpVar = l11Var.C;
        if (fpVar != null && (b4Var = fpVar.f28512a) != null && b4Var.m() && l11Var.J != null) {
            return;
        }
        RectF rectF2 = l11Var.v;
        float f12 = l11Var.f30191b;
        canvas.drawRoundRect(rectF2, f12, f12, l11Var.f30197s);
    }
}
