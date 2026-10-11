package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class p1 implements Comparator {
    public final int f22651a;
    public final Spanned f22652b;

    public p1(Spanned spanned, int i10) {
        this.f22651a = i10;
        this.f22652b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22651a) {
            case 0:
                Spanned spanned = this.f22652b;
                spanStart = spanned.getSpanStart((li.h) obj2);
                spanStart2 = spanned.getSpanStart((li.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f22652b;
                spanStart = spannableStringBuilder.getSpanStart((u9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((u9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
