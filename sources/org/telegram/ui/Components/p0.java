package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class p0 implements View.OnClickListener {
    public final int f31483a = 1;
    public final LinearLayout f31484b;
    public final int[] f31485c;

    public p0(LinearLayout linearLayout, int[] iArr) {
        this.f31484b = linearLayout;
        this.f31485c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f31483a) {
            case 0:
                this.f31485c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f31484b;
                int childCount = linearLayout.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = linearLayout.getChildAt(i9);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var.f24615c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f31484b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i10);
                    if (k6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var2.f24615c.a(z11, true);
                }
                this.f31485c[0] = org.telegram.ui.Cells.v8.f25800f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public p0(int[] iArr, LinearLayout linearLayout) {
        this.f31485c = iArr;
        this.f31484b = linearLayout;
    }
}
