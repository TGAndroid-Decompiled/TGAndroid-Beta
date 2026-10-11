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
public final class m11 {
    public final TextPaint f28676a;
    public StaticLayout f28677b;
    public float f28678c;
    public float d;
    public float f28679e;
    public int f28680f;
    public Layout.Alignment f28681g;
    public float h;
    public boolean f28682i;
    public View f28683j;
    public x5 f28684k;
    public int f28685l;
    public PorterDuffColorFilter f28686m;
    public int f28687n;
    public boolean f28688o;
    public float f28689p;
    public LinearGradient f28690q;
    public Matrix f28691r;
    public Paint f28692s;
    public int f28693t;

    public m11(CharSequence charSequence, TextPaint textPaint) {
        this.f28679e = 9999.0f;
        this.f28680f = 1;
        this.f28681g = Layout.Alignment.ALIGN_NORMAL;
        this.f28685l = 0;
        this.f28689p = -1.0f;
        this.f28676a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28681g != alignment) {
            this.f28681g = alignment;
            r(this.f28677b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28677b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28677b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28677b == null) {
            return;
        }
        TextPaint textPaint = this.f28676a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28680f > 1) {
            height = 0.0f;
        } else {
            height = this.f28677b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28677b;
        if (staticLayout != null) {
            float f7 = this.f28689p;
            if (f7 >= 0.0f && this.f28678c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28693t, f7 - 1.0f, staticLayout.getHeight() + this.f28693t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28688o;
            TextPaint textPaint = this.f28676a;
            if (z10) {
                canvas.drawText(this.f28677b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28677b.draw(canvas);
            }
            if (this.f28682i) {
                if (this.f28686m == null || textPaint.getColor() != this.f28687n) {
                    int color = textPaint.getColor();
                    this.f28687n = color;
                    this.f28686m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                b6.drawAnimatedEmojis(canvas, this.f28677b, this.f28684k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28686m);
            }
            canvas.restore();
            float f10 = this.f28689p;
            if (f10 >= 0.0f && this.f28678c > f10) {
                if (this.f28690q == null) {
                    this.f28690q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28691r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28692s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28692s.setShader(this.f28690q);
                }
                canvas.save();
                this.f28691r.reset();
                this.f28691r.postTranslate(this.f28689p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28690q.setLocalMatrix(this.f28691r);
                canvas.drawRect(this.f28689p - AndroidUtilities.dp(8.0f), 0.0f, this.f28689p, this.f28677b.getHeight(), this.f28692s);
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
        if (this.f28677b == null) {
            return;
        }
        canvas.save();
        if (this.f28680f > 1) {
            height = 0.0f;
        } else {
            height = this.f28677b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28676a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28689p = f7;
    }

    public final float h() {
        return this.f28678c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28676a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28677b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28677b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28677b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28689p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28678c);
        }
        return this.f28678c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28677b.getText());
        }
    }

    public final void n(int i10) {
        this.f28680f = i10;
        r(this.f28677b.getText());
    }

    public final void o(int i10) {
        this.f28676a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28685l != i10) {
            this.f28685l = i10;
            if (this.f28682i) {
                b6.release(this.f28683j, this.f28684k);
                this.f28684k = b6.update(this.f28685l, this.f28683j, this.f28684k, this.f28677b);
            }
        }
    }

    public final void q(float f7) {
        this.f28679e = f7;
        r(this.f28677b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28680f > 1) {
            this.f28677b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28676a, (int) Math.max(this.f28679e, 1.0f)).setAlignment(this.f28681g).setMaxLines(this.f28680f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28677b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28676a, (int) Math.max(this.f28679e, 1.0f), this.f28681g, 1.0f, this.h, false);
        }
        if (this.f28681g == Layout.Alignment.ALIGN_CENTER) {
            this.f28678c = this.f28677b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28678c = 0.0f;
            this.d = this.f28677b.getWidth();
            for (int i10 = 0; i10 < this.f28677b.getLineCount(); i10++) {
                this.f28678c = Math.max(this.f28678c, this.f28677b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28677b.getLineLeft(i10));
            }
        }
        View view = this.f28683j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28684k = b6.update(this.f28685l, this.f28683j, this.f28684k, this.f28677b);
        }
    }

    public final void s(View view) {
        this.f28682i = true;
        this.f28683j = view;
        if (view.isAttachedToWindow()) {
            this.f28684k = b6.update(this.f28685l, view, this.f28684k, this.f28677b);
        }
        view.addOnAttachStateChangeListener(new na(1, this, view));
    }

    public m11(String str, float f7) {
        this(str, f7, null);
    }

    public m11(CharSequence charSequence, float f7, Typeface typeface) {
        this.f28679e = 9999.0f;
        this.f28680f = 1;
        this.f28681g = Layout.Alignment.ALIGN_NORMAL;
        this.f28685l = 0;
        this.f28689p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28676a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
