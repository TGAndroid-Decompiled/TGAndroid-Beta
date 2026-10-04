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
public final class e11 {
    public final TextPaint f25876a;
    public StaticLayout f25877b;
    public float f25878c;
    public float d;
    public float f25879e;
    public int f25880f;
    public Layout.Alignment f25881g;
    public float h;
    public boolean f25882i;
    public View f25883j;
    public v5 f25884k;
    public int f25885l;
    public PorterDuffColorFilter f25886m;
    public int f25887n;
    public boolean f25888o;
    public float f25889p;
    public LinearGradient f25890q;
    public Matrix f25891r;
    public Paint f25892s;
    public int f25893t;

    public e11(CharSequence charSequence, TextPaint textPaint) {
        this.f25879e = 9999.0f;
        this.f25880f = 1;
        this.f25881g = Layout.Alignment.ALIGN_NORMAL;
        this.f25885l = 0;
        this.f25889p = -1.0f;
        this.f25876a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25881g != alignment) {
            this.f25881g = alignment;
            r(this.f25877b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25877b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25877b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25877b == null) {
            return;
        }
        TextPaint textPaint = this.f25876a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25880f > 1) {
            height = 0.0f;
        } else {
            height = this.f25877b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25877b;
        if (staticLayout != null) {
            float f7 = this.f25889p;
            if (f7 >= 0.0f && this.f25878c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25893t, f7 - 1.0f, staticLayout.getHeight() + this.f25893t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25888o;
            TextPaint textPaint = this.f25876a;
            if (z10) {
                canvas.drawText(this.f25877b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25877b.draw(canvas);
            }
            if (this.f25882i) {
                if (this.f25886m == null || textPaint.getColor() != this.f25887n) {
                    int color = textPaint.getColor();
                    this.f25887n = color;
                    this.f25886m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25877b, this.f25884k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25886m);
            }
            canvas.restore();
            float f10 = this.f25889p;
            if (f10 >= 0.0f && this.f25878c > f10) {
                if (this.f25890q == null) {
                    this.f25890q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25891r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25892s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25892s.setShader(this.f25890q);
                }
                canvas.save();
                this.f25891r.reset();
                this.f25891r.postTranslate(this.f25889p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25890q.setLocalMatrix(this.f25891r);
                canvas.drawRect(this.f25889p - AndroidUtilities.dp(8.0f), 0.0f, this.f25889p, this.f25877b.getHeight(), this.f25892s);
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
        if (this.f25877b == null) {
            return;
        }
        canvas.save();
        if (this.f25880f > 1) {
            height = 0.0f;
        } else {
            height = this.f25877b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25876a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25889p = f7;
    }

    public final float h() {
        return this.f25878c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25876a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25877b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25877b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25877b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25889p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25878c);
        }
        return this.f25878c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25877b.getText());
        }
    }

    public final void n(int i10) {
        this.f25880f = i10;
        r(this.f25877b.getText());
    }

    public final void o(int i10) {
        this.f25876a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25885l != i10) {
            this.f25885l = i10;
            if (this.f25882i) {
                z5.release(this.f25883j, this.f25884k);
                this.f25884k = z5.update(this.f25885l, this.f25883j, this.f25884k, this.f25877b);
            }
        }
    }

    public final void q(float f7) {
        this.f25879e = f7;
        r(this.f25877b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25880f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25877b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25876a, (int) Math.max(this.f25879e, 1.0f)).setAlignment(this.f25881g).setMaxLines(this.f25880f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25877b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25876a, (int) Math.max(this.f25879e, 1.0f), this.f25881g, 1.0f, this.h, false);
        }
        if (this.f25881g == Layout.Alignment.ALIGN_CENTER) {
            this.f25878c = this.f25877b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25878c = 0.0f;
            this.d = this.f25877b.getWidth();
            for (int i10 = 0; i10 < this.f25877b.getLineCount(); i10++) {
                this.f25878c = Math.max(this.f25878c, this.f25877b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25877b.getLineLeft(i10));
            }
        }
        View view = this.f25883j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25884k = z5.update(this.f25885l, this.f25883j, this.f25884k, this.f25877b);
        }
    }

    public final void s(View view) {
        this.f25882i = true;
        this.f25883j = view;
        if (view.isAttachedToWindow()) {
            this.f25884k = z5.update(this.f25885l, view, this.f25884k, this.f25877b);
        }
        view.addOnAttachStateChangeListener(new ma(1, this, view));
    }

    public e11(String str, float f7) {
        this(str, f7, null);
    }

    public e11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25879e = 9999.0f;
        this.f25880f = 1;
        this.f25881g = Layout.Alignment.ALIGN_NORMAL;
        this.f25885l = 0;
        this.f25889p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25876a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
