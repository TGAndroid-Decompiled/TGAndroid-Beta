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
    public final TextPaint f28355a;
    public StaticLayout f28356b;
    public float f28357c;
    public float d;
    public float e;
    public int f28358f;
    public Layout.Alignment f28359g;
    public float h;
    public boolean f28360i;
    public View f28361j;
    public v5 f28362k;
    public int f28363l;
    public PorterDuffColorFilter f28364m;
    public int f28365n;
    public boolean f28366o;
    public float f28367p;
    public LinearGradient f28368q;
    public Matrix f28369r;
    public Paint f28370s;
    public int f28371t;

    public t01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28358f = 1;
        this.f28359g = Layout.Alignment.ALIGN_NORMAL;
        this.f28363l = 0;
        this.f28367p = -1.0f;
        this.f28355a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28359g != alignment) {
            this.f28359g = alignment;
            r(this.f28356b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28356b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28356b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28356b == null) {
            return;
        }
        TextPaint textPaint = this.f28355a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28358f > 1) {
            height = 0.0f;
        } else {
            height = this.f28356b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28356b;
        if (staticLayout != null) {
            float f7 = this.f28367p;
            if (f7 >= 0.0f && this.f28357c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28371t, f7 - 1.0f, staticLayout.getHeight() + this.f28371t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28366o;
            TextPaint textPaint = this.f28355a;
            if (z10) {
                canvas.drawText(this.f28356b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28356b.draw(canvas);
            }
            if (this.f28360i) {
                if (this.f28364m == null || textPaint.getColor() != this.f28365n) {
                    int color = textPaint.getColor();
                    this.f28365n = color;
                    this.f28364m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28356b, this.f28362k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28364m);
            }
            canvas.restore();
            float f10 = this.f28367p;
            if (f10 >= 0.0f && this.f28357c > f10) {
                if (this.f28368q == null) {
                    this.f28368q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28369r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28370s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28370s.setShader(this.f28368q);
                }
                canvas.save();
                this.f28369r.reset();
                this.f28369r.postTranslate(this.f28367p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28368q.setLocalMatrix(this.f28369r);
                canvas.drawRect(this.f28367p - AndroidUtilities.dp(8.0f), 0.0f, this.f28367p, this.f28356b.getHeight(), this.f28370s);
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
        if (this.f28356b == null) {
            return;
        }
        canvas.save();
        if (this.f28358f > 1) {
            height = 0.0f;
        } else {
            height = this.f28356b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28355a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28367p = f7;
    }

    public final float h() {
        return this.f28357c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28355a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28356b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28356b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28356b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28367p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28357c);
        }
        return this.f28357c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28356b.getText());
        }
    }

    public final void n(int i10) {
        this.f28358f = i10;
        r(this.f28356b.getText());
    }

    public final void o(int i10) {
        this.f28355a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28363l != i10) {
            this.f28363l = i10;
            if (this.f28360i) {
                z5.release(this.f28361j, this.f28362k);
                this.f28362k = z5.update(this.f28363l, this.f28361j, this.f28362k, this.f28356b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28356b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28358f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28356b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28355a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28359g).setMaxLines(this.f28358f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28356b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28355a, (int) Math.max(this.e, 1.0f), this.f28359g, 1.0f, this.h, false);
        }
        if (this.f28359g == Layout.Alignment.ALIGN_CENTER) {
            this.f28357c = this.f28356b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28357c = 0.0f;
            this.d = this.f28356b.getWidth();
            for (int i10 = 0; i10 < this.f28356b.getLineCount(); i10++) {
                this.f28357c = Math.max(this.f28357c, this.f28356b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28356b.getLineLeft(i10));
            }
        }
        View view = this.f28361j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28362k = z5.update(this.f28363l, this.f28361j, this.f28362k, this.f28356b);
        }
    }

    public final void s(View view) {
        this.f28360i = true;
        this.f28361j = view;
        if (view.isAttachedToWindow()) {
            this.f28362k = z5.update(this.f28363l, view, this.f28362k, this.f28356b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public t01(String str, float f7) {
        this(str, f7, null);
    }

    public t01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28358f = 1;
        this.f28359g = Layout.Alignment.ALIGN_NORMAL;
        this.f28363l = 0;
        this.f28367p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28355a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
