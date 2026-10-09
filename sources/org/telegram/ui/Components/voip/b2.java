package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f31864a;
    public final Activity f31865b;
    public final Intent f31866c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f31864a = i10;
        this.f31865b = activity;
        this.f31866c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31864a) {
            case 0:
                this.f31865b.startActivity(this.f31866c);
                return;
            default:
                this.f31865b.startActivity(this.f31866c);
                return;
        }
    }
}
