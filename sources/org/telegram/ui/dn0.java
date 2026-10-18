package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, pt {
    public final int f36220a;
    public final go0 f36221b;

    public dn0(go0 go0Var, int i10) {
        this.f36220a = i10;
        this.f36221b = go0Var;
    }

    @Override
    public void L0(kt ktVar) {
        switch (this.f36220a) {
            case 2:
                go0 go0Var = this.f36221b;
                go0Var.A0 = ktVar;
                go0Var.f37228f[4].setText(ktVar.f38624a);
                return;
            default:
                go0 go0Var2 = this.f36221b;
                go0Var2.A0 = ktVar;
                go0Var2.f37228f[4].setText(ktVar.f38624a);
                go0Var2.B0 = ktVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36220a) {
            case 1:
                go0 go0Var = this.f36221b;
                go0Var.I0(go0Var.R0[0]);
                return;
            case 2:
            default:
                go0 go0Var2 = this.f36221b;
                go0Var2.D0(true);
                go0Var2.z0();
                return;
            case 3:
                this.f36221b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        go0 go0Var = this.f36221b;
        go0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = go0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
