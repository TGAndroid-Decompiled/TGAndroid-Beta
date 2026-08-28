package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class mt0 extends f2.d0 {
    public final ot0 d;

    public mt0(ot0 ot0Var) {
        this.d = ot0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.f5501a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        SavedMessagesController.SavedDialog r10;
        int l10 = f2.d0.l(0, 0);
        eu0 eu0Var = this.d.f31446x;
        if (eu0Var.f28178y1 && recyclerView.getAdapter() != eu0Var.O && (r10 = r(q1Var)) != null && r10.pinned) {
            return f2.d0.l(3, 0);
        }
        return l10;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        ot0 ot0Var = this.d;
        ArrayList arrayList = ot0Var.f31441f;
        eu0 eu0Var = ot0Var.f31446x;
        if (eu0Var.f28178y1 && recyclerView.getAdapter() != eu0Var.O) {
            SavedMessagesController.SavedDialog r10 = r(q1Var);
            SavedMessagesController.SavedDialog r11 = r(q1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = q1Var.b();
                int b11 = q1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                ot0Var.p(b10, b11);
                ot0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        ws0 ws0Var;
        ot0 ot0Var = this.d;
        tp0 tp0Var = ot0Var.f31442n;
        if (q1Var != null && (ws0Var = ot0Var.f31444s) != null) {
            ws0Var.d1(false);
        }
        if (i9 == 0) {
            AndroidUtilities.cancelRunOnUIThread(tp0Var);
            AndroidUtilities.runOnUIThread(tp0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.q1 q1Var) {
        int b10;
        if (q1Var != null && (b10 = q1Var.b()) >= 0) {
            ot0 ot0Var = this.d;
            if (b10 < ot0Var.f31441f.size()) {
                return (SavedMessagesController.SavedDialog) ot0Var.f31441f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
