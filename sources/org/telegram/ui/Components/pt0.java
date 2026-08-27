package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;

public final class pt0 extends org.telegram.ui.Cells.p2 {
    public final qt0 S4;

    public pt0(qt0 qt0Var, Context context) {
        super(context, true);
        this.S4 = qt0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        qt0 qt0Var = this.S4;
        ArrayList arrayList = qt0Var.f31975f;
        ys0 ys0Var = qt0Var.f31978s;
        if (ys0Var == null || ys0Var.getAdapter() != qt0Var) {
            return false;
        }
        qt0Var.f31978s.getClass();
        int iR = RecyclerView.R(this);
        if (iR < 0 || iR >= arrayList.size()) {
            return false;
        }
        return ((SavedMessagesController.SavedDialog) arrayList.get(iR)).pinned;
    }
}
