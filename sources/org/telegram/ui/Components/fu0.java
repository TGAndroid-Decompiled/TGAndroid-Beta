package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class fu0 extends f2.b0 {
    public final hu0 d;

    public fu0(hu0 hu0Var) {
        this.d = hu0Var;
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
        yu0 yu0Var = this.d.f27636x;
        if (yu0Var.f33666z1 && recyclerView.getAdapter() != yu0Var.P && (r10 = r(m1Var)) != null && r10.pinned) {
            return f2.b0.l(3, 0);
        }
        return l10;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        hu0 hu0Var = this.d;
        ArrayList arrayList = hu0Var.f27631f;
        yu0 yu0Var = hu0Var.f27636x;
        if (yu0Var.f33666z1 && recyclerView.getAdapter() != yu0Var.P) {
            SavedMessagesController.SavedDialog r10 = r(m1Var);
            SavedMessagesController.SavedDialog r11 = r(m1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = m1Var.b();
                int b11 = m1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                hu0Var.p(b10, b11);
                hu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        pt0 pt0Var;
        hu0 hu0Var = this.d;
        nq0 nq0Var = hu0Var.f27632n;
        if (m1Var != null && (pt0Var = hu0Var.f27634s) != null) {
            pt0Var.c1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
            AndroidUtilities.runOnUIThread(nq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.m1 m1Var) {
        int b10;
        if (m1Var != null && (b10 = m1Var.b()) >= 0) {
            hu0 hu0Var = this.d;
            if (b10 < hu0Var.f27631f.size()) {
                return (SavedMessagesController.SavedDialog) hu0Var.f27631f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }
}
