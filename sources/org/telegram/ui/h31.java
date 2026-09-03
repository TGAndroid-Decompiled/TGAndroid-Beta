package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h31 implements m31 {
    public final boolean[] f37212a;
    public final Utilities.Callback f37213b;
    public final org.telegram.ui.Components.qc f37214c;

    public h31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.f37212a = zArr;
        this.f37213b = callback;
        this.f37214c = qcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37212a;
        if (!zArr[0] && (callback = this.f37213b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new sz0(this.f37214c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
