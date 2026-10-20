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
public final class f11 {
    public final TextPaint f26019a;
    public StaticLayout f26020b;
    public float f26021c;
    public float d;
    public float e;
    public int f26022f;
    public Layout.Alignment f26023g;
    public float h;
    public boolean f26024i;
    public View f26025j;
    public w5 f26026k;
    public int f26027l;
    public PorterDuffColorFilter f26028m;
    public int f26029n;
    public boolean f26030o;
    public float f26031p;
    public LinearGradient f26032q;
    public Matrix f26033r;
    public Paint f26034s;
    public int f26035t;

    public f11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26022f = 1;
        this.f26023g = Layout.Alignment.ALIGN_NORMAL;
        this.f26027l = 0;
        this.f26031p = -1.0f;
        this.f26019a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26023g != alignment) {
            this.f26023g = alignment;
            r(this.f26020b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f26020b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f26020b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f26020b == null) {
            return;
        }
        TextPaint textPaint = this.f26019a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f26022f > 1) {
            height = 0.0f;
        } else {
            height = this.f26020b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26020b;
        if (staticLayout != null) {
            float f7 = this.f26031p;
            if (f7 >= 0.0f && this.f26021c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f26035t, f7 - 1.0f, staticLayout.getHeight() + this.f26035t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f26030o;
            TextPaint textPaint = this.f26019a;
            if (z10) {
                canvas.drawText(this.f26020b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26020b.draw(canvas);
            }
            if (this.f26024i) {
                if (this.f26028m == null || textPaint.getColor() != this.f26029n) {
                    int color = textPaint.getColor();
                    this.f26029n = color;
                    this.f26028m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f26020b, this.f26026k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26028m);
            }
            canvas.restore();
            float f10 = this.f26031p;
            if (f10 >= 0.0f && this.f26021c > f10) {
                if (this.f26032q == null) {
                    this.f26032q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26033r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26034s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26034s.setShader(this.f26032q);
                }
                canvas.save();
                this.f26033r.reset();
                this.f26033r.postTranslate(this.f26031p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26032q.setLocalMatrix(this.f26033r);
                canvas.drawRect(this.f26031p - AndroidUtilities.dp(8.0f), 0.0f, this.f26031p, this.f26020b.getHeight(), this.f26034s);
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
        if (this.f26020b == null) {
            return;
        }
        canvas.save();
        if (this.f26022f > 1) {
            height = 0.0f;
        } else {
            height = this.f26020b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f26019a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f26031p = f7;
    }

    public final float h() {
        return this.f26021c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26019a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26020b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26020b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26020b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f26031p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f26021c);
        }
        return this.f26021c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f26020b.getText());
        }
    }

    public final void n(int i10) {
        this.f26022f = i10;
        r(this.f26020b.getText());
    }

    public final void o(int i10) {
        this.f26019a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26027l != i10) {
            this.f26027l = i10;
            if (this.f26024i) {
                a6.release(this.f26025j, this.f26026k);
                this.f26026k = a6.update(this.f26027l, this.f26025j, this.f26026k, this.f26020b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f26020b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26022f > 1) {
            this.f26020b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26019a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26023g).setMaxLines(this.f26022f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26020b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26019a, (int) Math.max(this.e, 1.0f), this.f26023g, 1.0f, this.h, false);
        }
        if (this.f26023g == Layout.Alignment.ALIGN_CENTER) {
            this.f26021c = this.f26020b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26021c = 0.0f;
            this.d = this.f26020b.getWidth();
            for (int i10 = 0; i10 < this.f26020b.getLineCount(); i10++) {
                this.f26021c = Math.max(this.f26021c, this.f26020b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26020b.getLineLeft(i10));
            }
        }
        View view = this.f26025j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26026k = a6.update(this.f26027l, this.f26025j, this.f26026k, this.f26020b);
        }
    }

    public final void s(View view) {
        this.f26024i = true;
        this.f26025j = view;
        if (view.isAttachedToWindow()) {
            this.f26026k = a6.update(this.f26027l, view, this.f26026k, this.f26020b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f11(String str, float f7) {
        this(str, f7, null);
    }

    public f11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f26022f = 1;
        this.f26023g = Layout.Alignment.ALIGN_NORMAL;
        this.f26027l = 0;
        this.f26031p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26019a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
