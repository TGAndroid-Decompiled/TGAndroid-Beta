package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class n21 implements s21 {

    public final boolean[] f40652a;

    public final Utilities.Callback f40653b;

    public final org.telegram.ui.Components.mc f40654c;

    public n21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.mc mcVar) {
        this.f40652a = zArr;
        this.f40653b = callback;
        this.f40654c = mcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f40652a;
        if (!zArr[0] && (callback = this.f40653b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ky0(this.f40654c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
