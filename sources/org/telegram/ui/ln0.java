package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class ln0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, yt {
    public final int f38788a;
    public final lo0 f38789b;

    public ln0(lo0 lo0Var, int i10) {
        this.f38788a = i10;
        this.f38789b = lo0Var;
    }

    @Override
    public void V0(tt ttVar) {
        switch (this.f38788a) {
            case 2:
                lo0 lo0Var = this.f38789b;
                lo0Var.f38830x0 = ttVar;
                lo0Var.f38807f[4].setText(ttVar.f41703a);
                return;
            default:
                lo0 lo0Var2 = this.f38789b;
                lo0Var2.f38830x0 = ttVar;
                lo0Var2.f38807f[4].setText(ttVar.f41703a);
                lo0Var2.f38832y0 = ttVar.d;
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38788a) {
            case 1:
                lo0 lo0Var = this.f38789b;
                lo0Var.I0(lo0Var.O0[0]);
                return;
            case 2:
            default:
                lo0 lo0Var2 = this.f38789b;
                lo0Var2.D0(true);
                lo0Var2.z0();
                return;
            case 3:
                this.f38789b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        lo0 lo0Var = this.f38789b;
        lo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = lo0Var.L;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
