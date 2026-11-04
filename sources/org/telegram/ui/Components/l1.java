package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class l1 implements View.OnClickListener {
    public final int f35542a = 1;
    public final LinearLayout f35543b;
    public final int[] f35544c;

    public l1(LinearLayout linearLayout, int[] iArr) {
        this.f35543b = linearLayout;
        this.f35544c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f35542a) {
            case 0:
                this.f35544c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f35543b;
                int childCount = linearLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = linearLayout.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6Var.f29378c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f35543b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) linearLayout2.getChildAt(i10);
                    if (i6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var2.f29378c.a(z11, true);
                }
                this.f35544c[0] = org.telegram.ui.Cells.s8.f30354f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public l1(int[] iArr, LinearLayout linearLayout) {
        this.f35544c = iArr;
        this.f35543b = linearLayout;
    }
}
