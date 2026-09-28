package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29217a;
    public final Activity f29218b;
    public final Intent f29219c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29217a = i10;
        this.f29218b = activity;
        this.f29219c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29217a) {
            case 0:
                this.f29218b.startActivity(this.f29219c);
                return;
            default:
                this.f29218b.startActivity(this.f29219c);
                return;
        }
    }
}
