package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class j1 implements org.telegram.ui.ActionBar.u1 {
    public final int f31556a;
    public final Activity f31557b;
    public final Intent f31558c;

    public j1(Activity activity, Intent intent, int i10) {
        this.f31556a = i10;
        this.f31557b = activity;
        this.f31558c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f31556a) {
            case 0:
                this.f31557b.startActivity(this.f31558c);
                return;
            default:
                this.f31557b.startActivity(this.f31558c);
                return;
        }
    }
}
