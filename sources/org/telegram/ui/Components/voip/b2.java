package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f29178a;
    public final Activity f29179b;
    public final Intent f29180c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f29178a = i10;
        this.f29179b = activity;
        this.f29180c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29178a) {
            case 0:
                this.f29179b.startActivity(this.f29180c);
                return;
            default:
                this.f29179b.startActivity(this.f29180c);
                return;
        }
    }
}
