package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;
public final class bb {
    public final u01 f20070a;
    public u01 f20071b;
    public final boolean f20072c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20070a = new u01(charSequence, 12.0f, null);
        this.f20071b = new u01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20072c = z10;
    }
}
