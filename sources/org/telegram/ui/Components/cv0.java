package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class cv0 extends s4.v {
    public final ev0 d;

    public cv0(ev0 ev0Var) {
        this.d = ev0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45920a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        uv0 uv0Var = this.d.f25985x;
        if (uv0Var.C1 && recyclerView.getAdapter() != uv0Var.S && (r10 = r(b1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        ev0 ev0Var = this.d;
        ArrayList arrayList = ev0Var.f25980f;
        uv0 uv0Var = ev0Var.f25985x;
        if (uv0Var.C1 && recyclerView.getAdapter() != uv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(b1Var);
            SavedMessagesController.SavedDialog r11 = r(b1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                ev0Var.p(b10, b11);
                ev0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        mu0 mu0Var;
        ev0 ev0Var = this.d;
        hr0 hr0Var = ev0Var.f25981n;
        if (b1Var != null && (mu0Var = ev0Var.f25983s) != null) {
            mu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(hr0Var);
            AndroidUtilities.runOnUIThread(hr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            ev0 ev0Var = this.d;
            if (b10 < ev0Var.f25980f.size()) {
                return (SavedMessagesController.SavedDialog) ev0Var.f25980f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
