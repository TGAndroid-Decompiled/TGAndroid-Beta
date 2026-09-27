package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class fw implements Utilities.Callback {
    public final int f33644a;
    public final Activity f33645b;

    public fw(Activity activity, int i10) {
        this.f33644a = i10;
        this.f33645b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33644a) {
            case 0:
                ty.B0(this.f33645b, (Boolean) obj);
                return;
            default:
                ty.s0(this.f33645b, (Boolean) obj);
                return;
        }
    }
}
