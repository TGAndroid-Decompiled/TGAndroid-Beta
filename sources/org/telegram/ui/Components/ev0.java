package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;
public final class ev0 extends s4.v {
    public final gv0 d;

    public ev0(gv0 gv0Var) {
        this.d = gv0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f46342a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        SavedMessagesController.SavedDialog r10;
        int l4 = s4.v.l(0, 0);
        wv0 wv0Var = this.d.f26800x;
        if (wv0Var.C1 && recyclerView.getAdapter() != wv0Var.S && (r10 = r(b1Var)) != null && r10.pinned) {
            return s4.v.l(3, 0);
        }
        return l4;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        gv0 gv0Var = this.d;
        ArrayList arrayList = gv0Var.f26795f;
        wv0 wv0Var = gv0Var.f26800x;
        if (wv0Var.C1 && recyclerView.getAdapter() != wv0Var.S) {
            SavedMessagesController.SavedDialog r10 = r(b1Var);
            SavedMessagesController.SavedDialog r11 = r(b1Var2);
            if (r10 != null && r11 != null && r10.pinned && r11.pinned) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                arrayList.remove(b10);
                arrayList.add(b11, r10);
                gv0Var.p(b10, b11);
                gv0Var.h = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ou0 ou0Var;
        gv0 gv0Var = this.d;
        jr0 jr0Var = gv0Var.f26796n;
        if (b1Var != null && (ou0Var = gv0Var.f26798s) != null) {
            ou0Var.e1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(jr0Var);
            AndroidUtilities.runOnUIThread(jr0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(s4.b1 b1Var) {
        int b10;
        if (b1Var != null && (b10 = b1Var.b()) >= 0) {
            gv0 gv0Var = this.d;
            if (b10 < gv0Var.f26795f.size()) {
                return (SavedMessagesController.SavedDialog) gv0Var.f26795f.get(b10);
            }
        }
        return null;
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
