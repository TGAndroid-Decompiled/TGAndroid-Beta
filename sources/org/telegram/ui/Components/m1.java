package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class m1 implements View.OnClickListener {
    public final int f28317a = 1;
    public final LinearLayout f28318b;
    public final int[] f28319c;

    public m1(LinearLayout linearLayout, int[] iArr) {
        this.f28318b = linearLayout;
        this.f28319c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f28317a) {
            case 0:
                this.f28319c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f28318b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n6) {
                        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        n6Var.f22362c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f28318b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.n6 n6Var2 = (org.telegram.ui.Cells.n6) linearLayout2.getChildAt(i11);
                    if (n6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    n6Var2.f22362c.a(z11, true);
                }
                this.f28319c[0] = org.telegram.ui.Cells.v8.f23331f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public m1(int[] iArr, LinearLayout linearLayout) {
        this.f28319c = iArr;
        this.f28318b = linearLayout;
    }
}
