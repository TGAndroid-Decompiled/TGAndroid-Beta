package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class mk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, ss {
    public final int f47981a;
    public final kl0 f47982b;

    public mk0(kl0 kl0Var, int i7) {
        this.f47981a = i7;
        this.f47982b = kl0Var;
    }

    @Override
    public void b(ps psVar) {
        switch (this.f47981a) {
            case 2:
                kl0 kl0Var = this.f47982b;
                kl0Var.A0 = psVar;
                kl0Var.f47339f[4].setText(psVar.f48826a);
                return;
            default:
                kl0 kl0Var2 = this.f47982b;
                kl0Var2.A0 = psVar;
                kl0Var2.f47339f[4].setText(psVar.f48826a);
                kl0Var2.B0 = psVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47981a) {
            case 1:
                kl0 kl0Var = this.f47982b;
                kl0Var.O0(kl0Var.R0[0]);
                return;
            case 2:
            default:
                kl0 kl0Var2 = this.f47982b;
                kl0Var2.J0(true);
                kl0Var2.F0();
                return;
            case 3:
                this.f47982b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f47982b.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
