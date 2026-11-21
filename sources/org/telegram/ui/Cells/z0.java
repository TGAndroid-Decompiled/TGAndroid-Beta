package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class z0 implements Comparator {
    public final int f32524a;
    public final Spanned f32525b;

    public z0(Spanned spanned, int i7) {
        this.f32524a = i7;
        this.f32525b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f32524a) {
            case 0:
                Spanned spanned = this.f32525b;
                spanStart = spanned.getSpanStart((qi.g) obj2);
                spanStart2 = spanned.getSpanStart((qi.g) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f32525b;
                spanStart = spannableStringBuilder.getSpanStart((p9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((p9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
