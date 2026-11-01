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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
public final class l5 extends View implements fe.e {
    public int D;
    public int E;
    public int F;
    public final i5 f20539a;
    public final int f20540b;
    public final k5 f20541c;
    public final j5 d;
    public final Drawable e;
    public final kp f20542f;
    public final TextPaint h;
    public final Paint f20543n;
    public final RectF f20544r;
    public CharSequence f20545s;
    public float f20546w;
    public final fe.b f20547x;
    public final fe.b f20548y;

    public l5(Context context, i5 i5Var, CharSequence charSequence) {
        super(context);
        float f7;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f20543n = new Paint(1);
        this.f20544r = new RectF();
        gr grVar = gr.h;
        this.f20547x = new fe.b(0, this, grVar, 380L, true);
        this.f20548y = new fe.b(1, this, grVar, 250L, false);
        this.f20539a = i5Var;
        this.f20540b = 1;
        this.f20541c = (k5) mi.e.f13392k.a();
        this.d = (j5) mi.e.f13393l.a();
        this.f20545s = charSequence;
        this.e = context.getDrawable(2131231243).mutate();
        kp kpVar = new kp(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(2.0f), -1);
        this.f20542f = kpVar;
        kpVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        c();
        CharSequence charSequence2 = this.f20545s;
        if (charSequence2 != null) {
            f7 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f7 = 0.0f;
        }
        this.f20546w = f7;
        setContentDescription(charSequence);
        setOnClickListener(new ag.g(this, 19));
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        fe.f fVar;
        fe.b bVar = this.f20547x;
        if (bVar.f7022f == z10 && (z11 || (fVar = bVar.h) == null || !fVar.h)) {
            return;
        }
        i5 i5Var = this.f20539a;
        if (z11 && i5Var.t()) {
            z12 = true;
        } else {
            z12 = false;
        }
        bVar.a(z10, z12);
        v(0, bVar.e, 0.0f, null);
        i5Var.requestLayout();
    }

    public final void b(boolean z10) {
        this.f20548y.a(z10, this.f20539a.t());
        invalidate();
    }

    public final void c() {
        int i10;
        i5 i5Var = this.f20539a;
        p6 p6Var = i5Var.f20406a;
        this.D = t6.w0(t6.Ci, p6Var);
        this.E = i0.b.f(0.5f, t6.w0(t6.f20873a7, p6Var), this.D);
        int w02 = t6.w0(t6.Gi, p6Var);
        this.F = w02;
        int i11 = i5Var.f20415f0;
        k5 k5Var = this.f20541c;
        k5 k5Var2 = k5.f20467b;
        if (k5Var != k5Var2) {
            w02 = i11;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        this.f20542f.b(w02);
        this.h.setColor(w02);
        if (k5Var == k5Var2) {
            i10 = t6.r1(0.2f, this.F);
        } else {
            i10 = i5Var.f20417h0;
        }
        setBackground(t6.a0(i10, org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.f20540b;
    }

    public int getButtonWidth() {
        if (this.d != j5.f20444a && !TextUtils.isEmpty(this.f20545s)) {
            return org.telegram.messenger.m5.b(32.0f, (int) Math.ceil(this.f20546w), org.telegram.messenger.i0.L(46.0f));
        }
        return org.telegram.messenger.i0.L(46.0f);
    }

    public j5 getShape() {
        return this.d;
    }

    public k5 getStyle() {
        return this.f20541c;
    }

    public float getTargetVisibleFactor() {
        if (this.f20541c != k5.f20467b && !this.f20547x.f7022f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.f20541c == k5.f20467b) {
            return 1.0f;
        }
        return this.f20547x.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float width = getWidth();
        float height = getHeight();
        if (this.f20541c == k5.f20467b) {
            int f10 = i0.b.f(this.f20547x.e, this.E, this.D);
            Paint paint = this.f20543n;
            paint.setColor(f10);
            RectF rectF = this.f20544r;
            rectF.set(0.0f, 0.0f, width, height);
            float f11 = height / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        float f12 = this.f20548y.e;
        if (f12 < 1.0f) {
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.6f, f12);
            canvas.save();
            canvas.scale(T1, T1, width / 2.0f, height / 2.0f);
            float f13 = 1.0f - f12;
            int i10 = (int) (f13 * 255.0f);
            if (this.d == j5.f20444a || TextUtils.isEmpty(this.f20545s)) {
                f7 = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            } else {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f13));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.f20545s;
                f7 = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.f20546w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f7 = 0.0f;
        }
        if (f12 > f7) {
            float T12 = org.telegram.messenger.i0.T1(0.6f, 1.0f, f12);
            canvas.save();
            canvas.scale(T12, T12, width / 2.0f, height / 2.0f);
            kp kpVar = this.f20542f;
            kpVar.setBounds(0, 0, (int) width, (int) height);
            kpVar.setAlpha((int) (f12 * 255.0f));
            kpVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(getButtonWidth(), org.telegram.messenger.i0.L(46.0f));
    }

    public void setText(CharSequence charSequence) {
        float f7;
        if (TextUtils.equals(this.f20545s, charSequence)) {
            return;
        }
        this.f20545s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f20545s;
        if (charSequence2 != null) {
            f7 = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f7 = 0.0f;
        }
        this.f20546w = f7;
        requestLayout();
        this.f20539a.requestLayout();
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        this.f20539a.invalidate();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            this.f20539a.g();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f20542f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
