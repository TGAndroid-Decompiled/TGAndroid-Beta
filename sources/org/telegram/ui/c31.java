package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c31 implements h31 {
    public final boolean[] f35665a;
    public final Utilities.Callback f35666b;
    public final org.telegram.ui.Components.qc f35667c;

    public c31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.f35665a = zArr;
        this.f35666b = callback;
        this.f35667c = qcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f35665a;
        if (!zArr[0] && (callback = this.f35666b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new xy0(this.f35667c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
