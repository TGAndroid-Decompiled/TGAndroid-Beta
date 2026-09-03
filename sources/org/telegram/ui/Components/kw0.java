package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public abstract class kw0 {
    public static final Layout.Alignment[] f28507a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = f28507a;
        if (alignmentArr.length >= 5) {
            return alignmentArr[4];
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i10, float f10, int i11, int i12) {
        return c(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, f10, false, TextUtils.TruncateAt.END, i11, i12, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, boolean z4, TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z10) {
        StaticLayout staticLayout;
        int offsetForHorizontal;
        TextUtils.TruncateAt truncateAt2;
        SpannableStringBuilder spannableStringBuilder;
        try {
            if (i12 == 1) {
                int indexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                if (indexOf > 0) {
                    spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence.subSequence(0, indexOf)).append((CharSequence) "…");
                } else {
                    spannableStringBuilder = charSequence;
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, i11, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i10, alignment, 1.0f, f10, z4);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i13 = 0;
                while (true) {
                    if (i13 >= staticLayout.getLineCount()) {
                        break;
                    } else if (staticLayout.getLineRight(i13) > i10) {
                        staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    } else {
                        i13++;
                    }
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i10, alignment, 1.0f, f10, z4);
            }
            if (staticLayout.getLineCount() <= i12) {
                return staticLayout;
            }
            int i14 = i12 - 1;
            float lineLeft = staticLayout.getLineLeft(i14);
            float lineWidth = staticLayout.getLineWidth(i14);
            if (lineLeft != 0.0f) {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i14, lineLeft);
            } else {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i14, lineWidth);
            }
            if (lineWidth < i11 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder2.append((CharSequence) "…");
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder includePad = StaticLayout.Builder.obtain(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4);
                if (((u5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), u5.class)).length > 0) {
                    truncateAt2 = null;
                } else {
                    truncateAt2 = truncateAt;
                }
                return includePad.setEllipsize(truncateAt2).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(z10 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder2, textPaint, i10, alignment, 1.0f, f10, z4);
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, int i10, boolean z4, int i11, int i12) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z4).setEllipsize(truncateAt).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build();
        }
        return c(charSequence, textPaint, i10, alignment, 0.0f, z4, truncateAt, i11, i12, true);
    }
}
