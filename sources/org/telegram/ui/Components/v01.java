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
public final class v01 {
    public final TextPaint f28927a;
    public StaticLayout f28928b;
    public float f28929c;
    public float d;
    public float e;
    public int f28930f;
    public Layout.Alignment f28931g;
    public float h;
    public boolean f28932i;
    public View f28933j;
    public v5 f28934k;
    public int f28935l;
    public PorterDuffColorFilter f28936m;
    public int f28937n;
    public boolean f28938o;
    public float f28939p;
    public LinearGradient f28940q;
    public Matrix f28941r;
    public Paint f28942s;
    public int f28943t;

    public v01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28930f = 1;
        this.f28931g = Layout.Alignment.ALIGN_NORMAL;
        this.f28935l = 0;
        this.f28939p = -1.0f;
        this.f28927a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28931g != alignment) {
            this.f28931g = alignment;
            r(this.f28928b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28928b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28928b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28928b == null) {
            return;
        }
        TextPaint textPaint = this.f28927a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28930f > 1) {
            height = 0.0f;
        } else {
            height = this.f28928b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28928b;
        if (staticLayout != null) {
            float f7 = this.f28939p;
            if (f7 >= 0.0f && this.f28929c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28943t, f7 - 1.0f, staticLayout.getHeight() + this.f28943t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28938o;
            TextPaint textPaint = this.f28927a;
            if (z10) {
                canvas.drawText(this.f28928b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28928b.draw(canvas);
            }
            if (this.f28932i) {
                if (this.f28936m == null || textPaint.getColor() != this.f28937n) {
                    int color = textPaint.getColor();
                    this.f28937n = color;
                    this.f28936m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28928b, this.f28934k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28936m);
            }
            canvas.restore();
            float f10 = this.f28939p;
            if (f10 >= 0.0f && this.f28929c > f10) {
                if (this.f28940q == null) {
                    this.f28940q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28941r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28942s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28942s.setShader(this.f28940q);
                }
                canvas.save();
                this.f28941r.reset();
                this.f28941r.postTranslate(this.f28939p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28940q.setLocalMatrix(this.f28941r);
                canvas.drawRect(this.f28939p - AndroidUtilities.dp(8.0f), 0.0f, this.f28939p, this.f28928b.getHeight(), this.f28942s);
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
        if (this.f28928b == null) {
            return;
        }
        canvas.save();
        if (this.f28930f > 1) {
            height = 0.0f;
        } else {
            height = this.f28928b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28927a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28939p = f7;
    }

    public final float h() {
        return this.f28929c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28927a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28928b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28928b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28928b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28939p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28929c);
        }
        return this.f28929c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28928b.getText());
        }
    }

    public final void n(int i10) {
        this.f28930f = i10;
        r(this.f28928b.getText());
    }

    public final void o(int i10) {
        this.f28927a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28935l != i10) {
            this.f28935l = i10;
            if (this.f28932i) {
                z5.release(this.f28933j, this.f28934k);
                this.f28934k = z5.update(this.f28935l, this.f28933j, this.f28934k, this.f28928b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28928b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28930f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28928b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28927a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28931g).setMaxLines(this.f28930f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28928b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28927a, (int) Math.max(this.e, 1.0f), this.f28931g, 1.0f, this.h, false);
        }
        if (this.f28931g == Layout.Alignment.ALIGN_CENTER) {
            this.f28929c = this.f28928b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28929c = 0.0f;
            this.d = this.f28928b.getWidth();
            for (int i10 = 0; i10 < this.f28928b.getLineCount(); i10++) {
                this.f28929c = Math.max(this.f28929c, this.f28928b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28928b.getLineLeft(i10));
            }
        }
        View view = this.f28933j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28934k = z5.update(this.f28935l, this.f28933j, this.f28934k, this.f28928b);
        }
    }

    public final void s(View view) {
        this.f28932i = true;
        this.f28933j = view;
        if (view.isAttachedToWindow()) {
            this.f28934k = z5.update(this.f28935l, view, this.f28934k, this.f28928b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public v01(String str, float f7) {
        this(str, f7, null);
    }

    public v01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28930f = 1;
        this.f28931g = Layout.Alignment.ALIGN_NORMAL;
        this.f28935l = 0;
        this.f28939p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28927a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
