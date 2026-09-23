package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class on0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, wt {
    public final int f35913a;
    public final qo0 f35914b;

    public on0(qo0 qo0Var, int i10) {
        this.f35913a = i10;
        this.f35914b = qo0Var;
    }

    @Override
    public void a1(st stVar) {
        switch (this.f35913a) {
            case 2:
                qo0 qo0Var = this.f35914b;
                qo0Var.A0 = stVar;
                qo0Var.f36496f[4].setText(stVar.f37415a);
                return;
            default:
                qo0 qo0Var2 = this.f35914b;
                qo0Var2.A0 = stVar;
                qo0Var2.f36496f[4].setText(stVar.f37415a);
                qo0Var2.B0 = stVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35913a) {
            case 1:
                qo0 qo0Var = this.f35914b;
                qo0Var.I0(qo0Var.R0[0]);
                return;
            case 2:
            default:
                qo0 qo0Var2 = this.f35914b;
                qo0Var2.D0(true);
                qo0Var2.z0();
                return;
            case 3:
                this.f35914b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        qo0 qo0Var = this.f35914b;
        qo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = qo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
