package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class gu extends s4.m0 {
    public final fu[] f26522a = new fu[4];
    public final ArrayList f26523b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        fu fuVar = new fu(recyclerView, i10, new du(this, 0));
        this.f26522a[i10] = fuVar;
        return fuVar;
    }

    public final float b(int i10) {
        fu fuVar = this.f26522a[i10];
        if (Build.VERSION.SDK_INT >= 31 && fuVar != null && !fuVar.isFinished()) {
            return fuVar.getDistance();
        }
        return 0.0f;
    }
}
