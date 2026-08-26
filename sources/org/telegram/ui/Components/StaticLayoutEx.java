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
    public static final Layout.Alignment[] alignments = Layout.Alignment.values();

    public static Layout.Alignment ALIGN_RIGHT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, float f, int i2, int i3) {
        return createStaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, f, false, TextUtils.TruncateAt.END, i2, i3, true);
    }

    public static StaticLayout createStaticLayout2(CharSequence charSequence, TextPaint textPaint, int i, boolean z, int i2, int i3) {
        return Build.VERSION.SDK_INT >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build() : createStaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 0.0f, z, TextUtils.TruncateAt.END, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z2) {
        StaticLayout staticLayout;
        try {
            if (i3 == 1) {
                int iIndexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(iIndexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, iIndexOf)).append((CharSequence) "…") : charSequence, textPaint, i2, TextUtils.TruncateAt.END);
                return new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, i, alignment, 1.0f, f, z);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(1).setHyphenationFrequency(0).build();
                for (int i4 = 0; i4 < staticLayout.getLineCount(); i4++) {
                    if (staticLayout.getLineRight(i4) > i) {
                        staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(z).setEllipsize(null).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f, z);
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
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i).setAlignment(alignment).setLineSpacing(f, 1.0f).setIncludePad(z).setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? null : truncateAt).setEllipsizedWidth(i2).setMaxLines(i3).setBreakStrategy(z2 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i, alignment, 1.0f, f, z);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
