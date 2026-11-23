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
    public final z4 f28815a;
    public final int f28816b;
    public final b5 f28817c;
    public final a5 d;
    public final Drawable f28818e;
    public final up f28819f;
    public final TextPaint h;
    public final Paint f28820n;
    public final RectF f28821r;
    public CharSequence f28822s;
    public float f28823w;
    public final te.a f28824x;
    public final te.a f28825y;

    public c5(Context context, z4 z4Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f28820n = new Paint(1);
        this.f28821r = new RectF();
        nr nrVar = nr.h;
        this.f28824x = new te.a(0, this, nrVar, 380L, true);
        this.f28825y = new te.a(1, this, nrVar, 250L, false);
        this.f28815a = z4Var;
        this.f28816b = 1;
        this.f28817c = (b5) aj.e.f1627k.a();
        this.d = (a5) aj.e.f1628l.a();
        this.f28822s = charSequence;
        this.f28818e = context.getDrawable(2131231242).mutate();
        up upVar = new up(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f28819f = upVar;
        upVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f28822s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28823w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new hi.p4(this, 23));
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f28815a.l();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        te.c cVar;
        te.a aVar = this.f28824x;
        if (aVar.f57666f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        z4 z4Var = this.f28815a;
        if (z11 && z4Var.y()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        H(0, aVar.f57665e, 0.0f, null);
        z4Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f28825y.a(z10, this.f28815a.y());
        invalidate();
    }

    public final void c() {
        int i7;
        z4 z4Var = this.f28815a;
        h6 h6Var = z4Var.f30288a;
        this.E = m6.w0(m6.Fi, h6Var);
        this.F = i0.a.f(0.5f, m6.w0(m6.f29290a7, h6Var), this.E);
        int w02 = m6.w0(m6.Ji, h6Var);
        this.G = w02;
        int i10 = z4Var.f30299g0;
        b5 b5Var = this.f28817c;
        b5 b5Var2 = b5.f28779b;
        if (b5Var != b5Var2) {
            w02 = i10;
        }
        this.f28818e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f28819f.b(w02);
        this.h.setColor(w02);
        if (b5Var == b5Var2) {
            i7 = m6.r1(0.2f, this.G);
        } else {
            i7 = z4Var.f30301i0;
        }
        setBackground(m6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f28816b;
    }

    public int getButtonWidth() {
        if (this.d != a5.f28759a && !TextUtils.isEmpty(this.f28822s)) {
            return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.f28823w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public a5 getShape() {
        return this.d;
    }

    public b5 getStyle() {
        return this.f28817c;
    }

    public float getTargetVisibleFactor() {
        if (this.f28817c != b5.f28779b && !this.f28824x.f57666f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f28817c == b5.f28779b) {
            return 1.0f;
        }
        return this.f28824x.f57665e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f28817c == b5.f28779b) {
            int f11 = i0.a.f(this.f28824x.f57665e, this.F, this.E);
            Paint paint = this.f28820n;
            paint.setColor(f11);
            RectF rectF = this.f28821r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f28825y.f57665e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == a5.f28759a || TextUtils.isEmpty(this.f28822s)) {
                f10 = 0.0f;
                Drawable drawable = this.f28818e;
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
                CharSequence charSequence = this.f28822s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f28823w) / 2.0f, descent, textPaint);
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
            up upVar = this.f28819f;
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
        if (TextUtils.equals(this.f28822s, charSequence)) {
            return;
        }
        this.f28822s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f28822s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28823w = f10;
        requestLayout();
        this.f28815a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f28815a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28819f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
