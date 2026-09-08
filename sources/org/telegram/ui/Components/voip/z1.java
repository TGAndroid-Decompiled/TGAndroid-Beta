package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31981a;
    public final Activity f31982b;
    public final Intent f31983c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31981a = i10;
        this.f31982b = activity;
        this.f31983c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31981a) {
            case 0:
                this.f31982b.startActivity(this.f31983c);
                return;
            default:
                this.f31982b.startActivity(this.f31983c);
                return;
        }
    }
}
