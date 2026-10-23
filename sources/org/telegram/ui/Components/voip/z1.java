package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.z1 {
    public final int f32031a;
    public final Activity f32032b;
    public final Intent f32033c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f32031a = i10;
        this.f32032b = activity;
        this.f32033c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32031a) {
            case 0:
                this.f32032b.startActivity(this.f32033c);
                return;
            default:
                this.f32032b.startActivity(this.f32033c);
                return;
        }
    }
}
