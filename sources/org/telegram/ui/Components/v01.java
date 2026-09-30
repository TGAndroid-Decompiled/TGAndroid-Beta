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
public final class v01 {
    public final TextPaint f28920a;
    public StaticLayout f28921b;
    public float f28922c;
    public float d;
    public float e;
    public int f28923f;
    public Layout.Alignment f28924g;
    public float h;
    public boolean f28925i;
    public View f28926j;
    public v5 f28927k;
    public int f28928l;
    public PorterDuffColorFilter f28929m;
    public int f28930n;
    public boolean f28931o;
    public float f28932p;
    public LinearGradient f28933q;
    public Matrix f28934r;
    public Paint f28935s;
    public int f28936t;

    public v01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28923f = 1;
        this.f28924g = Layout.Alignment.ALIGN_NORMAL;
        this.f28928l = 0;
        this.f28932p = -1.0f;
        this.f28920a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28924g != alignment) {
            this.f28924g = alignment;
            r(this.f28921b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28921b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28921b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28921b == null) {
            return;
        }
        TextPaint textPaint = this.f28920a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28923f > 1) {
            height = 0.0f;
        } else {
            height = this.f28921b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28921b;
        if (staticLayout != null) {
            float f7 = this.f28932p;
            if (f7 >= 0.0f && this.f28922c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28936t, f7 - 1.0f, staticLayout.getHeight() + this.f28936t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28931o;
            TextPaint textPaint = this.f28920a;
            if (z10) {
                canvas.drawText(this.f28921b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28921b.draw(canvas);
            }
            if (this.f28925i) {
                if (this.f28929m == null || textPaint.getColor() != this.f28930n) {
                    int color = textPaint.getColor();
                    this.f28930n = color;
                    this.f28929m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28921b, this.f28927k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28929m);
            }
            canvas.restore();
            float f10 = this.f28932p;
            if (f10 >= 0.0f && this.f28922c > f10) {
                if (this.f28933q == null) {
                    this.f28933q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28934r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28935s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28935s.setShader(this.f28933q);
                }
                canvas.save();
                this.f28934r.reset();
                this.f28934r.postTranslate(this.f28932p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28933q.setLocalMatrix(this.f28934r);
                canvas.drawRect(this.f28932p - AndroidUtilities.dp(8.0f), 0.0f, this.f28932p, this.f28921b.getHeight(), this.f28935s);
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
        if (this.f28921b == null) {
            return;
        }
        canvas.save();
        if (this.f28923f > 1) {
            height = 0.0f;
        } else {
            height = this.f28921b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28920a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28932p = f7;
    }

    public final float h() {
        return this.f28922c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28920a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28921b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28921b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28921b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28932p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28922c);
        }
        return this.f28922c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28921b.getText());
        }
    }

    public final void n(int i10) {
        this.f28923f = i10;
        r(this.f28921b.getText());
    }

    public final void o(int i10) {
        this.f28920a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28928l != i10) {
            this.f28928l = i10;
            if (this.f28925i) {
                z5.release(this.f28926j, this.f28927k);
                this.f28927k = z5.update(this.f28928l, this.f28926j, this.f28927k, this.f28921b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28921b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28923f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28921b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28920a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28924g).setMaxLines(this.f28923f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28921b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28920a, (int) Math.max(this.e, 1.0f), this.f28924g, 1.0f, this.h, false);
        }
        if (this.f28924g == Layout.Alignment.ALIGN_CENTER) {
            this.f28922c = this.f28921b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28922c = 0.0f;
            this.d = this.f28921b.getWidth();
            for (int i10 = 0; i10 < this.f28921b.getLineCount(); i10++) {
                this.f28922c = Math.max(this.f28922c, this.f28921b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28921b.getLineLeft(i10));
            }
        }
        View view = this.f28926j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28927k = z5.update(this.f28928l, this.f28926j, this.f28927k, this.f28921b);
        }
    }

    public final void s(View view) {
        this.f28925i = true;
        this.f28926j = view;
        if (view.isAttachedToWindow()) {
            this.f28927k = z5.update(this.f28928l, view, this.f28927k, this.f28921b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public v01(String str, float f7) {
        this(str, f7, null);
    }

    public v01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28923f = 1;
        this.f28924g = Layout.Alignment.ALIGN_NORMAL;
        this.f28928l = 0;
        this.f28932p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28920a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
