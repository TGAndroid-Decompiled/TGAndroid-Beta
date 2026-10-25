package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class n1 implements Comparator {
    public final int f24518a;
    public final Spanned f24519b;

    public n1(Spanned spanned, int i10) {
        this.f24518a = i10;
        this.f24519b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f24518a) {
            case 0:
                Spanned spanned = this.f24519b;
                spanStart = spanned.getSpanStart((ni.h) obj2);
                spanStart2 = spanned.getSpanStart((ni.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f24519b;
                spanStart = spannableStringBuilder.getSpanStart((y9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((y9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
