package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class k31 implements p31 {
    public final boolean[] f37833a;
    public final Utilities.Callback f37834b;
    public final org.telegram.ui.Components.yc f37835c;

    public k31(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar) {
        this.f37833a = zArr;
        this.f37834b = callback;
        this.f37835c = ycVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f37833a;
        if (!zArr[0] && (callback = this.f37834b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new hz0(this.f37835c, 8), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
