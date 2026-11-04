package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class os extends u4.l0 {
    public final ns[] f36932a = new ns[4];
    public final ArrayList f36933b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i3) {
        ns nsVar = new ns(recyclerView, i3, new ls(this, 0));
        this.f36932a[i3] = nsVar;
        return nsVar;
    }

    public final float b(int i3) {
        ns nsVar = this.f36932a[i3];
        if (Build.VERSION.SDK_INT >= 31 && nsVar != null && !nsVar.isFinished()) {
            return nsVar.getDistance();
        }
        return 0.0f;
    }
}
