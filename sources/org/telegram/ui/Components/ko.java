package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.hc1;
public final class ko extends org.telegram.ui.Cells.d6 {
    public final lo F;

    public ko(lo loVar, Context context, int i10, eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, eoVar, c6Var);
        this.F = loVar;
    }

    @Override
    public final boolean e() {
        s4.d1 T;
        no noVar = this.F.d;
        hc1 hc1Var = noVar.f28903s;
        View F = hc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = noVar.M;
            if (i10 == noVar.J && b10 == (noVar.f28905t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.d1 T;
        int b10;
        no noVar = this.F.d;
        hc1 hc1Var = noVar.f28903s;
        View F = hc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return noVar.L[b10 - noVar.f28905t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        no noVar = this.F.d;
        if (noVar.f28896n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.eo.n8(menu, ((org.telegram.ui.eo) noVar.f30574b.f24342f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.d1 T;
        int b10;
        no noVar = this.F.d;
        if (z10 && noVar.f28877c0 && !noVar.f28875b0) {
            Arrays.fill(noVar.L, false);
            noVar.f28903s.getChildCount();
            for (int i10 = noVar.f28905t0; i10 < noVar.f28905t0 + noVar.M; i10++) {
                s4.d1 K = noVar.f28903s.K(i10);
                if (K != null) {
                    View view = K.f47889a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21739r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        hc1 hc1Var = noVar.f28903s;
        View F = hc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = hc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            noVar.L[b10 - noVar.f28905t0] = z10;
        }
        noVar.W();
    }

    @Override
    public final void i(boolean z10) {
        no.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        no.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f30574b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        no noVar = this.F.d;
        if (!arrayList.isEmpty()) {
            noVar.f28903s.getClass();
            int R = RecyclerView.R(this) - noVar.f28905t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < noVar.J) {
                    for (int length = noVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = noVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    noVar.K[i10] = (CharSequence) arrayList.remove(0);
                    noVar.M++;
                    i10++;
                }
                noVar.k0();
                noVar.f28893k0 = (noVar.f28905t0 + i10) - 1;
                noVar.f28903s.setItemAnimator(noVar.v);
                noVar.f28901r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.f28877c0;
    }
}
