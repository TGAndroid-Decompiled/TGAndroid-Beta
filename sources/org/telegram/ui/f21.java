package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f21 implements k21 {
    public final boolean[] f36878a;
    public final Utilities.Callback f36879b;
    public final org.telegram.ui.Components.xc f36880c;

    public f21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f36878a = zArr;
        this.f36879b = callback;
        this.f36880c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f36878a;
        if (!zArr[0] && (callback = this.f36879b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new qy0(this.f36880c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
