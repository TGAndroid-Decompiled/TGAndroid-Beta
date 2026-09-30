package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class ln0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, vt {
    public final int f35480a;
    public final no0 f35481b;

    public ln0(no0 no0Var, int i10) {
        this.f35480a = i10;
        this.f35481b = no0Var;
    }

    @Override
    public void a1(qt qtVar) {
        switch (this.f35480a) {
            case 2:
                no0 no0Var = this.f35481b;
                no0Var.A0 = qtVar;
                no0Var.f36062f[4].setText(qtVar.f37082a);
                return;
            default:
                no0 no0Var2 = this.f35481b;
                no0Var2.A0 = qtVar;
                no0Var2.f36062f[4].setText(qtVar.f37082a);
                no0Var2.B0 = qtVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f35480a) {
            case 1:
                no0 no0Var = this.f35481b;
                no0Var.I0(no0Var.R0[0]);
                return;
            case 2:
            default:
                no0 no0Var2 = this.f35481b;
                no0Var2.D0(true);
                no0Var2.z0();
                return;
            case 3:
                this.f35481b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        no0 no0Var = this.f35481b;
        no0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = no0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
