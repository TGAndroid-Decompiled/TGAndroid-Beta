package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class tk extends jg.s0 {
    public final int D = 0;
    public final org.telegram.messenger.ls E;

    public tk(vk vkVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, z9, false);
        this.E = vkVar;
    }

    @Override
    public final void f() {
        int i7 = this.D;
        org.telegram.messenger.ls lsVar = this.E;
        switch (i7) {
            case 0:
                vk vkVar = (vk) lsVar;
                tk tkVar = vkVar.N;
                org.telegram.ui.ActionBar.r0 r0Var = vkVar.f39042x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(tkVar.f16678w);
                }
                TextView textView = vkVar.f39040w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131748165, tkVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) lsVar;
                org.telegram.ui.ActionBar.g5 g5Var = sa0Var.f49789r;
                if (g5Var != null) {
                    g5Var.setShowSearchProgress(sa0Var.S.f16678w);
                }
                TextView textView2 = sa0Var.f49784n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.id.a0(null, null, 2131748165, sa0Var.S.h));
                }
                super.f();
                return;
        }
    }

    public tk(org.telegram.ui.sa0 sa0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, false, z9);
        this.E = sa0Var;
    }
}
