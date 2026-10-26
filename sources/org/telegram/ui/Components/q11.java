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
    public final TextPaint f31788a;
    public StaticLayout f31789b;
    public float f31790c;
    public float d;
    public float e;
    public int f31791f;
    public Layout.Alignment f31792g;
    public float h;
    public boolean f31793i;
    public View f31794j;
    public y5 f31795k;
    public int f31796l;
    public PorterDuffColorFilter f31797m;
    public int f31798n;
    public boolean f31799o;
    public float f31800p;
    public LinearGradient f31801q;
    public Matrix f31802r;
    public Paint f31803s;
    public int f31804t;

    public q11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f31791f = 1;
        this.f31792g = Layout.Alignment.ALIGN_NORMAL;
        this.f31796l = 0;
        this.f31800p = -1.0f;
        this.f31788a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f31792g != alignment) {
            this.f31792g = alignment;
            r(this.f31789b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f31789b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f31789b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f31789b == null) {
            return;
        }
        TextPaint textPaint = this.f31788a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f31791f > 1) {
            height = 0.0f;
        } else {
            height = this.f31789b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f31789b;
        if (staticLayout != null) {
            float f7 = this.f31800p;
            if (f7 >= 0.0f && this.f31790c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f31804t, f7 - 1.0f, staticLayout.getHeight() + this.f31804t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f31799o;
            TextPaint textPaint = this.f31788a;
            if (z10) {
                canvas.drawText(this.f31789b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f31789b.draw(canvas);
            }
            if (this.f31793i) {
                if (this.f31797m == null || textPaint.getColor() != this.f31798n) {
                    int color = textPaint.getColor();
                    this.f31798n = color;
                    this.f31797m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                c6.drawAnimatedEmojis(canvas, this.f31789b, this.f31795k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f31797m);
            }
            canvas.restore();
            float f10 = this.f31800p;
            if (f10 >= 0.0f && this.f31790c > f10) {
                if (this.f31801q == null) {
                    this.f31801q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f31802r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f31803s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f31803s.setShader(this.f31801q);
                }
                canvas.save();
                this.f31802r.reset();
                this.f31802r.postTranslate(this.f31800p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f31801q.setLocalMatrix(this.f31802r);
                canvas.drawRect(this.f31800p - AndroidUtilities.dp(8.0f), 0.0f, this.f31800p, this.f31789b.getHeight(), this.f31803s);
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
        if (this.f31789b == null) {
            return;
        }
        canvas.save();
        if (this.f31791f > 1) {
            height = 0.0f;
        } else {
            height = this.f31789b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f31788a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f31800p = f7;
    }

    public final float h() {
        return this.f31790c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f31788a.getFontMetricsInt();
    }

    public final float j() {
        return this.f31789b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f31789b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f31789b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f31800p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f31790c);
        }
        return this.f31790c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f31789b.getText());
        }
    }

    public final void n(int i10) {
        this.f31791f = i10;
        r(this.f31789b.getText());
    }

    public final void o(int i10) {
        this.f31788a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f31796l != i10) {
            this.f31796l = i10;
            if (this.f31793i) {
                c6.release(this.f31794j, this.f31795k);
                this.f31795k = c6.update(this.f31796l, this.f31794j, this.f31795k, this.f31789b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f31789b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f31791f > 1) {
            this.f31789b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f31788a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f31792g).setMaxLines(this.f31791f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f31789b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f31788a, (int) Math.max(this.e, 1.0f), this.f31792g, 1.0f, this.h, false);
        }
        if (this.f31792g == Layout.Alignment.ALIGN_CENTER) {
            this.f31790c = this.f31789b.getWidth();
            this.d = 0.0f;
        } else {
            this.f31790c = 0.0f;
            this.d = this.f31789b.getWidth();
            for (int i10 = 0; i10 < this.f31789b.getLineCount(); i10++) {
                this.f31790c = Math.max(this.f31790c, this.f31789b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f31789b.getLineLeft(i10));
            }
        }
        View view = this.f31794j;
        if (view != null && view.isAttachedToWindow()) {
            this.f31795k = c6.update(this.f31796l, this.f31794j, this.f31795k, this.f31789b);
        }
    }

    public final void s(View view) {
        this.f31793i = true;
        this.f31794j = view;
        if (view.isAttachedToWindow()) {
            this.f31795k = c6.update(this.f31796l, view, this.f31795k, this.f31789b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public q11(String str, float f7) {
        this(str, f7, null);
    }

    public q11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f31791f = 1;
        this.f31792g = Layout.Alignment.ALIGN_NORMAL;
        this.f31796l = 0;
        this.f31800p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31788a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
