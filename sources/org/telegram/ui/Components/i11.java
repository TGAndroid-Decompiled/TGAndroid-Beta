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
public final class i11 {
    public final TextPaint f27162a;
    public StaticLayout f27163b;
    public float f27164c;
    public float d;
    public float e;
    public int f27165f;
    public Layout.Alignment f27166g;
    public float h;
    public boolean f27167i;
    public View f27168j;
    public w5 f27169k;
    public int f27170l;
    public PorterDuffColorFilter f27171m;
    public int f27172n;
    public boolean f27173o;
    public float f27174p;
    public LinearGradient f27175q;
    public Matrix f27176r;
    public Paint f27177s;
    public int f27178t;

    public i11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f27165f = 1;
        this.f27166g = Layout.Alignment.ALIGN_NORMAL;
        this.f27170l = 0;
        this.f27174p = -1.0f;
        this.f27162a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f27166g != alignment) {
            this.f27166g = alignment;
            r(this.f27163b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f27163b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f27163b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f27163b == null) {
            return;
        }
        TextPaint textPaint = this.f27162a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f27165f > 1) {
            height = 0.0f;
        } else {
            height = this.f27163b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f27163b;
        if (staticLayout != null) {
            float f7 = this.f27174p;
            if (f7 >= 0.0f && this.f27164c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f27178t, f7 - 1.0f, staticLayout.getHeight() + this.f27178t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f27173o;
            TextPaint textPaint = this.f27162a;
            if (z10) {
                canvas.drawText(this.f27163b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f27163b.draw(canvas);
            }
            if (this.f27167i) {
                if (this.f27171m == null || textPaint.getColor() != this.f27172n) {
                    int color = textPaint.getColor();
                    this.f27172n = color;
                    this.f27171m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f27163b, this.f27169k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f27171m);
            }
            canvas.restore();
            float f10 = this.f27174p;
            if (f10 >= 0.0f && this.f27164c > f10) {
                if (this.f27175q == null) {
                    this.f27175q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f27176r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f27177s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f27177s.setShader(this.f27175q);
                }
                canvas.save();
                this.f27176r.reset();
                this.f27176r.postTranslate(this.f27174p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f27175q.setLocalMatrix(this.f27176r);
                canvas.drawRect(this.f27174p - AndroidUtilities.dp(8.0f), 0.0f, this.f27174p, this.f27163b.getHeight(), this.f27177s);
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
        if (this.f27163b == null) {
            return;
        }
        canvas.save();
        if (this.f27165f > 1) {
            height = 0.0f;
        } else {
            height = this.f27163b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f27162a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f27174p = f7;
    }

    public final float h() {
        return this.f27164c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f27162a.getFontMetricsInt();
    }

    public final float j() {
        return this.f27163b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f27163b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f27163b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f27174p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f27164c);
        }
        return this.f27164c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f27163b.getText());
        }
    }

    public final void n(int i10) {
        this.f27165f = i10;
        r(this.f27163b.getText());
    }

    public final void o(int i10) {
        this.f27162a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f27170l != i10) {
            this.f27170l = i10;
            if (this.f27167i) {
                a6.release(this.f27168j, this.f27169k);
                this.f27169k = a6.update(this.f27170l, this.f27168j, this.f27169k, this.f27163b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f27163b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f27165f > 1) {
            this.f27163b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f27162a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f27166g).setMaxLines(this.f27165f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f27163b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f27162a, (int) Math.max(this.e, 1.0f), this.f27166g, 1.0f, this.h, false);
        }
        if (this.f27166g == Layout.Alignment.ALIGN_CENTER) {
            this.f27164c = this.f27163b.getWidth();
            this.d = 0.0f;
        } else {
            this.f27164c = 0.0f;
            this.d = this.f27163b.getWidth();
            for (int i10 = 0; i10 < this.f27163b.getLineCount(); i10++) {
                this.f27164c = Math.max(this.f27164c, this.f27163b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f27163b.getLineLeft(i10));
            }
        }
        View view = this.f27168j;
        if (view != null && view.isAttachedToWindow()) {
            this.f27169k = a6.update(this.f27170l, this.f27168j, this.f27169k, this.f27163b);
        }
    }

    public final void s(View view) {
        this.f27167i = true;
        this.f27168j = view;
        if (view.isAttachedToWindow()) {
            this.f27169k = a6.update(this.f27170l, view, this.f27169k, this.f27163b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public i11(String str, float f7) {
        this(str, f7, null);
    }

    public i11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f27165f = 1;
        this.f27166g = Layout.Alignment.ALIGN_NORMAL;
        this.f27170l = 0;
        this.f27174p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f27162a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
