package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class tu0 extends s4.v {
    public final vu0 d;

    public tu0(vu0 vu0Var) {
        this.d = vu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42995a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        lv0 lv0Var = this.d.f29812x;
        if (lv0Var.C1 && recyclerView.getAdapter() != lv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        vu0 vu0Var = this.d;
        ArrayList arrayList = vu0Var.f29807f;
        lv0 lv0Var = vu0Var.f29812x;
        if (lv0Var.C1 && recyclerView.getAdapter() != lv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                vu0Var.p(b10, b11);
                vu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        du0 du0Var;
        vu0 vu0Var = this.d;
        yq0 yq0Var = vu0Var.f29808n;
        if (c1Var != null && (du0Var = vu0Var.f29810s) != null) {
            du0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(yq0Var);
            AndroidUtilities.runOnUIThread(yq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            vu0 vu0Var = this.d;
            if (b10 < vu0Var.f29807f.size()) {
                return (SavedMessagesController.SavedDialog) vu0Var.f29807f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
