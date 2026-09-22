package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;
public final class bb {
    public final g01 f19830a;
    public g01 f19831b;
    public final boolean f19832c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19830a = new g01(charSequence, 12.0f, null);
        this.f19831b = new g01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f19832c = z10;
    }
}
