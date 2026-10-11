package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class kv0 extends s4.w {
    public final mv0 d;

    public kv0(mv0 mv0Var) {
        this.d = mv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47782a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.w.l(0, 0);
        cw0 cw0Var = this.d.f28959x;
        if (cw0Var.C1 && recyclerView.getAdapter() != cw0Var.S && (r10 = r(d1Var)) != null && r10.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        mv0 mv0Var = this.d;
        ArrayList arrayList = mv0Var.f28954f;
        cw0 cw0Var = mv0Var.f28959x;
        if (cw0Var.C1 && recyclerView.getAdapter() != cw0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(d1Var);
            SavedMessagesController.SavedDialog r11 = r(d1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                mv0Var.p(b10, b11);
                mv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        uu0 uu0Var;
        mv0 mv0Var = this.d;
        pr0 pr0Var = mv0Var.f28955n;
        if (d1Var != null && (uu0Var = mv0Var.f28957s) != null) {
            uu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(pr0Var);
            AndroidUtilities.runOnUIThread(pr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.d1 d1Var) {
        int b10;
        if (d1Var != null && (b10 = d1Var.b()) >= 0) {
            mv0 mv0Var = this.d;
            if (b10 < mv0Var.f28954f.size()) {
                return (SavedMessagesController.SavedDialog) mv0Var.f28954f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
