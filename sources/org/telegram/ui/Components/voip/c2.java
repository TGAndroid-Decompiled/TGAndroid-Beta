package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33860a;
    public final Activity f33861b;
    public final Intent f33862c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f33860a = i10;
        this.f33861b = activity;
        this.f33862c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33860a) {
            case 0:
                this.f33861b.startActivity(this.f33862c);
                return;
            default:
                this.f33861b.startActivity(this.f33862c);
                return;
        }
    }
}
