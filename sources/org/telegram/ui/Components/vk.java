package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vk extends zf.i0 {
    public final int N = 0;
    public final org.telegram.messenger.us O;

    public vk(bl blVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10, false);
        this.O = blVar;
    }

    @Override
    public final void f() {
        int i10 = this.N;
        org.telegram.messenger.us usVar = this.O;
        switch (i10) {
            case 0:
                bl blVar = (bl) usVar;
                vk vkVar = blVar.P;
                org.telegram.ui.ActionBar.t0 t0Var = blVar.f24823y;
                if (t0Var != null) {
                    t0Var.setShowSearchProgress(vkVar.J);
                }
                TextView textView = blVar.f24821x;
                if (textView != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{vkVar.f55458y}, textView);
                }
                super.f();
                return;
            default:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) usVar;
                org.telegram.ui.ActionBar.p5 p5Var = yb0Var.f43803s;
                if (p5Var != null) {
                    p5Var.setShowSearchProgress(yb0Var.U.J);
                }
                TextView textView2 = yb0Var.f43801r;
                if (textView2 != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{yb0Var.U.f55458y}, textView2);
                }
                super.f();
                return;
        }
    }

    public vk(org.telegram.ui.yb0 yb0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, false, z10);
        this.O = yb0Var;
    }
}
