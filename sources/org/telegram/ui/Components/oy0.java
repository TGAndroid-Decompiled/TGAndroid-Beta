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
public final class oy0 {
    public final TextPaint f38101a;
    public StaticLayout f38102b;
    public float f38103c;
    public float d;
    public float f38104e;
    public int f38105f;
    public Layout.Alignment f38106g;
    public float h;
    public boolean f38107i;
    public View f38108j;
    public l5 f38109k;
    public int f38110l;
    public PorterDuffColorFilter f38111m;
    public int f38112n;
    public boolean f38113o;
    public float f38114p;
    public LinearGradient f38115q;
    public Matrix f38116r;
    public Paint f38117s;
    public int f38118t;

    public oy0(CharSequence charSequence, TextPaint textPaint) {
        this.f38104e = 9999.0f;
        this.f38105f = 1;
        this.f38106g = Layout.Alignment.ALIGN_NORMAL;
        this.f38110l = 0;
        this.f38114p = -1.0f;
        this.f38101a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f38106g != alignment) {
            this.f38106g = alignment;
            q(this.f38102b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f38102b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f38102b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f38102b == null) {
            return;
        }
        TextPaint textPaint = this.f38101a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f38105f > 1) {
            height = 0.0f;
        } else {
            height = this.f38102b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f38102b;
        if (staticLayout != null) {
            float f10 = this.f38114p;
            if (f10 >= 0.0f && this.f38103c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f38118t, f10 - 1.0f, staticLayout.getHeight() + this.f38118t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f38113o;
            TextPaint textPaint = this.f38101a;
            if (z10) {
                canvas.drawText(this.f38102b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f38102b.draw(canvas);
            }
            if (this.f38107i) {
                if (this.f38111m == null || textPaint.getColor() != this.f38112n) {
                    int color = textPaint.getColor();
                    this.f38112n = color;
                    this.f38111m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                p5.drawAnimatedEmojis(canvas, this.f38102b, this.f38109k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f38111m);
            }
            canvas.restore();
            float f11 = this.f38114p;
            if (f11 >= 0.0f && this.f38103c > f11) {
                if (this.f38115q == null) {
                    this.f38115q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f38116r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f38117s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f38117s.setShader(this.f38115q);
                }
                canvas.save();
                this.f38116r.reset();
                this.f38116r.postTranslate(this.f38114p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f38115q.setLocalMatrix(this.f38116r);
                canvas.drawRect(this.f38114p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f38114p, this.f38102b.getHeight(), this.f38117s);
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
        if (this.f38102b == null) {
            return;
        }
        canvas.save();
        if (this.f38105f > 1) {
            height = 0.0f;
        } else {
            height = this.f38102b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f38101a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f38103c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f38101a.getFontMetricsInt();
    }

    public final float i() {
        return this.f38102b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f38102b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f38102b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f38114p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f38103c);
        }
        return this.f38103c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f38102b.getText());
        }
    }

    public final void m(int i7) {
        this.f38105f = i7;
        q(this.f38102b.getText());
    }

    public final void n(int i7) {
        this.f38101a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f38110l != i7) {
            this.f38110l = i7;
            if (this.f38107i) {
                p5.release(this.f38108j, this.f38109k);
                this.f38109k = p5.update(this.f38110l, this.f38108j, this.f38109k, this.f38102b);
            }
        }
    }

    public final void p(float f10) {
        this.f38104e = f10;
        q(this.f38102b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f38105f > 1) {
            this.f38102b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f38101a, (int) Math.max(this.f38104e, 1.0f)).setAlignment(this.f38106g).setMaxLines(this.f38105f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f38102b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f38101a, (int) Math.max(this.f38104e, 1.0f), this.f38106g, 1.0f, this.h, false);
        }
        if (this.f38106g == Layout.Alignment.ALIGN_CENTER) {
            this.f38103c = this.f38102b.getWidth();
            this.d = 0.0f;
        } else {
            this.f38103c = 0.0f;
            this.d = this.f38102b.getWidth();
            for (int i7 = 0; i7 < this.f38102b.getLineCount(); i7++) {
                this.f38103c = Math.max(this.f38103c, this.f38102b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f38102b.getLineLeft(i7));
            }
        }
        View view = this.f38108j;
        if (view != null && view.isAttachedToWindow()) {
            this.f38109k = p5.update(this.f38110l, this.f38108j, this.f38109k, this.f38102b);
        }
    }

    public final void r(View view) {
        this.f38107i = true;
        this.f38108j = view;
        if (view.isAttachedToWindow()) {
            this.f38109k = p5.update(this.f38110l, view, this.f38109k, this.f38102b);
        }
        view.addOnAttachStateChangeListener(new w9(1, this, view));
    }

    public oy0(String str, float f10) {
        this(str, f10, null);
    }

    public oy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f38104e = 9999.0f;
        this.f38105f = 1;
        this.f38106g = Layout.Alignment.ALIGN_NORMAL;
        this.f38110l = 0;
        this.f38114p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f38101a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
