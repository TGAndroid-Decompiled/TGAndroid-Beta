package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import org.telegram.ui.ActionBar.Theme;

public class Text {
    private Layout.Alignment align;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojis;
    private int animatedEmojisCacheType;
    private ColorFilter animatedEmojisColorFilter;
    private int animatedEmojisColorFilterColor;
    private boolean doNotSave;
    private boolean drawAnimatedEmojis;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeMatrix;
    private Paint ellipsizePaint;
    private float ellipsizeWidth;
    private boolean hackClipBounds;
    private StaticLayout layout;
    private float left;
    private float lineSpacingAdd;
    private int maxLines;
    private float maxWidth;
    public final TextPaint paint;
    private View parentView;
    private int vertPad;
    private float width;

    public Text(CharSequence charSequence, TextPaint textPaint) {
        this.maxWidth = 9999.0f;
        this.maxLines = 1;
        this.align = Layout.Alignment.ALIGN_NORMAL;
        this.animatedEmojisCacheType = 0;
        this.ellipsizeWidth = -1.0f;
        this.paint = textPaint;
        setText(charSequence);
    }

    public Text(CharSequence charSequence, float f) {
        this(charSequence, f, null);
    }

    public Text(CharSequence charSequence, float f, Typeface typeface) {
        this.maxWidth = 9999.0f;
        this.maxLines = 1;
        this.align = Layout.Alignment.ALIGN_NORMAL;
        this.animatedEmojisCacheType = 0;
        this.ellipsizeWidth = -1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(f));
        textPaint.setTypeface(typeface);
        setText(charSequence);
    }

    public Text setTextSizePx(float f) {
        this.paint.setTextSize(f);
        return this;
    }

    public Text supportAnimatedEmojis(final View view) {
        this.drawAnimatedEmojis = true;
        this.parentView = view;
        if (view.isAttachedToWindow()) {
            this.animatedEmojis = AnimatedEmojiSpan.update(this.animatedEmojisCacheType, view, this.animatedEmojis, this.layout);
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                Text text = Text.this;
                text.animatedEmojis = AnimatedEmojiSpan.update(text.animatedEmojisCacheType, view, Text.this.animatedEmojis, Text.this.layout);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                AnimatedEmojiSpan.release(view, Text.this.animatedEmojis);
            }
        });
        return this;
    }

    public void detach() {
        AnimatedEmojiSpan.release(this.parentView, this.animatedEmojis);
    }

    public Text setEmojiCacheType(int i) {
        if (this.animatedEmojisCacheType != i) {
            this.animatedEmojisCacheType = i;
            if (this.drawAnimatedEmojis) {
                AnimatedEmojiSpan.release(this.parentView, this.animatedEmojis);
                this.animatedEmojis = AnimatedEmojiSpan.update(this.animatedEmojisCacheType, this.parentView, this.animatedEmojis, this.layout);
            }
        }
        return this;
    }

    public void setText(CharSequence charSequence) {
        if (this.maxLines > 1 && Build.VERSION.SDK_INT >= 23) {
            this.layout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.paint, (int) Math.max(this.maxWidth, 1.0f)).setAlignment(this.align).setMaxLines(this.maxLines).setLineSpacing(this.lineSpacingAdd, 1.0f).build();
        } else {
            this.layout = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.paint, (int) Math.max(this.maxWidth, 1.0f), this.align, 1.0f, this.lineSpacingAdd, false);
        }
        if (this.align == Layout.Alignment.ALIGN_CENTER) {
            this.width = this.layout.getWidth();
            this.left = 0.0f;
        } else {
            this.width = 0.0f;
            this.left = this.layout.getWidth();
            for (int i = 0; i < this.layout.getLineCount(); i++) {
                this.width = Math.max(this.width, this.layout.getLineWidth(i));
                this.left = Math.min(this.left, this.layout.getLineLeft(i));
            }
        }
        View view = this.parentView;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.animatedEmojis = AnimatedEmojiSpan.update(this.animatedEmojisCacheType, this.parentView, this.animatedEmojis, this.layout);
    }

    public float calculateRealWidth() {
        float fMax = 0.0f;
        for (int i = 0; i < this.layout.getLineCount(); i++) {
            fMax = Math.max(fMax, this.layout.getLineWidth(i));
        }
        return fMax;
    }

    public Text multiline(int i) {
        this.maxLines = i;
        setText(this.layout.getText());
        return this;
    }

    public boolean isMultiline() {
        return this.maxLines > 1;
    }

    public Text align(Layout.Alignment alignment) {
        if (this.align != alignment) {
            this.align = alignment;
            setText(this.layout.getText());
        }
        return this;
    }

    public Text lineSpacing(float f) {
        if (this.lineSpacingAdd != f) {
            this.lineSpacingAdd = f;
            setText(this.layout.getText());
        }
        return this;
    }

    public Text setMaxWidth(float f) {
        this.maxWidth = f;
        setText(this.layout.getText());
        return this;
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public Layout getLayout() {
        return this.layout;
    }

    public Text hackClipBounds() {
        this.hackClipBounds = true;
        return this;
    }

    public float getTextSize() {
        return this.paint.getTextSize();
    }

    public Text setColor(int i) {
        this.paint.setColor(i);
        return this;
    }

    public Text setAlpha(int i) {
        this.paint.setAlpha(i);
        return this;
    }

    public Text ellipsize(float f) {
        this.ellipsizeWidth = f;
        return this;
    }

    public void draw(Canvas canvas, float f, float f2, int i, float f3) {
        if (this.layout == null) {
            return;
        }
        this.paint.setColor(i);
        TextPaint textPaint = this.paint;
        textPaint.linkColor = i;
        int alpha = textPaint.getAlpha();
        if (f3 != 1.0f) {
            this.paint.setAlpha((int) (alpha * f3));
        }
        if (!this.doNotSave) {
            canvas.save();
        }
        canvas.translate(f, f2 - (isMultiline() ? 0.0f : this.layout.getHeight() / 2.0f));
        draw(canvas);
        if (!this.doNotSave) {
            canvas.restore();
        }
        this.paint.setAlpha(alpha);
    }

    public void draw(Canvas canvas, float f, float f2) {
        draw(canvas, f, f2, 1.0f);
    }

    public void draw(Canvas canvas, float f, float f2, float f3) {
        if (this.layout == null) {
            return;
        }
        if (!this.doNotSave) {
            canvas.save();
        }
        canvas.translate(f, f2 - (this.maxLines > 1 ? 0.0f : this.layout.getHeight() / 2.0f));
        int alpha = this.paint.getAlpha();
        this.paint.setAlpha((int) (alpha * f3));
        draw(canvas);
        this.paint.setAlpha(alpha);
        if (this.doNotSave) {
            return;
        }
        canvas.restore();
    }

    public Text setVerticalClipPadding(int i) {
        this.vertPad = i;
        return this;
    }

    public Text setShadow(float f) {
        this.paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(-16777216, f));
        return this;
    }

    public void draw(Canvas canvas) {
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null) {
            return;
        }
        if (!this.doNotSave) {
            float f = this.ellipsizeWidth;
            if (f >= 0.0f && this.width > f) {
                canvas.saveLayerAlpha(0.0f, -this.vertPad, f - 1.0f, staticLayout.getHeight() + this.vertPad, 255, 31);
            }
        }
        canvas.save();
        canvas.translate(-this.left, 0.0f);
        if (this.hackClipBounds) {
            canvas.drawText(this.layout.getText().toString(), 0.0f, -this.paint.getFontMetricsInt().ascent, this.paint);
        } else {
            this.layout.draw(canvas);
        }
        if (this.drawAnimatedEmojis) {
            if (this.animatedEmojisColorFilter == null || this.paint.getColor() != this.animatedEmojisColorFilterColor) {
                int color = this.paint.getColor();
                this.animatedEmojisColorFilterColor = color;
                this.animatedEmojisColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.animatedEmojisColorFilter);
        }
        canvas.restore();
        if (this.doNotSave) {
            return;
        }
        float f2 = this.ellipsizeWidth;
        if (f2 < 0.0f || this.width <= f2) {
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
        this.ellipsizeMatrix.postTranslate(this.ellipsizeWidth - AndroidUtilities.dp(8.0f), 0.0f);
        this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
        canvas.drawRect(this.ellipsizeWidth - AndroidUtilities.dp(8.0f), 0.0f, this.ellipsizeWidth, this.layout.getHeight(), this.ellipsizePaint);
        canvas.restore();
        canvas.restore();
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.paint.getFontMetricsInt();
    }

    public float getWidth() {
        float f = this.ellipsizeWidth;
        return f >= 0.0f ? Math.min(f, this.width) : this.width;
    }

    public float getCurrentWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.layout.getHeight();
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null || staticLayout.getText() == null) {
            return "";
        }
        return this.layout.getText();
    }
}
