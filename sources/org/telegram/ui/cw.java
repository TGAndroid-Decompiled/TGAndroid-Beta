package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class cw implements Utilities.Callback {
    public final int f32809a;
    public final Activity f32810b;

    public cw(Activity activity, int i10) {
        this.f32809a = i10;
        this.f32810b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32809a) {
            case 0:
                qy.B0(this.f32810b, (Boolean) obj);
                return;
            default:
                qy.s0(this.f32810b, (Boolean) obj);
                return;
        }
    }
}
