package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jl0 implements Runnable {
    public final int f38225a;
    public final xm0 f38226b;

    public jl0(xm0 xm0Var, int i10) {
        this.f38225a = i10;
        this.f38226b = xm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38225a) {
            case 0:
                xm0 xm0Var = this.f38226b;
                ViewGroup[] viewGroupArr = xm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    xm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(xm0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                xm0 xm0Var2 = this.f38226b;
                xm0Var2.presentFragment(xm0Var2.f43182h1, true);
                xm0Var2.f43182h1 = null;
                return;
            case 2:
                xm0 xm0Var3 = this.f38226b;
                EditTextBoldCursor[] editTextBoldCursorArr = xm0Var3.f43164a0;
                if (editTextBoldCursorArr != null) {
                    xm0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38226b.Y[2]);
                return;
            case 4:
                this.f38226b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    xm0 xm0Var4 = this.f38226b;
                    if (i10 < xm0Var4.f43170c0.getChildCount()) {
                        View childAt = xm0Var4.f43170c0.getChildAt(i10);
                        if (childAt instanceof wm0) {
                            xm0Var4.f43170c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        xm0Var4.w1();
                        xm0Var4.f43199q1.clear();
                        xm0Var4.f43197p1.clear();
                        xm0Var4.f43218y.values.clear();
                        xm0Var4.P1();
                        return;
                    }
                }
            default:
                this.f38226b.finishFragment();
                return;
        }
    }
}
