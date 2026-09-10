package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class pu0 extends s4.v {
    public final ru0 d;

    public pu0(ru0 ru0Var) {
        this.d = ru0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f41610a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        iv0 iv0Var = this.d.f26761x;
        if (iv0Var.C1 && recyclerView.getAdapter() != iv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ru0 ru0Var = this.d;
        ArrayList arrayList = ru0Var.f26756f;
        iv0 iv0Var = ru0Var.f26761x;
        if (iv0Var.C1 && recyclerView.getAdapter() != iv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                ru0Var.p(b10, b11);
                ru0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        zt0 zt0Var;
        ru0 ru0Var = this.d;
        uq0 uq0Var = ru0Var.f26757n;
        if (c1Var != null && (zt0Var = ru0Var.f26759s) != null) {
            zt0Var.c1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(uq0Var);
            AndroidUtilities.runOnUIThread(uq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            ru0 ru0Var = this.d;
            if (b10 < ru0Var.f26756f.size()) {
                return (SavedMessagesController.SavedDialog) ru0Var.f26756f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
