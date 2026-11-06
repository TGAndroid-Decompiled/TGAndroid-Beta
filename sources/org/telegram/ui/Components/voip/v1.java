package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class v1 implements org.telegram.ui.ActionBar.r1 {
    public final int f39527a;
    public final Activity f39528b;
    public final Intent f39529c;

    public v1(Activity activity, Intent intent, int i7) {
        this.f39527a = i7;
        this.f39528b = activity;
        this.f39529c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f39527a) {
            case 0:
                this.f39528b.startActivity(this.f39529c);
                return;
            default:
                this.f39528b.startActivity(this.f39529c);
                return;
        }
    }
}
