package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.qb1;
public final class on extends org.telegram.ui.Cells.c6 {
    public final pn C;

    public on(pn pnVar, Context context, int i10, jn jnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, jnVar, g6Var);
        this.C = pnVar;
    }

    @Override
    public final boolean e() {
        f2.m1 T;
        rn rnVar = this.C.d;
        qb1 qb1Var = rnVar.f30842s;
        View F = qb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = rnVar.J;
            if (i10 == rnVar.G && b10 == (rnVar.f30839q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.m1 T;
        int b10;
        rn rnVar = this.C.d;
        qb1 qb1Var = rnVar.f30842s;
        View F = qb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return rnVar.I[b10 - rnVar.f30839q0];
        }
        return false;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        rn rnVar = this.C.d;
        if (rnVar.f30835n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) rnVar.f26590b.f29058c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        int b10;
        rn rnVar = this.C.d;
        if (z4 && rnVar.W && !rnVar.V) {
            Arrays.fill(rnVar.I, false);
            rnVar.f30842s.getChildCount();
            for (int i10 = rnVar.f30839q0; i10 < rnVar.f30839q0 + rnVar.J; i10++) {
                f2.m1 K = rnVar.f30842s.K(i10);
                if (K != null) {
                    View view = K.f5875a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22655r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        qb1 qb1Var = rnVar.f30842s;
        View F = qb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = qb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            rnVar.I[b10 - rnVar.f30839q0] = z4;
        }
        rnVar.T();
    }

    @Override
    public final void i(boolean z4) {
        rn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.C.d, c6Var);
    }

    @Override
    public final void k(eh.b bVar) {
        this.C.d.f26590b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        rn rnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            rnVar.f30842s.getClass();
            int R = RecyclerView.R(this) - rnVar.f30839q0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < rnVar.G) {
                    for (int length = rnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = rnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    rnVar.J++;
                    i10++;
                }
                rnVar.h0();
                rnVar.f30828h0 = (rnVar.f30839q0 + i10) - 1;
                rnVar.f30842s.setItemAnimator(rnVar.v);
                rnVar.f30840r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.C.d.W;
    }
}
