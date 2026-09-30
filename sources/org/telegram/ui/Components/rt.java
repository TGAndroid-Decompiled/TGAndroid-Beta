package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class rt extends s4.l0 {
    public final qt[] f28129a = new qt[4];
    public final ArrayList f28130b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        qt qtVar = new qt(recyclerView, i10, new ot(this, 0));
        this.f28129a[i10] = qtVar;
        return qtVar;
    }
}
