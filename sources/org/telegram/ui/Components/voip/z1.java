package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31896a;
    public final Activity f31897b;
    public final Intent f31898c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31896a = i10;
        this.f31897b = activity;
        this.f31898c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31896a) {
            case 0:
                this.f31897b.startActivity(this.f31898c);
                return;
            default:
                this.f31897b.startActivity(this.f31898c);
                return;
        }
    }
}
