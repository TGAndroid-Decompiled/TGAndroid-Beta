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
public final class qz0 {
    public final TextPaint f29772a;
    public StaticLayout f29773b;
    public float f29774c;
    public float d;
    public float e;
    public int f29775f;
    public Layout.Alignment f29776g;
    public float h;
    public boolean f29777i;
    public View f29778j;
    public k5 f29779k;
    public int f29780l;
    public PorterDuffColorFilter f29781m;
    public int f29782n;
    public boolean f29783o;
    public float f29784p;
    public LinearGradient f29785q;
    public Matrix f29786r;
    public Paint f29787s;
    public int f29788t;

    public qz0(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f29775f = 1;
        this.f29776g = Layout.Alignment.ALIGN_NORMAL;
        this.f29780l = 0;
        this.f29784p = -1.0f;
        this.f29772a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f29776g != alignment) {
            this.f29776g = alignment;
            q(this.f29773b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f29773b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f29773b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f29773b == null) {
            return;
        }
        TextPaint textPaint = this.f29772a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f29775f > 1) {
            height = 0.0f;
        } else {
            height = this.f29773b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f29773b;
        if (staticLayout != null) {
            float f7 = this.f29784p;
            if (f7 >= 0.0f && this.f29774c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f29788t, f7 - 1.0f, staticLayout.getHeight() + this.f29788t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f29783o;
            TextPaint textPaint = this.f29772a;
            if (z10) {
                canvas.drawText(this.f29773b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f29773b.draw(canvas);
            }
            if (this.f29777i) {
                if (this.f29781m == null || textPaint.getColor() != this.f29782n) {
                    int color = textPaint.getColor();
                    this.f29782n = color;
                    this.f29781m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                o5.drawAnimatedEmojis(canvas, this.f29773b, this.f29779k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f29781m);
            }
            canvas.restore();
            float f10 = this.f29784p;
            if (f10 >= 0.0f && this.f29774c > f10) {
                if (this.f29785q == null) {
                    this.f29785q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f29786r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f29787s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f29787s.setShader(this.f29785q);
                }
                canvas.save();
                this.f29786r.reset();
                this.f29786r.postTranslate(this.f29784p - org.telegram.messenger.i0.L(8.0f), 0.0f);
                this.f29785q.setLocalMatrix(this.f29786r);
                canvas.drawRect(this.f29784p - org.telegram.messenger.i0.L(8.0f), 0.0f, this.f29784p, this.f29773b.getHeight(), this.f29787s);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final void e(Canvas canvas, float f7, float f10) {
        f(canvas, f7, f10, 1.0f);
    }

    public final void f(Canvas canvas, float f7, float f10, float f11) {
        float height;
        if (this.f29773b == null) {
            return;
        }
        canvas.save();
        if (this.f29775f > 1) {
            height = 0.0f;
        } else {
            height = this.f29773b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f29772a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f29774c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f29772a.getFontMetricsInt();
    }

    public final float i() {
        return this.f29773b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f29773b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f29773b.getText();
        }
        return "";
    }

    public final float k() {
        float f7 = this.f29784p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f29774c);
        }
        return this.f29774c;
    }

    public final void l(float f7) {
        if (this.h != f7) {
            this.h = f7;
            q(this.f29773b.getText());
        }
    }

    public final void m(int i10) {
        this.f29775f = i10;
        q(this.f29773b.getText());
    }

    public final void n(int i10) {
        this.f29772a.setColor(i10);
    }

    public final void o(int i10) {
        if (this.f29780l != i10) {
            this.f29780l = i10;
            if (this.f29777i) {
                o5.release(this.f29778j, this.f29779k);
                this.f29779k = o5.update(this.f29780l, this.f29778j, this.f29779k, this.f29773b);
            }
        }
    }

    public final void p(float f7) {
        this.e = f7;
        q(this.f29773b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f29775f > 1) {
            this.f29773b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29772a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f29776g).setMaxLines(this.f29775f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f29773b = new StaticLayout(org.telegram.messenger.i0.M2(charSequence), this.f29772a, (int) Math.max(this.e, 1.0f), this.f29776g, 1.0f, this.h, false);
        }
        if (this.f29776g == Layout.Alignment.ALIGN_CENTER) {
            this.f29774c = this.f29773b.getWidth();
            this.d = 0.0f;
        } else {
            this.f29774c = 0.0f;
            this.d = this.f29773b.getWidth();
            for (int i10 = 0; i10 < this.f29773b.getLineCount(); i10++) {
                this.f29774c = Math.max(this.f29774c, this.f29773b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f29773b.getLineLeft(i10));
            }
        }
        View view = this.f29778j;
        if (view != null && view.isAttachedToWindow()) {
            this.f29779k = o5.update(this.f29780l, this.f29778j, this.f29779k, this.f29773b);
        }
    }

    public final void r(View view) {
        this.f29777i = true;
        this.f29778j = view;
        if (view.isAttachedToWindow()) {
            this.f29779k = o5.update(this.f29780l, view, this.f29779k, this.f29773b);
        }
        view.addOnAttachStateChangeListener(new u9(1, this, view));
    }

    public qz0(String str, float f7) {
        this(str, f7, null);
    }

    public qz0(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f29775f = 1;
        this.f29776g = Layout.Alignment.ALIGN_NORMAL;
        this.f29780l = 0;
        this.f29784p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29772a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
