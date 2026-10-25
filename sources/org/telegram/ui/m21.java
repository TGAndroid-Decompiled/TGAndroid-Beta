package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m21 implements q21 {
    public final boolean[] f41436a;
    public final Utilities.Callback f41437b;
    public final org.telegram.ui.Components.wc f41438c;

    public m21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.f41436a = zArr;
        this.f41437b = callback;
        this.f41438c = wcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41436a;
        if (!zArr[0] && (callback = this.f41437b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new my0(this.f41438c, 10), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
