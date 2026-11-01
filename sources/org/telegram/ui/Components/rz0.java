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
public final class rz0 {
    public final TextPaint f30124a;
    public StaticLayout f30125b;
    public float f30126c;
    public float d;
    public float e;
    public int f30127f;
    public Layout.Alignment f30128g;
    public float h;
    public boolean f30129i;
    public View f30130j;
    public k5 f30131k;
    public int f30132l;
    public PorterDuffColorFilter f30133m;
    public int f30134n;
    public boolean f30135o;
    public float f30136p;
    public LinearGradient f30137q;
    public Matrix f30138r;
    public Paint f30139s;
    public int f30140t;

    public rz0(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f30127f = 1;
        this.f30128g = Layout.Alignment.ALIGN_NORMAL;
        this.f30132l = 0;
        this.f30136p = -1.0f;
        this.f30124a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f30128g != alignment) {
            this.f30128g = alignment;
            q(this.f30125b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f30125b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f30125b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f30125b == null) {
            return;
        }
        TextPaint textPaint = this.f30124a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f30127f > 1) {
            height = 0.0f;
        } else {
            height = this.f30125b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f30125b;
        if (staticLayout != null) {
            float f7 = this.f30136p;
            if (f7 >= 0.0f && this.f30126c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f30140t, f7 - 1.0f, staticLayout.getHeight() + this.f30140t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f30135o;
            TextPaint textPaint = this.f30124a;
            if (z10) {
                canvas.drawText(this.f30125b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f30125b.draw(canvas);
            }
            if (this.f30129i) {
                if (this.f30133m == null || textPaint.getColor() != this.f30134n) {
                    int color = textPaint.getColor();
                    this.f30134n = color;
                    this.f30133m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                o5.drawAnimatedEmojis(canvas, this.f30125b, this.f30131k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f30133m);
            }
            canvas.restore();
            float f10 = this.f30136p;
            if (f10 >= 0.0f && this.f30126c > f10) {
                if (this.f30137q == null) {
                    this.f30137q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f30138r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f30139s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f30139s.setShader(this.f30137q);
                }
                canvas.save();
                this.f30138r.reset();
                this.f30138r.postTranslate(this.f30136p - org.telegram.messenger.i0.L(8.0f), 0.0f);
                this.f30137q.setLocalMatrix(this.f30138r);
                canvas.drawRect(this.f30136p - org.telegram.messenger.i0.L(8.0f), 0.0f, this.f30136p, this.f30125b.getHeight(), this.f30139s);
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
        if (this.f30125b == null) {
            return;
        }
        canvas.save();
        if (this.f30127f > 1) {
            height = 0.0f;
        } else {
            height = this.f30125b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f30124a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f30126c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f30124a.getFontMetricsInt();
    }

    public final float i() {
        return this.f30125b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f30125b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f30125b.getText();
        }
        return "";
    }

    public final float k() {
        float f7 = this.f30136p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f30126c);
        }
        return this.f30126c;
    }

    public final void l(float f7) {
        if (this.h != f7) {
            this.h = f7;
            q(this.f30125b.getText());
        }
    }

    public final void m(int i10) {
        this.f30127f = i10;
        q(this.f30125b.getText());
    }

    public final void n(int i10) {
        this.f30124a.setColor(i10);
    }

    public final void o(int i10) {
        if (this.f30132l != i10) {
            this.f30132l = i10;
            if (this.f30129i) {
                o5.release(this.f30130j, this.f30131k);
                this.f30131k = o5.update(this.f30132l, this.f30130j, this.f30131k, this.f30125b);
            }
        }
    }

    public final void p(float f7) {
        this.e = f7;
        q(this.f30125b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f30127f > 1) {
            this.f30125b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f30124a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f30128g).setMaxLines(this.f30127f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f30125b = new StaticLayout(org.telegram.messenger.i0.M2(charSequence), this.f30124a, (int) Math.max(this.e, 1.0f), this.f30128g, 1.0f, this.h, false);
        }
        if (this.f30128g == Layout.Alignment.ALIGN_CENTER) {
            this.f30126c = this.f30125b.getWidth();
            this.d = 0.0f;
        } else {
            this.f30126c = 0.0f;
            this.d = this.f30125b.getWidth();
            for (int i10 = 0; i10 < this.f30125b.getLineCount(); i10++) {
                this.f30126c = Math.max(this.f30126c, this.f30125b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f30125b.getLineLeft(i10));
            }
        }
        View view = this.f30130j;
        if (view != null && view.isAttachedToWindow()) {
            this.f30131k = o5.update(this.f30132l, this.f30130j, this.f30131k, this.f30125b);
        }
    }

    public final void r(View view) {
        this.f30129i = true;
        this.f30130j = view;
        if (view.isAttachedToWindow()) {
            this.f30131k = o5.update(this.f30132l, view, this.f30131k, this.f30125b);
        }
        view.addOnAttachStateChangeListener(new u9(1, this, view));
    }

    public rz0(String str, float f7) {
        this(str, f7, null);
    }

    public rz0(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f30127f = 1;
        this.f30128g = Layout.Alignment.ALIGN_NORMAL;
        this.f30132l = 0;
        this.f30136p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f30124a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
