package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
public final class o1 implements Comparator {
    public final int f23271a;
    public final Spanned f23272b;

    public o1(Spanned spanned, int i10) {
        this.f23271a = i10;
        this.f23272b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f23271a) {
            case 0:
                Spanned spanned = this.f23272b;
                spanStart = spanned.getSpanStart((CodeHighlighting.Span) obj2);
                spanStart2 = spanned.getSpanStart((CodeHighlighting.Span) obj);
                break;
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f23272b;
                spanStart = spannableStringBuilder.getSpanStart((s9) obj2);
                spanStart2 = spannableStringBuilder.getSpanStart((s9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
