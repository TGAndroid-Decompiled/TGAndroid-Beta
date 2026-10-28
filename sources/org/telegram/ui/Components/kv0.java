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
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47773a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        SavedMessagesController.SavedDialog r6;
        int l4 = s4.w.l(0, 0);
        bw0 bw0Var = this.d.f30642x;
        if (bw0Var.E1 && recyclerView.getAdapter() != bw0Var.U && (r6 = r(e1Var)) != null && r6.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        mv0 mv0Var = this.d;
        ArrayList arrayList = mv0Var.f30637f;
        bw0 bw0Var = mv0Var.f30642x;
        if (bw0Var.E1 && recyclerView.getAdapter() != bw0Var.U) {
            SavedMessagesController.SavedDialog r6 = r(e1Var);
            SavedMessagesController.SavedDialog r10 = r(e1Var2);
            if (r6 != null && r10 != null && r6.pinned && r10.pinned) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r6);
                mv0Var.p(b10, b11);
                mv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        tu0 tu0Var;
        mv0 mv0Var = this.d;
        np0 np0Var = mv0Var.f30638n;
        if (e1Var != null && (tu0Var = mv0Var.f30640s) != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(np0Var);
            AndroidUtilities.runOnUIThread(np0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.e1 e1Var) {
        int b10;
        if (e1Var != null && (b10 = e1Var.b()) >= 0) {
            mv0 mv0Var = this.d;
            if (b10 < mv0Var.f30637f.size()) {
                return (SavedMessagesController.SavedDialog) mv0Var.f30637f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}
