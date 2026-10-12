package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class pv0 extends s4.w {
    public final rv0 d;

    public pv0(rv0 rv0Var) {
        this.d = rv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47889a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.w.l(0, 0);
        hw0 hw0Var = this.d.f30258x;
        if (hw0Var.C1 && recyclerView.getAdapter() != hw0Var.S && (r10 = r(d1Var)) != null && r10.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        rv0 rv0Var = this.d;
        ArrayList arrayList = rv0Var.f30253f;
        hw0 hw0Var = rv0Var.f30258x;
        if (hw0Var.C1 && recyclerView.getAdapter() != hw0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(d1Var);
            SavedMessagesController.SavedDialog r11 = r(d1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                rv0Var.p(b10, b11);
                rv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        zu0 zu0Var;
        rv0 rv0Var = this.d;
        ur0 ur0Var = rv0Var.f30254n;
        if (d1Var != null && (zu0Var = rv0Var.f30256s) != null) {
            zu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(ur0Var);
            AndroidUtilities.runOnUIThread(ur0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.d1 d1Var) {
        int b10;
        if (d1Var != null && (b10 = d1Var.b()) >= 0) {
            rv0 rv0Var = this.d;
            if (b10 < rv0Var.f30253f.size()) {
                return (SavedMessagesController.SavedDialog) rv0Var.f30253f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
