package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class gw implements Utilities.Callback {
    public final int f36745a;
    public final Activity f36746b;

    public gw(Activity activity, int i10) {
        this.f36745a = i10;
        this.f36746b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36745a) {
            case 0:
                uy.B0(this.f36746b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f36746b, (Boolean) obj);
                return;
        }
    }
}
