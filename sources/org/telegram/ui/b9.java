package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b9 extends s4.u0 {
    public boolean f37923a;
    public final o9 f37924b;

    public b9(o9 o9Var) {
        this.f37924b = o9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        o9 o9Var = this.f37924b;
        ArrayList arrayList = o9Var.f42026w;
        int L0 = o9Var.f42020b.L0();
        boolean z10 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(o9Var.f42020b.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = o9Var.f42021c.f32504g3.f29882y.size();
            if (!o9Var.E && !o9Var.f42027x && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(18, this, (k9) ic.a.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.f37923a) {
            org.telegram.ui.Components.j20 j20Var = o9Var.f42022f;
            if (i11 < 0) {
                z10 = true;
            }
            j20Var.e(z10, true);
        }
        this.f37923a = true;
    }
}
