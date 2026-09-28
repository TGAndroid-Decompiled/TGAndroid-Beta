package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class k31 implements p31 {
    public final boolean[] f34922a;
    public final Utilities.Callback f34923b;
    public final org.telegram.ui.Components.xc f34924c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f34922a = zArr;
        this.f34923b = callback;
        this.f34924c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f34922a;
        if (!zArr[0] && (callback = this.f34923b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vz0(this.f34924c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
