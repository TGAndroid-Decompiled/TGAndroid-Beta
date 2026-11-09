package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class r80 implements Runnable {
    public final int f37585a;
    public final v80 f37586b;

    public r80(v80 v80Var, int i7) {
        this.f37585a = i7;
        this.f37586b = v80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f37585a;
        v80 v80Var = this.f37586b;
        switch (i7) {
            case 0:
                v80Var.b0();
                return;
            default:
                Activity parentActivity = v80Var.getParentActivity();
                Activity parentActivity2 = v80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.c1.f55039m;
                boolean z9 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z9) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
        }
    }
}
