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
public final class n11 {
    public final TextPaint f28900a;
    public StaticLayout f28901b;
    public float f28902c;
    public float d;
    public float f28903e;
    public int f28904f;
    public Layout.Alignment f28905g;
    public float h;
    public boolean f28906i;
    public View f28907j;
    public x5 f28908k;
    public int f28909l;
    public PorterDuffColorFilter f28910m;
    public int f28911n;
    public boolean f28912o;
    public float f28913p;
    public LinearGradient f28914q;
    public Matrix f28915r;
    public Paint f28916s;
    public int f28917t;

    public n11(CharSequence charSequence, TextPaint textPaint) {
        this.f28903e = 9999.0f;
        this.f28904f = 1;
        this.f28905g = Layout.Alignment.ALIGN_NORMAL;
        this.f28909l = 0;
        this.f28913p = -1.0f;
        this.f28900a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28905g != alignment) {
            this.f28905g = alignment;
            r(this.f28901b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28901b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28901b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28901b == null) {
            return;
        }
        TextPaint textPaint = this.f28900a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28904f > 1) {
            height = 0.0f;
        } else {
            height = this.f28901b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28901b;
        if (staticLayout != null) {
            float f7 = this.f28913p;
            if (f7 >= 0.0f && this.f28902c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28917t, f7 - 1.0f, staticLayout.getHeight() + this.f28917t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28912o;
            TextPaint textPaint = this.f28900a;
            if (z10) {
                canvas.drawText(this.f28901b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28901b.draw(canvas);
            }
            if (this.f28906i) {
                if (this.f28910m == null || textPaint.getColor() != this.f28911n) {
                    int color = textPaint.getColor();
                    this.f28911n = color;
                    this.f28910m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f28901b, this.f28908k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28910m);
            }
            canvas.restore();
            float f10 = this.f28913p;
            if (f10 >= 0.0f && this.f28902c > f10) {
                if (this.f28914q == null) {
                    this.f28914q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28915r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28916s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28916s.setShader(this.f28914q);
                }
                canvas.save();
                this.f28915r.reset();
                this.f28915r.postTranslate(this.f28913p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28914q.setLocalMatrix(this.f28915r);
                canvas.drawRect(this.f28913p - AndroidUtilities.dp(8.0f), 0.0f, this.f28913p, this.f28901b.getHeight(), this.f28916s);
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
        if (this.f28901b == null) {
            return;
        }
        canvas.save();
        if (this.f28904f > 1) {
            height = 0.0f;
        } else {
            height = this.f28901b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28900a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28913p = f7;
    }

    public final float h() {
        return this.f28902c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28900a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28901b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28901b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28901b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28913p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28902c);
        }
        return this.f28902c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28901b.getText());
        }
    }

    public final void n(int i10) {
        this.f28904f = i10;
        r(this.f28901b.getText());
    }

    public final void o(int i10) {
        this.f28900a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28909l != i10) {
            this.f28909l = i10;
            if (this.f28906i) {
                b6.release(this.f28907j, this.f28908k);
                this.f28908k = b6.update(this.f28909l, this.f28907j, this.f28908k, this.f28901b);
            }
        }
    }

    public final void q(float f7) {
        this.f28903e = f7;
        r(this.f28901b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28904f > 1) {
            this.f28901b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28900a, (int) Math.max(this.f28903e, 1.0f)).setAlignment(this.f28905g).setMaxLines(this.f28904f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28901b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28900a, (int) Math.max(this.f28903e, 1.0f), this.f28905g, 1.0f, this.h, false);
        }
        if (this.f28905g == Layout.Alignment.ALIGN_CENTER) {
            this.f28902c = this.f28901b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28902c = 0.0f;
            this.d = this.f28901b.getWidth();
            for (int i10 = 0; i10 < this.f28901b.getLineCount(); i10++) {
                this.f28902c = Math.max(this.f28902c, this.f28901b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28901b.getLineLeft(i10));
            }
        }
        View view = this.f28907j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28908k = b6.update(this.f28909l, this.f28907j, this.f28908k, this.f28901b);
        }
    }

    public final void s(View view) {
        this.f28906i = true;
        this.f28907j = view;
        if (view.isAttachedToWindow()) {
            this.f28908k = b6.update(this.f28909l, view, this.f28908k, this.f28901b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public n11(String str, float f7) {
        this(str, f7, null);
    }

    public n11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f28903e = 9999.0f;
        this.f28904f = 1;
        this.f28905g = Layout.Alignment.ALIGN_NORMAL;
        this.f28909l = 0;
        this.f28913p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28900a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
