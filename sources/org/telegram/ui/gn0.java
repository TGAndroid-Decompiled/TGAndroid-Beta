package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class gn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, qt {
    public final int f37637a;
    public final io0 f37638b;

    public gn0(io0 io0Var, int i10) {
        this.f37637a = i10;
        this.f37638b = io0Var;
    }

    @Override
    public void L0(lt ltVar) {
        switch (this.f37637a) {
            case 2:
                io0 io0Var = this.f37638b;
                io0Var.A0 = ltVar;
                io0Var.f38300f[4].setText(ltVar.f39322a);
                return;
            default:
                io0 io0Var2 = this.f37638b;
                io0Var2.A0 = ltVar;
                io0Var2.f38300f[4].setText(ltVar.f39322a);
                io0Var2.B0 = ltVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37637a) {
            case 1:
                io0 io0Var = this.f37638b;
                io0Var.I0(io0Var.R0[0]);
                return;
            case 2:
            default:
                io0 io0Var2 = this.f37638b;
                io0Var2.D0(true);
                io0Var2.z0();
                return;
            case 3:
                this.f37638b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        io0 io0Var = this.f37638b;
        io0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = io0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
