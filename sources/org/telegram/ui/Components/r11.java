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
public final class r11 {
    public final TextPaint f32088a;
    public StaticLayout f32089b;
    public float f32090c;
    public float d;
    public float e;
    public int f32091f;
    public Layout.Alignment f32092g;
    public float h;
    public boolean f32093i;
    public View f32094j;
    public y5 f32095k;
    public int f32096l;
    public PorterDuffColorFilter f32097m;
    public int f32098n;
    public boolean f32099o;
    public float f32100p;
    public LinearGradient f32101q;
    public Matrix f32102r;
    public Paint f32103s;
    public int f32104t;

    public r11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f32091f = 1;
        this.f32092g = Layout.Alignment.ALIGN_NORMAL;
        this.f32096l = 0;
        this.f32100p = -1.0f;
        this.f32088a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f32092g != alignment) {
            this.f32092g = alignment;
            r(this.f32089b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f32089b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f32089b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f32089b == null) {
            return;
        }
        TextPaint textPaint = this.f32088a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f32091f > 1) {
            height = 0.0f;
        } else {
            height = this.f32089b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f32089b;
        if (staticLayout != null) {
            float f7 = this.f32100p;
            if (f7 >= 0.0f && this.f32090c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f32104t, f7 - 1.0f, staticLayout.getHeight() + this.f32104t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f32099o;
            TextPaint textPaint = this.f32088a;
            if (z10) {
                canvas.drawText(this.f32089b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f32089b.draw(canvas);
            }
            if (this.f32093i) {
                if (this.f32097m == null || textPaint.getColor() != this.f32098n) {
                    int color = textPaint.getColor();
                    this.f32098n = color;
                    this.f32097m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                c6.drawAnimatedEmojis(canvas, this.f32089b, this.f32095k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f32097m);
            }
            canvas.restore();
            float f10 = this.f32100p;
            if (f10 >= 0.0f && this.f32090c > f10) {
                if (this.f32101q == null) {
                    this.f32101q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f32102r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f32103s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f32103s.setShader(this.f32101q);
                }
                canvas.save();
                this.f32102r.reset();
                this.f32102r.postTranslate(this.f32100p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f32101q.setLocalMatrix(this.f32102r);
                canvas.drawRect(this.f32100p - AndroidUtilities.dp(8.0f), 0.0f, this.f32100p, this.f32089b.getHeight(), this.f32103s);
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
        if (this.f32089b == null) {
            return;
        }
        canvas.save();
        if (this.f32091f > 1) {
            height = 0.0f;
        } else {
            height = this.f32089b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f32088a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f32100p = f7;
    }

    public final float h() {
        return this.f32090c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f32088a.getFontMetricsInt();
    }

    public final float j() {
        return this.f32089b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f32089b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f32089b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f32100p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f32090c);
        }
        return this.f32090c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f32089b.getText());
        }
    }

    public final void n(int i10) {
        this.f32091f = i10;
        r(this.f32089b.getText());
    }

    public final void o(int i10) {
        this.f32088a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f32096l != i10) {
            this.f32096l = i10;
            if (this.f32093i) {
                c6.release(this.f32094j, this.f32095k);
                this.f32095k = c6.update(this.f32096l, this.f32094j, this.f32095k, this.f32089b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f32089b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f32091f > 1) {
            this.f32089b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f32088a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f32092g).setMaxLines(this.f32091f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f32089b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f32088a, (int) Math.max(this.e, 1.0f), this.f32092g, 1.0f, this.h, false);
        }
        if (this.f32092g == Layout.Alignment.ALIGN_CENTER) {
            this.f32090c = this.f32089b.getWidth();
            this.d = 0.0f;
        } else {
            this.f32090c = 0.0f;
            this.d = this.f32089b.getWidth();
            for (int i10 = 0; i10 < this.f32089b.getLineCount(); i10++) {
                this.f32090c = Math.max(this.f32090c, this.f32089b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f32089b.getLineLeft(i10));
            }
        }
        View view = this.f32094j;
        if (view != null && view.isAttachedToWindow()) {
            this.f32095k = c6.update(this.f32096l, this.f32094j, this.f32095k, this.f32089b);
        }
    }

    public final void s(View view) {
        this.f32093i = true;
        this.f32094j = view;
        if (view.isAttachedToWindow()) {
            this.f32095k = c6.update(this.f32096l, view, this.f32095k, this.f32089b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public r11(String str, float f7) {
        this(str, f7, null);
    }

    public r11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f32091f = 1;
        this.f32092g = Layout.Alignment.ALIGN_NORMAL;
        this.f32096l = 0;
        this.f32100p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f32088a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
