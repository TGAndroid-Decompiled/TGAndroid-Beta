package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nl0 implements Runnable {
    public final int f36684a;
    public final dn0 f36685b;

    public nl0(dn0 dn0Var, int i10) {
        this.f36684a = i10;
        this.f36685b = dn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f36684a) {
            case 0:
                dn0 dn0Var = this.f36685b;
                ViewGroup[] viewGroupArr = dn0Var.W;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    dn0Var.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(dn0Var.V[0]);
                    return;
                }
                return;
            case 1:
                dn0 dn0Var2 = this.f36685b;
                dn0Var2.presentFragment(dn0Var2.f33694e1, true);
                dn0Var2.f33694e1 = null;
                return;
            case 2:
                dn0 dn0Var3 = this.f36685b;
                EditTextBoldCursor[] editTextBoldCursorArr = dn0Var3.X;
                if (editTextBoldCursorArr != null) {
                    dn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36685b.V[2]);
                return;
            case 4:
                this.f36685b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    dn0 dn0Var4 = this.f36685b;
                    if (i10 < dn0Var4.Z.getChildCount()) {
                        View childAt = dn0Var4.Z.getChildAt(i10);
                        if (childAt instanceof cn0) {
                            dn0Var4.Z.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        dn0Var4.x1();
                        dn0Var4.f33712n1.clear();
                        dn0Var4.f33709m1.clear();
                        dn0Var4.f33737y.values.clear();
                        dn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f36685b.finishFragment();
                return;
        }
    }
}
