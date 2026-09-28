package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;
public final class ab {
    public final v01 f20032a;
    public v01 f20033b;
    public final boolean f20034c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20032a = new v01(charSequence, 12.0f, null);
        this.f20033b = new v01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20034c = z10;
    }
}
