package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o21 implements t21 {
    public final boolean[] f40871a;
    public final Utilities.Callback f40872b;
    public final org.telegram.ui.Components.oc f40873c;

    public o21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.oc ocVar) {
        this.f40871a = zArr;
        this.f40872b = callback;
        this.f40873c = ocVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f40871a;
        if (!zArr[0] && (callback = this.f40872b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ky0(this.f40873c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
