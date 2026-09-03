package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pl0 implements Runnable {
    public final int f37182a;
    public final fn0 f37183b;

    public pl0(fn0 fn0Var, int i10) {
        this.f37182a = i10;
        this.f37183b = fn0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f37182a) {
            case 0:
                fn0 fn0Var = this.f37183b;
                ViewGroup[] viewGroupArr = fn0Var.W;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    fn0Var.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(fn0Var.V[0]);
                    return;
                }
                return;
            case 1:
                fn0 fn0Var2 = this.f37183b;
                fn0Var2.presentFragment(fn0Var2.f34122e1, true);
                fn0Var2.f34122e1 = null;
                return;
            case 2:
                fn0 fn0Var3 = this.f37183b;
                EditTextBoldCursor[] editTextBoldCursorArr = fn0Var3.X;
                if (editTextBoldCursorArr != null) {
                    fn0Var3.I1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f37183b.V[2]);
                return;
            case 4:
                this.f37183b.x1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    fn0 fn0Var4 = this.f37183b;
                    if (i10 < fn0Var4.Z.getChildCount()) {
                        View childAt = fn0Var4.Z.getChildAt(i10);
                        if (childAt instanceof en0) {
                            fn0Var4.Z.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        fn0Var4.x1();
                        fn0Var4.f34140n1.clear();
                        fn0Var4.f34137m1.clear();
                        fn0Var4.f34165y.values.clear();
                        fn0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f37183b.finishFragment();
                return;
        }
    }
}
