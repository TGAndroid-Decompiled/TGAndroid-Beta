package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class pt extends s4.l0 {
    public final ot[] f27128a = new ot[4];
    public final ArrayList f27129b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        ot otVar = new ot(recyclerView, i10, new mt(this, 0));
        this.f27128a[i10] = otVar;
        return otVar;
    }
}
