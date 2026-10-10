package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31929a;
    public final Activity f31930b;
    public final Intent f31931c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f31929a = i10;
        this.f31930b = activity;
        this.f31931c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31929a) {
            case 0:
                this.f31930b.startActivity(this.f31931c);
                return;
            default:
                this.f31930b.startActivity(this.f31931c);
                return;
        }
    }
}
