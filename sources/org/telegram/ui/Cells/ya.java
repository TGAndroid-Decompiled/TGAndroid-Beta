package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class ya {
    public final r11 f23552a;
    public r11 f23553b;
    public final boolean f23554c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23552a = new r11(charSequence, 12.0f, null);
        this.f23553b = new r11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23554c = z10;
    }
}
