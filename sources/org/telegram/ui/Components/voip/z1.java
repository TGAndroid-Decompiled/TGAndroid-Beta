package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41395a;
    public final Activity f41396b;
    public final Intent f41397c;

    public z1(Activity activity, Intent intent, int i7) {
        this.f41395a = i7;
        this.f41396b = activity;
        this.f41397c = intent;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41395a) {
            case 0:
                this.f41396b.startActivity(this.f41397c);
                return;
            default:
                this.f41396b.startActivity(this.f41397c);
                return;
        }
    }
}
