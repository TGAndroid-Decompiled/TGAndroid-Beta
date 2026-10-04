package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class xu0 extends s4.v {
    public final zu0 d;

    public xu0(zu0 zu0Var) {
        this.d = zu0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f46523a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        pv0 pv0Var = this.d.f33661x;
        if (pv0Var.C1 && recyclerView.getAdapter() != pv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        zu0 zu0Var = this.d;
        ArrayList arrayList = zu0Var.f33656f;
        pv0 pv0Var = zu0Var.f33661x;
        if (pv0Var.C1 && recyclerView.getAdapter() != pv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                zu0Var.p(b10, b11);
                zu0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        hu0 hu0Var;
        zu0 zu0Var = this.d;
        br0 br0Var = zu0Var.f33657n;
        if (c1Var != null && (hu0Var = zu0Var.f33659s) != null) {
            hu0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            AndroidUtilities.runOnUIThread(br0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            zu0 zu0Var = this.d;
            if (b10 < zu0Var.f33656f.size()) {
                return (SavedMessagesController.SavedDialog) zu0Var.f33656f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
