package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l01;
public final class wa {
    public final l01 f24372a;
    public l01 f24373b;
    public final boolean f24374c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.f24372a = new l01(charSequence, 12.0f, null);
        this.f24373b = new l01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f24374c = z4;
    }
}
