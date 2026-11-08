package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class x0 implements Comparator {
    public final int f30763a;
    public final Spanned f30764b;

    public x0(Spanned spanned, int i7) {
        this.f30763a = i7;
        this.f30764b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f30763a) {
            case 0:
                Spanned spanned = this.f30764b;
                spanStart = spanned.getSpanStart((ni.j) obj2);
                spanStart2 = spanned.getSpanStart((ni.j) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f30764b;
                spanStart = spannableStringBuilder.getSpanStart((o9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((o9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
