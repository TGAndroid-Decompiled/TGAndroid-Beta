package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.Emoji;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;

public class CachedStaticLayout {
    private boolean disabled;
    private boolean[] lastEmojiLoaded;
    public final StaticLayout layout;
    private int linkColor;
    private RenderNode renderNode;
    private boolean[] tempEmojiLoaded;
    private int textColor;
    private float textSize;
    private Typeface typeface;
    private final Rect lastLayoutBounds = new Rect();
    private final Rect bounds = new Rect();

    public CachedStaticLayout(StaticLayout staticLayout) {
        this.layout = staticLayout;
    }

    private boolean emojiLoadedEquals(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null && zArr2 == null) {
            return true;
        }
        if ((zArr == null ? 0 : zArr.length) != (zArr2 == null ? 0 : zArr2.length)) {
            return false;
        }
        int length = zArr == null ? 0 : zArr.length;
        for (int i = 0; i < length; i++) {
            if (zArr[i] != zArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean[] getEmojiLoaded() {
        Emoji.EmojiSpan[] emojiSpanArr;
        if (!(getText() instanceof Spanned) || (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) getText()).getSpans(0, getText().length(), Emoji.EmojiSpan.class)) == null || emojiSpanArr.length <= 0) {
            return null;
        }
        boolean[] zArr = this.tempEmojiLoaded;
        if (zArr == null || zArr.length != emojiSpanArr.length) {
            this.tempEmojiLoaded = new boolean[emojiSpanArr.length];
        }
        for (int i = 0; i < emojiSpanArr.length; i++) {
            this.tempEmojiLoaded[i] = (emojiSpanArr[i].getDrawable() instanceof Emoji.EmojiDrawable) && ((Emoji.EmojiDrawable) emojiSpanArr[i].getDrawable()).isLoaded();
        }
        return this.tempEmojiLoaded;
    }

    private Rect getLayoutBounds() {
        this.bounds.set(0, 0, this.layout.getWidth(), this.layout.getHeight());
        return this.bounds;
    }

    private boolean hasChanges() {
        boolean[] emojiLoaded;
        if (ColorUtils.setAlphaComponent(this.textColor, 255) == ColorUtils.setAlphaComponent(this.layout.getPaint().getColor(), 255) && ColorUtils.setAlphaComponent(this.linkColor, 255) == ColorUtils.setAlphaComponent(this.layout.getPaint().linkColor, 255) && Math.abs(this.textSize - this.layout.getPaint().getTextSize()) <= 0.1f && this.typeface == this.layout.getPaint().getTypeface() && this.lastLayoutBounds.equals(getLayoutBounds())) {
            emojiLoaded = getEmojiLoaded();
            if (emojiLoadedEquals(emojiLoaded, this.lastEmojiLoaded)) {
                return false;
            }
        } else {
            emojiLoaded = null;
        }
        this.textColor = this.layout.getPaint().getColor();
        this.linkColor = this.layout.getPaint().linkColor;
        this.textSize = this.layout.getPaint().getTextSize();
        this.typeface = this.layout.getPaint().getTypeface();
        this.lastLayoutBounds.set(getLayoutBounds());
        if (emojiLoaded == null) {
            return true;
        }
        this.lastEmojiLoaded = (boolean[]) emojiLoaded.clone();
        return true;
    }

    public CachedStaticLayout disableCache() {
        this.disabled = true;
        return this;
    }

    public void draw(Canvas canvas) {
        int i;
        RenderNode renderNode;
        if (this.disabled || !canvas.isHardwareAccelerated() || (i = Build.VERSION.SDK_INT) < 29) {
            this.layout.draw(canvas);
            return;
        }
        if (i < 30 || !canvas.quickReject(0.0f, 0.0f, this.layout.getWidth(), this.layout.getHeight())) {
            if (hasChanges() || (renderNode = this.renderNode) == null || !renderNode.hasDisplayList()) {
                if (this.renderNode == null) {
                    RenderNode renderNodeM$3 = Theme$$ExternalSyntheticApiModelOutline3.m$3();
                    this.renderNode = renderNodeM$3;
                    renderNodeM$3.setClipToBounds(false);
                }
                this.renderNode.setPosition(getLayoutBounds());
                RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
                int color = this.layout.getPaint().getColor();
                this.layout.getPaint().setColor(ColorUtils.setAlphaComponent(color, 255));
                this.layout.draw(recordingCanvasBeginRecording);
                this.layout.getPaint().setColor(color);
                this.renderNode.endRecording();
            }
            this.renderNode.setAlpha(this.layout.getPaint().getAlpha() / 255.0f);
            canvas.drawRenderNode(this.renderNode);
        }
    }

    public int getHeight() {
        return this.layout.getHeight();
    }

    public int getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public int getLineEnd(int i) {
        return this.layout.getLineEnd(i);
    }

    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public int getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public TextPaint getPaint() {
        return this.layout.getPaint();
    }

    public float getPrimaryHorizontal(int i) {
        return this.layout.getPrimaryHorizontal(i);
    }

    public CharSequence getText() {
        return this.layout.getText();
    }

    public int getWidth() {
        return this.layout.getWidth();
    }
}
