package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;
public final class ab {
    public final v01 f20034a;
    public v01 f20035b;
    public final boolean f20036c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20034a = new v01(charSequence, 12.0f, null);
        this.f20035b = new v01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20036c = z10;
    }
}
