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
public final class m11 {
    public final TextPaint f28600a;
    public StaticLayout f28601b;
    public float f28602c;
    public float d;
    public float f28603e;
    public int f28604f;
    public Layout.Alignment f28605g;
    public float h;
    public boolean f28606i;
    public View f28607j;
    public x5 f28608k;
    public int f28609l;
    public PorterDuffColorFilter f28610m;
    public int f28611n;
    public boolean f28612o;
    public float f28613p;
    public LinearGradient f28614q;
    public Matrix f28615r;
    public Paint f28616s;
    public int f28617t;

    public m11(CharSequence charSequence, TextPaint textPaint) {
        this.f28603e = 9999.0f;
        this.f28604f = 1;
        this.f28605g = Layout.Alignment.ALIGN_NORMAL;
        this.f28609l = 0;
        this.f28613p = -1.0f;
        this.f28600a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28605g != alignment) {
            this.f28605g = alignment;
            r(this.f28601b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28601b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28601b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28601b == null) {
            return;
        }
        TextPaint textPaint = this.f28600a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28604f > 1) {
            height = 0.0f;
        } else {
            height = this.f28601b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28601b;
        if (staticLayout != null) {
            float f7 = this.f28613p;
            if (f7 >= 0.0f && this.f28602c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28617t, f7 - 1.0f, staticLayout.getHeight() + this.f28617t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28612o;
            TextPaint textPaint = this.f28600a;
            if (z10) {
                canvas.drawText(this.f28601b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28601b.draw(canvas);
            }
            if (this.f28606i) {
                if (this.f28610m == null || textPaint.getColor() != this.f28611n) {
                    int color = textPaint.getColor();
                    this.f28611n = color;
                    this.f28610m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f28601b, this.f28608k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28610m);
            }
            canvas.restore();
            float f10 = this.f28613p;
            if (f10 >= 0.0f && this.f28602c > f10) {
                if (this.f28614q == null) {
                    this.f28614q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28615r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28616s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28616s.setShader(this.f28614q);
                }
                canvas.save();
                this.f28615r.reset();
                this.f28615r.postTranslate(this.f28613p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28614q.setLocalMatrix(this.f28615r);
                canvas.drawRect(this.f28613p - AndroidUtilities.dp(8.0f), 0.0f, this.f28613p, this.f28601b.getHeight(), this.f28616s);
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
        if (this.f28601b == null) {
            return;
        }
        canvas.save();
        if (this.f28604f > 1) {
            height = 0.0f;
        } else {
            height = this.f28601b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28600a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28613p = f7;
    }

    public final float h() {
        return this.f28602c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28600a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28601b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28601b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28601b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28613p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28602c);
        }
        return this.f28602c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28601b.getText());
        }
    }

    public final void n(int i10) {
        this.f28604f = i10;
        r(this.f28601b.getText());
    }

    public final void o(int i10) {
        this.f28600a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28609l != i10) {
            this.f28609l = i10;
            if (this.f28606i) {
                b6.release(this.f28607j, this.f28608k);
                this.f28608k = b6.update(this.f28609l, this.f28607j, this.f28608k, this.f28601b);
            }
        }
    }

    public final void q(float f7) {
        this.f28603e = f7;
        r(this.f28601b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28604f > 1) {
            this.f28601b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28600a, (int) Math.max(this.f28603e, 1.0f)).setAlignment(this.f28605g).setMaxLines(this.f28604f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28601b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28600a, (int) Math.max(this.f28603e, 1.0f), this.f28605g, 1.0f, this.h, false);
        }
        if (this.f28605g == Layout.Alignment.ALIGN_CENTER) {
            this.f28602c = this.f28601b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28602c = 0.0f;
            this.d = this.f28601b.getWidth();
            for (int i10 = 0; i10 < this.f28601b.getLineCount(); i10++) {
                this.f28602c = Math.max(this.f28602c, this.f28601b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28601b.getLineLeft(i10));
            }
        }
        View view = this.f28607j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28608k = b6.update(this.f28609l, this.f28607j, this.f28608k, this.f28601b);
        }
    }

    public final void s(View view) {
        this.f28606i = true;
        this.f28607j = view;
        if (view.isAttachedToWindow()) {
            this.f28608k = b6.update(this.f28609l, view, this.f28608k, this.f28601b);
        }
        view.addOnAttachStateChangeListener(new oa(1, this, view));
    }

    public m11(String str, float f7) {
        this(str, f7, null);
    }

    public m11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f28603e = 9999.0f;
        this.f28604f = 1;
        this.f28605g = Layout.Alignment.ALIGN_NORMAL;
        this.f28609l = 0;
        this.f28613p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28600a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
