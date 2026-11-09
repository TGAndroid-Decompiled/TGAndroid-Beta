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
public final class ny0 {
    public final TextPaint f36539a;
    public StaticLayout f36540b;
    public float f36541c;
    public float d;
    public float f36542e;
    public int f36543f;
    public Layout.Alignment f36544g;
    public float h;
    public boolean f36545i;
    public View f36546j;
    public n5 f36547k;
    public int f36548l;
    public PorterDuffColorFilter f36549m;
    public int f36550n;
    public boolean f36551o;
    public float f36552p;
    public LinearGradient f36553q;
    public Matrix f36554r;
    public Paint f36555s;
    public int f36556t;

    public ny0(CharSequence charSequence, TextPaint textPaint) {
        this.f36542e = 9999.0f;
        this.f36543f = 1;
        this.f36544g = Layout.Alignment.ALIGN_NORMAL;
        this.f36548l = 0;
        this.f36552p = -1.0f;
        this.f36539a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f36544g != alignment) {
            this.f36544g = alignment;
            q(this.f36540b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f36540b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f36540b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f36540b == null) {
            return;
        }
        TextPaint textPaint = this.f36539a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f36543f > 1) {
            height = 0.0f;
        } else {
            height = this.f36540b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f36540b;
        if (staticLayout != null) {
            float f10 = this.f36552p;
            if (f10 >= 0.0f && this.f36541c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f36556t, f10 - 1.0f, staticLayout.getHeight() + this.f36556t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f36551o;
            TextPaint textPaint = this.f36539a;
            if (z9) {
                canvas.drawText(this.f36540b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f36540b.draw(canvas);
            }
            if (this.f36545i) {
                if (this.f36549m == null || textPaint.getColor() != this.f36550n) {
                    int color = textPaint.getColor();
                    this.f36550n = color;
                    this.f36549m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                r5.drawAnimatedEmojis(canvas, this.f36540b, this.f36547k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f36549m);
            }
            canvas.restore();
            float f11 = this.f36552p;
            if (f11 >= 0.0f && this.f36541c > f11) {
                if (this.f36553q == null) {
                    this.f36553q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f36554r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f36555s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f36555s.setShader(this.f36553q);
                }
                canvas.save();
                this.f36554r.reset();
                this.f36554r.postTranslate(this.f36552p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f36553q.setLocalMatrix(this.f36554r);
                canvas.drawRect(this.f36552p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f36552p, this.f36540b.getHeight(), this.f36555s);
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
        if (this.f36540b == null) {
            return;
        }
        canvas.save();
        if (this.f36543f > 1) {
            height = 0.0f;
        } else {
            height = this.f36540b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f36539a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f36541c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f36539a.getFontMetricsInt();
    }

    public final float i() {
        return this.f36540b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f36540b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f36540b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f36552p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f36541c);
        }
        return this.f36541c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f36540b.getText());
        }
    }

    public final void m(int i7) {
        this.f36543f = i7;
        q(this.f36540b.getText());
    }

    public final void n(int i7) {
        this.f36539a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f36548l != i7) {
            this.f36548l = i7;
            if (this.f36545i) {
                r5.release(this.f36546j, this.f36547k);
                this.f36547k = r5.update(this.f36548l, this.f36546j, this.f36547k, this.f36540b);
            }
        }
    }

    public final void p(float f10) {
        this.f36542e = f10;
        q(this.f36540b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f36543f > 1) {
            this.f36540b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f36539a, (int) Math.max(this.f36542e, 1.0f)).setAlignment(this.f36544g).setMaxLines(this.f36543f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f36540b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f36539a, (int) Math.max(this.f36542e, 1.0f), this.f36544g, 1.0f, this.h, false);
        }
        if (this.f36544g == Layout.Alignment.ALIGN_CENTER) {
            this.f36541c = this.f36540b.getWidth();
            this.d = 0.0f;
        } else {
            this.f36541c = 0.0f;
            this.d = this.f36540b.getWidth();
            for (int i7 = 0; i7 < this.f36540b.getLineCount(); i7++) {
                this.f36541c = Math.max(this.f36541c, this.f36540b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f36540b.getLineLeft(i7));
            }
        }
        View view = this.f36546j;
        if (view != null && view.isAttachedToWindow()) {
            this.f36547k = r5.update(this.f36548l, this.f36546j, this.f36547k, this.f36540b);
        }
    }

    public final void r(View view) {
        this.f36545i = true;
        this.f36546j = view;
        if (view.isAttachedToWindow()) {
            this.f36547k = r5.update(this.f36548l, view, this.f36547k, this.f36540b);
        }
        view.addOnAttachStateChangeListener(new aa(1, this, view));
    }

    public ny0(String str, float f10) {
        this(str, f10, null);
    }

    public ny0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f36542e = 9999.0f;
        this.f36543f = 1;
        this.f36544g = Layout.Alignment.ALIGN_NORMAL;
        this.f36548l = 0;
        this.f36552p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36539a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
