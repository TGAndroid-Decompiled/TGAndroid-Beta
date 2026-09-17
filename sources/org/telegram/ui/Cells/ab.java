package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class ab {
    public final f01 f21622a;
    public f01 f21623b;
    public final boolean f21624c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21622a = new f01(charSequence, 12.0f, null);
        this.f21623b = new f01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21624c = z10;
    }
}
