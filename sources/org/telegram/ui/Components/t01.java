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
public final class t01 {
    public final TextPaint f28361a;
    public StaticLayout f28362b;
    public float f28363c;
    public float d;
    public float e;
    public int f28364f;
    public Layout.Alignment f28365g;
    public float h;
    public boolean f28366i;
    public View f28367j;
    public v5 f28368k;
    public int f28369l;
    public PorterDuffColorFilter f28370m;
    public int f28371n;
    public boolean f28372o;
    public float f28373p;
    public LinearGradient f28374q;
    public Matrix f28375r;
    public Paint f28376s;
    public int f28377t;

    public t01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28364f = 1;
        this.f28365g = Layout.Alignment.ALIGN_NORMAL;
        this.f28369l = 0;
        this.f28373p = -1.0f;
        this.f28361a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28365g != alignment) {
            this.f28365g = alignment;
            r(this.f28362b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28362b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28362b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28362b == null) {
            return;
        }
        TextPaint textPaint = this.f28361a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28364f > 1) {
            height = 0.0f;
        } else {
            height = this.f28362b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28362b;
        if (staticLayout != null) {
            float f7 = this.f28373p;
            if (f7 >= 0.0f && this.f28363c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28377t, f7 - 1.0f, staticLayout.getHeight() + this.f28377t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28372o;
            TextPaint textPaint = this.f28361a;
            if (z10) {
                canvas.drawText(this.f28362b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28362b.draw(canvas);
            }
            if (this.f28366i) {
                if (this.f28370m == null || textPaint.getColor() != this.f28371n) {
                    int color = textPaint.getColor();
                    this.f28371n = color;
                    this.f28370m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28362b, this.f28368k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28370m);
            }
            canvas.restore();
            float f10 = this.f28373p;
            if (f10 >= 0.0f && this.f28363c > f10) {
                if (this.f28374q == null) {
                    this.f28374q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28375r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28376s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28376s.setShader(this.f28374q);
                }
                canvas.save();
                this.f28375r.reset();
                this.f28375r.postTranslate(this.f28373p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28374q.setLocalMatrix(this.f28375r);
                canvas.drawRect(this.f28373p - AndroidUtilities.dp(8.0f), 0.0f, this.f28373p, this.f28362b.getHeight(), this.f28376s);
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
        if (this.f28362b == null) {
            return;
        }
        canvas.save();
        if (this.f28364f > 1) {
            height = 0.0f;
        } else {
            height = this.f28362b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28361a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28373p = f7;
    }

    public final float h() {
        return this.f28363c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28361a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28362b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28362b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28362b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28373p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28363c);
        }
        return this.f28363c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28362b.getText());
        }
    }

    public final void n(int i10) {
        this.f28364f = i10;
        r(this.f28362b.getText());
    }

    public final void o(int i10) {
        this.f28361a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28369l != i10) {
            this.f28369l = i10;
            if (this.f28366i) {
                z5.release(this.f28367j, this.f28368k);
                this.f28368k = z5.update(this.f28369l, this.f28367j, this.f28368k, this.f28362b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28362b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28364f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28362b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28361a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28365g).setMaxLines(this.f28364f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28362b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28361a, (int) Math.max(this.e, 1.0f), this.f28365g, 1.0f, this.h, false);
        }
        if (this.f28365g == Layout.Alignment.ALIGN_CENTER) {
            this.f28363c = this.f28362b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28363c = 0.0f;
            this.d = this.f28362b.getWidth();
            for (int i10 = 0; i10 < this.f28362b.getLineCount(); i10++) {
                this.f28363c = Math.max(this.f28363c, this.f28362b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28362b.getLineLeft(i10));
            }
        }
        View view = this.f28367j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28368k = z5.update(this.f28369l, this.f28367j, this.f28368k, this.f28362b);
        }
    }

    public final void s(View view) {
        this.f28366i = true;
        this.f28367j = view;
        if (view.isAttachedToWindow()) {
            this.f28368k = z5.update(this.f28369l, view, this.f28368k, this.f28362b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public t01(String str, float f7) {
        this(str, f7, null);
    }

    public t01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28364f = 1;
        this.f28365g = Layout.Alignment.ALIGN_NORMAL;
        this.f28369l = 0;
        this.f28373p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28361a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
