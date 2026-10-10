package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class q0 implements View.OnClickListener {
    public final int f29911a = 1;
    public final LinearLayout f29912b;
    public final int[] f29913c;

    public q0(LinearLayout linearLayout, int[] iArr) {
        this.f29912b = linearLayout;
        this.f29913c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f29911a) {
            case 0:
                this.f29913c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f29912b;
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
                        l6Var.f22429c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f29912b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.l6 l6Var2 = (org.telegram.ui.Cells.l6) linearLayout2.getChildAt(i11);
                    if (l6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l6Var2.f22429c.a(z11, true);
                }
                this.f29913c[0] = org.telegram.ui.Cells.y8.f23788f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public q0(int[] iArr, LinearLayout linearLayout) {
        this.f29913c = iArr;
        this.f29912b = linearLayout;
    }
}
