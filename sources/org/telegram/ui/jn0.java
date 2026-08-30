package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class jn0 implements OnCompleteListener, org.telegram.ui.ActionBar.c2, xt {
    public final int f35382a;
    public final jo0 f35383b;

    public jn0(jo0 jo0Var, int i10) {
        this.f35382a = i10;
        this.f35383b = jo0Var;
    }

    @Override
    public void b1(st stVar) {
        switch (this.f35382a) {
            case 2:
                jo0 jo0Var = this.f35383b;
                jo0Var.f35422x0 = stVar;
                jo0Var.f35399f[4].setText(stVar.f38435a);
                return;
            default:
                jo0 jo0Var2 = this.f35383b;
                jo0Var2.f35422x0 = stVar;
                jo0Var2.f35399f[4].setText(stVar.f38435a);
                jo0Var2.f35424y0 = stVar.d;
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35382a) {
            case 1:
                jo0 jo0Var = this.f35383b;
                jo0Var.I0(jo0Var.O0[0]);
                return;
            case 2:
            default:
                jo0 jo0Var2 = this.f35383b;
                jo0Var2.D0(true);
                jo0Var2.z0();
                return;
            case 3:
                this.f35383b.A0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        jo0 jo0Var = this.f35383b;
        jo0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = jo0Var.L;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
