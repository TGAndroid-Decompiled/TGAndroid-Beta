package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ot extends s4.l0 {
    public final nt[] f26848a = new nt[4];
    public final ArrayList f26849b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        nt ntVar = new nt(recyclerView, i10, new lt(this, 0));
        this.f26848a[i10] = ntVar;
        return ntVar;
    }
}
