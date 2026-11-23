package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class wy0 {
    public final TextPaint f41761a;
    public StaticLayout f41762b;
    public float f41763c;
    public float d;
    public float f41764e;
    public int f41765f;
    public Layout.Alignment f41766g;
    public float h;
    public boolean f41767i;
    public View f41768j;
    public t5 f41769k;
    public int f41770l;
    public PorterDuffColorFilter f41771m;
    public int f41772n;
    public boolean f41773o;
    public float f41774p;
    public LinearGradient f41775q;
    public Matrix f41776r;
    public Paint f41777s;
    public int f41778t;

    public wy0(CharSequence charSequence, TextPaint textPaint) {
        this.f41764e = 9999.0f;
        this.f41765f = 1;
        this.f41766g = Layout.Alignment.ALIGN_NORMAL;
        this.f41770l = 0;
        this.f41774p = -1.0f;
        this.f41761a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f41766g != alignment) {
            this.f41766g = alignment;
            q(this.f41762b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f41762b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f41762b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f41762b == null) {
            return;
        }
        TextPaint textPaint = this.f41761a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f41765f > 1) {
            height = 0.0f;
        } else {
            height = this.f41762b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f41762b;
        if (staticLayout != null) {
            float f10 = this.f41774p;
            if (f10 >= 0.0f && this.f41763c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f41778t, f10 - 1.0f, staticLayout.getHeight() + this.f41778t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f41773o;
            TextPaint textPaint = this.f41761a;
            if (z10) {
                canvas.drawText(this.f41762b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f41762b.draw(canvas);
            }
            if (this.f41767i) {
                if (this.f41771m == null || textPaint.getColor() != this.f41772n) {
                    int color = textPaint.getColor();
                    this.f41772n = color;
                    this.f41771m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f41762b, this.f41769k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f41771m);
            }
            canvas.restore();
            float f11 = this.f41774p;
            if (f11 >= 0.0f && this.f41763c > f11) {
                if (this.f41775q == null) {
                    this.f41775q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f41776r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f41777s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f41777s.setShader(this.f41775q);
                }
                canvas.save();
                this.f41776r.reset();
                this.f41776r.postTranslate(this.f41774p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f41775q.setLocalMatrix(this.f41776r);
                canvas.drawRect(this.f41774p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f41774p, this.f41762b.getHeight(), this.f41777s);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final void e(Canvas canvas, float f10, float f11) {
        f(canvas, f10, f11, 1.0f);
    }

    public final void f(Canvas canvas, float f10, float f11, float f12) {
        float height;
        if (this.f41762b == null) {
            return;
        }
        canvas.save();
        if (this.f41765f > 1) {
            height = 0.0f;
        } else {
            height = this.f41762b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f41761a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f41763c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f41761a.getFontMetricsInt();
    }

    public final float i() {
        return this.f41762b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f41762b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f41762b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f41774p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f41763c);
        }
        return this.f41763c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f41762b.getText());
        }
    }

    public final void m(int i7) {
        this.f41765f = i7;
        q(this.f41762b.getText());
    }

    public final void n(int i7) {
        this.f41761a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f41770l != i7) {
            this.f41770l = i7;
            if (this.f41767i) {
                x5.release(this.f41768j, this.f41769k);
                this.f41769k = x5.update(this.f41770l, this.f41768j, this.f41769k, this.f41762b);
            }
        }
    }

    public final void p(float f10) {
        this.f41764e = f10;
        q(this.f41762b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f41765f > 1) {
            this.f41762b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f41761a, (int) Math.max(this.f41764e, 1.0f)).setAlignment(this.f41766g).setMaxLines(this.f41765f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f41762b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f41761a, (int) Math.max(this.f41764e, 1.0f), this.f41766g, 1.0f, this.h, false);
        }
        if (this.f41766g == Layout.Alignment.ALIGN_CENTER) {
            this.f41763c = this.f41762b.getWidth();
            this.d = 0.0f;
        } else {
            this.f41763c = 0.0f;
            this.d = this.f41762b.getWidth();
            for (int i7 = 0; i7 < this.f41762b.getLineCount(); i7++) {
                this.f41763c = Math.max(this.f41763c, this.f41762b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f41762b.getLineLeft(i7));
            }
        }
        View view = this.f41768j;
        if (view != null && view.isAttachedToWindow()) {
            this.f41769k = x5.update(this.f41770l, this.f41768j, this.f41769k, this.f41762b);
        }
    }

    public final void r(View view) {
        this.f41767i = true;
        this.f41768j = view;
        if (view.isAttachedToWindow()) {
            this.f41769k = x5.update(this.f41770l, view, this.f41769k, this.f41762b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public wy0(String str, float f10) {
        this(str, f10, null);
    }

    public wy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f41764e = 9999.0f;
        this.f41765f = 1;
        this.f41766g = Layout.Alignment.ALIGN_NORMAL;
        this.f41770l = 0;
        this.f41774p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f41761a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
