package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;
public final class ab {
    public final v01 f19996a;
    public v01 f19997b;
    public final boolean f19998c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19996a = new v01(charSequence, 12.0f, null);
        this.f19997b = new v01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f19998c = z10;
    }
}
