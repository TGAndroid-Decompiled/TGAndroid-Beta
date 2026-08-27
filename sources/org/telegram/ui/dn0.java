package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;

public final class dn0 implements OnCompleteListener, org.telegram.ui.ActionBar.a2, st {

    public final int f37447a;

    public final do0 f37448b;

    public dn0(do0 do0Var, int i10) {
        this.f37447a = i10;
        this.f37448b = do0Var;
    }

    @Override
    public void Z0(nt ntVar) {
        switch (this.f37447a) {
            case 2:
                do0 do0Var = this.f37448b;
                do0Var.f37483w0 = ntVar;
                do0Var.f37462f[4].setText(ntVar.f40915a);
                break;
            default:
                do0 do0Var2 = this.f37448b;
                do0Var2.f37483w0 = ntVar;
                do0Var2.f37462f[4].setText(ntVar.f40915a);
                do0Var2.f37485x0 = ntVar.d;
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37447a) {
            case 1:
                do0 do0Var = this.f37448b;
                do0Var.I0(do0Var.N0[0]);
                break;
            case 2:
            default:
                do0 do0Var2 = this.f37448b;
                do0Var2.D0(true);
                do0Var2.z0();
                break;
            case 3:
                this.f37448b.A0(true);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        do0 do0Var = this.f37448b;
        do0Var.getClass();
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = do0Var.K;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }
}
