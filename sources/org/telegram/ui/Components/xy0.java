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
public final class xy0 {
    public final TextPaint f42252a;
    public StaticLayout f42253b;
    public float f42254c;
    public float d;
    public float f42255e;
    public int f42256f;
    public Layout.Alignment f42257g;
    public float h;
    public boolean f42258i;
    public View f42259j;
    public u5 f42260k;
    public int f42261l;
    public PorterDuffColorFilter f42262m;
    public int f42263n;
    public boolean f42264o;
    public float f42265p;
    public LinearGradient f42266q;
    public Matrix f42267r;
    public Paint f42268s;
    public int f42269t;

    public xy0(CharSequence charSequence, TextPaint textPaint) {
        this.f42255e = 9999.0f;
        this.f42256f = 1;
        this.f42257g = Layout.Alignment.ALIGN_NORMAL;
        this.f42261l = 0;
        this.f42265p = -1.0f;
        this.f42252a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f42257g != alignment) {
            this.f42257g = alignment;
            q(this.f42253b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f42253b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f42253b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f42253b == null) {
            return;
        }
        TextPaint textPaint = this.f42252a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f42256f > 1) {
            height = 0.0f;
        } else {
            height = this.f42253b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f42253b;
        if (staticLayout != null) {
            float f10 = this.f42265p;
            if (f10 >= 0.0f && this.f42254c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f42269t, f10 - 1.0f, staticLayout.getHeight() + this.f42269t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f42264o;
            TextPaint textPaint = this.f42252a;
            if (z10) {
                canvas.drawText(this.f42253b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f42253b.draw(canvas);
            }
            if (this.f42258i) {
                if (this.f42262m == null || textPaint.getColor() != this.f42263n) {
                    int color = textPaint.getColor();
                    this.f42263n = color;
                    this.f42262m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f42253b, this.f42260k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f42262m);
            }
            canvas.restore();
            float f11 = this.f42265p;
            if (f11 >= 0.0f && this.f42254c > f11) {
                if (this.f42266q == null) {
                    this.f42266q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f42267r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f42268s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f42268s.setShader(this.f42266q);
                }
                canvas.save();
                this.f42267r.reset();
                this.f42267r.postTranslate(this.f42265p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f42266q.setLocalMatrix(this.f42267r);
                canvas.drawRect(this.f42265p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f42265p, this.f42253b.getHeight(), this.f42268s);
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
        if (this.f42253b == null) {
            return;
        }
        canvas.save();
        if (this.f42256f > 1) {
            height = 0.0f;
        } else {
            height = this.f42253b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f42252a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f42254c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f42252a.getFontMetricsInt();
    }

    public final float i() {
        return this.f42253b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f42253b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f42253b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f42265p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f42254c);
        }
        return this.f42254c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f42253b.getText());
        }
    }

    public final void m(int i7) {
        this.f42256f = i7;
        q(this.f42253b.getText());
    }

    public final void n(int i7) {
        this.f42252a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f42261l != i7) {
            this.f42261l = i7;
            if (this.f42258i) {
                y5.release(this.f42259j, this.f42260k);
                this.f42260k = y5.update(this.f42261l, this.f42259j, this.f42260k, this.f42253b);
            }
        }
    }

    public final void p(float f10) {
        this.f42255e = f10;
        q(this.f42253b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f42256f > 1) {
            this.f42253b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f42252a, (int) Math.max(this.f42255e, 1.0f)).setAlignment(this.f42257g).setMaxLines(this.f42256f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f42253b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f42252a, (int) Math.max(this.f42255e, 1.0f), this.f42257g, 1.0f, this.h, false);
        }
        if (this.f42257g == Layout.Alignment.ALIGN_CENTER) {
            this.f42254c = this.f42253b.getWidth();
            this.d = 0.0f;
        } else {
            this.f42254c = 0.0f;
            this.d = this.f42253b.getWidth();
            for (int i7 = 0; i7 < this.f42253b.getLineCount(); i7++) {
                this.f42254c = Math.max(this.f42254c, this.f42253b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f42253b.getLineLeft(i7));
            }
        }
        View view = this.f42259j;
        if (view != null && view.isAttachedToWindow()) {
            this.f42260k = y5.update(this.f42261l, this.f42259j, this.f42260k, this.f42253b);
        }
    }

    public final void r(View view) {
        this.f42258i = true;
        this.f42259j = view;
        if (view.isAttachedToWindow()) {
            this.f42260k = y5.update(this.f42261l, view, this.f42260k, this.f42253b);
        }
        view.addOnAttachStateChangeListener(new ea(1, this, view));
    }

    public xy0(String str, float f10) {
        this(str, f10, null);
    }

    public xy0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f42255e = 9999.0f;
        this.f42256f = 1;
        this.f42257g = Layout.Alignment.ALIGN_NORMAL;
        this.f42261l = 0;
        this.f42265p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f42252a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
