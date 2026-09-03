package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class q0 implements View.OnClickListener {
    public final int f28032a = 1;
    public final LinearLayout f28033b;
    public final int[] f28034c;

    public q0(LinearLayout linearLayout, int[] iArr) {
        this.f28033b = linearLayout;
        this.f28034c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        switch (this.f28032a) {
            case 0:
                this.f28034c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f28033b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                        if (childAt == view) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        j6Var.f21235c.a(z4, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f28033b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.j6 j6Var2 = (org.telegram.ui.Cells.j6) linearLayout2.getChildAt(i11);
                    if (j6Var2 == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j6Var2.f21235c.a(z10, true);
                }
                this.f28034c[0] = org.telegram.ui.Cells.t8.f22347f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public q0(int[] iArr, LinearLayout linearLayout) {
        this.f28034c = iArr;
        this.f28033b = linearLayout;
    }
}
