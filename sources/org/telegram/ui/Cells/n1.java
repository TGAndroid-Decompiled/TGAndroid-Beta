package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class n1 implements Comparator {
    public final int f21401a;
    public final Spanned f21402b;

    public n1(Spanned spanned, int i10) {
        this.f21401a = i10;
        this.f21402b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f21401a) {
            case 0:
                Spanned spanned = this.f21402b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f21402b;
                spanStart = spannableStringBuilder.getSpanStart((r9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((r9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
