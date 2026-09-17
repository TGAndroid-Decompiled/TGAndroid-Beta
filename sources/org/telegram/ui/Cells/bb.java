package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;
public final class bb {
    public final h01 f19849a;
    public h01 f19850b;
    public final boolean f19851c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19849a = new h01(charSequence, 12.0f, null);
        this.f19850b = new h01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f19851c = z10;
    }
}
