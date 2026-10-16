package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class ya {
    public final i11 f22491a;
    public i11 f22492b;
    public final boolean f22493c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f22491a = new i11(charSequence, 12.0f, null);
        this.f22492b = new i11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f22493c = z10;
    }
}
