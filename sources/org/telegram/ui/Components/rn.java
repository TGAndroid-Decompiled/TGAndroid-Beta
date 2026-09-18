package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.dc1;
public final class rn extends org.telegram.ui.Cells.d6 {
    public final sn F;

    public rn(sn snVar, Context context, int i10, ln lnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, lnVar, e6Var);
        this.F = snVar;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        un unVar = this.F.d;
        dc1 dc1Var = unVar.f28765s;
        View G = dc1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = unVar.M;
            if (i10 == unVar.J && b10 == (unVar.f28767t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 U;
        int b10;
        un unVar = this.F.d;
        dc1 dc1Var = unVar.f28765s;
        View G = dc1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return unVar.L[b10 - unVar.f28767t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        un unVar = this.F.d;
        if (unVar.f28758n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.f26688b.f29021f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 U;
        int b10;
        un unVar = this.F.d;
        if (z10 && unVar.f28739c0 && !unVar.f28737b0) {
            Arrays.fill(unVar.L, false);
            unVar.f28765s.getChildCount();
            for (int i10 = unVar.f28767t0; i10 < unVar.f28767t0 + unVar.M; i10++) {
                s4.c1 L = unVar.f28765s.L(i10);
                if (L != null) {
                    View view = L.f42929a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20103r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        dc1 dc1Var = unVar.f28765s;
        View G = dc1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = dc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            unVar.L[b10 - unVar.f28767t0] = z10;
        }
        unVar.T();
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        un.N(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f26688b.t1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        un unVar = this.F.d;
        if (!arrayList.isEmpty()) {
            unVar.f28765s.getClass();
            int S = RecyclerView.S(this) - unVar.f28767t0;
            if (S >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < unVar.J) {
                    for (int length = unVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = unVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    unVar.K[i10] = (CharSequence) arrayList.remove(0);
                    unVar.M++;
                    i10++;
                }
                unVar.h0();
                unVar.f28755k0 = (unVar.f28767t0 + i10) - 1;
                unVar.f28765s.setItemAnimator(unVar.v);
                unVar.f28763r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f28739c0;
    }
}
