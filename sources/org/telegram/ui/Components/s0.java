package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class s0 implements View.OnClickListener {
    public final int f32429a = 1;
    public final LinearLayout f32430b;
    public final int[] f32431c;

    public s0(LinearLayout linearLayout, int[] iArr) {
        this.f32430b = linearLayout;
        this.f32431c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f32429a) {
            case 0:
                this.f32431c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f32430b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6Var.f24501c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f32430b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) linearLayout2.getChildAt(i11);
                    if (i6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6Var2.f24501c.a(z11, true);
                }
                this.f32431c[0] = org.telegram.ui.Cells.s8.f25670f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public s0(int[] iArr, LinearLayout linearLayout) {
        this.f32431c = iArr;
        this.f32430b = linearLayout;
    }
}
