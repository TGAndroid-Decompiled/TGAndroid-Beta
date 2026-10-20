package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31845a;
    public final Activity f31846b;
    public final Intent f31847c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31845a = i10;
        this.f31846b = activity;
        this.f31847c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31845a) {
            case 0:
                this.f31846b.startActivity(this.f31847c);
                return;
            default:
                this.f31846b.startActivity(this.f31847c);
                return;
        }
    }
}
