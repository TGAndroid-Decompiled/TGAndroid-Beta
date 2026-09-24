package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class mn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, vt {
    public final int f35621a;
    public final oo0 f35622b;

    public mn0(oo0 oo0Var, int i10) {
        this.f35621a = i10;
        this.f35622b = oo0Var;
    }

    @Override
    public void a1(qt qtVar) {
        switch (this.f35621a) {
            case 2:
                oo0 oo0Var = this.f35622b;
                oo0Var.A0 = qtVar;
                oo0Var.f36274f[4].setText(qtVar.f36969a);
                return;
            default:
                oo0 oo0Var2 = this.f35622b;
                oo0Var2.A0 = qtVar;
                oo0Var2.f36274f[4].setText(qtVar.f36969a);
                oo0Var2.B0 = qtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35621a) {
            case 1:
                oo0 oo0Var = this.f35622b;
                oo0Var.I0(oo0Var.R0[0]);
                return;
            case 2:
            default:
                oo0 oo0Var2 = this.f35622b;
                oo0Var2.D0(true);
                oo0Var2.z0();
                return;
            case 3:
                this.f35622b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        oo0 oo0Var = this.f35622b;
        oo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = oo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
