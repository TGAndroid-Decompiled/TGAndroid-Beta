package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class eu extends s4.m0 {
    public final du[] f26168a = new du[4];
    public final ArrayList f26169b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        du duVar = new du(recyclerView, i10, new bu(this, 0));
        this.f26168a[i10] = duVar;
        return duVar;
    }

    public final float b(int i10) {
        du duVar = this.f26168a[i10];
        if (Build.VERSION.SDK_INT >= 31 && duVar != null && !duVar.isFinished()) {
            return duVar.getDistance();
        }
        return 0.0f;
    }
}
