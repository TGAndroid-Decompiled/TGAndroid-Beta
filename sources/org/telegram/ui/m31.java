package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m31 implements r31 {
    public final boolean[] f35499a;
    public final Utilities.Callback f35500b;
    public final org.telegram.ui.Components.xc f35501c;

    public m31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar) {
        this.f35499a = zArr;
        this.f35500b = callback;
        this.f35501c = xcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f35499a;
        if (!zArr[0] && (callback = this.f35500b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new xz0(this.f35501c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
