package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i21 implements n21 {
    public final boolean[] f38130a;
    public final Utilities.Callback f38131b;
    public final org.telegram.ui.Components.vc f38132c;

    public i21(boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar) {
        this.f38130a = zArr;
        this.f38131b = callback;
        this.f38132c = vcVar;
    }

    @Override
    public final void a() {
        Utilities.Callback callback;
        boolean[] zArr = this.f38130a;
        if (!zArr[0] && (callback = this.f38131b) != null) {
            zArr[0] = true;
            callback.run(Boolean.TRUE);
        }
        AndroidUtilities.runOnUIThread(new ly0(this.f38132c, 9), 200L);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
