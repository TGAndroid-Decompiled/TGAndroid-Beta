package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class g90 implements Runnable {
    public final int f35485a;
    public final k90 f35486b;

    public g90(k90 k90Var, int i7) {
        this.f35485a = i7;
        this.f35486b = k90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35485a;
        k90 k90Var = this.f35486b;
        switch (i7) {
            case 0:
                k90Var.b0();
                return;
            default:
                Activity parentActivity = k90Var.getParentActivity();
                Activity parentActivity2 = k90Var.getParentActivity();
                org.telegram.messenger.r5 r5Var = sg.b1.f57208m;
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
