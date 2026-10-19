package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;
public final class wa {
    public final e11 f23772a;
    public e11 f23773b;
    public final boolean f23774c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23772a = new e11(charSequence, 12.0f, null);
        this.f23773b = new e11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23774c = z10;
    }
}
