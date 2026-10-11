package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f31988a;
    public final Activity f31989b;
    public final Intent f31990c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31988a = i10;
        this.f31989b = activity;
        this.f31990c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31988a) {
            case 0:
                this.f31989b.startActivity(this.f31990c);
                return;
            default:
                this.f31989b.startActivity(this.f31990c);
                return;
        }
    }
}
