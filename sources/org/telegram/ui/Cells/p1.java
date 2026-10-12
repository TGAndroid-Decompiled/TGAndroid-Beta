package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class p1 implements Comparator {
    public final int f22387a;
    public final Spanned f22388b;

    public p1(Spanned spanned, int i10) {
        this.f22387a = i10;
        this.f22388b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22387a) {
            case 0:
                Spanned spanned = this.f22388b;
                spanStart = spanned.getSpanStart((ki.h) obj2);
                spanStart2 = spanned.getSpanStart((ki.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f22388b;
                spanStart = spannableStringBuilder.getSpanStart((u9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((u9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
