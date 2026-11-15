package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class x0 implements Comparator {
    public final int f31912a;
    public final Spanned f31913b;

    public x0(Spanned spanned, int i7) {
        this.f31912a = i7;
        this.f31913b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f31912a) {
            case 0:
                Spanned spanned = this.f31913b;
                spanStart = spanned.getSpanStart((qi.g) obj2);
                spanStart2 = spanned.getSpanStart((qi.g) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f31913b;
                spanStart = spannableStringBuilder.getSpanStart((n9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((n9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
