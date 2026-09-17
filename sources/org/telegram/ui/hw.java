package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class hw implements Utilities.Callback {
    public final int f37143a;
    public final Activity f37144b;

    public hw(Activity activity, int i10) {
        this.f37143a = i10;
        this.f37144b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37143a) {
            case 0:
                uy.B0(this.f37144b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f37144b, (Boolean) obj);
                return;
        }
    }
}
