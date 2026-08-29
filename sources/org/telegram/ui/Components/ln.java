package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wa1;
public final class ln extends org.telegram.ui.Cells.a6 {
    public final mn B;

    public ln(mn mnVar, Context context, int i10, gn gnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, gnVar, c6Var);
        this.B = mnVar;
    }

    @Override
    public final boolean e() {
        f2.n1 T;
        on onVar = this.B.d;
        wa1 wa1Var = onVar.f31427s;
        View F = wa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = onVar.I;
            if (i10 == onVar.F && b10 == (onVar.f31423p0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        f2.n1 T;
        int b10;
        on onVar = this.B.d;
        wa1 wa1Var = onVar.f31427s;
        View F = wa1Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return onVar.H[b10 - onVar.f31423p0];
        }
        return false;
    }

    @Override
    public final void g(bh.b bVar, ActionMode actionMode) {
        on onVar = this.B.d;
        if (onVar.f31420n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) onVar.f28403b.f30990b0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        f2.n1 T;
        int b10;
        on onVar = this.B.d;
        if (z10 && onVar.V && !onVar.U) {
            Arrays.fill(onVar.H, false);
            onVar.f31427s.getChildCount();
            for (int i10 = onVar.f31423p0; i10 < onVar.f31423p0 + onVar.I; i10++) {
                f2.n1 K = onVar.f31427s.K(i10);
                if (K != null) {
                    View view = K.f6432a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).f24087r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z10);
        wa1 wa1Var = onVar.f31427s;
        View F = wa1Var.F(a6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            onVar.H[b10 - onVar.f31423p0] = z10;
        }
        onVar.T();
    }

    @Override
    public final void i(boolean z10) {
        on.L(this.B.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.B.d, a6Var);
    }

    @Override
    public final void k(bh.b bVar) {
        this.B.d.f28403b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        on onVar = this.B.d;
        if (!arrayList.isEmpty()) {
            onVar.f31427s.getClass();
            int R = RecyclerView.R(this) - onVar.f31423p0;
            if (R >= 0) {
                bh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < onVar.F) {
                    for (int length = onVar.G.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = onVar.G;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    onVar.G[i10] = (CharSequence) arrayList.remove(0);
                    onVar.I++;
                    i10++;
                }
                onVar.h0();
                onVar.f31412g0 = (onVar.f31423p0 + i10) - 1;
                onVar.f31427s.setItemAnimator(onVar.v);
                onVar.f31425r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.B.d.V;
    }
}
