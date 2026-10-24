package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class fn0 implements OnCompleteListener, org.telegram.ui.ActionBar.z1, qt {
    public final int f37357a;
    public final ho0 f37358b;

    public fn0(ho0 ho0Var, int i10) {
        this.f37357a = i10;
        this.f37358b = ho0Var;
    }

    @Override
    public void L0(lt ltVar) {
        switch (this.f37357a) {
            case 2:
                ho0 ho0Var = this.f37358b;
                ho0Var.A0 = ltVar;
                ho0Var.f37927f[4].setText(ltVar.f39375a);
                return;
            default:
                ho0 ho0Var2 = this.f37358b;
                ho0Var2.A0 = ltVar;
                ho0Var2.f37927f[4].setText(ltVar.f39375a);
                ho0Var2.B0 = ltVar.d;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37357a) {
            case 1:
                ho0 ho0Var = this.f37358b;
                ho0Var.I0(ho0Var.R0[0]);
                return;
            case 2:
            default:
                ho0 ho0Var2 = this.f37358b;
                ho0Var2.D0(true);
                ho0Var2.z0();
                return;
            case 3:
                this.f37358b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ho0 ho0Var = this.f37358b;
        ho0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = ho0Var.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
