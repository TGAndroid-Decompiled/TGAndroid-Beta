package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class hl0 implements Runnable {

    public final int f38853a;

    public final xm0 f38854b;

    public hl0(xm0 xm0Var, int i10) {
        this.f38853a = i10;
        this.f38854b = xm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38853a) {
            case 0:
                xm0 xm0Var = this.f38854b;
                ViewGroup[] viewGroupArr = xm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    xm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(xm0Var.U[0]);
                    break;
                }
                break;
            case 1:
                xm0 xm0Var2 = this.f38854b;
                xm0Var2.presentFragment(xm0Var2.f44489d1, true);
                xm0Var2.f44489d1 = null;
                break;
            case 2:
                xm0 xm0Var3 = this.f38854b;
                EditTextBoldCursor[] editTextBoldCursorArr = xm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    xm0Var3.I1(editTextBoldCursorArr[0]);
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f38854b.U[2]);
                break;
            case 4:
                this.f38854b.x1();
                break;
            case 5:
                int i10 = 0;
                while (true) {
                    xm0 xm0Var4 = this.f38854b;
                    if (i10 >= xm0Var4.Y.getChildCount()) {
                        xm0Var4.x1();
                        xm0Var4.f44507m1.clear();
                        xm0Var4.l1.clear();
                        xm0Var4.f44535y.values.clear();
                        xm0Var4.Q1();
                    } else {
                        View childAt = xm0Var4.Y.getChildAt(i10);
                        if (childAt instanceof wm0) {
                            xm0Var4.Y.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    }
                    break;
                }
                break;
            default:
                this.f38854b.finishFragment();
                break;
        }
    }
}
