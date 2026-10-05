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
public final class f11 {
    public final TextPaint f26264a;
    public StaticLayout f26265b;
    public float f26266c;
    public float d;
    public float f26267e;
    public int f26268f;
    public Layout.Alignment f26269g;
    public float h;
    public boolean f26270i;
    public View f26271j;
    public v5 f26272k;
    public int f26273l;
    public PorterDuffColorFilter f26274m;
    public int f26275n;
    public boolean f26276o;
    public float f26277p;
    public LinearGradient f26278q;
    public Matrix f26279r;
    public Paint f26280s;
    public int f26281t;

    public f11(CharSequence charSequence, TextPaint textPaint) {
        this.f26267e = 9999.0f;
        this.f26268f = 1;
        this.f26269g = Layout.Alignment.ALIGN_NORMAL;
        this.f26273l = 0;
        this.f26277p = -1.0f;
        this.f26264a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26269g != alignment) {
            this.f26269g = alignment;
            r(this.f26265b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f26265b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f26265b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f26265b == null) {
            return;
        }
        TextPaint textPaint = this.f26264a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f26268f > 1) {
            height = 0.0f;
        } else {
            height = this.f26265b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26265b;
        if (staticLayout != null) {
            float f7 = this.f26277p;
            if (f7 >= 0.0f && this.f26266c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f26281t, f7 - 1.0f, staticLayout.getHeight() + this.f26281t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f26276o;
            TextPaint textPaint = this.f26264a;
            if (z10) {
                canvas.drawText(this.f26265b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26265b.draw(canvas);
            }
            if (this.f26270i) {
                if (this.f26274m == null || textPaint.getColor() != this.f26275n) {
                    int color = textPaint.getColor();
                    this.f26275n = color;
                    this.f26274m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f26265b, this.f26272k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26274m);
            }
            canvas.restore();
            float f10 = this.f26277p;
            if (f10 >= 0.0f && this.f26266c > f10) {
                if (this.f26278q == null) {
                    this.f26278q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26279r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26280s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26280s.setShader(this.f26278q);
                }
                canvas.save();
                this.f26279r.reset();
                this.f26279r.postTranslate(this.f26277p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26278q.setLocalMatrix(this.f26279r);
                canvas.drawRect(this.f26277p - AndroidUtilities.dp(8.0f), 0.0f, this.f26277p, this.f26265b.getHeight(), this.f26280s);
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
        if (this.f26265b == null) {
            return;
        }
        canvas.save();
        if (this.f26268f > 1) {
            height = 0.0f;
        } else {
            height = this.f26265b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f26264a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f26277p = f7;
    }

    public final float h() {
        return this.f26266c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26264a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26265b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26265b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26265b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f26277p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f26266c);
        }
        return this.f26266c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f26265b.getText());
        }
    }

    public final void n(int i10) {
        this.f26268f = i10;
        r(this.f26265b.getText());
    }

    public final void o(int i10) {
        this.f26264a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26273l != i10) {
            this.f26273l = i10;
            if (this.f26270i) {
                z5.release(this.f26271j, this.f26272k);
                this.f26272k = z5.update(this.f26273l, this.f26271j, this.f26272k, this.f26265b);
            }
        }
    }

    public final void q(float f7) {
        this.f26267e = f7;
        r(this.f26265b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26268f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f26265b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26264a, (int) Math.max(this.f26267e, 1.0f)).setAlignment(this.f26269g).setMaxLines(this.f26268f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26265b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26264a, (int) Math.max(this.f26267e, 1.0f), this.f26269g, 1.0f, this.h, false);
        }
        if (this.f26269g == Layout.Alignment.ALIGN_CENTER) {
            this.f26266c = this.f26265b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26266c = 0.0f;
            this.d = this.f26265b.getWidth();
            for (int i10 = 0; i10 < this.f26265b.getLineCount(); i10++) {
                this.f26266c = Math.max(this.f26266c, this.f26265b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26265b.getLineLeft(i10));
            }
        }
        View view = this.f26271j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26272k = z5.update(this.f26273l, this.f26271j, this.f26272k, this.f26265b);
        }
    }

    public final void s(View view) {
        this.f26270i = true;
        this.f26271j = view;
        if (view.isAttachedToWindow()) {
            this.f26272k = z5.update(this.f26273l, view, this.f26272k, this.f26265b);
        }
        view.addOnAttachStateChangeListener(new ma(1, this, view));
    }

    public f11(String str, float f7) {
        this(str, f7, null);
    }

    public f11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f26267e = 9999.0f;
        this.f26268f = 1;
        this.f26269g = Layout.Alignment.ALIGN_NORMAL;
        this.f26273l = 0;
        this.f26277p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26264a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
