package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class mt extends s4.l0 {
    public final lt[] f28539a = new lt[4];
    public final ArrayList f28540b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        lt ltVar = new lt(recyclerView, i10, new kt(this, 0));
        this.f28539a[i10] = ltVar;
        return ltVar;
    }
}
