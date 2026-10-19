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
    public final TextPaint f25728a;
    public StaticLayout f25729b;
    public float f25730c;
    public float d;
    public float e;
    public int f25731f;
    public Layout.Alignment f25732g;
    public float h;
    public boolean f25733i;
    public View f25734j;
    public w5 f25735k;
    public int f25736l;
    public PorterDuffColorFilter f25737m;
    public int f25738n;
    public boolean f25739o;
    public float f25740p;
    public LinearGradient f25741q;
    public Matrix f25742r;
    public Paint f25743s;
    public int f25744t;

    public e11(CharSequence charSequence, TextPaint textPaint) {
        this.e = 9999.0f;
        this.f25731f = 1;
        this.f25732g = Layout.Alignment.ALIGN_NORMAL;
        this.f25736l = 0;
        this.f25740p = -1.0f;
        this.f25728a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f25732g != alignment) {
            this.f25732g = alignment;
            r(this.f25729b.getText());
        }
    }

    public final float b() {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < this.f25729b.getLineCount(); i10++) {
            f7 = Math.max(f7, this.f25729b.getLineWidth(i10));
        }
        return f7;
    }

    public final void c(float f7, float f10, float f11, int i10, Canvas canvas) {
        float height;
        if (this.f25729b == null) {
            return;
        }
        TextPaint textPaint = this.f25728a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f11 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.save();
        if (this.f25731f > 1) {
            height = 0.0f;
        } else {
            height = this.f25729b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f25729b;
        if (staticLayout != null) {
            float f7 = this.f25740p;
            if (f7 >= 0.0f && this.f25730c > f7) {
                canvas.saveLayerAlpha(0.0f, -this.f25744t, f7 - 1.0f, staticLayout.getHeight() + this.f25744t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z10 = this.f25739o;
            TextPaint textPaint = this.f25728a;
            if (z10) {
                canvas.drawText(this.f25729b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f25729b.draw(canvas);
            }
            if (this.f25733i) {
                if (this.f25737m == null || textPaint.getColor() != this.f25738n) {
                    int color = textPaint.getColor();
                    this.f25738n = color;
                    this.f25737m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                a6.drawAnimatedEmojis(canvas, this.f25729b, this.f25735k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f25737m);
            }
            canvas.restore();
            float f10 = this.f25740p;
            if (f10 >= 0.0f && this.f25730c > f10) {
                if (this.f25741q == null) {
                    this.f25741q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f25742r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f25743s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f25743s.setShader(this.f25741q);
                }
                canvas.save();
                this.f25742r.reset();
                this.f25742r.postTranslate(this.f25740p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f25741q.setLocalMatrix(this.f25742r);
                canvas.drawRect(this.f25740p - AndroidUtilities.dp(8.0f), 0.0f, this.f25740p, this.f25729b.getHeight(), this.f25743s);
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
        if (this.f25729b == null) {
            return;
        }
        canvas.save();
        if (this.f25731f > 1) {
            height = 0.0f;
        } else {
            height = this.f25729b.getHeight() / 2.0f;
        }
        canvas.translate(f7, f10 - height);
        TextPaint textPaint = this.f25728a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f11));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f7) {
        this.f25740p = f7;
    }

    public final float h() {
        return this.f25730c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f25728a.getFontMetricsInt();
    }

    public final float j() {
        return this.f25729b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f25729b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f25729b.getText();
        }
        return "";
    }

    public final float l() {
        float f7 = this.f25740p;
        if (f7 >= 0.0f) {
            return Math.min(f7, this.f25730c);
        }
        return this.f25730c;
    }

    public final void m(float f7) {
        if (this.h != f7) {
            this.h = f7;
            r(this.f25729b.getText());
        }
    }

    public final void n(int i10) {
        this.f25731f = i10;
        r(this.f25729b.getText());
    }

    public final void o(int i10) {
        this.f25728a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f25736l != i10) {
            this.f25736l = i10;
            if (this.f25733i) {
                a6.release(this.f25734j, this.f25735k);
                this.f25735k = a6.update(this.f25736l, this.f25734j, this.f25735k, this.f25729b);
            }
        }
    }

    public final void q(float f7) {
        this.e = f7;
        r(this.f25729b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f25731f > 1) {
            this.f25729b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f25728a, (int) Math.max(this.e, 1.0f)).setAlignment(this.f25732g).setMaxLines(this.f25731f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f25729b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f25728a, (int) Math.max(this.e, 1.0f), this.f25732g, 1.0f, this.h, false);
        }
        if (this.f25732g == Layout.Alignment.ALIGN_CENTER) {
            this.f25730c = this.f25729b.getWidth();
            this.d = 0.0f;
        } else {
            this.f25730c = 0.0f;
            this.d = this.f25729b.getWidth();
            for (int i10 = 0; i10 < this.f25729b.getLineCount(); i10++) {
                this.f25730c = Math.max(this.f25730c, this.f25729b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f25729b.getLineLeft(i10));
            }
        }
        View view = this.f25734j;
        if (view != null && view.isAttachedToWindow()) {
            this.f25735k = a6.update(this.f25736l, this.f25734j, this.f25735k, this.f25729b);
        }
    }

    public final void s(View view) {
        this.f25733i = true;
        this.f25734j = view;
        if (view.isAttachedToWindow()) {
            this.f25735k = a6.update(this.f25736l, view, this.f25735k, this.f25729b);
        }
        view.addOnAttachStateChangeListener(new la(1, this, view));
    }

    public e11(String str, float f7) {
        this(str, f7, null);
    }

    public e11(CharSequence charSequence, float f7, Typeface typeface) {
        this.e = 9999.0f;
        this.f25731f = 1;
        this.f25732g = Layout.Alignment.ALIGN_NORMAL;
        this.f25736l = 0;
        this.f25740p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f25728a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f7));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
