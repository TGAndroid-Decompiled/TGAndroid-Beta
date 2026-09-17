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
public final class f01 {
    public final TextPaint f25846a;
    public StaticLayout f25847b;
    public float f25848c;
    public float d;
    public float f25849e;
    public int f25850f;
    public Layout.Alignment f25851g;
    public float h;
    public boolean f25852i;
    public View f25853j;
    public v5 f25854k;
    public int f25855l;
    public PorterDuffColorFilter f25856m;
    public int f25857n;
    public boolean f25858o;
    public float f25859p;
    public LinearGradient f25860q;
    public Matrix f25861r;
    public Paint f25862s;
    public int f25863t;

    public f01(CharSequence charSequence, TextPaint textPaint) {
        this.f25849e = 9999.0f;
        this.f25850f = 1;
        this.f25851g = Layout.Alignment.ALIGN_NORMAL;
        this.f25855l = 0;
        this.f25859p = -1.0f;
        this.f25846a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25851g != alignment) {
            this.f25851g = alignment;
            r(this.f25847b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25847b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25847b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25847b == null) {
            return;
        }
        TextPaint textPaint = this.f25846a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25850f > 1) {
            height = 0.0f;
        } else {
            height = this.f25847b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25847b;
        if (staticLayout != null) {
            float f7 = this.f25859p;
            if (f7 >= 0.0f && this.f25848c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25863t, f7 - 1.0f, staticLayout.getHeight() + this.f25863t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25858o;
            TextPaint textPaint = this.f25846a;
            if (z10) {
                canvas.drawText(this.f25847b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25847b.draw(canvas);
            }
            if (this.f25852i) {
                if (this.f25856m == null || textPaint.getColor() != this.f25857n) {
                    int color = textPaint.getColor();
                    this.f25857n = color;
                    this.f25856m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25847b, this.f25854k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25856m);
            }
            canvas.restore();
            float f10 = this.f25859p;
            if (f10 >= 0.0f && this.f25848c > f10) {
                if (this.f25860q == null) {
                    this.f25860q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25861r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25862s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25862s.setShader(this.f25860q);
                }
                canvas.save();
                this.f25861r.reset();
                this.f25861r.postTranslate(this.f25859p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25860q.setLocalMatrix(this.f25861r);
                canvas.drawRect(this.f25859p - AndroidUtilities.dp(8.0f), 0.0f, this.f25859p, this.f25847b.getHeight(), this.f25862s);
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
        if (this.f25847b == null) {
            return;
        }
        canvas.save();
        if (this.f25850f > 1) {
            height = 0.0f;
        } else {
            height = this.f25847b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25846a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25859p = f7;
    }

    public final float h() {
        return this.f25848c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25846a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25847b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25847b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25847b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25859p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25848c);
        }
        return this.f25848c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25847b.getText());
        }
    }

    public final void n(int i10) {
        this.f25850f = i10;
        r(this.f25847b.getText());
    }

    public final void o(int i10) {
        this.f25846a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25855l != i10) {
            this.f25855l = i10;
            if (this.f25852i) {
                z5.release(this.f25853j, this.f25854k);
                this.f25854k = z5.update(this.f25855l, this.f25853j, this.f25854k, this.f25847b);
            }
        }
    }

    public final void q(float f7) {
        this.f25849e = f7;
        r(this.f25847b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25850f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25847b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25846a, (int) Math.max(this.f25849e, 1.0f)).setAlignment(this.f25851g).setMaxLines(this.f25850f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25847b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25846a, (int) Math.max(this.f25849e, 1.0f), this.f25851g, 1.0f, this.h, false);
        }
        if (this.f25851g == Layout.Alignment.ALIGN_CENTER) {
            this.f25848c = this.f25847b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25848c = 0.0f;
            this.d = this.f25847b.getWidth();
            for (int i10 = 0; i10 < this.f25847b.getLineCount(); i10++) {
                this.f25848c = Math.max(this.f25848c, this.f25847b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25847b.getLineLeft(i10));
            }
        }
        View view = this.f25853j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25854k = z5.update(this.f25855l, this.f25853j, this.f25854k, this.f25847b);
        }
    }

    public final void s(View view) {
        this.f25852i = true;
        this.f25853j = view;
        if (view.isAttachedToWindow()) {
            this.f25854k = z5.update(this.f25855l, view, this.f25854k, this.f25847b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f01(String str, float f7) {
        this(str, f7, null);
    }

    public f01(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25849e = 9999.0f;
        this.f25850f = 1;
        this.f25851g = Layout.Alignment.ALIGN_NORMAL;
        this.f25855l = 0;
        this.f25859p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25846a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
