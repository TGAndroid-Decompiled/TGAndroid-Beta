package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class k1 implements View.OnClickListener {
    public final int f36222a = 1;
    public final LinearLayout f36223b;
    public final int[] f36224c;

    public k1(LinearLayout linearLayout, int[] iArr) {
        this.f36223b = linearLayout;
        this.f36224c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f36222a) {
            case 0:
                this.f36224c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f36223b;
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = linearLayout.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6Var.f30439c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f36223b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) linearLayout2.getChildAt(i10);
                    if (i6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var2.f30439c.a(z11, true);
                }
                this.f36224c[0] = org.telegram.ui.Cells.s8.f31430f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public k1(int[] iArr, LinearLayout linearLayout) {
        this.f36224c = iArr;
        this.f36223b = linearLayout;
    }
}
