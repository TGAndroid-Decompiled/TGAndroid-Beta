package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class dw implements Utilities.Callback {
    public final int f32732a;
    public final Activity f32733b;

    public dw(Activity activity, int i10) {
        this.f32732a = i10;
        this.f32733b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32732a) {
            case 0:
                ry.B0(this.f32733b, (Boolean) obj);
                return;
            default:
                ry.s0(this.f32733b, (Boolean) obj);
                return;
        }
    }
}
