package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class kt extends f2.s0 {
    public final jt[] f26380a = new jt[4];
    public final ArrayList f26381b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        jt jtVar = new jt(recyclerView, i10, new ht(this, 0));
        this.f26380a[i10] = jtVar;
        return jtVar;
    }
}
