package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class t80 implements Runnable {
    public final int f39610a;
    public final x80 f39611b;

    public t80(x80 x80Var, int i7) {
        this.f39610a = i7;
        this.f39611b = x80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39610a;
        x80 x80Var = this.f39611b;
        switch (i7) {
            case 0:
                x80Var.b0();
                return;
            default:
                Activity parentActivity = x80Var.getParentActivity();
                Activity parentActivity2 = x80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.b1.f56589m;
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
