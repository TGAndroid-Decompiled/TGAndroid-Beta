package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class xa {
    public final i11 f23961a;
    public i11 f23962b;
    public final boolean f23963c;
    public final RectF d = new RectF();

    public xa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23961a = new i11(charSequence, 12.0f, null);
        this.f23962b = new i11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23963c = z10;
    }
}
