package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class k1 implements org.telegram.ui.ActionBar.p1 {
    public final int f39438a;
    public final Activity f39439b;
    public final Intent f39440c;

    public k1(Activity activity, Intent intent, int i3) {
        this.f39438a = i3;
        this.f39439b = activity;
        this.f39440c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f39438a) {
            case 0:
                this.f39439b.startActivity(this.f39440c);
                return;
            default:
                this.f39439b.startActivity(this.f39440c);
                return;
        }
    }
}
