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
public final class k01 {
    public final TextPaint f26122a;
    public StaticLayout f26123b;
    public float f26124c;
    public float d;
    public float e;
    public int f26125f;
    public Layout.Alignment f26126g;
    public float h;
    public boolean f26127i;
    public View f26128j;
    public q5 f26129k;
    public int f26130l;
    public PorterDuffColorFilter f26131m;
    public int f26132n;
    public boolean f26133o;
    public float f26134p;
    public LinearGradient f26135q;
    public Matrix f26136r;
    public Paint f26137s;
    public int f26138t;

    public k01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26125f = 1;
        this.f26126g = Layout.Alignment.ALIGN_NORMAL;
        this.f26130l = 0;
        this.f26134p = -1.0f;
        this.f26122a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26126g != alignment) {
            this.f26126g = alignment;
            r(this.f26123b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f26123b.getLineCount(); i10++) {
            f10 = Math.max(f10, this.f26123b.getLineWidth(i10));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        float height;
        if (this.f26123b == null) {
            return;
        }
        TextPaint textPaint = this.f26122a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f26125f > 1) {
            height = 0.0f;
        } else {
            height = this.f26123b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26123b;
        if (staticLayout != null) {
            float f10 = this.f26134p;
            if (f10 >= 0.0f && this.f26124c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f26138t, f10 - 1.0f, staticLayout.getHeight() + this.f26138t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z4 = this.f26133o;
            TextPaint textPaint = this.f26122a;
            if (z4) {
                canvas.drawText(this.f26123b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26123b.draw(canvas);
            }
            if (this.f26127i) {
                if (this.f26131m == null || textPaint.getColor() != this.f26132n) {
                    int color = textPaint.getColor();
                    this.f26132n = color;
                    this.f26131m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                u5.drawAnimatedEmojis(canvas, this.f26123b, this.f26129k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26131m);
            }
            canvas.restore();
            float f11 = this.f26134p;
            if (f11 >= 0.0f && this.f26124c > f11) {
                if (this.f26135q == null) {
                    this.f26135q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26136r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26137s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26137s.setShader(this.f26135q);
                }
                canvas.save();
                this.f26136r.reset();
                this.f26136r.postTranslate(this.f26134p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26135q.setLocalMatrix(this.f26136r);
                canvas.drawRect(this.f26134p - AndroidUtilities.dp(8.0f), 0.0f, this.f26134p, this.f26123b.getHeight(), this.f26137s);
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
        if (this.f26123b == null) {
            return;
        }
        canvas.save();
        if (this.f26125f > 1) {
            height = 0.0f;
        } else {
            height = this.f26123b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f26122a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f26134p = f10;
    }

    public final float h() {
        return this.f26124c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26122a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26123b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26123b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26123b.getText();
        }
        return "";
    }

    public final float l() {
        float f10 = this.f26134p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f26124c);
        }
        return this.f26124c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f26123b.getText());
        }
    }

    public final void n(int i10) {
        this.f26125f = i10;
        r(this.f26123b.getText());
    }

    public final void o(int i10) {
        this.f26122a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26130l != i10) {
            this.f26130l = i10;
            if (this.f26127i) {
                u5.release(this.f26128j, this.f26129k);
                this.f26129k = u5.update(this.f26130l, this.f26128j, this.f26129k, this.f26123b);
            }
        }
    }

    public final void q(float f10) {
        this.e = f10;
        r(this.f26123b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26125f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f26123b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26122a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26126g).setMaxLines(this.f26125f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26123b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26122a, (int) Math.max(this.e, 1.0f), this.f26126g, 1.0f, this.h, false);
        }
        if (this.f26126g == Layout.Alignment.ALIGN_CENTER) {
            this.f26124c = this.f26123b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26124c = 0.0f;
            this.d = this.f26123b.getWidth();
            for (int i10 = 0; i10 < this.f26123b.getLineCount(); i10++) {
                this.f26124c = Math.max(this.f26124c, this.f26123b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26123b.getLineLeft(i10));
            }
        }
        View view = this.f26128j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26129k = u5.update(this.f26130l, this.f26128j, this.f26129k, this.f26123b);
        }
    }

    public final void s(View view) {
        this.f26127i = true;
        this.f26128j = view;
        if (view.isAttachedToWindow()) {
            this.f26129k = u5.update(this.f26130l, view, this.f26129k, this.f26123b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public k01(String str, float f10) {
        this(str, f10, null);
    }

    public k01(CharSequence charSequence, float f10, Typeface typeface) {
        this.e = 9999.0f;
        this.f26125f = 1;
        this.f26126g = Layout.Alignment.ALIGN_NORMAL;
        this.f26130l = 0;
        this.f26134p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26122a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
