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
public final class vy0 {
    public final TextPaint f41480a;
    public StaticLayout f41481b;
    public float f41482c;
    public float d;
    public float f41483e;
    public int f41484f;
    public Layout.Alignment f41485g;
    public float h;
    public boolean f41486i;
    public View f41487j;
    public t5 f41488k;
    public int f41489l;
    public PorterDuffColorFilter f41490m;
    public int f41491n;
    public boolean f41492o;
    public float f41493p;
    public LinearGradient f41494q;
    public Matrix f41495r;
    public Paint f41496s;
    public int f41497t;

    public vy0(CharSequence charSequence, TextPaint textPaint) {
        this.f41483e = 9999.0f;
        this.f41484f = 1;
        this.f41485g = Layout.Alignment.ALIGN_NORMAL;
        this.f41489l = 0;
        this.f41493p = -1.0f;
        this.f41480a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f41485g != alignment) {
            this.f41485g = alignment;
            q(this.f41481b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f41481b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f41481b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f41481b == null) {
            return;
        }
        TextPaint textPaint = this.f41480a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f41484f > 1) {
            height = 0.0f;
        } else {
            height = this.f41481b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f41481b;
        if (staticLayout != null) {
            float f10 = this.f41493p;
            if (f10 >= 0.0f && this.f41482c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f41497t, f10 - 1.0f, staticLayout.getHeight() + this.f41497t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f41492o;
            TextPaint textPaint = this.f41480a;
            if (z10) {
                canvas.drawText(this.f41481b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f41481b.draw(canvas);
            }
            if (this.f41486i) {
                if (this.f41490m == null || textPaint.getColor() != this.f41491n) {
                    int color = textPaint.getColor();
                    this.f41491n = color;
                    this.f41490m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f41481b, this.f41488k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f41490m);
            }
            canvas.restore();
            float f11 = this.f41493p;
            if (f11 >= 0.0f && this.f41482c > f11) {
                if (this.f41494q == null) {
                    this.f41494q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f41495r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f41496s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f41496s.setShader(this.f41494q);
                }
                canvas.save();
                this.f41495r.reset();
                this.f41495r.postTranslate(this.f41493p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f41494q.setLocalMatrix(this.f41495r);
                canvas.drawRect(this.f41493p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f41493p, this.f41481b.getHeight(), this.f41496s);
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
        if (this.f41481b == null) {
            return;
        }
        canvas.save();
        if (this.f41484f > 1) {
            height = 0.0f;
        } else {
            height = this.f41481b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f41480a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f41482c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f41480a.getFontMetricsInt();
    }

    public final float i() {
        return this.f41481b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f41481b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f41481b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f41493p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f41482c);
        }
        return this.f41482c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f41481b.getText());
        }
    }

    public final void m(int i7) {
        this.f41484f = i7;
        q(this.f41481b.getText());
    }

    public final void n(int i7) {
        this.f41480a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f41489l != i7) {
            this.f41489l = i7;
            if (this.f41486i) {
                x5.release(this.f41487j, this.f41488k);
                this.f41488k = x5.update(this.f41489l, this.f41487j, this.f41488k, this.f41481b);
            }
        }
    }

    public final void p(float f10) {
        this.f41483e = f10;
        q(this.f41481b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f41484f > 1) {
            this.f41481b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f41480a, (int) Math.max(this.f41483e, 1.0f)).setAlignment(this.f41485g).setMaxLines(this.f41484f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f41481b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f41480a, (int) Math.max(this.f41483e, 1.0f), this.f41485g, 1.0f, this.h, false);
        }
        if (this.f41485g == Layout.Alignment.ALIGN_CENTER) {
            this.f41482c = this.f41481b.getWidth();
            this.d = 0.0f;
        } else {
            this.f41482c = 0.0f;
            this.d = this.f41481b.getWidth();
            for (int i7 = 0; i7 < this.f41481b.getLineCount(); i7++) {
                this.f41482c = Math.max(this.f41482c, this.f41481b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f41481b.getLineLeft(i7));
            }
        }
        View view = this.f41487j;
        if (view != null && view.isAttachedToWindow()) {
            this.f41488k = x5.update(this.f41489l, this.f41487j, this.f41488k, this.f41481b);
        }
    }

    public final void r(View view) {
        this.f41486i = true;
        this.f41487j = view;
        if (view.isAttachedToWindow()) {
            this.f41488k = x5.update(this.f41489l, view, this.f41488k, this.f41481b);
        }
        view.addOnAttachStateChangeListener(new ea(1, this, view));
    }

    public vy0(String str, float f10) {
        this(str, f10, null);
    }

    public vy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f41483e = 9999.0f;
        this.f41484f = 1;
        this.f41485g = Layout.Alignment.ALIGN_NORMAL;
        this.f41489l = 0;
        this.f41493p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f41480a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
