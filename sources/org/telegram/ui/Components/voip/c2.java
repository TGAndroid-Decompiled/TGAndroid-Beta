package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29216a;
    public final Activity f29217b;
    public final Intent f29218c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29216a = i10;
        this.f29217b = activity;
        this.f29218c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29216a) {
            case 0:
                this.f29217b.startActivity(this.f29218c);
                return;
            default:
                this.f29217b.startActivity(this.f29218c);
                return;
        }
    }
}
