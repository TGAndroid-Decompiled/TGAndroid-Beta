package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class y1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41498a;
    public final Activity f41499b;
    public final Intent f41500c;

    public y1(Activity activity, Intent intent, int i7) {
        this.f41498a = i7;
        this.f41499b = activity;
        this.f41500c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41498a) {
            case 0:
                this.f41499b.startActivity(this.f41500c);
                return;
            default:
                this.f41499b.startActivity(this.f41500c);
                return;
        }
    }
}
