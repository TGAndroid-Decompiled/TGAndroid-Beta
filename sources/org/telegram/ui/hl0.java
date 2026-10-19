package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hl0 implements Runnable {
    public final int f37677a;
    public final vm0 f37678b;

    public hl0(vm0 vm0Var, int i10) {
        this.f37677a = i10;
        this.f37678b = vm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37677a) {
            case 0:
                vm0 vm0Var = this.f37678b;
                ViewGroup[] viewGroupArr = vm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                vm0 vm0Var2 = this.f37678b;
                vm0Var2.presentFragment(vm0Var2.f42294h1, true);
                vm0Var2.f42294h1 = null;
                return;
            case 2:
                vm0 vm0Var3 = this.f37678b;
                EditTextBoldCursor[] editTextBoldCursorArr = vm0Var3.f42276a0;
                if (editTextBoldCursorArr != null) {
                    vm0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37678b.Y[2]);
                return;
            case 4:
                this.f37678b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    vm0 vm0Var4 = this.f37678b;
                    if (i10 < vm0Var4.f42282c0.getChildCount()) {
                        View childAt = vm0Var4.f42282c0.getChildAt(i10);
                        if (childAt instanceof um0) {
                            vm0Var4.f42282c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        vm0Var4.w1();
                        vm0Var4.f42311q1.clear();
                        vm0Var4.f42309p1.clear();
                        vm0Var4.f42330y.values.clear();
                        vm0Var4.P1();
                        return;
                    }
                }
            default:
                this.f37678b.finishFragment();
                return;
        }
    }
}
