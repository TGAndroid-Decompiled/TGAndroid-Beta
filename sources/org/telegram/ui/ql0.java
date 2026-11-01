package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
public final class ql0 implements OnCompleteListener, org.telegram.ui.ActionBar.u1, pt {
    public final int f40805a;
    public final qm0 f40806b;

    public ql0(qm0 qm0Var, int i10) {
        this.f40805a = i10;
        this.f40806b = qm0Var;
    }

    @Override
    public void c(mt mtVar) {
        switch (this.f40805a) {
            case 2:
                qm0 qm0Var = this.f40806b;
                qm0Var.A0 = mtVar;
                qm0Var.f40825f[4].setText(mtVar.f39611a);
                return;
            default:
                qm0 qm0Var2 = this.f40806b;
                qm0Var2.A0 = mtVar;
                qm0Var2.f40825f[4].setText(mtVar.f39611a);
                qm0Var2.B0 = mtVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f40805a) {
            case 1:
                qm0 qm0Var = this.f40806b;
                qm0Var.O0(qm0Var.R0[0]);
                return;
            case 2:
            default:
                qm0 qm0Var2 = this.f40806b;
                qm0Var2.J0(true);
                qm0Var2.F0();
                return;
            case 3:
                this.f40806b.G0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.f40806b.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        org.telegram.messenger.f8.e("isReadyToPay failed", task.getException());
    }
}
