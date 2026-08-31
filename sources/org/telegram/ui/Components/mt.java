package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class mt extends f2.t0 {
    public final lt[] f29245a = new lt[4];
    public final ArrayList f29246b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        lt ltVar = new lt(recyclerView, i10, new kt(this, 0));
        this.f29245a[i10] = ltVar;
        return ltVar;
    }
}
