package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ut extends s4.k0 {
    public final tt[] f31220a = new tt[4];
    public final ArrayList f31221b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        tt ttVar = new tt(recyclerView, i10, new rt(this, 0));
        this.f31220a[i10] = ttVar;
        return ttVar;
    }

    public final float b(int i10) {
        tt ttVar = this.f31220a[i10];
        if (Build.VERSION.SDK_INT >= 31 && ttVar != null && !ttVar.isFinished()) {
            return ttVar.getDistance();
        }
        return 0.0f;
    }
}
