package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class yt extends s4.l0 {
    public final xt[] f35135a = new xt[4];
    public final ArrayList f35136b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        xt xtVar = new xt(recyclerView, i10, new vt(this, 0));
        this.f35135a[i10] = xtVar;
        return xtVar;
    }

    public final float b(int i10) {
        xt xtVar = this.f35135a[i10];
        if (Build.VERSION.SDK_INT >= 31 && xtVar != null && !xtVar.isFinished()) {
            return xtVar.getDistance();
        }
        return 0.0f;
    }
}
