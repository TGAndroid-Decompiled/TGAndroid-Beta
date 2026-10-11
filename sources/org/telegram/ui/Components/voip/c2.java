package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f31924a;
    public final Activity f31925b;
    public final Intent f31926c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31924a = i10;
        this.f31925b = activity;
        this.f31926c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31924a) {
            case 0:
                this.f31925b.startActivity(this.f31926c);
                return;
            default:
                this.f31925b.startActivity(this.f31926c);
                return;
        }
    }
}
