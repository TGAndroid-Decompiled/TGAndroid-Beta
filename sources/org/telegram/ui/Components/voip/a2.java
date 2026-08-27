package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

public final class a2 implements org.telegram.ui.ActionBar.a2 {

    public final int f33486a;

    public final Activity f33487b;

    public final Intent f33488c;

    public a2(Activity activity, Intent intent, int i10) {
        this.f33486a = i10;
        this.f33487b = activity;
        this.f33488c = intent;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33486a) {
            case 0:
                this.f33487b.startActivity(this.f33488c);
                break;
            default:
                this.f33487b.startActivity(this.f33488c);
                break;
        }
    }
}
