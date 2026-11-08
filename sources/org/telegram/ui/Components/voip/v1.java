package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class v1 implements org.telegram.ui.ActionBar.r1 {
    public final int f39580a;
    public final Activity f39581b;
    public final Intent f39582c;

    public v1(Activity activity, Intent intent, int i7) {
        this.f39580a = i7;
        this.f39581b = activity;
        this.f39582c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f39580a) {
            case 0:
                this.f39581b.startActivity(this.f39582c);
                return;
            default:
                this.f39581b.startActivity(this.f39582c);
                return;
        }
    }
}
