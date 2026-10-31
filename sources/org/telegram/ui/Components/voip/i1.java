package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class i1 implements org.telegram.ui.ActionBar.u1 {
    public final int f31476a;
    public final Activity f31477b;
    public final Intent f31478c;

    public i1(Activity activity, Intent intent, int i10) {
        this.f31476a = i10;
        this.f31477b = activity;
        this.f31478c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f31476a) {
            case 0:
                this.f31477b.startActivity(this.f31478c);
                return;
            default:
                this.f31477b.startActivity(this.f31478c);
                return;
        }
    }
}
