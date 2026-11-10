package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ns extends v4.k0 {
    public final ms[] f36367a = new ms[4];
    public final ArrayList f36368b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ms msVar = new ms(recyclerView, i7, new ks(this, 0));
        this.f36367a[i7] = msVar;
        return msVar;
    }

    public final float b(int i7) {
        ms msVar = this.f36367a[i7];
        if (Build.VERSION.SDK_INT >= 31 && msVar != null && !msVar.isFinished()) {
            return msVar.getDistance();
        }
        return 0.0f;
    }
}
