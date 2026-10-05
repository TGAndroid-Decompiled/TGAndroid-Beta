package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31870a;
    public final Activity f31871b;
    public final Intent f31872c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31870a = i10;
        this.f31871b = activity;
        this.f31872c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31870a) {
            case 0:
                this.f31871b.startActivity(this.f31872c);
                return;
            default:
                this.f31871b.startActivity(this.f31872c);
                return;
        }
    }
}
