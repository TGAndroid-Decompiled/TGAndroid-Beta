package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class a2 implements org.telegram.ui.ActionBar.c2 {
    public final int f28050a;
    public final Activity f28051b;
    public final Intent f28052c;

    public a2(Activity activity, Intent intent, int i10) {
        this.f28050a = i10;
        this.f28051b = activity;
        this.f28052c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f28050a) {
            case 0:
                this.f28051b.startActivity(this.f28052c);
                return;
            default:
                this.f28051b.startActivity(this.f28052c);
                return;
        }
    }
}
