package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class r0 implements View.OnClickListener {
    public final int f29860a = 1;
    public final LinearLayout f29861b;
    public final int[] f29862c;

    public r0(LinearLayout linearLayout, int[] iArr) {
        this.f29861b = linearLayout;
        this.f29862c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f29860a) {
            case 0:
                this.f29862c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f29861b;
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
                        k6Var.f22219c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f29861b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i11);
                    if (k6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var2.f22219c.a(z11, true);
                }
                this.f29862c[0] = org.telegram.ui.Cells.y8.f23575f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public r0(int[] iArr, LinearLayout linearLayout) {
        this.f29862c = iArr;
        this.f29861b = linearLayout;
    }
}
