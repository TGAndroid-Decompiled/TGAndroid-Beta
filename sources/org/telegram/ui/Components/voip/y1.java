package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class y1 implements org.telegram.ui.ActionBar.q1 {
    public final int f41500a;
    public final Activity f41501b;
    public final Intent f41502c;

    public y1(Activity activity, Intent intent, int i7) {
        this.f41500a = i7;
        this.f41501b = activity;
        this.f41502c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f41500a) {
            case 0:
                this.f41501b.startActivity(this.f41502c);
                return;
            default:
                this.f41501b.startActivity(this.f41502c);
                return;
        }
    }
}
