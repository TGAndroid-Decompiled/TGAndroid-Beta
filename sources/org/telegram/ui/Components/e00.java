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
public final class e00 extends View implements org.telegram.ui.ActionBar.c6 {
    public Matrix E;
    public m6 F;
    public TextPaint f34512a;
    public TextPaint f34513b;
    public Paint f34514c;
    public Path d;
    public float[] f34515e;
    public wy0 f34516f;
    public wy0 h;
    public wy0 f34517n;
    public LinearGradient f34518r;
    public LinearGradient f34519s;
    public Paint f34520w;
    public Paint f34521x;
    public Matrix f34522y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return org.telegram.messenger.gd.N0(2131750795, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        wy0 wy0Var;
        float f14;
        float f15;
        Paint paint = this.f34514c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.f34522y;
        Path path = this.d;
        wy0 wy0Var2 = this.f34516f;
        m6 m6Var = this.F;
        wy0 wy0Var3 = this.f34517n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        wy0 wy0Var4 = this.h;
        if (wy0Var4 != null) {
            canvas.save();
            float f16 = wy0Var4.f41763c;
            f10 = 15.32f;
            CharSequence charSequence = m6Var.f37401i;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = m6Var.c() + org.telegram.messenger.g0.L(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (wy0Var4.i() / 2.0f));
            wy0Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = m6Var.f37401i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            wy0Var = wy0Var4;
            f14 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.g0.Q;
            f14 = 2.0f;
            f13 = measuredHeight;
            wy0Var = wy0Var4;
            rect.set((int) (wy0Var4.f41763c + f11 + org.telegram.messenger.g0.L(4.66f)), (int) (measuredHeight - org.telegram.messenger.g0.L(9.0f)), (int) (m6Var.c() + wy0Var4.f41763c + f11 + org.telegram.messenger.g0.L(f10)), (int) (f13 + org.telegram.messenger.g0.L(9.0f)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.33f), -org.telegram.messenger.g0.L(0.66f));
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
        }
        float L = org.telegram.messenger.g0.L(30.0f);
        float f18 = (f11 - L) - wy0Var2.f41763c;
        canvas.save();
        canvas.translate(f18, (f13 - (wy0Var2.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
        wy0Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (wy0Var3 != null) {
            canvas.save();
            canvas.translate(f19 + L, (f13 - (wy0Var3.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
            wy0Var3.d(canvas);
            canvas.restore();
            f19 += L + wy0Var3.f41763c;
        }
        float f20 = f19;
        float L2 = org.telegram.messenger.g0.L(12.0f) + (wy0Var.i() / f14) + f13;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.f34512a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - org.telegram.messenger.g0.L(4.0f), L2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f22, L2);
        path.addRoundRect(rectF2, this.f34515e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + org.telegram.messenger.g0.L(8.0f)), 0.0f);
        this.f34518r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - org.telegram.messenger.g0.L(88.0f)), 0.0f);
        this.f34519s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f34520w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34521x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f34514c;
        TextPaint textPaint = this.f34513b;
        TextPaint textPaint2 = this.f34512a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i7 = org.telegram.ui.ActionBar.n6.f29797vi;
            textPaint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i7, false)));
            int i10 = org.telegram.ui.ActionBar.n6.f29651o6;
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ki, false));
            try {
                m6 m6Var = this.F;
                if (m6Var != null) {
                    m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
                }
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.8f, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                wy0 wy0Var = this.f34516f;
                if (wy0Var != null) {
                    wy0Var.n(r12);
                }
                wy0 wy0Var2 = this.h;
                if (wy0Var2 != null) {
                    wy0Var2.n(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                }
                wy0 wy0Var3 = this.f34517n;
                if (wy0Var3 != null) {
                    wy0Var3.n(r12);
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
