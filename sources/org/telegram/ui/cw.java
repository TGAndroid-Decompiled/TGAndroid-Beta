package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class cw implements Utilities.Callback {
    public final int f32886a;
    public final Activity f32887b;

    public cw(Activity activity, int i10) {
        this.f32886a = i10;
        this.f32887b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32886a) {
            case 0:
                qy.B0(this.f32887b, (Boolean) obj);
                return;
            default:
                qy.s0(this.f32887b, (Boolean) obj);
                return;
        }
    }
}
