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
    public final TextPaint f26082a;
    public StaticLayout f26083b;
    public float f26084c;
    public float d;
    public float e;
    public int f26085f;
    public Layout.Alignment f26086g;
    public float h;
    public boolean f26087i;
    public View f26088j;
    public q5 f26089k;
    public int f26090l;
    public PorterDuffColorFilter f26091m;
    public int f26092n;
    public boolean f26093o;
    public float f26094p;
    public LinearGradient f26095q;
    public Matrix f26096r;
    public Paint f26097s;
    public int f26098t;

    public k01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f26085f = 1;
        this.f26086g = Layout.Alignment.ALIGN_NORMAL;
        this.f26090l = 0;
        this.f26094p = -1.0f;
        this.f26082a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f26086g != alignment) {
            this.f26086g = alignment;
            r(this.f26083b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f26083b.getLineCount(); i10++) {
            f10 = Math.max(f10, this.f26083b.getLineWidth(i10));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        float height;
        if (this.f26083b == null) {
            return;
        }
        TextPaint textPaint = this.f26082a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f26085f > 1) {
            height = 0.0f;
        } else {
            height = this.f26083b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f26083b;
        if (staticLayout != null) {
            float f10 = this.f26094p;
            if (f10 >= 0.0f && this.f26084c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f26098t, f10 - 1.0f, staticLayout.getHeight() + this.f26098t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z4 = this.f26093o;
            TextPaint textPaint = this.f26082a;
            if (z4) {
                canvas.drawText(this.f26083b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f26083b.draw(canvas);
            }
            if (this.f26087i) {
                if (this.f26091m == null || textPaint.getColor() != this.f26092n) {
                    int color = textPaint.getColor();
                    this.f26092n = color;
                    this.f26091m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                u5.drawAnimatedEmojis(canvas, this.f26083b, this.f26089k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f26091m);
            }
            canvas.restore();
            float f11 = this.f26094p;
            if (f11 >= 0.0f && this.f26084c > f11) {
                if (this.f26095q == null) {
                    this.f26095q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f26096r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f26097s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f26097s.setShader(this.f26095q);
                }
                canvas.save();
                this.f26096r.reset();
                this.f26096r.postTranslate(this.f26094p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f26095q.setLocalMatrix(this.f26096r);
                canvas.drawRect(this.f26094p - AndroidUtilities.dp(8.0f), 0.0f, this.f26094p, this.f26083b.getHeight(), this.f26097s);
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
        if (this.f26083b == null) {
            return;
        }
        canvas.save();
        if (this.f26085f > 1) {
            height = 0.0f;
        } else {
            height = this.f26083b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f26082a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f26094p = f10;
    }

    public final float h() {
        return this.f26084c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f26082a.getFontMetricsInt();
    }

    public final float j() {
        return this.f26083b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f26083b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f26083b.getText();
        }
        return "";
    }

    public final float l() {
        float f10 = this.f26094p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f26084c);
        }
        return this.f26084c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f26083b.getText());
        }
    }

    public final void n(int i10) {
        this.f26085f = i10;
        r(this.f26083b.getText());
    }

    public final void o(int i10) {
        this.f26082a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f26090l != i10) {
            this.f26090l = i10;
            if (this.f26087i) {
                u5.release(this.f26088j, this.f26089k);
                this.f26089k = u5.update(this.f26090l, this.f26088j, this.f26089k, this.f26083b);
            }
        }
    }

    public final void q(float f10) {
        this.e = f10;
        r(this.f26083b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f26085f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f26083b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f26082a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f26086g).setMaxLines(this.f26085f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f26083b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f26082a, (int) Math.max(this.e, 1.0f), this.f26086g, 1.0f, this.h, false);
        }
        if (this.f26086g == Layout.Alignment.ALIGN_CENTER) {
            this.f26084c = this.f26083b.getWidth();
            this.d = 0.0f;
        } else {
            this.f26084c = 0.0f;
            this.d = this.f26083b.getWidth();
            for (int i10 = 0; i10 < this.f26083b.getLineCount(); i10++) {
                this.f26084c = Math.max(this.f26084c, this.f26083b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f26083b.getLineLeft(i10));
            }
        }
        View view = this.f26088j;
        if (view != null && view.isAttachedToWindow()) {
            this.f26089k = u5.update(this.f26090l, this.f26088j, this.f26089k, this.f26083b);
        }
    }

    public final void s(View view) {
        this.f26087i = true;
        this.f26088j = view;
        if (view.isAttachedToWindow()) {
            this.f26089k = u5.update(this.f26090l, view, this.f26089k, this.f26083b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public k01(String str, float f10) {
        this(str, f10, null);
    }

    public k01(CharSequence charSequence, float f10, Typeface typeface) {
        this.e = 9999.0f;
        this.f26085f = 1;
        this.f26086g = Layout.Alignment.ALIGN_NORMAL;
        this.f26090l = 0;
        this.f26094p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f26082a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
