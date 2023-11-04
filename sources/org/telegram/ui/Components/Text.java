package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public class Text {
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeMatrix;
    private Paint ellipsizePaint;
    private int ellipsizeWidth;
    private StaticLayout layout;
    private float left;
    private final TextPaint paint;
    private float width;

    public Text(CharSequence charSequence, int i) {
        this(charSequence, i, null);
    }

    public Text(CharSequence charSequence, int i, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.ellipsizeWidth = -1;
        textPaint.setTextSize(AndroidUtilities.dp(i));
        textPaint.setTypeface(typeface);
        setText(charSequence);
    }

    public void setText(CharSequence charSequence) {
        StaticLayout staticLayout = new StaticLayout(charSequence, this.paint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.layout = staticLayout;
        this.width = staticLayout.getLineCount() > 0 ? this.layout.getLineWidth(0) : 0.0f;
        this.left = this.layout.getLineCount() > 0 ? this.layout.getLineLeft(0) : 0.0f;
    }

    public float getTextSize() {
        return this.paint.getTextSize();
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }

    public Text ellipsize(int i) {
        this.ellipsizeWidth = i;
        return this;
    }

    public void draw(Canvas canvas, float f, float f2, int i, float f3) {
        if (this.layout == null) {
            return;
        }
        this.paint.setColor(i);
        if (f3 != 1.0f) {
            TextPaint textPaint = this.paint;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f3));
        }
        canvas.save();
        canvas.translate(f - this.left, f2 - (this.layout.getHeight() / 2.0f));
        draw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas, float f, float f2) {
        if (this.layout == null) {
            return;
        }
        canvas.save();
        canvas.translate(f - this.left, f2 - (this.layout.getHeight() / 2.0f));
        draw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null) {
            return;
        }
        int i = this.ellipsizeWidth;
        if (i >= 0 && this.width > i) {
            canvas.saveLayerAlpha(0.0f, 0.0f, i, staticLayout.getHeight(), 255, 31);
        }
        this.layout.draw(canvas);
        int i2 = this.ellipsizeWidth;
        if (i2 < 0 || this.width <= i2) {
            return;
        }
        if (this.ellipsizeGradient == null) {
            this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.ellipsizeMatrix = new Matrix();
            Paint paint = new Paint(1);
            this.ellipsizePaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.ellipsizePaint.setShader(this.ellipsizeGradient);
        }
        canvas.save();
        this.ellipsizeMatrix.reset();
        this.ellipsizeMatrix.postTranslate((this.ellipsizeWidth - this.left) - AndroidUtilities.dp(8.0f), 0.0f);
        this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
        canvas.drawRect((this.ellipsizeWidth - this.left) - AndroidUtilities.dp(8.0f), 0.0f, this.ellipsizeWidth - this.left, this.layout.getHeight(), this.ellipsizePaint);
        canvas.restore();
        canvas.restore();
    }

    public float getWidth() {
        int i = this.ellipsizeWidth;
        return i >= 0 ? Math.min(i, this.width) : this.width;
    }

    public float getCurrentWidth() {
        return this.width;
    }
}
