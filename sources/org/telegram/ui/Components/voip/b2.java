package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.c2 {
    public final int f31976a;
    public final Activity f31977b;
    public final Intent f31978c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f31976a = i10;
        this.f31977b = activity;
        this.f31978c = intent;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31976a) {
            case 0:
                this.f31977b.startActivity(this.f31978c);
                return;
            default:
                this.f31977b.startActivity(this.f31978c);
                return;
        }
    }
}
