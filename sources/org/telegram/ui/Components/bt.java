package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bt extends v4.m0 {
    public final at[] f33777a = new at[4];
    public final ArrayList f33778b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        at atVar = new at(recyclerView, i7, new ys(this, 0));
        this.f33777a[i7] = atVar;
        return atVar;
    }

    public final float b(int i7) {
        at atVar = this.f33777a[i7];
        if (Build.VERSION.SDK_INT >= 31 && atVar != null && !atVar.isFinished()) {
            return atVar.getDistance();
        }
        return 0.0f;
    }
}
