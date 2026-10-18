package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class p1 implements Comparator {
    public final int f22740a;
    public final Spanned f22741b;

    public p1(Spanned spanned, int i10) {
        this.f22740a = i10;
        this.f22741b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f22740a) {
            case 0:
                Spanned spanned = this.f22741b;
                spanStart = spanned.getSpanStart((mi.h) obj2);
                spanStart2 = spanned.getSpanStart((mi.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f22741b;
                spanStart = spannableStringBuilder.getSpanStart((t9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((t9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
