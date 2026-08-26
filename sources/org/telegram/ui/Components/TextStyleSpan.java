package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class TextStyleSpan extends MetricAffectingSpan {
    public final TextStyleRun style;
    public final int textSize;

    public final class TextStyleRun {
        public int end;
        public int flags;
        public boolean header;
        public int start;
        public TLRPC.MessageEntity urlEntity;

        public TextStyleRun() {
        }

        public final void applyStyle(TextPaint textPaint) {
            Typeface typeface;
            if (this.header) {
                typeface = (this.flags & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            } else {
                int i = this.flags;
                if ((i & 4) == 0 && (i & 2048) == 0) {
                    int i2 = i & 1;
                    if (i2 != 0 && (i & 2) != 0) {
                        typeface = AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
                    } else if (i2 != 0) {
                        typeface = AndroidUtilities.bold();
                    } else {
                        typeface = (i & 2) != 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : null;
                    }
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            }
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            if ((this.flags & 16) != 0) {
                textPaint.setFlags(textPaint.getFlags() | 8);
            } else {
                textPaint.setFlags(textPaint.getFlags() & (-9));
            }
            int i3 = this.flags;
            if ((i3 & 8) == 0 && (i3 & 8192) == 0) {
                textPaint.setFlags(textPaint.getFlags() & (-17));
            } else {
                textPaint.setFlags(textPaint.getFlags() | 16);
            }
            if ((this.flags & 512) != 0) {
                textPaint.bgColor = Theme.getColor(null, Theme.key_chats_archivePullDownBackground, false);
            }
            int i4 = this.flags;
            if ((i4 & 8192) != 0) {
                textPaint.setColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            } else if ((i4 & 4096) != 0) {
                textPaint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            }
        }

        public final void merge(TextStyleRun textStyleRun) {
            TLRPC.MessageEntity messageEntity;
            this.flags |= textStyleRun.flags;
            if (this.urlEntity != null || (messageEntity = textStyleRun.urlEntity) == null) {
                return;
            }
            this.urlEntity = messageEntity;
        }

        public TextStyleRun(TextStyleRun textStyleRun) {
            this.flags = textStyleRun.flags;
            this.start = textStyleRun.start;
            this.end = textStyleRun.end;
            this.urlEntity = textStyleRun.urlEntity;
            this.header = textStyleRun.header;
        }
    }

    public TextStyleSpan(TextStyleRun textStyleRun, int i) {
        this.style = textStyleRun;
        if (i > 0) {
            this.textSize = i;
        }
    }

    public final void applySubSuper(TextPaint textPaint) {
        TextStyleRun textStyleRun = this.style;
        if (BitwiseUtils.hasFlag(textStyleRun.flags, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (BitwiseUtils.hasFlag(textStyleRun.flags, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (BitwiseUtils.hasFlag(textStyleRun.flags, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final TextStyleRun getTextStyleRun() {
        return this.style;
    }

    public final boolean isSpoiler() {
        return (this.style.flags & 256) > 0;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        applySubSuper(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.style.applyStyle(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        applySubSuper(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.style.applyStyle(textPaint);
    }
}
