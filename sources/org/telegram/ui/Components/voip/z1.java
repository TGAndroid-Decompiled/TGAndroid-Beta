package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31894a;
    public final Activity f31895b;
    public final Intent f31896c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31894a = i10;
        this.f31895b = activity;
        this.f31896c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31894a) {
            case 0:
                this.f31895b.startActivity(this.f31896c);
                return;
            default:
                this.f31895b.startActivity(this.f31896c);
                return;
        }
    }
}
