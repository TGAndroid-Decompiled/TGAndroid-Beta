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
public final class b5 extends View implements qe.b {
    public int E;
    public int F;
    public int G;
    public final y4 f27411a;
    public final int f27412b;
    public final a5 f27413c;
    public final z4 d;
    public final Drawable f27414e;
    public final cp f27415f;
    public final TextPaint h;
    public final Paint f27416n;
    public final RectF f27417r;
    public CharSequence f27418s;
    public float f27419w;
    public final qe.a f27420x;
    public final qe.a f27421y;

    public b5(Context context, y4 y4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f27416n = new Paint(1);
        this.f27417r = new RectF();
        xq xqVar = xq.h;
        this.f27420x = new qe.a(0, this, xqVar, 380L, true);
        this.f27421y = new qe.a(1, this, xqVar, 250L, false);
        this.f27411a = y4Var;
        this.f27412b = 1;
        this.f27413c = (a5) xi.e.f58885k.a();
        this.d = (z4) xi.e.f58886l.a();
        this.f27418s = charSequence;
        this.f27414e = context.getDrawable(2131231242).mutate();
        cp cpVar = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f27415f = cpVar;
        cpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f27418s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27419w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new ii.m(this, 19));
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            this.f27411a.g();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        qe.c cVar;
        qe.a aVar = this.f27420x;
        if (aVar.f53841f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        y4 y4Var = this.f27411a;
        if (z11 && y4Var.t()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        Y(0, aVar.f53840e, 0.0f, null);
        y4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f27421y.a(z10, this.f27411a.t());
        invalidate();
    }

    public final void c() {
        int i3;
        y4 y4Var = this.f27411a;
        e6 e6Var = y4Var.f28850a;
        this.E = k6.w0(k6.Ci, e6Var);
        this.F = i0.a.f(0.5f, k6.w0(k6.f27824a7, e6Var), this.E);
        int w02 = k6.w0(k6.Gi, e6Var);
        this.G = w02;
        int i10 = y4Var.f28861g0;
        a5 a5Var = this.f27413c;
        a5 a5Var2 = a5.f27379b;
        if (a5Var != a5Var2) {
            w02 = i10;
        }
        this.f27414e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f27415f.b(w02);
        this.h.setColor(w02);
        if (a5Var == a5Var2) {
            i3 = k6.r1(0.2f, this.G);
        } else {
            i3 = y4Var.f28863i0;
        }
        setBackground(k6.a0(i3, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f27412b;
    }

    public int getButtonWidth() {
        if (this.d != z4.f28892a && !TextUtils.isEmpty(this.f27418s)) {
            return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.f27419w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public z4 getShape() {
        return this.d;
    }

    public a5 getStyle() {
        return this.f27413c;
    }

    public float getTargetVisibleFactor() {
        if (this.f27413c != a5.f27379b && !this.f27420x.f53841f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f27413c == a5.f27379b) {
            return 1.0f;
        }
        return this.f27420x.f53840e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f27413c == a5.f27379b) {
            int f11 = i0.a.f(this.f27420x.f53840e, this.F, this.E);
            Paint paint = this.f27416n;
            paint.setColor(f11);
            RectF rectF = this.f27417r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f27421y.f53840e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i3 = (int) (f14 * 255.0f);
            if (this.d == z4.f28892a || TextUtils.isEmpty(this.f27418s)) {
                f10 = 0.0f;
                Drawable drawable = this.f27414e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i3);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f14));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.f27418s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f27419w) / 2.0f, descent, textPaint);
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
            cp cpVar = this.f27415f;
            cpVar.setBounds(0, 0, (int) width, (int) height);
            cpVar.setAlpha((int) (f13 * 255.0f));
            cpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f27418s, charSequence)) {
            return;
        }
        this.f27418s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f27418s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27419w = f10;
        requestLayout();
        this.f27411a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f27411a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27415f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
