package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, pt {
    public final int f36236a;
    public final fo0 f36237b;

    public dn0(fo0 fo0Var, int i10) {
        this.f36236a = i10;
        this.f36237b = fo0Var;
    }

    @Override
    public void L0(kt ktVar) {
        switch (this.f36236a) {
            case 2:
                fo0 fo0Var = this.f36237b;
                fo0Var.A0 = ktVar;
                fo0Var.f36983f[4].setText(ktVar.f38677a);
                return;
            default:
                fo0 fo0Var2 = this.f36237b;
                fo0Var2.A0 = ktVar;
                fo0Var2.f36983f[4].setText(ktVar.f38677a);
                fo0Var2.B0 = ktVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36236a) {
            case 1:
                fo0 fo0Var = this.f36237b;
                fo0Var.I0(fo0Var.R0[0]);
                return;
            case 2:
            default:
                fo0 fo0Var2 = this.f36237b;
                fo0Var2.D0(true);
                fo0Var2.z0();
                return;
            case 3:
                this.f36237b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        fo0 fo0Var = this.f36237b;
        fo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = fo0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
