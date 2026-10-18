package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31892a;
    public final Activity f31893b;
    public final Intent f31894c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31892a = i10;
        this.f31893b = activity;
        this.f31894c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31892a) {
            case 0:
                this.f31893b.startActivity(this.f31894c);
                return;
            default:
                this.f31893b.startActivity(this.f31894c);
                return;
        }
    }
}
