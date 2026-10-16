package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class p1 implements Comparator {
    public final int f21368a;
    public final Spanned f21369b;

    public p1(Spanned spanned, int i10) {
        this.f21368a = i10;
        this.f21369b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f21368a) {
            case 0:
                Spanned spanned = this.f21369b;
                spanStart = spanned.getSpanStart((li.h) obj2);
                spanStart2 = spanned.getSpanStart((li.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f21369b;
                spanStart = spannableStringBuilder.getSpanStart((u9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((u9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
