package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class q80 implements Runnable {
    public final int f37176a;
    public final v80 f37177b;

    public q80(v80 v80Var, int i7) {
        this.f37176a = i7;
        this.f37177b = v80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f37176a;
        v80 v80Var = this.f37177b;
        switch (i7) {
            case 0:
                v80Var.b0();
                return;
            default:
                Activity parentActivity = v80Var.getParentActivity();
                Activity parentActivity2 = v80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.c1.f55038m;
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
