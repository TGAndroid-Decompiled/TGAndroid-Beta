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
public final class v01 {
    public final TextPaint f28866a;
    public StaticLayout f28867b;
    public float f28868c;
    public float d;
    public float e;
    public int f28869f;
    public Layout.Alignment f28870g;
    public float h;
    public boolean f28871i;
    public View f28872j;
    public v5 f28873k;
    public int f28874l;
    public PorterDuffColorFilter f28875m;
    public int f28876n;
    public boolean f28877o;
    public float f28878p;
    public LinearGradient f28879q;
    public Matrix f28880r;
    public Paint f28881s;
    public int f28882t;

    public v01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28869f = 1;
        this.f28870g = Layout.Alignment.ALIGN_NORMAL;
        this.f28874l = 0;
        this.f28878p = -1.0f;
        this.f28866a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28870g != alignment) {
            this.f28870g = alignment;
            r(this.f28867b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28867b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28867b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28867b == null) {
            return;
        }
        TextPaint textPaint = this.f28866a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28869f > 1) {
            height = 0.0f;
        } else {
            height = this.f28867b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28867b;
        if (staticLayout != null) {
            float f7 = this.f28878p;
            if (f7 >= 0.0f && this.f28868c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28882t, f7 - 1.0f, staticLayout.getHeight() + this.f28882t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28877o;
            TextPaint textPaint = this.f28866a;
            if (z10) {
                canvas.drawText(this.f28867b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28867b.draw(canvas);
            }
            if (this.f28871i) {
                if (this.f28875m == null || textPaint.getColor() != this.f28876n) {
                    int color = textPaint.getColor();
                    this.f28876n = color;
                    this.f28875m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28867b, this.f28873k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28875m);
            }
            canvas.restore();
            float f10 = this.f28878p;
            if (f10 >= 0.0f && this.f28868c > f10) {
                if (this.f28879q == null) {
                    this.f28879q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28880r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28881s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28881s.setShader(this.f28879q);
                }
                canvas.save();
                this.f28880r.reset();
                this.f28880r.postTranslate(this.f28878p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28879q.setLocalMatrix(this.f28880r);
                canvas.drawRect(this.f28878p - AndroidUtilities.dp(8.0f), 0.0f, this.f28878p, this.f28867b.getHeight(), this.f28881s);
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
        if (this.f28867b == null) {
            return;
        }
        canvas.save();
        if (this.f28869f > 1) {
            height = 0.0f;
        } else {
            height = this.f28867b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28866a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28878p = f7;
    }

    public final float h() {
        return this.f28868c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28866a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28867b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28867b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28867b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28878p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28868c);
        }
        return this.f28868c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28867b.getText());
        }
    }

    public final void n(int i10) {
        this.f28869f = i10;
        r(this.f28867b.getText());
    }

    public final void o(int i10) {
        this.f28866a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28874l != i10) {
            this.f28874l = i10;
            if (this.f28871i) {
                z5.release(this.f28872j, this.f28873k);
                this.f28873k = z5.update(this.f28874l, this.f28872j, this.f28873k, this.f28867b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28867b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28869f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28867b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28866a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28870g).setMaxLines(this.f28869f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28867b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28866a, (int) Math.max(this.e, 1.0f), this.f28870g, 1.0f, this.h, false);
        }
        if (this.f28870g == Layout.Alignment.ALIGN_CENTER) {
            this.f28868c = this.f28867b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28868c = 0.0f;
            this.d = this.f28867b.getWidth();
            for (int i10 = 0; i10 < this.f28867b.getLineCount(); i10++) {
                this.f28868c = Math.max(this.f28868c, this.f28867b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28867b.getLineLeft(i10));
            }
        }
        View view = this.f28872j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28873k = z5.update(this.f28874l, this.f28872j, this.f28873k, this.f28867b);
        }
    }

    public final void s(View view) {
        this.f28871i = true;
        this.f28872j = view;
        if (view.isAttachedToWindow()) {
            this.f28873k = z5.update(this.f28874l, view, this.f28873k, this.f28867b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public v01(String str, float f7) {
        this(str, f7, null);
    }

    public v01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28869f = 1;
        this.f28870g = Layout.Alignment.ALIGN_NORMAL;
        this.f28874l = 0;
        this.f28878p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28866a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
