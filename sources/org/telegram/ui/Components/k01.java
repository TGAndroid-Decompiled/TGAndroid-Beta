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
    public final TextPaint f28225a;
    public StaticLayout f28226b;
    public float f28227c;
    public float d;
    public float f28228e;
    public int f28229f;
    public Layout.Alignment f28230g;
    public float h;
    public boolean f28231i;
    public View f28232j;
    public q5 f28233k;
    public int f28234l;
    public PorterDuffColorFilter f28235m;
    public int f28236n;
    public boolean f28237o;
    public float f28238p;
    public LinearGradient f28239q;
    public Matrix f28240r;
    public Paint f28241s;
    public int f28242t;

    public k01(CharSequence charSequence, TextPaint textPaint) {
        this.f28228e = 9999.0f;
        this.f28229f = 1;
        this.f28230g = Layout.Alignment.ALIGN_NORMAL;
        this.f28234l = 0;
        this.f28238p = -1.0f;
        this.f28225a = textPaint;
        r(charSequence);
    }

    public final void a() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.f28230g != alignment) {
            this.f28230g = alignment;
            r(this.f28226b.getText());
        }
    }

    public final float b() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f28226b.getLineCount(); i10++) {
            f10 = Math.max(f10, this.f28226b.getLineWidth(i10));
        }
        return f10;
    }

    public final void c(float f10, float f11, float f12, int i10, Canvas canvas) {
        float height;
        if (this.f28226b == null) {
            return;
        }
        TextPaint textPaint = this.f28225a;
        textPaint.setColor(i10);
        textPaint.linkColor = i10;
        int alpha = textPaint.getAlpha();
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f12));
        }
        canvas.save();
        if (this.f28229f > 1) {
            height = 0.0f;
        } else {
            height = this.f28226b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        d(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.f28226b;
        if (staticLayout != null) {
            float f10 = this.f28238p;
            if (f10 >= 0.0f && this.f28227c > f10) {
                canvas.saveLayerAlpha(0.0f, -this.f28242t, f10 - 1.0f, staticLayout.getHeight() + this.f28242t, 255, 31);
            }
            canvas.save();
            canvas.translate(-this.d, 0.0f);
            boolean z4 = this.f28237o;
            TextPaint textPaint = this.f28225a;
            if (z4) {
                canvas.drawText(this.f28226b.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
            } else {
                this.f28226b.draw(canvas);
            }
            if (this.f28231i) {
                if (this.f28235m == null || textPaint.getColor() != this.f28236n) {
                    int color = textPaint.getColor();
                    this.f28236n = color;
                    this.f28235m = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
                }
                u5.drawAnimatedEmojis(canvas, this.f28226b, this.f28233k, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.f28235m);
            }
            canvas.restore();
            float f11 = this.f28238p;
            if (f11 >= 0.0f && this.f28227c > f11) {
                if (this.f28239q == null) {
                    this.f28239q = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.f28240r = new Matrix();
                    Paint paint = new Paint(1);
                    this.f28241s = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.f28241s.setShader(this.f28239q);
                }
                canvas.save();
                this.f28240r.reset();
                this.f28240r.postTranslate(this.f28238p - AndroidUtilities.dp(8.0f), 0.0f);
                this.f28239q.setLocalMatrix(this.f28240r);
                canvas.drawRect(this.f28238p - AndroidUtilities.dp(8.0f), 0.0f, this.f28238p, this.f28226b.getHeight(), this.f28241s);
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
        if (this.f28226b == null) {
            return;
        }
        canvas.save();
        if (this.f28229f > 1) {
            height = 0.0f;
        } else {
            height = this.f28226b.getHeight() / 2.0f;
        }
        canvas.translate(f10, f11 - height);
        TextPaint textPaint = this.f28225a;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f12));
        d(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void g(float f10) {
        this.f28238p = f10;
    }

    public final float h() {
        return this.f28227c;
    }

    public final Paint.FontMetricsInt i() {
        return this.f28225a.getFontMetricsInt();
    }

    public final float j() {
        return this.f28226b.getHeight();
    }

    public final CharSequence k() {
        StaticLayout staticLayout = this.f28226b;
        if (staticLayout != null && staticLayout.getText() != null) {
            return this.f28226b.getText();
        }
        return "";
    }

    public final float l() {
        float f10 = this.f28238p;
        if (f10 >= 0.0f) {
            return Math.min(f10, this.f28227c);
        }
        return this.f28227c;
    }

    public final void m(float f10) {
        if (this.h != f10) {
            this.h = f10;
            r(this.f28226b.getText());
        }
    }

    public final void n(int i10) {
        this.f28229f = i10;
        r(this.f28226b.getText());
    }

    public final void o(int i10) {
        this.f28225a.setColor(i10);
    }

    public final void p(int i10) {
        if (this.f28234l != i10) {
            this.f28234l = i10;
            if (this.f28231i) {
                u5.release(this.f28232j, this.f28233k);
                this.f28233k = u5.update(this.f28234l, this.f28232j, this.f28233k, this.f28226b);
            }
        }
    }

    public final void q(float f10) {
        this.f28228e = f10;
        r(this.f28226b.getText());
    }

    public final void r(CharSequence charSequence) {
        if (this.f28229f > 1 && Build.VERSION.SDK_INT >= 23) {
            this.f28226b = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28225a, (int) Math.max(this.f28228e, 1.0f)).setAlignment(this.f28230g).setMaxLines(this.f28229f).setLineSpacing(this.h, 1.0f).build();
        } else {
            this.f28226b = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.f28225a, (int) Math.max(this.f28228e, 1.0f), this.f28230g, 1.0f, this.h, false);
        }
        if (this.f28230g == Layout.Alignment.ALIGN_CENTER) {
            this.f28227c = this.f28226b.getWidth();
            this.d = 0.0f;
        } else {
            this.f28227c = 0.0f;
            this.d = this.f28226b.getWidth();
            for (int i10 = 0; i10 < this.f28226b.getLineCount(); i10++) {
                this.f28227c = Math.max(this.f28227c, this.f28226b.getLineWidth(i10));
                this.d = Math.min(this.d, this.f28226b.getLineLeft(i10));
            }
        }
        View view = this.f28232j;
        if (view != null && view.isAttachedToWindow()) {
            this.f28233k = u5.update(this.f28234l, this.f28232j, this.f28233k, this.f28226b);
        }
    }

    public final void s(View view) {
        this.f28231i = true;
        this.f28232j = view;
        if (view.isAttachedToWindow()) {
            this.f28233k = u5.update(this.f28234l, view, this.f28233k, this.f28226b);
        }
        view.addOnAttachStateChangeListener(new da(1, this, view));
    }

    public k01(String str, float f10) {
        this(str, f10, null);
    }

    public k01(CharSequence charSequence, float f10, Typeface typeface) {
        this.f28228e = 9999.0f;
        this.f28229f = 1;
        this.f28230g = Layout.Alignment.ALIGN_NORMAL;
        this.f28234l = 0;
        this.f28238p = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f28225a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f10));
        textPaint.setTypeface(typeface);
        r(charSequence);
    }
}
