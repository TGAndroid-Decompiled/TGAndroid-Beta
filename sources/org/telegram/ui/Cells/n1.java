package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class n1 implements Comparator {
    public final int f24520a;
    public final Spanned f24521b;

    public n1(Spanned spanned, int i10) {
        this.f24520a = i10;
        this.f24521b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f24520a) {
            case 0:
                Spanned spanned = this.f24521b;
                spanStart = spanned.getSpanStart((ni.h) obj2);
                spanStart2 = spanned.getSpanStart((ni.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f24521b;
                spanStart = spannableStringBuilder.getSpanStart((y9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((y9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
