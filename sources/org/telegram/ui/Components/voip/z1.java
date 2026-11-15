package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41119a;
    public final Activity f41120b;
    public final Intent f41121c;

    public z1(Activity activity, Intent intent, int i7) {
        this.f41119a = i7;
        this.f41120b = activity;
        this.f41121c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41119a) {
            case 0:
                this.f41120b.startActivity(this.f41121c);
                return;
            default:
                this.f41120b.startActivity(this.f41121c);
                return;
        }
    }
}
