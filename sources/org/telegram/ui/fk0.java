package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class fk0 implements OnCompleteListener, org.telegram.ui.ActionBar.p1, ns {
    public final int f45294a;
    public final dl0 f45295b;

    public fk0(dl0 dl0Var, int i3) {
        this.f45294a = i3;
        this.f45295b = dl0Var;
    }

    @Override
    public void c(ks ksVar) {
        switch (this.f45294a) {
            case 2:
                dl0 dl0Var = this.f45295b;
                dl0Var.B0 = ksVar;
                dl0Var.f44750f[4].setText(ksVar.f47004a);
                return;
            default:
                dl0 dl0Var2 = this.f45295b;
                dl0Var2.B0 = ksVar;
                dl0Var2.f44750f[4].setText(ksVar.f47004a);
                dl0Var2.C0 = ksVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45294a) {
            case 1:
                dl0 dl0Var = this.f45295b;
                dl0Var.O0(dl0Var.S0[0]);
                return;
            case 2:
            default:
                dl0 dl0Var2 = this.f45295b;
                dl0Var2.J0(true);
                dl0Var2.F0();
                return;
            case 3:
                this.f45295b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f45295b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.a8.e("isReadyToPay failed", task.getException());
    }
}
