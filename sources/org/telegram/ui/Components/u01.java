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
public final class u01 {
    public final TextPaint f28491a;
    public StaticLayout f28492b;
    public float f28493c;
    public float d;
    public float e;
    public int f28494f;
    public Layout.Alignment f28495g;
    public float h;
    public boolean f28496i;
    public View f28497j;
    public u5 f28498k;
    public int f28499l;
    public PorterDuffColorFilter f28500m;
    public int f28501n;
    public boolean f28502o;
    public float f28503p;
    public LinearGradient f28504q;
    public Matrix f28505r;
    public Paint f28506s;
    public int f28507t;

    public u01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28494f = 1;
        this.f28495g = Layout.Alignment.ALIGN_NORMAL;
        this.f28499l = 0;
        this.f28503p = -1.0f;
        this.f28491a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28495g != alignment) {
            this.f28495g = alignment;
            r(this.f28492b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28492b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28492b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28492b == null) {
            return;
        }
        TextPaint textPaint = this.f28491a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28494f > 1) {
            height = 0.0f;
        } else {
            height = this.f28492b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28492b;
        if (staticLayout != null) {
            float f7 = this.f28503p;
            if (f7 >= 0.0f && this.f28493c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28507t, f7 - 1.0f, staticLayout.getHeight() + this.f28507t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28502o;
            TextPaint textPaint = this.f28491a;
            if (z10) {
                canvas.drawText(this.f28492b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28492b.draw(canvas);
            }
            if (this.f28496i) {
                if (this.f28500m == null || textPaint.getColor() != this.f28501n) {
                    int color = textPaint.getColor();
                    this.f28501n = color;
                    this.f28500m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f28492b, this.f28498k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28500m);
            }
            canvas.restore();
            float f10 = this.f28503p;
            if (f10 >= 0.0f && this.f28493c > f10) {
                if (this.f28504q == null) {
                    this.f28504q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28505r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28506s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28506s.setShader(this.f28504q);
                }
                canvas.save();
                this.f28505r.reset();
                this.f28505r.postTranslate(this.f28503p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28504q.setLocalMatrix(this.f28505r);
                canvas.drawRect(this.f28503p - AndroidUtilities.dp(8.0f), 0.0f, this.f28503p, this.f28492b.getHeight(), this.f28506s);
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
        if (this.f28492b == null) {
            return;
        }
        canvas.save();
        if (this.f28494f > 1) {
            height = 0.0f;
        } else {
            height = this.f28492b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28491a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28503p = f7;
    }

    public final float h() {
        return this.f28493c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28491a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28492b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28492b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28492b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28503p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28493c);
        }
        return this.f28493c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28492b.getText());
        }
    }

    public final void n(int i10) {
        this.f28494f = i10;
        r(this.f28492b.getText());
    }

    public final void o(int i10) {
        this.f28491a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28499l != i10) {
            this.f28499l = i10;
            if (this.f28496i) {
                y5.release(this.f28497j, this.f28498k);
                this.f28498k = y5.update(this.f28499l, this.f28497j, this.f28498k, this.f28492b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28492b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28494f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28492b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28491a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28495g).setMaxLines(this.f28494f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28492b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28491a, (int) Math.max(this.e, 1.0f), this.f28495g, 1.0f, this.h, false);
        }
        if (this.f28495g == Layout.Alignment.ALIGN_CENTER) {
            this.f28493c = this.f28492b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28493c = 0.0f;
            this.d = this.f28492b.getWidth();
            for (int i10 = 0; i10 < this.f28492b.getLineCount(); i10++) {
                this.f28493c = Math.max(this.f28493c, this.f28492b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28492b.getLineLeft(i10));
            }
        }
        View view = this.f28497j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28498k = y5.update(this.f28499l, this.f28497j, this.f28498k, this.f28492b);
        }
    }

    public final void s(View view) {
        this.f28496i = true;
        this.f28497j = view;
        if (view.isAttachedToWindow()) {
            this.f28498k = y5.update(this.f28499l, view, this.f28498k, this.f28492b);
        }
        view.addOnAttachStateChangeListener(new ka(1, this, view));
    }

    public u01(String str, float f7) {
        this(str, f7, null);
    }

    public u01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28494f = 1;
        this.f28495g = Layout.Alignment.ALIGN_NORMAL;
        this.f28499l = 0;
        this.f28503p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28491a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
