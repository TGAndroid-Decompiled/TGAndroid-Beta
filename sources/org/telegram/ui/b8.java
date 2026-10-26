package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
public final class b8 implements MessagesStorage.BooleanCallback {
    public final n8 f37995a;

    public b8(n8 n8Var) {
        this.f37995a = n8Var;
    }

    @Override
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.j5 j5Var3;
        org.telegram.ui.ActionBar.j5 j5Var4;
        n8 n8Var = this.f37995a;
        n8Var.finishFragment();
        j5Var = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
            if (j5Var2.getFragmentStack().size() >= 2) {
                j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                List fragmentStack = j5Var3.getFragmentStack();
                j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var).parentLayout;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 2);
                if (r2Var instanceof un) {
                    ((un) r2Var).Z7(n8Var.P, n8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        un unVar = n8Var.N;
        if (unVar != null) {
            unVar.Z7(n8Var.P, n8Var.Q + 86400, z10);
        }
    }
}
