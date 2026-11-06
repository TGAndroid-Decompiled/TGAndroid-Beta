package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class jk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, ps {
    public final int f46991a;
    public final hl0 f46992b;

    public jk0(hl0 hl0Var, int i7) {
        this.f46991a = i7;
        this.f46992b = hl0Var;
    }

    @Override
    public void b(ms msVar) {
        switch (this.f46991a) {
            case 2:
                hl0 hl0Var = this.f46992b;
                hl0Var.A0 = msVar;
                hl0Var.f46421f[4].setText(msVar.f47870a);
                return;
            default:
                hl0 hl0Var2 = this.f46992b;
                hl0Var2.A0 = msVar;
                hl0Var2.f46421f[4].setText(msVar.f47870a);
                hl0Var2.B0 = msVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46991a) {
            case 1:
                hl0 hl0Var = this.f46992b;
                hl0Var.O0(hl0Var.R0[0]);
                return;
            case 2:
            default:
                hl0 hl0Var2 = this.f46992b;
                hl0Var2.J0(true);
                hl0Var2.F0();
                return;
            case 3:
                this.f46992b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f46992b.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
