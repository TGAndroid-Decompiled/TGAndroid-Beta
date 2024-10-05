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
import org.telegram.ui.ActionBar.Theme;

public class Text {
    private boolean doNotSave;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeMatrix;
    private Paint ellipsizePaint;
    private int ellipsizeWidth;
    private boolean hackClipBounds;
    private StaticLayout layout;
    private float left;
    private float maxWidth;
    private final TextPaint paint;
    private int vertPad;
    private float width;

    public Text(CharSequence charSequence, float f) {
        this(charSequence, f, null);
    }

    public Text(CharSequence charSequence, float f, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.maxWidth = 999999.0f;
        this.ellipsizeWidth = -1;
        textPaint.setTextSize(AndroidUtilities.dp(f));
        textPaint.setTypeface(typeface);
        setText(charSequence);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        if (this.layout == null) {
            return;
        }
        if (!this.doNotSave && (i2 = this.ellipsizeWidth) >= 0 && this.width > i2) {
            canvas.saveLayerAlpha(0.0f, -this.vertPad, i2 - 1, r0.getHeight() + this.vertPad, 255, 31);
        }
        if (this.hackClipBounds) {
            canvas.drawText(this.layout.getText().toString(), 0.0f, -this.paint.getFontMetricsInt().ascent, this.paint);
        } else {
            this.layout.draw(canvas);
        }
        if (this.doNotSave || (i = this.ellipsizeWidth) < 0 || this.width <= i) {
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

    public void draw(Canvas canvas, float f, float f2) {
        if (this.layout == null) {
            return;
        }
        if (!this.doNotSave) {
            canvas.save();
        }
        canvas.translate(f - this.left, f2 - (this.layout.getHeight() / 2.0f));
        draw(canvas);
        if (this.doNotSave) {
            return;
        }
        canvas.restore();
    }

    public void draw(Canvas canvas, float f, float f2, int i, float f3) {
        if (this.layout == null) {
            return;
        }
        this.paint.setColor(i);
        int alpha = this.paint.getAlpha();
        if (f3 != 1.0f) {
            this.paint.setAlpha((int) (alpha * f3));
        }
        if (!this.doNotSave) {
            canvas.save();
        }
        canvas.translate(f - this.left, f2 - (this.layout.getHeight() / 2.0f));
        draw(canvas);
        if (!this.doNotSave) {
            canvas.restore();
        }
        this.paint.setAlpha(alpha);
    }

    public Text ellipsize(int i) {
        this.ellipsizeWidth = i;
        return this;
    }

    public float getCurrentWidth() {
        return this.width;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.paint.getFontMetricsInt();
    }

    public float getHeight() {
        return this.layout.getHeight();
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.layout;
        return (staticLayout == null || staticLayout.getText() == null) ? "" : this.layout.getText();
    }

    public float getTextSize() {
        return this.paint.getTextSize();
    }

    public float getWidth() {
        int i = this.ellipsizeWidth;
        return i >= 0 ? Math.min(i, this.width) : this.width;
    }

    public Text hackClipBounds() {
        this.hackClipBounds = true;
        return this;
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }

    public Text setMaxWidth(float f) {
        this.maxWidth = f;
        setText(this.layout.getText());
        return this;
    }

    public Text setShadow(float f) {
        this.paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(-16777216, f));
        return this;
    }

    public void setText(CharSequence charSequence) {
        this.layout = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.paint, (int) Math.max(this.maxWidth, 1.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.width = 0.0f;
        this.left = 0.0f;
        for (int i = 0; i < this.layout.getLineCount(); i++) {
            this.width = Math.max(this.width, this.layout.getLineWidth(i));
            this.left = Math.max(this.left, this.layout.getLineLeft(i));
        }
    }

    public Text setTextSizePx(float f) {
        this.paint.setTextSize(f);
        return this;
    }

    public Text setVerticalClipPadding(int i) {
        this.vertPad = i;
        return this;
    }
}
