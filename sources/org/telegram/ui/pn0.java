package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class pn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, xt {
    public final int f36509a;
    public final ro0 f36510b;

    public pn0(ro0 ro0Var, int i10) {
        this.f36509a = i10;
        this.f36510b = ro0Var;
    }

    @Override
    public void a1(tt ttVar) {
        switch (this.f36509a) {
            case 2:
                ro0 ro0Var = this.f36510b;
                ro0Var.A0 = ttVar;
                ro0Var.f37180f[4].setText(ttVar.f37908a);
                return;
            default:
                ro0 ro0Var2 = this.f36510b;
                ro0Var2.A0 = ttVar;
                ro0Var2.f37180f[4].setText(ttVar.f37908a);
                ro0Var2.B0 = ttVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36509a) {
            case 1:
                ro0 ro0Var = this.f36510b;
                ro0Var.I0(ro0Var.R0[0]);
                return;
            case 2:
            default:
                ro0 ro0Var2 = this.f36510b;
                ro0Var2.D0(true);
                ro0Var2.z0();
                return;
            case 3:
                this.f36510b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ro0 ro0Var = this.f36510b;
        ro0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = ro0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
