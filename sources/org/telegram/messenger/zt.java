package org.telegram.messenger;

import android.text.Spanned;
import java.util.Comparator;
public final class zt implements Comparator {
    public final int f28375a;
    public final Spanned f28376b;

    public zt(Spanned spanned, int i7) {
        this.f28375a = i7;
        this.f28376b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        switch (this.f28375a) {
            case 0:
                Spanned spanned = this.f28376b;
                spanStart = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj2);
                spanStart2 = spanned.getSpanStart((org.telegram.ui.Cells.p9) obj);
                break;
            default:
                Spanned spanned2 = this.f28376b;
                spanStart = spanned2.getSpanStart((du) obj2);
                spanStart2 = spanned2.getSpanStart((du) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
