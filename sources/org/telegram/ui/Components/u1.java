package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class u1 implements View.OnClickListener {
    public final int f40215a = 1;
    public final LinearLayout f40216b;
    public final int[] f40217c;

    public u1(LinearLayout linearLayout, int[] iArr) {
        this.f40216b = linearLayout;
        this.f40217c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f40215a) {
            case 0:
                this.f40217c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f40216b;
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = linearLayout.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var.f30965c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f40216b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.j6 j6Var2 = (org.telegram.ui.Cells.j6) linearLayout2.getChildAt(i10);
                    if (j6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j6Var2.f30965c.a(z11, true);
                }
                this.f40217c[0] = org.telegram.ui.Cells.t8.f31941f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public u1(int[] iArr, LinearLayout linearLayout) {
        this.f40217c = iArr;
        this.f40216b = linearLayout;
    }
}
