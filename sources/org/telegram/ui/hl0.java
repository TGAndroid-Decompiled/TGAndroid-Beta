package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hl0 implements Runnable {
    public final int f37706a;
    public final vm0 f37707b;

    public hl0(vm0 vm0Var, int i10) {
        this.f37706a = i10;
        this.f37707b = vm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37706a) {
            case 0:
                vm0 vm0Var = this.f37707b;
                ViewGroup[] viewGroupArr = vm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    vm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(vm0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                vm0 vm0Var2 = this.f37707b;
                vm0Var2.presentFragment(vm0Var2.f42293h1, true);
                vm0Var2.f42293h1 = null;
                return;
            case 2:
                vm0 vm0Var3 = this.f37707b;
                EditTextBoldCursor[] editTextBoldCursorArr = vm0Var3.f42275a0;
                if (editTextBoldCursorArr != null) {
                    vm0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37707b.Y[2]);
                return;
            case 4:
                this.f37707b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    vm0 vm0Var4 = this.f37707b;
                    if (i10 < vm0Var4.f42281c0.getChildCount()) {
                        View childAt = vm0Var4.f42281c0.getChildAt(i10);
                        if (childAt instanceof um0) {
                            vm0Var4.f42281c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        vm0Var4.w1();
                        vm0Var4.f42310q1.clear();
                        vm0Var4.f42308p1.clear();
                        vm0Var4.f42329y.values.clear();
                        vm0Var4.P1();
                        return;
                    }
                }
            default:
                this.f37707b.finishFragment();
                return;
        }
    }
}
