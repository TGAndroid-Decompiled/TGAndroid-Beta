package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class ab {
    public final e11 f21810a;
    public e11 f21811b;
    public final boolean f21812c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21810a = new e11(charSequence, 12.0f, null);
        this.f21811b = new e11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21812c = z10;
    }
}
