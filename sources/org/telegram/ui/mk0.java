package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class mk0 implements OnCompleteListener, org.telegram.ui.ActionBar.q1, ss {
    public final int f49242a;
    public final kl0 f49243b;

    public mk0(kl0 kl0Var, int i7) {
        this.f49242a = i7;
        this.f49243b = kl0Var;
    }

    @Override
    public void e(ps psVar) {
        switch (this.f49242a) {
            case 2:
                kl0 kl0Var = this.f49243b;
                kl0Var.B0 = psVar;
                kl0Var.f48688f[4].setText(psVar.f50349a);
                return;
            default:
                kl0 kl0Var2 = this.f49243b;
                kl0Var2.B0 = psVar;
                kl0Var2.f48688f[4].setText(psVar.f50349a);
                kl0Var2.C0 = psVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49242a) {
            case 1:
                kl0 kl0Var = this.f49243b;
                kl0Var.O0(kl0Var.S0[0]);
                return;
            case 2:
            default:
                kl0 kl0Var2 = this.f49243b;
                kl0Var2.J0(true);
                kl0Var2.F0();
                return;
            case 3:
                this.f49243b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f49243b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
