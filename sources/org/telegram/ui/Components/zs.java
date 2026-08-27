package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class zs extends f2.u0 {

    public final ys[] f35332a = new ys[4];

    public final ArrayList f35333b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ys ysVar = new ys(recyclerView, i10, new xs(this, 0));
        this.f35332a[i10] = ysVar;
        return ysVar;
    }
}
