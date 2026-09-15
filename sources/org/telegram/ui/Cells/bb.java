package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g01;
public final class bb {
    public final g01 f19839a;
    public g01 f19840b;
    public final boolean f19841c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19839a = new g01(charSequence, 12.0f, null);
        this.f19840b = new g01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f19841c = z10;
    }
}
