package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o21 implements t21 {
    public final boolean[] f40964a;
    public final Utilities.Callback f40965b;
    public final org.telegram.ui.Components.tc f40966c;

    public o21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.tc tcVar) {
        this.f40964a = zArr;
        this.f40965b = callback;
        this.f40966c = tcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f40964a;
        if (!zArr[0] && (callback = this.f40965b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ky0(this.f40966c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
