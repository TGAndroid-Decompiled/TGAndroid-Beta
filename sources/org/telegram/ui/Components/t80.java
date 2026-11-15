package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class t80 implements Runnable {
    public final int f39608a;
    public final y80 f39609b;

    public t80(y80 y80Var, int i7) {
        this.f39608a = i7;
        this.f39609b = y80Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39608a;
        y80 y80Var = this.f39609b;
        switch (i7) {
            case 0:
                y80Var.b0();
                return;
            default:
                Activity parentActivity = y80Var.getParentActivity();
                Activity parentActivity2 = y80Var.getParentActivity();
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
