package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class xz extends View implements org.telegram.ui.ActionBar.z5 {
    public Matrix E;
    public g6 F;
    public TextPaint f41796a;
    public TextPaint f41797b;
    public Paint f41798c;
    public Path d;
    public float[] f41799e;
    public oy0 f41800f;
    public oy0 h;
    public oy0 f41801n;
    public LinearGradient f41802r;
    public LinearGradient f41803s;
    public Paint f41804w;
    public Paint f41805x;
    public Matrix f41806y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return org.telegram.messenger.hd.M0(2131750807, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        oy0 oy0Var;
        float f14;
        float f15;
        Paint paint = this.f41798c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.f41806y;
        Path path = this.d;
        oy0 oy0Var2 = this.f41800f;
        g6 g6Var = this.F;
        oy0 oy0Var3 = this.f41801n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        oy0 oy0Var4 = this.h;
        if (oy0Var4 != null) {
            canvas.save();
            float f16 = oy0Var4.f38103c;
            f10 = 15.32f;
            CharSequence charSequence = g6Var.f34840i;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = g6Var.c() + org.telegram.messenger.g0.L(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (oy0Var4.i() / 2.0f));
            oy0Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = g6Var.f34840i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            oy0Var = oy0Var4;
            f14 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.g0.Q;
            f14 = 2.0f;
            f13 = measuredHeight;
            oy0Var = oy0Var4;
            rect.set((int) (oy0Var4.f38103c + f11 + org.telegram.messenger.g0.L(4.66f)), (int) (measuredHeight - org.telegram.messenger.g0.L(9.0f)), (int) (g6Var.c() + oy0Var4.f38103c + f11 + org.telegram.messenger.g0.L(f10)), (int) (f13 + org.telegram.messenger.g0.L(9.0f)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.33f), -org.telegram.messenger.g0.L(0.66f));
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
        }
        float L = org.telegram.messenger.g0.L(30.0f);
        float f18 = (f11 - L) - oy0Var2.f38103c;
        canvas.save();
        canvas.translate(f18, (f13 - (oy0Var2.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
        oy0Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (oy0Var3 != null) {
            canvas.save();
            canvas.translate(f19 + L, (f13 - (oy0Var3.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
            oy0Var3.d(canvas);
            canvas.restore();
            f19 += L + oy0Var3.f38103c;
        }
        float f20 = f19;
        float L2 = org.telegram.messenger.g0.L(12.0f) + (oy0Var.i() / f14) + f13;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.f41796a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - org.telegram.messenger.g0.L(4.0f), L2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f22, L2);
        path.addRoundRect(rectF2, this.f41799e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + org.telegram.messenger.g0.L(8.0f)), 0.0f);
        this.f41802r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - org.telegram.messenger.g0.L(88.0f)), 0.0f);
        this.f41803s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f41804w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41805x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f41798c;
        TextPaint textPaint = this.f41797b;
        TextPaint textPaint2 = this.f41796a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i7 = org.telegram.ui.ActionBar.j6.f29195vi;
            textPaint2.setColor(org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.x0(null, i7, false)));
            int i10 = org.telegram.ui.ActionBar.j6.f29049o6;
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ki, false));
            try {
                g6 g6Var = this.F;
                if (g6Var != null) {
                    g6Var.u(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
                }
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.8f, org.telegram.ui.ActionBar.j6.x0(null, i7, false));
                oy0 oy0Var = this.f41800f;
                if (oy0Var != null) {
                    oy0Var.n(r12);
                }
                oy0 oy0Var2 = this.h;
                if (oy0Var2 != null) {
                    oy0Var2.n(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
                }
                oy0 oy0Var3 = this.f41801n;
                if (oy0Var3 != null) {
                    oy0Var3.n(r12);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
