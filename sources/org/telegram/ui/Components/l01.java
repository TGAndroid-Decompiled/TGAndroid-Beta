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
public final class l01 {
    public final TextPaint f28519a;
    public StaticLayout f28520b;
    public float f28521c;
    public float d;
    public float f28522e;
    public int f28523f;
    public Layout.Alignment f28524g;
    public float h;
    public boolean f28525i;
    public View f28526j;
    public q5 f28527k;
    public int f28528l;
    public PorterDuffColorFilter f28529m;
    public int f28530n;
    public boolean f28531o;
    public float f28532p;
    public LinearGradient f28533q;
    public Matrix f28534r;
    public Paint f28535s;
    public int f28536t;

    public l01(CharSequence charSequence, TextPaint textPaint) {
        this.f28522e = 9999.0f;
        this.f28523f = 1;
        this.f28524g = Layout.Alignment.ALIGN_NORMAL;
        this.f28528l = 0;
        this.f28532p = -1.0f;
        this.f28519a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28524g != alignment) {
            this.f28524g = alignment;
            r(this.f28520b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f28520b.getLineCount(); i10++) {
            f10 = Math.max(f10, this.f28520b.getLineWidth(i10));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        float height;
        if (this.f28520b == null) {
            return;
        }
        TextPaint textPaint = this.f28519a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f28523f > 1) {
            height = 0.0f;
        } else {
            height = this.f28520b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28520b;
        if (staticLayout != null) {
            float f10 = this.f28532p;
            if (f10 >= 0.0f && this.f28521c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f28536t, f10 - 1.0f, staticLayout.getHeight() + this.f28536t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z4 = this.f28531o;
            TextPaint textPaint = this.f28519a;
            if (z4) {
                canvas.drawText(this.f28520b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28520b.draw(canvas);
            }
            if (this.f28525i) {
                if (this.f28529m == null || textPaint.getColor() != this.f28530n) {
                    int color = textPaint.getColor();
                    this.f28530n = color;
                    this.f28529m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                u5.drawAnimatedEmojis(canvas, this.f28520b, this.f28527k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28529m);
            }
            canvas.restore();
            float f11 = this.f28532p;
            if (f11 >= 0.0f && this.f28521c > f11) {
                if (this.f28533q == null) {
                    this.f28533q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28534r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28535s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28535s.setShader(this.f28533q);
                }
                canvas.save();
                this.f28534r.reset();
                this.f28534r.postTranslate(this.f28532p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28533q.setLocalMatrix(this.f28534r);
                canvas.drawRect(this.f28532p - AndroidUtilities.dp(8.0f), 0.0f, this.f28532p, this.f28520b.getHeight(), this.f28535s);
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
        if (this.f28520b == null) {
            return;
        }
        canvas.save();
        if (this.f28523f > 1) {
            height = 0.0f;
        } else {
            height = this.f28520b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f28519a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f28532p = f10;
    }

    public final float h() {
        return this.f28521c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28519a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28520b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28520b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28520b.getText();
        }
        return "";
    }

    public final float l() {
        float f10 = this.f28532p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f28521c);
        }
        return this.f28521c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f28520b.getText());
        }
    }

    public final void n(int i10) {
        this.f28523f = i10;
        r(this.f28520b.getText());
    }

    public final void o(int i10) {
        this.f28519a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28528l != i10) {
            this.f28528l = i10;
            if (this.f28525i) {
                u5.release(this.f28526j, this.f28527k);
                this.f28527k = u5.update(this.f28528l, this.f28526j, this.f28527k, this.f28520b);
            }
        }
    }

    public final void q(float f10) {
        this.f28522e = f10;
        r(this.f28520b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28523f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28520b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28519a, (int) Math.max(this.f28522e, 1.0f)).setAlignment(this.f28524g).setMaxLines(this.f28523f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28520b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28519a, (int) Math.max(this.f28522e, 1.0f), this.f28524g, 1.0f, this.h, false);
        }
        if (this.f28524g == Layout.Alignment.ALIGN_CENTER) {
            this.f28521c = this.f28520b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28521c = 0.0f;
            this.d = this.f28520b.getWidth();
            for (int i10 = 0; i10 < this.f28520b.getLineCount(); i10++) {
                this.f28521c = Math.max(this.f28521c, this.f28520b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28520b.getLineLeft(i10));
            }
        }
        View view = this.f28526j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28527k = u5.update(this.f28528l, this.f28526j, this.f28527k, this.f28520b);
        }
    }

    public final void s(View view) {
        this.f28525i = true;
        this.f28526j = view;
        if (view.isAttachedToWindow()) {
            this.f28527k = u5.update(this.f28528l, view, this.f28527k, this.f28520b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public l01(String str, float f10) {
        this(str, f10, null);
    }

    public l01(CharSequence charSequence, float f10, Typeface typeface) {
        this.f28522e = 9999.0f;
        this.f28523f = 1;
        this.f28524g = Layout.Alignment.ALIGN_NORMAL;
        this.f28528l = 0;
        this.f28532p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28519a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
