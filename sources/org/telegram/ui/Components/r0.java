package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class r0 implements View.OnClickListener {
    public final int f29861a = 1;
    public final LinearLayout f29862b;
    public final int[] f29863c;

    public r0(LinearLayout linearLayout, int[] iArr) {
        this.f29862b = linearLayout;
        this.f29863c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f29861a) {
            case 0:
                this.f29863c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f29862b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var.f22220c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f29862b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i11);
                    if (k6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var2.f22220c.a(z11, true);
                }
                this.f29863c[0] = org.telegram.ui.Cells.y8.f23576f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public r0(int[] iArr, LinearLayout linearLayout) {
        this.f29863c = iArr;
        this.f29862b = linearLayout;
    }
}
