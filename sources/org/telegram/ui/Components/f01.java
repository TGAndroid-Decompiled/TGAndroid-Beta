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
public final class f01 {
    public final TextPaint f25872a;
    public StaticLayout f25873b;
    public float f25874c;
    public float d;
    public float f25875e;
    public int f25876f;
    public Layout.Alignment f25877g;
    public float h;
    public boolean f25878i;
    public View f25879j;
    public v5 f25880k;
    public int f25881l;
    public PorterDuffColorFilter f25882m;
    public int f25883n;
    public boolean f25884o;
    public float f25885p;
    public LinearGradient f25886q;
    public Matrix f25887r;
    public Paint f25888s;
    public int f25889t;

    public f01(CharSequence charSequence, TextPaint textPaint) {
        this.f25875e = 9999.0f;
        this.f25876f = 1;
        this.f25877g = Layout.Alignment.ALIGN_NORMAL;
        this.f25881l = 0;
        this.f25885p = -1.0f;
        this.f25872a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25877g != alignment) {
            this.f25877g = alignment;
            r(this.f25873b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25873b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25873b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25873b == null) {
            return;
        }
        TextPaint textPaint = this.f25872a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25876f > 1) {
            height = 0.0f;
        } else {
            height = this.f25873b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25873b;
        if (staticLayout != null) {
            float f7 = this.f25885p;
            if (f7 >= 0.0f && this.f25874c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25889t, f7 - 1.0f, staticLayout.getHeight() + this.f25889t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25884o;
            TextPaint textPaint = this.f25872a;
            if (z10) {
                canvas.drawText(this.f25873b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25873b.draw(canvas);
            }
            if (this.f25878i) {
                if (this.f25882m == null || textPaint.getColor() != this.f25883n) {
                    int color = textPaint.getColor();
                    this.f25883n = color;
                    this.f25882m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25873b, this.f25880k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25882m);
            }
            canvas.restore();
            float f10 = this.f25885p;
            if (f10 >= 0.0f && this.f25874c > f10) {
                if (this.f25886q == null) {
                    this.f25886q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25887r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25888s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25888s.setShader(this.f25886q);
                }
                canvas.save();
                this.f25887r.reset();
                this.f25887r.postTranslate(this.f25885p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25886q.setLocalMatrix(this.f25887r);
                canvas.drawRect(this.f25885p - AndroidUtilities.dp(8.0f), 0.0f, this.f25885p, this.f25873b.getHeight(), this.f25888s);
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
        if (this.f25873b == null) {
            return;
        }
        canvas.save();
        if (this.f25876f > 1) {
            height = 0.0f;
        } else {
            height = this.f25873b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25872a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25885p = f7;
    }

    public final float h() {
        return this.f25874c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25872a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25873b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25873b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25873b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25885p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25874c);
        }
        return this.f25874c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25873b.getText());
        }
    }

    public final void n(int i10) {
        this.f25876f = i10;
        r(this.f25873b.getText());
    }

    public final void o(int i10) {
        this.f25872a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25881l != i10) {
            this.f25881l = i10;
            if (this.f25878i) {
                z5.release(this.f25879j, this.f25880k);
                this.f25880k = z5.update(this.f25881l, this.f25879j, this.f25880k, this.f25873b);
            }
        }
    }

    public final void q(float f7) {
        this.f25875e = f7;
        r(this.f25873b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25876f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25873b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25872a, (int) Math.max(this.f25875e, 1.0f)).setAlignment(this.f25877g).setMaxLines(this.f25876f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25873b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25872a, (int) Math.max(this.f25875e, 1.0f), this.f25877g, 1.0f, this.h, false);
        }
        if (this.f25877g == Layout.Alignment.ALIGN_CENTER) {
            this.f25874c = this.f25873b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25874c = 0.0f;
            this.d = this.f25873b.getWidth();
            for (int i10 = 0; i10 < this.f25873b.getLineCount(); i10++) {
                this.f25874c = Math.max(this.f25874c, this.f25873b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25873b.getLineLeft(i10));
            }
        }
        View view = this.f25879j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25880k = z5.update(this.f25881l, this.f25879j, this.f25880k, this.f25873b);
        }
    }

    public final void s(View view) {
        this.f25878i = true;
        this.f25879j = view;
        if (view.isAttachedToWindow()) {
            this.f25880k = z5.update(this.f25881l, view, this.f25880k, this.f25873b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f01(String str, float f7) {
        this(str, f7, null);
    }

    public f01(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25875e = 9999.0f;
        this.f25876f = 1;
        this.f25877g = Layout.Alignment.ALIGN_NORMAL;
        this.f25881l = 0;
        this.f25885p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25872a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
