package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.z1 {
    public final int f32001a;
    public final Activity f32002b;
    public final Intent f32003c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f32001a = i10;
        this.f32002b = activity;
        this.f32003c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32001a) {
            case 0:
                this.f32002b.startActivity(this.f32003c);
                return;
            default:
                this.f32002b.startActivity(this.f32003c);
                return;
        }
    }
}
