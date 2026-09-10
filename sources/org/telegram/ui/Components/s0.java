package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class s0 implements View.OnClickListener {
    public final int f26885a = 1;
    public final LinearLayout f26886b;
    public final int[] f26887c;

    public s0(LinearLayout linearLayout, int[] iArr) {
        this.f26886b = linearLayout;
        this.f26887c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f26885a) {
            case 0:
                this.f26887c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f26886b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.m6) {
                        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m6Var.f19531c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f26886b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.m6 m6Var2 = (org.telegram.ui.Cells.m6) linearLayout2.getChildAt(i11);
                    if (m6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m6Var2.f19531c.a(z11, true);
                }
                this.f26887c[0] = org.telegram.ui.Cells.z8.f20793f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public s0(int[] iArr, LinearLayout linearLayout) {
        this.f26887c = iArr;
        this.f26886b = linearLayout;
    }
}
