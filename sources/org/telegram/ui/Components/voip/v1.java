package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class v1 implements org.telegram.ui.ActionBar.r1 {
    public final int f39524a;
    public final Activity f39525b;
    public final Intent f39526c;

    public v1(Activity activity, Intent intent, int i7) {
        this.f39524a = i7;
        this.f39525b = activity;
        this.f39526c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f39524a) {
            case 0:
                this.f39525b.startActivity(this.f39526c);
                return;
            default:
                this.f39525b.startActivity(this.f39526c);
                return;
        }
    }
}
