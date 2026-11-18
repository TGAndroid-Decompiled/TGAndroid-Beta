package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class yt implements Comparator {
    public final int f28181a;
    public final Spanned f28182b;

    public yt(Spanned spanned, int i7) {
        this.f28181a = i7;
        this.f28182b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f28181a) {
            case 0:
                Spanned spanned = this.f28182b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.o9) obj);
                break;
            default:
                Spanned spanned2 = this.f28182b;
                spanStart = spanned2.getSpanStart((cu) obj2);
                spanStart2 = spanned2.getSpanStart((cu) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
