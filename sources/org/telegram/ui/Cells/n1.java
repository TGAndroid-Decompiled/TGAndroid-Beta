package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class n1 implements Comparator {
    public final int f24522a;
    public final Spanned f24523b;

    public n1(Spanned spanned, int i10) {
        this.f24522a = i10;
        this.f24523b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f24522a) {
            case 0:
                Spanned spanned = this.f24523b;
                spanStart = spanned.getSpanStart((ni.h) obj2);
                spanStart2 = spanned.getSpanStart((ni.h) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f24523b;
                spanStart = spannableStringBuilder.getSpanStart((y9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((y9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
