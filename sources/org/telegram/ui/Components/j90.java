package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
public final class j90 implements Runnable {
    public final int f27321a;
    public final n90 f27322b;

    public j90(n90 n90Var, int i10) {
        this.f27321a = i10;
        this.f27322b = n90Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27321a;
        n90 n90Var = this.f27322b;
        switch (i10) {
            case 0:
                n90Var.b0();
                return;
            default:
                Activity parentActivity = n90Var.getParentActivity();
                Activity parentActivity2 = n90Var.getParentActivity();
                org.telegram.messenger.s5 s5Var = ig.k1.f8344m;
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
