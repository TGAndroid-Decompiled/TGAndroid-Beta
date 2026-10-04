package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements r31 {
    public final boolean[] f38404a;
    public final Utilities.Callback f38405b;
    public final org.telegram.ui.Components.yc f38406c;

    public m31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.f38404a = zArr;
        this.f38405b = callback;
        this.f38406c = ycVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f38404a;
        if (!zArr[0] && (callback = this.f38405b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new hz0(this.f38406c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
