package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class mk0 implements OnCompleteListener, org.telegram.ui.ActionBar.q1, ss {
    public final int f49246a;
    public final jl0 f49247b;

    public mk0(jl0 jl0Var, int i7) {
        this.f49246a = i7;
        this.f49247b = jl0Var;
    }

    @Override
    public void e(ps psVar) {
        switch (this.f49246a) {
            case 2:
                jl0 jl0Var = this.f49247b;
                jl0Var.B0 = psVar;
                jl0Var.f48396f[4].setText(psVar.f50358a);
                return;
            default:
                jl0 jl0Var2 = this.f49247b;
                jl0Var2.B0 = psVar;
                jl0Var2.f48396f[4].setText(psVar.f50358a);
                jl0Var2.C0 = psVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f49246a) {
            case 1:
                jl0 jl0Var = this.f49247b;
                jl0Var.O0(jl0Var.S0[0]);
                return;
            case 2:
            default:
                jl0 jl0Var2 = this.f49247b;
                jl0Var2.J0(true);
                jl0Var2.F0();
                return;
            case 3:
                this.f49247b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f49247b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
