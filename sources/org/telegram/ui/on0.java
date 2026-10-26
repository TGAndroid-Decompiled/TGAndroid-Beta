package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class on0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, nt {
    public final int f42253a;
    public final po0 f42254b;

    public on0(po0 po0Var, int i10) {
        this.f42253a = i10;
        this.f42254b = po0Var;
    }

    @Override
    public void Y0(jt jtVar) {
        switch (this.f42253a) {
            case 2:
                po0 po0Var = this.f42254b;
                po0Var.A0 = jtVar;
                po0Var.f42599f[4].setText(jtVar.f40743a);
                return;
            default:
                po0 po0Var2 = this.f42254b;
                po0Var2.A0 = jtVar;
                po0Var2.f42599f[4].setText(jtVar.f40743a);
                po0Var2.B0 = jtVar.d;
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42253a) {
            case 1:
                po0 po0Var = this.f42254b;
                po0Var.J0(po0Var.R0[0]);
                return;
            case 2:
            default:
                po0 po0Var2 = this.f42254b;
                po0Var2.E0(true);
                po0Var2.A0();
                return;
            case 3:
                this.f42254b.B0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        po0 po0Var = this.f42254b;
        po0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = po0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
