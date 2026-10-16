package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class a9 extends s4.r0 {
    public boolean f33790a;
    public final n9 f33791b;

    public a9(n9 n9Var) {
        this.f33791b = n9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        int i12;
        bh.f fVar;
        boolean z10;
        n9 n9Var = this.f33791b;
        ArrayList arrayList = n9Var.G;
        int L0 = n9Var.f38293c.L0();
        boolean z11 = false;
        if (L0 == -1) {
            abs = 0;
        } else {
            abs = Math.abs(n9Var.f38293c.N0() - L0) + 1;
        }
        if (abs > 0) {
            int size = n9Var.d.W2.f23148x.size();
            if (!n9Var.J && !n9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.p0(18, this, (j9) i2.d.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null) {
            i12 = childAt.getTop();
        } else {
            i12 = 0;
        }
        if (i11 != 0 && this.f33790a) {
            org.telegram.ui.Components.l20 l20Var = n9Var.f38297f;
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l20Var.e(z10, true);
        }
        this.f33790a = true;
        di.p6 p6Var = n9Var.f38300r;
        if (L0 != 0 || i12 < n9Var.d.getPaddingTop()) {
            z11 = true;
        }
        p6Var.b(z11, true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = n9Var.Y) != null) {
            fVar.f(i10, i11);
            n9Var.f0();
        }
    }
}
