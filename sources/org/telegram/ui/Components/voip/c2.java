package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31797a;
    public final Activity f31798b;
    public final Intent f31799c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31797a = i10;
        this.f31798b = activity;
        this.f31799c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31797a) {
            case 0:
                this.f31798b.startActivity(this.f31799c);
                return;
            default:
                this.f31798b.startActivity(this.f31799c);
                return;
        }
    }
}
