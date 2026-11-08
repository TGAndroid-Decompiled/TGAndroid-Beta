package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class b5 extends View implements te.b {
    public int D;
    public int E;
    public int F;
    public final y4 f27348a;
    public final int f27349b;
    public final a5 f27350c;
    public final z4 d;
    public final Drawable f27351e;
    public final cp f27352f;
    public final TextPaint h;
    public final Paint f27353n;
    public final RectF f27354r;
    public CharSequence f27355s;
    public float f27356w;
    public final te.a f27357x;
    public final te.a f27358y;

    public b5(Context context, y4 y4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f27353n = new Paint(1);
        this.f27354r = new RectF();
        xq xqVar = xq.h;
        this.f27357x = new te.a(0, this, xqVar, 380L, true);
        this.f27358y = new te.a(1, this, xqVar, 250L, false);
        this.f27348a = y4Var;
        this.f27349b = 1;
        this.f27350c = (a5) xi.e.f58865k.a();
        this.d = (z4) xi.e.f58866l.a();
        this.f27355s = charSequence;
        this.f27351e = context.getDrawable(2131231242).mutate();
        cp cpVar = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f27352f = cpVar;
        cpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f27355s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27356w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new ii.g(this, 16));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f27348a.g();
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11;
        te.c cVar;
        te.a aVar = this.f27357x;
        if (aVar.f55488f == z9 && (z10 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        y4 y4Var = this.f27348a;
        if (z10 && y4Var.t()) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z9, z11);
        Y(0, aVar.f55487e, 0.0f, null);
        y4Var.requestLayout();
    }

    public final void b(boolean z9) {
        this.f27358y.a(z9, this.f27348a.t());
        invalidate();
    }

    public final void c() {
        int i7;
        y4 y4Var = this.f27348a;
        f6 f6Var = y4Var.f28781a;
        this.D = k6.w0(k6.Ci, f6Var);
        this.E = i0.a.f(0.5f, k6.w0(k6.f27796a7, f6Var), this.D);
        int w02 = k6.w0(k6.Gi, f6Var);
        this.F = w02;
        int i10 = y4Var.f28791f0;
        a5 a5Var = this.f27350c;
        a5 a5Var2 = a5.f27332b;
        if (a5Var != a5Var2) {
            w02 = i10;
        }
        this.f27351e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f27352f.b(w02);
        this.h.setColor(w02);
        if (a5Var == a5Var2) {
            i7 = k6.r1(0.2f, this.F);
        } else {
            i7 = y4Var.f28793h0;
        }
        setBackground(k6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f27349b;
    }

    public int getButtonWidth() {
        if (this.d != z4.f28833a && !TextUtils.isEmpty(this.f27355s)) {
            return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.f27356w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public z4 getShape() {
        return this.d;
    }

    public a5 getStyle() {
        return this.f27350c;
    }

    public float getTargetVisibleFactor() {
        if (this.f27350c != a5.f27332b && !this.f27357x.f55488f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f27350c == a5.f27332b) {
            return 1.0f;
        }
        return this.f27357x.f55487e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f27350c == a5.f27332b) {
            int f11 = i0.a.f(this.f27357x.f55487e, this.E, this.D);
            Paint paint = this.f27353n;
            paint.setColor(f11);
            RectF rectF = this.f27354r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f27358y.f55487e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == z4.f28833a || TextUtils.isEmpty(this.f27355s)) {
                f10 = 0.0f;
                Drawable drawable = this.f27351e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i7);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f14));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.f27355s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f27356w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f10 = 0.0f;
        }
        if (f13 > f10) {
            float T12 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f13);
            canvas.save();
            canvas.scale(T12, T12, width / 2.0f, height / 2.0f);
            cp cpVar = this.f27352f;
            cpVar.setBounds(0, 0, (int) width, (int) height);
            cpVar.setAlpha((int) (f13 * 255.0f));
            cpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f27355s, charSequence)) {
            return;
        }
        this.f27355s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f27355s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27356w = f10;
        requestLayout();
        this.f27348a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f27348a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27352f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
