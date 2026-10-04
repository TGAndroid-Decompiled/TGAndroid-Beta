package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31796a;
    public final Activity f31797b;
    public final Intent f31798c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31796a = i10;
        this.f31797b = activity;
        this.f31798c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31796a) {
            case 0:
                this.f31797b.startActivity(this.f31798c);
                return;
            default:
                this.f31797b.startActivity(this.f31798c);
                return;
        }
    }
}
