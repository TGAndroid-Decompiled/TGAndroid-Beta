package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29213a;
    public final Activity f29214b;
    public final Intent f29215c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29213a = i10;
        this.f29214b = activity;
        this.f29215c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29213a) {
            case 0:
                this.f29214b.startActivity(this.f29215c);
                return;
            default:
                this.f29214b.startActivity(this.f29215c);
                return;
        }
    }
}
