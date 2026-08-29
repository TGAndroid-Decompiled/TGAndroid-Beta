package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ft extends f2.t0 {
    public final et[] f28528a = new et[4];
    public final ArrayList f28529b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        et etVar = new et(recyclerView, i10, new dt(this, 0));
        this.f28528a[i10] = etVar;
        return etVar;
    }
}
