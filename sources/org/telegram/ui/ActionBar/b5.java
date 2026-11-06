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
    public final y4 f27344a;
    public final int f27345b;
    public final a5 f27346c;
    public final z4 d;
    public final Drawable f27347e;
    public final cp f27348f;
    public final TextPaint h;
    public final Paint f27349n;
    public final RectF f27350r;
    public CharSequence f27351s;
    public float f27352w;
    public final te.a f27353x;
    public final te.a f27354y;

    public b5(Context context, y4 y4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f27349n = new Paint(1);
        this.f27350r = new RectF();
        xq xqVar = xq.h;
        this.f27353x = new te.a(0, this, xqVar, 380L, true);
        this.f27354y = new te.a(1, this, xqVar, 250L, false);
        this.f27344a = y4Var;
        this.f27345b = 1;
        this.f27346c = (a5) xi.e.f58770k.a();
        this.d = (z4) xi.e.f58771l.a();
        this.f27351s = charSequence;
        this.f27347e = context.getDrawable(2131231242).mutate();
        cp cpVar = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f27348f = cpVar;
        cpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f27351s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27352w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new ii.g(this, 16));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f27344a.g();
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11;
        te.c cVar;
        te.a aVar = this.f27353x;
        if (aVar.f55396f == z9 && (z10 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        y4 y4Var = this.f27344a;
        if (z10 && y4Var.t()) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z9, z11);
        Y(0, aVar.f55395e, 0.0f, null);
        y4Var.requestLayout();
    }

    public final void b(boolean z9) {
        this.f27354y.a(z9, this.f27344a.t());
        invalidate();
    }

    public final void c() {
        int i7;
        y4 y4Var = this.f27344a;
        f6 f6Var = y4Var.f28777a;
        this.D = k6.w0(k6.Ci, f6Var);
        this.E = i0.a.f(0.5f, k6.w0(k6.f27792a7, f6Var), this.D);
        int w02 = k6.w0(k6.Gi, f6Var);
        this.F = w02;
        int i10 = y4Var.f28787f0;
        a5 a5Var = this.f27346c;
        a5 a5Var2 = a5.f27328b;
        if (a5Var != a5Var2) {
            w02 = i10;
        }
        this.f27347e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f27348f.b(w02);
        this.h.setColor(w02);
        if (a5Var == a5Var2) {
            i7 = k6.r1(0.2f, this.F);
        } else {
            i7 = y4Var.f28789h0;
        }
        setBackground(k6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f27345b;
    }

    public int getButtonWidth() {
        if (this.d != z4.f28829a && !TextUtils.isEmpty(this.f27351s)) {
            return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.f27352w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public z4 getShape() {
        return this.d;
    }

    public a5 getStyle() {
        return this.f27346c;
    }

    public float getTargetVisibleFactor() {
        if (this.f27346c != a5.f27328b && !this.f27353x.f55396f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f27346c == a5.f27328b) {
            return 1.0f;
        }
        return this.f27353x.f55395e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f27346c == a5.f27328b) {
            int f11 = i0.a.f(this.f27353x.f55395e, this.E, this.D);
            Paint paint = this.f27349n;
            paint.setColor(f11);
            RectF rectF = this.f27350r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f27354y.f55395e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == z4.f28829a || TextUtils.isEmpty(this.f27351s)) {
                f10 = 0.0f;
                Drawable drawable = this.f27347e;
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
                CharSequence charSequence = this.f27351s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f27352w) / 2.0f, descent, textPaint);
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
            cp cpVar = this.f27348f;
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
        if (TextUtils.equals(this.f27351s, charSequence)) {
            return;
        }
        this.f27351s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f27351s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27352w = f10;
        requestLayout();
        this.f27344a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f27344a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27348f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
