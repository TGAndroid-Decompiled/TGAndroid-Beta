package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class ab {
    public final f01 f21621a;
    public f01 f21622b;
    public final boolean f21623c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21621a = new f01(charSequence, 12.0f, null);
        this.f21622b = new f01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21623c = z10;
    }
}
