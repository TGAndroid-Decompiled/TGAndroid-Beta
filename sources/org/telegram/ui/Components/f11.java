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
public final class f11 {
    public final TextPaint f26022a;
    public StaticLayout f26023b;
    public float f26024c;
    public float d;
    public float e;
    public int f26025f;
    public Layout.Alignment f26026g;
    public float h;
    public boolean f26027i;
    public View f26028j;
    public w5 f26029k;
    public int f26030l;
    public PorterDuffColorFilter f26031m;
    public int f26032n;
    public boolean f26033o;
    public float f26034p;
    public LinearGradient f26035q;
    public Matrix f26036r;
    public Paint f26037s;
    public int f26038t;

    public f11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26025f = 1;
        this.f26026g = Layout.Alignment.ALIGN_NORMAL;
        this.f26030l = 0;
        this.f26034p = -1.0f;
        this.f26022a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26026g != alignment) {
            this.f26026g = alignment;
            r(this.f26023b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f26023b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f26023b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f26023b == null) {
            return;
        }
        TextPaint textPaint = this.f26022a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f26025f > 1) {
            height = 0.0f;
        } else {
            height = this.f26023b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26023b;
        if (staticLayout != null) {
            float f7 = this.f26034p;
            if (f7 >= 0.0f && this.f26024c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f26038t, f7 - 1.0f, staticLayout.getHeight() + this.f26038t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f26033o;
            TextPaint textPaint = this.f26022a;
            if (z10) {
                canvas.drawText(this.f26023b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26023b.draw(canvas);
            }
            if (this.f26027i) {
                if (this.f26031m == null || textPaint.getColor() != this.f26032n) {
                    int color = textPaint.getColor();
                    this.f26032n = color;
                    this.f26031m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f26023b, this.f26029k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26031m);
            }
            canvas.restore();
            float f10 = this.f26034p;
            if (f10 >= 0.0f && this.f26024c > f10) {
                if (this.f26035q == null) {
                    this.f26035q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26036r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26037s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26037s.setShader(this.f26035q);
                }
                canvas.save();
                this.f26036r.reset();
                this.f26036r.postTranslate(this.f26034p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26035q.setLocalMatrix(this.f26036r);
                canvas.drawRect(this.f26034p - AndroidUtilities.dp(8.0f), 0.0f, this.f26034p, this.f26023b.getHeight(), this.f26037s);
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
        if (this.f26023b == null) {
            return;
        }
        canvas.save();
        if (this.f26025f > 1) {
            height = 0.0f;
        } else {
            height = this.f26023b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f26022a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f26034p = f7;
    }

    public final float h() {
        return this.f26024c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26022a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26023b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26023b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26023b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f26034p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f26024c);
        }
        return this.f26024c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f26023b.getText());
        }
    }

    public final void n(int i10) {
        this.f26025f = i10;
        r(this.f26023b.getText());
    }

    public final void o(int i10) {
        this.f26022a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26030l != i10) {
            this.f26030l = i10;
            if (this.f26027i) {
                a6.release(this.f26028j, this.f26029k);
                this.f26029k = a6.update(this.f26030l, this.f26028j, this.f26029k, this.f26023b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f26023b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26025f > 1) {
            this.f26023b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26022a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26026g).setMaxLines(this.f26025f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26023b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26022a, (int) Math.max(this.e, 1.0f), this.f26026g, 1.0f, this.h, false);
        }
        if (this.f26026g == Layout.Alignment.ALIGN_CENTER) {
            this.f26024c = this.f26023b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26024c = 0.0f;
            this.d = this.f26023b.getWidth();
            for (int i10 = 0; i10 < this.f26023b.getLineCount(); i10++) {
                this.f26024c = Math.max(this.f26024c, this.f26023b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26023b.getLineLeft(i10));
            }
        }
        View view = this.f26028j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26029k = a6.update(this.f26030l, this.f26028j, this.f26029k, this.f26023b);
        }
    }

    public final void s(View view) {
        this.f26027i = true;
        this.f26028j = view;
        if (view.isAttachedToWindow()) {
            this.f26029k = a6.update(this.f26030l, view, this.f26029k, this.f26023b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f11(String str, float f7) {
        this(str, f7, null);
    }

    public f11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f26025f = 1;
        this.f26026g = Layout.Alignment.ALIGN_NORMAL;
        this.f26030l = 0;
        this.f26034p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26022a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
