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
    public final TextPaint f36131a;
    public StaticLayout f36132b;
    public float f36133c;
    public float d;
    public float f36134e;
    public int f36135f;
    public Layout.Alignment f36136g;
    public float h;
    public boolean f36137i;
    public View f36138j;
    public m5 f36139k;
    public int f36140l;
    public PorterDuffColorFilter f36141m;
    public int f36142n;
    public boolean f36143o;
    public float f36144p;
    public LinearGradient f36145q;
    public Matrix f36146r;
    public Paint f36147s;
    public int f36148t;

    public my0(CharSequence charSequence, TextPaint textPaint) {
        this.f36134e = 9999.0f;
        this.f36135f = 1;
        this.f36136g = Layout.Alignment.ALIGN_NORMAL;
        this.f36140l = 0;
        this.f36144p = -1.0f;
        this.f36131a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f36136g != alignment) {
            this.f36136g = alignment;
            q(this.f36132b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f36132b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f36132b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f36132b == null) {
            return;
        }
        TextPaint textPaint = this.f36131a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f36135f > 1) {
            height = 0.0f;
        } else {
            height = this.f36132b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f36132b;
        if (staticLayout != null) {
            float f10 = this.f36144p;
            if (f10 >= 0.0f && this.f36133c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f36148t, f10 - 1.0f, staticLayout.getHeight() + this.f36148t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f36143o;
            TextPaint textPaint = this.f36131a;
            if (z9) {
                canvas.drawText(this.f36132b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f36132b.draw(canvas);
            }
            if (this.f36137i) {
                if (this.f36141m == null || textPaint.getColor() != this.f36142n) {
                    int color = textPaint.getColor();
                    this.f36142n = color;
                    this.f36141m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                q5.drawAnimatedEmojis(canvas, this.f36132b, this.f36139k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f36141m);
            }
            canvas.restore();
            float f11 = this.f36144p;
            if (f11 >= 0.0f && this.f36133c > f11) {
                if (this.f36145q == null) {
                    this.f36145q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f36146r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f36147s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f36147s.setShader(this.f36145q);
                }
                canvas.save();
                this.f36146r.reset();
                this.f36146r.postTranslate(this.f36144p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f36145q.setLocalMatrix(this.f36146r);
                canvas.drawRect(this.f36144p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f36144p, this.f36132b.getHeight(), this.f36147s);
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
        if (this.f36132b == null) {
            return;
        }
        canvas.save();
        if (this.f36135f > 1) {
            height = 0.0f;
        } else {
            height = this.f36132b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f36131a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f36133c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f36131a.getFontMetricsInt();
    }

    public final float i() {
        return this.f36132b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f36132b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f36132b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f36144p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f36133c);
        }
        return this.f36133c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f36132b.getText());
        }
    }

    public final void m(int i7) {
        this.f36135f = i7;
        q(this.f36132b.getText());
    }

    public final void n(int i7) {
        this.f36131a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f36140l != i7) {
            this.f36140l = i7;
            if (this.f36137i) {
                q5.release(this.f36138j, this.f36139k);
                this.f36139k = q5.update(this.f36140l, this.f36138j, this.f36139k, this.f36132b);
            }
        }
    }

    public final void p(float f10) {
        this.f36134e = f10;
        q(this.f36132b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f36135f > 1) {
            this.f36132b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f36131a, (int) Math.max(this.f36134e, 1.0f)).setAlignment(this.f36136g).setMaxLines(this.f36135f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f36132b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f36131a, (int) Math.max(this.f36134e, 1.0f), this.f36136g, 1.0f, this.h, false);
        }
        if (this.f36136g == Layout.Alignment.ALIGN_CENTER) {
            this.f36133c = this.f36132b.getWidth();
            this.d = 0.0f;
        } else {
            this.f36133c = 0.0f;
            this.d = this.f36132b.getWidth();
            for (int i7 = 0; i7 < this.f36132b.getLineCount(); i7++) {
                this.f36133c = Math.max(this.f36133c, this.f36132b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f36132b.getLineLeft(i7));
            }
        }
        View view = this.f36138j;
        if (view != null && view.isAttachedToWindow()) {
            this.f36139k = q5.update(this.f36140l, this.f36138j, this.f36139k, this.f36132b);
        }
    }

    public final void r(View view) {
        this.f36137i = true;
        this.f36138j = view;
        if (view.isAttachedToWindow()) {
            this.f36139k = q5.update(this.f36140l, view, this.f36139k, this.f36132b);
        }
        view.addOnAttachStateChangeListener(new z9(1, this, view));
    }

    public my0(String str, float f10) {
        this(str, f10, null);
    }

    public my0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f36134e = 9999.0f;
        this.f36135f = 1;
        this.f36136g = Layout.Alignment.ALIGN_NORMAL;
        this.f36140l = 0;
        this.f36144p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f36131a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
