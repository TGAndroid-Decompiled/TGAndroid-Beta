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
public final class h11 {
    public final TextPaint f25471a;
    public StaticLayout f25472b;
    public float f25473c;
    public float d;
    public float e;
    public int f25474f;
    public Layout.Alignment f25475g;
    public float h;
    public boolean f25476i;
    public View f25477j;
    public x5 f25478k;
    public int f25479l;
    public PorterDuffColorFilter f25480m;
    public int f25481n;
    public boolean f25482o;
    public float f25483p;
    public LinearGradient f25484q;
    public Matrix f25485r;
    public Paint f25486s;
    public int f25487t;

    public h11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25474f = 1;
        this.f25475g = Layout.Alignment.ALIGN_NORMAL;
        this.f25479l = 0;
        this.f25483p = -1.0f;
        this.f25471a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25475g != alignment) {
            this.f25475g = alignment;
            r(this.f25472b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25472b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25472b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25472b == null) {
            return;
        }
        TextPaint textPaint = this.f25471a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25474f > 1) {
            height = 0.0f;
        } else {
            height = this.f25472b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25472b;
        if (staticLayout != null) {
            float f7 = this.f25483p;
            if (f7 >= 0.0f && this.f25473c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25487t, f7 - 1.0f, staticLayout.getHeight() + this.f25487t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25482o;
            TextPaint textPaint = this.f25471a;
            if (z10) {
                canvas.drawText(this.f25472b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25472b.draw(canvas);
            }
            if (this.f25476i) {
                if (this.f25480m == null || textPaint.getColor() != this.f25481n) {
                    int color = textPaint.getColor();
                    this.f25481n = color;
                    this.f25480m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f25472b, this.f25478k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25480m);
            }
            canvas.restore();
            float f10 = this.f25483p;
            if (f10 >= 0.0f && this.f25473c > f10) {
                if (this.f25484q == null) {
                    this.f25484q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25485r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25486s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25486s.setShader(this.f25484q);
                }
                canvas.save();
                this.f25485r.reset();
                this.f25485r.postTranslate(this.f25483p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25484q.setLocalMatrix(this.f25485r);
                canvas.drawRect(this.f25483p - AndroidUtilities.dp(8.0f), 0.0f, this.f25483p, this.f25472b.getHeight(), this.f25486s);
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
        if (this.f25472b == null) {
            return;
        }
        canvas.save();
        if (this.f25474f > 1) {
            height = 0.0f;
        } else {
            height = this.f25472b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25471a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25483p = f7;
    }

    public final float h() {
        return this.f25473c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25471a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25472b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25472b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25472b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25483p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25473c);
        }
        return this.f25473c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25472b.getText());
        }
    }

    public final void n(int i10) {
        this.f25474f = i10;
        r(this.f25472b.getText());
    }

    public final void o(int i10) {
        this.f25471a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25479l != i10) {
            this.f25479l = i10;
            if (this.f25476i) {
                b6.release(this.f25477j, this.f25478k);
                this.f25478k = b6.update(this.f25479l, this.f25477j, this.f25478k, this.f25472b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25472b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25474f > 1) {
            this.f25472b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25471a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25475g).setMaxLines(this.f25474f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25472b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25471a, (int) Math.max(this.e, 1.0f), this.f25475g, 1.0f, this.h, false);
        }
        if (this.f25475g == Layout.Alignment.ALIGN_CENTER) {
            this.f25473c = this.f25472b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25473c = 0.0f;
            this.d = this.f25472b.getWidth();
            for (int i10 = 0; i10 < this.f25472b.getLineCount(); i10++) {
                this.f25473c = Math.max(this.f25473c, this.f25472b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25472b.getLineLeft(i10));
            }
        }
        View view = this.f25477j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25478k = b6.update(this.f25479l, this.f25477j, this.f25478k, this.f25472b);
        }
    }

    public final void s(View view) {
        this.f25476i = true;
        this.f25477j = view;
        if (view.isAttachedToWindow()) {
            this.f25478k = b6.update(this.f25479l, view, this.f25478k, this.f25472b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public h11(String str, float f7) {
        this(str, f7, null);
    }

    public h11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25474f = 1;
        this.f25475g = Layout.Alignment.ALIGN_NORMAL;
        this.f25479l = 0;
        this.f25483p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25471a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
