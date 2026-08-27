package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;

public final class n1 implements Comparator {

    public final int f24715a;

    public final Spanned f24716b;

    public n1(Spanned spanned, int i10) {
        this.f24715a = i10;
        this.f24716b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f24715a) {
            case 0:
                Spanned spanned = this.f24716b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f24716b;
                spanStart = spannableStringBuilder.getSpanStart((p9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((p9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
