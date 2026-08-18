package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public abstract class StaticLayoutEx {
    public static Layout.Alignment[] alignments = Layout.Alignment.values();

    public static Layout.Alignment ALIGN_RIGHT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static Layout.Alignment ALIGN_LEFT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
    }

    public static StaticLayout createStaticLayout2(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
        }
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z2) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int offsetForHorizontal;
        CharSequence charSequenceAppend = charSequence;
        try {
            if (i3 == 1) {
                try {
                    int iIndexOf = TextUtils.indexOf(charSequenceAppend, "\n") - 1;
                    if (iIndexOf > 0) {
                        charSequenceAppend = SpannableStringBuilder.valueOf(charSequenceAppend.subSequence(0, iIndexOf)).append((CharSequence) "…");
                    }
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceAppend, textPaint, i2, TextUtils.TruncateAt.END);
                    try {
                        return new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, i, alignment, f, f2, z);
                    } catch (Exception e) {
                        e = e;
                        staticLayout = null;
                        FileLog.e(e);
                        return staticLayout;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout2 = StaticLayout.Builder.obtain(charSequenceAppend, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                    for (int i4 = 0; i4 < staticLayout2.getLineCount(); i4++) {
                        if (staticLayout2.getLineRight(i4) > i) {
                            staticLayout2 = StaticLayout.Builder.obtain(charSequenceAppend, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(0).setHyphenationFrequency(0).build();
                            break;
                        }
                    }
                    staticLayout = null;
                } else {
                    staticLayout = null;
                    try {
                        staticLayout2 = new StaticLayout(charSequence, textPaint, i, alignment, f, f2, z);
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (staticLayout2.getLineCount() <= r8) {
                    return staticLayout2;
                }
                int i5 = r8 - 1;
                float lineLeft = staticLayout2.getLineLeft(i5);
                float lineWidth = staticLayout2.getLineWidth(i5);
                if (lineLeft != 0.0f) {
                    offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i5, lineLeft);
                } else {
                    offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i5, lineWidth);
                }
                if (lineWidth < i2 - AndroidUtilities.dp(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceAppend.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder.append((CharSequence) "…");
                if (Build.VERSION.SDK_INT >= 23) {
                    return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? staticLayout : truncateAt).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(z2 ? 1 : 0).setHyphenationFrequency(0).build();
                }
                return new StaticLayout(spannableStringBuilder, textPaint, i, alignment, f, f2, z);
            }
        } catch (Exception e4) {
            e = e4;
            staticLayout = null;
        }
        FileLog.e(e);
        return staticLayout;
    }
}
