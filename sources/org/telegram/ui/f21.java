package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f21 implements k21 {
    public final boolean[] f36871a;
    public final Utilities.Callback f36872b;
    public final org.telegram.ui.Components.xc f36873c;

    public f21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f36871a = zArr;
        this.f36872b = callback;
        this.f36873c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f36871a;
        if (!zArr[0] && (callback = this.f36872b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new qy0(this.f36873c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
