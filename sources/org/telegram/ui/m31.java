package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements r31 {
    public final boolean[] f38410a;
    public final Utilities.Callback f38411b;
    public final org.telegram.ui.Components.yc f38412c;

    public m31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.f38410a = zArr;
        this.f38411b = callback;
        this.f38412c = ycVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f38410a;
        if (!zArr[0] && (callback = this.f38411b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new hz0(this.f38412c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
