package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class nk0 implements OnCompleteListener, org.telegram.ui.ActionBar.q1, ss {
    public final int f50326a;
    public final kl0 f50327b;

    public nk0(kl0 kl0Var, int i7) {
        this.f50326a = i7;
        this.f50327b = kl0Var;
    }

    @Override
    public void d(ps psVar) {
        switch (this.f50326a) {
            case 2:
                kl0 kl0Var = this.f50327b;
                kl0Var.B0 = psVar;
                kl0Var.f49467f[4].setText(psVar.f51135a);
                return;
            default:
                kl0 kl0Var2 = this.f50327b;
                kl0Var2.B0 = psVar;
                kl0Var2.f49467f[4].setText(psVar.f51135a);
                kl0Var2.C0 = psVar.d;
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50326a) {
            case 1:
                kl0 kl0Var = this.f50327b;
                kl0Var.O0(kl0Var.S0[0]);
                return;
            case 2:
            default:
                kl0 kl0Var2 = this.f50327b;
                kl0Var2.J0(true);
                kl0Var2.F0();
                return;
            case 3:
                this.f50327b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f50327b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
