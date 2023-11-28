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
        int i4;
        CharSequence charSequence2;
        int i5;
        StaticLayout staticLayout2;
        TextUtils.TruncateAt truncateAt2;
        int offsetForHorizontal;
        CharSequence charSequence3 = charSequence;
        try {
            if (i3 == 1) {
                int indexOf = TextUtils.indexOf(charSequence3, "\n") - 1;
                SpannableStringBuilder spannableStringBuilder = charSequence3;
                if (indexOf > 0) {
                    spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence3.subSequence(0, indexOf)).append((CharSequence) "…");
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, i2, TextUtils.TruncateAt.END);
                try {
                    return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i, alignment, f, f2, z);
                } catch (Exception e) {
                    e = e;
                    staticLayout = 0;
                }
            } else {
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23) {
                    staticLayout2 = StaticLayout.Builder.obtain(charSequence3, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                    i4 = i6;
                    truncateAt2 = null;
                    charSequence2 = "…";
                    i5 = i3;
                } else {
                    i4 = i6;
                    staticLayout = 0;
                    charSequence2 = "…";
                    i5 = i3;
                    try {
                        staticLayout2 = new StaticLayout(charSequence, textPaint, i, alignment, f, f2, z);
                        truncateAt2 = staticLayout;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                if (staticLayout2.getLineCount() <= i5) {
                    return staticLayout2;
                }
                int i7 = i5 - 1;
                float lineLeft = staticLayout2.getLineLeft(i7);
                float lineWidth = staticLayout2.getLineWidth(i7);
                if (lineLeft != 0.0f) {
                    offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i7, lineLeft);
                } else {
                    offsetForHorizontal = staticLayout2.getOffsetForHorizontal(i7, lineWidth);
                }
                if (lineWidth < i2 - AndroidUtilities.dp(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence3.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder2.append(charSequence2);
                if (i4 >= 23) {
                    return StaticLayout.Builder.obtain(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(z).setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), AnimatedEmojiSpan.class)).length > 0 ? truncateAt2 : truncateAt).setEllipsizedWidth(i2).setMaxLines(i5).setBreakStrategy(z2 ? 1 : 0).setHyphenationFrequency(0).build();
                }
                return new StaticLayout(spannableStringBuilder2, textPaint, i, alignment, f, f2, z);
            }
        } catch (Exception e3) {
            e = e3;
            staticLayout = 0;
        }
        FileLog.e(e);
        return staticLayout;
    }
}
