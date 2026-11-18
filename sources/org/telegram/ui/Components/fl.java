package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class fl implements ViewTreeObserver.OnPreDrawListener {
    public final int f35133a;
    public final View f35134b;

    public fl(int i7, View view) {
        this.f35133a = i7;
        this.f35134b = view;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        RecyclerView recyclerView;
        switch (this.f35133a) {
            case 0:
                kl klVar = (kl) this.f35134b;
                v7 v7Var = klVar.f36766b.V2;
                if (v7Var != null) {
                    f10 = v7Var.getAlpha();
                } else {
                    f10 = 0.0f;
                }
                if (f10 != klVar.A0) {
                    klVar.A0 = f10;
                    klVar.i0();
                    return true;
                }
                return true;
            case 1:
                org.telegram.ui.ActionBar.y3 y3Var = ((EditTextBoldCursor) this.f35134b).Z0;
                if (y3Var != null) {
                    y3Var.c();
                    return true;
                }
                return true;
            case 2:
                ((u60) this.f35134b).invalidate();
                return true;
            default:
                qt0 qt0Var = (qt0) this.f35134b;
                if (qt0Var.f38896a && qt0Var.f38898b > 0) {
                    qt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                qt0Var.p();
                if (qt0Var.f38908h0 && (recyclerView = qt0Var.F) != null && !recyclerView.c0()) {
                    float n10 = qt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        qt0Var.f38908h0 = false;
                        qt0Var.t(qt0Var.F, Math.round(n10 - qt0Var.V));
                        qt0Var.B();
                    }
                }
                if (qt0Var.f38896a && qt0Var.f38898b > 0) {
                    qt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    qt0Var.f38898b--;
                    qt0Var.f38900c++;
                }
                return true;
        }
    }
}
