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
public final class h01 {
    public final TextPaint f24437a;
    public StaticLayout f24438b;
    public float f24439c;
    public float d;
    public float e;
    public int f24440f;
    public Layout.Alignment f24441g;
    public float h;
    public boolean f24442i;
    public View f24443j;
    public t5 f24444k;
    public int f24445l;
    public PorterDuffColorFilter f24446m;
    public int f24447n;
    public boolean f24448o;
    public float f24449p;
    public LinearGradient f24450q;
    public Matrix f24451r;
    public Paint f24452s;
    public int f24453t;

    public h01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f24440f = 1;
        this.f24441g = Layout.Alignment.ALIGN_NORMAL;
        this.f24445l = 0;
        this.f24449p = -1.0f;
        this.f24437a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f24441g != alignment) {
            this.f24441g = alignment;
            r(this.f24438b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f24438b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f24438b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f24438b == null) {
            return;
        }
        TextPaint textPaint = this.f24437a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f24440f > 1) {
            height = 0.0f;
        } else {
            height = this.f24438b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f24438b;
        if (staticLayout != null) {
            float f7 = this.f24449p;
            if (f7 >= 0.0f && this.f24439c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f24453t, f7 - 1.0f, staticLayout.getHeight() + this.f24453t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f24448o;
            TextPaint textPaint = this.f24437a;
            if (z10) {
                canvas.drawText(this.f24438b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f24438b.draw(canvas);
            }
            if (this.f24442i) {
                if (this.f24446m == null || textPaint.getColor() != this.f24447n) {
                    int color = textPaint.getColor();
                    this.f24447n = color;
                    this.f24446m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f24438b, this.f24444k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24446m);
            }
            canvas.restore();
            float f10 = this.f24449p;
            if (f10 >= 0.0f && this.f24439c > f10) {
                if (this.f24450q == null) {
                    this.f24450q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f24451r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f24452s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f24452s.setShader(this.f24450q);
                }
                canvas.save();
                this.f24451r.reset();
                this.f24451r.postTranslate(this.f24449p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f24450q.setLocalMatrix(this.f24451r);
                canvas.drawRect(this.f24449p - AndroidUtilities.dp(8.0f), 0.0f, this.f24449p, this.f24438b.getHeight(), this.f24452s);
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
        if (this.f24438b == null) {
            return;
        }
        canvas.save();
        if (this.f24440f > 1) {
            height = 0.0f;
        } else {
            height = this.f24438b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f24437a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f24449p = f7;
    }

    public final float h() {
        return this.f24439c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f24437a.getFontMetricsInt();
    }

    public final float j() {
        return this.f24438b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f24438b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f24438b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f24449p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f24439c);
        }
        return this.f24439c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f24438b.getText());
        }
    }

    public final void n(int i10) {
        this.f24440f = i10;
        r(this.f24438b.getText());
    }

    public final void o(int i10) {
        this.f24437a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f24445l != i10) {
            this.f24445l = i10;
            if (this.f24442i) {
                x5.release(this.f24443j, this.f24444k);
                this.f24444k = x5.update(this.f24445l, this.f24443j, this.f24444k, this.f24438b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f24438b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f24440f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f24438b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f24437a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f24441g).setMaxLines(this.f24440f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f24438b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f24437a, (int) Math.max(this.e, 1.0f), this.f24441g, 1.0f, this.h, false);
        }
        if (this.f24441g == Layout.Alignment.ALIGN_CENTER) {
            this.f24439c = this.f24438b.getWidth();
            this.d = 0.0f;
        } else {
            this.f24439c = 0.0f;
            this.d = this.f24438b.getWidth();
            for (int i10 = 0; i10 < this.f24438b.getLineCount(); i10++) {
                this.f24439c = Math.max(this.f24439c, this.f24438b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f24438b.getLineLeft(i10));
            }
        }
        View view = this.f24443j;
        if (view != null && view.isAttachedToWindow()) {
            this.f24444k = x5.update(this.f24445l, this.f24443j, this.f24444k, this.f24438b);
        }
    }

    public final void s(View view) {
        this.f24442i = true;
        this.f24443j = view;
        if (view.isAttachedToWindow()) {
            this.f24444k = x5.update(this.f24445l, view, this.f24444k, this.f24438b);
        }
        view.addOnAttachStateChangeListener(new ja(1, this, view));
    }

    public h01(String str, float f7) {
        this(str, f7, null);
    }

    public h01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f24440f = 1;
        this.f24441g = Layout.Alignment.ALIGN_NORMAL;
        this.f24445l = 0;
        this.f24449p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24437a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
