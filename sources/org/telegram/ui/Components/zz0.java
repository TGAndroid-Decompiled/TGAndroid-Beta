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
public final class zz0 {
    public final TextPaint f35460a;
    public StaticLayout f35461b;
    public float f35462c;
    public float d;
    public float f35463e;
    public int f35464f;
    public Layout.Alignment f35465g;
    public float h;
    public boolean f35466i;
    public View f35467j;
    public u5 f35468k;
    public int f35469l;
    public PorterDuffColorFilter f35470m;
    public int f35471n;
    public boolean f35472o;
    public float f35473p;
    public LinearGradient f35474q;
    public Matrix f35475r;
    public Paint f35476s;
    public int f35477t;

    public zz0(CharSequence charSequence, TextPaint textPaint) {
        this.f35463e = 9999.0f;
        this.f35464f = 1;
        this.f35465g = Layout.Alignment.ALIGN_NORMAL;
        this.f35469l = 0;
        this.f35473p = -1.0f;
        this.f35460a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f35465g != alignment) {
            this.f35465g = alignment;
            r(this.f35461b.getText());
        }
    }

    public final float b() {
        float f9 = 0.0f;
        for (int i10 = 0; i10 < this.f35461b.getLineCount(); i10++) {
            f9 = Math.max(f9, this.f35461b.getLineWidth(i10));
        }
        return f9;
    }

    public final void c(float f9, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f35461b == null) {
            return;
        }
        TextPaint textPaint = this.f35460a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f35464f > 1) {
            height = 0.0f;
        } else {
            height = this.f35461b.getHeight() / 2.0f;
        }
        canvas.translate(f9, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f35461b;
        if (staticLayout != null) {
            float f9 = this.f35473p;
            if (f9 >= 0.0f && this.f35462c > f9) {
                canvas.saveLayerAlpha(0.0f, -this.f35477t, f9 - 1.0f, staticLayout.getHeight() + this.f35477t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f35472o;
            TextPaint textPaint = this.f35460a;
            if (z10) {
                canvas.drawText(this.f35461b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f35461b.draw(canvas);
            }
            if (this.f35466i) {
                if (this.f35470m == null || textPaint.getColor() != this.f35471n) {
                    int color = textPaint.getColor();
                    this.f35471n = color;
                    this.f35470m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                y5.drawAnimatedEmojis(canvas, this.f35461b, this.f35468k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f35470m);
            }
            canvas.restore();
            float f10 = this.f35473p;
            if (f10 >= 0.0f && this.f35462c > f10) {
                if (this.f35474q == null) {
                    this.f35474q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f35475r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f35476s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f35476s.setShader(this.f35474q);
                }
                canvas.save();
                this.f35475r.reset();
                this.f35475r.postTranslate(this.f35473p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f35474q.setLocalMatrix(this.f35475r);
                canvas.drawRect(this.f35473p - AndroidUtilities.dp(8.0f), 0.0f, this.f35473p, this.f35461b.getHeight(), this.f35476s);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final void e(Canvas canvas, float f9, float f10) {
        f(canvas, f9, f10, 1.0f);
    }

    public final void f(Canvas canvas, float f9, float f10, float f11) {
        float height;
        if (this.f35461b == null) {
            return;
        }
        canvas.save();
        if (this.f35464f > 1) {
            height = 0.0f;
        } else {
            height = this.f35461b.getHeight() / 2.0f;
        }
        canvas.translate(f9, f10 - height);
        TextPaint textPaint = this.f35460a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f9) {
        this.f35473p = f9;
    }

    public final float h() {
        return this.f35462c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f35460a.getFontMetricsInt();
    }

    public final float j() {
        return this.f35461b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f35461b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f35461b.getText();
        }
        return "";
    }

    public final float l() {
        float f9 = this.f35473p;
        if (f9 >= 0.0f) {
            return Math.min(f9, this.f35462c);
        }
        return this.f35462c;
    }

    public final void m(float f9) {
        if (this.h != f9) {
            this.h = f9;
            r(this.f35461b.getText());
        }
    }

    public final void n(int i10) {
        this.f35464f = i10;
        r(this.f35461b.getText());
    }

    public final void o(int i10) {
        this.f35460a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f35469l != i10) {
            this.f35469l = i10;
            if (this.f35466i) {
                y5.release(this.f35467j, this.f35468k);
                this.f35468k = y5.update(this.f35469l, this.f35467j, this.f35468k, this.f35461b);
            }
        }
    }

    public final void q(float f9) {
        this.f35463e = f9;
        r(this.f35461b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f35464f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f35461b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f35460a, (int) Math.max(this.f35463e, 1.0f)).setAlignment(this.f35465g).setMaxLines(this.f35464f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f35461b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f35460a, (int) Math.max(this.f35463e, 1.0f), this.f35465g, 1.0f, this.h, false);
        }
        if (this.f35465g == Layout.Alignment.ALIGN_CENTER) {
            this.f35462c = this.f35461b.getWidth();
            this.d = 0.0f;
        } else {
            this.f35462c = 0.0f;
            this.d = this.f35461b.getWidth();
            for (int i10 = 0; i10 < this.f35461b.getLineCount(); i10++) {
                this.f35462c = Math.max(this.f35462c, this.f35461b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f35461b.getLineLeft(i10));
            }
        }
        View view = this.f35467j;
        if (view != null && view.isAttachedToWindow()) {
            this.f35468k = y5.update(this.f35469l, this.f35467j, this.f35468k, this.f35461b);
        }
    }

    public final void s(View view) {
        this.f35466i = true;
        this.f35467j = view;
        if (view.isAttachedToWindow()) {
            this.f35468k = y5.update(this.f35469l, view, this.f35468k, this.f35461b);
        }
        view.addOnAttachStateChangeListener(new ia(1, this, view));
    }

    public zz0(String str, float f9) {
        this(str, f9, null);
    }

    public zz0(CharSequence charSequence, float f9, Typeface typeface) {
        this.f35463e = 9999.0f;
        this.f35464f = 1;
        this.f35465g = Layout.Alignment.ALIGN_NORMAL;
        this.f35469l = 0;
        this.f35473p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f35460a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f9));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
