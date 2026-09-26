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
public final class u01 {
    public final TextPaint f28647a;
    public StaticLayout f28648b;
    public float f28649c;
    public float d;
    public float e;
    public int f28650f;
    public Layout.Alignment f28651g;
    public float h;
    public boolean f28652i;
    public View f28653j;
    public v5 f28654k;
    public int f28655l;
    public PorterDuffColorFilter f28656m;
    public int f28657n;
    public boolean f28658o;
    public float f28659p;
    public LinearGradient f28660q;
    public Matrix f28661r;
    public Paint f28662s;
    public int f28663t;

    public u01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f28650f = 1;
        this.f28651g = Layout.Alignment.ALIGN_NORMAL;
        this.f28655l = 0;
        this.f28659p = -1.0f;
        this.f28647a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28651g != alignment) {
            this.f28651g = alignment;
            r(this.f28648b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f28648b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f28648b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f28648b == null) {
            return;
        }
        TextPaint textPaint = this.f28647a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f28650f > 1) {
            height = 0.0f;
        } else {
            height = this.f28648b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28648b;
        if (staticLayout != null) {
            float f7 = this.f28659p;
            if (f7 >= 0.0f && this.f28649c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f28663t, f7 - 1.0f, staticLayout.getHeight() + this.f28663t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f28658o;
            TextPaint textPaint = this.f28647a;
            if (z10) {
                canvas.drawText(this.f28648b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28648b.draw(canvas);
            }
            if (this.f28652i) {
                if (this.f28656m == null || textPaint.getColor() != this.f28657n) {
                    int color = textPaint.getColor();
                    this.f28657n = color;
                    this.f28656m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f28648b, this.f28654k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28656m);
            }
            canvas.restore();
            float f10 = this.f28659p;
            if (f10 >= 0.0f && this.f28649c > f10) {
                if (this.f28660q == null) {
                    this.f28660q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28661r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28662s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28662s.setShader(this.f28660q);
                }
                canvas.save();
                this.f28661r.reset();
                this.f28661r.postTranslate(this.f28659p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28660q.setLocalMatrix(this.f28661r);
                canvas.drawRect(this.f28659p - AndroidUtilities.dp(8.0f), 0.0f, this.f28659p, this.f28648b.getHeight(), this.f28662s);
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
        if (this.f28648b == null) {
            return;
        }
        canvas.save();
        if (this.f28650f > 1) {
            height = 0.0f;
        } else {
            height = this.f28648b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f28647a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f28659p = f7;
    }

    public final float h() {
        return this.f28649c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28647a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28648b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28648b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28648b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f28659p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f28649c);
        }
        return this.f28649c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f28648b.getText());
        }
    }

    public final void n(int i10) {
        this.f28650f = i10;
        r(this.f28648b.getText());
    }

    public final void o(int i10) {
        this.f28647a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28655l != i10) {
            this.f28655l = i10;
            if (this.f28652i) {
                z5.release(this.f28653j, this.f28654k);
                this.f28654k = z5.update(this.f28655l, this.f28653j, this.f28654k, this.f28648b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f28648b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28650f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28648b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28647a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f28651g).setMaxLines(this.f28650f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28648b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28647a, (int) Math.max(this.e, 1.0f), this.f28651g, 1.0f, this.h, false);
        }
        if (this.f28651g == Layout.Alignment.ALIGN_CENTER) {
            this.f28649c = this.f28648b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28649c = 0.0f;
            this.d = this.f28648b.getWidth();
            for (int i10 = 0; i10 < this.f28648b.getLineCount(); i10++) {
                this.f28649c = Math.max(this.f28649c, this.f28648b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28648b.getLineLeft(i10));
            }
        }
        View view = this.f28653j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28654k = z5.update(this.f28655l, this.f28653j, this.f28654k, this.f28648b);
        }
    }

    public final void s(View view) {
        this.f28652i = true;
        this.f28653j = view;
        if (view.isAttachedToWindow()) {
            this.f28654k = z5.update(this.f28655l, view, this.f28654k, this.f28648b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public u01(String str, float f7) {
        this(str, f7, null);
    }

    public u01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f28650f = 1;
        this.f28651g = Layout.Alignment.ALIGN_NORMAL;
        this.f28655l = 0;
        this.f28659p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28647a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
