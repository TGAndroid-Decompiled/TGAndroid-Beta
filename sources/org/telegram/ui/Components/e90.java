package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class e90 implements Runnable {
    public final int f34653a;
    public final i90 f34654b;

    public e90(i90 i90Var, int i7) {
        this.f34653a = i7;
        this.f34654b = i90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34653a;
        i90 i90Var = this.f34654b;
        switch (i7) {
            case 0:
                i90Var.b0();
                return;
            default:
                Activity parentActivity = i90Var.getParentActivity();
                Activity parentActivity2 = i90Var.getParentActivity();
                org.telegram.messenger.r5 r5Var = sg.b1.f57163m;
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
