package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bu extends s4.k0 {
    public final au[] f23853a = new au[4];
    public final ArrayList f23854b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        au auVar = new au(recyclerView, i10, new yt(this, 0));
        this.f23853a[i10] = auVar;
        return auVar;
    }

    public final float b(int i10) {
        au auVar = this.f23853a[i10];
        if (Build.VERSION.SDK_INT >= 31 && auVar != null && !auVar.isFinished()) {
            return auVar.getDistance();
        }
        return 0.0f;
    }
}
