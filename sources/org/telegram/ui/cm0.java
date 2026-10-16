package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 implements Runnable {
    public final int f34730a;
    public final sn0 f34731b;

    public cm0(sn0 sn0Var, int i10) {
        this.f34730a = i10;
        this.f34731b = sn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f34730a) {
            case 0:
                sn0 sn0Var = this.f34731b;
                ViewGroup[] viewGroupArr = sn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    sn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(sn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                sn0 sn0Var2 = this.f34731b;
                sn0Var2.presentFragment(sn0Var2.f39873h1, true);
                sn0Var2.f39873h1 = null;
                return;
            case 2:
                sn0 sn0Var3 = this.f34731b;
                EditTextBoldCursor[] editTextBoldCursorArr = sn0Var3.f39855a0;
                if (editTextBoldCursorArr != null) {
                    sn0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f34731b.Y[2]);
                return;
            case 4:
                this.f34731b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    sn0 sn0Var4 = this.f34731b;
                    if (i10 < sn0Var4.f39861c0.getChildCount()) {
                        View childAt = sn0Var4.f39861c0.getChildAt(i10);
                        if (childAt instanceof rn0) {
                            sn0Var4.f39861c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        sn0Var4.w1();
                        sn0Var4.f39890q1.clear();
                        sn0Var4.f39888p1.clear();
                        sn0Var4.f39909y.values.clear();
                        sn0Var4.P1();
                        return;
                    }
                }
            default:
                this.f34731b.finishFragment();
                return;
        }
    }
}
