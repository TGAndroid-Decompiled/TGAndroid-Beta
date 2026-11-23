package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class at extends v4.m0 {
    public final zs[] f33549a = new zs[4];
    public final ArrayList f33550b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        zs zsVar = new zs(recyclerView, i7, new xs(this, 0));
        this.f33549a[i7] = zsVar;
        return zsVar;
    }

    public final float b(int i7) {
        zs zsVar = this.f33549a[i7];
        if (Build.VERSION.SDK_INT >= 31 && zsVar != null && !zsVar.isFinished()) {
            return zsVar.getDistance();
        }
        return 0.0f;
    }
}
