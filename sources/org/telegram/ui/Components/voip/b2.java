package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.b2 {
    public final int f28859a;
    public final Activity f28860b;
    public final Intent f28861c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f28859a = i10;
        this.f28860b = activity;
        this.f28861c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f28859a) {
            case 0:
                this.f28860b.startActivity(this.f28861c);
                return;
            default:
                this.f28860b.startActivity(this.f28861c);
                return;
        }
    }
}
