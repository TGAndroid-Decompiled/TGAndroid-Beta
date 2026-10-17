package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31885a;
    public final Activity f31886b;
    public final Intent f31887c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31885a = i10;
        this.f31886b = activity;
        this.f31887c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31885a) {
            case 0:
                this.f31886b.startActivity(this.f31887c);
                return;
            default:
                this.f31886b.startActivity(this.f31887c);
                return;
        }
    }
}
