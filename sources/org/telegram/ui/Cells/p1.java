package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class p1 implements Comparator {
    public final int f20788a;
    public final Spanned f20789b;

    public p1(Spanned spanned, int i10) {
        this.f20788a = i10;
        this.f20789b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f20788a) {
            case 0:
                Spanned spanned = this.f20789b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f20789b;
                spanStart = spannableStringBuilder.getSpanStart((x9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((x9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
