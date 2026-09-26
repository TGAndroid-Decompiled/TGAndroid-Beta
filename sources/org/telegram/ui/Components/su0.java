package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class su0 extends s4.v {
    public final uu0 d;

    public su0(uu0 uu0Var) {
        this.d = uu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42959a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        kv0 kv0Var = this.d.f28910x;
        if (kv0Var.C1 && recyclerView.getAdapter() != kv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        uu0 uu0Var = this.d;
        ArrayList arrayList = uu0Var.f28905f;
        kv0 kv0Var = uu0Var.f28910x;
        if (kv0Var.C1 && recyclerView.getAdapter() != kv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                uu0Var.p(b10, b11);
                uu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        cu0 cu0Var;
        uu0 uu0Var = this.d;
        xq0 xq0Var = uu0Var.f28906n;
        if (c1Var != null && (cu0Var = uu0Var.f28908s) != null) {
            cu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(xq0Var);
            AndroidUtilities.runOnUIThread(xq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            uu0 uu0Var = this.d;
            if (b10 < uu0Var.f28905f.size()) {
                return (SavedMessagesController.SavedDialog) uu0Var.f28905f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
