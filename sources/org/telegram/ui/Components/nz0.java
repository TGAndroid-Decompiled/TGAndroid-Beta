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
public final class nz0 {
    public final TextPaint f31221a;
    public StaticLayout f31222b;
    public float f31223c;
    public float d;
    public float f31224e;
    public int f31225f;
    public Layout.Alignment f31226g;
    public float h;
    public boolean f31227i;
    public View f31228j;
    public p5 f31229k;
    public int f31230l;
    public PorterDuffColorFilter f31231m;
    public int f31232n;
    public boolean f31233o;
    public float f31234p;
    public LinearGradient f31235q;
    public Matrix f31236r;
    public Paint f31237s;
    public int f31238t;

    public nz0(CharSequence charSequence, TextPaint textPaint) {
        this.f31224e = 9999.0f;
        this.f31225f = 1;
        this.f31226g = Layout.Alignment.ALIGN_NORMAL;
        this.f31230l = 0;
        this.f31234p = -1.0f;
        this.f31221a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f31226g != alignment) {
            this.f31226g = alignment;
            r(this.f31222b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i9 = 0; i9 < this.f31222b.getLineCount(); i9++) {
            f10 = Math.max(f10, this.f31222b.getLineWidth(i9));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i9, Canvas canvas) {
        float height;
        if (this.f31222b == null) {
            return;
        }
        TextPaint textPaint = this.f31221a;
        textPaint.setColor(i9);
        textPaint.linkColor = i9;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f31225f > 1) {
            height = 0.0f;
        } else {
            height = this.f31222b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f31222b;
        if (staticLayout != null) {
            float f10 = this.f31234p;
            if (f10 >= 0.0f && this.f31223c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f31238t, f10 - 1.0f, staticLayout.getHeight() + this.f31238t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f31233o;
            TextPaint textPaint = this.f31221a;
            if (z10) {
                canvas.drawText(this.f31222b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f31222b.draw(canvas);
            }
            if (this.f31227i) {
                if (this.f31231m == null || textPaint.getColor() != this.f31232n) {
                    int color = textPaint.getColor();
                    this.f31232n = color;
                    this.f31231m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                t5.drawAnimatedEmojis(canvas, this.f31222b, this.f31229k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f31231m);
            }
            canvas.restore();
            float f11 = this.f31234p;
            if (f11 >= 0.0f && this.f31223c > f11) {
                if (this.f31235q == null) {
                    this.f31235q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f31236r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f31237s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f31237s.setShader(this.f31235q);
                }
                canvas.save();
                this.f31236r.reset();
                this.f31236r.postTranslate(this.f31234p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f31235q.setLocalMatrix(this.f31236r);
                canvas.drawRect(this.f31234p - AndroidUtilities.dp(8.0f), 0.0f, this.f31234p, this.f31222b.getHeight(), this.f31237s);
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
        if (this.f31222b == null) {
            return;
        }
        canvas.save();
        if (this.f31225f > 1) {
            height = 0.0f;
        } else {
            height = this.f31222b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f31221a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f31234p = f10;
    }

    public final float h() {
        return this.f31223c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f31221a.getFontMetricsInt();
    }

    public final float j() {
        return this.f31222b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f31222b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f31222b.getText();
        }
        return "";
    }

    public final float l() {
        float f10 = this.f31234p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f31223c);
        }
        return this.f31223c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f31222b.getText());
        }
    }

    public final void n(int i9) {
        this.f31225f = i9;
        r(this.f31222b.getText());
    }

    public final void o(int i9) {
        this.f31221a.setColor(i9);
    }

    public final void p(int i9) {
        if (this.f31230l != i9) {
            this.f31230l = i9;
            if (this.f31227i) {
                t5.release(this.f31228j, this.f31229k);
                this.f31229k = t5.update(this.f31230l, this.f31228j, this.f31229k, this.f31222b);
            }
        }
    }

    public final void q(float f10) {
        this.f31224e = f10;
        r(this.f31222b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f31225f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f31222b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f31221a, (int) Math.max(this.f31224e, 1.0f)).setAlignment(this.f31226g).setMaxLines(this.f31225f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f31222b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f31221a, (int) Math.max(this.f31224e, 1.0f), this.f31226g, 1.0f, this.h, false);
        }
        if (this.f31226g == Layout.Alignment.ALIGN_CENTER) {
            this.f31223c = this.f31222b.getWidth();
            this.d = 0.0f;
        } else {
            this.f31223c = 0.0f;
            this.d = this.f31222b.getWidth();
            for (int i9 = 0; i9 < this.f31222b.getLineCount(); i9++) {
                this.f31223c = Math.max(this.f31223c, this.f31222b.getLineWidth(i9));
                this.d = Math.min(this.d, this.f31222b.getLineLeft(i9));
            }
        }
        View view = this.f31228j;
        if (view != null && view.isAttachedToWindow()) {
            this.f31229k = t5.update(this.f31230l, this.f31228j, this.f31229k, this.f31222b);
        }
    }

    public final void s(View view) {
        this.f31227i = true;
        this.f31228j = view;
        if (view.isAttachedToWindow()) {
            this.f31229k = t5.update(this.f31230l, view, this.f31229k, this.f31222b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public nz0(String str, float f10) {
        this(str, f10, null);
    }

    public nz0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f31224e = 9999.0f;
        this.f31225f = 1;
        this.f31226g = Layout.Alignment.ALIGN_NORMAL;
        this.f31230l = 0;
        this.f31234p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f31221a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
