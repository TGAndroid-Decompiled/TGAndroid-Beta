package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class TextStyleSpan extends MetricAffectingSpan {
    public static final int FLAG_STYLE_ACCENT = 4096;
    public static final int FLAG_STYLE_BOLD = 1;
    public static final int FLAG_STYLE_CODE = 2048;
    public static final int FLAG_STYLE_ITALIC = 2;
    public static final int FLAG_STYLE_MARKED = 65536;
    public static final int FLAG_STYLE_MENTION = 64;
    public static final int FLAG_STYLE_MONO = 4;
    public static final int FLAG_STYLE_QUOTE = 32;
    public static final int FLAG_STYLE_SPOILER = 256;
    public static final int FLAG_STYLE_SPOILER_REVEALED = 512;
    public static final int FLAG_STYLE_STRIKE = 8;
    public static final int FLAG_STYLE_STRIKE_RED = 8192;
    public static final int FLAG_STYLE_SUBSCRIPT = 16384;
    public static final int FLAG_STYLE_SUPERSCRIPT = 32768;
    public static final int FLAG_STYLE_TEXT_URL = 1024;
    public static final int FLAG_STYLE_UNDERLINE = 16;
    public static final int FLAG_STYLE_URL = 128;
    private int color;
    private TextStyleRun style;
    private int textSize;

    public static class TextStyleRun {
        public int end;
        public int flags;
        public boolean header;
        public String lng;
        public int start;
        public TLRPC.MessageEntity urlEntity;

        public TextStyleRun() {
        }

        public void applyStyle(TextPaint textPaint) {
            Typeface typeface = getTypeface();
            if (typeface != null) {
                textPaint.setTypeface(typeface);
            }
            if ((this.flags & 16) != 0) {
                textPaint.setFlags(textPaint.getFlags() | 8);
            } else {
                textPaint.setFlags(textPaint.getFlags() & (-9));
            }
            int i = this.flags;
            if ((i & 8) == 0 && (i & 8192) == 0) {
                textPaint.setFlags(textPaint.getFlags() & (-17));
            } else {
                textPaint.setFlags(textPaint.getFlags() | 16);
            }
            if ((this.flags & 512) != 0) {
                textPaint.bgColor = Theme.getColor(null, Theme.key_chats_archivePullDownBackground, false);
            }
            int i2 = this.flags;
            if ((i2 & 8192) != 0) {
                textPaint.setColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            } else if ((i2 & 4096) != 0) {
                textPaint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            }
        }

        public Typeface getTypeface() {
            if (this.header) {
                return (this.flags & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface("fonts/mw_bold.ttf");
            }
            int i = this.flags;
            if ((i & 4) != 0 || (i & 2048) != 0) {
                return Typeface.MONOSPACE;
            }
            int i2 = i & 1;
            if (i2 != 0 && (i & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
            }
            if (i2 != 0) {
                return AndroidUtilities.bold();
            }
            if ((i & 2) != 0) {
                return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
            }
            return null;
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

        public TextStyleRun(TextStyleRun textStyleRun) {
            this.flags = textStyleRun.flags;
            this.start = textStyleRun.start;
            this.end = textStyleRun.end;
            this.urlEntity = textStyleRun.urlEntity;
            this.header = textStyleRun.header;
        }
    }

    public TextStyleSpan(TextStyleRun textStyleRun) {
        this(textStyleRun, 0, 0);
    }

    private void applySubSuper(TextPaint textPaint) {
        if (BitwiseUtils.hasFlag(this.style.flags, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (BitwiseUtils.hasFlag(this.style.flags, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (BitwiseUtils.hasFlag(this.style.flags, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public int getStyleFlags() {
        return this.style.flags;
    }

    public TextStyleRun getTextStyleRun() {
        return this.style;
    }

    public Typeface getTypeface() {
        return this.style.getTypeface();
    }

    public boolean isBold() {
        return this.style.getTypeface() == AndroidUtilities.bold();
    }

    public boolean isBoldItalic() {
        return this.style.getTypeface() == AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf");
    }

    public boolean isItalic() {
        return this.style.getTypeface() == AndroidUtilities.getTypeface("fonts/ritalic.ttf");
    }

    public boolean isMono() {
        return this.style.getTypeface() == Typeface.MONOSPACE;
    }

    public boolean isSpoiler() {
        return (this.style.flags & 256) > 0;
    }

    public boolean isSpoilerRevealed() {
        return (this.style.flags & 512) > 0;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setSpoilerRevealed(boolean z) {
        if (z) {
            this.style.flags |= 512;
        } else {
            this.style.flags &= -513;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i = this.textSize;
        if (i != 0) {
            textPaint.setTextSize(i);
        }
        applySubSuper(textPaint);
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
        applySubSuper(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.style.applyStyle(textPaint);
    }

    public TextStyleSpan(TextStyleRun textStyleRun, int i) {
        this(textStyleRun, i, 0);
    }

    public TextStyleSpan(TextStyleRun textStyleRun, int i, int i2) {
        this.style = textStyleRun;
        if (i > 0) {
            this.textSize = i;
        }
        this.color = i2;
    }
}
