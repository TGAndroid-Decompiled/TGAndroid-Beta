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
    public final TextPaint f28985a;
    public StaticLayout f28986b;
    public float f28987c;
    public float d;
    public float e;
    public int f28988f;
    public Layout.Alignment f28989g;
    public float h;
    public boolean f28990i;
    public View f28991j;
    public v5 f28992k;
    public int f28993l;
    public PorterDuffColorFilter f28994m;
    public int f28995n;
    public boolean f28996o;
    public float f28997p;
    public LinearGradient f28998q;
    public Matrix f28999r;
    public Paint f29000s;
    public int f29001t;

    public v01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28988f = 1;
        this.f28989g = Layout.Alignment.ALIGN_NORMAL;
        this.f28993l = 0;
        this.f28997p = -1.0f;
        this.f28985a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28989g != alignment) {
            this.f28989g = alignment;
            r(this.f28986b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28986b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28986b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28986b == null) {
            return;
        }
        TextPaint textPaint = this.f28985a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28988f > 1) {
            height = 0.0f;
        } else {
            height = this.f28986b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28986b;
        if (staticLayout != null) {
            float f7 = this.f28997p;
            if (f7 >= 0.0f && this.f28987c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f29001t, f7 - 1.0f, staticLayout.getHeight() + this.f29001t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28996o;
            TextPaint textPaint = this.f28985a;
            if (z10) {
                canvas.drawText(this.f28986b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28986b.draw(canvas);
            }
            if (this.f28990i) {
                if (this.f28994m == null || textPaint.getColor() != this.f28995n) {
                    int color = textPaint.getColor();
                    this.f28995n = color;
                    this.f28994m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28986b, this.f28992k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28994m);
            }
            canvas.restore();
            float f10 = this.f28997p;
            if (f10 >= 0.0f && this.f28987c > f10) {
                if (this.f28998q == null) {
                    this.f28998q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28999r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f29000s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f29000s.setShader(this.f28998q);
                }
                canvas.save();
                this.f28999r.reset();
                this.f28999r.postTranslate(this.f28997p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28998q.setLocalMatrix(this.f28999r);
                canvas.drawRect(this.f28997p - AndroidUtilities.dp(8.0f), 0.0f, this.f28997p, this.f28986b.getHeight(), this.f29000s);
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
        if (this.f28986b == null) {
            return;
        }
        canvas.save();
        if (this.f28988f > 1) {
            height = 0.0f;
        } else {
            height = this.f28986b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28985a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28997p = f7;
    }

    public final float h() {
        return this.f28987c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28985a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28986b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28986b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28986b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28997p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28987c);
        }
        return this.f28987c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28986b.getText());
        }
    }

    public final void n(int i10) {
        this.f28988f = i10;
        r(this.f28986b.getText());
    }

    public final void o(int i10) {
        this.f28985a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28993l != i10) {
            this.f28993l = i10;
            if (this.f28990i) {
                z5.release(this.f28991j, this.f28992k);
                this.f28992k = z5.update(this.f28993l, this.f28991j, this.f28992k, this.f28986b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28986b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28988f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28986b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28985a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28989g).setMaxLines(this.f28988f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28986b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28985a, (int) Math.max(this.e, 1.0f), this.f28989g, 1.0f, this.h, false);
        }
        if (this.f28989g == Layout.Alignment.ALIGN_CENTER) {
            this.f28987c = this.f28986b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28987c = 0.0f;
            this.d = this.f28986b.getWidth();
            for (int i10 = 0; i10 < this.f28986b.getLineCount(); i10++) {
                this.f28987c = Math.max(this.f28987c, this.f28986b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28986b.getLineLeft(i10));
            }
        }
        View view = this.f28991j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28992k = z5.update(this.f28993l, this.f28991j, this.f28992k, this.f28986b);
        }
    }

    public final void s(View view) {
        this.f28990i = true;
        this.f28991j = view;
        if (view.isAttachedToWindow()) {
            this.f28992k = z5.update(this.f28993l, view, this.f28992k, this.f28986b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public v01(String str, float f7) {
        this(str, f7, null);
    }

    public v01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28988f = 1;
        this.f28989g = Layout.Alignment.ALIGN_NORMAL;
        this.f28993l = 0;
        this.f28997p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28985a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
