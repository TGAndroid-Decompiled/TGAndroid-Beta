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
    public final TextPaint f35775a;
    public StaticLayout f35776b;
    public float f35777c;
    public float d;
    public float f35778e;
    public int f35779f;
    public Layout.Alignment f35780g;
    public float h;
    public boolean f35781i;
    public View f35782j;
    public n5 f35783k;
    public int f35784l;
    public PorterDuffColorFilter f35785m;
    public int f35786n;
    public boolean f35787o;
    public float f35788p;
    public LinearGradient f35789q;
    public Matrix f35790r;
    public Paint f35791s;
    public int f35792t;

    public ly0(CharSequence charSequence, TextPaint textPaint) {
        this.f35778e = 9999.0f;
        this.f35779f = 1;
        this.f35780g = Layout.Alignment.ALIGN_NORMAL;
        this.f35784l = 0;
        this.f35788p = -1.0f;
        this.f35775a = textPaint;
        q(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f35780g != alignment) {
            this.f35780g = alignment;
            q(this.f35776b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < this.f35776b.getLineCount(); i7++) {
            f10 = Math.max(f10, this.f35776b.getLineWidth(i7));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i7, Canvas canvas) {
        float height;
        if (this.f35776b == null) {
            return;
        }
        TextPaint textPaint = this.f35775a;
        textPaint.setColor(i7);
        textPaint.linkColor = i7;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f35779f > 1) {
            height = 0.0f;
        } else {
            height = this.f35776b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f35776b;
        if (staticLayout != null) {
            float f10 = this.f35788p;
            if (f10 >= 0.0f && this.f35777c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f35792t, f10 - 1.0f, staticLayout.getHeight() + this.f35792t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z9 = this.f35787o;
            TextPaint textPaint = this.f35775a;
            if (z9) {
                canvas.drawText(this.f35776b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f35776b.draw(canvas);
            }
            if (this.f35781i) {
                if (this.f35785m == null || textPaint.getColor() != this.f35786n) {
                    int color = textPaint.getColor();
                    this.f35786n = color;
                    this.f35785m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                r5.drawAnimatedEmojis(canvas, this.f35776b, this.f35783k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f35785m);
            }
            canvas.restore();
            float f11 = this.f35788p;
            if (f11 >= 0.0f && this.f35777c > f11) {
                if (this.f35789q == null) {
                    this.f35789q = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f35790r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f35791s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f35791s.setShader(this.f35789q);
                }
                canvas.save();
                this.f35790r.reset();
                this.f35790r.postTranslate(this.f35788p - org.telegram.messenger.g0.L(8.0f), 0.0f);
                this.f35789q.setLocalMatrix(this.f35790r);
                canvas.drawRect(this.f35788p - org.telegram.messenger.g0.L(8.0f), 0.0f, this.f35788p, this.f35776b.getHeight(), this.f35791s);
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
        if (this.f35776b == null) {
            return;
        }
        canvas.save();
        if (this.f35779f > 1) {
            height = 0.0f;
        } else {
            height = this.f35776b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f35775a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final float g() {
        return this.f35777c;
    }

    public final Paint.FontMetricsInt h() {
        return this.f35775a.getFontMetricsInt();
    }

    public final float i() {
        return this.f35776b.getHeight();
    }

    public final CharSequence j() {
        StaticLayout staticLayout = this.f35776b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f35776b.getText();
        }
        return "";
    }

    public final float k() {
        float f10 = this.f35788p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f35777c);
        }
        return this.f35777c;
    }

    public final void l(float f10) {
        if (this.h != f10) {
            this.h = f10;
            q(this.f35776b.getText());
        }
    }

    public final void m(int i7) {
        this.f35779f = i7;
        q(this.f35776b.getText());
    }

    public final void n(int i7) {
        this.f35775a.setColor(i7);
    }

    public final void o(int i7) {
        if (this.f35784l != i7) {
            this.f35784l = i7;
            if (this.f35781i) {
                r5.release(this.f35782j, this.f35783k);
                this.f35783k = r5.update(this.f35784l, this.f35782j, this.f35783k, this.f35776b);
            }
        }
    }

    public final void p(float f10) {
        this.f35778e = f10;
        q(this.f35776b.getText());
    }

    public final void q(CharSequence charSequence) {
        if (this.f35779f > 1) {
            this.f35776b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f35775a, (int) Math.max(this.f35778e, 1.0f)).setAlignment(this.f35780g).setMaxLines(this.f35779f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f35776b = new StaticLayout(org.telegram.messenger.g0.N2(charSequence), this.f35775a, (int) Math.max(this.f35778e, 1.0f), this.f35780g, 1.0f, this.h, false);
        }
        if (this.f35780g == Layout.Alignment.ALIGN_CENTER) {
            this.f35777c = this.f35776b.getWidth();
            this.d = 0.0f;
        } else {
            this.f35777c = 0.0f;
            this.d = this.f35776b.getWidth();
            for (int i7 = 0; i7 < this.f35776b.getLineCount(); i7++) {
                this.f35777c = Math.max(this.f35777c, this.f35776b.getLineWidth(i7));
                this.d = Math.min(this.d, this.f35776b.getLineLeft(i7));
            }
        }
        View view = this.f35782j;
        if (view != null && view.isAttachedToWindow()) {
            this.f35783k = r5.update(this.f35784l, this.f35782j, this.f35783k, this.f35776b);
        }
    }

    public final void r(View view) {
        this.f35781i = true;
        this.f35782j = view;
        if (view.isAttachedToWindow()) {
            this.f35783k = r5.update(this.f35784l, view, this.f35783k, this.f35776b);
        }
        view.addOnAttachStateChangeListener(new aa(1, this, view));
    }

    public ly0(String str, float f10) {
        this(str, f10, null);
    }

    public ly0(CharSequence charSequence, float f10, Typeface typeface) {
        this.f35778e = 9999.0f;
        this.f35779f = 1;
        this.f35780g = Layout.Alignment.ALIGN_NORMAL;
        this.f35784l = 0;
        this.f35788p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f35775a = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
        textPaint.setTypeface(typeface);
        q(charSequence);
    }
}
