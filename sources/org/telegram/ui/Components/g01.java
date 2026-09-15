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
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g01 {
    public final TextPaint f24147a;
    public StaticLayout f24148b;
    public float f24149c;
    public float d;
    public float e;
    public int f24150f;
    public Layout.Alignment f24151g;
    public float h;
    public boolean f24152i;
    public View f24153j;
    public t5 f24154k;
    public int f24155l;
    public PorterDuffColorFilter f24156m;
    public int f24157n;
    public boolean f24158o;
    public float f24159p;
    public LinearGradient f24160q;
    public Matrix f24161r;
    public Paint f24162s;
    public int f24163t;

    public g01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f24150f = 1;
        this.f24151g = Layout.Alignment.ALIGN_NORMAL;
        this.f24155l = 0;
        this.f24159p = -1.0f;
        this.f24147a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f24151g != alignment) {
            this.f24151g = alignment;
            r(this.f24148b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f24148b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f24148b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f24148b == null) {
            return;
        }
        TextPaint textPaint = this.f24147a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f24150f > 1) {
            height = 0.0f;
        } else {
            height = this.f24148b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f24148b;
        if (staticLayout != null) {
            float f7 = this.f24159p;
            if (f7 >= 0.0f && this.f24149c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f24163t, f7 - 1.0f, staticLayout.getHeight() + this.f24163t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f24158o;
            TextPaint textPaint = this.f24147a;
            if (z10) {
                canvas.drawText(this.f24148b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f24148b.draw(canvas);
            }
            if (this.f24152i) {
                if (this.f24156m == null || textPaint.getColor() != this.f24157n) {
                    int color = textPaint.getColor();
                    this.f24157n = color;
                    this.f24156m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f24148b, this.f24154k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24156m);
            }
            canvas.restore();
            float f10 = this.f24159p;
            if (f10 >= 0.0f && this.f24149c > f10) {
                if (this.f24160q == null) {
                    this.f24160q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f24161r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f24162s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f24162s.setShader(this.f24160q);
                }
                canvas.save();
                this.f24161r.reset();
                this.f24161r.postTranslate(this.f24159p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f24160q.setLocalMatrix(this.f24161r);
                canvas.drawRect(this.f24159p - AndroidUtilities.dp(8.0f), 0.0f, this.f24159p, this.f24148b.getHeight(), this.f24162s);
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
        if (this.f24148b == null) {
            return;
        }
        canvas.save();
        if (this.f24150f > 1) {
            height = 0.0f;
        } else {
            height = this.f24148b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f24147a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f24159p = f7;
    }

    public final float h() {
        return this.f24149c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f24147a.getFontMetricsInt();
    }

    public final float j() {
        return this.f24148b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f24148b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f24148b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f24159p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f24149c);
        }
        return this.f24149c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f24148b.getText());
        }
    }

    public final void n(int i10) {
        this.f24150f = i10;
        r(this.f24148b.getText());
    }

    public final void o(int i10) {
        this.f24147a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f24155l != i10) {
            this.f24155l = i10;
            if (this.f24152i) {
                x5.release(this.f24153j, this.f24154k);
                this.f24154k = x5.update(this.f24155l, this.f24153j, this.f24154k, this.f24148b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f24148b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f24150f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f24148b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f24147a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f24151g).setMaxLines(this.f24150f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f24148b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f24147a, (int) Math.max(this.e, 1.0f), this.f24151g, 1.0f, this.h, false);
        }
        if (this.f24151g == Layout.Alignment.ALIGN_CENTER) {
            this.f24149c = this.f24148b.getWidth();
            this.d = 0.0f;
        } else {
            this.f24149c = 0.0f;
            this.d = this.f24148b.getWidth();
            for (int i10 = 0; i10 < this.f24148b.getLineCount(); i10++) {
                this.f24149c = Math.max(this.f24149c, this.f24148b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f24148b.getLineLeft(i10));
            }
        }
        View view = this.f24153j;
        if (view != null && view.isAttachedToWindow()) {
            this.f24154k = x5.update(this.f24155l, this.f24153j, this.f24154k, this.f24148b);
        }
    }

    public final void s(View view) {
        this.f24152i = true;
        this.f24153j = view;
        if (view.isAttachedToWindow()) {
            this.f24154k = x5.update(this.f24155l, view, this.f24154k, this.f24148b);
        }
        view.addOnAttachStateChangeListener(new ja(1, this, view));
    }

    public g01(String str, float f7) {
        this(str, f7, null);
    }

    public g01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f24150f = 1;
        this.f24151g = Layout.Alignment.ALIGN_NORMAL;
        this.f24155l = 0;
        this.f24159p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24147a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
