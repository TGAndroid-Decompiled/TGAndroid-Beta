package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class y1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41499a;
    public final Activity f41500b;
    public final Intent f41501c;

    public y1(Activity activity, Intent intent, int i7) {
        this.f41499a = i7;
        this.f41500b = activity;
        this.f41501c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41499a) {
            case 0:
                this.f41500b.startActivity(this.f41501c);
                return;
            default:
                this.f41500b.startActivity(this.f41501c);
                return;
        }
    }
}
