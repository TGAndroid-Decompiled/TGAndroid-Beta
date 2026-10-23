package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kl0 implements Runnable {
    public final int f38968a;
    public final an0 f38969b;

    public kl0(an0 an0Var, int i10) {
        this.f38968a = i10;
        this.f38969b = an0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38968a) {
            case 0:
                an0 an0Var = this.f38969b;
                ViewGroup[] viewGroupArr = an0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    an0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(an0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                an0 an0Var2 = this.f38969b;
                an0Var2.presentFragment(an0Var2.f35720h1, true);
                an0Var2.f35720h1 = null;
                return;
            case 2:
                an0 an0Var3 = this.f38969b;
                EditTextBoldCursor[] editTextBoldCursorArr = an0Var3.f35702a0;
                if (editTextBoldCursorArr != null) {
                    an0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38969b.Y[2]);
                return;
            case 4:
                this.f38969b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    an0 an0Var4 = this.f38969b;
                    if (i10 < an0Var4.f35708c0.getChildCount()) {
                        View childAt = an0Var4.f35708c0.getChildAt(i10);
                        if (childAt instanceof zm0) {
                            an0Var4.f35708c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        an0Var4.w1();
                        an0Var4.f35737q1.clear();
                        an0Var4.f35735p1.clear();
                        an0Var4.f35756y.values.clear();
                        an0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f38969b.finishFragment();
                return;
        }
    }
}
