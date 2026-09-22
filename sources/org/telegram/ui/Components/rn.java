package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.fc1;
public final class rn extends org.telegram.ui.Cells.e6 {
    public final sn F;

    public rn(sn snVar, Context context, int i10, ln lnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, lnVar, f6Var);
        this.F = snVar;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        un unVar = this.F.d;
        fc1 fc1Var = unVar.f28835s;
        View G = fc1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = unVar.M;
            if (i10 == unVar.J && b10 == (unVar.f28837t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        s4.c1 U;
        int b10;
        un unVar = this.F.d;
        fc1 fc1Var = unVar.f28835s;
        View G = fc1Var.G(e6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return unVar.L[b10 - unVar.f28837t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        un unVar = this.F.d;
        if (unVar.f28828n && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.f26786b.f29096f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 U;
        int b10;
        un unVar = this.F.d;
        if (z10 && unVar.f28809c0 && !unVar.f28807b0) {
            Arrays.fill(unVar.L, false);
            unVar.f28835s.getChildCount();
            for (int i10 = unVar.f28837t0; i10 < unVar.f28837t0 + unVar.M; i10++) {
                s4.c1 L = unVar.f28835s.L(i10);
                if (L != null) {
                    View view = L.f42995a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).f20202r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        fc1 fc1Var = unVar.f28835s;
        View G = fc1Var.G(e6Var);
        if (G == null) {
            U = null;
        } else {
            U = fc1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            unVar.L[b10 - unVar.f28837t0] = z10;
        }
        unVar.T();
    }

    @Override
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        un.N(this.F.d, e6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.f26786b.t1(d6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        un unVar = this.F.d;
        if (!arrayList.isEmpty()) {
            unVar.f28835s.getClass();
            int S = RecyclerView.S(this) - unVar.f28837t0;
            if (S >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
                unVar.f28825k0 = (unVar.f28837t0 + i10) - 1;
                unVar.f28835s.setItemAnimator(unVar.v);
                unVar.f28833r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f28809c0;
    }
}
