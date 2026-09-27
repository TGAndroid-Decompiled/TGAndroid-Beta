package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends s4.s0 {
    public boolean f32002a;
    public final n9 f32003b;

    public a9(n9 n9Var) {
        this.f32003b = n9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        boolean z10;
        n9 n9Var = this.f32003b;
        ArrayList arrayList = n9Var.F;
        int L0 = n9Var.f35853b.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(n9Var.f35853b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = n9Var.f35855c.Y2.f25962x.size();
            if (!n9Var.I && !n9Var.G && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new n(8, this, (j9) hg.k0.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f32002a) {
            org.telegram.ui.Components.b20 b20Var = n9Var.e;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b20Var.e(z10, true);
        }
        this.f32002a = true;
        n9Var.f35860n.b((L0 != 0 || i12 < n9Var.f35855c.getPaddingTop()) ? true : true, true);
    }
}
