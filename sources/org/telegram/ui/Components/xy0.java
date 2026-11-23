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
    public final TextPaint f42244a;
    public StaticLayout f42245b;
    public float f42246c;
    public float d;
    public float f42247e;
    public int f42248f;
    public Layout.Alignment f42249g;
    public float h;
    public boolean f42250i;
    public View f42251j;
    public u5 f42252k;
    public int f42253l;
    public PorterDuffColorFilter f42254m;
    public int f42255n;
    public boolean f42256o;
    public float f42257p;
    public LinearGradient f42258q;
    public Matrix f42259r;
    public Paint f42260s;
    public int f42261t;

    public xy0(CharSequence charSequence, TextPaint textPaint) {
        this.f42247e = 9999.0f;
        this.f42248f = 1;
        this.f42249g = Layout.Alignment.ALIGN_NORMAL;
        this.f42253l = 0;
        this.f42257p = -1.0f;
        this.f42244a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f42249g != alignment) {
            this.f42249g = alignment;
            q(this.f42245b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f42245b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f42245b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f42245b == null) {
            return;
        }
        TextPaint textPaint = this.f42244a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f42248f > 1) {
            height = 0.0f;
        } else {
            height = this.f42245b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f42245b;
        if (staticLayout != null) {
            float f10 = this.f42257p;
            if (f10 >= 0.0f && this.f42246c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f42261t, f10 - 1.0f, staticLayout.getHeight() + this.f42261t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f42256o;
            TextPaint textPaint = this.f42244a;
            if (z10) {
                canvas.drawText(this.f42245b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f42245b.draw(canvas);
            }
            if (this.f42250i) {
                if (this.f42254m == null || textPaint.getColor() != this.f42255n) {
                    int color = textPaint.getColor();
                    this.f42255n = color;
                    this.f42254m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f42245b, this.f42252k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f42254m);
            }
            canvas.restore();
            float f11 = this.f42257p;
            if (f11 >= 0.0f && this.f42246c > f11) {
                if (this.f42258q == null) {
                    this.f42258q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f42259r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f42260s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f42260s.setShader(this.f42258q);
                }
                canvas.save();
                this.f42259r.reset();
                this.f42259r.postTranslate(this.f42257p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f42258q.setLocalMatrix(this.f42259r);
                canvas.drawRect(this.f42257p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f42257p, this.f42245b.getHeight(), this.f42260s);
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
        if (this.f42245b == null) {
            return;
        }
        canvas.save();
        if (this.f42248f > 1) {
            height = 0.0f;
        } else {
            height = this.f42245b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f42244a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f42246c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f42244a.getFontMetricsInt();
    }

    public final float i() {
        return this.f42245b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f42245b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f42245b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f42257p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f42246c);
        }
        return this.f42246c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f42245b.getText());
        }
    }

    public final void m(int i7) {
        this.f42248f = i7;
        q(this.f42245b.getText());
    }

    public final void n(int i7) {
        this.f42244a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f42253l != i7) {
            this.f42253l = i7;
            if (this.f42250i) {
                y5.release(this.f42251j, this.f42252k);
                this.f42252k = y5.update(this.f42253l, this.f42251j, this.f42252k, this.f42245b);
            }
        }
    }

    public final void p(float f10) {
        this.f42247e = f10;
        q(this.f42245b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f42248f > 1) {
            this.f42245b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f42244a, (int) Math.max(this.f42247e, 1.0f)).setAlignment(this.f42249g).setMaxLines(this.f42248f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f42245b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f42244a, (int) Math.max(this.f42247e, 1.0f), this.f42249g, 1.0f, this.h, false);
        }
        if (this.f42249g == Layout.Alignment.ALIGN_CENTER) {
            this.f42246c = this.f42245b.getWidth();
            this.d = 0.0f;
        } else {
            this.f42246c = 0.0f;
            this.d = this.f42245b.getWidth();
            for (int i7 = 0; i7 < this.f42245b.getLineCount(); i7++) {
                this.f42246c = Math.max(this.f42246c, this.f42245b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f42245b.getLineLeft(i7));
            }
        }
        View view = this.f42251j;
        if (view != null && view.isAttachedToWindow()) {
            this.f42252k = y5.update(this.f42253l, this.f42251j, this.f42252k, this.f42245b);
        }
    }

    public final void r(View view) {
        this.f42250i = true;
        this.f42251j = view;
        if (view.isAttachedToWindow()) {
            this.f42252k = y5.update(this.f42253l, view, this.f42252k, this.f42245b);
        }
        view.addOnAttachStateChangeListener(new ea(1, this, view));
    }

    public xy0(String str, float f10) {
        this(str, f10, null);
    }

    public xy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f42247e = 9999.0f;
        this.f42248f = 1;
        this.f42249g = Layout.Alignment.ALIGN_NORMAL;
        this.f42253l = 0;
        this.f42257p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f42244a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
