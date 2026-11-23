package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class on extends org.telegram.ui.Cells.a6 {
    public final org.telegram.ui.l4 G;

    public on(org.telegram.ui.l4 l4Var, Context context, int i7, jn jnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, jnVar, i6Var);
        this.G = l4Var;
        ((qn) l4Var.f49583e).f38944s.getChildCount();
    }

    @Override
    public final boolean f() {
        v4.f1 T;
        qn qnVar = (qn) this.G.f49583e;
        org.telegram.ui.d61 d61Var = qnVar.f38944s;
        View F = d61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = d61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = qnVar.N;
            if (i7 == qnVar.K && b10 == (qnVar.f38947u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.a6 a6Var) {
        v4.f1 T;
        int b10;
        qn qnVar = (qn) this.G.f49583e;
        org.telegram.ui.d61 d61Var = qnVar.f38944s;
        View F = d61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = d61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return qnVar.M[b10 - qnVar.f38947u0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        qn qnVar = (qn) this.G.f49583e;
        if (qnVar.f38933n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) qnVar.f37135b.f39956a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        v4.f1 T;
        int b10;
        qn qnVar = (qn) this.G.f49583e;
        if (z10 && qnVar.f38915d0 && !qnVar.f38913c0) {
            Arrays.fill(qnVar.M, false);
            for (int i7 = qnVar.f38947u0; i7 < qnVar.f38947u0 + qnVar.N; i7++) {
                v4.f1 K = qnVar.f38944s.K(i7);
                if (K != null) {
                    View view = K.f59245a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f30479r.a(false, true);
                    }
                }
            }
        }
        super.i(a6Var, z10);
        org.telegram.ui.d61 d61Var = qnVar.f38944s;
        View F = d61Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = d61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            qnVar.M[b10 - qnVar.f38947u0] = z10;
        }
        qnVar.Y();
    }

    @Override
    public final void j(boolean z10) {
        qn.R((qn) this.G.f49583e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.G.f49583e, a6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((qn) this.G.f49583e).f37135b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        qn qnVar = (qn) this.G.f49583e;
        if (!arrayList.isEmpty()) {
            qnVar.f38944s.getClass();
            int R = RecyclerView.R(this) - qnVar.f38947u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < qnVar.K) {
                    for (int length = qnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = qnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    qnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    qnVar.N++;
                    i7++;
                }
                qnVar.n0();
                qnVar.f38931l0 = (qnVar.f38947u0 + i7) - 1;
                qnVar.f38944s.setItemAnimator(qnVar.f38949w);
                qnVar.f38941r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((qn) this.G.f49583e).f38915d0;
    }
}
