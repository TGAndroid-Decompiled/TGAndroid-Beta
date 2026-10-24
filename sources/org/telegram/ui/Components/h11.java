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
public final class h11 {
    public final TextPaint f26841a;
    public StaticLayout f26842b;
    public float f26843c;
    public float d;
    public float e;
    public int f26844f;
    public Layout.Alignment f26845g;
    public float h;
    public boolean f26846i;
    public View f26847j;
    public u5 f26848k;
    public int f26849l;
    public PorterDuffColorFilter f26850m;
    public int f26851n;
    public boolean f26852o;
    public float f26853p;
    public LinearGradient f26854q;
    public Matrix f26855r;
    public Paint f26856s;
    public int f26857t;

    public h11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26844f = 1;
        this.f26845g = Layout.Alignment.ALIGN_NORMAL;
        this.f26849l = 0;
        this.f26853p = -1.0f;
        this.f26841a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26845g != alignment) {
            this.f26845g = alignment;
            r(this.f26842b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f26842b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f26842b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f26842b == null) {
            return;
        }
        TextPaint textPaint = this.f26841a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f26844f > 1) {
            height = 0.0f;
        } else {
            height = this.f26842b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26842b;
        if (staticLayout != null) {
            float f7 = this.f26853p;
            if (f7 >= 0.0f && this.f26843c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f26857t, f7 - 1.0f, staticLayout.getHeight() + this.f26857t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f26852o;
            TextPaint textPaint = this.f26841a;
            if (z10) {
                canvas.drawText(this.f26842b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26842b.draw(canvas);
            }
            if (this.f26846i) {
                if (this.f26850m == null || textPaint.getColor() != this.f26851n) {
                    int color = textPaint.getColor();
                    this.f26851n = color;
                    this.f26850m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f26842b, this.f26848k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26850m);
            }
            canvas.restore();
            float f10 = this.f26853p;
            if (f10 >= 0.0f && this.f26843c > f10) {
                if (this.f26854q == null) {
                    this.f26854q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26855r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26856s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26856s.setShader(this.f26854q);
                }
                canvas.save();
                this.f26855r.reset();
                this.f26855r.postTranslate(this.f26853p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26854q.setLocalMatrix(this.f26855r);
                canvas.drawRect(this.f26853p - AndroidUtilities.dp(8.0f), 0.0f, this.f26853p, this.f26842b.getHeight(), this.f26856s);
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
        if (this.f26842b == null) {
            return;
        }
        canvas.save();
        if (this.f26844f > 1) {
            height = 0.0f;
        } else {
            height = this.f26842b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f26841a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f26853p = f7;
    }

    public final float h() {
        return this.f26843c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26841a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26842b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26842b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26842b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f26853p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f26843c);
        }
        return this.f26843c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f26842b.getText());
        }
    }

    public final void n(int i10) {
        this.f26844f = i10;
        r(this.f26842b.getText());
    }

    public final void o(int i10) {
        this.f26841a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26849l != i10) {
            this.f26849l = i10;
            if (this.f26846i) {
                y5.release(this.f26847j, this.f26848k);
                this.f26848k = y5.update(this.f26849l, this.f26847j, this.f26848k, this.f26842b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f26842b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26844f > 1) {
            this.f26842b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26841a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26845g).setMaxLines(this.f26844f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26842b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26841a, (int) Math.max(this.e, 1.0f), this.f26845g, 1.0f, this.h, false);
        }
        if (this.f26845g == Layout.Alignment.ALIGN_CENTER) {
            this.f26843c = this.f26842b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26843c = 0.0f;
            this.d = this.f26842b.getWidth();
            for (int i10 = 0; i10 < this.f26842b.getLineCount(); i10++) {
                this.f26843c = Math.max(this.f26843c, this.f26842b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26842b.getLineLeft(i10));
            }
        }
        View view = this.f26847j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26848k = y5.update(this.f26849l, this.f26847j, this.f26848k, this.f26842b);
        }
    }

    public final void s(View view) {
        this.f26846i = true;
        this.f26847j = view;
        if (view.isAttachedToWindow()) {
            this.f26848k = y5.update(this.f26849l, view, this.f26848k, this.f26842b);
        }
        view.addOnAttachStateChangeListener(new ja(1, this, view));
    }

    public h11(String str, float f7) {
        this(str, f7, null);
    }

    public h11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f26844f = 1;
        this.f26845g = Layout.Alignment.ALIGN_NORMAL;
        this.f26849l = 0;
        this.f26853p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26841a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
