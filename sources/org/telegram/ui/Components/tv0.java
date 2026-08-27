package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public abstract class tv0 {

    public static final Layout.Alignment[] f32901a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = f32901a;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i10, float f10, int i11, int i12) {
        return c(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, f10, false, TextUtils.TruncateAt.END, i11, i12, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, boolean z10, TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z11) {
        StaticLayout staticLayout;
        try {
            if (i12 == 1) {
                int iIndexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(iIndexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, iIndexOf)).append((CharSequence) "…") : charSequence, textPaint, i11, TextUtils.TruncateAt.END);
                return new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, i10, alignment, 1.0f, f10, z10);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build();
                for (int i13 = 0; i13 < staticLayout.getLineCount(); i13++) {
                    if (staticLayout.getLineRight(i13) > i10) {
                        staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i10, alignment, 1.0f, f10, z10);
            }
            if (staticLayout.getLineCount() <= i12) {
                return staticLayout;
            }
            int i14 = i12 - 1;
            float lineLeft = staticLayout.getLineLeft(i14);
            float lineWidth = staticLayout.getLineWidth(i14);
            int offsetForHorizontal = lineLeft != 0.0f ? staticLayout.getOffsetForHorizontal(i14, lineLeft) : staticLayout.getOffsetForHorizontal(i14, lineWidth);
            if (lineWidth < i11 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append((CharSequence) "…");
            if (Build.VERSION.SDK_INT >= 23) {
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(((t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class)).length > 0 ? null : truncateAt).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(z11 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i10, alignment, 1.0f, f10, z10);
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, int i10, boolean z10, int i11, int i12) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return Build.VERSION.SDK_INT >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setEllipsize(truncateAt).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build() : c(charSequence, textPaint, i10, alignment, 0.0f, z10, truncateAt, i11, i12, true);
    }
}
