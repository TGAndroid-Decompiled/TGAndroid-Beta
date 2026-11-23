package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class dt extends v4.m0 {
    public final ct[] f34567a = new ct[4];
    public final ArrayList f34568b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ct ctVar = new ct(recyclerView, i7, new at(this, 0));
        this.f34567a[i7] = ctVar;
        return ctVar;
    }

    public final float b(int i7) {
        ct ctVar = this.f34567a[i7];
        if (Build.VERSION.SDK_INT >= 31 && ctVar != null && !ctVar.isFinished()) {
            return ctVar.getDistance();
        }
        return 0.0f;
    }
}
