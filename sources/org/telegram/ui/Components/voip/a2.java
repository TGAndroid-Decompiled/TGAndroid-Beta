package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class a2 implements org.telegram.ui.ActionBar.c2 {
    public final int f29535a;
    public final Activity f29536b;
    public final Intent f29537c;

    public a2(Activity activity, Intent intent, int i10) {
        this.f29535a = i10;
        this.f29536b = activity;
        this.f29537c = intent;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f29535a) {
            case 0:
                this.f29536b.startActivity(this.f29537c);
                return;
            default:
                this.f29536b.startActivity(this.f29537c);
                return;
        }
    }
}
