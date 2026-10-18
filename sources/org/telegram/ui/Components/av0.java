package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class av0 extends s4.v {
    public final cv0 d;

    public av0(cv0 cv0Var) {
        this.d = cv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45958a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        sv0 sv0Var = this.d.f25393x;
        if (sv0Var.C1 && recyclerView.getAdapter() != sv0Var.S && (r10 = r(b1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        cv0 cv0Var = this.d;
        ArrayList arrayList = cv0Var.f25388f;
        sv0 sv0Var = cv0Var.f25393x;
        if (sv0Var.C1 && recyclerView.getAdapter() != sv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(b1Var);
            SavedMessagesController.SavedDialog r11 = r(b1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                cv0Var.p(b10, b11);
                cv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ku0 ku0Var;
        cv0 cv0Var = this.d;
        fr0 fr0Var = cv0Var.f25389n;
        if (b1Var != null && (ku0Var = cv0Var.f25391s) != null) {
            ku0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
            AndroidUtilities.runOnUIThread(fr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            cv0 cv0Var = this.d;
            if (b10 < cv0Var.f25388f.size()) {
                return (SavedMessagesController.SavedDialog) cv0Var.f25388f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
