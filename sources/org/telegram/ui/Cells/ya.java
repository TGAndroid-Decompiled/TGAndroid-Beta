package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m11;
public final class ya {
    public final m11 f23793a;
    public m11 f23794b;
    public final boolean f23795c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23793a = new m11(charSequence, 12.0f, null);
        this.f23794b = new m11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23795c = z10;
    }
}
