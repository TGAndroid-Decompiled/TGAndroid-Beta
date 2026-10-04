package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class ab {
    public final e11 f21806a;
    public e11 f21807b;
    public final boolean f21808c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21806a = new e11(charSequence, 12.0f, null);
        this.f21807b = new e11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21808c = z10;
    }
}
