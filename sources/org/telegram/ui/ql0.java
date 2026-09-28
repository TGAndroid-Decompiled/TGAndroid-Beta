package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ql0 implements Runnable {
    public final int f36943a;
    public final gn0 f36944b;

    public ql0(gn0 gn0Var, int i10) {
        this.f36943a = i10;
        this.f36944b = gn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f36943a) {
            case 0:
                gn0 gn0Var = this.f36944b;
                ViewGroup[] viewGroupArr = gn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    gn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(gn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                gn0 gn0Var2 = this.f36944b;
                gn0Var2.presentFragment(gn0Var2.f33988h1, true);
                gn0Var2.f33988h1 = null;
                return;
            case 2:
                gn0 gn0Var3 = this.f36944b;
                EditTextBoldCursor[] editTextBoldCursorArr = gn0Var3.f33970a0;
                if (editTextBoldCursorArr != null) {
                    gn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36944b.Y[2]);
                return;
            case 4:
                this.f36944b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    gn0 gn0Var4 = this.f36944b;
                    if (i10 < gn0Var4.f33976c0.getChildCount()) {
                        View childAt = gn0Var4.f33976c0.getChildAt(i10);
                        if (childAt instanceof fn0) {
                            gn0Var4.f33976c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        gn0Var4.x1();
                        gn0Var4.f34005q1.clear();
                        gn0Var4.f34003p1.clear();
                        gn0Var4.f34024y.values.clear();
                        gn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f36944b.finishFragment();
                return;
        }
    }
}
