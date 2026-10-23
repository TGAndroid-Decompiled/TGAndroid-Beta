package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class wa {
    public final f11 f23779a;
    public f11 f23780b;
    public final boolean f23781c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23779a = new f11(charSequence, 12.0f, null);
        this.f23780b = new f11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23781c = z10;
    }
}
