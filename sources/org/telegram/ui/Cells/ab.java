package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class ab {
    public final f11 f21814a;
    public f11 f21815b;
    public final boolean f21816c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f21814a = new f11(charSequence, 12.0f, null);
        this.f21815b = new f11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f21816c = z10;
    }
}
