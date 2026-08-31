package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class gu0 extends f2.b0 {
    public final iu0 d;

    public gu0(iu0 iu0Var) {
        this.d = iu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.b0.l(0, 0);
        zu0 zu0Var = this.d.f27913x;
        if (zu0Var.f34021z1 && recyclerView.getAdapter() != zu0Var.P && (r10 = r(m1Var)) != null && r10.pinned) {
            return f2.b0.l(3, 0);
        }
        return l10;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        iu0 iu0Var = this.d;
        ArrayList arrayList = iu0Var.f27908f;
        zu0 zu0Var = iu0Var.f27913x;
        if (zu0Var.f34021z1 && recyclerView.getAdapter() != zu0Var.P) {
            SavedMessagesController.SavedDialog r10 = r(m1Var);
            SavedMessagesController.SavedDialog r11 = r(m1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = m1Var.b();
                int b11 = m1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                iu0Var.p(b10, b11);
                iu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        qt0 qt0Var;
        iu0 iu0Var = this.d;
        oq0 oq0Var = iu0Var.f27909n;
        if (m1Var != null && (qt0Var = iu0Var.f27911s) != null) {
            qt0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
            AndroidUtilities.runOnUIThread(oq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.m1 m1Var) {
        int b10;
        if (m1Var != null && (b10 = m1Var.b()) >= 0) {
            iu0 iu0Var = this.d;
            if (b10 < iu0Var.f27908f.size()) {
                return (SavedMessagesController.SavedDialog) iu0Var.f27908f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }
}
