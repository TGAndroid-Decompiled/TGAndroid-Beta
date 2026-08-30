package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class a2 implements org.telegram.ui.ActionBar.c2 {
    public final int f29563a;
    public final Activity f29564b;
    public final Intent f29565c;

    public a2(Activity activity, Intent intent, int i10) {
        this.f29563a = i10;
        this.f29564b = activity;
        this.f29565c = intent;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f29563a) {
            case 0:
                this.f29564b.startActivity(this.f29565c);
                return;
            default:
                this.f29564b.startActivity(this.f29565c);
                return;
        }
    }
}
