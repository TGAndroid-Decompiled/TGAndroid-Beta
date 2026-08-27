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

public final class pz0 {

    public final TextPaint f31695a;

    public StaticLayout f31696b;

    public float f31697c;
    public float d;

    public float f31698e;

    public int f31699f;

    public Layout.Alignment f31700g;
    public float h;

    public boolean f31701i;

    public View f31702j;

    public p5 f31703k;

    public int f31704l;

    public PorterDuffColorFilter f31705m;

    public int f31706n;

    public boolean f31707o;

    public float f31708p;

    public LinearGradient f31709q;

    public Matrix f31710r;

    public Paint f31711s;

    public int f31712t;

    public pz0(CharSequence charSequence, TextPaint textPaint) {
        this.f31698e = 9999.0f;
        this.f31699f = 1;
        this.f31700g = Layout.Alignment.ALIGN_NORMAL;
        this.f31704l = 0;
        this.f31708p = -1.0f;
        this.f31695a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f31700g != alignment) {
            this.f31700g = alignment;
            r(this.f31696b.getText());
        }
    }

    public final float b() {
        float fMax = 0.0f;
        for (int i10 = 0; i10 < this.f31696b.getLineCount(); i10++) {
            fMax = Math.max(fMax, this.f31696b.getLineWidth(i10));
        }
        return fMax;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        if (this.f31696b == null) {
            return;
        }
        TextPaint textPaint = this.f31695a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        canvas.translate(f10, f11 - (this.f31699f > 1 ? 0.0f : this.f31696b.getHeight() / 2.0f));
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f31696b;
        if (staticLayout == null) {
            return;
        }
        float f10 = this.f31708p;
        if (f10 >= 0.0f && this.f31697c > f10) {
            canvas.saveLayerAlpha(0.0f, -this.f31712t, f10 - 1.0f, staticLayout.getHeight() + this.f31712t, 255, 31);
        }
        canvas.save();
        canvas.translate(-this.d, 0.0f);
        boolean z10 = this.f31707o;
        TextPaint textPaint = this.f31695a;
        if (z10) {
            canvas.drawText(this.f31696b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
        } else {
            this.f31696b.draw(canvas);
        }
        if (this.f31701i) {
            if (this.f31705m == null || textPaint.getColor() != this.f31706n) {
                int color = textPaint.getColor();
                this.f31706n = color;
                this.f31705m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            t5.drawAnimatedEmojis(canvas, this.f31696b, this.f31703k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f31705m);
        }
        canvas.restore();
        float f11 = this.f31708p;
        if (f11 < 0.0f || this.f31697c <= f11) {
            return;
        }
        if (this.f31709q == null) {
            this.f31709q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f31710r = new Matrix();
            Paint paint = new Paint(1);
            this.f31711s = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.f31711s.setShader(this.f31709q);
        }
        canvas.save();
        this.f31710r.reset();
        this.f31710r.postTranslate(this.f31708p - AndroidUtilities.dp(8.0f), 0.0f);
        this.f31709q.setLocalMatrix(this.f31710r);
        canvas.drawRect(this.f31708p - AndroidUtilities.dp(8.0f), 0.0f, this.f31708p, this.f31696b.getHeight(), this.f31711s);
        canvas.restore();
        canvas.restore();
    }

    public final void e(Canvas canvas, float f10, float f11) {
        f(canvas, f10, f11, 1.0f);
    }

    public final void f(Canvas canvas, float f10, float f11, float f12) {
        if (this.f31696b == null) {
            return;
        }
        canvas.save();
        canvas.translate(f10, f11 - (this.f31699f > 1 ? 0.0f : this.f31696b.getHeight() / 2.0f));
        TextPaint textPaint = this.f31695a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f31708p = f10;
    }

    public final float h() {
        return this.f31697c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f31695a.getFontMetricsInt();
    }

    public final float j() {
        return this.f31696b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f31696b;
        return (staticLayout == null || staticLayout.getText() == null) ? "" : this.f31696b.getText();
    }

    public final float l() {
        float f10 = this.f31708p;
        return f10 >= 0.0f ? Math.min(f10, this.f31697c) : this.f31697c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f31696b.getText());
        }
    }

    public final void n(int i10) {
        this.f31699f = i10;
        r(this.f31696b.getText());
    }

    public final void o(int i10) {
        this.f31695a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f31704l != i10) {
            this.f31704l = i10;
            if (this.f31701i) {
                t5.release(this.f31702j, this.f31703k);
                this.f31703k = t5.update(this.f31704l, this.f31702j, this.f31703k, this.f31696b);
            }
        }
    }

    public final void q(float f10) {
        this.f31698e = f10;
        r(this.f31696b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f31699f <= 1 || Build.VERSION.SDK_INT < 23) {
            this.f31696b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f31695a, (int) Math.max(this.f31698e, 1.0f), this.f31700g, 1.0f, this.h, false);
        } else {
            this.f31696b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f31695a, (int) Math.max(this.f31698e, 1.0f)).setAlignment(this.f31700g).setMaxLines(this.f31699f).setLineSpacing(this.h, 1.0f).build();
        }
        if (this.f31700g == Layout.Alignment.ALIGN_CENTER) {
            this.f31697c = this.f31696b.getWidth();
            this.d = 0.0f;
        } else {
            this.f31697c = 0.0f;
            this.d = this.f31696b.getWidth();
            for (int i10 = 0; i10 < this.f31696b.getLineCount(); i10++) {
                this.f31697c = Math.max(this.f31697c, this.f31696b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f31696b.getLineLeft(i10));
            }
        }
        View view = this.f31702j;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.f31703k = t5.update(this.f31704l, this.f31702j, this.f31703k, this.f31696b);
    }

    public final void s(View view) {
        int i10 = 1;
        this.f31701i = true;
        this.f31702j = view;
        if (view.isAttachedToWindow()) {
            this.f31703k = t5.update(this.f31704l, view, this.f31703k, this.f31696b);
        }
        view.addOnAttachStateChangeListener(new ba(i10, this, view));
    }

    public pz0(String str, float f10) {
        this(str, f10, null);
    }

    public pz0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f31698e = 9999.0f;
        this.f31699f = 1;
        this.f31700g = Layout.Alignment.ALIGN_NORMAL;
        this.f31704l = 0;
        this.f31708p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31695a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
