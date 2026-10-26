package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q11;
public final class bb {
    public final q11 f23914a;
    public q11 f23915b;
    public final boolean f23916c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23914a = new q11(charSequence, 12.0f, null);
        this.f23915b = new q11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23916c = z10;
    }
}
