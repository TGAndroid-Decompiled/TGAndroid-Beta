package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31846a;
    public final Activity f31847b;
    public final Intent f31848c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31846a = i10;
        this.f31847b = activity;
        this.f31848c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31846a) {
            case 0:
                this.f31847b.startActivity(this.f31848c);
                return;
            default:
                this.f31847b.startActivity(this.f31848c);
                return;
        }
    }
}
