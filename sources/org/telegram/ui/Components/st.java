package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class st extends s4.l0 {
    public final rt[] f27211a = new rt[4];
    public final ArrayList f27212b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        rt rtVar = new rt(recyclerView, i10, new qt(this, 0));
        this.f27211a[i10] = rtVar;
        return rtVar;
    }
}
