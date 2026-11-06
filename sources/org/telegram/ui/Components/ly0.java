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
public final class ly0 {
    public final TextPaint f35780a;
    public StaticLayout f35781b;
    public float f35782c;
    public float d;
    public float f35783e;
    public int f35784f;
    public Layout.Alignment f35785g;
    public float h;
    public boolean f35786i;
    public View f35787j;
    public n5 f35788k;
    public int f35789l;
    public PorterDuffColorFilter f35790m;
    public int f35791n;
    public boolean f35792o;
    public float f35793p;
    public LinearGradient f35794q;
    public Matrix f35795r;
    public Paint f35796s;
    public int f35797t;

    public ly0(CharSequence charSequence, TextPaint textPaint) {
        this.f35783e = 9999.0f;
        this.f35784f = 1;
        this.f35785g = Layout.Alignment.ALIGN_NORMAL;
        this.f35789l = 0;
        this.f35793p = -1.0f;
        this.f35780a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f35785g != alignment) {
            this.f35785g = alignment;
            q(this.f35781b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f35781b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f35781b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f35781b == null) {
            return;
        }
        TextPaint textPaint = this.f35780a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f35784f > 1) {
            height = 0.0f;
        } else {
            height = this.f35781b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f35781b;
        if (staticLayout != null) {
            float f10 = this.f35793p;
            if (f10 >= 0.0f && this.f35782c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f35797t, f10 - 1.0f, staticLayout.getHeight() + this.f35797t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f35792o;
            TextPaint textPaint = this.f35780a;
            if (z9) {
                canvas.drawText(this.f35781b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f35781b.draw(canvas);
            }
            if (this.f35786i) {
                if (this.f35790m == null || textPaint.getColor() != this.f35791n) {
                    int color = textPaint.getColor();
                    this.f35791n = color;
                    this.f35790m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                r5.drawAnimatedEmojis(canvas, this.f35781b, this.f35788k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f35790m);
            }
            canvas.restore();
            float f11 = this.f35793p;
            if (f11 >= 0.0f && this.f35782c > f11) {
                if (this.f35794q == null) {
                    this.f35794q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f35795r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f35796s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f35796s.setShader(this.f35794q);
                }
                canvas.save();
                this.f35795r.reset();
                this.f35795r.postTranslate(this.f35793p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f35794q.setLocalMatrix(this.f35795r);
                canvas.drawRect(this.f35793p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f35793p, this.f35781b.getHeight(), this.f35796s);
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
        if (this.f35781b == null) {
            return;
        }
        canvas.save();
        if (this.f35784f > 1) {
            height = 0.0f;
        } else {
            height = this.f35781b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f35780a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f35782c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f35780a.getFontMetricsInt();
    }

    public final float i() {
        return this.f35781b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f35781b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f35781b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f35793p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f35782c);
        }
        return this.f35782c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f35781b.getText());
        }
    }

    public final void m(int i7) {
        this.f35784f = i7;
        q(this.f35781b.getText());
    }

    public final void n(int i7) {
        this.f35780a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f35789l != i7) {
            this.f35789l = i7;
            if (this.f35786i) {
                r5.release(this.f35787j, this.f35788k);
                this.f35788k = r5.update(this.f35789l, this.f35787j, this.f35788k, this.f35781b);
            }
        }
    }

    public final void p(float f10) {
        this.f35783e = f10;
        q(this.f35781b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f35784f > 1) {
            this.f35781b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f35780a, (int) Math.max(this.f35783e, 1.0f)).setAlignment(this.f35785g).setMaxLines(this.f35784f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f35781b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f35780a, (int) Math.max(this.f35783e, 1.0f), this.f35785g, 1.0f, this.h, false);
        }
        if (this.f35785g == Layout.Alignment.ALIGN_CENTER) {
            this.f35782c = this.f35781b.getWidth();
            this.d = 0.0f;
        } else {
            this.f35782c = 0.0f;
            this.d = this.f35781b.getWidth();
            for (int i7 = 0; i7 < this.f35781b.getLineCount(); i7++) {
                this.f35782c = Math.max(this.f35782c, this.f35781b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f35781b.getLineLeft(i7));
            }
        }
        View view = this.f35787j;
        if (view != null && view.isAttachedToWindow()) {
            this.f35788k = r5.update(this.f35789l, this.f35787j, this.f35788k, this.f35781b);
        }
    }

    public final void r(View view) {
        this.f35786i = true;
        this.f35787j = view;
        if (view.isAttachedToWindow()) {
            this.f35788k = r5.update(this.f35789l, view, this.f35788k, this.f35781b);
        }
        view.addOnAttachStateChangeListener(new aa(1, this, view));
    }

    public ly0(String str, float f10) {
        this(str, f10, null);
    }

    public ly0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f35783e = 9999.0f;
        this.f35784f = 1;
        this.f35785g = Layout.Alignment.ALIGN_NORMAL;
        this.f35789l = 0;
        this.f35793p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f35780a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
