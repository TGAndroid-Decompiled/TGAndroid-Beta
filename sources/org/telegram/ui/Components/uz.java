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
public final class uz extends View implements org.telegram.ui.ActionBar.a6 {
    public Matrix D;
    public i6 E;
    public TextPaint f38783a;
    public TextPaint f38784b;
    public Paint f38785c;
    public Path d;
    public float[] f38786e;
    public my0 f38787f;
    public my0 h;
    public my0 f38788n;
    public LinearGradient f38789r;
    public LinearGradient f38790s;
    public Paint f38791w;
    public Paint f38792x;
    public Matrix f38793y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return org.telegram.messenger.id.M0(2131750808, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        my0 my0Var;
        float f14;
        float f15;
        Paint paint = this.f38785c;
        Matrix matrix = this.D;
        Matrix matrix2 = this.f38793y;
        Path path = this.d;
        my0 my0Var2 = this.f38787f;
        i6 i6Var = this.E;
        my0 my0Var3 = this.f38788n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        my0 my0Var4 = this.h;
        if (my0Var4 != null) {
            canvas.save();
            float f16 = my0Var4.f36147c;
            f10 = 15.32f;
            CharSequence charSequence = i6Var.f34558i;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = i6Var.c() + org.telegram.messenger.g0.L(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (my0Var4.i() / 2.0f));
            my0Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = i6Var.f34558i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            my0Var = my0Var4;
            f14 = 2.0f;
        } else {
            Rect rect = org.telegram.messenger.g0.Q;
            f14 = 2.0f;
            f13 = measuredHeight;
            my0Var = my0Var4;
            rect.set((int) (my0Var4.f36147c + f11 + org.telegram.messenger.g0.L(4.66f)), (int) (measuredHeight - org.telegram.messenger.g0.L(9.0f)), (int) (i6Var.c() + my0Var4.f36147c + f11 + org.telegram.messenger.g0.L(f10)), (int) (f13 + org.telegram.messenger.g0.L(9.0f)));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), paint);
            rect.offset(-org.telegram.messenger.g0.L(0.33f), -org.telegram.messenger.g0.L(0.66f));
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
        }
        float L = org.telegram.messenger.g0.L(30.0f);
        float f18 = (f11 - L) - my0Var2.f36147c;
        canvas.save();
        canvas.translate(f18, (f13 - (my0Var2.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
        my0Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (my0Var3 != null) {
            canvas.save();
            canvas.translate(f19 + L, (f13 - (my0Var3.i() / f14)) + org.telegram.messenger.g0.L(1.0f));
            my0Var3.d(canvas);
            canvas.restore();
            f19 += L + my0Var3.f36147c;
        }
        float f20 = f19;
        float L2 = org.telegram.messenger.g0.L(12.0f) + (my0Var.i() / f14) + f13;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.f38783a);
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - org.telegram.messenger.g0.L(4.0f), L2 - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + f22, L2);
        path.addRoundRect(rectF2, this.f38786e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(org.telegram.messenger.g0.L(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + org.telegram.messenger.g0.L(8.0f)), 0.0f);
        this.f38789r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - org.telegram.messenger.g0.L(88.0f)), 0.0f);
        this.f38790s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f38791w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38792x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f38785c;
        TextPaint textPaint = this.f38784b;
        TextPaint textPaint2 = this.f38783a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i7 = org.telegram.ui.ActionBar.k6.f28141si;
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
            int i10 = org.telegram.ui.ActionBar.k6.f28052o6;
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hi, false));
            try {
                i6 i6Var = this.E;
                if (i6Var != null) {
                    i6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                }
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i7, false));
                my0 my0Var = this.f38787f;
                if (my0Var != null) {
                    my0Var.n(r12);
                }
                my0 my0Var2 = this.h;
                if (my0Var2 != null) {
                    my0Var2.n(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                }
                my0 my0Var3 = this.f38788n;
                if (my0Var3 != null) {
                    my0Var3.n(r12);
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
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
