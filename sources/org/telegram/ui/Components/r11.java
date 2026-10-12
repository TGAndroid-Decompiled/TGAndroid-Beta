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
public final class r11 {
    public final TextPaint f29987a;
    public StaticLayout f29988b;
    public float f29989c;
    public float d;
    public float f29990e;
    public int f29991f;
    public Layout.Alignment f29992g;
    public float h;
    public boolean f29993i;
    public View f29994j;
    public x5 f29995k;
    public int f29996l;
    public PorterDuffColorFilter f29997m;
    public int f29998n;
    public boolean f29999o;
    public float f30000p;
    public LinearGradient f30001q;
    public Matrix f30002r;
    public Paint f30003s;
    public int f30004t;

    public r11(CharSequence charSequence, TextPaint textPaint) {
        this.f29990e = 9999.0f;
        this.f29991f = 1;
        this.f29992g = Layout.Alignment.ALIGN_NORMAL;
        this.f29996l = 0;
        this.f30000p = -1.0f;
        this.f29987a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f29992g != alignment) {
            this.f29992g = alignment;
            r(this.f29988b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f29988b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f29988b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f29988b == null) {
            return;
        }
        TextPaint textPaint = this.f29987a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f29991f > 1) {
            height = 0.0f;
        } else {
            height = this.f29988b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f29988b;
        if (staticLayout != null) {
            float f7 = this.f30000p;
            if (f7 >= 0.0f && this.f29989c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f30004t, f7 - 1.0f, staticLayout.getHeight() + this.f30004t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f29999o;
            TextPaint textPaint = this.f29987a;
            if (z10) {
                canvas.drawText(this.f29988b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f29988b.draw(canvas);
            }
            if (this.f29993i) {
                if (this.f29997m == null || textPaint.getColor() != this.f29998n) {
                    int color = textPaint.getColor();
                    this.f29998n = color;
                    this.f29997m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f29988b, this.f29995k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f29997m);
            }
            canvas.restore();
            float f10 = this.f30000p;
            if (f10 >= 0.0f && this.f29989c > f10) {
                if (this.f30001q == null) {
                    this.f30001q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f30002r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f30003s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f30003s.setShader(this.f30001q);
                }
                canvas.save();
                this.f30002r.reset();
                this.f30002r.postTranslate(this.f30000p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f30001q.setLocalMatrix(this.f30002r);
                canvas.drawRect(this.f30000p - AndroidUtilities.dp(8.0f), 0.0f, this.f30000p, this.f29988b.getHeight(), this.f30003s);
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
        if (this.f29988b == null) {
            return;
        }
        canvas.save();
        if (this.f29991f > 1) {
            height = 0.0f;
        } else {
            height = this.f29988b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f29987a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f30000p = f7;
    }

    public final float h() {
        return this.f29989c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f29987a.getFontMetricsInt();
    }

    public final float j() {
        return this.f29988b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f29988b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f29988b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f30000p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f29989c);
        }
        return this.f29989c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f29988b.getText());
        }
    }

    public final void n(int i10) {
        this.f29991f = i10;
        r(this.f29988b.getText());
    }

    public final void o(int i10) {
        this.f29987a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f29996l != i10) {
            this.f29996l = i10;
            if (this.f29993i) {
                b6.release(this.f29994j, this.f29995k);
                this.f29995k = b6.update(this.f29996l, this.f29994j, this.f29995k, this.f29988b);
            }
        }
    }

    public final void q(float f7) {
        this.f29990e = f7;
        r(this.f29988b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f29991f > 1) {
            this.f29988b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29987a, (int) Math.max(this.f29990e, 1.0f)).setAlignment(this.f29992g).setMaxLines(this.f29991f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f29988b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f29987a, (int) Math.max(this.f29990e, 1.0f), this.f29992g, 1.0f, this.h, false);
        }
        if (this.f29992g == Layout.Alignment.ALIGN_CENTER) {
            this.f29989c = this.f29988b.getWidth();
            this.d = 0.0f;
        } else {
            this.f29989c = 0.0f;
            this.d = this.f29988b.getWidth();
            for (int i10 = 0; i10 < this.f29988b.getLineCount(); i10++) {
                this.f29989c = Math.max(this.f29989c, this.f29988b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f29988b.getLineLeft(i10));
            }
        }
        View view = this.f29994j;
        if (view != null && view.isAttachedToWindow()) {
            this.f29995k = b6.update(this.f29996l, this.f29994j, this.f29995k, this.f29988b);
        }
    }

    public final void s(View view) {
        this.f29993i = true;
        this.f29994j = view;
        if (view.isAttachedToWindow()) {
            this.f29995k = b6.update(this.f29996l, view, this.f29995k, this.f29988b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public r11(String str, float f7) {
        this(str, f7, null);
    }

    public r11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f29990e = 9999.0f;
        this.f29991f = 1;
        this.f29992g = Layout.Alignment.ALIGN_NORMAL;
        this.f29996l = 0;
        this.f30000p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29987a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
