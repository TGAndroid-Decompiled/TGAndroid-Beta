package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public class StaticLayoutEx {
    public static Layout.Alignment[] alignments = Layout.Alignment.values();

    public static Layout.Alignment ALIGN_LEFT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
    }

    public static Layout.Alignment ALIGN_RIGHT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout2(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        if (Build.VERSION.SDK_INT < 23) {
            return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
        }
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        return includePad.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
    }

    public static void init() {
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z2) {
        TextUtils.TruncateAt truncateAt2;
        StaticLayout staticLayout;
        try {
            if (i3 == 1) {
                int iIndexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(iIndexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, iIndexOf)).append((CharSequence) "…") : charSequence, textPaint, i2, TextUtils.TruncateAt.END);
                return new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, i, alignment, f, f2, z);
            }
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= staticLayout.getLineCount()) {
                            truncateAt2 = null;
                            break;
                        }
                        truncateAt2 = null;
                        if (staticLayout.getLineRight(i4) > i) {
                            staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(0).setHyphenationFrequency(0).build();
                            break;
                        }
                        i4++;
                    }
                } else {
                    truncateAt2 = null;
                    staticLayout = new StaticLayout(charSequence, textPaint, i, alignment, f, f2, z);
                }
                if (staticLayout.getLineCount() <= i3) {
                    return staticLayout;
                }
                int i5 = i3 - 1;
                float lineLeft = staticLayout.getLineLeft(i5);
                float lineWidth = staticLayout.getLineWidth(i5);
                int offsetForHorizontal = lineLeft != 0.0f ? staticLayout.getOffsetForHorizontal(i5, lineLeft) : staticLayout.getOffsetForHorizontal(i5, lineWidth);
                if (lineWidth < i2 - AndroidUtilities.dp(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder.append((CharSequence) "…");
                if (Build.VERSION.SDK_INT >= 23) {
                    return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? truncateAt2 : truncateAt).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(z2 ? 1 : 0).setHyphenationFrequency(0).build();
                }
                return new StaticLayout(spannableStringBuilder, textPaint, i, alignment, f, f2, z);
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
