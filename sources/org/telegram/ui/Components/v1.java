package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class v1 implements View.OnClickListener {
    public final int f40632a = 1;
    public final LinearLayout f40633b;
    public final int[] f40634c;

    public v1(LinearLayout linearLayout, int[] iArr) {
        this.f40633b = linearLayout;
        this.f40634c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f40632a) {
            case 0:
                this.f40634c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f40633b;
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = linearLayout.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var.f30955c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f40633b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i10);
                    if (k6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var2.f30955c.a(z11, true);
                }
                this.f40634c[0] = org.telegram.ui.Cells.u8.f32069f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public v1(int[] iArr, LinearLayout linearLayout) {
        this.f40634c = iArr;
        this.f40633b = linearLayout;
    }
}
