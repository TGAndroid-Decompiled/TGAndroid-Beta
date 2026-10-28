package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class bb {
    public final r11 f23915a;
    public r11 f23916b;
    public final boolean f23917c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23915a = new r11(charSequence, 12.0f, null);
        this.f23916b = new r11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23917c = z10;
    }
}
