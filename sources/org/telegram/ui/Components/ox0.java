package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public abstract class ox0 {
    public static final Layout.Alignment[] f29546a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = f29546a;
        if (alignmentArr.length >= 5) {
            return alignmentArr[4];
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i10, float f7, int i11, int i12) {
        return c(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, f7, TextUtils.TruncateAt.END, i11, i12, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f7, TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z10) {
        int offsetForHorizontal;
        TextUtils.TruncateAt truncateAt2;
        SpannableStringBuilder spannableStringBuilder = charSequence;
        try {
            if (i12 == 1) {
                int indexOf = TextUtils.indexOf(spannableStringBuilder, "\n") - 1;
                if (indexOf > 0) {
                    spannableStringBuilder = SpannableStringBuilder.valueOf(spannableStringBuilder.subSequence(0, indexOf)).append((CharSequence) "…");
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, i11, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i10, alignment, 1.0f, f7, false);
            }
            StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f7, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build();
            int i13 = 0;
            while (true) {
                if (i13 >= build.getLineCount()) {
                    break;
                } else if (build.getLineRight(i13) > i10) {
                    build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f7, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(0).setHyphenationFrequency(0).build();
                    break;
                } else {
                    i13++;
                }
            }
            if (build.getLineCount() <= i12) {
                return build;
            }
            int i14 = i12 - 1;
            float lineLeft = build.getLineLeft(i14);
            float lineWidth = build.getLineWidth(i14);
            if (lineLeft != 0.0f) {
                offsetForHorizontal = build.getOffsetForHorizontal(i14, lineLeft);
            } else {
                offsetForHorizontal = build.getOffsetForHorizontal(i14, lineWidth);
            }
            if (lineWidth < i11 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder2.append((CharSequence) "…");
            StaticLayout.Builder includePad = StaticLayout.Builder.obtain(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f7, 1.0f).setIncludePad(false);
            if (((b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), b6.class)).length > 0) {
                truncateAt2 = null;
            } else {
                truncateAt2 = truncateAt;
            }
            return includePad.setEllipsize(truncateAt2).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(z10 ? 1 : 0).setHyphenationFrequency(0).build();
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, boolean z10, int i10, int i11) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(1).setHyphenationFrequency(0).build();
    }
}
