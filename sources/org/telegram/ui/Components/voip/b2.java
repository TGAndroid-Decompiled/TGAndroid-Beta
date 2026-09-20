package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;
public final class b2 implements org.telegram.ui.ActionBar.a2 {
    public final int f29285a;
    public final Activity f29286b;
    public final Intent f29287c;

    public b2(Activity activity, Intent intent, int i10) {
        this.f29285a = i10;
        this.f29286b = activity;
        this.f29287c = intent;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f29285a) {
            case 0:
                this.f29286b.startActivity(this.f29287c);
                return;
            default:
                this.f29286b.startActivity(this.f29287c);
                return;
        }
    }
}
