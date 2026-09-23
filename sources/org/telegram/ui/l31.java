package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l31 implements q31 {
    public final boolean[] f34852a;
    public final Utilities.Callback f34853b;
    public final org.telegram.ui.Components.xc f34854c;

    public l31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f34852a = zArr;
        this.f34853b = callback;
        this.f34854c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f34852a;
        if (!zArr[0] && (callback = this.f34853b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new xz0(this.f34854c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
