package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h11;
public final class xa {
    public final h11 f23962a;
    public h11 f23963b;
    public final boolean f23964c;
    public final RectF d = new RectF();

    public xa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23962a = new h11(charSequence, 12.0f, null);
        this.f23963b = new h11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23964c = z10;
    }
}
