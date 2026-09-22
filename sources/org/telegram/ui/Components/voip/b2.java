package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f28879a;
    public final Activity f28880b;
    public final Intent f28881c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f28879a = i10;
        this.f28880b = activity;
        this.f28881c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28879a) {
            case 0:
                this.f28880b.startActivity(this.f28881c);
                return;
            default:
                this.f28880b.startActivity(this.f28881c);
                return;
        }
    }
}
