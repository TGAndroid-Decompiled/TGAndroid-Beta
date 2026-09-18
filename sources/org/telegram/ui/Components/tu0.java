package org.telegram.ui.Components;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SavedMessagesController;
public final class tu0 extends org.telegram.ui.Cells.s2 {
    public final uu0 W4;

    public tu0(uu0 uu0Var, Context context) {
        super(context, true);
        this.W4 = uu0Var;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean getIsPinned() {
        uu0 uu0Var = this.W4;
        ArrayList arrayList = uu0Var.f28825f;
        cu0 cu0Var = uu0Var.f28828s;
        if (cu0Var != null && cu0Var.getAdapter() == uu0Var) {
            uu0Var.f28828s.getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(S)).pinned;
            }
            return false;
        }
        return false;
    }
}
