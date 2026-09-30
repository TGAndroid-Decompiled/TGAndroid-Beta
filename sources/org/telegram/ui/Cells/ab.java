package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;
public final class ab {
    public final w01 f20049a;
    public w01 f20050b;
    public final boolean f20051c;
    public final RectF d = new RectF();

    public ab(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20049a = new w01(charSequence, 12.0f, null);
        this.f20050b = new w01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20051c = z10;
    }
}
