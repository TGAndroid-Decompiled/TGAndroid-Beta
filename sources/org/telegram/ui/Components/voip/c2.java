package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29296a;
    public final Activity f29297b;
    public final Intent f29298c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29296a = i10;
        this.f29297b = activity;
        this.f29298c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29296a) {
            case 0:
                this.f29297b.startActivity(this.f29298c);
                return;
            default:
                this.f29297b.startActivity(this.f29298c);
                return;
        }
    }
}
