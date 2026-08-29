package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class xt0 extends f2.b0 {
    public final zt0 d;

    public xt0(zt0 zt0Var) {
        this.d = zt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.f6432a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        SavedMessagesController.SavedDialog r6;
        int l10 = f2.b0.l(0, 0);
        qu0 qu0Var = this.d.f35421x;
        if (qu0Var.f32111y1 && recyclerView.getAdapter() != qu0Var.O && (r6 = r(n1Var)) != null && r6.pinned) {
            return f2.b0.l(3, 0);
        }
        return l10;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        zt0 zt0Var = this.d;
        ArrayList arrayList = zt0Var.f35416f;
        qu0 qu0Var = zt0Var.f35421x;
        if (qu0Var.f32111y1 && recyclerView.getAdapter() != qu0Var.O) {
            SavedMessagesController.SavedDialog r6 = r(n1Var);
            SavedMessagesController.SavedDialog r9 = r(n1Var2);
            if (r6 != null && r9 != null && r6.pinned && r9.pinned) {
                int b10 = n1Var.b();
                int b11 = n1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r6);
                zt0Var.p(b10, b11);
                zt0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        ht0 ht0Var;
        zt0 zt0Var = this.d;
        fq0 fq0Var = zt0Var.f35417n;
        if (n1Var != null && (ht0Var = zt0Var.f35419s) != null) {
            ht0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(fq0Var);
            AndroidUtilities.runOnUIThread(fq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.n1 n1Var) {
        int b10;
        if (n1Var != null && (b10 = n1Var.b()) >= 0) {
            zt0 zt0Var = this.d;
            if (b10 < zt0Var.f35416f.size()) {
                return (SavedMessagesController.SavedDialog) zt0Var.f35416f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(f2.n1 n1Var) {
    }
}
