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
    public final TextPaint f25877a;
    public StaticLayout f25878b;
    public float f25879c;
    public float d;
    public float f25880e;
    public int f25881f;
    public Layout.Alignment f25882g;
    public float h;
    public boolean f25883i;
    public View f25884j;
    public v5 f25885k;
    public int f25886l;
    public PorterDuffColorFilter f25887m;
    public int f25888n;
    public boolean f25889o;
    public float f25890p;
    public LinearGradient f25891q;
    public Matrix f25892r;
    public Paint f25893s;
    public int f25894t;

    public e11(CharSequence charSequence, TextPaint textPaint) {
        this.f25880e = 9999.0f;
        this.f25881f = 1;
        this.f25882g = Layout.Alignment.ALIGN_NORMAL;
        this.f25886l = 0;
        this.f25890p = -1.0f;
        this.f25877a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25882g != alignment) {
            this.f25882g = alignment;
            r(this.f25878b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25878b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25878b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25878b == null) {
            return;
        }
        TextPaint textPaint = this.f25877a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25881f > 1) {
            height = 0.0f;
        } else {
            height = this.f25878b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25878b;
        if (staticLayout != null) {
            float f7 = this.f25890p;
            if (f7 >= 0.0f && this.f25879c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25894t, f7 - 1.0f, staticLayout.getHeight() + this.f25894t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25889o;
            TextPaint textPaint = this.f25877a;
            if (z10) {
                canvas.drawText(this.f25878b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25878b.draw(canvas);
            }
            if (this.f25883i) {
                if (this.f25887m == null || textPaint.getColor() != this.f25888n) {
                    int color = textPaint.getColor();
                    this.f25888n = color;
                    this.f25887m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25878b, this.f25885k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25887m);
            }
            canvas.restore();
            float f10 = this.f25890p;
            if (f10 >= 0.0f && this.f25879c > f10) {
                if (this.f25891q == null) {
                    this.f25891q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25892r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25893s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25893s.setShader(this.f25891q);
                }
                canvas.save();
                this.f25892r.reset();
                this.f25892r.postTranslate(this.f25890p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25891q.setLocalMatrix(this.f25892r);
                canvas.drawRect(this.f25890p - AndroidUtilities.dp(8.0f), 0.0f, this.f25890p, this.f25878b.getHeight(), this.f25893s);
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
        if (this.f25878b == null) {
            return;
        }
        canvas.save();
        if (this.f25881f > 1) {
            height = 0.0f;
        } else {
            height = this.f25878b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25877a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25890p = f7;
    }

    public final float h() {
        return this.f25879c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25877a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25878b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25878b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25878b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25890p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25879c);
        }
        return this.f25879c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25878b.getText());
        }
    }

    public final void n(int i10) {
        this.f25881f = i10;
        r(this.f25878b.getText());
    }

    public final void o(int i10) {
        this.f25877a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25886l != i10) {
            this.f25886l = i10;
            if (this.f25883i) {
                z5.release(this.f25884j, this.f25885k);
                this.f25885k = z5.update(this.f25886l, this.f25884j, this.f25885k, this.f25878b);
            }
        }
    }

    public final void q(float f7) {
        this.f25880e = f7;
        r(this.f25878b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25881f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25878b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25877a, (int) Math.max(this.f25880e, 1.0f)).setAlignment(this.f25882g).setMaxLines(this.f25881f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25878b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25877a, (int) Math.max(this.f25880e, 1.0f), this.f25882g, 1.0f, this.h, false);
        }
        if (this.f25882g == Layout.Alignment.ALIGN_CENTER) {
            this.f25879c = this.f25878b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25879c = 0.0f;
            this.d = this.f25878b.getWidth();
            for (int i10 = 0; i10 < this.f25878b.getLineCount(); i10++) {
                this.f25879c = Math.max(this.f25879c, this.f25878b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25878b.getLineLeft(i10));
            }
        }
        View view = this.f25884j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25885k = z5.update(this.f25886l, this.f25884j, this.f25885k, this.f25878b);
        }
    }

    public final void s(View view) {
        this.f25883i = true;
        this.f25884j = view;
        if (view.isAttachedToWindow()) {
            this.f25885k = z5.update(this.f25886l, view, this.f25885k, this.f25878b);
        }
        view.addOnAttachStateChangeListener(new ma(1, this, view));
    }

    public e11(String str, float f7) {
        this(str, f7, null);
    }

    public e11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25880e = 9999.0f;
        this.f25881f = 1;
        this.f25882g = Layout.Alignment.ALIGN_NORMAL;
        this.f25886l = 0;
        this.f25890p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25877a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
