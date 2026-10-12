package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.z1 {
    public final int f30614a;
    public final Activity f30615b;
    public final Intent f30616c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f30614a = i10;
        this.f30615b = activity;
        this.f30616c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30614a) {
            case 0:
                this.f30615b.startActivity(this.f30616c);
                return;
            default:
                this.f30615b.startActivity(this.f30616c);
                return;
        }
    }
}
