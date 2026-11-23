package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class d90 implements Runnable {
    public final int f34248a;
    public final h90 f34249b;

    public d90(h90 h90Var, int i7) {
        this.f34248a = i7;
        this.f34249b = h90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34248a;
        h90 h90Var = this.f34249b;
        switch (i7) {
            case 0:
                h90Var.b0();
                return;
            default:
                Activity parentActivity = h90Var.getParentActivity();
                Activity parentActivity2 = h90Var.getParentActivity();
                org.telegram.messenger.r5 r5Var = sg.a1.f57281m;
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
