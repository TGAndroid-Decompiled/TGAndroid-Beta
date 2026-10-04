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
public final class e11 {
    public final TextPaint f25882a;
    public StaticLayout f25883b;
    public float f25884c;
    public float d;
    public float f25885e;
    public int f25886f;
    public Layout.Alignment f25887g;
    public float h;
    public boolean f25888i;
    public View f25889j;
    public v5 f25890k;
    public int f25891l;
    public PorterDuffColorFilter f25892m;
    public int f25893n;
    public boolean f25894o;
    public float f25895p;
    public LinearGradient f25896q;
    public Matrix f25897r;
    public Paint f25898s;
    public int f25899t;

    public e11(CharSequence charSequence, TextPaint textPaint) {
        this.f25885e = 9999.0f;
        this.f25886f = 1;
        this.f25887g = Layout.Alignment.ALIGN_NORMAL;
        this.f25891l = 0;
        this.f25895p = -1.0f;
        this.f25882a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25887g != alignment) {
            this.f25887g = alignment;
            r(this.f25883b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25883b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25883b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25883b == null) {
            return;
        }
        TextPaint textPaint = this.f25882a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25886f > 1) {
            height = 0.0f;
        } else {
            height = this.f25883b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25883b;
        if (staticLayout != null) {
            float f7 = this.f25895p;
            if (f7 >= 0.0f && this.f25884c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25899t, f7 - 1.0f, staticLayout.getHeight() + this.f25899t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25894o;
            TextPaint textPaint = this.f25882a;
            if (z10) {
                canvas.drawText(this.f25883b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25883b.draw(canvas);
            }
            if (this.f25888i) {
                if (this.f25892m == null || textPaint.getColor() != this.f25893n) {
                    int color = textPaint.getColor();
                    this.f25893n = color;
                    this.f25892m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25883b, this.f25890k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25892m);
            }
            canvas.restore();
            float f10 = this.f25895p;
            if (f10 >= 0.0f && this.f25884c > f10) {
                if (this.f25896q == null) {
                    this.f25896q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25897r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25898s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25898s.setShader(this.f25896q);
                }
                canvas.save();
                this.f25897r.reset();
                this.f25897r.postTranslate(this.f25895p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25896q.setLocalMatrix(this.f25897r);
                canvas.drawRect(this.f25895p - AndroidUtilities.dp(8.0f), 0.0f, this.f25895p, this.f25883b.getHeight(), this.f25898s);
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
        if (this.f25883b == null) {
            return;
        }
        canvas.save();
        if (this.f25886f > 1) {
            height = 0.0f;
        } else {
            height = this.f25883b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25882a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25895p = f7;
    }

    public final float h() {
        return this.f25884c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25882a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25883b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25883b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25883b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25895p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25884c);
        }
        return this.f25884c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25883b.getText());
        }
    }

    public final void n(int i10) {
        this.f25886f = i10;
        r(this.f25883b.getText());
    }

    public final void o(int i10) {
        this.f25882a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25891l != i10) {
            this.f25891l = i10;
            if (this.f25888i) {
                z5.release(this.f25889j, this.f25890k);
                this.f25890k = z5.update(this.f25891l, this.f25889j, this.f25890k, this.f25883b);
            }
        }
    }

    public final void q(float f7) {
        this.f25885e = f7;
        r(this.f25883b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25886f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25883b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25882a, (int) Math.max(this.f25885e, 1.0f)).setAlignment(this.f25887g).setMaxLines(this.f25886f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25883b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25882a, (int) Math.max(this.f25885e, 1.0f), this.f25887g, 1.0f, this.h, false);
        }
        if (this.f25887g == Layout.Alignment.ALIGN_CENTER) {
            this.f25884c = this.f25883b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25884c = 0.0f;
            this.d = this.f25883b.getWidth();
            for (int i10 = 0; i10 < this.f25883b.getLineCount(); i10++) {
                this.f25884c = Math.max(this.f25884c, this.f25883b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25883b.getLineLeft(i10));
            }
        }
        View view = this.f25889j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25890k = z5.update(this.f25891l, this.f25889j, this.f25890k, this.f25883b);
        }
    }

    public final void s(View view) {
        this.f25888i = true;
        this.f25889j = view;
        if (view.isAttachedToWindow()) {
            this.f25890k = z5.update(this.f25891l, view, this.f25890k, this.f25883b);
        }
        view.addOnAttachStateChangeListener(new ma(1, this, view));
    }

    public e11(String str, float f7) {
        this(str, f7, null);
    }

    public e11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25885e = 9999.0f;
        this.f25886f = 1;
        this.f25887g = Layout.Alignment.ALIGN_NORMAL;
        this.f25891l = 0;
        this.f25895p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25882a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
