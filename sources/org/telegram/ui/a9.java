package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends f2.z0 {
    public boolean f32517a;
    public final n9 f32518b;

    public a9(n9 n9Var) {
        this.f32518b = n9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        ng.e eVar;
        boolean z4;
        n9 n9Var = this.f32518b;
        ArrayList arrayList = n9Var.D;
        int L0 = n9Var.f36414c.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(n9Var.f36414c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = n9Var.d.V2.f30151x.size();
            if (!n9Var.G && !n9Var.E && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(22, this, (j9) kf.k0.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f32517a) {
            org.telegram.ui.Components.a20 a20Var = n9Var.f36416f;
            if (i11 < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            a20Var.e(z4, true);
        }
        this.f32517a = true;
        n9Var.f36418r.b((L0 != 0 || i12 < n9Var.d.getPaddingTop()) ? true : true, true);
        if (Build.VERSION.SDK_INT >= 31 && (eVar = n9Var.V) != null) {
            eVar.f(i10, i11);
            n9Var.f0();
        }
    }
}
