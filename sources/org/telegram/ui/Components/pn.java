package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class pn extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 G;

    public pn(org.telegram.ui.l4 l4Var, Context context, int i7, kn knVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, knVar, i6Var);
        this.G = l4Var;
        ((rn) l4Var.f49426e).f39242s.getChildCount();
    }

    @Override
    public final boolean f() {
        v4.f1 T;
        rn rnVar = (rn) this.G.f49426e;
        org.telegram.ui.f61 f61Var = rnVar.f39242s;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = rnVar.N;
            if (i7 == rnVar.K && b10 == (rnVar.f39245u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.a6 a6Var) {
        v4.f1 T;
        int b10;
        rn rnVar = (rn) this.G.f49426e;
        org.telegram.ui.f61 f61Var = rnVar.f39242s;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return rnVar.M[b10 - rnVar.f39245u0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        rn rnVar = (rn) this.G.f49426e;
        if (rnVar.f39231n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) rnVar.f36766b.f39659a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        int b10;
        rn rnVar = (rn) this.G.f49426e;
        if (z10 && rnVar.f39213d0 && !rnVar.f39211c0) {
            Arrays.fill(rnVar.M, false);
            for (int i7 = rnVar.f39245u0; i7 < rnVar.f39245u0 + rnVar.N; i7++) {
                v4.f1 K = rnVar.f39242s.K(i7);
                if (K != null) {
                    View view = K.f59122a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f30389r.a(false, true);
                    }
                }
            }
        }
        super.i(a6Var, z10);
        org.telegram.ui.f61 f61Var = rnVar.f39242s;
        View F = f61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            rnVar.M[b10 - rnVar.f39245u0] = z10;
        }
        rnVar.Y();
    }

    @Override
    public final void j(boolean z10) {
        rn.R((rn) this.G.f49426e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        rn.S((rn) this.G.f49426e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((rn) this.G.f49426e).f36766b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        rn rnVar = (rn) this.G.f49426e;
        if (!arrayList.isEmpty()) {
            rnVar.f39242s.getClass();
            int R = RecyclerView.R(this) - rnVar.f39245u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < rnVar.K) {
                    for (int length = rnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = rnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    rnVar.N++;
                    i7++;
                }
                rnVar.n0();
                rnVar.f39229l0 = (rnVar.f39245u0 + i7) - 1;
                rnVar.f39242s.setItemAnimator(rnVar.f39247w);
                rnVar.f39239r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((rn) this.G.f49426e).f39213d0;
    }
}
