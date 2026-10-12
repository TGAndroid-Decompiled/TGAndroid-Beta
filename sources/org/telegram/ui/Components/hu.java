package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hu extends s4.m0 {
    public final gu[] f26894a = new gu[4];
    public final ArrayList f26895b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        gu guVar = new gu(recyclerView, i10, new eu(this, 0));
        this.f26894a[i10] = guVar;
        return guVar;
    }

    public final float b(int i10) {
        gu guVar = this.f26894a[i10];
        if (Build.VERSION.SDK_INT >= 31 && guVar != null && !guVar.isFinished()) {
            return guVar.getDistance();
        }
        return 0.0f;
    }
}
