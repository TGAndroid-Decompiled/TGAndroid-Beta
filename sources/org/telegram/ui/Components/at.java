package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class at extends f2.v0 {
    public final zs[] f26897a = new zs[4];
    public final ArrayList f26898b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i9) {
        zs zsVar = new zs(recyclerView, i9, new ys(this, 0));
        this.f26897a[i9] = zsVar;
        return zsVar;
    }
}
