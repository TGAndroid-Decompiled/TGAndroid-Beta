package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class p1 implements Comparator {
    public final int f22623a;
    public final Spanned f22624b;

    public p1(Spanned spanned, int i10) {
        this.f22623a = i10;
        this.f22624b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22623a) {
            case 0:
                Spanned spanned = this.f22624b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f22624b;
                spanStart = spannableStringBuilder.getSpanStart((u9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((u9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
