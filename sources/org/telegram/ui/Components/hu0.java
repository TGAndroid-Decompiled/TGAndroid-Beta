package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class hu0 extends s4.v {
    public final ju0 d;

    public hu0(ju0 ju0Var) {
        this.d = ju0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42697a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        zu0 zu0Var = this.d.f25446x;
        if (zu0Var.C1 && recyclerView.getAdapter() != zu0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        ju0 ju0Var = this.d;
        ArrayList arrayList = ju0Var.f25441f;
        zu0 zu0Var = ju0Var.f25446x;
        if (zu0Var.C1 && recyclerView.getAdapter() != zu0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                ju0Var.p(b10, b11);
                ju0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        rt0 rt0Var;
        ju0 ju0Var = this.d;
        kq0 kq0Var = ju0Var.f25442n;
        if (c1Var != null && (rt0Var = ju0Var.f25444s) != null) {
            rt0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(kq0Var);
            AndroidUtilities.runOnUIThread(kq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            ju0 ju0Var = this.d;
            if (b10 < ju0Var.f25441f.size()) {
                return (SavedMessagesController.SavedDialog) ju0Var.f25441f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
