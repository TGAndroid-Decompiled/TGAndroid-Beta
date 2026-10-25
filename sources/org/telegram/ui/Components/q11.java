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
public final class q11 {
    public final TextPaint f31786a;
    public StaticLayout f31787b;
    public float f31788c;
    public float d;
    public float e;
    public int f31789f;
    public Layout.Alignment f31790g;
    public float h;
    public boolean f31791i;
    public View f31792j;
    public y5 f31793k;
    public int f31794l;
    public PorterDuffColorFilter f31795m;
    public int f31796n;
    public boolean f31797o;
    public float f31798p;
    public LinearGradient f31799q;
    public Matrix f31800r;
    public Paint f31801s;
    public int f31802t;

    public q11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f31789f = 1;
        this.f31790g = Layout.Alignment.ALIGN_NORMAL;
        this.f31794l = 0;
        this.f31798p = -1.0f;
        this.f31786a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f31790g != alignment) {
            this.f31790g = alignment;
            r(this.f31787b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f31787b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f31787b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f31787b == null) {
            return;
        }
        TextPaint textPaint = this.f31786a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f31789f > 1) {
            height = 0.0f;
        } else {
            height = this.f31787b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f31787b;
        if (staticLayout != null) {
            float f7 = this.f31798p;
            if (f7 >= 0.0f && this.f31788c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f31802t, f7 - 1.0f, staticLayout.getHeight() + this.f31802t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f31797o;
            TextPaint textPaint = this.f31786a;
            if (z10) {
                canvas.drawText(this.f31787b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f31787b.draw(canvas);
            }
            if (this.f31791i) {
                if (this.f31795m == null || textPaint.getColor() != this.f31796n) {
                    int color = textPaint.getColor();
                    this.f31796n = color;
                    this.f31795m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                c6.drawAnimatedEmojis(canvas, this.f31787b, this.f31793k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f31795m);
            }
            canvas.restore();
            float f10 = this.f31798p;
            if (f10 >= 0.0f && this.f31788c > f10) {
                if (this.f31799q == null) {
                    this.f31799q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f31800r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f31801s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f31801s.setShader(this.f31799q);
                }
                canvas.save();
                this.f31800r.reset();
                this.f31800r.postTranslate(this.f31798p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f31799q.setLocalMatrix(this.f31800r);
                canvas.drawRect(this.f31798p - AndroidUtilities.dp(8.0f), 0.0f, this.f31798p, this.f31787b.getHeight(), this.f31801s);
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
        if (this.f31787b == null) {
            return;
        }
        canvas.save();
        if (this.f31789f > 1) {
            height = 0.0f;
        } else {
            height = this.f31787b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f31786a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f31798p = f7;
    }

    public final float h() {
        return this.f31788c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f31786a.getFontMetricsInt();
    }

    public final float j() {
        return this.f31787b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f31787b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f31787b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f31798p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f31788c);
        }
        return this.f31788c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f31787b.getText());
        }
    }

    public final void n(int i10) {
        this.f31789f = i10;
        r(this.f31787b.getText());
    }

    public final void o(int i10) {
        this.f31786a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f31794l != i10) {
            this.f31794l = i10;
            if (this.f31791i) {
                c6.release(this.f31792j, this.f31793k);
                this.f31793k = c6.update(this.f31794l, this.f31792j, this.f31793k, this.f31787b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f31787b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f31789f > 1) {
            this.f31787b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f31786a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f31790g).setMaxLines(this.f31789f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f31787b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f31786a, (int) Math.max(this.e, 1.0f), this.f31790g, 1.0f, this.h, false);
        }
        if (this.f31790g == Layout.Alignment.ALIGN_CENTER) {
            this.f31788c = this.f31787b.getWidth();
            this.d = 0.0f;
        } else {
            this.f31788c = 0.0f;
            this.d = this.f31787b.getWidth();
            for (int i10 = 0; i10 < this.f31787b.getLineCount(); i10++) {
                this.f31788c = Math.max(this.f31788c, this.f31787b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f31787b.getLineLeft(i10));
            }
        }
        View view = this.f31792j;
        if (view != null && view.isAttachedToWindow()) {
            this.f31793k = c6.update(this.f31794l, this.f31792j, this.f31793k, this.f31787b);
        }
    }

    public final void s(View view) {
        this.f31791i = true;
        this.f31792j = view;
        if (view.isAttachedToWindow()) {
            this.f31793k = c6.update(this.f31794l, view, this.f31793k, this.f31787b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public q11(String str, float f7) {
        this(str, f7, null);
    }

    public q11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f31789f = 1;
        this.f31790g = Layout.Alignment.ALIGN_NORMAL;
        this.f31794l = 0;
        this.f31798p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31786a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
