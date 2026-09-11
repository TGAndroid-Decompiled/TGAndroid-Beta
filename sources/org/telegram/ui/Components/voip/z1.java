package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31954a;
    public final Activity f31955b;
    public final Intent f31956c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31954a = i10;
        this.f31955b = activity;
        this.f31956c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31954a) {
            case 0:
                this.f31955b.startActivity(this.f31956c);
                return;
            default:
                this.f31955b.startActivity(this.f31956c);
                return;
        }
    }
}
