package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class cb {
    public final t01 f18972a;
    public t01 f18973b;
    public final boolean f18974c;
    public final RectF d = new RectF();

    public cb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f18972a = new t01(charSequence, 12.0f, null);
        this.f18973b = new t01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f18974c = z10;
    }
}
