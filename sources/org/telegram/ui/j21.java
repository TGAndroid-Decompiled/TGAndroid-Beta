package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class j21 implements o21 {
    public final boolean[] f38448a;
    public final Utilities.Callback f38449b;
    public final org.telegram.ui.Components.xc f38450c;

    public j21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f38448a = zArr;
        this.f38449b = callback;
        this.f38450c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f38448a;
        if (!zArr[0] && (callback = this.f38449b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new my0(this.f38450c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
