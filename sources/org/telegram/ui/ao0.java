package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class ao0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, eu {
    public final int f34288a;
    public final cp0 f34289b;

    public ao0(cp0 cp0Var, int i10) {
        this.f34288a = i10;
        this.f34289b = cp0Var;
    }

    @Override
    public void a1(au auVar) {
        switch (this.f34288a) {
            case 2:
                cp0 cp0Var = this.f34289b;
                cp0Var.A0 = auVar;
                cp0Var.f35008f[4].setText(auVar.f34339a);
                return;
            default:
                cp0 cp0Var2 = this.f34289b;
                cp0Var2.A0 = auVar;
                cp0Var2.f35008f[4].setText(auVar.f34339a);
                cp0Var2.B0 = auVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34288a) {
            case 1:
                cp0 cp0Var = this.f34289b;
                cp0Var.I0(cp0Var.R0[0]);
                return;
            case 2:
            default:
                cp0 cp0Var2 = this.f34289b;
                cp0Var2.D0(true);
                cp0Var2.z0();
                return;
            case 3:
                this.f34289b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        cp0 cp0Var = this.f34289b;
        cp0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = cp0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
