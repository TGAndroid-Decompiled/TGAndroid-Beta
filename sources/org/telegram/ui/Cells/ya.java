package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;
public final class ya {
    public final l11 f23789a;
    public l11 f23790b;
    public final boolean f23791c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23789a = new l11(charSequence, 12.0f, null);
        this.f23790b = new l11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23791c = z10;
    }
}
