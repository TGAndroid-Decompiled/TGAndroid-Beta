package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.b2 {
    public final int f29238a;
    public final Activity f29239b;
    public final Intent f29240c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29238a = i10;
        this.f29239b = activity;
        this.f29240c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29238a) {
            case 0:
                this.f29239b.startActivity(this.f29240c);
                return;
            default:
                this.f29239b.startActivity(this.f29240c);
                return;
        }
    }
}
