package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
public final class w0 implements Comparator {
    public final int f23350a;
    public final Spanned f23351b;

    public w0(Spanned spanned, int i10) {
        this.f23350a = i10;
        this.f23351b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f23350a) {
            case 0:
                Spanned spanned = this.f23351b;
                spanStart = spanned.getSpanStart((di.i) obj2);
                spanStart2 = spanned.getSpanStart((di.i) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f23351b;
                spanStart = spannableStringBuilder.getSpanStart((p9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((p9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
