package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class ab {
    public final t01 f20018a;
    public t01 f20019b;
    public final boolean f20020c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20018a = new t01(charSequence, 12.0f, null);
        this.f20019b = new t01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20020c = z10;
    }
}
