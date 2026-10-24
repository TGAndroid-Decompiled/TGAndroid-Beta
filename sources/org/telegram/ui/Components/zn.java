package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wa1;
public final class zn extends org.telegram.ui.Cells.d6 {
    public final ao F;

    public zn(ao aoVar, Context context, int i10, tn tnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, tnVar, g6Var);
        this.F = aoVar;
        aoVar.d.f25392s.getChildCount();
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        co coVar = this.F.d;
        wa1 wa1Var = coVar.f25392s;
        View F = wa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = coVar.M;
            if (i10 == coVar.J && b10 == (coVar.f25394t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        co coVar = this.F.d;
        wa1 wa1Var = coVar.f25392s;
        View F = wa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return coVar.L[b10 - coVar.f25394t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        co coVar = this.F.d;
        if (coVar.f25381n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) coVar.f27704b.f30146f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        co coVar = this.F.d;
        if (z10 && coVar.f25361c0 && !coVar.f25359b0) {
            Arrays.fill(coVar.L, false);
            for (int i10 = coVar.f25394t0; i10 < coVar.f25394t0 + coVar.M; i10++) {
                s4.b1 K = coVar.f25392s.K(i10);
                if (K != null) {
                    View view = K.f46342a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f22283r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wa1 wa1Var = coVar.f25392s;
        View F = wa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            coVar.L[b10 - coVar.f25394t0] = z10;
        }
        coVar.W();
    }

    @Override
    public final void i(boolean z10) {
        co.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        co.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f27704b.z1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        co coVar = this.F.d;
        if (!arrayList.isEmpty()) {
            coVar.f25392s.getClass();
            int R = RecyclerView.R(this) - coVar.f25394t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < coVar.J) {
                    for (int length = coVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = coVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    coVar.K[i10] = (CharSequence) arrayList.remove(0);
                    coVar.M++;
                    i10++;
                }
                coVar.l0();
                coVar.f25377k0 = (coVar.f25394t0 + i10) - 1;
                coVar.f25392s.setItemAnimator(coVar.v);
                coVar.f25390r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.f25361c0;
    }
}
