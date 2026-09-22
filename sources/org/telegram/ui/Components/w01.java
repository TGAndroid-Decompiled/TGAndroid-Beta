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
public final class w01 {
    public final TextPaint f29860a;
    public StaticLayout f29861b;
    public float f29862c;
    public float d;
    public float e;
    public int f29863f;
    public Layout.Alignment f29864g;
    public float h;
    public boolean f29865i;
    public View f29866j;
    public u5 f29867k;
    public int f29868l;
    public PorterDuffColorFilter f29869m;
    public int f29870n;
    public boolean f29871o;
    public float f29872p;
    public LinearGradient f29873q;
    public Matrix f29874r;
    public Paint f29875s;
    public int f29876t;

    public w01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f29863f = 1;
        this.f29864g = Layout.Alignment.ALIGN_NORMAL;
        this.f29868l = 0;
        this.f29872p = -1.0f;
        this.f29860a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f29864g != alignment) {
            this.f29864g = alignment;
            r(this.f29861b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f29861b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f29861b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f29861b == null) {
            return;
        }
        TextPaint textPaint = this.f29860a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f29863f > 1) {
            height = 0.0f;
        } else {
            height = this.f29861b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f29861b;
        if (staticLayout != null) {
            float f7 = this.f29872p;
            if (f7 >= 0.0f && this.f29862c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f29876t, f7 - 1.0f, staticLayout.getHeight() + this.f29876t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f29871o;
            TextPaint textPaint = this.f29860a;
            if (z10) {
                canvas.drawText(this.f29861b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f29861b.draw(canvas);
            }
            if (this.f29865i) {
                if (this.f29869m == null || textPaint.getColor() != this.f29870n) {
                    int color = textPaint.getColor();
                    this.f29870n = color;
                    this.f29869m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f29861b, this.f29867k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f29869m);
            }
            canvas.restore();
            float f10 = this.f29872p;
            if (f10 >= 0.0f && this.f29862c > f10) {
                if (this.f29873q == null) {
                    this.f29873q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f29874r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f29875s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f29875s.setShader(this.f29873q);
                }
                canvas.save();
                this.f29874r.reset();
                this.f29874r.postTranslate(this.f29872p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f29873q.setLocalMatrix(this.f29874r);
                canvas.drawRect(this.f29872p - AndroidUtilities.dp(8.0f), 0.0f, this.f29872p, this.f29861b.getHeight(), this.f29875s);
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
        if (this.f29861b == null) {
            return;
        }
        canvas.save();
        if (this.f29863f > 1) {
            height = 0.0f;
        } else {
            height = this.f29861b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f29860a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f29872p = f7;
    }

    public final float h() {
        return this.f29862c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f29860a.getFontMetricsInt();
    }

    public final float j() {
        return this.f29861b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f29861b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f29861b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f29872p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f29862c);
        }
        return this.f29862c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f29861b.getText());
        }
    }

    public final void n(int i10) {
        this.f29863f = i10;
        r(this.f29861b.getText());
    }

    public final void o(int i10) {
        this.f29860a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f29868l != i10) {
            this.f29868l = i10;
            if (this.f29865i) {
                y5.release(this.f29866j, this.f29867k);
                this.f29867k = y5.update(this.f29868l, this.f29866j, this.f29867k, this.f29861b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f29861b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f29863f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f29861b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29860a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f29864g).setMaxLines(this.f29863f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f29861b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f29860a, (int) Math.max(this.e, 1.0f), this.f29864g, 1.0f, this.h, false);
        }
        if (this.f29864g == Layout.Alignment.ALIGN_CENTER) {
            this.f29862c = this.f29861b.getWidth();
            this.d = 0.0f;
        } else {
            this.f29862c = 0.0f;
            this.d = this.f29861b.getWidth();
            for (int i10 = 0; i10 < this.f29861b.getLineCount(); i10++) {
                this.f29862c = Math.max(this.f29862c, this.f29861b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f29861b.getLineLeft(i10));
            }
        }
        View view = this.f29866j;
        if (view != null && view.isAttachedToWindow()) {
            this.f29867k = y5.update(this.f29868l, this.f29866j, this.f29867k, this.f29861b);
        }
    }

    public final void s(View view) {
        this.f29865i = true;
        this.f29866j = view;
        if (view.isAttachedToWindow()) {
            this.f29867k = y5.update(this.f29868l, view, this.f29867k, this.f29861b);
        }
        view.addOnAttachStateChangeListener(new ka(1, this, view));
    }

    public w01(String str, float f7) {
        this(str, f7, null);
    }

    public w01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f29863f = 1;
        this.f29864g = Layout.Alignment.ALIGN_NORMAL;
        this.f29868l = 0;
        this.f29872p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29860a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
