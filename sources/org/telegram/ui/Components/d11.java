package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class d11 {
    public final Paint f25257a;
    public final Paint f25258b;
    public final Paint f25259c;
    public Drawable d;
    public Drawable e;
    public final e11 f25260f;

    public d11(e11 e11Var) {
        this.f25260f = e11Var;
        Paint paint = new Paint(1);
        this.f25257a = paint;
        this.f25258b = new Paint(1);
        this.f25259c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
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
        e11 e11Var = this.f25260f;
        ImageReceiver imageReceiver = e11Var.P;
        float f19 = e11Var.e;
        org.telegram.ui.ActionBar.c5 c5Var = e11Var.S;
        org.telegram.ui.ActionBar.c5 c5Var2 = e11Var.R;
        float f20 = e11Var.d;
        float f21 = e11Var.f25612c;
        int i12 = e11Var.K;
        RectF rectF = e11Var.f25617w;
        if (!e11Var.W && e11Var.D == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            cp cpVar = e11Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) cpVar.f25123a.f21561f.get(cpVar.f25125c);
            if (e11Var.G.f25123a.l()) {
                i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, e11Var.f25619y);
            } else {
                i10 = x3Var.f21521j;
            }
            Paint paint = this.f25257a;
            paint.setColor(i10);
            paint.setAlpha((int) (e11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.i0.z(1.0f, e11Var.M, org.telegram.messenger.i0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, e11Var.getWidth() - z10, e11Var.getHeight() - z10);
            float f22 = e11Var.f25610a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f25258b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f25259c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, e11Var.getWidth() - f21, e11Var.getHeight() - f21);
        org.telegram.ui.ActionBar.y3 y3Var = e11Var.G.f25123a;
        if (y3Var != null) {
            if (y3Var.l()) {
                e11Var.G.f25123a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    e11Var.G.getClass();
                    return;
                }
                float L = org.telegram.messenger.i0.L(8.0f) + f21;
                if (i12 == 3) {
                    f13 = 5.0f;
                } else {
                    f13 = 22.0f;
                }
                float L2 = org.telegram.messenger.i0.L(f13) + f21;
                if (i12 == 0 || i12 == 3) {
                    f14 = f19;
                    if (i12 == 3) {
                        f15 = 1.2f;
                    } else {
                        f15 = 1.0f;
                    }
                    rectF.set(L2, L, (f15 * f14) + L2, L + f20);
                } else {
                    L = 0.12f * e11Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(e11Var.getMeasuredWidth() - (e11Var.getMeasuredWidth() * 0.65f), L, e11Var.getMeasuredWidth() - (e11Var.getMeasuredWidth() * 0.1f), e11Var.getMeasuredHeight() * 0.32f);
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
                    c5Var2.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(f11) + ((int) rectF.right), org.telegram.messenger.i0.L(2.0f) + ((int) rectF.bottom));
                    c5Var2.Q = (int) (rectF.height() * f12);
                    c5Var2.c(canvas, paint2);
                }
                if (i12 != 0 && i12 != 3) {
                    rectF.set(e11Var.getMeasuredWidth() * 0.1f, e11Var.getMeasuredHeight() * 0.35f, e11Var.getMeasuredWidth() * 0.65f, e11Var.getMeasuredHeight() * 0.55f);
                    i11 = 3;
                } else {
                    float L3 = f21 + org.telegram.messenger.i0.L(5.0f);
                    float L4 = f16 + org.telegram.messenger.i0.L(f11) + L;
                    i11 = 3;
                    if (i12 == 3) {
                        f18 = 0.8f;
                    } else {
                        f18 = 1.0f;
                    }
                    rectF.set(L3, L4, (f14 * f18) + L3, L4 + f16);
                }
                if (i12 != 0 && i12 != i11) {
                    c5Var.setBounds(((int) rectF.left) - org.telegram.messenger.i0.L(f11), ((int) rectF.top) - org.telegram.messenger.i0.L(f17), (int) rectF.right, org.telegram.messenger.i0.L(f17) + ((int) rectF.bottom));
                    c5Var.Q = (int) (rectF.height() * f12);
                    c5Var.c(canvas, paint3);
                    return;
                }
                canvas.drawRoundRect(rectF, rectF.height() * f12, rectF.height() * f12, paint3);
                if (e11Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - org.telegram.messenger.i0.L(8.0f), centerY - org.telegram.messenger.i0.L(8.0f), height + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.e == null) {
                        this.e = e11Var.getContext().getDrawable(2131231967).mutate();
                    }
                    int i14 = (int) height2;
                    int i15 = (int) centerY;
                    this.e.setBounds(i14 - org.telegram.messenger.i0.L(8.0f), i15 - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + i14, org.telegram.messenger.i0.L(8.0f) + i15);
                    this.e.draw(canvas);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        if (e11Var.T == null) {
            float f23 = e11Var.f25611b;
            canvas.drawRoundRect(rectF, f23, f23, e11Var.f25616s);
            canvas.save();
            noThemeStaticLayout = e11Var.getNoThemeStaticLayout();
            canvas.translate((e11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, org.telegram.messenger.i0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.y3 y3Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        e11 e11Var = this.f25260f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(e11Var.f25618x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > e11Var.getWidth() / e11Var.getHeight()) {
                    int width = (int) ((e11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - e11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, e11Var.getHeight());
                } else {
                    int height = (int) ((e11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (e11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, e11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, e11Var.getWidth(), e11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof jb0) && (i10 = (iArr = ((jb0) drawable3).f27276a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = e11Var.f25615r.getAlpha();
                e11Var.f25615r.setAlpha((int) (alpha * f7));
                float f10 = e11Var.f25612c;
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f10, f10, e11Var.getWidth() - f10, e11Var.getHeight() - f10);
                float f11 = e11Var.f25611b;
                canvas.drawRoundRect(rectF, f11, f11, e11Var.f25615r);
                e11Var.f25615r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        cp cpVar = e11Var.G;
        if (cpVar != null && (y3Var = cpVar.f25123a) != null && y3Var.l() && e11Var.N != null) {
            return;
        }
        RectF rectF2 = e11Var.f25617w;
        float f12 = e11Var.f25611b;
        canvas.drawRoundRect(rectF2, f12, f12, e11Var.f25616s);
    }
}
