package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class p0 implements View.OnClickListener {
    public final int f29371a = 1;
    public final LinearLayout f29372b;
    public final int[] f29373c;

    public p0(LinearLayout linearLayout, int[] iArr) {
        this.f29372b = linearLayout;
        this.f29373c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f29371a) {
            case 0:
                this.f29373c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f29372b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.l6) {
                        org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l6Var.f22681c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f29372b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.l6 l6Var2 = (org.telegram.ui.Cells.l6) linearLayout2.getChildAt(i11);
                    if (l6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l6Var2.f22681c.a(z11, true);
                }
                this.f29373c[0] = org.telegram.ui.Cells.y8.f23991f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public p0(int[] iArr, LinearLayout linearLayout) {
        this.f29373c = iArr;
        this.f29372b = linearLayout;
    }
}
