package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class os extends v4.k0 {
    public final ns[] f36651a = new ns[4];
    public final ArrayList f36652b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ns nsVar = new ns(recyclerView, i7, new ls(this, 0));
        this.f36651a[i7] = nsVar;
        return nsVar;
    }

    public final float b(int i7) {
        ns nsVar = this.f36651a[i7];
        if (Build.VERSION.SDK_INT >= 31 && nsVar != null && !nsVar.isFinished()) {
            return nsVar.getDistance();
        }
        return 0.0f;
    }
}
