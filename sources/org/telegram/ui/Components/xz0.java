package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class xz0 {
    public final Paint f40448a;
    public final Paint f40449b;
    public final Paint f40450c;
    public Drawable d;
    public Drawable f40451e;
    public final yz0 f40452f;

    public xz0(yz0 yz0Var) {
        this.f40452f = yz0Var;
        Paint paint = new Paint(1);
        this.f40448a = paint;
        this.f40449b = new Paint(1);
        this.f40450c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        int i7;
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
        yz0 yz0Var = this.f40452f;
        ImageReceiver imageReceiver = yz0Var.P;
        float f20 = yz0Var.f40764e;
        org.telegram.ui.ActionBar.t4 t4Var = yz0Var.S;
        org.telegram.ui.ActionBar.t4 t4Var2 = yz0Var.R;
        float f21 = yz0Var.d;
        float f22 = yz0Var.f40763c;
        int i11 = yz0Var.K;
        RectF rectF = yz0Var.f40769w;
        if (!yz0Var.W && yz0Var.D == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            uo uoVar = yz0Var.G;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) uoVar.f38697a.f28459f.get(uoVar.f38699c);
            if (yz0Var.G.f38697a.l()) {
                i7 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, yz0Var.f40771y);
            } else {
                i7 = q3Var.f28406j;
            }
            Paint paint = this.f40448a;
            paint.setColor(i7);
            paint.setAlpha((int) (yz0Var.M * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, yz0Var.M, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z9, z9, yz0Var.getWidth() - z9, yz0Var.getHeight() - z9);
            float f23 = yz0Var.f40761a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f40449b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f40450c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, yz0Var.getWidth() - f22, yz0Var.getHeight() - f22);
        org.telegram.ui.ActionBar.r3 r3Var = yz0Var.G.f38697a;
        if (r3Var != null) {
            if (r3Var.l()) {
                yz0Var.G.f38697a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    yz0Var.G.getClass();
                    return;
                }
                float L = org.telegram.messenger.g0.L(8.0f) + f22;
                if (i11 == 3) {
                    f14 = 5.0f;
                } else {
                    f14 = 22.0f;
                }
                float L2 = org.telegram.messenger.g0.L(f14) + f22;
                if (i11 == 0 || i11 == 3) {
                    f15 = f20;
                    if (i11 == 3) {
                        f16 = 1.2f;
                    } else {
                        f16 = 1.0f;
                    }
                    rectF.set(L2, L, (f16 * f15) + L2, L + f21);
                } else {
                    L = 0.12f * yz0Var.getMeasuredHeight();
                    f15 = f20;
                    rectF.set(yz0Var.getMeasuredWidth() - (yz0Var.getMeasuredWidth() * 0.65f), L, yz0Var.getMeasuredWidth() - (yz0Var.getMeasuredWidth() * 0.1f), yz0Var.getMeasuredHeight() * 0.32f);
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
                    t4Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(f12) + ((int) rectF.right), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.bottom));
                    t4Var2.Q = (int) (rectF.height() * f13);
                    t4Var2.c(canvas, paint2);
                }
                if (i11 != 0 && i11 != 3) {
                    rectF.set(yz0Var.getMeasuredWidth() * 0.1f, yz0Var.getMeasuredHeight() * 0.35f, yz0Var.getMeasuredWidth() * 0.65f, yz0Var.getMeasuredHeight() * 0.55f);
                    i10 = 3;
                } else {
                    float L3 = f22 + org.telegram.messenger.g0.L(5.0f);
                    float L4 = f17 + org.telegram.messenger.g0.L(f12) + L;
                    i10 = 3;
                    if (i11 == 3) {
                        f19 = 0.8f;
                    } else {
                        f19 = 1.0f;
                    }
                    rectF.set(L3, L4, (f15 * f19) + L3, L4 + f17);
                }
                if (i11 != 0 && i11 != i10) {
                    t4Var.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(f12), ((int) rectF.top) - org.telegram.messenger.g0.L(f18), (int) rectF.right, org.telegram.messenger.g0.L(f18) + ((int) rectF.bottom));
                    t4Var.Q = (int) (rectF.height() * f13);
                    t4Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f13, rectF.height() * f13, paint3);
                if (yz0Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f40451e == null) {
                        this.f40451e = yz0Var.getContext().getDrawable(2131231968).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f40451e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f40451e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (yz0Var.T == null) {
            float f24 = yz0Var.f40762b;
            canvas.drawRoundRect(rectF, f24, f24, yz0Var.f40768s);
            canvas.save();
            noThemeStaticLayout = yz0Var.getNoThemeStaticLayout();
            canvas.translate((yz0Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.r3 r3Var;
        int[] iArr;
        int i7;
        Drawable drawable = this.d;
        yz0 yz0Var = this.f40452f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(yz0Var.f40770x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > yz0Var.getWidth() / yz0Var.getHeight()) {
                    int width = (int) ((yz0Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - yz0Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, yz0Var.getHeight());
                } else {
                    int height = (int) ((yz0Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (yz0Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, yz0Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, yz0Var.getWidth(), yz0Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f10));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof qa0) && (i7 = (iArr = ((qa0) drawable3).f37333a)[0]) == iArr[1] && i7 == iArr[2] && i7 == iArr[3])) {
                int alpha = yz0Var.f40767r.getAlpha();
                yz0Var.f40767r.setAlpha((int) (alpha * f10));
                float f11 = yz0Var.f40763c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, yz0Var.getWidth() - f11, yz0Var.getHeight() - f11);
                float f12 = yz0Var.f40762b;
                canvas.drawRoundRect(rectF, f12, f12, yz0Var.f40767r);
                yz0Var.f40767r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        uo uoVar = yz0Var.G;
        if (uoVar != null && (r3Var = uoVar.f38697a) != null && r3Var.l() && yz0Var.N != null) {
            return;
        }
        RectF rectF2 = yz0Var.f40769w;
        float f13 = yz0Var.f40762b;
        canvas.drawRoundRect(rectF2, f13, f13, yz0Var.f40768s);
    }
}
