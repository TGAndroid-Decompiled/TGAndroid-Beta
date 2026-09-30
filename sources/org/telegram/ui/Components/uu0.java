package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class uu0 extends s4.v {
    public final wu0 d;

    public uu0(wu0 wu0Var) {
        this.d = wu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f43068a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        mv0 mv0Var = this.d.f30064x;
        if (mv0Var.C1 && recyclerView.getAdapter() != mv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        wu0 wu0Var = this.d;
        ArrayList arrayList = wu0Var.f30059f;
        mv0 mv0Var = wu0Var.f30064x;
        if (mv0Var.C1 && recyclerView.getAdapter() != mv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                wu0Var.p(b10, b11);
                wu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        eu0 eu0Var;
        wu0 wu0Var = this.d;
        zq0 zq0Var = wu0Var.f30060n;
        if (c1Var != null && (eu0Var = wu0Var.f30062s) != null) {
            eu0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
            AndroidUtilities.runOnUIThread(zq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            wu0 wu0Var = this.d;
            if (b10 < wu0Var.f30059f.size()) {
                return (SavedMessagesController.SavedDialog) wu0Var.f30059f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
