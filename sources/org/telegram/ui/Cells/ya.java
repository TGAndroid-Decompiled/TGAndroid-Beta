package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h11;
public final class ya {
    public final h11 f22793a;
    public h11 f22794b;
    public final boolean f22795c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f22793a = new h11(charSequence, 12.0f, null);
        this.f22794b = new h11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f22795c = z10;
    }
}
