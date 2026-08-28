package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;
public final class wa {
    public final nz0 f25914a;
    public nz0 f25915b;
    public final boolean f25916c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f25914a = new nz0(charSequence, 12.0f, null);
        this.f25915b = new nz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f25916c = z10;
    }
}
