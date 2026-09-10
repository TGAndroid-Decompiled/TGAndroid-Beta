package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class eh1 implements Runnable {
    public final int f32209a;
    public final mh1 f32210b;

    public eh1(mh1 mh1Var, int i10) {
        this.f32209a = i10;
        this.f32210b = mh1Var;
    }

    @Override
    public final void run() {
        switch (this.f32209a) {
            case 0:
                mh1 mh1Var = this.f32210b;
                EditTextBoldCursor editTextBoldCursor = mh1Var.f34966n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    mh1Var.f34966n.requestFocus();
                    AndroidUtilities.showKeyboard(mh1Var.f34966n);
                    return;
                }
                return;
            case 1:
                mh1 mh1Var2 = this.f32210b;
                de0 de0Var = mh1Var2.f34969w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    mh1Var2.f34969w.f32906f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    hs[] hsVarArr = this.f32210b.f34969w.f32906f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                mh1 mh1Var3 = this.f32210b;
                EditTextBoldCursor editTextBoldCursor2 = mh1Var3.f34966n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        mh1Var3.f34961f0[2].P(49);
                        mh1Var3.f34961f0[2].S(0.0f, false);
                        mh1Var3.f34952a.d();
                        return;
                    }
                    mh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                mh1 mh1Var4 = this.f32210b;
                if (mh1Var4.f34962g0 != null) {
                    mh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                mh1.f0(this.f32210b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new eh1(this.f32210b, 7), 150L);
                return;
            default:
                for (hs hsVar : this.f32210b.f34969w.f32906f) {
                    hsVar.i(0.0f);
                }
                return;
        }
    }
}
