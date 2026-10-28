package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class co extends org.telegram.ui.Cells.h6 {
    public final eo F;

    public co(eo eoVar, Context context, int i10, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, wnVar, u6Var);
        this.F = eoVar;
        eoVar.d.f28696s.getChildCount();
    }

    @Override
    public final boolean e() {
        s4.e1 T;
        go goVar = this.F.d;
        org.telegram.ui.bb1 bb1Var = goVar.f28696s;
        View F = bb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = bb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = goVar.M;
            if (i10 == goVar.J && b10 == (goVar.f28698t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.h6 h6Var) {
        s4.e1 T;
        int b10;
        go goVar = this.F.d;
        org.telegram.ui.bb1 bb1Var = goVar.f28696s;
        View F = bb1Var.F(h6Var);
        if (F == null) {
            T = null;
        } else {
            T = bb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return goVar.L[b10 - goVar.f28698t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        go goVar = this.F.d;
        if (goVar.f28685n && g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.wn.t8(menu, ((org.telegram.ui.wn) goVar.f30254b.f32990f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        s4.e1 T;
        int b10;
        go goVar = this.F.d;
        if (z10 && goVar.f28665c0 && !goVar.f28663b0) {
            Arrays.fill(goVar.L, false);
            for (int i10 = goVar.f28698t0; i10 < goVar.f28698t0 + goVar.M; i10++) {
                s4.e1 K = goVar.f28696s.K(i10);
                if (K != null) {
                    View view = K.f47773a;
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).f24204r.a(false, true);
                    }
                }
            }
        }
        super.h(h6Var, z10);
        org.telegram.ui.bb1 bb1Var = goVar.f28696s;
        View F = bb1Var.F(h6Var);
        if (F == null) {
            T = null;
        } else {
            T = bb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            goVar.L[b10 - goVar.f28698t0] = z10;
        }
        goVar.W();
    }

    @Override
    public final void i(boolean z10) {
        go.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.F.d, h6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.F.d.f30254b.z1(g6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        go goVar = this.F.d;
        if (!arrayList.isEmpty()) {
            goVar.f28696s.getClass();
            int R = RecyclerView.R(this) - goVar.f28698t0;
            if (R >= 0) {
                org.telegram.ui.Cells.g6 g6Var = this.d;
                g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < goVar.J) {
                    for (int length = goVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = goVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    goVar.K[i10] = (CharSequence) arrayList.remove(0);
                    goVar.M++;
                    i10++;
                }
                goVar.l0();
                goVar.f28681k0 = (goVar.f28698t0 + i10) - 1;
                goVar.f28696s.setItemAnimator(goVar.v);
                goVar.f28694r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f28665c0;
    }
}
