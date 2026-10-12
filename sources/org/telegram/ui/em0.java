package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class em0 implements Runnable {
    public final int f35637a;
    public final un0 f35638b;

    public em0(un0 un0Var, int i10) {
        this.f35637a = i10;
        this.f35638b = un0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f35637a) {
            case 0:
                un0 un0Var = this.f35638b;
                ViewGroup[] viewGroupArr = un0Var.Z;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    un0Var.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(un0Var.Y[0]);
                    return;
                }
                return;
            case 1:
                un0 un0Var2 = this.f35638b;
                un0Var2.presentFragment(un0Var2.f40738h1, true);
                un0Var2.f40738h1 = null;
                return;
            case 2:
                un0 un0Var3 = this.f35638b;
                EditTextBoldCursor[] editTextBoldCursorArr = un0Var3.f40720a0;
                if (editTextBoldCursorArr != null) {
                    un0Var3.H1(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.showKeyboard(this.f35638b.Y[2]);
                return;
            case 4:
                this.f35638b.w1();
                return;
            case 5:
                int i10 = 0;
                while (true) {
                    un0 un0Var4 = this.f35638b;
                    if (i10 < un0Var4.f40726c0.getChildCount()) {
                        View childAt = un0Var4.f40726c0.getChildAt(i10);
                        if (childAt instanceof tn0) {
                            un0Var4.f40726c0.removeView(childAt);
                            i10--;
                        }
                        i10++;
                    } else {
                        un0Var4.w1();
                        un0Var4.f40755q1.clear();
                        un0Var4.f40753p1.clear();
                        un0Var4.f40774y.values.clear();
                        un0Var4.P1();
                        return;
                    }
                }
            default:
                this.f35638b.finishFragment();
                return;
        }
    }
}
