package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n11;
public final class ya {
    public final n11 f23781a;
    public n11 f23782b;
    public final boolean f23783c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23781a = new n11(charSequence, 12.0f, null);
        this.f23782b = new n11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23783c = z10;
    }
}
