package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31850a;
    public final Activity f31851b;
    public final Intent f31852c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31850a = i10;
        this.f31851b = activity;
        this.f31852c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31850a) {
            case 0:
                this.f31851b.startActivity(this.f31852c);
                return;
            default:
                this.f31851b.startActivity(this.f31852c);
                return;
        }
    }
}
