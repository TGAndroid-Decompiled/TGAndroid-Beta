package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class bn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, qt {
    public final int f36832a;
    public final bo0 f36833b;

    public bn0(bo0 bo0Var, int i10) {
        this.f36832a = i10;
        this.f36833b = bo0Var;
    }

    @Override
    public void Z0(lt ltVar) {
        switch (this.f36832a) {
            case 2:
                bo0 bo0Var = this.f36833b;
                bo0Var.f36870w0 = ltVar;
                bo0Var.f36849f[4].setText(ltVar.f40272a);
                return;
            default:
                bo0 bo0Var2 = this.f36833b;
                bo0Var2.f36870w0 = ltVar;
                bo0Var2.f36849f[4].setText(ltVar.f40272a);
                bo0Var2.f36872x0 = ltVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36832a) {
            case 1:
                bo0 bo0Var = this.f36833b;
                bo0Var.I0(bo0Var.N0[0]);
                return;
            case 2:
            default:
                bo0 bo0Var2 = this.f36833b;
                bo0Var2.D0(true);
                bo0Var2.z0();
                return;
            case 3:
                this.f36833b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        bo0 bo0Var = this.f36833b;
        bo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = bo0Var.K;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
