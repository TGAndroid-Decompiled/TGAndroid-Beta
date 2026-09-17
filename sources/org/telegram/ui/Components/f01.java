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
    public final TextPaint f25873a;
    public StaticLayout f25874b;
    public float f25875c;
    public float d;
    public float f25876e;
    public int f25877f;
    public Layout.Alignment f25878g;
    public float h;
    public boolean f25879i;
    public View f25880j;
    public v5 f25881k;
    public int f25882l;
    public PorterDuffColorFilter f25883m;
    public int f25884n;
    public boolean f25885o;
    public float f25886p;
    public LinearGradient f25887q;
    public Matrix f25888r;
    public Paint f25889s;
    public int f25890t;

    public f01(CharSequence charSequence, TextPaint textPaint) {
        this.f25876e = 9999.0f;
        this.f25877f = 1;
        this.f25878g = Layout.Alignment.ALIGN_NORMAL;
        this.f25882l = 0;
        this.f25886p = -1.0f;
        this.f25873a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25878g != alignment) {
            this.f25878g = alignment;
            r(this.f25874b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25874b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25874b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25874b == null) {
            return;
        }
        TextPaint textPaint = this.f25873a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25877f > 1) {
            height = 0.0f;
        } else {
            height = this.f25874b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25874b;
        if (staticLayout != null) {
            float f7 = this.f25886p;
            if (f7 >= 0.0f && this.f25875c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25890t, f7 - 1.0f, staticLayout.getHeight() + this.f25890t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25885o;
            TextPaint textPaint = this.f25873a;
            if (z10) {
                canvas.drawText(this.f25874b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25874b.draw(canvas);
            }
            if (this.f25879i) {
                if (this.f25883m == null || textPaint.getColor() != this.f25884n) {
                    int color = textPaint.getColor();
                    this.f25884n = color;
                    this.f25883m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f25874b, this.f25881k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25883m);
            }
            canvas.restore();
            float f10 = this.f25886p;
            if (f10 >= 0.0f && this.f25875c > f10) {
                if (this.f25887q == null) {
                    this.f25887q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25888r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25889s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25889s.setShader(this.f25887q);
                }
                canvas.save();
                this.f25888r.reset();
                this.f25888r.postTranslate(this.f25886p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25887q.setLocalMatrix(this.f25888r);
                canvas.drawRect(this.f25886p - AndroidUtilities.dp(8.0f), 0.0f, this.f25886p, this.f25874b.getHeight(), this.f25889s);
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
        if (this.f25874b == null) {
            return;
        }
        canvas.save();
        if (this.f25877f > 1) {
            height = 0.0f;
        } else {
            height = this.f25874b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25873a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25886p = f7;
    }

    public final float h() {
        return this.f25875c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25873a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25874b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25874b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25874b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25886p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25875c);
        }
        return this.f25875c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25874b.getText());
        }
    }

    public final void n(int i10) {
        this.f25877f = i10;
        r(this.f25874b.getText());
    }

    public final void o(int i10) {
        this.f25873a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25882l != i10) {
            this.f25882l = i10;
            if (this.f25879i) {
                z5.release(this.f25880j, this.f25881k);
                this.f25881k = z5.update(this.f25882l, this.f25880j, this.f25881k, this.f25874b);
            }
        }
    }

    public final void q(float f7) {
        this.f25876e = f7;
        r(this.f25874b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25877f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f25874b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25873a, (int) Math.max(this.f25876e, 1.0f)).setAlignment(this.f25878g).setMaxLines(this.f25877f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25874b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25873a, (int) Math.max(this.f25876e, 1.0f), this.f25878g, 1.0f, this.h, false);
        }
        if (this.f25878g == Layout.Alignment.ALIGN_CENTER) {
            this.f25875c = this.f25874b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25875c = 0.0f;
            this.d = this.f25874b.getWidth();
            for (int i10 = 0; i10 < this.f25874b.getLineCount(); i10++) {
                this.f25875c = Math.max(this.f25875c, this.f25874b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25874b.getLineLeft(i10));
            }
        }
        View view = this.f25880j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25881k = z5.update(this.f25882l, this.f25880j, this.f25881k, this.f25874b);
        }
    }

    public final void s(View view) {
        this.f25879i = true;
        this.f25880j = view;
        if (view.isAttachedToWindow()) {
            this.f25881k = z5.update(this.f25882l, view, this.f25881k, this.f25874b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f01(String str, float f7) {
        this(str, f7, null);
    }

    public f01(CharSequence charSequence, float f7, Typeface typeface) {
        this.f25876e = 9999.0f;
        this.f25877f = 1;
        this.f25878g = Layout.Alignment.ALIGN_NORMAL;
        this.f25882l = 0;
        this.f25886p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25873a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
