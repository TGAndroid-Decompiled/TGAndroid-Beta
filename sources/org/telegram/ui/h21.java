package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h21 implements m21 {
    public final boolean[] f37426a;
    public final Utilities.Callback f37427b;
    public final org.telegram.ui.Components.xc f37428c;

    public h21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f37426a = zArr;
        this.f37427b = callback;
        this.f37428c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37426a;
        if (!zArr[0] && (callback = this.f37427b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new sy0(this.f37428c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
