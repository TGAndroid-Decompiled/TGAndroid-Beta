package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29295a;
    public final Activity f29296b;
    public final Intent f29297c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29295a = i10;
        this.f29296b = activity;
        this.f29297c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29295a) {
            case 0:
                this.f29296b.startActivity(this.f29297c);
                return;
            default:
                this.f29296b.startActivity(this.f29297c);
                return;
        }
    }
}
