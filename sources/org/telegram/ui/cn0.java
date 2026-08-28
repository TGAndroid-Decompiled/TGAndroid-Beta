package org.telegram.ui;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.FileLog;
public final class cn0 implements OnCompleteListener, org.telegram.ui.ActionBar.b2, pt {
    public final int f37237a;
    public final co0 f37238b;

    public cn0(co0 co0Var, int i9) {
        this.f37237a = i9;
        this.f37238b = co0Var;
    }

    @Override
    public void a1(lt ltVar) {
        switch (this.f37237a) {
            case 2:
                co0 co0Var = this.f37238b;
                co0Var.f37277w0 = ltVar;
                co0Var.f37256f[4].setText(ltVar.f40225a);
                return;
            default:
                co0 co0Var2 = this.f37238b;
                co0Var2.f37277w0 = ltVar;
                co0Var2.f37256f[4].setText(ltVar.f40225a);
                co0Var2.f37279x0 = ltVar.d;
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f37237a) {
            case 1:
                co0 co0Var = this.f37238b;
                co0Var.H0(co0Var.N0[0]);
                return;
            case 2:
            default:
                co0 co0Var2 = this.f37238b;
                co0Var2.C0(true);
                co0Var2.y0();
                return;
            case 3:
                this.f37238b.z0(true);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        co0 co0Var = this.f37238b;
        co0Var.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = co0Var.K;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }
}
