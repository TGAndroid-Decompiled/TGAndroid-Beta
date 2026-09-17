package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31982a;
    public final Activity f31983b;
    public final Intent f31984c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31982a = i10;
        this.f31983b = activity;
        this.f31984c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31982a) {
            case 0:
                this.f31983b.startActivity(this.f31984c);
                return;
            default:
                this.f31983b.startActivity(this.f31984c);
                return;
        }
    }
}
