package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.kb1;
public final class pn extends org.telegram.ui.Cells.c6 {
    public final qn C;

    public pn(qn qnVar, Context context, int i10, kn knVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, knVar, g6Var);
        this.C = qnVar;
    }

    @Override
    public final boolean e() {
        f2.m1 T;
        sn snVar = this.C.d;
        kb1 kb1Var = snVar.f31122s;
        View F = kb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = snVar.J;
            if (i10 == snVar.G && b10 == (snVar.f31119q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.m1 T;
        int b10;
        sn snVar = this.C.d;
        kb1 kb1Var = snVar.f31122s;
        View F = kb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return snVar.I[b10 - snVar.f31119q0];
        }
        return false;
    }

    @Override
    public final void g(eh.b bVar, ActionMode actionMode) {
        sn snVar = this.C.d;
        if (snVar.f31115n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) snVar.f26546b.f29040c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.m1 T;
        int b10;
        sn snVar = this.C.d;
        if (z4 && snVar.W && !snVar.V) {
            Arrays.fill(snVar.I, false);
            snVar.f31122s.getChildCount();
            for (int i10 = snVar.f31119q0; i10 < snVar.f31119q0 + snVar.J; i10++) {
                f2.m1 K = snVar.f31122s.K(i10);
                if (K != null) {
                    View view = K.f5875a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f22653r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        kb1 kb1Var = snVar.f31122s;
        View F = kb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = kb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            snVar.I[b10 - snVar.f31119q0] = z4;
        }
        snVar.T();
    }

    @Override
    public final void i(boolean z4) {
        sn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        sn.N(this.C.d, c6Var);
    }

    @Override
    public final void k(eh.b bVar) {
        this.C.d.f26546b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        sn snVar = this.C.d;
        if (!arrayList.isEmpty()) {
            snVar.f31122s.getClass();
            int R = RecyclerView.R(this) - snVar.f31119q0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < snVar.G) {
                    for (int length = snVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = snVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    snVar.H[i10] = (CharSequence) arrayList.remove(0);
                    snVar.J++;
                    i10++;
                }
                snVar.h0();
                snVar.f31108h0 = (snVar.f31119q0 + i10) - 1;
                snVar.f31122s.setItemAnimator(snVar.v);
                snVar.f31120r.l();
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
