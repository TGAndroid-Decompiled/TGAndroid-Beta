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
import org.telegram.messenger.AndroidUtilities;
public final class e11 {
    public final TextPaint f25726a;
    public StaticLayout f25727b;
    public float f25728c;
    public float d;
    public float e;
    public int f25729f;
    public Layout.Alignment f25730g;
    public float h;
    public boolean f25731i;
    public View f25732j;
    public w5 f25733k;
    public int f25734l;
    public PorterDuffColorFilter f25735m;
    public int f25736n;
    public boolean f25737o;
    public float f25738p;
    public LinearGradient f25739q;
    public Matrix f25740r;
    public Paint f25741s;
    public int f25742t;

    public e11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25729f = 1;
        this.f25730g = Layout.Alignment.ALIGN_NORMAL;
        this.f25734l = 0;
        this.f25738p = -1.0f;
        this.f25726a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25730g != alignment) {
            this.f25730g = alignment;
            r(this.f25727b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25727b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25727b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25727b == null) {
            return;
        }
        TextPaint textPaint = this.f25726a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25729f > 1) {
            height = 0.0f;
        } else {
            height = this.f25727b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25727b;
        if (staticLayout != null) {
            float f7 = this.f25738p;
            if (f7 >= 0.0f && this.f25728c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25742t, f7 - 1.0f, staticLayout.getHeight() + this.f25742t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25737o;
            TextPaint textPaint = this.f25726a;
            if (z10) {
                canvas.drawText(this.f25727b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25727b.draw(canvas);
            }
            if (this.f25731i) {
                if (this.f25735m == null || textPaint.getColor() != this.f25736n) {
                    int color = textPaint.getColor();
                    this.f25736n = color;
                    this.f25735m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f25727b, this.f25733k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25735m);
            }
            canvas.restore();
            float f10 = this.f25738p;
            if (f10 >= 0.0f && this.f25728c > f10) {
                if (this.f25739q == null) {
                    this.f25739q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25740r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25741s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25741s.setShader(this.f25739q);
                }
                canvas.save();
                this.f25740r.reset();
                this.f25740r.postTranslate(this.f25738p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25739q.setLocalMatrix(this.f25740r);
                canvas.drawRect(this.f25738p - AndroidUtilities.dp(8.0f), 0.0f, this.f25738p, this.f25727b.getHeight(), this.f25741s);
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
        if (this.f25727b == null) {
            return;
        }
        canvas.save();
        if (this.f25729f > 1) {
            height = 0.0f;
        } else {
            height = this.f25727b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25726a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25738p = f7;
    }

    public final float h() {
        return this.f25728c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25726a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25727b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25727b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25727b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25738p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25728c);
        }
        return this.f25728c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25727b.getText());
        }
    }

    public final void n(int i10) {
        this.f25729f = i10;
        r(this.f25727b.getText());
    }

    public final void o(int i10) {
        this.f25726a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25734l != i10) {
            this.f25734l = i10;
            if (this.f25731i) {
                a6.release(this.f25732j, this.f25733k);
                this.f25733k = a6.update(this.f25734l, this.f25732j, this.f25733k, this.f25727b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25727b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25729f > 1) {
            this.f25727b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25726a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25730g).setMaxLines(this.f25729f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25727b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25726a, (int) Math.max(this.e, 1.0f), this.f25730g, 1.0f, this.h, false);
        }
        if (this.f25730g == Layout.Alignment.ALIGN_CENTER) {
            this.f25728c = this.f25727b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25728c = 0.0f;
            this.d = this.f25727b.getWidth();
            for (int i10 = 0; i10 < this.f25727b.getLineCount(); i10++) {
                this.f25728c = Math.max(this.f25728c, this.f25727b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25727b.getLineLeft(i10));
            }
        }
        View view = this.f25732j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25733k = a6.update(this.f25734l, this.f25732j, this.f25733k, this.f25727b);
        }
    }

    public final void s(View view) {
        this.f25731i = true;
        this.f25732j = view;
        if (view.isAttachedToWindow()) {
            this.f25733k = a6.update(this.f25734l, view, this.f25733k, this.f25727b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public e11(String str, float f7) {
        this(str, f7, null);
    }

    public e11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25729f = 1;
        this.f25730g = Layout.Alignment.ALIGN_NORMAL;
        this.f25734l = 0;
        this.f25738p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25726a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
