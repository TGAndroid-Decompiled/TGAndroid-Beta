package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class TextStyleSpan extends MetricAffectingSpan {
    private int color;
    private TextStyleRun style;
    private int textSize;

    public static class TextStyleRun {
        public int end;
        public int flags;
        public int start;
        public TLRPC.MessageEntity urlEntity;

        public TextStyleRun() {
        }

        public TextStyleRun(TextStyleRun textStyleRun) {
            this.flags = textStyleRun.flags;
            this.start = textStyleRun.start;
            this.end = textStyleRun.end;
            this.urlEntity = textStyleRun.urlEntity;
        }

        public void applyStyle(TextPaint textPaint) {
            Typeface typeface = getTypeface();
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            textPaint.setFlags((this.flags & 16) != 0 ? textPaint.getFlags() | 8 : textPaint.getFlags() & (-9));
            textPaint.setFlags((this.flags & 8) != 0 ? textPaint.getFlags() | 16 : textPaint.getFlags() & (-17));
            if ((this.flags & 512) != 0) {
                textPaint.bgColor = Theme.getColor(Theme.key_chats_archivePullDownBackground);
            }
        }

        public Typeface getTypeface() {
            String str;
            int i = this.flags;
            if ((i & 4) != 0 || (i & 2048) != 0) {
                return Typeface.MONOSPACE;
            }
            int i2 = i & 1;
            if (i2 != 0 && (i & 2) != 0) {
                str = "fonts/rmediumitalic.ttf";
            } else {
                if (i2 != 0) {
                    return AndroidUtilities.bold();
                }
                if ((i & 2) == 0) {
                    return null;
                }
                str = "fonts/ritalic.ttf";
            }
            return AndroidUtilities.getTypeface(str);
        }

        public void merge(TextStyleRun textStyleRun) {
            TLRPC.MessageEntity messageEntity;
            this.flags |= textStyleRun.flags;
            if (this.urlEntity != null || (messageEntity = textStyleRun.urlEntity) == null) {
                return;
            }
            this.urlEntity = messageEntity;
        }

        public void replace(TextStyleRun textStyleRun) {
            this.flags = textStyleRun.flags;
            this.urlEntity = textStyleRun.urlEntity;
        }
    }

    public TextStyleSpan(TextStyleRun textStyleRun) {
        this(textStyleRun, 0, 0);
    }

    public TextStyleSpan(TextStyleRun textStyleRun, int i, int i2) {
        this.style = textStyleRun;
        if (i > 0) {
            this.textSize = i;
        }
        this.color = i2;
    }

    public int getStyleFlags() {
        return this.style.flags;
    }

    public TextStyleRun getTextStyleRun() {
        return this.style;
    }

    public boolean isSpoiler() {
        return (this.style.flags & 256) > 0;
    }

    public void setSpoilerRevealed(boolean z) {
        TextStyleRun textStyleRun;
        int i;
        if (z) {
            textStyleRun = this.style;
            i = textStyleRun.flags | 512;
        } else {
            textStyleRun = this.style;
            i = textStyleRun.flags & (-513);
        }
        textStyleRun.flags = i;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        int i2 = this.color;
        if (i2 != 0) {
            textPaint.setColor(i2);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.style.applyStyle(textPaint);
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.style.applyStyle(textPaint);
    }
}
