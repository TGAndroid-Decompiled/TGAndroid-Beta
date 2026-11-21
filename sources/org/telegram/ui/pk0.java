package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class pk0 implements OnCompleteListener, org.telegram.ui.ActionBar.q1, ts {
    public final int f50890a;
    public final ml0 f50891b;

    public pk0(ml0 ml0Var, int i7) {
        this.f50890a = i7;
        this.f50891b = ml0Var;
    }

    @Override
    public void b(ps psVar) {
        switch (this.f50890a) {
            case 2:
                ml0 ml0Var = this.f50891b;
                ml0Var.B0 = psVar;
                ml0Var.f49908f[4].setText(psVar.f50965a);
                return;
            default:
                ml0 ml0Var2 = this.f50891b;
                ml0Var2.B0 = psVar;
                ml0Var2.f49908f[4].setText(psVar.f50965a);
                ml0Var2.C0 = psVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50890a) {
            case 1:
                ml0 ml0Var = this.f50891b;
                ml0Var.O0(ml0Var.S0[0]);
                return;
            case 2:
            default:
                ml0 ml0Var2 = this.f50891b;
                ml0Var2.J0(true);
                ml0Var2.F0();
                return;
            case 3:
                this.f50891b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f50891b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
