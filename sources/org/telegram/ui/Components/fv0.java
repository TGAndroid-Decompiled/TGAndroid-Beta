package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class fv0 extends s4.v {
    public final hv0 d;

    public fv0(hv0 hv0Var) {
        this.d = hv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f46343a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        xv0 xv0Var = this.d.f27063x;
        if (xv0Var.C1 && recyclerView.getAdapter() != xv0Var.S && (r10 = r(b1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        hv0 hv0Var = this.d;
        ArrayList arrayList = hv0Var.f27058f;
        xv0 xv0Var = hv0Var.f27063x;
        if (xv0Var.C1 && recyclerView.getAdapter() != xv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(b1Var);
            SavedMessagesController.SavedDialog r11 = r(b1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                hv0Var.p(b10, b11);
                hv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        pu0 pu0Var;
        hv0 hv0Var = this.d;
        kr0 kr0Var = hv0Var.f27059n;
        if (b1Var != null && (pu0Var = hv0Var.f27061s) != null) {
            pu0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            AndroidUtilities.runOnUIThread(kr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            hv0 hv0Var = this.d;
            if (b10 < hv0Var.f27058f.size()) {
                return (SavedMessagesController.SavedDialog) hv0Var.f27058f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
