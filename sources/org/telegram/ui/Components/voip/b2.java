package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.b2 {
    public final int f28862a;
    public final Activity f28863b;
    public final Intent f28864c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f28862a = i10;
        this.f28863b = activity;
        this.f28864c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f28862a) {
            case 0:
                this.f28863b.startActivity(this.f28864c);
                return;
            default:
                this.f28863b.startActivity(this.f28864c);
                return;
        }
    }
}
