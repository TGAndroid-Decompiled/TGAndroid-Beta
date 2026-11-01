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
public final class h00 extends View implements org.telegram.ui.ActionBar.k6 {
    public Matrix D;
    public e6 E;
    public TextPaint f26609a;
    public TextPaint f26610b;
    public Paint f26611c;
    public Path d;
    public float[] e;
    public rz0 f26612f;
    public rz0 h;
    public rz0 f26613n;
    public LinearGradient f26614r;
    public LinearGradient f26615s;
    public Paint f26616w;
    public Paint f26617x;
    public Matrix f26618y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return org.telegram.messenger.dd.L0(2131750808, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        rz0 rz0Var;
        float f13;
        float f14;
        Paint paint = this.f26611c;
        Matrix matrix = this.D;
        Matrix matrix2 = this.f26618y;
        Path path = this.d;
        rz0 rz0Var2 = this.f26612f;
        e6 e6Var = this.E;
        rz0 rz0Var3 = this.f26613n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        rz0 rz0Var4 = this.h;
        if (rz0Var4 != null) {
            canvas.save();
            float f15 = rz0Var4.f30126c;
            f7 = 15.32f;
            CharSequence charSequence = e6Var.f25749i;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = e6Var.c() + org.telegram.messenger.i0.L(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (rz0Var4.i() / 2.0f));
            rz0Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = e6Var.f25749i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            rz0Var = rz0Var4;
            f13 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.i0.Q;
            f13 = 2.0f;
            f12 = measuredHeight;
            rz0Var = rz0Var4;
            rect.set((int) (rz0Var4.f30126c + f10 + org.telegram.messenger.i0.L(4.66f)), (int) (measuredHeight - org.telegram.messenger.i0.L(9.0f)), (int) (e6Var.c() + rz0Var4.f30126c + f10 + org.telegram.messenger.i0.L(f7)), (int) (f12 + org.telegram.messenger.i0.L(9.0f)));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.i0.L(0.33f), -org.telegram.messenger.i0.L(0.66f));
            e6Var.setBounds(rect);
            e6Var.draw(canvas);
        }
        float L = org.telegram.messenger.i0.L(30.0f);
        float f17 = (f10 - L) - rz0Var2.f30126c;
        canvas.save();
        canvas.translate(f17, (f12 - (rz0Var2.i() / f13)) + org.telegram.messenger.i0.L(1.0f));
        rz0Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (rz0Var3 != null) {
            canvas.save();
            canvas.translate(f18 + L, (f12 - (rz0Var3.i() / f13)) + org.telegram.messenger.i0.L(1.0f));
            rz0Var3.d(canvas);
            canvas.restore();
            f18 += L + rz0Var3.f30126c;
        }
        float f19 = f18;
        float L2 = org.telegram.messenger.i0.L(12.0f) + (rz0Var.i() / f13) + f12;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.f26609a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.i0.P;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - org.telegram.messenger.i0.L(4.0f), L2 - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + f21, L2);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.i0.L(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + org.telegram.messenger.i0.L(8.0f)), 0.0f);
        this.f26614r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - org.telegram.messenger.i0.L(88.0f)), 0.0f);
        this.f26615s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f26616w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f26617x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f26611c;
        TextPaint textPaint = this.f26610b;
        TextPaint textPaint2 = this.f26609a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i10 = org.telegram.ui.ActionBar.t6.si;
            textPaint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
            int i11 = org.telegram.ui.ActionBar.t6.f21135o6;
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false));
            try {
                e6 e6Var = this.E;
                if (e6Var != null) {
                    e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                }
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
                rz0 rz0Var = this.f26612f;
                if (rz0Var != null) {
                    rz0Var.n(r12);
                }
                rz0 rz0Var2 = this.h;
                if (rz0Var2 != null) {
                    rz0Var2.n(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
                }
                rz0 rz0Var3 = this.f26613n;
                if (rz0Var3 != null) {
                    rz0Var3.n(r12);
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
