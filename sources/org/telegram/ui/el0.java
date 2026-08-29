package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class el0 implements Runnable {
    public final int f37861a;
    public final vm0 f37862b;

    public el0(vm0 vm0Var, int i10) {
        this.f37861a = i10;
        this.f37862b = vm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37861a) {
            case 0:
                vm0 vm0Var = this.f37862b;
                ViewGroup[] viewGroupArr = vm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.U[0]);
                    return;
                }
                return;
            case 1:
                vm0 vm0Var2 = this.f37862b;
                vm0Var2.presentFragment(vm0Var2.f43632d1, true);
                vm0Var2.f43632d1 = null;
                return;
            case 2:
                vm0 vm0Var3 = this.f37862b;
                EditTextBoldCursor[] editTextBoldCursorArr = vm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    vm0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37862b.U[2]);
                return;
            case 4:
                this.f37862b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    vm0 vm0Var4 = this.f37862b;
                    if (i10 < vm0Var4.Y.getChildCount()) {
                        View childAt = vm0Var4.Y.getChildAt(i10);
                        if (childAt instanceof um0) {
                            vm0Var4.Y.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        vm0Var4.x1();
                        vm0Var4.f43650m1.clear();
                        vm0Var4.l1.clear();
                        vm0Var4.f43678y.values.clear();
                        vm0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f37862b.finishFragment();
                return;
        }
    }
}
