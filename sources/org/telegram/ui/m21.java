package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m21 implements q21 {
    public final boolean[] f41439a;
    public final Utilities.Callback f41440b;
    public final org.telegram.ui.Components.wc f41441c;

    public m21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.f41439a = zArr;
        this.f41440b = callback;
        this.f41441c = wcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41439a;
        if (!zArr[0] && (callback = this.f41440b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new my0(this.f41441c, 10), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
