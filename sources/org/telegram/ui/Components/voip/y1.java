package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class y1 implements org.telegram.ui.ActionBar.r1 {
    public final int f41363a;
    public final Activity f41364b;
    public final Intent f41365c;

    public y1(Activity activity, Intent intent, int i7) {
        this.f41363a = i7;
        this.f41364b = activity;
        this.f41365c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f41363a) {
            case 0:
                this.f41364b.startActivity(this.f41365c);
                return;
            default:
                this.f41364b.startActivity(this.f41365c);
                return;
        }
    }
}
