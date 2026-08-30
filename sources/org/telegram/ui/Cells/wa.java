package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class wa {
    public final k01 f22552a;
    public k01 f22553b;
    public final boolean f22554c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.f22552a = new k01(charSequence, 12.0f, null);
        this.f22553b = new k01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f22554c = z4;
    }
}
