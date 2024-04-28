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

    public CachedStaticLayout disableCache() {
        this.disabled = true;
        return this;
    }

    public void draw(Canvas canvas) {
        int i;
        RenderNode renderNode;
        if (!this.disabled && canvas.isHardwareAccelerated() && (i = Build.VERSION.SDK_INT) >= 29) {
            if (i < 30 || !canvas.quickReject(0.0f, 0.0f, this.layout.getWidth(), this.layout.getHeight())) {
                if (hasChanges() || (renderNode = this.renderNode) == null || !renderNode.hasDisplayList()) {
                    if (this.renderNode == null) {
                        RenderNode renderNode2 = new RenderNode("CachedStaticLayout");
                        this.renderNode = renderNode2;
                        renderNode2.setClipToBounds(false);
                    }
                    this.renderNode.setPosition(getLayoutBounds());
                    RecordingCanvas beginRecording = this.renderNode.beginRecording();
                    int color = this.layout.getPaint().getColor();
                    this.layout.getPaint().setColor(ColorUtils.setAlphaComponent(color, 255));
                    this.layout.draw(beginRecording);
                    this.layout.getPaint().setColor(color);
                    this.renderNode.endRecording();
                }
                this.renderNode.setAlpha(this.layout.getPaint().getAlpha() / 255.0f);
                canvas.drawRenderNode(this.renderNode);
                return;
            }
            return;
        }
        this.layout.draw(canvas);
    }

    private boolean[] getEmojiLoaded(boolean z) {
        Emoji.EmojiSpan[] emojiSpanArr;
        boolean[] zArr;
        if ((getText() instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) getText()).getSpans(0, getText().length(), Emoji.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            if (z) {
                zArr = new boolean[emojiSpanArr.length];
            } else {
                boolean[] zArr2 = this.tempEmojiLoaded;
                if (zArr2 == null || zArr2.length != emojiSpanArr.length) {
                    this.tempEmojiLoaded = new boolean[emojiSpanArr.length];
                }
                zArr = this.tempEmojiLoaded;
            }
            for (int i = 0; i < emojiSpanArr.length; i++) {
                zArr[i] = (emojiSpanArr[i].getDrawable() instanceof Emoji.EmojiDrawable) && ((Emoji.EmojiDrawable) emojiSpanArr[i].getDrawable()).isLoaded();
            }
            return zArr;
        }
        return null;
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

    private boolean hasChanges() {
        if (!(ColorUtils.setAlphaComponent(this.textColor, 0) != ColorUtils.setAlphaComponent(this.layout.getPaint().getColor(), 0))) {
            if (!(ColorUtils.setAlphaComponent(this.linkColor, 0) != ColorUtils.setAlphaComponent(this.layout.getPaint().linkColor, 0))) {
                if (!(Math.abs(this.textSize - this.layout.getPaint().getTextSize()) > 0.1f)) {
                    if (!(this.typeface != this.layout.getPaint().getTypeface()) && !(!this.lastLayoutBounds.equals(getLayoutBounds())) && !(!emojiLoadedEquals(getEmojiLoaded(false), this.lastEmojiLoaded))) {
                        return false;
                    }
                }
            }
        }
        this.textColor = this.layout.getPaint().getColor();
        this.linkColor = this.layout.getPaint().linkColor;
        this.textSize = this.layout.getPaint().getTextSize();
        this.typeface = this.layout.getPaint().getTypeface();
        this.lastLayoutBounds.set(getLayoutBounds());
        this.lastEmojiLoaded = getEmojiLoaded(true);
        return true;
    }

    private Rect getLayoutBounds() {
        this.bounds.set(0, 0, this.layout.getWidth(), this.layout.getHeight());
        return this.bounds;
    }

    public CharSequence getText() {
        return this.layout.getText();
    }

    public TextPaint getPaint() {
        return this.layout.getPaint();
    }

    public int getWidth() {
        return this.layout.getWidth();
    }

    public int getHeight() {
        return this.layout.getHeight();
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public int getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public float getPrimaryHorizontal(int i) {
        return this.layout.getPrimaryHorizontal(i);
    }

    public int getLineEnd(int i) {
        return this.layout.getLineEnd(i);
    }

    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }
}
