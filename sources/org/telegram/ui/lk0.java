package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class lk0 implements OnCompleteListener, org.telegram.ui.ActionBar.r1, rs {
    public final int f47631a;
    public final jl0 f47632b;

    public lk0(jl0 jl0Var, int i7) {
        this.f47631a = i7;
        this.f47632b = jl0Var;
    }

    @Override
    public void b(os osVar) {
        switch (this.f47631a) {
            case 2:
                jl0 jl0Var = this.f47632b;
                jl0Var.A0 = osVar;
                jl0Var.f47007f[4].setText(osVar.f48510a);
                return;
            default:
                jl0 jl0Var2 = this.f47632b;
                jl0Var2.A0 = osVar;
                jl0Var2.f47007f[4].setText(osVar.f48510a);
                jl0Var2.B0 = osVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47631a) {
            case 1:
                jl0 jl0Var = this.f47632b;
                jl0Var.O0(jl0Var.R0[0]);
                return;
            case 2:
            default:
                jl0 jl0Var2 = this.f47632b;
                jl0Var2.J0(true);
                jl0Var2.F0();
                return;
            case 3:
                this.f47632b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f47632b.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
