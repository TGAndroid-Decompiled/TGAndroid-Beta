package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mi0 implements Runnable {
    public final int f47679a;
    public final yj0 f47680b;

    public mi0(yj0 yj0Var, int i3) {
        this.f47679a = i3;
        this.f47680b = yj0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f47679a) {
            case 0:
                yj0 yj0Var = this.f47680b;
                ViewGroup[] viewGroupArr = yj0Var.f52285a0;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    yj0Var.Z[0].requestFocus();
                    org.telegram.messenger.g0.K3(yj0Var.Z[0]);
                    return;
                }
                return;
            case 1:
                yj0 yj0Var2 = this.f47680b;
                yj0Var2.presentFragment(yj0Var2.f52306i1, true);
                yj0Var2.f52306i1 = null;
                return;
            case 2:
                yj0 yj0Var3 = this.f47680b;
                EditTextBoldCursor[] editTextBoldCursorArr = yj0Var3.f52288b0;
                if (editTextBoldCursorArr != null) {
                    yj0Var3.M1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(this.f47680b.Z[2]);
                return;
            case 4:
                this.f47680b.B1();
                return;
            case 5:
                int i3 = 0;
                while (true) {
                    yj0 yj0Var4 = this.f47680b;
                    if (i3 < yj0Var4.f52293d0.getChildCount()) {
                        View childAt = yj0Var4.f52293d0.getChildAt(i3);
                        if (childAt instanceof xj0) {
                            yj0Var4.f52293d0.removeView(childAt);
                            i3--;
                        }
                        i3++;
                    } else {
                        yj0Var4.B1();
                        yj0Var4.f52323r1.clear();
                        yj0Var4.f52320q1.clear();
                        yj0Var4.E.values.clear();
                        yj0Var4.V1();
                        return;
                    }
                }
            default:
                this.f47680b.finishFragment();
                return;
        }
    }
}
