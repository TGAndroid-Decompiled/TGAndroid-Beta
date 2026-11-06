package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pi0 implements Runnable {
    public final int f48838a;
    public final bk0 f48839b;

    public pi0(bk0 bk0Var, int i7) {
        this.f48838a = i7;
        this.f48839b = bk0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f48838a) {
            case 0:
                bk0 bk0Var = this.f48839b;
                ViewGroup[] viewGroupArr = bk0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    bk0Var.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(bk0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                bk0 bk0Var2 = this.f48839b;
                bk0Var2.presentFragment(bk0Var2.f44380h1, true);
                bk0Var2.f44380h1 = null;
                return;
            case 2:
                bk0 bk0Var3 = this.f48839b;
                EditTextBoldCursor[] editTextBoldCursorArr = bk0Var3.f44361a0;
                if (editTextBoldCursorArr != null) {
                    bk0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f48839b.Y[2]);
                return;
            case 4:
                this.f48839b.B1();
                return;
            case 5:
                int i7 = 0;
                while (true) {
                    bk0 bk0Var4 = this.f48839b;
                    if (i7 < bk0Var4.f44367c0.getChildCount()) {
                        View childAt = bk0Var4.f44367c0.getChildAt(i7);
                        if (childAt instanceof ak0) {
                            bk0Var4.f44367c0.removeView(childAt);
                            i7--;
                        }
                        i7++;
                    } else {
                        bk0Var4.B1();
                        bk0Var4.f44396q1.clear();
                        bk0Var4.f44394p1.clear();
                        bk0Var4.D.values.clear();
                        bk0Var4.V1();
                        return;
                    }
                }
            default:
                this.f48839b.finishFragment();
                return;
        }
    }
}
