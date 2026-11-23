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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.up;
public final class c5 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final z4 f28849a;
    public final int f28850b;
    public final b5 f28851c;
    public final a5 d;
    public final Drawable f28852e;
    public final up f28853f;
    public final TextPaint h;
    public final Paint f28854n;
    public final RectF f28855r;
    public CharSequence f28856s;
    public float f28857w;
    public final te.a f28858x;
    public final te.a f28859y;

    public c5(Context context, z4 z4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f28854n = new Paint(1);
        this.f28855r = new RectF();
        nr nrVar = nr.h;
        this.f28858x = new te.a(0, this, nrVar, 380L, true);
        this.f28859y = new te.a(1, this, nrVar, 250L, false);
        this.f28849a = z4Var;
        this.f28850b = 1;
        this.f28851c = (b5) aj.e.f1676k.a();
        this.d = (a5) aj.e.f1677l.a();
        this.f28856s = charSequence;
        this.f28852e = context.getDrawable(2131231242).mutate();
        up upVar = new up(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f28853f = upVar;
        upVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f28856s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28857w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new hi.o4(this, 23));
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f28849a.l();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        te.c cVar;
        te.a aVar = this.f28858x;
        if (aVar.f57701f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        z4 z4Var = this.f28849a;
        if (z11 && z4Var.y()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        H(0, aVar.f57700e, 0.0f, null);
        z4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f28859y.a(z10, this.f28849a.y());
        invalidate();
    }

    public final void c() {
        int i7;
        z4 z4Var = this.f28849a;
        h6 h6Var = z4Var.f30322a;
        this.E = m6.w0(m6.Fi, h6Var);
        this.F = i0.a.f(0.5f, m6.w0(m6.f29324a7, h6Var), this.E);
        int w02 = m6.w0(m6.Ji, h6Var);
        this.G = w02;
        int i10 = z4Var.f30333g0;
        b5 b5Var = this.f28851c;
        b5 b5Var2 = b5.f28813b;
        if (b5Var != b5Var2) {
            w02 = i10;
        }
        this.f28852e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f28853f.b(w02);
        this.h.setColor(w02);
        if (b5Var == b5Var2) {
            i7 = m6.r1(0.2f, this.G);
        } else {
            i7 = z4Var.f30335i0;
        }
        setBackground(m6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f28850b;
    }

    public int getButtonWidth() {
        if (this.d != a5.f28793a && !TextUtils.isEmpty(this.f28856s)) {
            return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.f28857w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public a5 getShape() {
        return this.d;
    }

    public b5 getStyle() {
        return this.f28851c;
    }

    public float getTargetVisibleFactor() {
        if (this.f28851c != b5.f28813b && !this.f28858x.f57701f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f28851c == b5.f28813b) {
            return 1.0f;
        }
        return this.f28858x.f57700e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f28851c == b5.f28813b) {
            int f11 = i0.a.f(this.f28858x.f57700e, this.F, this.E);
            Paint paint = this.f28854n;
            paint.setColor(f11);
            RectF rectF = this.f28855r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f28859y.f57700e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == a5.f28793a || TextUtils.isEmpty(this.f28856s)) {
                f10 = 0.0f;
                Drawable drawable = this.f28852e;
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
                CharSequence charSequence = this.f28856s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f28857w) / 2.0f, descent, textPaint);
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
            up upVar = this.f28853f;
            upVar.setBounds(0, 0, (int) width, (int) height);
            upVar.setAlpha((int) (f13 * 255.0f));
            upVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f28856s, charSequence)) {
            return;
        }
        this.f28856s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f28856s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28857w = f10;
        requestLayout();
        this.f28849a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f28849a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28853f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
