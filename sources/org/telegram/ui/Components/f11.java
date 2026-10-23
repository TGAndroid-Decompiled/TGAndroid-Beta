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
    public final TextPaint f26023a;
    public StaticLayout f26024b;
    public float f26025c;
    public float d;
    public float e;
    public int f26026f;
    public Layout.Alignment f26027g;
    public float h;
    public boolean f26028i;
    public View f26029j;
    public w5 f26030k;
    public int f26031l;
    public PorterDuffColorFilter f26032m;
    public int f26033n;
    public boolean f26034o;
    public float f26035p;
    public LinearGradient f26036q;
    public Matrix f26037r;
    public Paint f26038s;
    public int f26039t;

    public f11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26026f = 1;
        this.f26027g = Layout.Alignment.ALIGN_NORMAL;
        this.f26031l = 0;
        this.f26035p = -1.0f;
        this.f26023a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26027g != alignment) {
            this.f26027g = alignment;
            r(this.f26024b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f26024b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f26024b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f26024b == null) {
            return;
        }
        TextPaint textPaint = this.f26023a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f26026f > 1) {
            height = 0.0f;
        } else {
            height = this.f26024b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26024b;
        if (staticLayout != null) {
            float f7 = this.f26035p;
            if (f7 >= 0.0f && this.f26025c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f26039t, f7 - 1.0f, staticLayout.getHeight() + this.f26039t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f26034o;
            TextPaint textPaint = this.f26023a;
            if (z10) {
                canvas.drawText(this.f26024b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26024b.draw(canvas);
            }
            if (this.f26028i) {
                if (this.f26032m == null || textPaint.getColor() != this.f26033n) {
                    int color = textPaint.getColor();
                    this.f26033n = color;
                    this.f26032m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f26024b, this.f26030k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26032m);
            }
            canvas.restore();
            float f10 = this.f26035p;
            if (f10 >= 0.0f && this.f26025c > f10) {
                if (this.f26036q == null) {
                    this.f26036q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26037r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26038s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26038s.setShader(this.f26036q);
                }
                canvas.save();
                this.f26037r.reset();
                this.f26037r.postTranslate(this.f26035p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26036q.setLocalMatrix(this.f26037r);
                canvas.drawRect(this.f26035p - AndroidUtilities.dp(8.0f), 0.0f, this.f26035p, this.f26024b.getHeight(), this.f26038s);
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
        if (this.f26024b == null) {
            return;
        }
        canvas.save();
        if (this.f26026f > 1) {
            height = 0.0f;
        } else {
            height = this.f26024b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f26023a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f26035p = f7;
    }

    public final float h() {
        return this.f26025c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26023a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26024b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26024b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26024b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f26035p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f26025c);
        }
        return this.f26025c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f26024b.getText());
        }
    }

    public final void n(int i10) {
        this.f26026f = i10;
        r(this.f26024b.getText());
    }

    public final void o(int i10) {
        this.f26023a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26031l != i10) {
            this.f26031l = i10;
            if (this.f26028i) {
                a6.release(this.f26029j, this.f26030k);
                this.f26030k = a6.update(this.f26031l, this.f26029j, this.f26030k, this.f26024b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f26024b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26026f > 1) {
            this.f26024b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26023a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26027g).setMaxLines(this.f26026f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26024b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26023a, (int) Math.max(this.e, 1.0f), this.f26027g, 1.0f, this.h, false);
        }
        if (this.f26027g == Layout.Alignment.ALIGN_CENTER) {
            this.f26025c = this.f26024b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26025c = 0.0f;
            this.d = this.f26024b.getWidth();
            for (int i10 = 0; i10 < this.f26024b.getLineCount(); i10++) {
                this.f26025c = Math.max(this.f26025c, this.f26024b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26024b.getLineLeft(i10));
            }
        }
        View view = this.f26029j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26030k = a6.update(this.f26031l, this.f26029j, this.f26030k, this.f26024b);
        }
    }

    public final void s(View view) {
        this.f26028i = true;
        this.f26029j = view;
        if (view.isAttachedToWindow()) {
            this.f26030k = a6.update(this.f26031l, view, this.f26030k, this.f26024b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f11(String str, float f7) {
        this(str, f7, null);
    }

    public f11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f26026f = 1;
        this.f26027g = Layout.Alignment.ALIGN_NORMAL;
        this.f26031l = 0;
        this.f26035p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26023a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
