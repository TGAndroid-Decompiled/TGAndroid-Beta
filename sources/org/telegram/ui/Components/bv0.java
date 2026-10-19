package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class bv0 extends s4.v {
    public final dv0 d;

    public bv0(dv0 dv0Var) {
        this.d = dv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45912a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        tv0 tv0Var = this.d.f25656x;
        if (tv0Var.C1 && recyclerView.getAdapter() != tv0Var.S && (r10 = r(b1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        dv0 dv0Var = this.d;
        ArrayList arrayList = dv0Var.f25651f;
        tv0 tv0Var = dv0Var.f25656x;
        if (tv0Var.C1 && recyclerView.getAdapter() != tv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(b1Var);
            SavedMessagesController.SavedDialog r11 = r(b1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                dv0Var.p(b10, b11);
                dv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        lu0 lu0Var;
        dv0 dv0Var = this.d;
        gr0 gr0Var = dv0Var.f25652n;
        if (b1Var != null && (lu0Var = dv0Var.f25654s) != null) {
            lu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(gr0Var);
            AndroidUtilities.runOnUIThread(gr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            dv0 dv0Var = this.d;
            if (b10 < dv0Var.f25651f.size()) {
                return (SavedMessagesController.SavedDialog) dv0Var.f25651f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
