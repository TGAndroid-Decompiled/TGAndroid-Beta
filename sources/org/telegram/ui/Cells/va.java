package org.telegram.ui.Cells;

import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class va {
    public final k01 f22480a;
    public k01 f22481b;
    public final boolean f22482c;
    public final RectF d = new RectF();

    public va(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        this.f22480a = new k01(charSequence, 12.0f, null);
        this.f22481b = new k01(charSequence2, 12.0f, AndroidUtilities.bold());
        this.f22482c = z4;
    }
}
