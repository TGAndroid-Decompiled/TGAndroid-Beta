package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class dw implements Utilities.Callback {
    public final int f33539a;
    public final Activity f33540b;

    public dw(Activity activity, int i10) {
        this.f33539a = i10;
        this.f33540b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33539a) {
            case 0:
                qy.A0(this.f33540b, (Boolean) obj);
                return;
            default:
                qy.r0(this.f33540b, (Boolean) obj);
                return;
        }
    }
}
