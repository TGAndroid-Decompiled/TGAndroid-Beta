package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f21 implements k21 {
    public final boolean[] f36877a;
    public final Utilities.Callback f36878b;
    public final org.telegram.ui.Components.xc f36879c;

    public f21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f36877a = zArr;
        this.f36878b = callback;
        this.f36879c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f36877a;
        if (!zArr[0] && (callback = this.f36878b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new qy0(this.f36879c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
