package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class wt extends s4.k0 {
    public final vt[] f32249a = new vt[4];
    public final ArrayList f32250b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        vt vtVar = new vt(recyclerView, i10, new tt(this, 0));
        this.f32249a[i10] = vtVar;
        return vtVar;
    }

    public final float b(int i10) {
        vt vtVar = this.f32249a[i10];
        if (Build.VERSION.SDK_INT >= 31 && vtVar != null && !vtVar.isFinished()) {
            return vtVar.getDistance();
        }
        return 0.0f;
    }
}
