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
    public final TextPaint f38103a;
    public StaticLayout f38104b;
    public float f38105c;
    public float d;
    public float f38106e;
    public int f38107f;
    public Layout.Alignment f38108g;
    public float h;
    public boolean f38109i;
    public View f38110j;
    public l5 f38111k;
    public int f38112l;
    public PorterDuffColorFilter f38113m;
    public int f38114n;
    public boolean f38115o;
    public float f38116p;
    public LinearGradient f38117q;
    public Matrix f38118r;
    public Paint f38119s;
    public int f38120t;

    public oy0(CharSequence charSequence, TextPaint textPaint) {
        this.f38106e = 9999.0f;
        this.f38107f = 1;
        this.f38108g = Layout.Alignment.ALIGN_NORMAL;
        this.f38112l = 0;
        this.f38116p = -1.0f;
        this.f38103a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f38108g != alignment) {
            this.f38108g = alignment;
            q(this.f38104b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f38104b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f38104b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f38104b == null) {
            return;
        }
        TextPaint textPaint = this.f38103a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f38107f > 1) {
            height = 0.0f;
        } else {
            height = this.f38104b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f38104b;
        if (staticLayout != null) {
            float f10 = this.f38116p;
            if (f10 >= 0.0f && this.f38105c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f38120t, f10 - 1.0f, staticLayout.getHeight() + this.f38120t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f38115o;
            TextPaint textPaint = this.f38103a;
            if (z10) {
                canvas.drawText(this.f38104b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f38104b.draw(canvas);
            }
            if (this.f38109i) {
                if (this.f38113m == null || textPaint.getColor() != this.f38114n) {
                    int color = textPaint.getColor();
                    this.f38114n = color;
                    this.f38113m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                p5.drawAnimatedEmojis(canvas, this.f38104b, this.f38111k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f38113m);
            }
            canvas.restore();
            float f11 = this.f38116p;
            if (f11 >= 0.0f && this.f38105c > f11) {
                if (this.f38117q == null) {
                    this.f38117q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f38118r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f38119s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f38119s.setShader(this.f38117q);
                }
                canvas.save();
                this.f38118r.reset();
                this.f38118r.postTranslate(this.f38116p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f38117q.setLocalMatrix(this.f38118r);
                canvas.drawRect(this.f38116p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f38116p, this.f38104b.getHeight(), this.f38119s);
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
        if (this.f38104b == null) {
            return;
        }
        canvas.save();
        if (this.f38107f > 1) {
            height = 0.0f;
        } else {
            height = this.f38104b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f38103a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f38105c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f38103a.getFontMetricsInt();
    }

    public final float i() {
        return this.f38104b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f38104b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f38104b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f38116p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f38105c);
        }
        return this.f38105c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f38104b.getText());
        }
    }

    public final void m(int i7) {
        this.f38107f = i7;
        q(this.f38104b.getText());
    }

    public final void n(int i7) {
        this.f38103a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f38112l != i7) {
            this.f38112l = i7;
            if (this.f38109i) {
                p5.release(this.f38110j, this.f38111k);
                this.f38111k = p5.update(this.f38112l, this.f38110j, this.f38111k, this.f38104b);
            }
        }
    }

    public final void p(float f10) {
        this.f38106e = f10;
        q(this.f38104b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f38107f > 1) {
            this.f38104b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f38103a, (int) Math.max(this.f38106e, 1.0f)).setAlignment(this.f38108g).setMaxLines(this.f38107f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f38104b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f38103a, (int) Math.max(this.f38106e, 1.0f), this.f38108g, 1.0f, this.h, false);
        }
        if (this.f38108g == Layout.Alignment.ALIGN_CENTER) {
            this.f38105c = this.f38104b.getWidth();
            this.d = 0.0f;
        } else {
            this.f38105c = 0.0f;
            this.d = this.f38104b.getWidth();
            for (int i7 = 0; i7 < this.f38104b.getLineCount(); i7++) {
                this.f38105c = Math.max(this.f38105c, this.f38104b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f38104b.getLineLeft(i7));
            }
        }
        View view = this.f38110j;
        if (view != null && view.isAttachedToWindow()) {
            this.f38111k = p5.update(this.f38112l, this.f38110j, this.f38111k, this.f38104b);
        }
    }

    public final void r(View view) {
        this.f38109i = true;
        this.f38110j = view;
        if (view.isAttachedToWindow()) {
            this.f38111k = p5.update(this.f38112l, view, this.f38111k, this.f38104b);
        }
        view.addOnAttachStateChangeListener(new w9(1, this, view));
    }

    public oy0(String str, float f10) {
        this(str, f10, null);
    }

    public oy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f38106e = 9999.0f;
        this.f38107f = 1;
        this.f38108g = Layout.Alignment.ALIGN_NORMAL;
        this.f38112l = 0;
        this.f38116p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f38103a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
