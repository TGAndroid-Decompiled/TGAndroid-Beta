package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class c2 implements org.telegram.ui.ActionBar.z1 {
    public final int f29207a;
    public final Activity f29208b;
    public final Intent f29209c;

    public c2(Activity activity, Intent intent, int i10) {
        this.f29207a = i10;
        this.f29208b = activity;
        this.f29209c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f29207a) {
            case 0:
                this.f29208b.startActivity(this.f29209c);
                return;
            default:
                this.f29208b.startActivity(this.f29209c);
                return;
        }
    }
}
