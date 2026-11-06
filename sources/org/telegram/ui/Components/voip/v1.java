package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class v1 implements org.telegram.ui.ActionBar.r1 {
    public final int f39545a;
    public final Activity f39546b;
    public final Intent f39547c;

    public v1(Activity activity, Intent intent, int i7) {
        this.f39545a = i7;
        this.f39546b = activity;
        this.f39547c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f39545a) {
            case 0:
                this.f39546b.startActivity(this.f39547c);
                return;
            default:
                this.f39546b.startActivity(this.f39547c);
                return;
        }
    }
}
