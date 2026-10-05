package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class zu0 extends org.telegram.ui.Cells.s2 {
    public final av0 W4;

    public zu0(av0 av0Var, Context context) {
        super(context, true);
        this.W4 = av0Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        av0 av0Var = this.W4;
        ArrayList arrayList = av0Var.f24749f;
        iu0 iu0Var = av0Var.f24752s;
        if (iu0Var != null && iu0Var.getAdapter() == av0Var) {
            av0Var.f24752s.getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(R)).pinned;
            }
            return false;
        }
        return false;
    }
}
