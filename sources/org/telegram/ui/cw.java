package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class cw implements Utilities.Callback {
    public final int f32808a;
    public final Activity f32809b;

    public cw(Activity activity, int i10) {
        this.f32808a = i10;
        this.f32809b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32808a) {
            case 0:
                qy.B0(this.f32809b, (Boolean) obj);
                return;
            default:
                qy.s0(this.f32809b, (Boolean) obj);
                return;
        }
    }
}
