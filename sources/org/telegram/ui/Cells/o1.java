package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class o1 implements Comparator {
    public final int f24810a;
    public final Spanned f24811b;

    public o1(Spanned spanned, int i9) {
        this.f24810a = i9;
        this.f24811b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f24810a) {
            case 0:
                Spanned spanned = this.f24811b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f24811b;
                spanStart = spannableStringBuilder.getSpanStart((t9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((t9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
