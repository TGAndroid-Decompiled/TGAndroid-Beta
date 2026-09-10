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
public final class t01 {
    public final TextPaint f27245a;
    public StaticLayout f27246b;
    public float f27247c;
    public float d;
    public float e;
    public int f27248f;
    public Layout.Alignment f27249g;
    public float h;
    public boolean f27250i;
    public View f27251j;
    public u5 f27252k;
    public int f27253l;
    public PorterDuffColorFilter f27254m;
    public int f27255n;
    public boolean f27256o;
    public float f27257p;
    public LinearGradient f27258q;
    public Matrix f27259r;
    public Paint f27260s;
    public int f27261t;

    public t01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f27248f = 1;
        this.f27249g = Layout.Alignment.ALIGN_NORMAL;
        this.f27253l = 0;
        this.f27257p = -1.0f;
        this.f27245a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f27249g != alignment) {
            this.f27249g = alignment;
            r(this.f27246b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f27246b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f27246b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f27246b == null) {
            return;
        }
        TextPaint textPaint = this.f27245a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f27248f > 1) {
            height = 0.0f;
        } else {
            height = this.f27246b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f27246b;
        if (staticLayout != null) {
            float f7 = this.f27257p;
            if (f7 >= 0.0f && this.f27247c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f27261t, f7 - 1.0f, staticLayout.getHeight() + this.f27261t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f27256o;
            TextPaint textPaint = this.f27245a;
            if (z10) {
                canvas.drawText(this.f27246b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f27246b.draw(canvas);
            }
            if (this.f27250i) {
                if (this.f27254m == null || textPaint.getColor() != this.f27255n) {
                    int color = textPaint.getColor();
                    this.f27255n = color;
                    this.f27254m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f27246b, this.f27252k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f27254m);
            }
            canvas.restore();
            float f10 = this.f27257p;
            if (f10 >= 0.0f && this.f27247c > f10) {
                if (this.f27258q == null) {
                    this.f27258q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f27259r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f27260s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f27260s.setShader(this.f27258q);
                }
                canvas.save();
                this.f27259r.reset();
                this.f27259r.postTranslate(this.f27257p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f27258q.setLocalMatrix(this.f27259r);
                canvas.drawRect(this.f27257p - AndroidUtilities.dp(8.0f), 0.0f, this.f27257p, this.f27246b.getHeight(), this.f27260s);
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
        if (this.f27246b == null) {
            return;
        }
        canvas.save();
        if (this.f27248f > 1) {
            height = 0.0f;
        } else {
            height = this.f27246b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f27245a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f27257p = f7;
    }

    public final float h() {
        return this.f27247c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f27245a.getFontMetricsInt();
    }

    public final float j() {
        return this.f27246b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f27246b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f27246b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f27257p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f27247c);
        }
        return this.f27247c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f27246b.getText());
        }
    }

    public final void n(int i10) {
        this.f27248f = i10;
        r(this.f27246b.getText());
    }

    public final void o(int i10) {
        this.f27245a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f27253l != i10) {
            this.f27253l = i10;
            if (this.f27250i) {
                y5.release(this.f27251j, this.f27252k);
                this.f27252k = y5.update(this.f27253l, this.f27251j, this.f27252k, this.f27246b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f27246b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f27248f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f27246b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f27245a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f27249g).setMaxLines(this.f27248f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f27246b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f27245a, (int) Math.max(this.e, 1.0f), this.f27249g, 1.0f, this.h, false);
        }
        if (this.f27249g == Layout.Alignment.ALIGN_CENTER) {
            this.f27247c = this.f27246b.getWidth();
            this.d = 0.0f;
        } else {
            this.f27247c = 0.0f;
            this.d = this.f27246b.getWidth();
            for (int i10 = 0; i10 < this.f27246b.getLineCount(); i10++) {
                this.f27247c = Math.max(this.f27247c, this.f27246b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f27246b.getLineLeft(i10));
            }
        }
        View view = this.f27251j;
        if (view != null && view.isAttachedToWindow()) {
            this.f27252k = y5.update(this.f27253l, this.f27251j, this.f27252k, this.f27246b);
        }
    }

    public final void s(View view) {
        this.f27250i = true;
        this.f27251j = view;
        if (view.isAttachedToWindow()) {
            this.f27252k = y5.update(this.f27253l, view, this.f27252k, this.f27246b);
        }
        view.addOnAttachStateChangeListener(new ka(1, this, view));
    }

    public t01(String str, float f7) {
        this(str, f7, null);
    }

    public t01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f27248f = 1;
        this.f27249g = Layout.Alignment.ALIGN_NORMAL;
        this.f27253l = 0;
        this.f27257p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f27245a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
