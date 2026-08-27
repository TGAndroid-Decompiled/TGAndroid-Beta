package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

public final class ta {

    public final pz0 f25686a;

    public pz0 f25687b;

    public final boolean f25688c;
    public final RectF d = new RectF();

    public ta(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f25686a = new pz0(charSequence, 12.0f, null);
        this.f25687b = new pz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f25688c = z10;
    }
}
