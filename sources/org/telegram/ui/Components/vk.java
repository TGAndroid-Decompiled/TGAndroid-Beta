package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class vk extends zf.i0 {
    public final int N = 0;
    public final org.telegram.messenger.vs O;

    public vk(bl blVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10, false);
        this.O = blVar;
    }

    @Override
    public final void f() {
        int i10 = this.N;
        org.telegram.messenger.vs vsVar = this.O;
        switch (i10) {
            case 0:
                bl blVar = (bl) vsVar;
                vk vkVar = blVar.P;
                org.telegram.ui.ActionBar.t0 t0Var = blVar.f24878y;
                if (t0Var != null) {
                    t0Var.setShowSearchProgress(vkVar.J);
                }
                TextView textView = blVar.f24876x;
                if (textView != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{vkVar.f55476y}, textView);
                }
                super.f();
                return;
            default:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) vsVar;
                org.telegram.ui.ActionBar.p5 p5Var = xb0Var.f43323s;
                if (p5Var != null) {
                    p5Var.setShowSearchProgress(xb0Var.U.J);
                }
                TextView textView2 = xb0Var.f43321r;
                if (textView2 != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{xb0Var.U.f55476y}, textView2);
                }
                super.f();
                return;
        }
    }

    public vk(org.telegram.ui.xb0 xb0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, false, z10);
        this.O = xb0Var;
    }
}
