package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f31625a;
    public final Activity f31626b;
    public final Intent f31627c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31625a = i10;
        this.f31626b = activity;
        this.f31627c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31625a) {
            case 0:
                this.f31626b.startActivity(this.f31627c);
                return;
            default:
                this.f31626b.startActivity(this.f31627c);
                return;
        }
    }
}
