package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class wa {
    public final d11 f23699a;
    public d11 f23700b;
    public final boolean f23701c;
    public final RectF d = new RectF();

    public wa(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23699a = new d11(charSequence, 12.0f, null);
        this.f23700b = new d11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23701c = z10;
    }
}
