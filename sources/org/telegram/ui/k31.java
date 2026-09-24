package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class k31 implements p31 {
    public final boolean[] f34908a;
    public final Utilities.Callback f34909b;
    public final org.telegram.ui.Components.yc f34910c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.f34908a = zArr;
        this.f34909b = callback;
        this.f34910c = ycVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f34908a;
        if (!zArr[0] && (callback = this.f34909b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new vz0(this.f34910c, 7), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
