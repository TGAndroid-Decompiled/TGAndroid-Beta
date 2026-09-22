package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w01;
public final class bb {
    public final w01 f20085a;
    public w01 f20086b;
    public final boolean f20087c;
    public final RectF d = new RectF();

    public bb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f20085a = new w01(charSequence, 12.0f, null);
        this.f20086b = new w01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f20087c = z10;
    }
}
