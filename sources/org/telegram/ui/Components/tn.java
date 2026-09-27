package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wb1;
public final class tn extends org.telegram.ui.Cells.d6 {
    public final un F;

    public tn(un unVar, Context context, int i10, nn nnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, nnVar, e6Var);
        this.F = unVar;
    }

    @Override
    public final boolean e() {
        s4.c1 U;
        wn wnVar = this.F.d;
        wb1 wb1Var = wnVar.f30106s;
        View G = wb1Var.G(this);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null) {
            int b10 = U.b();
            int i10 = wnVar.M;
            if (i10 == wnVar.J && b10 == (wnVar.f30108t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 U;
        int b10;
        wn wnVar = this.F.d;
        wb1 wb1Var = wnVar.f30106s;
        View G = wb1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            return wnVar.L[b10 - wnVar.f30108t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        wn wnVar = this.F.d;
        if (wnVar.f30099n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) wnVar.f27104b.f29962f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 U;
        int b10;
        wn wnVar = this.F.d;
        if (z10 && wnVar.f30080c0 && !wnVar.f30078b0) {
            Arrays.fill(wnVar.L, false);
            wnVar.f30106s.getChildCount();
            for (int i10 = wnVar.f30108t0; i10 < wnVar.f30108t0 + wnVar.M; i10++) {
                s4.c1 L = wnVar.f30106s.L(i10);
                if (L != null) {
                    View view = L.f43005a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20141r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = wnVar.f30106s;
        View G = wb1Var.G(d6Var);
        if (G == null) {
            U = null;
        } else {
            U = wb1Var.U(G);
        }
        if (U != null && (b10 = U.b()) != -1) {
            wnVar.L[b10 - wnVar.f30108t0] = z10;
        }
        wnVar.T();
    }

    @Override
    public final void i(boolean z10) {
        wn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        wn.N(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f27104b.q1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        wn wnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            wnVar.f30106s.getClass();
            int S = RecyclerView.S(this) - wnVar.f30108t0;
            if (S >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < wnVar.J) {
                    for (int length = wnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = wnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    wnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    wnVar.M++;
                    i10++;
                }
                wnVar.h0();
                wnVar.f30096k0 = (wnVar.f30108t0 + i10) - 1;
                wnVar.f30106s.setItemAnimator(wnVar.v);
                wnVar.f30104r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f30080c0;
    }
}
