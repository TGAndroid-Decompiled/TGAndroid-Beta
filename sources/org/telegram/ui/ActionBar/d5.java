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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sp;
public final class d5 extends View implements te.b {
    public int E;
    public int F;
    public int G;
    public final a5 f28863a;
    public final int f28864b;
    public final c5 f28865c;
    public final b5 d;
    public final Drawable f28866e;
    public final sp f28867f;
    public final TextPaint h;
    public final Paint f28868n;
    public final RectF f28869r;
    public CharSequence f28870s;
    public float f28871w;
    public final te.a f28872x;
    public final te.a f28873y;

    public d5(Context context, a5 a5Var, CharSequence charSequence) {
        super(context);
        float f10;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f28868n = new Paint(1);
        this.f28869r = new RectF();
        lr lrVar = lr.h;
        this.f28872x = new te.a(0, this, lrVar, 380L, true);
        this.f28873y = new te.a(1, this, lrVar, 250L, false);
        this.f28863a = a5Var;
        this.f28864b = 1;
        this.f28865c = (c5) aj.e.f1656k.a();
        this.d = (b5) aj.e.f1657l.a();
        this.f28870s = charSequence;
        this.f28866e = context.getDrawable(2131231242).mutate();
        sp spVar = new sp(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(2.0f), -1);
        this.f28867f = spVar;
        spVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f28870s;
        if (charSequence2 != null) {
            f10 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28871w = f10;
        setContentDescription(charSequence);
        setOnClickListener(new hi.o0(this, 24));
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f28863a.l();
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        te.c cVar;
        te.a aVar = this.f28872x;
        if (aVar.f57658f == z10 && (z11 || (cVar = aVar.h) == null || !cVar.h)) {
            return;
        }
        a5 a5Var = this.f28863a;
        if (z11 && a5Var.y()) {
            z12 = true;
        } else {
            z12 = false;
        }
        aVar.a(z10, z12);
        H(0, aVar.f57657e, 0.0f, null);
        a5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f28873y.a(z10, this.f28863a.y());
        invalidate();
    }

    public final void c() {
        int i7;
        a5 a5Var = this.f28863a;
        i6 i6Var = a5Var.f28760a;
        this.E = n6.w0(n6.Fi, i6Var);
        this.F = i0.a.f(0.5f, n6.w0(n6.f29339a7, i6Var), this.E);
        int w02 = n6.w0(n6.Ji, i6Var);
        this.G = w02;
        int i10 = a5Var.f28771g0;
        c5 c5Var = this.f28865c;
        c5 c5Var2 = c5.f28830b;
        if (c5Var != c5Var2) {
            w02 = i10;
        }
        this.f28866e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f28867f.b(w02);
        this.h.setColor(w02);
        if (c5Var == c5Var2) {
            i7 = n6.r1(0.2f, this.G);
        } else {
            i7 = a5Var.f28773i0;
        }
        setBackground(n6.a0(i7, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f28864b;
    }

    public int getButtonWidth() {
        if (this.d != b5.f28809a && !TextUtils.isEmpty(this.f28870s)) {
            return org.telegram.messenger.f3.b(32.0f, (int) Math.ceil(this.f28871w), org.telegram.messenger.g0.L(46.0f));
        }
        return org.telegram.messenger.g0.L(46.0f);
    }

    public b5 getShape() {
        return this.d;
    }

    public c5 getStyle() {
        return this.f28865c;
    }

    public float getTargetVisibleFactor() {
        if (this.f28865c != c5.f28830b && !this.f28872x.f57658f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f28865c == c5.f28830b) {
            return 1.0f;
        }
        return this.f28872x.f57657e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float width = getWidth();
        float height = getHeight();
        if (this.f28865c == c5.f28830b) {
            int f11 = i0.a.f(this.f28872x.f57657e, this.F, this.E);
            Paint paint = this.f28868n;
            paint.setColor(f11);
            RectF rectF = this.f28869r;
            rectF.set(0.0f, 0.0f, width, height);
            float f12 = height / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        float f13 = this.f28873y.f57657e;
        if (f13 < 1.0f) {
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f13);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f14 = 1.0f - f13;
            int i7 = (int) (f14 * 255.0f);
            if (this.d == b5.f28809a || TextUtils.isEmpty(this.f28870s)) {
                f10 = 0.0f;
                Drawable drawable = this.f28866e;
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
                CharSequence charSequence = this.f28870s;
                f10 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f28871w) / 2.0f, descent, textPaint);
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
            sp spVar = this.f28867f;
            spVar.setBounds(0, 0, (int) width, (int) height);
            spVar.setAlpha((int) (f13 * 255.0f));
            spVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.g0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f10;
        if (TextUtils.equals(this.f28870s, charSequence)) {
            return;
        }
        this.f28870s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f28870s;
        if (charSequence2 != null) {
            f10 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f10 = 0.0f;
        }
        this.f28871w = f10;
        requestLayout();
        this.f28863a.requestLayout();
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        this.f28863a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28867f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
