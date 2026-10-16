package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.z1 {
    public final int f30283a;
    public final Activity f30284b;
    public final Intent f30285c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f30283a = i10;
        this.f30284b = activity;
        this.f30285c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30283a) {
            case 0:
                this.f30284b.startActivity(this.f30285c);
                return;
            default:
                this.f30284b.startActivity(this.f30285c);
                return;
        }
    }
}
