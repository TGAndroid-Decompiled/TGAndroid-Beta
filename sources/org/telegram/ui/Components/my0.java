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
public final class my0 {
    public final TextPaint f36145a;
    public StaticLayout f36146b;
    public float f36147c;
    public float d;
    public float f36148e;
    public int f36149f;
    public Layout.Alignment f36150g;
    public float h;
    public boolean f36151i;
    public View f36152j;
    public n5 f36153k;
    public int f36154l;
    public PorterDuffColorFilter f36155m;
    public int f36156n;
    public boolean f36157o;
    public float f36158p;
    public LinearGradient f36159q;
    public Matrix f36160r;
    public Paint f36161s;
    public int f36162t;

    public my0(CharSequence charSequence, TextPaint textPaint) {
        this.f36148e = 9999.0f;
        this.f36149f = 1;
        this.f36150g = Layout.Alignment.ALIGN_NORMAL;
        this.f36154l = 0;
        this.f36158p = -1.0f;
        this.f36145a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f36150g != alignment) {
            this.f36150g = alignment;
            q(this.f36146b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f36146b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f36146b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f36146b == null) {
            return;
        }
        TextPaint textPaint = this.f36145a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f36149f > 1) {
            height = 0.0f;
        } else {
            height = this.f36146b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f36146b;
        if (staticLayout != null) {
            float f10 = this.f36158p;
            if (f10 >= 0.0f && this.f36147c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f36162t, f10 - 1.0f, staticLayout.getHeight() + this.f36162t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f36157o;
            TextPaint textPaint = this.f36145a;
            if (z9) {
                canvas.drawText(this.f36146b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f36146b.draw(canvas);
            }
            if (this.f36151i) {
                if (this.f36155m == null || textPaint.getColor() != this.f36156n) {
                    int color = textPaint.getColor();
                    this.f36156n = color;
                    this.f36155m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                r5.drawAnimatedEmojis(canvas, this.f36146b, this.f36153k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f36155m);
            }
            canvas.restore();
            float f11 = this.f36158p;
            if (f11 >= 0.0f && this.f36147c > f11) {
                if (this.f36159q == null) {
                    this.f36159q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f36160r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f36161s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f36161s.setShader(this.f36159q);
                }
                canvas.save();
                this.f36160r.reset();
                this.f36160r.postTranslate(this.f36158p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f36159q.setLocalMatrix(this.f36160r);
                canvas.drawRect(this.f36158p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f36158p, this.f36146b.getHeight(), this.f36161s);
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
        if (this.f36146b == null) {
            return;
        }
        canvas.save();
        if (this.f36149f > 1) {
            height = 0.0f;
        } else {
            height = this.f36146b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f36145a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f36147c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f36145a.getFontMetricsInt();
    }

    public final float i() {
        return this.f36146b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f36146b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f36146b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f36158p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f36147c);
        }
        return this.f36147c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f36146b.getText());
        }
    }

    public final void m(int i7) {
        this.f36149f = i7;
        q(this.f36146b.getText());
    }

    public final void n(int i7) {
        this.f36145a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f36154l != i7) {
            this.f36154l = i7;
            if (this.f36151i) {
                r5.release(this.f36152j, this.f36153k);
                this.f36153k = r5.update(this.f36154l, this.f36152j, this.f36153k, this.f36146b);
            }
        }
    }

    public final void p(float f10) {
        this.f36148e = f10;
        q(this.f36146b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f36149f > 1) {
            this.f36146b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f36145a, (int) Math.max(this.f36148e, 1.0f)).setAlignment(this.f36150g).setMaxLines(this.f36149f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f36146b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f36145a, (int) Math.max(this.f36148e, 1.0f), this.f36150g, 1.0f, this.h, false);
        }
        if (this.f36150g == Layout.Alignment.ALIGN_CENTER) {
            this.f36147c = this.f36146b.getWidth();
            this.d = 0.0f;
        } else {
            this.f36147c = 0.0f;
            this.d = this.f36146b.getWidth();
            for (int i7 = 0; i7 < this.f36146b.getLineCount(); i7++) {
                this.f36147c = Math.max(this.f36147c, this.f36146b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f36146b.getLineLeft(i7));
            }
        }
        View view = this.f36152j;
        if (view != null && view.isAttachedToWindow()) {
            this.f36153k = r5.update(this.f36154l, this.f36152j, this.f36153k, this.f36146b);
        }
    }

    public final void r(View view) {
        this.f36151i = true;
        this.f36152j = view;
        if (view.isAttachedToWindow()) {
            this.f36153k = r5.update(this.f36154l, view, this.f36153k, this.f36146b);
        }
        view.addOnAttachStateChangeListener(new aa(1, this, view));
    }

    public my0(String str, float f10) {
        this(str, f10, null);
    }

    public my0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f36148e = 9999.0f;
        this.f36149f = 1;
        this.f36150g = Layout.Alignment.ALIGN_NORMAL;
        this.f36154l = 0;
        this.f36158p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36145a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
