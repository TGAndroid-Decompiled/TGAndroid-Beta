package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31803a;
    public final Activity f31804b;
    public final Intent f31805c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f31803a = i10;
        this.f31804b = activity;
        this.f31805c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31803a) {
            case 0:
                this.f31804b.startActivity(this.f31805c);
                return;
            default:
                this.f31804b.startActivity(this.f31805c);
                return;
        }
    }
}
