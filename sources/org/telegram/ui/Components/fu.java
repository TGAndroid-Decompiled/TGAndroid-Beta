package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fu extends s4.m0 {
    public final eu[] f26573a = new eu[4];
    public final ArrayList f26574b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        eu euVar = new eu(recyclerView, i10, new cu(this, 0));
        this.f26573a[i10] = euVar;
        return euVar;
    }

    public final float b(int i10) {
        eu euVar = this.f26573a[i10];
        if (Build.VERSION.SDK_INT >= 31 && euVar != null && !euVar.isFinished()) {
            return euVar.getDistance();
        }
        return 0.0f;
    }
}
