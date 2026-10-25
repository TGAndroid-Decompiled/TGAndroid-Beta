package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33752a;
    public final Activity f33753b;
    public final Intent f33754c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f33752a = i10;
        this.f33753b = activity;
        this.f33754c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33752a) {
            case 0:
                this.f33753b.startActivity(this.f33754c);
                return;
            default:
                this.f33753b.startActivity(this.f33754c);
                return;
        }
    }
}
