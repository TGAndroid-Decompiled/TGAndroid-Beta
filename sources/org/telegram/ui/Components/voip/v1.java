package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class v1 implements org.telegram.ui.ActionBar.r1 {
    public final int f39669a;
    public final Activity f39670b;
    public final Intent f39671c;

    public v1(Activity activity, Intent intent, int i7) {
        this.f39669a = i7;
        this.f39670b = activity;
        this.f39671c = intent;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f39669a) {
            case 0:
                this.f39670b.startActivity(this.f39671c);
                return;
            default:
                this.f39670b.startActivity(this.f39671c);
                return;
        }
    }
}
