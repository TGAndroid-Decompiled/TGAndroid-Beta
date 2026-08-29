package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33653a;
    public final Activity f33654b;
    public final Intent f33655c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f33653a = i10;
        this.f33654b = activity;
        this.f33655c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f33653a) {
            case 0:
                this.f33654b.startActivity(this.f33655c);
                return;
            default:
                this.f33654b.startActivity(this.f33655c);
                return;
        }
    }
}
