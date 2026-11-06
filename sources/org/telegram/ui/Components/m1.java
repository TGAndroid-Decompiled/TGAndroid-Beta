package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class m1 implements View.OnClickListener {
    public final int f35818a = 1;
    public final LinearLayout f35819b;
    public final int[] f35820c;

    public m1(LinearLayout linearLayout, int[] iArr) {
        this.f35819b = linearLayout;
        this.f35820c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        boolean z10;
        switch (this.f35818a) {
            case 0:
                this.f35820c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f35819b;
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = linearLayout.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                        if (childAt == view) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        j6Var.f29363c.a(z9, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f35819b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.j6 j6Var2 = (org.telegram.ui.Cells.j6) linearLayout2.getChildAt(i10);
                    if (j6Var2 == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j6Var2.f29363c.a(z10, true);
                }
                this.f35820c[0] = org.telegram.ui.Cells.t8.f30535f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public m1(int[] iArr, LinearLayout linearLayout) {
        this.f35820c = iArr;
        this.f35819b = linearLayout;
    }
}
