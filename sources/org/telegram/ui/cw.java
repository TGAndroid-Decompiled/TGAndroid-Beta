package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class cw implements Utilities.Callback {
    public final int f35918a;
    public final Activity f35919b;

    public cw(Activity activity, int i10) {
        this.f35918a = i10;
        this.f35919b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35918a) {
            case 0:
                py.A0(this.f35919b, (Boolean) obj);
                return;
            default:
                py.r0(this.f35919b, (Boolean) obj);
                return;
        }
    }
}
