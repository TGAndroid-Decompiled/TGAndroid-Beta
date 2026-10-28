package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class r1 implements View.OnClickListener {
    public final int f32085a = 1;
    public final LinearLayout f32086b;
    public final int[] f32087c;

    public r1(LinearLayout linearLayout, int[] iArr) {
        this.f32086b = linearLayout;
        this.f32087c = iArr;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        switch (this.f32085a) {
            case 0:
                this.f32087c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f32086b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.p6) {
                        org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                        if (childAt == view) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        p6Var.f24769c.a(z10, true);
                    }
                }
                return;
            default:
                LinearLayout linearLayout2 = this.f32086b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.p6 p6Var2 = (org.telegram.ui.Cells.p6) linearLayout2.getChildAt(i11);
                    if (p6Var2 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p6Var2.f24769c.a(z11, true);
                }
                this.f32087c[0] = org.telegram.ui.Cells.c9.f23945f[((Integer) view.getTag()).intValue()];
                return;
        }
    }

    public r1(int[] iArr, LinearLayout linearLayout) {
        this.f32087c = iArr;
        this.f32086b = linearLayout;
    }
}
