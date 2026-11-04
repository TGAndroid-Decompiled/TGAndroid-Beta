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
public final class ly0 {
    public final TextPaint f35916a;
    public StaticLayout f35917b;
    public float f35918c;
    public float d;
    public float f35919e;
    public int f35920f;
    public Layout.Alignment f35921g;
    public float h;
    public boolean f35922i;
    public View f35923j;
    public l5 f35924k;
    public int f35925l;
    public PorterDuffColorFilter f35926m;
    public int f35927n;
    public boolean f35928o;
    public float f35929p;
    public LinearGradient f35930q;
    public Matrix f35931r;
    public Paint f35932s;
    public int f35933t;

    public ly0(CharSequence charSequence, TextPaint textPaint) {
        this.f35919e = 9999.0f;
        this.f35920f = 1;
        this.f35921g = Layout.Alignment.ALIGN_NORMAL;
        this.f35925l = 0;
        this.f35929p = -1.0f;
        this.f35916a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f35921g != alignment) {
            this.f35921g = alignment;
            q(this.f35917b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i3 = 0; i3 < this.f35917b.getLineCount(); i3++) {
            f10 = Math.max(f10, this.f35917b.getLineWidth(i3));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i3, Canvas canvas) {
        float height;
        if (this.f35917b == null) {
            return;
        }
        TextPaint textPaint = this.f35916a;
        textPaint.setColor(i3);
        textPaint.linkColor = i3;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f35920f > 1) {
            height = 0.0f;
        } else {
            height = this.f35917b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f35917b;
        if (staticLayout != null) {
            float f10 = this.f35929p;
            if (f10 >= 0.0f && this.f35918c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f35933t, f10 - 1.0f, staticLayout.getHeight() + this.f35933t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f35928o;
            TextPaint textPaint = this.f35916a;
            if (z10) {
                canvas.drawText(this.f35917b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f35917b.draw(canvas);
            }
            if (this.f35922i) {
                if (this.f35926m == null || textPaint.getColor() != this.f35927n) {
                    int color = textPaint.getColor();
                    this.f35927n = color;
                    this.f35926m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                p5.drawAnimatedEmojis(canvas, this.f35917b, this.f35924k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f35926m);
            }
            canvas.restore();
            float f11 = this.f35929p;
            if (f11 >= 0.0f && this.f35918c > f11) {
                if (this.f35930q == null) {
                    this.f35930q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f35931r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f35932s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f35932s.setShader(this.f35930q);
                }
                canvas.save();
                this.f35931r.reset();
                this.f35931r.postTranslate(this.f35929p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f35930q.setLocalMatrix(this.f35931r);
                canvas.drawRect(this.f35929p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f35929p, this.f35917b.getHeight(), this.f35932s);
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
        if (this.f35917b == null) {
            return;
        }
        canvas.save();
        if (this.f35920f > 1) {
            height = 0.0f;
        } else {
            height = this.f35917b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f35916a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f35918c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f35916a.getFontMetricsInt();
    }

    public final float i() {
        return this.f35917b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f35917b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f35917b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f35929p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f35918c);
        }
        return this.f35918c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f35917b.getText());
        }
    }

    public final void m(int i3) {
        this.f35920f = i3;
        q(this.f35917b.getText());
    }

    public final void n(int i3) {
        this.f35916a.setColor(i3);
    }

    public final void o(int i3) {
        if (this.f35925l != i3) {
            this.f35925l = i3;
            if (this.f35922i) {
                p5.release(this.f35923j, this.f35924k);
                this.f35924k = p5.update(this.f35925l, this.f35923j, this.f35924k, this.f35917b);
            }
        }
    }

    public final void p(float f10) {
        this.f35919e = f10;
        q(this.f35917b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f35920f > 1) {
            this.f35917b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f35916a, (int) Math.max(this.f35919e, 1.0f)).setAlignment(this.f35921g).setMaxLines(this.f35920f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f35917b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f35916a, (int) Math.max(this.f35919e, 1.0f), this.f35921g, 1.0f, this.h, false);
        }
        if (this.f35921g == Layout.Alignment.ALIGN_CENTER) {
            this.f35918c = this.f35917b.getWidth();
            this.d = 0.0f;
        } else {
            this.f35918c = 0.0f;
            this.d = this.f35917b.getWidth();
            for (int i3 = 0; i3 < this.f35917b.getLineCount(); i3++) {
                this.f35918c = Math.max(this.f35918c, this.f35917b.getLineWidth(i3));
                this.d = Math.min(this.d, this.f35917b.getLineLeft(i3));
            }
        }
        View view = this.f35923j;
        if (view != null && view.isAttachedToWindow()) {
            this.f35924k = p5.update(this.f35925l, this.f35923j, this.f35924k, this.f35917b);
        }
    }

    public final void r(View view) {
        this.f35922i = true;
        this.f35923j = view;
        if (view.isAttachedToWindow()) {
            this.f35924k = p5.update(this.f35925l, view, this.f35924k, this.f35917b);
        }
        view.addOnAttachStateChangeListener(new z9(1, this, view));
    }

    public ly0(String str, float f10) {
        this(str, f10, null);
    }

    public ly0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f35919e = 9999.0f;
        this.f35920f = 1;
        this.f35921g = Layout.Alignment.ALIGN_NORMAL;
        this.f35925l = 0;
        this.f35929p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f35916a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
