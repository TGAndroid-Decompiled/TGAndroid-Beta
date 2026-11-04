package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class n80 implements Runnable {
    public final int f36416a;
    public final r80 f36417b;

    public n80(r80 r80Var, int i3) {
        this.f36416a = i3;
        this.f36417b = r80Var;
    }

    @Override
    public final void run() {
        int i3 = this.f36416a;
        r80 r80Var = this.f36417b;
        switch (i3) {
            case 0:
                r80Var.b0();
                return;
            default:
                Activity parentActivity = r80Var.getParentActivity();
                Activity parentActivity2 = r80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = tg.b1.f55131m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
        }
    }
}
