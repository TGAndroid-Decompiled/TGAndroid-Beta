package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hl0 implements Runnable {
    public final int f38828a;
    public final wm0 f38829b;

    public hl0(wm0 wm0Var, int i9) {
        this.f38828a = i9;
        this.f38829b = wm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38828a) {
            case 0:
                wm0 wm0Var = this.f38829b;
                ViewGroup[] viewGroupArr = wm0Var.V;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    wm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(wm0Var.U[0]);
                    return;
                }
                return;
            case 1:
                wm0 wm0Var2 = this.f38829b;
                wm0Var2.presentFragment(wm0Var2.f44158d1, true);
                wm0Var2.f44158d1 = null;
                return;
            case 2:
                wm0 wm0Var3 = this.f38829b;
                EditTextBoldCursor[] editTextBoldCursorArr = wm0Var3.W;
                if (editTextBoldCursorArr != null) {
                    wm0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38829b.U[2]);
                return;
            case 4:
                this.f38829b.x1();
                return;
            case 5:
                int i9 = 0;
                while (true) {
                    wm0 wm0Var4 = this.f38829b;
                    if (i9 < wm0Var4.Y.getChildCount()) {
                        View childAt = wm0Var4.Y.getChildAt(i9);
                        if (childAt instanceof vm0) {
                            wm0Var4.Y.removeView(childAt);
                            i9--;
                        }
                        i9++;
                    } else {
                        wm0Var4.x1();
                        wm0Var4.f44176m1.clear();
                        wm0Var4.l1.clear();
                        wm0Var4.f44204y.values.clear();
                        wm0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f38829b.finishFragment();
                return;
        }
    }
}
