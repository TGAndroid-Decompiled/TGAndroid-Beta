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
    public final TextPaint f42222a;
    public StaticLayout f42223b;
    public float f42224c;
    public float d;
    public float f42225e;
    public int f42226f;
    public Layout.Alignment f42227g;
    public float h;
    public boolean f42228i;
    public View f42229j;
    public u5 f42230k;
    public int f42231l;
    public PorterDuffColorFilter f42232m;
    public int f42233n;
    public boolean f42234o;
    public float f42235p;
    public LinearGradient f42236q;
    public Matrix f42237r;
    public Paint f42238s;
    public int f42239t;

    public xy0(CharSequence charSequence, TextPaint textPaint) {
        this.f42225e = 9999.0f;
        this.f42226f = 1;
        this.f42227g = Layout.Alignment.ALIGN_NORMAL;
        this.f42231l = 0;
        this.f42235p = -1.0f;
        this.f42222a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f42227g != alignment) {
            this.f42227g = alignment;
            q(this.f42223b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f42223b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f42223b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f42223b == null) {
            return;
        }
        TextPaint textPaint = this.f42222a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f42226f > 1) {
            height = 0.0f;
        } else {
            height = this.f42223b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f42223b;
        if (staticLayout != null) {
            float f10 = this.f42235p;
            if (f10 >= 0.0f && this.f42224c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f42239t, f10 - 1.0f, staticLayout.getHeight() + this.f42239t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f42234o;
            TextPaint textPaint = this.f42222a;
            if (z10) {
                canvas.drawText(this.f42223b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f42223b.draw(canvas);
            }
            if (this.f42228i) {
                if (this.f42232m == null || textPaint.getColor() != this.f42233n) {
                    int color = textPaint.getColor();
                    this.f42233n = color;
                    this.f42232m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f42223b, this.f42230k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f42232m);
            }
            canvas.restore();
            float f11 = this.f42235p;
            if (f11 >= 0.0f && this.f42224c > f11) {
                if (this.f42236q == null) {
                    this.f42236q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f42237r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f42238s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f42238s.setShader(this.f42236q);
                }
                canvas.save();
                this.f42237r.reset();
                this.f42237r.postTranslate(this.f42235p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f42236q.setLocalMatrix(this.f42237r);
                canvas.drawRect(this.f42235p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f42235p, this.f42223b.getHeight(), this.f42238s);
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
        if (this.f42223b == null) {
            return;
        }
        canvas.save();
        if (this.f42226f > 1) {
            height = 0.0f;
        } else {
            height = this.f42223b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f42222a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f42224c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f42222a.getFontMetricsInt();
    }

    public final float i() {
        return this.f42223b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f42223b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f42223b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f42235p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f42224c);
        }
        return this.f42224c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f42223b.getText());
        }
    }

    public final void m(int i7) {
        this.f42226f = i7;
        q(this.f42223b.getText());
    }

    public final void n(int i7) {
        this.f42222a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f42231l != i7) {
            this.f42231l = i7;
            if (this.f42228i) {
                y5.release(this.f42229j, this.f42230k);
                this.f42230k = y5.update(this.f42231l, this.f42229j, this.f42230k, this.f42223b);
            }
        }
    }

    public final void p(float f10) {
        this.f42225e = f10;
        q(this.f42223b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f42226f > 1) {
            this.f42223b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f42222a, (int) Math.max(this.f42225e, 1.0f)).setAlignment(this.f42227g).setMaxLines(this.f42226f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f42223b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f42222a, (int) Math.max(this.f42225e, 1.0f), this.f42227g, 1.0f, this.h, false);
        }
        if (this.f42227g == Layout.Alignment.ALIGN_CENTER) {
            this.f42224c = this.f42223b.getWidth();
            this.d = 0.0f;
        } else {
            this.f42224c = 0.0f;
            this.d = this.f42223b.getWidth();
            for (int i7 = 0; i7 < this.f42223b.getLineCount(); i7++) {
                this.f42224c = Math.max(this.f42224c, this.f42223b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f42223b.getLineLeft(i7));
            }
        }
        View view = this.f42229j;
        if (view != null && view.isAttachedToWindow()) {
            this.f42230k = y5.update(this.f42231l, this.f42229j, this.f42230k, this.f42223b);
        }
    }

    public final void r(View view) {
        this.f42228i = true;
        this.f42229j = view;
        if (view.isAttachedToWindow()) {
            this.f42230k = y5.update(this.f42231l, view, this.f42230k, this.f42223b);
        }
        view.addOnAttachStateChangeListener(new ea(1, this, view));
    }

    public xy0(String str, float f10) {
        this(str, f10, null);
    }

    public xy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f42225e = 9999.0f;
        this.f42226f = 1;
        this.f42227g = Layout.Alignment.ALIGN_NORMAL;
        this.f42231l = 0;
        this.f42235p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f42222a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
