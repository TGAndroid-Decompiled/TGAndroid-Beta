package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jl0 implements Runnable {
    public final int f38585a;
    public final zm0 f38586b;

    public jl0(zm0 zm0Var, int i10) {
        this.f38585a = i10;
        this.f38586b = zm0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f38585a) {
            case 0:
                zm0 zm0Var = this.f38586b;
                ViewGroup[] viewGroupArr = zm0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    zm0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(zm0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                zm0 zm0Var2 = this.f38586b;
                zm0Var2.presentFragment(zm0Var2.f44143h1, true);
                zm0Var2.f44143h1 = null;
                return;
            case 2:
                zm0 zm0Var3 = this.f38586b;
                EditTextBoldCursor[] editTextBoldCursorArr = zm0Var3.f44125a0;
                if (editTextBoldCursorArr != null) {
                    zm0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f38586b.Y[2]);
                return;
            case 4:
                this.f38586b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    zm0 zm0Var4 = this.f38586b;
                    if (i10 < zm0Var4.f44131c0.getChildCount()) {
                        View childAt = zm0Var4.f44131c0.getChildAt(i10);
                        if (childAt instanceof ym0) {
                            zm0Var4.f44131c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        zm0Var4.w1();
                        zm0Var4.f44160q1.clear();
                        zm0Var4.f44158p1.clear();
                        zm0Var4.f44179y.values.clear();
                        zm0Var4.Q1();
                        return;
                    }
                }
            default:
                this.f38586b.finishFragment();
                return;
        }
    }
}
