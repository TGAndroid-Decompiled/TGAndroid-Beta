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
    public final TextPaint f25845a;
    public StaticLayout f25846b;
    public float f25847c;
    public float d;
    public float f25848e;
    public int f25849f;
    public Layout.Alignment f25850g;
    public float h;
    public boolean f25851i;
    public View f25852j;
    public v5 f25853k;
    public int f25854l;
    public PorterDuffColorFilter f25855m;
    public int f25856n;
    public boolean f25857o;
    public float f25858p;
    public LinearGradient f25859q;
    public Matrix f25860r;
    public Paint f25861s;
    public int f25862t;

    public f01(CharSequence charSequence, TextPaint textPaint) {
        this.f25848e = 9999.0f;
        this.f25849f = 1;
        this.f25850g = Layout.Alignment.ALIGN_NORMAL;
        this.f25854l = 0;
        this.f25858p = -1.0f;
        this.f25845a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25850g != alignment) {
            this.f25850g = alignment;
            r(this.f25846b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25846b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25846b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25846b == null) {
            return;
        }
        TextPaint textPaint = this.f25845a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25849f > 1) {
            height = 0.0f;
        } else {
            height = this.f25846b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25846b;
        if (staticLayout != null) {
            float f7 = this.f25858p;
            if (f7 >= 0.0f && this.f25847c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25862t, f7 - 1.0f, staticLayout.getHeight() + this.f25862t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25857o;
            TextPaint textPaint = this.f25845a;
            if (z10) {
                canvas.drawText(this.f25846b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25846b.draw(canvas);
            }
            if (this.f25851i) {
                if (this.f25855m == null || textPaint.getColor() != this.f25856n) {
                    int color = textPaint.getColor();
                    this.f25856n = color;
                    this.f25855m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25846b, this.f25853k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25855m);
            }
            canvas.restore();
            float f10 = this.f25858p;
            if (f10 >= 0.0f && this.f25847c > f10) {
                if (this.f25859q == null) {
                    this.f25859q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25860r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25861s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25861s.setShader(this.f25859q);
                }
                canvas.save();
                this.f25860r.reset();
                this.f25860r.postTranslate(this.f25858p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25859q.setLocalMatrix(this.f25860r);
                canvas.drawRect(this.f25858p - AndroidUtilities.dp(8.0f), 0.0f, this.f25858p, this.f25846b.getHeight(), this.f25861s);
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
        if (this.f25846b == null) {
            return;
        }
        canvas.save();
        if (this.f25849f > 1) {
            height = 0.0f;
        } else {
            height = this.f25846b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25845a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25858p = f7;
    }

    public final float h() {
        return this.f25847c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25845a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25846b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25846b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25846b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25858p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25847c);
        }
        return this.f25847c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25846b.getText());
        }
    }

    public final void n(int i10) {
        this.f25849f = i10;
        r(this.f25846b.getText());
    }

    public final void o(int i10) {
        this.f25845a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25854l != i10) {
            this.f25854l = i10;
            if (this.f25851i) {
                z5.release(this.f25852j, this.f25853k);
                this.f25853k = z5.update(this.f25854l, this.f25852j, this.f25853k, this.f25846b);
            }
        }
    }

    public final void q(float f7) {
        this.f25848e = f7;
        r(this.f25846b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25849f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25846b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25845a, (int) Math.max(this.f25848e, 1.0f)).setAlignment(this.f25850g).setMaxLines(this.f25849f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25846b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25845a, (int) Math.max(this.f25848e, 1.0f), this.f25850g, 1.0f, this.h, false);
        }
        if (this.f25850g == Layout.Alignment.ALIGN_CENTER) {
            this.f25847c = this.f25846b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25847c = 0.0f;
            this.d = this.f25846b.getWidth();
            for (int i10 = 0; i10 < this.f25846b.getLineCount(); i10++) {
                this.f25847c = Math.max(this.f25847c, this.f25846b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25846b.getLineLeft(i10));
            }
        }
        View view = this.f25852j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25853k = z5.update(this.f25854l, this.f25852j, this.f25853k, this.f25846b);
        }
    }

    public final void s(View view) {
        this.f25851i = true;
        this.f25852j = view;
        if (view.isAttachedToWindow()) {
            this.f25853k = z5.update(this.f25854l, view, this.f25853k, this.f25846b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f01(String str, float f7) {
        this(str, f7, null);
    }

    public f01(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25848e = 9999.0f;
        this.f25849f = 1;
        this.f25850g = Layout.Alignment.ALIGN_NORMAL;
        this.f25854l = 0;
        this.f25858p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25845a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
