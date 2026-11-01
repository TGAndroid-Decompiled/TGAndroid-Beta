package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class zs extends s4.k0 {
    public final ys[] f33218a = new ys[4];
    public final ArrayList f33219b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ys ysVar = new ys(recyclerView, i10, new ws(this, 0));
        this.f33218a[i10] = ysVar;
        return ysVar;
    }

    public final float b(int i10) {
        ys ysVar = this.f33218a[i10];
        if (Build.VERSION.SDK_INT >= 31 && ysVar != null && !ysVar.isFinished()) {
            return ysVar.getDistance();
        }
        return 0.0f;
    }
}
