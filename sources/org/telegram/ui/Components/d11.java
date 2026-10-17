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
public final class d11 {
    public final TextPaint f25435a;
    public StaticLayout f25436b;
    public float f25437c;
    public float d;
    public float e;
    public int f25438f;
    public Layout.Alignment f25439g;
    public float h;
    public boolean f25440i;
    public View f25441j;
    public w5 f25442k;
    public int f25443l;
    public PorterDuffColorFilter f25444m;
    public int f25445n;
    public boolean f25446o;
    public float f25447p;
    public LinearGradient f25448q;
    public Matrix f25449r;
    public Paint f25450s;
    public int f25451t;

    public d11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25438f = 1;
        this.f25439g = Layout.Alignment.ALIGN_NORMAL;
        this.f25443l = 0;
        this.f25447p = -1.0f;
        this.f25435a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25439g != alignment) {
            this.f25439g = alignment;
            r(this.f25436b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25436b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25436b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25436b == null) {
            return;
        }
        TextPaint textPaint = this.f25435a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25438f > 1) {
            height = 0.0f;
        } else {
            height = this.f25436b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25436b;
        if (staticLayout != null) {
            float f7 = this.f25447p;
            if (f7 >= 0.0f && this.f25437c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25451t, f7 - 1.0f, staticLayout.getHeight() + this.f25451t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25446o;
            TextPaint textPaint = this.f25435a;
            if (z10) {
                canvas.drawText(this.f25436b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25436b.draw(canvas);
            }
            if (this.f25440i) {
                if (this.f25444m == null || textPaint.getColor() != this.f25445n) {
                    int color = textPaint.getColor();
                    this.f25445n = color;
                    this.f25444m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f25436b, this.f25442k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25444m);
            }
            canvas.restore();
            float f10 = this.f25447p;
            if (f10 >= 0.0f && this.f25437c > f10) {
                if (this.f25448q == null) {
                    this.f25448q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25449r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25450s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25450s.setShader(this.f25448q);
                }
                canvas.save();
                this.f25449r.reset();
                this.f25449r.postTranslate(this.f25447p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25448q.setLocalMatrix(this.f25449r);
                canvas.drawRect(this.f25447p - AndroidUtilities.dp(8.0f), 0.0f, this.f25447p, this.f25436b.getHeight(), this.f25450s);
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
        if (this.f25436b == null) {
            return;
        }
        canvas.save();
        if (this.f25438f > 1) {
            height = 0.0f;
        } else {
            height = this.f25436b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25435a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25447p = f7;
    }

    public final float h() {
        return this.f25437c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25435a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25436b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25436b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25436b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25447p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25437c);
        }
        return this.f25437c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25436b.getText());
        }
    }

    public final void n(int i10) {
        this.f25438f = i10;
        r(this.f25436b.getText());
    }

    public final void o(int i10) {
        this.f25435a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25443l != i10) {
            this.f25443l = i10;
            if (this.f25440i) {
                a6.release(this.f25441j, this.f25442k);
                this.f25442k = a6.update(this.f25443l, this.f25441j, this.f25442k, this.f25436b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25436b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25438f > 1) {
            this.f25436b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25435a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25439g).setMaxLines(this.f25438f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25436b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25435a, (int) Math.max(this.e, 1.0f), this.f25439g, 1.0f, this.h, false);
        }
        if (this.f25439g == Layout.Alignment.ALIGN_CENTER) {
            this.f25437c = this.f25436b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25437c = 0.0f;
            this.d = this.f25436b.getWidth();
            for (int i10 = 0; i10 < this.f25436b.getLineCount(); i10++) {
                this.f25437c = Math.max(this.f25437c, this.f25436b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25436b.getLineLeft(i10));
            }
        }
        View view = this.f25441j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25442k = a6.update(this.f25443l, this.f25441j, this.f25442k, this.f25436b);
        }
    }

    public final void s(View view) {
        this.f25440i = true;
        this.f25441j = view;
        if (view.isAttachedToWindow()) {
            this.f25442k = a6.update(this.f25443l, view, this.f25442k, this.f25436b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public d11(String str, float f7) {
        this(str, f7, null);
    }

    public d11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25438f = 1;
        this.f25439g = Layout.Alignment.ALIGN_NORMAL;
        this.f25443l = 0;
        this.f25447p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25435a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
