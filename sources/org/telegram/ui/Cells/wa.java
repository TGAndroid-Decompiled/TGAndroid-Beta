package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class wa {
    public final f11 f23775a;
    public f11 f23776b;
    public final boolean f23777c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23775a = new f11(charSequence, 12.0f, null);
        this.f23776b = new f11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23777c = z10;
    }
}
