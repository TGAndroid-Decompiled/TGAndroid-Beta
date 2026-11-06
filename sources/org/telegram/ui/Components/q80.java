package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class q80 implements Runnable {
    public final int f37309a;
    public final u80 f37310b;

    public q80(u80 u80Var, int i7) {
        this.f37309a = i7;
        this.f37310b = u80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f37309a;
        u80 u80Var = this.f37310b;
        switch (i7) {
            case 0:
                u80Var.b0();
                return;
            default:
                Activity parentActivity = u80Var.getParentActivity();
                Activity parentActivity2 = u80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.d1.f54914m;
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
