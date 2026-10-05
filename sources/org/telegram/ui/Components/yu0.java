package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class yu0 extends s4.v {
    public final av0 d;

    public yu0(av0 av0Var) {
        this.d = av0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f46538a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        qv0 qv0Var = this.d.f24754x;
        if (qv0Var.C1 && recyclerView.getAdapter() != qv0Var.S && (r10 = r(c1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        av0 av0Var = this.d;
        ArrayList arrayList = av0Var.f24749f;
        qv0 qv0Var = av0Var.f24754x;
        if (qv0Var.C1 && recyclerView.getAdapter() != qv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(c1Var);
            SavedMessagesController.SavedDialog r11 = r(c1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                av0Var.p(b10, b11);
                av0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        iu0 iu0Var;
        av0 av0Var = this.d;
        gq0 gq0Var = av0Var.f24750n;
        if (c1Var != null && (iu0Var = av0Var.f24752s) != null) {
            iu0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            AndroidUtilities.runOnUIThread(gq0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.c1 c1Var) {
        int b10;
        if (c1Var != null && (b10 = c1Var.b()) >= 0) {
            av0 av0Var = this.d;
            if (b10 < av0Var.f24749f.size()) {
                return (SavedMessagesController.SavedDialog) av0Var.f24749f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
