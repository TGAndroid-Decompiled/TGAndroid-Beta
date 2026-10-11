package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class lv0 extends s4.w {
    public final nv0 d;

    public lv0(nv0 nv0Var) {
        this.d = nv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47748a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.w.l(0, 0);
        dw0 dw0Var = this.d.f29162x;
        if (dw0Var.C1 && recyclerView.getAdapter() != dw0Var.S && (r10 = r(d1Var)) != null && r10.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        nv0 nv0Var = this.d;
        ArrayList arrayList = nv0Var.f29157f;
        dw0 dw0Var = nv0Var.f29162x;
        if (dw0Var.C1 && recyclerView.getAdapter() != dw0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(d1Var);
            SavedMessagesController.SavedDialog r11 = r(d1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                nv0Var.p(b10, b11);
                nv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        vu0 vu0Var;
        nv0 nv0Var = this.d;
        qr0 qr0Var = nv0Var.f29158n;
        if (d1Var != null && (vu0Var = nv0Var.f29160s) != null) {
            vu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(qr0Var);
            AndroidUtilities.runOnUIThread(qr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.d1 d1Var) {
        int b10;
        if (d1Var != null && (b10 = d1Var.b()) >= 0) {
            nv0 nv0Var = this.d;
            if (b10 < nv0Var.f29157f.size()) {
                return (SavedMessagesController.SavedDialog) nv0Var.f29157f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
