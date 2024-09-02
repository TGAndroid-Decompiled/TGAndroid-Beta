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
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 23) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(f2, f);
            includePad = lineSpacing.setIncludePad(z);
            ellipsize = includePad.setEllipsize(TextUtils.TruncateAt.END);
            ellipsizedWidth = ellipsize.setEllipsizedWidth(i2);
            maxLines = ellipsizedWidth.setMaxLines(i3);
            breakStrategy = maxLines.setBreakStrategy(1);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
            build = hyphenationFrequency.build();
            return build;
        }
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z2) {
        StaticLayout staticLayout;
        Object obj;
        CharSequence ellipsize;
        CharSequence charSequence2;
        int i4;
        StaticLayout staticLayout2;
        TextUtils.TruncateAt truncateAt2;
        int offsetForHorizontal;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize2;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout build;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder alignment3;
        StaticLayout.Builder lineSpacing2;
        StaticLayout.Builder includePad2;
        StaticLayout.Builder ellipsize3;
        StaticLayout.Builder ellipsizedWidth2;
        StaticLayout.Builder maxLines2;
        StaticLayout.Builder breakStrategy2;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout.Builder obtain3;
        StaticLayout.Builder alignment4;
        StaticLayout.Builder lineSpacing3;
        StaticLayout.Builder includePad3;
        StaticLayout.Builder ellipsize4;
        StaticLayout.Builder ellipsizedWidth3;
        StaticLayout.Builder maxLines3;
        StaticLayout.Builder breakStrategy3;
        StaticLayout.Builder hyphenationFrequency3;
        CharSequence charSequence3 = charSequence;
        try {
            if (i3 == 1) {
                try {
                    int indexOf = TextUtils.indexOf(charSequence3, "\n") - 1;
                    if (indexOf > 0) {
                        charSequence3 = SpannableStringBuilder.valueOf(charSequence3.subSequence(0, indexOf)).append((CharSequence) "…");
                    }
                    ellipsize = TextUtils.ellipsize(charSequence3, textPaint, i2, TextUtils.TruncateAt.END);
                    obj = null;
                } catch (Exception e) {
                    e = e;
                    obj = null;
                }
                try {
                    return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i, alignment, f, f2, z);
                } catch (Exception e2) {
                    e = e2;
                    staticLayout = obj;
                    FileLog.e(e);
                    return staticLayout;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                obtain2 = StaticLayout.Builder.obtain(charSequence3, 0, charSequence.length(), textPaint, i);
                alignment3 = obtain2.setAlignment(alignment);
                lineSpacing2 = alignment3.setLineSpacing(f2, f);
                includePad2 = lineSpacing2.setIncludePad(z);
                ellipsize3 = includePad2.setEllipsize(null);
                ellipsizedWidth2 = ellipsize3.setEllipsizedWidth(i2);
                maxLines2 = ellipsizedWidth2.setMaxLines(i3);
                breakStrategy2 = maxLines2.setBreakStrategy(1);
                hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(0);
                staticLayout2 = hyphenationFrequency2.build();
                int i5 = 0;
                while (true) {
                    if (i5 >= staticLayout2.getLineCount()) {
                        break;
                    }
                    if (staticLayout2.getLineRight(i5) > i) {
                        obtain3 = StaticLayout.Builder.obtain(charSequence3, 0, charSequence.length(), textPaint, i);
                        alignment4 = obtain3.setAlignment(alignment);
                        lineSpacing3 = alignment4.setLineSpacing(f2, f);
                        includePad3 = lineSpacing3.setIncludePad(z);
                        ellipsize4 = includePad3.setEllipsize(null);
                        ellipsizedWidth3 = ellipsize4.setEllipsizedWidth(i2);
                        maxLines3 = ellipsizedWidth3.setMaxLines(i3);
                        breakStrategy3 = maxLines3.setBreakStrategy(0);
                        hyphenationFrequency3 = breakStrategy3.setHyphenationFrequency(0);
                        staticLayout2 = hyphenationFrequency3.build();
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append(charSequence2);
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i);
                alignment2 = obtain.setAlignment(alignment);
                lineSpacing = alignment2.setLineSpacing(f2, f);
                includePad = lineSpacing.setIncludePad(z);
                ellipsize2 = includePad.setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? truncateAt2 : truncateAt);
                ellipsizedWidth = ellipsize2.setEllipsizedWidth(i2);
                maxLines = ellipsizedWidth.setMaxLines(i4);
                breakStrategy = maxLines.setBreakStrategy(z2 ? 1 : 0);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
                build = hyphenationFrequency.build();
                return build;
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
