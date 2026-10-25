package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q11;
public final class bb {
    public final q11 f23912a;
    public q11 f23913b;
    public final boolean f23914c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23912a = new q11(charSequence, 12.0f, null);
        this.f23913b = new q11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23914c = z10;
    }
}
