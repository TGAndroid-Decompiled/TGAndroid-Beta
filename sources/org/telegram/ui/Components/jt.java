package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class jt extends f2.s0 {
    public final ht[] f26050a = new ht[4];
    public final ArrayList f26051b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ht htVar = new ht(recyclerView, i10, new gt(this, 0));
        this.f26050a[i10] = htVar;
        return htVar;
    }
}
