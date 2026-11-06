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
public final class my0 {
    public final TextPaint f36123a;
    public StaticLayout f36124b;
    public float f36125c;
    public float d;
    public float f36126e;
    public int f36127f;
    public Layout.Alignment f36128g;
    public float h;
    public boolean f36129i;
    public View f36130j;
    public n5 f36131k;
    public int f36132l;
    public PorterDuffColorFilter f36133m;
    public int f36134n;
    public boolean f36135o;
    public float f36136p;
    public LinearGradient f36137q;
    public Matrix f36138r;
    public Paint f36139s;
    public int f36140t;

    public my0(CharSequence charSequence, TextPaint textPaint) {
        this.f36126e = 9999.0f;
        this.f36127f = 1;
        this.f36128g = Layout.Alignment.ALIGN_NORMAL;
        this.f36132l = 0;
        this.f36136p = -1.0f;
        this.f36123a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f36128g != alignment) {
            this.f36128g = alignment;
            q(this.f36124b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f36124b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f36124b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f36124b == null) {
            return;
        }
        TextPaint textPaint = this.f36123a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f36127f > 1) {
            height = 0.0f;
        } else {
            height = this.f36124b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f36124b;
        if (staticLayout != null) {
            float f10 = this.f36136p;
            if (f10 >= 0.0f && this.f36125c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f36140t, f10 - 1.0f, staticLayout.getHeight() + this.f36140t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f36135o;
            TextPaint textPaint = this.f36123a;
            if (z9) {
                canvas.drawText(this.f36124b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f36124b.draw(canvas);
            }
            if (this.f36129i) {
                if (this.f36133m == null || textPaint.getColor() != this.f36134n) {
                    int color = textPaint.getColor();
                    this.f36134n = color;
                    this.f36133m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                r5.drawAnimatedEmojis(canvas, this.f36124b, this.f36131k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f36133m);
            }
            canvas.restore();
            float f11 = this.f36136p;
            if (f11 >= 0.0f && this.f36125c > f11) {
                if (this.f36137q == null) {
                    this.f36137q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f36138r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f36139s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f36139s.setShader(this.f36137q);
                }
                canvas.save();
                this.f36138r.reset();
                this.f36138r.postTranslate(this.f36136p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f36137q.setLocalMatrix(this.f36138r);
                canvas.drawRect(this.f36136p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f36136p, this.f36124b.getHeight(), this.f36139s);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final void e(Canvas canvas, float f10, float f11) {
        f(canvas, f10, f11, 1.0f);
    }

    public final void f(Canvas canvas, float f10, float f11, float f12) {
        float height;
        if (this.f36124b == null) {
            return;
        }
        canvas.save();
        if (this.f36127f > 1) {
            height = 0.0f;
        } else {
            height = this.f36124b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f36123a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f36125c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f36123a.getFontMetricsInt();
    }

    public final float i() {
        return this.f36124b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f36124b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f36124b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f36136p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f36125c);
        }
        return this.f36125c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f36124b.getText());
        }
    }

    public final void m(int i7) {
        this.f36127f = i7;
        q(this.f36124b.getText());
    }

    public final void n(int i7) {
        this.f36123a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f36132l != i7) {
            this.f36132l = i7;
            if (this.f36129i) {
                r5.release(this.f36130j, this.f36131k);
                this.f36131k = r5.update(this.f36132l, this.f36130j, this.f36131k, this.f36124b);
            }
        }
    }

    public final void p(float f10) {
        this.f36126e = f10;
        q(this.f36124b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f36127f > 1) {
            this.f36124b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f36123a, (int) Math.max(this.f36126e, 1.0f)).setAlignment(this.f36128g).setMaxLines(this.f36127f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f36124b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f36123a, (int) Math.max(this.f36126e, 1.0f), this.f36128g, 1.0f, this.h, false);
        }
        if (this.f36128g == Layout.Alignment.ALIGN_CENTER) {
            this.f36125c = this.f36124b.getWidth();
            this.d = 0.0f;
        } else {
            this.f36125c = 0.0f;
            this.d = this.f36124b.getWidth();
            for (int i7 = 0; i7 < this.f36124b.getLineCount(); i7++) {
                this.f36125c = Math.max(this.f36125c, this.f36124b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f36124b.getLineLeft(i7));
            }
        }
        View view = this.f36130j;
        if (view != null && view.isAttachedToWindow()) {
            this.f36131k = r5.update(this.f36132l, this.f36130j, this.f36131k, this.f36124b);
        }
    }

    public final void r(View view) {
        this.f36129i = true;
        this.f36130j = view;
        if (view.isAttachedToWindow()) {
            this.f36131k = r5.update(this.f36132l, view, this.f36131k, this.f36124b);
        }
        view.addOnAttachStateChangeListener(new aa(1, this, view));
    }

    public my0(String str, float f10) {
        this(str, f10, null);
    }

    public my0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f36126e = 9999.0f;
        this.f36127f = 1;
        this.f36128g = Layout.Alignment.ALIGN_NORMAL;
        this.f36132l = 0;
        this.f36136p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36123a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
