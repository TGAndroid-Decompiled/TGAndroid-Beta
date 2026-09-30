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
    public final TextPaint f29766a;
    public StaticLayout f29767b;
    public float f29768c;
    public float d;
    public float e;
    public int f29769f;
    public Layout.Alignment f29770g;
    public float h;
    public boolean f29771i;
    public View f29772j;
    public v5 f29773k;
    public int f29774l;
    public PorterDuffColorFilter f29775m;
    public int f29776n;
    public boolean f29777o;
    public float f29778p;
    public LinearGradient f29779q;
    public Matrix f29780r;
    public Paint f29781s;
    public int f29782t;

    public w01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f29769f = 1;
        this.f29770g = Layout.Alignment.ALIGN_NORMAL;
        this.f29774l = 0;
        this.f29778p = -1.0f;
        this.f29766a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f29770g != alignment) {
            this.f29770g = alignment;
            r(this.f29767b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f29767b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f29767b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f29767b == null) {
            return;
        }
        TextPaint textPaint = this.f29766a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f29769f > 1) {
            height = 0.0f;
        } else {
            height = this.f29767b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f29767b;
        if (staticLayout != null) {
            float f7 = this.f29778p;
            if (f7 >= 0.0f && this.f29768c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f29782t, f7 - 1.0f, staticLayout.getHeight() + this.f29782t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f29777o;
            TextPaint textPaint = this.f29766a;
            if (z10) {
                canvas.drawText(this.f29767b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f29767b.draw(canvas);
            }
            if (this.f29771i) {
                if (this.f29775m == null || textPaint.getColor() != this.f29776n) {
                    int color = textPaint.getColor();
                    this.f29776n = color;
                    this.f29775m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f29767b, this.f29773k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f29775m);
            }
            canvas.restore();
            float f10 = this.f29778p;
            if (f10 >= 0.0f && this.f29768c > f10) {
                if (this.f29779q == null) {
                    this.f29779q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f29780r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f29781s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f29781s.setShader(this.f29779q);
                }
                canvas.save();
                this.f29780r.reset();
                this.f29780r.postTranslate(this.f29778p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f29779q.setLocalMatrix(this.f29780r);
                canvas.drawRect(this.f29778p - AndroidUtilities.dp(8.0f), 0.0f, this.f29778p, this.f29767b.getHeight(), this.f29781s);
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
        if (this.f29767b == null) {
            return;
        }
        canvas.save();
        if (this.f29769f > 1) {
            height = 0.0f;
        } else {
            height = this.f29767b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f29766a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f29778p = f7;
    }

    public final float h() {
        return this.f29768c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f29766a.getFontMetricsInt();
    }

    public final float j() {
        return this.f29767b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f29767b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f29767b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f29778p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f29768c);
        }
        return this.f29768c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f29767b.getText());
        }
    }

    public final void n(int i10) {
        this.f29769f = i10;
        r(this.f29767b.getText());
    }

    public final void o(int i10) {
        this.f29766a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f29774l != i10) {
            this.f29774l = i10;
            if (this.f29771i) {
                z5.release(this.f29772j, this.f29773k);
                this.f29773k = z5.update(this.f29774l, this.f29772j, this.f29773k, this.f29767b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f29767b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f29769f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f29767b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29766a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f29770g).setMaxLines(this.f29769f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f29767b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f29766a, (int) Math.max(this.e, 1.0f), this.f29770g, 1.0f, this.h, false);
        }
        if (this.f29770g == Layout.Alignment.ALIGN_CENTER) {
            this.f29768c = this.f29767b.getWidth();
            this.d = 0.0f;
        } else {
            this.f29768c = 0.0f;
            this.d = this.f29767b.getWidth();
            for (int i10 = 0; i10 < this.f29767b.getLineCount(); i10++) {
                this.f29768c = Math.max(this.f29768c, this.f29767b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f29767b.getLineLeft(i10));
            }
        }
        View view = this.f29772j;
        if (view != null && view.isAttachedToWindow()) {
            this.f29773k = z5.update(this.f29774l, this.f29772j, this.f29773k, this.f29767b);
        }
    }

    public final void s(View view) {
        this.f29771i = true;
        this.f29772j = view;
        if (view.isAttachedToWindow()) {
            this.f29773k = z5.update(this.f29774l, view, this.f29773k, this.f29767b);
        }
        view.addOnAttachStateChangeListener(new ma(1, this, view));
    }

    public w01(String str, float f7) {
        this(str, f7, null);
    }

    public w01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f29769f = 1;
        this.f29770g = Layout.Alignment.ALIGN_NORMAL;
        this.f29774l = 0;
        this.f29778p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29766a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
