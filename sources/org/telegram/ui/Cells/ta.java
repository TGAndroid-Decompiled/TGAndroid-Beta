package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz0;
public final class ta {
    public final zz0 f25710a;
    public zz0 f25711b;
    public final boolean f25712c;
    public final RectF d = new RectF();

    public ta(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f25710a = new zz0(charSequence, 12.0f, null);
        this.f25711b = new zz0(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f25712c = z10;
    }
}
