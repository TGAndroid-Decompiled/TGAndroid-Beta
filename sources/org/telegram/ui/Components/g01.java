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
    public final TextPaint f24144a;
    public StaticLayout f24145b;
    public float f24146c;
    public float d;
    public float e;
    public int f24147f;
    public Layout.Alignment f24148g;
    public float h;
    public boolean f24149i;
    public View f24150j;
    public t5 f24151k;
    public int f24152l;
    public PorterDuffColorFilter f24153m;
    public int f24154n;
    public boolean f24155o;
    public float f24156p;
    public LinearGradient f24157q;
    public Matrix f24158r;
    public Paint f24159s;
    public int f24160t;

    public g01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f24147f = 1;
        this.f24148g = Layout.Alignment.ALIGN_NORMAL;
        this.f24152l = 0;
        this.f24156p = -1.0f;
        this.f24144a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f24148g != alignment) {
            this.f24148g = alignment;
            r(this.f24145b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f24145b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f24145b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f24145b == null) {
            return;
        }
        TextPaint textPaint = this.f24144a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f24147f > 1) {
            height = 0.0f;
        } else {
            height = this.f24145b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f24145b;
        if (staticLayout != null) {
            float f7 = this.f24156p;
            if (f7 >= 0.0f && this.f24146c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f24160t, f7 - 1.0f, staticLayout.getHeight() + this.f24160t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f24155o;
            TextPaint textPaint = this.f24144a;
            if (z10) {
                canvas.drawText(this.f24145b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f24145b.draw(canvas);
            }
            if (this.f24149i) {
                if (this.f24153m == null || textPaint.getColor() != this.f24154n) {
                    int color = textPaint.getColor();
                    this.f24154n = color;
                    this.f24153m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f24145b, this.f24151k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24153m);
            }
            canvas.restore();
            float f10 = this.f24156p;
            if (f10 >= 0.0f && this.f24146c > f10) {
                if (this.f24157q == null) {
                    this.f24157q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f24158r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f24159s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f24159s.setShader(this.f24157q);
                }
                canvas.save();
                this.f24158r.reset();
                this.f24158r.postTranslate(this.f24156p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f24157q.setLocalMatrix(this.f24158r);
                canvas.drawRect(this.f24156p - AndroidUtilities.dp(8.0f), 0.0f, this.f24156p, this.f24145b.getHeight(), this.f24159s);
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
        if (this.f24145b == null) {
            return;
        }
        canvas.save();
        if (this.f24147f > 1) {
            height = 0.0f;
        } else {
            height = this.f24145b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f24144a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f24156p = f7;
    }

    public final float h() {
        return this.f24146c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f24144a.getFontMetricsInt();
    }

    public final float j() {
        return this.f24145b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f24145b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f24145b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f24156p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f24146c);
        }
        return this.f24146c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f24145b.getText());
        }
    }

    public final void n(int i10) {
        this.f24147f = i10;
        r(this.f24145b.getText());
    }

    public final void o(int i10) {
        this.f24144a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f24152l != i10) {
            this.f24152l = i10;
            if (this.f24149i) {
                x5.release(this.f24150j, this.f24151k);
                this.f24151k = x5.update(this.f24152l, this.f24150j, this.f24151k, this.f24145b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f24145b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f24147f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f24145b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f24144a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f24148g).setMaxLines(this.f24147f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f24145b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f24144a, (int) Math.max(this.e, 1.0f), this.f24148g, 1.0f, this.h, false);
        }
        if (this.f24148g == Layout.Alignment.ALIGN_CENTER) {
            this.f24146c = this.f24145b.getWidth();
            this.d = 0.0f;
        } else {
            this.f24146c = 0.0f;
            this.d = this.f24145b.getWidth();
            for (int i10 = 0; i10 < this.f24145b.getLineCount(); i10++) {
                this.f24146c = Math.max(this.f24146c, this.f24145b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f24145b.getLineLeft(i10));
            }
        }
        View view = this.f24150j;
        if (view != null && view.isAttachedToWindow()) {
            this.f24151k = x5.update(this.f24152l, this.f24150j, this.f24151k, this.f24145b);
        }
    }

    public final void s(View view) {
        this.f24149i = true;
        this.f24150j = view;
        if (view.isAttachedToWindow()) {
            this.f24151k = x5.update(this.f24152l, view, this.f24151k, this.f24145b);
        }
        view.addOnAttachStateChangeListener(new ja(1, this, view));
    }

    public g01(String str, float f7) {
        this(str, f7, null);
    }

    public g01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f24147f = 1;
        this.f24148g = Layout.Alignment.ALIGN_NORMAL;
        this.f24152l = 0;
        this.f24156p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24144a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
