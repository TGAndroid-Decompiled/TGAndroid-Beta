package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f31610a;
    public final Activity f31611b;
    public final Intent f31612c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31610a = i10;
        this.f31611b = activity;
        this.f31612c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31610a) {
            case 0:
                this.f31611b.startActivity(this.f31612c);
                return;
            default:
                this.f31611b.startActivity(this.f31612c);
                return;
        }
    }
}
