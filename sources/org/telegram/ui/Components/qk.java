package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class qk implements ViewTreeObserver.OnPreDrawListener {
    public final int f37312a;
    public final View f37313b;

    public qk(int i7, View view) {
        this.f37312a = i7;
        this.f37313b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f37312a) {
            case 0:
                vk vkVar = (vk) this.f37313b;
                q7 q7Var = vkVar.f38656b.U2;
                if (q7Var != null) {
                    f10 = q7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != vkVar.f39046z0) {
                    vkVar.f39046z0 = f10;
                    vkVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.x3 x3Var = ((EditTextBoldCursor) this.f37313b).Y0;
                if (x3Var != null) {
                    x3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((i60) this.f37313b).invalidate();
                return true;
            default:
                it0 it0Var = (it0) this.f37313b;
                if (it0Var.f34738a && it0Var.f34740b > 0) {
                    it0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                it0Var.p();
                if (it0Var.f34749g0 && (recyclerView = it0Var.E) != null && !recyclerView.c0()) {
                    float n10 = it0Var.n();
                    if (!Float.isInfinite(n10)) {
                        it0Var.f34749g0 = false;
                        it0Var.t(it0Var.E, Math.round(n10 - it0Var.U));
                        it0Var.B();
                    }
                }
                if (it0Var.f34738a && it0Var.f34740b > 0) {
                    it0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    it0Var.f34740b--;
                    it0Var.f34742c++;
                }
                return true;
        }
    }
}
