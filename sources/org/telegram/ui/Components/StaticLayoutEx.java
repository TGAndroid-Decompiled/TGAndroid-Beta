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
        Object obj;
        CharSequence charSequenceEllipsize;
        CharSequence charSequence2;
        int i4;
        StaticLayout staticLayout2;
        TextUtils.TruncateAt truncateAt2;
        int offsetForHorizontal;
        CharSequence charSequenceAppend = charSequence;
        try {
            if (i3 == 1) {
                try {
                    int iIndexOf = TextUtils.indexOf(charSequenceAppend, "\n") - 1;
                    if (iIndexOf > 0) {
                        charSequenceAppend = SpannableStringBuilder.valueOf(charSequenceAppend.subSequence(0, iIndexOf)).append((CharSequence) "…");
                    }
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceAppend, textPaint, i2, TextUtils.TruncateAt.END);
                    obj = null;
                } catch (Exception e) {
                    e = e;
                    obj = null;
                }
                try {
                    return new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, i, alignment, f, f2, z);
                } catch (Exception e2) {
                    e = e2;
                    staticLayout = obj;
                    FileLog.e(e);
                    return staticLayout;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout2 = StaticLayout.Builder.obtain(charSequenceAppend, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i5 = 0;
                while (true) {
                    if (i5 >= staticLayout2.getLineCount()) {
                        break;
                    }
                    if (staticLayout2.getLineRight(i5) > i) {
                        staticLayout2 = StaticLayout.Builder.obtain(charSequenceAppend, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                    i5++;
                }
                truncateAt2 = null;
                charSequence2 = "…";
                i4 = i3;
            } else {
                TextUtils.TruncateAt truncateAt3 = null;
                charSequence2 = "…";
                i4 = i3;
                try {
                    staticLayout2 = new StaticLayout(charSequence, textPaint, i, alignment, f, f2, z);
                    truncateAt2 = truncateAt3;
                } catch (Exception e3) {
                    e = e3;
                    staticLayout = truncateAt3;
                }
            }
            if (staticLayout2.getLineCount() <= i4) {
                return staticLayout2;
            }
            int i6 = i4 - 1;
            float lineLeft = staticLayout2.getLineLeft(i6);
            float lineWidth = staticLayout2.getLineWidth(i6);
            if (lineLeft != 0.0f) {
                offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i6, lineLeft);
            } else {
                offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i6, lineWidth);
            }
            if (lineWidth < i2 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceAppend.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append(charSequence2);
            if (Build.VERSION.SDK_INT >= 23) {
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? truncateAt2 : truncateAt).setEllipsizedWidth(i2).setMaxLines(i4).setBreakStrategy(z2 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i, alignment, f, f2, z);
        } catch (Exception e4) {
            e = e4;
            staticLayout = 0;
        }
        FileLog.e(e);
        return staticLayout;
    }
}
