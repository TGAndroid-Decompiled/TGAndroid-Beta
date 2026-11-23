package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class y1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41461a;
    public final Activity f41462b;
    public final Intent f41463c;

    public y1(Activity activity, Intent intent, int i7) {
        this.f41461a = i7;
        this.f41462b = activity;
        this.f41463c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41461a) {
            case 0:
                this.f41462b.startActivity(this.f41463c);
                return;
            default:
                this.f41462b.startActivity(this.f41463c);
                return;
        }
    }
}
