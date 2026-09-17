package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31955a;
    public final Activity f31956b;
    public final Intent f31957c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31955a = i10;
        this.f31956b = activity;
        this.f31957c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31955a) {
            case 0:
                this.f31956b.startActivity(this.f31957c);
                return;
            default:
                this.f31956b.startActivity(this.f31957c);
                return;
        }
    }
}
