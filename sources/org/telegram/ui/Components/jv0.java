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
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47656a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.w.l(0, 0);
        bw0 bw0Var = this.d.f28615x;
        if (bw0Var.C1 && recyclerView.getAdapter() != bw0Var.S && (r10 = r(d1Var)) != null && r10.pinned) {
            return s4.w.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        lv0 lv0Var = this.d;
        ArrayList arrayList = lv0Var.f28610f;
        bw0 bw0Var = lv0Var.f28615x;
        if (bw0Var.C1 && recyclerView.getAdapter() != bw0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(d1Var);
            SavedMessagesController.SavedDialog r11 = r(d1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                lv0Var.p(b10, b11);
                lv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        tu0 tu0Var;
        lv0 lv0Var = this.d;
        or0 or0Var = lv0Var.f28611n;
        if (d1Var != null && (tu0Var = lv0Var.f28613s) != null) {
            tu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
            AndroidUtilities.runOnUIThread(or0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.d1 d1Var) {
        int b10;
        if (d1Var != null && (b10 = d1Var.b()) >= 0) {
            lv0 lv0Var = this.d;
            if (b10 < lv0Var.f28610f.size()) {
                return (SavedMessagesController.SavedDialog) lv0Var.f28610f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
