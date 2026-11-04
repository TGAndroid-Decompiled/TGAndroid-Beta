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
    public final Paint f40553a;
    public final Paint f40554b;
    public final Paint f40555c;
    public Drawable d;
    public Drawable f40556e;
    public final yz0 f40557f;

    public xz0(yz0 yz0Var) {
        this.f40557f = yz0Var;
        Paint paint = new Paint(1);
        this.f40553a = paint;
        this.f40554b = new Paint(1);
        this.f40555c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        int i3;
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
        yz0 yz0Var = this.f40557f;
        ImageReceiver imageReceiver = yz0Var.Q;
        float f20 = yz0Var.f40868e;
        org.telegram.ui.ActionBar.t4 t4Var = yz0Var.T;
        org.telegram.ui.ActionBar.t4 t4Var2 = yz0Var.S;
        float f21 = yz0Var.d;
        float f22 = yz0Var.f40867c;
        int i11 = yz0Var.L;
        RectF rectF = yz0Var.f40873w;
        if (!yz0Var.f40865a0 && yz0Var.E == null) {
            f13 = 0.5f;
            f11 = 255.0f;
            f12 = 4.0f;
        } else {
            uo uoVar = yz0Var.H;
            f11 = 255.0f;
            org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) uoVar.f38832a.f28423f.get(uoVar.f38834c);
            if (yz0Var.H.f38832a.l()) {
                i3 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, yz0Var.f40875y);
            } else {
                i3 = o3Var.f28389j;
            }
            Paint paint = this.f40553a;
            paint.setColor(i3);
            paint.setAlpha((int) (yz0Var.N * f10 * 255.0f));
            f12 = 4.0f;
            f13 = 0.5f;
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, yz0Var.N, org.telegram.messenger.g0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(y9, y9, yz0Var.getWidth() - y9, yz0Var.getHeight() - y9);
            float f23 = yz0Var.f40864a;
            canvas.drawRoundRect(rectF, f23, f23, paint);
        }
        int i12 = (int) (f10 * f11);
        Paint paint2 = this.f40554b;
        paint2.setAlpha(i12);
        Paint paint3 = this.f40555c;
        paint3.setAlpha(i12);
        rectF.set(f22, f22, yz0Var.getWidth() - f22, yz0Var.getHeight() - f22);
        org.telegram.ui.ActionBar.p3 p3Var = yz0Var.H.f38832a;
        if (p3Var != null) {
            if (p3Var.l()) {
                yz0Var.H.f38832a.getClass();
            } else if (i11 != 4) {
                if (i11 == 2) {
                    yz0Var.H.getClass();
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
                if (yz0Var.V != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f18) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f18);
                    rectF.set(height - org.telegram.messenger.g0.L(8.0f), centerY - org.telegram.messenger.g0.L(8.0f), height + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.f40556e == null) {
                        this.f40556e = yz0Var.getContext().getDrawable(2131231968).mutate();
                    }
                    int i13 = (int) height2;
                    int i14 = (int) centerY;
                    this.f40556e.setBounds(i13 - org.telegram.messenger.g0.L(8.0f), i14 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(8.0f) + i14);
                    this.f40556e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (yz0Var.U == null) {
            float f24 = yz0Var.f40866b;
            canvas.drawRoundRect(rectF, f24, f24, yz0Var.f40872s);
            canvas.save();
            noThemeStaticLayout = yz0Var.getNoThemeStaticLayout();
            canvas.translate((yz0Var.getWidth() - noThemeStaticLayout.getWidth()) * f13, org.telegram.messenger.g0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.p3 p3Var;
        int[] iArr;
        int i3;
        Drawable drawable = this.d;
        yz0 yz0Var = this.f40557f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(yz0Var.f40874x);
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
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof la0) && (i3 = (iArr = ((la0) drawable3).f35646a)[0]) == iArr[1] && i3 == iArr[2] && i3 == iArr[3])) {
                int alpha = yz0Var.f40871r.getAlpha();
                yz0Var.f40871r.setAlpha((int) (alpha * f10));
                float f11 = yz0Var.f40867c;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, f11, yz0Var.getWidth() - f11, yz0Var.getHeight() - f11);
                float f12 = yz0Var.f40866b;
                canvas.drawRoundRect(rectF, f12, f12, yz0Var.f40871r);
                yz0Var.f40871r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        uo uoVar = yz0Var.H;
        if (uoVar != null && (p3Var = uoVar.f38832a) != null && p3Var.l() && yz0Var.O != null) {
            return;
        }
        RectF rectF2 = yz0Var.f40873w;
        float f13 = yz0Var.f40866b;
        canvas.drawRoundRect(rectF2, f13, f13, yz0Var.f40872s);
    }
}
