package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f21 implements k21 {
    public final boolean[] f36881a;
    public final Utilities.Callback f36882b;
    public final org.telegram.ui.Components.xc f36883c;

    public f21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f36881a = zArr;
        this.f36882b = callback;
        this.f36883c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f36881a;
        if (!zArr[0] && (callback = this.f36882b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new qy0(this.f36883c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
