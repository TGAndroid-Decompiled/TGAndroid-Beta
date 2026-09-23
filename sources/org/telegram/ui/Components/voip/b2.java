package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f28853a;
    public final Activity f28854b;
    public final Intent f28855c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f28853a = i10;
        this.f28854b = activity;
        this.f28855c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28853a) {
            case 0:
                this.f28854b.startActivity(this.f28855c);
                return;
            default:
                this.f28854b.startActivity(this.f28855c);
                return;
        }
    }
}
