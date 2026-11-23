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
public final class xy0 {
    public final TextPaint f42245a;
    public StaticLayout f42246b;
    public float f42247c;
    public float d;
    public float f42248e;
    public int f42249f;
    public Layout.Alignment f42250g;
    public float h;
    public boolean f42251i;
    public View f42252j;
    public u5 f42253k;
    public int f42254l;
    public PorterDuffColorFilter f42255m;
    public int f42256n;
    public boolean f42257o;
    public float f42258p;
    public LinearGradient f42259q;
    public Matrix f42260r;
    public Paint f42261s;
    public int f42262t;

    public xy0(CharSequence charSequence, TextPaint textPaint) {
        this.f42248e = 9999.0f;
        this.f42249f = 1;
        this.f42250g = Layout.Alignment.ALIGN_NORMAL;
        this.f42254l = 0;
        this.f42258p = -1.0f;
        this.f42245a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f42250g != alignment) {
            this.f42250g = alignment;
            q(this.f42246b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f42246b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f42246b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f42246b == null) {
            return;
        }
        TextPaint textPaint = this.f42245a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f42249f > 1) {
            height = 0.0f;
        } else {
            height = this.f42246b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f42246b;
        if (staticLayout != null) {
            float f10 = this.f42258p;
            if (f10 >= 0.0f && this.f42247c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f42262t, f10 - 1.0f, staticLayout.getHeight() + this.f42262t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f42257o;
            TextPaint textPaint = this.f42245a;
            if (z10) {
                canvas.drawText(this.f42246b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f42246b.draw(canvas);
            }
            if (this.f42251i) {
                if (this.f42255m == null || textPaint.getColor() != this.f42256n) {
                    int color = textPaint.getColor();
                    this.f42256n = color;
                    this.f42255m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f42246b, this.f42253k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f42255m);
            }
            canvas.restore();
            float f11 = this.f42258p;
            if (f11 >= 0.0f && this.f42247c > f11) {
                if (this.f42259q == null) {
                    this.f42259q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f42260r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f42261s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f42261s.setShader(this.f42259q);
                }
                canvas.save();
                this.f42260r.reset();
                this.f42260r.postTranslate(this.f42258p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f42259q.setLocalMatrix(this.f42260r);
                canvas.drawRect(this.f42258p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f42258p, this.f42246b.getHeight(), this.f42261s);
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
        if (this.f42246b == null) {
            return;
        }
        canvas.save();
        if (this.f42249f > 1) {
            height = 0.0f;
        } else {
            height = this.f42246b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f42245a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f42247c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f42245a.getFontMetricsInt();
    }

    public final float i() {
        return this.f42246b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f42246b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f42246b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f42258p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f42247c);
        }
        return this.f42247c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f42246b.getText());
        }
    }

    public final void m(int i7) {
        this.f42249f = i7;
        q(this.f42246b.getText());
    }

    public final void n(int i7) {
        this.f42245a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f42254l != i7) {
            this.f42254l = i7;
            if (this.f42251i) {
                y5.release(this.f42252j, this.f42253k);
                this.f42253k = y5.update(this.f42254l, this.f42252j, this.f42253k, this.f42246b);
            }
        }
    }

    public final void p(float f10) {
        this.f42248e = f10;
        q(this.f42246b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f42249f > 1) {
            this.f42246b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f42245a, (int) Math.max(this.f42248e, 1.0f)).setAlignment(this.f42250g).setMaxLines(this.f42249f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f42246b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f42245a, (int) Math.max(this.f42248e, 1.0f), this.f42250g, 1.0f, this.h, false);
        }
        if (this.f42250g == Layout.Alignment.ALIGN_CENTER) {
            this.f42247c = this.f42246b.getWidth();
            this.d = 0.0f;
        } else {
            this.f42247c = 0.0f;
            this.d = this.f42246b.getWidth();
            for (int i7 = 0; i7 < this.f42246b.getLineCount(); i7++) {
                this.f42247c = Math.max(this.f42247c, this.f42246b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f42246b.getLineLeft(i7));
            }
        }
        View view = this.f42252j;
        if (view != null && view.isAttachedToWindow()) {
            this.f42253k = y5.update(this.f42254l, this.f42252j, this.f42253k, this.f42246b);
        }
    }

    public final void r(View view) {
        this.f42251i = true;
        this.f42252j = view;
        if (view.isAttachedToWindow()) {
            this.f42253k = y5.update(this.f42254l, view, this.f42253k, this.f42246b);
        }
        view.addOnAttachStateChangeListener(new ea(1, this, view));
    }

    public xy0(String str, float f10) {
        this(str, f10, null);
    }

    public xy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f42248e = 9999.0f;
        this.f42249f = 1;
        this.f42250g = Layout.Alignment.ALIGN_NORMAL;
        this.f42254l = 0;
        this.f42258p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f42245a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
