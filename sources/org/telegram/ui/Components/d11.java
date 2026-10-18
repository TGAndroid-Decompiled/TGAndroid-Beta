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
import org.telegram.messenger.AndroidUtilities;
public final class d11 {
    public final TextPaint f25442a;
    public StaticLayout f25443b;
    public float f25444c;
    public float d;
    public float e;
    public int f25445f;
    public Layout.Alignment f25446g;
    public float h;
    public boolean f25447i;
    public View f25448j;
    public w5 f25449k;
    public int f25450l;
    public PorterDuffColorFilter f25451m;
    public int f25452n;
    public boolean f25453o;
    public float f25454p;
    public LinearGradient f25455q;
    public Matrix f25456r;
    public Paint f25457s;
    public int f25458t;

    public d11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25445f = 1;
        this.f25446g = Layout.Alignment.ALIGN_NORMAL;
        this.f25450l = 0;
        this.f25454p = -1.0f;
        this.f25442a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25446g != alignment) {
            this.f25446g = alignment;
            r(this.f25443b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25443b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25443b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25443b == null) {
            return;
        }
        TextPaint textPaint = this.f25442a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25445f > 1) {
            height = 0.0f;
        } else {
            height = this.f25443b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25443b;
        if (staticLayout != null) {
            float f7 = this.f25454p;
            if (f7 >= 0.0f && this.f25444c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25458t, f7 - 1.0f, staticLayout.getHeight() + this.f25458t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25453o;
            TextPaint textPaint = this.f25442a;
            if (z10) {
                canvas.drawText(this.f25443b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25443b.draw(canvas);
            }
            if (this.f25447i) {
                if (this.f25451m == null || textPaint.getColor() != this.f25452n) {
                    int color = textPaint.getColor();
                    this.f25452n = color;
                    this.f25451m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f25443b, this.f25449k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25451m);
            }
            canvas.restore();
            float f10 = this.f25454p;
            if (f10 >= 0.0f && this.f25444c > f10) {
                if (this.f25455q == null) {
                    this.f25455q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25456r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25457s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25457s.setShader(this.f25455q);
                }
                canvas.save();
                this.f25456r.reset();
                this.f25456r.postTranslate(this.f25454p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25455q.setLocalMatrix(this.f25456r);
                canvas.drawRect(this.f25454p - AndroidUtilities.dp(8.0f), 0.0f, this.f25454p, this.f25443b.getHeight(), this.f25457s);
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
        if (this.f25443b == null) {
            return;
        }
        canvas.save();
        if (this.f25445f > 1) {
            height = 0.0f;
        } else {
            height = this.f25443b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25442a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25454p = f7;
    }

    public final float h() {
        return this.f25444c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25442a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25443b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25443b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25443b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25454p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25444c);
        }
        return this.f25444c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25443b.getText());
        }
    }

    public final void n(int i10) {
        this.f25445f = i10;
        r(this.f25443b.getText());
    }

    public final void o(int i10) {
        this.f25442a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25450l != i10) {
            this.f25450l = i10;
            if (this.f25447i) {
                a6.release(this.f25448j, this.f25449k);
                this.f25449k = a6.update(this.f25450l, this.f25448j, this.f25449k, this.f25443b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25443b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25445f > 1) {
            this.f25443b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25442a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25446g).setMaxLines(this.f25445f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25443b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25442a, (int) Math.max(this.e, 1.0f), this.f25446g, 1.0f, this.h, false);
        }
        if (this.f25446g == Layout.Alignment.ALIGN_CENTER) {
            this.f25444c = this.f25443b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25444c = 0.0f;
            this.d = this.f25443b.getWidth();
            for (int i10 = 0; i10 < this.f25443b.getLineCount(); i10++) {
                this.f25444c = Math.max(this.f25444c, this.f25443b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25443b.getLineLeft(i10));
            }
        }
        View view = this.f25448j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25449k = a6.update(this.f25450l, this.f25448j, this.f25449k, this.f25443b);
        }
    }

    public final void s(View view) {
        this.f25447i = true;
        this.f25448j = view;
        if (view.isAttachedToWindow()) {
            this.f25449k = a6.update(this.f25450l, view, this.f25449k, this.f25443b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public d11(String str, float f7) {
        this(str, f7, null);
    }

    public d11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25445f = 1;
        this.f25446g = Layout.Alignment.ALIGN_NORMAL;
        this.f25450l = 0;
        this.f25454p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25442a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
