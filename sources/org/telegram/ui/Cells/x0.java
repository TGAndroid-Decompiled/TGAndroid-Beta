package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class x0 implements Comparator {
    public final int f30836a;
    public final Spanned f30837b;

    public x0(Spanned spanned, int i3) {
        this.f30836a = i3;
        this.f30837b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f30836a) {
            case 0:
                Spanned spanned = this.f30837b;
                spanStart = spanned.getSpanStart((oi.h) obj2);
                spanStart2 = spanned.getSpanStart((oi.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f30837b;
                spanStart = spannableStringBuilder.getSpanStart((n9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((n9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
