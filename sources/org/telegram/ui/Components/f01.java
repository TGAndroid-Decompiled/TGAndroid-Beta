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
    public final TextPaint f23783a;
    public StaticLayout f23784b;
    public float f23785c;
    public float d;
    public float e;
    public int f23786f;
    public Layout.Alignment f23787g;
    public float h;
    public boolean f23788i;
    public View f23789j;
    public v5 f23790k;
    public int f23791l;
    public PorterDuffColorFilter f23792m;
    public int f23793n;
    public boolean f23794o;
    public float f23795p;
    public LinearGradient f23796q;
    public Matrix f23797r;
    public Paint f23798s;
    public int f23799t;

    public f01(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f23786f = 1;
        this.f23787g = Layout.Alignment.ALIGN_NORMAL;
        this.f23791l = 0;
        this.f23795p = -1.0f;
        this.f23783a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f23787g != alignment) {
            this.f23787g = alignment;
            r(this.f23784b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f23784b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f23784b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f23784b == null) {
            return;
        }
        TextPaint textPaint = this.f23783a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f23786f > 1) {
            height = 0.0f;
        } else {
            height = this.f23784b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f23784b;
        if (staticLayout != null) {
            float f7 = this.f23795p;
            if (f7 >= 0.0f && this.f23785c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f23799t, f7 - 1.0f, staticLayout.getHeight() + this.f23799t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f23794o;
            TextPaint textPaint = this.f23783a;
            if (z10) {
                canvas.drawText(this.f23784b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f23784b.draw(canvas);
            }
            if (this.f23788i) {
                if (this.f23792m == null || textPaint.getColor() != this.f23793n) {
                    int color = textPaint.getColor();
                    this.f23793n = color;
                    this.f23792m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                z5.drawAnimatedEmojis(canvas, this.f23784b, this.f23790k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f23792m);
            }
            canvas.restore();
            float f10 = this.f23795p;
            if (f10 >= 0.0f && this.f23785c > f10) {
                if (this.f23796q == null) {
                    this.f23796q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f23797r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f23798s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f23798s.setShader(this.f23796q);
                }
                canvas.save();
                this.f23797r.reset();
                this.f23797r.postTranslate(this.f23795p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f23796q.setLocalMatrix(this.f23797r);
                canvas.drawRect(this.f23795p - AndroidUtilities.dp(8.0f), 0.0f, this.f23795p, this.f23784b.getHeight(), this.f23798s);
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
        if (this.f23784b == null) {
            return;
        }
        canvas.save();
        if (this.f23786f > 1) {
            height = 0.0f;
        } else {
            height = this.f23784b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f23783a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f23795p = f7;
    }

    public final float h() {
        return this.f23785c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f23783a.getFontMetricsInt();
    }

    public final float j() {
        return this.f23784b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f23784b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f23784b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f23795p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f23785c);
        }
        return this.f23785c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f23784b.getText());
        }
    }

    public final void n(int i10) {
        this.f23786f = i10;
        r(this.f23784b.getText());
    }

    public final void o(int i10) {
        this.f23783a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f23791l != i10) {
            this.f23791l = i10;
            if (this.f23788i) {
                z5.release(this.f23789j, this.f23790k);
                this.f23790k = z5.update(this.f23791l, this.f23789j, this.f23790k, this.f23784b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f23784b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f23786f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f23784b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f23783a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f23787g).setMaxLines(this.f23786f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f23784b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f23783a, (int) Math.max(this.e, 1.0f), this.f23787g, 1.0f, this.h, false);
        }
        if (this.f23787g == Layout.Alignment.ALIGN_CENTER) {
            this.f23785c = this.f23784b.getWidth();
            this.d = 0.0f;
        } else {
            this.f23785c = 0.0f;
            this.d = this.f23784b.getWidth();
            for (int i10 = 0; i10 < this.f23784b.getLineCount(); i10++) {
                this.f23785c = Math.max(this.f23785c, this.f23784b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f23784b.getLineLeft(i10));
            }
        }
        View view = this.f23789j;
        if (view != null && view.isAttachedToWindow()) {
            this.f23790k = z5.update(this.f23791l, this.f23789j, this.f23790k, this.f23784b);
        }
    }

    public final void s(View view) {
        this.f23788i = true;
        this.f23789j = view;
        if (view.isAttachedToWindow()) {
            this.f23790k = z5.update(this.f23791l, view, this.f23790k, this.f23784b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public f01(String str, float f7) {
        this(str, f7, null);
    }

    public f01(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f23786f = 1;
        this.f23787g = Layout.Alignment.ALIGN_NORMAL;
        this.f23791l = 0;
        this.f23795p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f23783a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
