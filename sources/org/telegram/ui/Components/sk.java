package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sk extends v4.s0 {
    public final int f38014a;
    public final vk f38015b;

    public sk(vk vkVar, int i7) {
        this.f38014a = i7;
        this.f38015b = vkVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        xi0 xi0Var;
        switch (this.f38014a) {
            case 0:
                vk vkVar = this.f38015b;
                bi.q1 q1Var = vkVar.L;
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                vkVar.H = z9;
                if (!z9 && vkVar.F != null) {
                    vkVar.F = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ci ciVar = vkVar.f38656b;
                    int i10 = ciVar.f28704s0;
                    if (((ciVar.Y3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) q1Var.K(0)) != null) {
                        View view = xi0Var.f57052a;
                        if (view.getTop() > 0) {
                            q1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    vk vkVar2 = this.f38015b;
                    if (vkVar2.f39018c0 && vkVar2.f39019d0) {
                        org.telegram.messenger.g0.v1(vkVar2.f38656b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38014a) {
            case 0:
                vk vkVar = this.f38015b;
                vkVar.i0();
                if (vkVar.F != null) {
                    vkVar.G += i10;
                }
                vkVar.f38656b.M1(vkVar, i10);
                return;
            default:
                return;
        }
    }
}
