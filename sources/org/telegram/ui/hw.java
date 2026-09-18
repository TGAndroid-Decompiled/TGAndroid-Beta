package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class hw implements Utilities.Callback {
    public final int f34250a;
    public final Activity f34251b;

    public hw(Activity activity, int i10) {
        this.f34250a = i10;
        this.f34251b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34250a) {
            case 0:
                uy.B0(this.f34251b, (Boolean) obj);
                return;
            default:
                uy.s0(this.f34251b, (Boolean) obj);
                return;
        }
    }
}
