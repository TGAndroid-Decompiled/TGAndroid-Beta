package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class p1 implements Comparator {
    public final int f21671a;
    public final Spanned f21672b;

    public p1(Spanned spanned, int i10) {
        this.f21671a = i10;
        this.f21672b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f21671a) {
            case 0:
                Spanned spanned = this.f21672b;
                spanStart = spanned.getSpanStart((mi.h) obj2);
                spanStart2 = spanned.getSpanStart((mi.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f21672b;
                spanStart = spannableStringBuilder.getSpanStart((u9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((u9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
