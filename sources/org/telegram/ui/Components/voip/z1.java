package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41116a;
    public final Activity f41117b;
    public final Intent f41118c;

    public z1(Activity activity, Intent intent, int i7) {
        this.f41116a = i7;
        this.f41117b = activity;
        this.f41118c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41116a) {
            case 0:
                this.f41117b.startActivity(this.f41118c);
                return;
            default:
                this.f41117b.startActivity(this.f41118c);
                return;
        }
    }
}
