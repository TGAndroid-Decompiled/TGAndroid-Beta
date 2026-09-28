package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class qt extends s4.l0 {
    public final pt[] f27833a = new pt[4];
    public final ArrayList f27834b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        pt ptVar = new pt(recyclerView, i10, new nt(this, 0));
        this.f27833a[i10] = ptVar;
        return ptVar;
    }
}
