package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class o1 implements Comparator {
    public final int f20534a;
    public final Spanned f20535b;

    public o1(Spanned spanned, int i10) {
        this.f20534a = i10;
        this.f20535b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f20534a) {
            case 0:
                Spanned spanned = this.f20535b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f20535b;
                spanStart = spannableStringBuilder.getSpanStart((w9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((w9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
