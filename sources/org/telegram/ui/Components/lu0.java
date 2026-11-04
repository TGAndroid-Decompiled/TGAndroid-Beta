package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
public abstract class lu0 {
    public static final Layout.Alignment[] f35891a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = f35891a;
        if (alignmentArr.length >= 5) {
            return alignmentArr[4];
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i3, float f10, int i10, int i11) {
        return c(charSequence, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, f10, TextUtils.TruncateAt.END, i10, i11, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, float f10, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z10) {
        boolean z11;
        int offsetForHorizontal;
        TextUtils.TruncateAt truncateAt2;
        SpannableStringBuilder spannableStringBuilder = charSequence;
        if (i11 == 1) {
            try {
                int indexOf = TextUtils.indexOf(spannableStringBuilder, "\n") - 1;
                if (indexOf > 0) {
                    spannableStringBuilder = SpannableStringBuilder.valueOf(spannableStringBuilder.subSequence(0, indexOf)).append((CharSequence) "…");
                }
                CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, i10, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i3, alignment, 1.0f, f10, false);
            } catch (Exception e10) {
                e = e10;
                z11 = true;
            }
        } else {
            try {
                StaticLayout build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i3).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i12 = 0;
                while (true) {
                    if (i12 >= build.getLineCount()) {
                        break;
                    } else if (build.getLineRight(i12) > i3) {
                        build = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i3).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    } else {
                        i12++;
                    }
                }
                if (build.getLineCount() <= i11) {
                    return build;
                }
                int i13 = i11 - 1;
                float lineLeft = build.getLineLeft(i13);
                float lineWidth = build.getLineWidth(i13);
                if (lineLeft != 0.0f) {
                    offsetForHorizontal = build.getOffsetForHorizontal(i13, lineLeft);
                } else {
                    offsetForHorizontal = build.getOffsetForHorizontal(i13, lineWidth);
                }
                if (lineWidth < i10 - org.telegram.messenger.g0.L(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder2.append((CharSequence) "…");
                StaticLayout.Builder includePad = StaticLayout.Builder.obtain(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i3).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false);
                if (((p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class)).length > 0) {
                    truncateAt2 = null;
                } else {
                    truncateAt2 = truncateAt;
                }
                return includePad.setEllipsize(truncateAt2).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(z10 ? 1 : 0).setHyphenationFrequency(0).build();
            } catch (Exception e11) {
                e = e11;
                z11 = true;
            }
        }
        org.telegram.messenger.a8.g(e, z11);
        return null;
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, boolean z10, int i3, int i10) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i3).setMaxLines(i10).setBreakStrategy(1).setHyphenationFrequency(0).build();
    }
}
