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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;
public final class z4 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final w4 f29940a;
    public final int f29941b;
    public final y4 f29942c;
    public final x4 d;
    public final Drawable f29943e;
    public final lp f29944f;
    public final TextPaint h;
    public final Paint f29945n;
    public final RectF f29946r;
    public CharSequence f29947s;
    public float f29948w;
    public final te.a f29949x;
    public final te.a f29950y;

    public z4(Context context, w4 w4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f29945n = new Paint(1);
        this.f29946r = new RectF();
        er erVar = er.h;
        this.f29949x = new te.a(0, this, erVar, 380L, true);
        this.f29950y = new te.a(1, this, erVar, 250L, false);
        this.f29940a = w4Var;
        this.f29941b = 1;
        this.f29942c = (y4) aj.e.f1665k.a();
        this.d = (x4) aj.e.f1666l.a();
        this.f29947s = charSequence;
        this.f29943e = context.getDrawable(2131231242).mutate();
        lp lpVar = new lp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f29944f = lpVar;
        lpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f29947s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f29948w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new hi.p5(this, 22));
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f29940a.j();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        te.c cVar;
        te.a aVar = this.f29949x;
        if (aVar.f57086f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        w4 w4Var = this.f29940a;
        if (z11 && w4Var.w()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        G(0, aVar.f57085e, 0.0f, null);
        w4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f29950y.a(z10, this.f29940a.w());
        invalidate();
    }

    public final void c() {
        int i7;
        w4 w4Var = this.f29940a;
        e6 e6Var = w4Var.f29806a;
        this.E = j6.w0(j6.Fi, e6Var);
        this.F = i0.a.f(0.5f, j6.w0(j6.f28792a7, e6Var), this.E);
        int w02 = j6.w0(j6.Ji, e6Var);
        this.G = w02;
        int i10 = w4Var.f29817g0;
        y4 y4Var = this.f29942c;
        y4 y4Var2 = y4.f29893b;
        if (y4Var != y4Var2) {
            w02 = i10;
        }
        this.f29943e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f29944f.b(w02);
        this.h.setColor(w02);
        if (y4Var == y4Var2) {
            i7 = j6.r1(0.2f, this.G);
        } else {
            i7 = w4Var.f29819i0;
        }
        setBackground(j6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f29941b;
    }

    public int getButtonWidth() {
        if (this.d != x4.f29869a && !TextUtils.isEmpty(this.f29947s)) {
            return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.f29948w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public x4 getShape() {
        return this.d;
    }

    public y4 getStyle() {
        return this.f29942c;
    }

    public float getTargetVisibleFactor() {
        if (this.f29942c != y4.f29893b && !this.f29949x.f57086f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f29942c == y4.f29893b) {
            return 1.0f;
        }
        return this.f29949x.f57085e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f29942c == y4.f29893b) {
            int f11 = i0.a.f(this.f29949x.f57085e, this.F, this.E);
            Paint paint = this.f29945n;
            paint.setColor(f11);
            RectF rectF = this.f29946r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f29950y.f57085e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == x4.f29869a || TextUtils.isEmpty(this.f29947s)) {
                f10 = 0.0f;
                Drawable drawable = this.f29943e;
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
                CharSequence charSequence = this.f29947s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f29948w) / 2.0f, descent, textPaint);
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
            lp lpVar = this.f29944f;
            lpVar.setBounds(0, 0, (int) width, (int) height);
            lpVar.setAlpha((int) (f13 * 255.0f));
            lpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f29947s, charSequence)) {
            return;
        }
        this.f29947s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f29947s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f29948w = f10;
        requestLayout();
        this.f29940a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f29940a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29944f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
