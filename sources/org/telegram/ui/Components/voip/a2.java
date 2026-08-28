package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class a2 implements org.telegram.ui.ActionBar.b2 {
    public final int f33436a;
    public final Activity f33437b;
    public final Intent f33438c;

    public a2(Activity activity, Intent intent, int i9) {
        this.f33436a = i9;
        this.f33437b = activity;
        this.f33438c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f33436a) {
            case 0:
                this.f33437b.startActivity(this.f33438c);
                return;
            default:
                this.f33437b.startActivity(this.f33438c);
                return;
        }
    }
}
