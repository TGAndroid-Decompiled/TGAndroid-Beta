package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class k31 implements p31 {
    public final boolean[] f34920a;
    public final Utilities.Callback f34921b;
    public final org.telegram.ui.Components.xc f34922c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f34920a = zArr;
        this.f34921b = callback;
        this.f34922c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f34920a;
        if (!zArr[0] && (callback = this.f34921b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vz0(this.f34922c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
