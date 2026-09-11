package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class hw implements Utilities.Callback {
    public final int f37115a;
    public final Activity f37116b;

    public hw(Activity activity, int i10) {
        this.f37115a = i10;
        this.f37116b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37115a) {
            case 0:
                uy.B0(this.f37116b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f37116b, (Boolean) obj);
                return;
        }
    }
}
