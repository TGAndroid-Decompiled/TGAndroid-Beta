package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33755a;
    public final Activity f33756b;
    public final Intent f33757c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f33755a = i10;
        this.f33756b = activity;
        this.f33757c = intent;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f33755a) {
            case 0:
                this.f33756b.startActivity(this.f33757c);
                return;
            default:
                this.f33756b.startActivity(this.f33757c);
                return;
        }
    }
}
