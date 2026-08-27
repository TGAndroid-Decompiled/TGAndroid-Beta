package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class j00 implements Utilities.Callback {

    public final int f29530a = 1;

    public final org.telegram.ui.ActionBar.b5 f29531b;

    public final org.telegram.ui.df f29532c;

    public j00(org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.df dfVar) {
        this.f29531b = b5Var;
        this.f29532c = dfVar;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        boolean z10;
        org.telegram.ui.df dfVar;
        switch (this.f29530a) {
            case 0:
                this.f29532c.run(this.f29531b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.f29531b.getFragmentStack();
                boolean z11 = true;
                org.telegram.ui.ActionBar.n2 n2Var3 = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    n2Var3 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                    if ((n2Var3 instanceof org.telegram.ui.gy) || (n2Var3 instanceof org.telegram.ui.qg0)) {
                        n2Var = n2Var3;
                        if (n2Var instanceof org.telegram.ui.qg0) {
                            n2Var2 = ((org.telegram.ui.qg0) n2Var).F;
                        } else {
                            n2Var2 = n2Var;
                        }
                        z10 = n2Var2 instanceof org.telegram.ui.gy;
                        dfVar = this.f29532c;
                        if (z10) {
                            org.telegram.ui.gy gyVar = (org.telegram.ui.gy) n2Var2;
                            gyVar.K3();
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.yf((org.telegram.ui.ActionBar.n2) gyVar, (Serializable) num, (Object) dfVar, n2Var, 18), 80L);
                        } else {
                            dfVar.run(n2Var);
                        }
                    } else {
                        if (z11) {
                            n2Var3.finishFragment();
                            z11 = false;
                        } else {
                            n2Var3.removeSelfFromStack();
                        }
                    }
                    break;
                }
                n2Var = n2Var3;
                if (n2Var instanceof org.telegram.ui.qg0) {
                    n2Var2 = ((org.telegram.ui.qg0) n2Var).F;
                } else {
                    n2Var2 = n2Var;
                }
                z10 = n2Var2 instanceof org.telegram.ui.gy;
                dfVar = this.f29532c;
                if (z10) {
                    org.telegram.ui.gy gyVar2 = (org.telegram.ui.gy) n2Var2;
                    gyVar2.K3();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.yf((org.telegram.ui.ActionBar.n2) gyVar2, (Serializable) num, (Object) dfVar, n2Var, 18), 80L);
                } else {
                    dfVar.run(n2Var);
                }
                break;
        }
    }

    public j00(org.telegram.ui.df dfVar, org.telegram.ui.ActionBar.b5 b5Var) {
        this.f29532c = dfVar;
        this.f29531b = b5Var;
    }
}
