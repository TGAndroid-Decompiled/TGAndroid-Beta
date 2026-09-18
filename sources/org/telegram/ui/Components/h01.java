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
public final class h01 {
    public final TextPaint f24440a;
    public StaticLayout f24441b;
    public float f24442c;
    public float d;
    public float e;
    public int f24443f;
    public Layout.Alignment f24444g;
    public float h;
    public boolean f24445i;
    public View f24446j;
    public t5 f24447k;
    public int f24448l;
    public PorterDuffColorFilter f24449m;
    public int f24450n;
    public boolean f24451o;
    public float f24452p;
    public LinearGradient f24453q;
    public Matrix f24454r;
    public Paint f24455s;
    public int f24456t;

    public h01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f24443f = 1;
        this.f24444g = Layout.Alignment.ALIGN_NORMAL;
        this.f24448l = 0;
        this.f24452p = -1.0f;
        this.f24440a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f24444g != alignment) {
            this.f24444g = alignment;
            r(this.f24441b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f24441b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f24441b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f24441b == null) {
            return;
        }
        TextPaint textPaint = this.f24440a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f24443f > 1) {
            height = 0.0f;
        } else {
            height = this.f24441b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f24441b;
        if (staticLayout != null) {
            float f7 = this.f24452p;
            if (f7 >= 0.0f && this.f24442c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f24456t, f7 - 1.0f, staticLayout.getHeight() + this.f24456t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f24451o;
            TextPaint textPaint = this.f24440a;
            if (z10) {
                canvas.drawText(this.f24441b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f24441b.draw(canvas);
            }
            if (this.f24445i) {
                if (this.f24449m == null || textPaint.getColor() != this.f24450n) {
                    int color = textPaint.getColor();
                    this.f24450n = color;
                    this.f24449m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                x5.drawAnimatedEmojis(canvas, this.f24441b, this.f24447k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f24449m);
            }
            canvas.restore();
            float f10 = this.f24452p;
            if (f10 >= 0.0f && this.f24442c > f10) {
                if (this.f24453q == null) {
                    this.f24453q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f24454r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f24455s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f24455s.setShader(this.f24453q);
                }
                canvas.save();
                this.f24454r.reset();
                this.f24454r.postTranslate(this.f24452p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f24453q.setLocalMatrix(this.f24454r);
                canvas.drawRect(this.f24452p - AndroidUtilities.dp(8.0f), 0.0f, this.f24452p, this.f24441b.getHeight(), this.f24455s);
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
        if (this.f24441b == null) {
            return;
        }
        canvas.save();
        if (this.f24443f > 1) {
            height = 0.0f;
        } else {
            height = this.f24441b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f24440a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f24452p = f7;
    }

    public final float h() {
        return this.f24442c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f24440a.getFontMetricsInt();
    }

    public final float j() {
        return this.f24441b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f24441b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f24441b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f24452p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f24442c);
        }
        return this.f24442c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f24441b.getText());
        }
    }

    public final void n(int i10) {
        this.f24443f = i10;
        r(this.f24441b.getText());
    }

    public final void o(int i10) {
        this.f24440a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f24448l != i10) {
            this.f24448l = i10;
            if (this.f24445i) {
                x5.release(this.f24446j, this.f24447k);
                this.f24447k = x5.update(this.f24448l, this.f24446j, this.f24447k, this.f24441b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f24441b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f24443f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f24441b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f24440a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f24444g).setMaxLines(this.f24443f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f24441b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f24440a, (int) Math.max(this.e, 1.0f), this.f24444g, 1.0f, this.h, false);
        }
        if (this.f24444g == Layout.Alignment.ALIGN_CENTER) {
            this.f24442c = this.f24441b.getWidth();
            this.d = 0.0f;
        } else {
            this.f24442c = 0.0f;
            this.d = this.f24441b.getWidth();
            for (int i10 = 0; i10 < this.f24441b.getLineCount(); i10++) {
                this.f24442c = Math.max(this.f24442c, this.f24441b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f24441b.getLineLeft(i10));
            }
        }
        View view = this.f24446j;
        if (view != null && view.isAttachedToWindow()) {
            this.f24447k = x5.update(this.f24448l, this.f24446j, this.f24447k, this.f24441b);
        }
    }

    public final void s(View view) {
        this.f24445i = true;
        this.f24446j = view;
        if (view.isAttachedToWindow()) {
            this.f24447k = x5.update(this.f24448l, view, this.f24447k, this.f24441b);
        }
        view.addOnAttachStateChangeListener(new ja(1, this, view));
    }

    public h01(String str, float f7) {
        this(str, f7, null);
    }

    public h01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f24443f = 1;
        this.f24444g = Layout.Alignment.ALIGN_NORMAL;
        this.f24448l = 0;
        this.f24452p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24440a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
