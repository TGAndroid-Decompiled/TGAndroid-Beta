package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h31 implements m31 {
    public final boolean[] f34563a;
    public final Utilities.Callback f34564b;
    public final org.telegram.ui.Components.qc f34565c;

    public h31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.f34563a = zArr;
        this.f34564b = callback;
        this.f34565c = qcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f34563a;
        if (!zArr[0] && (callback = this.f34564b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new sz0(this.f34565c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
