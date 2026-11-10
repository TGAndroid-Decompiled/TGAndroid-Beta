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
import org.telegram.ui.Components.wq;
public final class c5 extends View implements te.b {
    public int D;
    public int E;
    public int F;
    public final z4 f27370a;
    public final int f27371b;
    public final b5 f27372c;
    public final a5 d;
    public final Drawable f27373e;
    public final cp f27374f;
    public final TextPaint h;
    public final Paint f27375n;
    public final RectF f27376r;
    public CharSequence f27377s;
    public float f27378w;
    public final te.a f27379x;
    public final te.a f27380y;

    public c5(Context context, z4 z4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f27375n = new Paint(1);
        this.f27376r = new RectF();
        wq wqVar = wq.h;
        this.f27379x = new te.a(0, this, wqVar, 380L, true);
        this.f27380y = new te.a(1, this, wqVar, 250L, false);
        this.f27370a = z4Var;
        this.f27371b = 1;
        this.f27372c = (b5) xi.e.f58872k.a();
        this.d = (a5) xi.e.f58873l.a();
        this.f27377s = charSequence;
        this.f27373e = context.getDrawable(2131231242).mutate();
        cp cpVar = new cp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f27374f = cpVar;
        cpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f27377s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27378w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new ii.g(this, 16));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f27370a.i();
        }
        invalidate();
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11;
        te.c cVar;
        te.a aVar = this.f27379x;
        if (aVar.f55499f == z9 && (z10 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        z4 z4Var = this.f27370a;
        if (z10 && z4Var.v()) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z9, z11);
        Y(0, aVar.f55498e, 0.0f, null);
        z4Var.requestLayout();
    }

    public final void b(boolean z9) {
        this.f27380y.a(z9, this.f27370a.v());
        invalidate();
    }

    public final void c() {
        int i7;
        z4 z4Var = this.f27370a;
        h6 h6Var = z4Var.f28819a;
        this.D = m6.w0(m6.Ci, h6Var);
        this.E = i0.a.f(0.5f, m6.w0(m6.f27834a7, h6Var), this.D);
        int w02 = m6.w0(m6.Gi, h6Var);
        this.F = w02;
        int i10 = z4Var.f28829f0;
        b5 b5Var = this.f27372c;
        b5 b5Var2 = b5.f27353b;
        if (b5Var != b5Var2) {
            w02 = i10;
        }
        this.f27373e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f27374f.b(w02);
        this.h.setColor(w02);
        if (b5Var == b5Var2) {
            i7 = m6.r1(0.2f, this.F);
        } else {
            i7 = z4Var.f28831h0;
        }
        setBackground(m6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f27371b;
    }

    public int getButtonWidth() {
        if (this.d != a5.f27315a && !TextUtils.isEmpty(this.f27377s)) {
            return org.telegram.messenger.k5.b(32.0f, (int) Math.ceil(this.f27378w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public a5 getShape() {
        return this.d;
    }

    public b5 getStyle() {
        return this.f27372c;
    }

    public float getTargetVisibleFactor() {
        if (this.f27372c != b5.f27353b && !this.f27379x.f55499f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f27372c == b5.f27353b) {
            return 1.0f;
        }
        return this.f27379x.f55498e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f27372c == b5.f27353b) {
            int f11 = i0.a.f(this.f27379x.f55498e, this.E, this.D);
            Paint paint = this.f27375n;
            paint.setColor(f11);
            RectF rectF = this.f27376r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f27380y.f55498e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == a5.f27315a || TextUtils.isEmpty(this.f27377s)) {
                f10 = 0.0f;
                Drawable drawable = this.f27373e;
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
                CharSequence charSequence = this.f27377s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f27378w) / 2.0f, descent, textPaint);
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
            cp cpVar = this.f27374f;
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
        if (TextUtils.equals(this.f27377s, charSequence)) {
            return;
        }
        this.f27377s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f27377s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f27378w = f10;
        requestLayout();
        this.f27370a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f27370a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27374f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
