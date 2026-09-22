package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class hw implements Utilities.Callback {
    public final int f34318a;
    public final Activity f34319b;

    public hw(Activity activity, int i10) {
        this.f34318a = i10;
        this.f34319b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34318a) {
            case 0:
                uy.B0(this.f34319b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f34319b, (Boolean) obj);
                return;
        }
    }
}
