package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class z1 implements org.telegram.ui.ActionBar.a2 {
    public final int f31849a;
    public final Activity f31850b;
    public final Intent f31851c;

    public z1(Activity activity, Intent intent, int i10) {
        this.f31849a = i10;
        this.f31850b = activity;
        this.f31851c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31849a) {
            case 0:
                this.f31850b.startActivity(this.f31851c);
                return;
            default:
                this.f31850b.startActivity(this.f31851c);
                return;
        }
    }
}
