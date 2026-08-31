package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class q0 implements View.OnClickListener {
    public final int f30238a = 1;
    public final LinearLayout f30239b;
    public final int[] f30240c;

    public q0(LinearLayout linearLayout, int[] iArr) {
        this.f30239b = linearLayout;
        this.f30240c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        switch (this.f30238a) {
            case 0:
                this.f30240c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f30239b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                        if (childAt == view) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        k6Var.f23070c.a(z4, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f30239b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i11);
                    if (k6Var2 == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k6Var2.f23070c.a(z10, true);
                }
                this.f30240c[0] = org.telegram.ui.Cells.u8.f24224f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public q0(int[] iArr, LinearLayout linearLayout) {
        this.f30240c = iArr;
        this.f30239b = linearLayout;
    }
}
