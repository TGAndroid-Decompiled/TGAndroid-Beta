package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class ln0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, zt {
    public final int f35809a;
    public final lo0 f35810b;

    public ln0(lo0 lo0Var, int i10) {
        this.f35809a = i10;
        this.f35810b = lo0Var;
    }

    @Override
    public void Y0(ut utVar) {
        switch (this.f35809a) {
            case 2:
                lo0 lo0Var = this.f35810b;
                lo0Var.f35849x0 = utVar;
                lo0Var.f35826f[4].setText(utVar.f38913a);
                return;
            default:
                lo0 lo0Var2 = this.f35810b;
                lo0Var2.f35849x0 = utVar;
                lo0Var2.f35826f[4].setText(utVar.f38913a);
                lo0Var2.f35851y0 = utVar.d;
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35809a) {
            case 1:
                lo0 lo0Var = this.f35810b;
                lo0Var.I0(lo0Var.O0[0]);
                return;
            case 2:
            default:
                lo0 lo0Var2 = this.f35810b;
                lo0Var2.D0(true);
                lo0Var2.z0();
                return;
            case 3:
                this.f35810b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        lo0 lo0Var = this.f35810b;
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
