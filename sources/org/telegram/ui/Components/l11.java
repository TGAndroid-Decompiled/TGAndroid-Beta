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
public final class l11 {
    public final TextPaint f28220a;
    public StaticLayout f28221b;
    public float f28222c;
    public float d;
    public float f28223e;
    public int f28224f;
    public Layout.Alignment f28225g;
    public float h;
    public boolean f28226i;
    public View f28227j;
    public x5 f28228k;
    public int f28229l;
    public PorterDuffColorFilter f28230m;
    public int f28231n;
    public boolean f28232o;
    public float f28233p;
    public LinearGradient f28234q;
    public Matrix f28235r;
    public Paint f28236s;
    public int f28237t;

    public l11(CharSequence charSequence, TextPaint textPaint) {
        this.f28223e = 9999.0f;
        this.f28224f = 1;
        this.f28225g = Layout.Alignment.ALIGN_NORMAL;
        this.f28229l = 0;
        this.f28233p = -1.0f;
        this.f28220a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28225g != alignment) {
            this.f28225g = alignment;
            r(this.f28221b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28221b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28221b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28221b == null) {
            return;
        }
        TextPaint textPaint = this.f28220a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28224f > 1) {
            height = 0.0f;
        } else {
            height = this.f28221b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28221b;
        if (staticLayout != null) {
            float f7 = this.f28233p;
            if (f7 >= 0.0f && this.f28222c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28237t, f7 - 1.0f, staticLayout.getHeight() + this.f28237t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28232o;
            TextPaint textPaint = this.f28220a;
            if (z10) {
                canvas.drawText(this.f28221b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28221b.draw(canvas);
            }
            if (this.f28226i) {
                if (this.f28230m == null || textPaint.getColor() != this.f28231n) {
                    int color = textPaint.getColor();
                    this.f28231n = color;
                    this.f28230m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f28221b, this.f28228k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28230m);
            }
            canvas.restore();
            float f10 = this.f28233p;
            if (f10 >= 0.0f && this.f28222c > f10) {
                if (this.f28234q == null) {
                    this.f28234q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28235r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28236s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28236s.setShader(this.f28234q);
                }
                canvas.save();
                this.f28235r.reset();
                this.f28235r.postTranslate(this.f28233p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28234q.setLocalMatrix(this.f28235r);
                canvas.drawRect(this.f28233p - AndroidUtilities.dp(8.0f), 0.0f, this.f28233p, this.f28221b.getHeight(), this.f28236s);
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
        if (this.f28221b == null) {
            return;
        }
        canvas.save();
        if (this.f28224f > 1) {
            height = 0.0f;
        } else {
            height = this.f28221b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28220a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28233p = f7;
    }

    public final float h() {
        return this.f28222c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28220a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28221b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28221b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28221b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28233p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28222c);
        }
        return this.f28222c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28221b.getText());
        }
    }

    public final void n(int i10) {
        this.f28224f = i10;
        r(this.f28221b.getText());
    }

    public final void o(int i10) {
        this.f28220a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28229l != i10) {
            this.f28229l = i10;
            if (this.f28226i) {
                b6.release(this.f28227j, this.f28228k);
                this.f28228k = b6.update(this.f28229l, this.f28227j, this.f28228k, this.f28221b);
            }
        }
    }

    public final void q(float f7) {
        this.f28223e = f7;
        r(this.f28221b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28224f > 1) {
            this.f28221b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28220a, (int) Math.max(this.f28223e, 1.0f)).setAlignment(this.f28225g).setMaxLines(this.f28224f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28221b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28220a, (int) Math.max(this.f28223e, 1.0f), this.f28225g, 1.0f, this.h, false);
        }
        if (this.f28225g == Layout.Alignment.ALIGN_CENTER) {
            this.f28222c = this.f28221b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28222c = 0.0f;
            this.d = this.f28221b.getWidth();
            for (int i10 = 0; i10 < this.f28221b.getLineCount(); i10++) {
                this.f28222c = Math.max(this.f28222c, this.f28221b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28221b.getLineLeft(i10));
            }
        }
        View view = this.f28227j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28228k = b6.update(this.f28229l, this.f28227j, this.f28228k, this.f28221b);
        }
    }

    public final void s(View view) {
        this.f28226i = true;
        this.f28227j = view;
        if (view.isAttachedToWindow()) {
            this.f28228k = b6.update(this.f28229l, view, this.f28228k, this.f28221b);
        }
        view.addOnAttachStateChangeListener(new oa(1, this, view));
    }

    public l11(String str, float f7) {
        this(str, f7, null);
    }

    public l11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f28223e = 9999.0f;
        this.f28224f = 1;
        this.f28225g = Layout.Alignment.ALIGN_NORMAL;
        this.f28229l = 0;
        this.f28233p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28220a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
