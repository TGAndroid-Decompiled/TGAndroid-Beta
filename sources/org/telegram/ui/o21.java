package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o21 implements s21 {
    public final boolean[] f41960a;
    public final Utilities.Callback f41961b;
    public final org.telegram.ui.Components.wc f41962c;

    public o21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar) {
        this.f41960a = zArr;
        this.f41961b = callback;
        this.f41962c = wcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f41960a;
        if (!zArr[0] && (callback = this.f41961b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new oy0(this.f41962c, 10), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
