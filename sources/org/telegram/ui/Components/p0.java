package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

public final class p0 implements View.OnClickListener {

    public final int f31452a = 1;

    public final LinearLayout f31453b;

    public final int[] f31454c;

    public p0(LinearLayout linearLayout, int[] iArr) {
        this.f31453b = linearLayout;
        this.f31454c = iArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31452a) {
            case 0:
                this.f31454c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f31453b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).f24451c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.f31453b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) linearLayout2.getChildAt(i11);
                    h6Var.f24451c.a(h6Var == view, true);
                }
                this.f31454c[0] = org.telegram.ui.Cells.r8.f25233f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public p0(int[] iArr, LinearLayout linearLayout) {
        this.f31454c = iArr;
        this.f31453b = linearLayout;
    }
}
