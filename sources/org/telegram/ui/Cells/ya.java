package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m11;
public final class ya {
    public final m11 f23817a;
    public m11 f23818b;
    public final boolean f23819c;
    public final RectF d = new RectF();

    public ya(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f23817a = new m11(charSequence, 12.0f, null);
        this.f23818b = new m11(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f23819c = z10;
    }
}
