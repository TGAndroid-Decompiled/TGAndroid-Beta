package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class z0 implements Comparator {
    public final int f32581a;
    public final Spanned f32582b;

    public z0(Spanned spanned, int i7) {
        this.f32581a = i7;
        this.f32582b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f32581a) {
            case 0:
                Spanned spanned = this.f32582b;
                spanStart = spanned.getSpanStart((qi.g) obj2);
                spanStart2 = spanned.getSpanStart((qi.g) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f32582b;
                spanStart = spannableStringBuilder.getSpanStart((o9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((o9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
