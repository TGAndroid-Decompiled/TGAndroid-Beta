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
    public final TextPaint f29986a;
    public StaticLayout f29987b;
    public float f29988c;
    public float d;
    public float f29989e;
    public int f29990f;
    public Layout.Alignment f29991g;
    public float h;
    public boolean f29992i;
    public View f29993j;
    public x5 f29994k;
    public int f29995l;
    public PorterDuffColorFilter f29996m;
    public int f29997n;
    public boolean f29998o;
    public float f29999p;
    public LinearGradient f30000q;
    public Matrix f30001r;
    public Paint f30002s;
    public int f30003t;

    public r11(CharSequence charSequence, TextPaint textPaint) {
        this.f29989e = 9999.0f;
        this.f29990f = 1;
        this.f29991g = Layout.Alignment.ALIGN_NORMAL;
        this.f29995l = 0;
        this.f29999p = -1.0f;
        this.f29986a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f29991g != alignment) {
            this.f29991g = alignment;
            r(this.f29987b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f29987b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f29987b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f29987b == null) {
            return;
        }
        TextPaint textPaint = this.f29986a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f29990f > 1) {
            height = 0.0f;
        } else {
            height = this.f29987b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f29987b;
        if (staticLayout != null) {
            float f7 = this.f29999p;
            if (f7 >= 0.0f && this.f29988c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f30003t, f7 - 1.0f, staticLayout.getHeight() + this.f30003t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f29998o;
            TextPaint textPaint = this.f29986a;
            if (z10) {
                canvas.drawText(this.f29987b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f29987b.draw(canvas);
            }
            if (this.f29992i) {
                if (this.f29996m == null || textPaint.getColor() != this.f29997n) {
                    int color = textPaint.getColor();
                    this.f29997n = color;
                    this.f29996m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f29987b, this.f29994k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f29996m);
            }
            canvas.restore();
            float f10 = this.f29999p;
            if (f10 >= 0.0f && this.f29988c > f10) {
                if (this.f30000q == null) {
                    this.f30000q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f30001r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f30002s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f30002s.setShader(this.f30000q);
                }
                canvas.save();
                this.f30001r.reset();
                this.f30001r.postTranslate(this.f29999p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f30000q.setLocalMatrix(this.f30001r);
                canvas.drawRect(this.f29999p - AndroidUtilities.dp(8.0f), 0.0f, this.f29999p, this.f29987b.getHeight(), this.f30002s);
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
        if (this.f29987b == null) {
            return;
        }
        canvas.save();
        if (this.f29990f > 1) {
            height = 0.0f;
        } else {
            height = this.f29987b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f29986a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f29999p = f7;
    }

    public final float h() {
        return this.f29988c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f29986a.getFontMetricsInt();
    }

    public final float j() {
        return this.f29987b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f29987b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f29987b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f29999p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f29988c);
        }
        return this.f29988c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f29987b.getText());
        }
    }

    public final void n(int i10) {
        this.f29990f = i10;
        r(this.f29987b.getText());
    }

    public final void o(int i10) {
        this.f29986a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f29995l != i10) {
            this.f29995l = i10;
            if (this.f29992i) {
                b6.release(this.f29993j, this.f29994k);
                this.f29994k = b6.update(this.f29995l, this.f29993j, this.f29994k, this.f29987b);
            }
        }
    }

    public final void q(float f7) {
        this.f29989e = f7;
        r(this.f29987b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f29990f > 1) {
            this.f29987b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f29986a, (int) Math.max(this.f29989e, 1.0f)).setAlignment(this.f29991g).setMaxLines(this.f29990f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f29987b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f29986a, (int) Math.max(this.f29989e, 1.0f), this.f29991g, 1.0f, this.h, false);
        }
        if (this.f29991g == Layout.Alignment.ALIGN_CENTER) {
            this.f29988c = this.f29987b.getWidth();
            this.d = 0.0f;
        } else {
            this.f29988c = 0.0f;
            this.d = this.f29987b.getWidth();
            for (int i10 = 0; i10 < this.f29987b.getLineCount(); i10++) {
                this.f29988c = Math.max(this.f29988c, this.f29987b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f29987b.getLineLeft(i10));
            }
        }
        View view = this.f29993j;
        if (view != null && view.isAttachedToWindow()) {
            this.f29994k = b6.update(this.f29995l, this.f29993j, this.f29994k, this.f29987b);
        }
    }

    public final void s(View view) {
        this.f29992i = true;
        this.f29993j = view;
        if (view.isAttachedToWindow()) {
            this.f29994k = b6.update(this.f29995l, view, this.f29994k, this.f29987b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public r11(String str, float f7) {
        this(str, f7, null);
    }

    public r11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f29989e = 9999.0f;
        this.f29990f = 1;
        this.f29991g = Layout.Alignment.ALIGN_NORMAL;
        this.f29995l = 0;
        this.f29999p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f29986a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
