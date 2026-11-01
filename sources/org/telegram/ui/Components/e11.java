package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
public final class e11 {
    public final Paint f25661a;
    public final Paint f25662b;
    public final Paint f25663c;
    public Drawable d;
    public Drawable e;
    public final f11 f25664f;

    public e11(f11 f11Var) {
        this.f25664f = f11Var;
        Paint paint = new Paint(1);
        this.f25661a = paint;
        this.f25662b = new Paint(1);
        this.f25663c = new Paint(1);
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
        f11 f11Var = this.f25664f;
        ImageReceiver imageReceiver = f11Var.P;
        float f19 = f11Var.e;
        org.telegram.ui.ActionBar.c5 c5Var = f11Var.S;
        org.telegram.ui.ActionBar.c5 c5Var2 = f11Var.R;
        float f20 = f11Var.d;
        float f21 = f11Var.f26032c;
        int i12 = f11Var.K;
        RectF rectF = f11Var.f26037w;
        if (!f11Var.W && f11Var.D == null) {
            f12 = 0.5f;
            f10 = 255.0f;
            f11 = 4.0f;
        } else {
            cp cpVar = f11Var.G;
            f10 = 255.0f;
            org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) cpVar.f25197a.f21562f.get(cpVar.f25199c);
            if (f11Var.G.f25197a.l()) {
                i10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, f11Var.f26039y);
            } else {
                i10 = x3Var.f21522j;
            }
            Paint paint = this.f25661a;
            paint.setColor(i10);
            paint.setAlpha((int) (f11Var.M * f7 * 255.0f));
            f11 = 4.0f;
            f12 = 0.5f;
            float z10 = c3.i0.z(1.0f, f11Var.M, org.telegram.messenger.i0.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(z10, z10, f11Var.getWidth() - z10, f11Var.getHeight() - z10);
            float f22 = f11Var.f26030a;
            canvas.drawRoundRect(rectF, f22, f22, paint);
        }
        int i13 = (int) (f7 * f10);
        Paint paint2 = this.f25662b;
        paint2.setAlpha(i13);
        Paint paint3 = this.f25663c;
        paint3.setAlpha(i13);
        rectF.set(f21, f21, f11Var.getWidth() - f21, f11Var.getHeight() - f21);
        org.telegram.ui.ActionBar.y3 y3Var = f11Var.G.f25197a;
        if (y3Var != null) {
            if (y3Var.l()) {
                f11Var.G.f25197a.getClass();
            } else if (i12 != 4) {
                if (i12 == 2) {
                    f11Var.G.getClass();
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
                    L = 0.12f * f11Var.getMeasuredHeight();
                    f14 = f19;
                    rectF.set(f11Var.getMeasuredWidth() - (f11Var.getMeasuredWidth() * 0.65f), L, f11Var.getMeasuredWidth() - (f11Var.getMeasuredWidth() * 0.1f), f11Var.getMeasuredHeight() * 0.32f);
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
                    rectF.set(f11Var.getMeasuredWidth() * 0.1f, f11Var.getMeasuredHeight() * 0.35f, f11Var.getMeasuredWidth() * 0.65f, f11Var.getMeasuredHeight() * 0.55f);
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
                if (f11Var.U != 0) {
                    float centerY = rectF.centerY();
                    float height = (rectF.height() / f17) + rectF.left;
                    float height2 = rectF.right - (rectF.height() / f17);
                    rectF.set(height - org.telegram.messenger.i0.L(8.0f), centerY - org.telegram.messenger.i0.L(8.0f), height + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f) + centerY);
                    imageReceiver.A0(rectF);
                    imageReceiver.h(canvas, null);
                    if (this.e == null) {
                        this.e = f11Var.getContext().getDrawable(2131231967).mutate();
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
        if (f11Var.T == null) {
            float f23 = f11Var.f26031b;
            canvas.drawRoundRect(rectF, f23, f23, f11Var.f26036s);
            canvas.save();
            noThemeStaticLayout = f11Var.getNoThemeStaticLayout();
            canvas.translate((f11Var.getWidth() - noThemeStaticLayout.getWidth()) * f12, org.telegram.messenger.i0.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f7) {
        org.telegram.ui.ActionBar.y3 y3Var;
        int[] iArr;
        int i10;
        Drawable drawable = this.d;
        f11 f11Var = this.f25664f;
        if (drawable != null) {
            canvas.save();
            canvas.clipPath(f11Var.f26038x);
            Drawable drawable2 = this.d;
            if (drawable2 instanceof BitmapDrawable) {
                float intrinsicWidth = drawable2.getIntrinsicWidth();
                float intrinsicHeight = this.d.getIntrinsicHeight();
                if (intrinsicWidth / intrinsicHeight > f11Var.getWidth() / f11Var.getHeight()) {
                    int width = (int) ((f11Var.getWidth() * intrinsicHeight) / intrinsicWidth);
                    int width2 = (width - f11Var.getWidth()) / 2;
                    this.d.setBounds(width2, 0, width + width2, f11Var.getHeight());
                } else {
                    int height = (int) ((f11Var.getHeight() * intrinsicHeight) / intrinsicWidth);
                    int height2 = (f11Var.getHeight() - height) / 2;
                    this.d.setBounds(0, height2, f11Var.getWidth(), height + height2);
                }
            } else {
                drawable2.setBounds(0, 0, f11Var.getWidth(), f11Var.getHeight());
            }
            this.d.setAlpha((int) (255.0f * f7));
            this.d.draw(canvas);
            Drawable drawable3 = this.d;
            if ((drawable3 instanceof ColorDrawable) || ((drawable3 instanceof jb0) && (i10 = (iArr = ((jb0) drawable3).f27331a)[0]) == iArr[1] && i10 == iArr[2] && i10 == iArr[3])) {
                int alpha = f11Var.f26035r.getAlpha();
                f11Var.f26035r.setAlpha((int) (alpha * f7));
                float f10 = f11Var.f26032c;
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(f10, f10, f11Var.getWidth() - f10, f11Var.getHeight() - f10);
                float f11 = f11Var.f26031b;
                canvas.drawRoundRect(rectF, f11, f11, f11Var.f26035r);
                f11Var.f26035r.setAlpha(alpha);
            }
            canvas.restore();
            return;
        }
        cp cpVar = f11Var.G;
        if (cpVar != null && (y3Var = cpVar.f25197a) != null && y3Var.l() && f11Var.N != null) {
            return;
        }
        RectF rectF2 = f11Var.f26037w;
        float f12 = f11Var.f26031b;
        canvas.drawRoundRect(rectF2, f12, f12, f11Var.f26036s);
    }
}
