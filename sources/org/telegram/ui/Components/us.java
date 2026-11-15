package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class us extends v4.l0 {
    public final ts[] f40155a = new ts[4];
    public final ArrayList f40156b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ts tsVar = new ts(recyclerView, i7, new rs(this, 0));
        this.f40155a[i7] = tsVar;
        return tsVar;
    }

    public final float b(int i7) {
        ts tsVar = this.f40155a[i7];
        if (Build.VERSION.SDK_INT >= 31 && tsVar != null && !tsVar.isFinished()) {
            return tsVar.getDistance();
        }
        return 0.0f;
    }
}
