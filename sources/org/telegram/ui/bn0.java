package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class bn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, nt {
    public final int f35673a;
    public final eo0 f35674b;

    public bn0(eo0 eo0Var, int i10) {
        this.f35673a = i10;
        this.f35674b = eo0Var;
    }

    @Override
    public void L0(ht htVar) {
        switch (this.f35673a) {
            case 2:
                eo0 eo0Var = this.f35674b;
                eo0Var.A0 = htVar;
                eo0Var.f36712f[4].setText(htVar.f37784a);
                return;
            default:
                eo0 eo0Var2 = this.f35674b;
                eo0Var2.A0 = htVar;
                eo0Var2.f36712f[4].setText(htVar.f37784a);
                eo0Var2.B0 = htVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35673a) {
            case 1:
                eo0 eo0Var = this.f35674b;
                eo0Var.I0(eo0Var.R0[0]);
                return;
            case 2:
            default:
                eo0 eo0Var2 = this.f35674b;
                eo0Var2.D0(true);
                eo0Var2.z0();
                return;
            case 3:
                this.f35674b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        eo0 eo0Var = this.f35674b;
        eo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = eo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
