package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pl0 implements Runnable {
    public final int f36678a;
    public final fn0 f36679b;

    public pl0(fn0 fn0Var, int i10) {
        this.f36678a = i10;
        this.f36679b = fn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f36678a) {
            case 0:
                fn0 fn0Var = this.f36679b;
                ViewGroup[] viewGroupArr = fn0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    fn0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(fn0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                fn0 fn0Var2 = this.f36679b;
                fn0Var2.presentFragment(fn0Var2.f33806h1, true);
                fn0Var2.f33806h1 = null;
                return;
            case 2:
                fn0 fn0Var3 = this.f36679b;
                EditTextBoldCursor[] editTextBoldCursorArr = fn0Var3.f33788a0;
                if (editTextBoldCursorArr != null) {
                    fn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f36679b.Y[2]);
                return;
            case 4:
                this.f36679b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    fn0 fn0Var4 = this.f36679b;
                    if (i10 < fn0Var4.f33794c0.getChildCount()) {
                        View childAt = fn0Var4.f33794c0.getChildAt(i10);
                        if (childAt instanceof en0) {
                            fn0Var4.f33794c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        fn0Var4.x1();
                        fn0Var4.f33823q1.clear();
                        fn0Var4.f33821p1.clear();
                        fn0Var4.f33842y.values.clear();
                        fn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f36679b.finishFragment();
                return;
        }
    }
}
