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
    public final TextPaint f25453a;
    public StaticLayout f25454b;
    public float f25455c;
    public float d;
    public float e;
    public int f25456f;
    public Layout.Alignment f25457g;
    public float h;
    public boolean f25458i;
    public View f25459j;
    public x5 f25460k;
    public int f25461l;
    public PorterDuffColorFilter f25462m;
    public int f25463n;
    public boolean f25464o;
    public float f25465p;
    public LinearGradient f25466q;
    public Matrix f25467r;
    public Paint f25468s;
    public int f25469t;

    public i11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25456f = 1;
        this.f25457g = Layout.Alignment.ALIGN_NORMAL;
        this.f25461l = 0;
        this.f25465p = -1.0f;
        this.f25453a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25457g != alignment) {
            this.f25457g = alignment;
            r(this.f25454b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25454b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25454b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25454b == null) {
            return;
        }
        TextPaint textPaint = this.f25453a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25456f > 1) {
            height = 0.0f;
        } else {
            height = this.f25454b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25454b;
        if (staticLayout != null) {
            float f7 = this.f25465p;
            if (f7 >= 0.0f && this.f25455c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25469t, f7 - 1.0f, staticLayout.getHeight() + this.f25469t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25464o;
            TextPaint textPaint = this.f25453a;
            if (z10) {
                canvas.drawText(this.f25454b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25454b.draw(canvas);
            }
            if (this.f25458i) {
                if (this.f25462m == null || textPaint.getColor() != this.f25463n) {
                    int color = textPaint.getColor();
                    this.f25463n = color;
                    this.f25462m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f25454b, this.f25460k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25462m);
            }
            canvas.restore();
            float f10 = this.f25465p;
            if (f10 >= 0.0f && this.f25455c > f10) {
                if (this.f25466q == null) {
                    this.f25466q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25467r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25468s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25468s.setShader(this.f25466q);
                }
                canvas.save();
                this.f25467r.reset();
                this.f25467r.postTranslate(this.f25465p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25466q.setLocalMatrix(this.f25467r);
                canvas.drawRect(this.f25465p - AndroidUtilities.dp(8.0f), 0.0f, this.f25465p, this.f25454b.getHeight(), this.f25468s);
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
        if (this.f25454b == null) {
            return;
        }
        canvas.save();
        if (this.f25456f > 1) {
            height = 0.0f;
        } else {
            height = this.f25454b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25453a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25465p = f7;
    }

    public final float h() {
        return this.f25455c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25453a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25454b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25454b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25454b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25465p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25455c);
        }
        return this.f25455c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25454b.getText());
        }
    }

    public final void n(int i10) {
        this.f25456f = i10;
        r(this.f25454b.getText());
    }

    public final void o(int i10) {
        this.f25453a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25461l != i10) {
            this.f25461l = i10;
            if (this.f25458i) {
                b6.release(this.f25459j, this.f25460k);
                this.f25460k = b6.update(this.f25461l, this.f25459j, this.f25460k, this.f25454b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25454b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25456f > 1) {
            this.f25454b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25453a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25457g).setMaxLines(this.f25456f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25454b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25453a, (int) Math.max(this.e, 1.0f), this.f25457g, 1.0f, this.h, false);
        }
        if (this.f25457g == Layout.Alignment.ALIGN_CENTER) {
            this.f25455c = this.f25454b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25455c = 0.0f;
            this.d = this.f25454b.getWidth();
            for (int i10 = 0; i10 < this.f25454b.getLineCount(); i10++) {
                this.f25455c = Math.max(this.f25455c, this.f25454b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25454b.getLineLeft(i10));
            }
        }
        View view = this.f25459j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25460k = b6.update(this.f25461l, this.f25459j, this.f25460k, this.f25454b);
        }
    }

    public final void s(View view) {
        this.f25458i = true;
        this.f25459j = view;
        if (view.isAttachedToWindow()) {
            this.f25460k = b6.update(this.f25461l, view, this.f25460k, this.f25454b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public i11(String str, float f7) {
        this(str, f7, null);
    }

    public i11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25456f = 1;
        this.f25457g = Layout.Alignment.ALIGN_NORMAL;
        this.f25461l = 0;
        this.f25465p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25453a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
