package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class cb {
    public final f01 f19847a;
    public f01 f19848b;
    public final boolean f19849c;
    public final RectF d = new RectF();

    public cb(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19847a = new f01(charSequence, 12.0f, null);
        this.f19848b = new f01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f19849c = z10;
    }
}
