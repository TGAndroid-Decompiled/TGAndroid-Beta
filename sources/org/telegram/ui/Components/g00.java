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
public final class g00 extends View implements org.telegram.ui.ActionBar.b6 {
    public Matrix E;
    public n6 F;
    public TextPaint f35344a;
    public TextPaint f35345b;
    public Paint f35346c;
    public Path d;
    public float[] f35347e;
    public xy0 f35348f;
    public xy0 h;
    public xy0 f35349n;
    public LinearGradient f35350r;
    public LinearGradient f35351s;
    public Paint f35352w;
    public Paint f35353x;
    public Matrix f35354y;

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
        xy0 xy0Var;
        float f14;
        float f15;
        Paint paint = this.f35346c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.f35354y;
        Path path = this.d;
        xy0 xy0Var2 = this.f35348f;
        n6 n6Var = this.F;
        xy0 xy0Var3 = this.f35349n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        xy0 xy0Var4 = this.h;
        if (xy0Var4 != null) {
            canvas.save();
            float f16 = xy0Var4.f42254c;
            f10 = 15.32f;
            CharSequence charSequence = n6Var.f37798i;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = n6Var.c() + org.telegram.messenger.g0.L(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (xy0Var4.i() / 2.0f));
            xy0Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = n6Var.f37798i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            xy0Var = xy0Var4;
            f14 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.g0.Q;
            f14 = 2.0f;
            f13 = measuredHeight;
            xy0Var = xy0Var4;
            rect.set((int) (xy0Var4.f42254c + f11 + org.telegram.messenger.g0.L(4.66f)), (int) (measuredHeight - org.telegram.messenger.g0.L(9.0f)), (int) (n6Var.c() + xy0Var4.f42254c + f11 + org.telegram.messenger.g0.L(f10)), (int) (f13 + org.telegram.messenger.g0.L(9.0f)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.33f), -org.telegram.messenger.g0.L(0.66f));
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
        }
        float L = org.telegram.messenger.g0.L(30.0f);
        float f18 = (f11 - L) - xy0Var2.f42254c;
        canvas.save();
        canvas.translate(f18, (f13 - (xy0Var2.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
        xy0Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (xy0Var3 != null) {
            canvas.save();
            canvas.translate(f19 + L, (f13 - (xy0Var3.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
            xy0Var3.d(canvas);
            canvas.restore();
            f19 += L + xy0Var3.f42254c;
        }
        float f20 = f19;
        float L2 = org.telegram.messenger.g0.L(12.0f) + (xy0Var.i() / f14) + f13;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.f35344a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - org.telegram.messenger.g0.L(4.0f), L2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f22, L2);
        path.addRoundRect(rectF2, this.f35347e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + org.telegram.messenger.g0.L(8.0f)), 0.0f);
        this.f35350r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - org.telegram.messenger.g0.L(88.0f)), 0.0f);
        this.f35351s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f35352w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f35353x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f35346c;
        TextPaint textPaint = this.f35345b;
        TextPaint textPaint2 = this.f35344a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i7 = org.telegram.ui.ActionBar.m6.f29724vi;
            textPaint2.setColor(org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)));
            int i10 = org.telegram.ui.ActionBar.m6.f29578o6;
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ki, false));
            try {
                n6 n6Var = this.F;
                if (n6Var != null) {
                    n6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
                }
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
                xy0 xy0Var = this.f35348f;
                if (xy0Var != null) {
                    xy0Var.n(r12);
                }
                xy0 xy0Var2 = this.h;
                if (xy0Var2 != null) {
                    xy0Var2.n(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                }
                xy0 xy0Var3 = this.f35349n;
                if (xy0Var3 != null) {
                    xy0Var3.n(r12);
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
