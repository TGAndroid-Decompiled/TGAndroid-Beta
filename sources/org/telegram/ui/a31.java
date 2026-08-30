package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a31 implements f31 {
    public final boolean[] f32453a;
    public final Utilities.Callback f32454b;
    public final org.telegram.ui.Components.qc f32455c;

    public a31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar) {
        this.f32453a = zArr;
        this.f32454b = callback;
        this.f32455c = qcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f32453a;
        if (!zArr[0] && (callback = this.f32454b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vy0(this.f32455c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
