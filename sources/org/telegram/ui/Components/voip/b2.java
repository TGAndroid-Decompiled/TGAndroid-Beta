package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f28882a;
    public final Activity f28883b;
    public final Intent f28884c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f28882a = i10;
        this.f28883b = activity;
        this.f28884c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28882a) {
            case 0:
                this.f28883b.startActivity(this.f28884c);
                return;
            default:
                this.f28883b.startActivity(this.f28884c);
                return;
        }
    }
}
