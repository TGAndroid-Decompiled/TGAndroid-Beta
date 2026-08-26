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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class Text {
    public Layout.Alignment align;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojis;
    public int animatedEmojisCacheType;
    public PorterDuffColorFilter animatedEmojisColorFilter;
    public int animatedEmojisColorFilterColor;
    public boolean drawAnimatedEmojis;
    public LinearGradient ellipsizeGradient;
    public Matrix ellipsizeMatrix;
    public Paint ellipsizePaint;
    public float ellipsizeWidth;
    public boolean hackClipBounds;
    public StaticLayout layout;
    public float left;
    public float lineSpacingAdd;
    public int maxLines;
    public float maxWidth;
    public final TextPaint paint;
    public View parentView;
    public int vertPad;
    public float width;

    public final class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$view;

        public AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$view = obj2;
        }

        @Override
        public final void onViewAttachedToWindow(View view) {
            Object obj = this.this$0;
            Object obj2 = this.val$view;
            switch (this.$r8$classId) {
                case 0:
                    Text text = (Text) obj;
                    text.animatedEmojis = AnimatedEmojiSpan.update(text.animatedEmojisCacheType, (View) obj2, text.animatedEmojis, text.layout);
                    break;
                default:
                    BlurringShader.BlurManager blurManager = (BlurringShader.BlurManager) obj2;
                    if (blurManager != null) {
                        blurManager.holders.add((BlurringShader.StoryBlurDrawer) obj);
                    }
                    break;
            }
        }

        @Override
        public final void onViewDetachedFromWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    AnimatedEmojiSpan.release((View) this.val$view, ((Text) this.this$0).animatedEmojis);
                    break;
                default:
                    BlurringShader.StoryBlurDrawer storyBlurDrawer = (BlurringShader.StoryBlurDrawer) this.this$0;
                    BlurringShader.BlurManager blurManager = (BlurringShader.BlurManager) this.val$view;
                    if (blurManager != null) {
                        ArrayList arrayList = blurManager.holders;
                        arrayList.remove(storyBlurDrawer);
                        if (blurManager.invalidateHolders.isEmpty() && arrayList.isEmpty()) {
                            blurManager.thumbBlurer.destroy();
                        }
                    }
                    storyBlurDrawer.lastBitmap = null;
                    Paint paint = storyBlurDrawer.paint;
                    storyBlurDrawer.bitmapShader = null;
                    paint.setShader(null);
                    break;
            }
        }
    }

    public Text(CharSequence charSequence, TextPaint textPaint) {
        this.maxWidth = 9999.0f;
        this.maxLines = 1;
        this.align = Layout.Alignment.ALIGN_NORMAL;
        this.animatedEmojisCacheType = 0;
        this.ellipsizeWidth = -1.0f;
        this.paint = textPaint;
        setText(charSequence);
    }

    public final void align() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (this.align != alignment) {
            this.align = alignment;
            setText(this.layout.getText());
        }
    }

    public final void draw(float f, float f2, float f3, int i, Canvas canvas) {
        if (this.layout == null) {
            return;
        }
        TextPaint textPaint = this.paint;
        textPaint.setColor(i);
        textPaint.linkColor = i;
        int alpha = textPaint.getAlpha();
        if (f3 != 1.0f) {
            textPaint.setAlpha((int) (alpha * f3));
        }
        canvas.save();
        canvas.translate(f, f2 - (this.maxLines > 1 ? 0.0f : this.layout.getHeight() / 2.0f));
        draw(canvas);
        canvas.restore();
        textPaint.setAlpha(alpha);
    }

    public final void ellipsize(float f) {
        this.ellipsizeWidth = f;
    }

    public final float getCurrentWidth() {
        return this.width;
    }

    public final Paint.FontMetricsInt getFontMetricsInt() {
        return this.paint.getFontMetricsInt();
    }

    public final float getHeight() {
        return this.layout.getHeight();
    }

    public final CharSequence getText() {
        StaticLayout staticLayout = this.layout;
        return (staticLayout == null || staticLayout.getText() == null) ? "" : this.layout.getText();
    }

    public final float getWidth() {
        float f = this.ellipsizeWidth;
        return f >= 0.0f ? Math.min(f, this.width) : this.width;
    }

    public final void setText(CharSequence charSequence) {
        if (this.maxLines <= 1 || Build.VERSION.SDK_INT < 23) {
            this.layout = new StaticLayout(AndroidUtilities.replaceNewLines(charSequence), this.paint, (int) Math.max(this.maxWidth, 1.0f), this.align, 1.0f, this.lineSpacingAdd, false);
        } else {
            this.layout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.paint, (int) Math.max(this.maxWidth, 1.0f)).setAlignment(this.align).setMaxLines(this.maxLines).setLineSpacing(this.lineSpacingAdd, 1.0f).build();
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

    public final void supportAnimatedEmojis(View view) {
        int i = 0;
        this.drawAnimatedEmojis = true;
        this.parentView = view;
        if (view.isAttachedToWindow()) {
            this.animatedEmojis = AnimatedEmojiSpan.update(this.animatedEmojisCacheType, view, this.animatedEmojis, this.layout);
        }
        view.addOnAttachStateChangeListener(new AnonymousClass1(i, this, view));
    }

    public Text(String str, float f) {
        this(str, f, null);
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

    public final void draw(Canvas canvas, float f, float f2, float f3) {
        if (this.layout == null) {
            return;
        }
        canvas.save();
        canvas.translate(f, f2 - (this.maxLines > 1 ? 0.0f : this.layout.getHeight() / 2.0f));
        TextPaint textPaint = this.paint;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (alpha * f3));
        draw(canvas);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void draw(Canvas canvas) {
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null) {
            return;
        }
        float f = this.ellipsizeWidth;
        if (f >= 0.0f && this.width > f) {
            canvas.saveLayerAlpha(0.0f, -this.vertPad, f - 1.0f, staticLayout.getHeight() + this.vertPad, 255, 31);
        }
        canvas.save();
        canvas.translate(-this.left, 0.0f);
        boolean z = this.hackClipBounds;
        TextPaint textPaint = this.paint;
        if (z) {
            canvas.drawText(this.layout.getText().toString(), 0.0f, -textPaint.getFontMetricsInt().ascent, textPaint);
        } else {
            this.layout.draw(canvas);
        }
        if (this.drawAnimatedEmojis) {
            if (this.animatedEmojisColorFilter == null || textPaint.getColor() != this.animatedEmojisColorFilterColor) {
                int color = textPaint.getColor();
                this.animatedEmojisColorFilterColor = color;
                this.animatedEmojisColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.animatedEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.animatedEmojisColorFilter);
        }
        canvas.restore();
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
}
