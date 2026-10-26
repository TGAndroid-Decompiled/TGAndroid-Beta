package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class jv0 extends s4.w {
    public final lv0 d;

    public jv0(lv0 lv0Var) {
        this.d = lv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47738a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        SavedMessagesController.SavedDialog r6;
        int l4 = s4.w.l(0, 0);
        aw0 aw0Var = this.d.f30299x;
        if (aw0Var.E1 && recyclerView.getAdapter() != aw0Var.U && (r6 = r(e1Var)) != null && r6.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        lv0 lv0Var = this.d;
        ArrayList arrayList = lv0Var.f30294f;
        aw0 aw0Var = lv0Var.f30299x;
        if (aw0Var.E1 && recyclerView.getAdapter() != aw0Var.U) {
            SavedMessagesController.SavedDialog r6 = r(e1Var);
            SavedMessagesController.SavedDialog r10 = r(e1Var2);
            if (r6 != null && r10 != null && r6.pinned && r10.pinned) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r6);
                lv0Var.p(b10, b11);
                lv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        su0 su0Var;
        lv0 lv0Var = this.d;
        mp0 mp0Var = lv0Var.f30295n;
        if (e1Var != null && (su0Var = lv0Var.f30297s) != null) {
            su0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
            AndroidUtilities.runOnUIThread(mp0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.e1 e1Var) {
        int b10;
        if (e1Var != null && (b10 = e1Var.b()) >= 0) {
            lv0 lv0Var = this.d;
            if (b10 < lv0Var.f30294f.size()) {
                return (SavedMessagesController.SavedDialog) lv0Var.f30294f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}
