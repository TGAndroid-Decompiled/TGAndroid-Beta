package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SavedMessagesController;

public final class ot0 extends f2.c0 {
    public final qt0 d;

    public ot0(qt0 qt0Var) {
        this.d = qt0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.f5789a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        SavedMessagesController.SavedDialog savedDialogR;
        int iL = f2.c0.l(0, 0);
        hu0 hu0Var = this.d.f31980x;
        return (!hu0Var.f29163y1 || recyclerView.getAdapter() == hu0Var.O || (savedDialogR = r(o1Var)) == null || !savedDialogR.pinned) ? iL : f2.c0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        qt0 qt0Var = this.d;
        ArrayList arrayList = qt0Var.f31975f;
        hu0 hu0Var = qt0Var.f31980x;
        if (!hu0Var.f29163y1 || recyclerView.getAdapter() == hu0Var.O) {
            return false;
        }
        SavedMessagesController.SavedDialog savedDialogR = r(o1Var);
        SavedMessagesController.SavedDialog savedDialogR2 = r(o1Var2);
        if (savedDialogR == null || savedDialogR2 == null || !savedDialogR.pinned || !savedDialogR2.pinned) {
            return false;
        }
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        arrayList.remove(iB);
        arrayList.add(iB2, savedDialogR);
        qt0Var.p(iB, iB2);
        qt0Var.h = true;
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        ys0 ys0Var;
        qt0 qt0Var = this.d;
        up0 up0Var = qt0Var.f31976n;
        if (o1Var != null && (ys0Var = qt0Var.f31978s) != null) {
            ys0Var.d1(false);
        }
        if (i10 == 0) {
            AndroidUtilities.cancelRunOnUIThread(up0Var);
            AndroidUtilities.runOnUIThread(up0Var, 300L);
        }
    }

    public final SavedMessagesController.SavedDialog r(f2.o1 o1Var) {
        int iB;
        if (o1Var != null && (iB = o1Var.b()) >= 0) {
            qt0 qt0Var = this.d;
            if (iB < qt0Var.f31975f.size()) {
                return (SavedMessagesController.SavedDialog) qt0Var.f31975f.get(iB);
            }
        }
        return null;
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
