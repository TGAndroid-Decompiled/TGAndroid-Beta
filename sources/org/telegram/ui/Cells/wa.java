package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class wa {
    public final k01 f24374a;
    public k01 f24375b;
    public final boolean f24376c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.f24374a = new k01(charSequence, 12.0f, null);
        this.f24375b = new k01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f24376c = z4;
    }
}
