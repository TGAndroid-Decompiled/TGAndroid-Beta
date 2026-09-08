package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class ab {
    public final f01 f21648a;
    public f01 f21649b;
    public final boolean f21650c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21648a = new f01(charSequence, 12.0f, null);
        this.f21649b = new f01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21650c = z10;
    }
}
